package parcial1;

/**
 * Gestión de Cuentas
 *
 * @version 1.0.1
 * @autor Zarfala
 */
public class Producto {
    private String numerocuenta;
    private String titular;
    private String documento;
    private String saldo;
    private String valormover;
    private String valorretirar;

    public Producto(String numerocuenta, String titular, String documento, String saldo, String valormover, String valorretirar) {
        this.numerocuenta = numerocuenta;
        this.titular = titular;
        this.documento = documento;
        this.saldo = saldo;
        this.valormover = valormover;
        this.valorretirar = valorretirar;
    }

    Producto(String numerocuenta, String titular, String documento, String saldo) {
    this.numerocuenta = numerocuenta;
    this.titular = titular;
    this.documento = documento;
    this.saldo = saldo;
}


    public String getNumerocuenta() {
        return numerocuenta;
    }

    public String getTitular() {
        return titular;
    }

    public String getTipoDocumento() {
        return documento;
    }

    public String getSaldo() {
        return saldo;
    }
    
    public String getConsigno() {
        return valormover;
    }
    
    public String getRetiro() {
        return valorretirar;
    }
    
    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
}

