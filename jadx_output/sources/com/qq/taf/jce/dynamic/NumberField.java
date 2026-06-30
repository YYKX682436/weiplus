package com.qq.taf.jce.dynamic;

/* loaded from: classes13.dex */
public abstract class NumberField extends com.qq.taf.jce.dynamic.JceField {
    public NumberField(int i17) {
        super(i17);
    }

    public byte byteValue() {
        return getNumber().byteValue();
    }

    public double doubleValue() {
        return getNumber().doubleValue();
    }

    public float floatValue() {
        return getNumber().floatValue();
    }

    public abstract java.lang.Number getNumber();

    public int intValue() {
        return getNumber().intValue();
    }

    public long longValue() {
        return getNumber().longValue();
    }

    public short shortValue() {
        return getNumber().shortValue();
    }
}
