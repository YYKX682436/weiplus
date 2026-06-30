package com.qq.taf.jce.dynamic;

/* loaded from: classes13.dex */
public final class MapField extends com.qq.taf.jce.dynamic.JceField {
    private com.qq.taf.jce.dynamic.JceField[] keys;
    private com.qq.taf.jce.dynamic.JceField[] values;

    public MapField(com.qq.taf.jce.dynamic.JceField[] jceFieldArr, com.qq.taf.jce.dynamic.JceField[] jceFieldArr2, int i17) {
        super(i17);
        this.keys = jceFieldArr;
        this.values = jceFieldArr2;
    }

    public com.qq.taf.jce.dynamic.JceField getKey(int i17) {
        return this.keys[i17];
    }

    public com.qq.taf.jce.dynamic.JceField[] getKeys() {
        return this.keys;
    }

    public com.qq.taf.jce.dynamic.JceField getValue(int i17) {
        return this.values[i17];
    }

    public com.qq.taf.jce.dynamic.JceField[] getValues() {
        return this.values;
    }

    public void setKey(int i17, com.qq.taf.jce.dynamic.JceField jceField) {
        this.keys[i17] = jceField;
    }

    public void setValue(int i17, com.qq.taf.jce.dynamic.JceField jceField) {
        this.values[i17] = jceField;
    }

    public int size() {
        return this.keys.length;
    }
}
