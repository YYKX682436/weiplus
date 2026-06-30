package com.qq.taf.jce.dynamic;

/* loaded from: classes13.dex */
public class FloatField extends com.qq.taf.jce.dynamic.NumberField {
    private float data;

    public FloatField(float f17, int i17) {
        super(i17);
        this.data = f17;
    }

    public float get() {
        return this.data;
    }

    @Override // com.qq.taf.jce.dynamic.NumberField
    public java.lang.Number getNumber() {
        return java.lang.Float.valueOf(this.data);
    }

    public void set(float f17) {
        this.data = f17;
    }
}
