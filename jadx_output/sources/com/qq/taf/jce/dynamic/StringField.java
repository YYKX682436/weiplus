package com.qq.taf.jce.dynamic;

/* loaded from: classes13.dex */
public class StringField extends com.qq.taf.jce.dynamic.JceField {
    private java.lang.String data;

    public StringField(java.lang.String str, int i17) {
        super(i17);
        this.data = str;
    }

    public java.lang.String get() {
        return this.data;
    }

    public void set(java.lang.String str) {
        this.data = str;
    }
}
