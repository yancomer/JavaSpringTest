package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
		@Id
		@GeneratedValue
		@Column(name="product_id")
		private int id;
		
		@Column(name="category_id")
		private int category_id;
		
		@Column(name="product_name")
		private String productName;
		
		@Column(name="unit_price")
		private double unitPrice;
		
		@Column(name="units_in_stock")
		private short unitsInStock;
		
		@Column(name="quantity_per_unit")
		private String quantityPerUnit;
		
		public Product() {}
		
		public Product(int id, int category_id, String productName, double unitPrice, short unitsInStock,
				String quantityPerUnit) {
			super();
			this.id = id;
			this.category_id = category_id;
			this.productName = productName;
			this.unitPrice = unitPrice;
			this.unitsInStock = unitsInStock;
			this.quantityPerUnit = quantityPerUnit;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getCategory_id() {
			return category_id;
		}

		public void setCategory_id(int category_id) {
			this.category_id = category_id;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public double getUnitPrice() {
			return unitPrice;
		}

		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}

		public short getUnitsInStock() {
			return unitsInStock;
		}

		public void setUnitsInStock(short unitsInStock) {
			this.unitsInStock = unitsInStock;
		}

		public String getQuantityPerUnit() {
			return quantityPerUnit;
		}

		public void setQuantityPerUnit(String quantityPerUnit) {
			this.quantityPerUnit = quantityPerUnit;
		}
		
		
		
}
