package com.qq.taf.jce.dynamic;

/* loaded from: classes13.dex */
public final class ListField extends com.qq.taf.jce.dynamic.JceField {
    private com.qq.taf.jce.dynamic.JceField[] data;

    public ListField(com.qq.taf.jce.dynamic.JceField[] jceFieldArr, int i17) {
        super(i17);
        this.data = jceFieldArr;
    }

    public com.qq.taf.jce.dynamic.JceField[] get() {
        return this.data;
    }

    public void set(int i17, com.qq.taf.jce.dynamic.JceField jceField) {
        this.data[i17] = jceField;
    }

    public int size() {
        return this.data.length;
    }

    public com.qq.taf.jce.dynamic.JceField get(int i17) {
        return this.data[i17];
    }

    public void set(com.qq.taf.jce.dynamic.JceField[] jceFieldArr) {
        this.data = jceFieldArr;
    }
}
