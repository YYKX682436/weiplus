package com.qq.taf.jce.dynamic;

/* loaded from: classes13.dex */
public class DoubleField extends com.qq.taf.jce.dynamic.NumberField {
    private double data;

    public DoubleField(double d17, int i17) {
        super(i17);
        this.data = d17;
    }

    public double get() {
        return this.data;
    }

    @Override // com.qq.taf.jce.dynamic.NumberField
    public java.lang.Number getNumber() {
        return java.lang.Double.valueOf(this.data);
    }

    public void set(double d17) {
        this.data = d17;
    }
}
