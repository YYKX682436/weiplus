package com.qq.taf.jce;

/* loaded from: classes13.dex */
public abstract class JceStruct implements java.io.Serializable {
    public static final byte BYTE = 0;
    public static final byte DOUBLE = 5;
    public static final byte FLOAT = 4;
    public static final byte INT = 2;
    public static final int JCE_MAX_STRING_LENGTH = 104857600;
    public static final byte LIST = 9;
    public static final byte LONG = 3;
    public static final byte MAP = 8;
    public static final byte SHORT = 1;
    public static final byte SIMPLE_LIST = 13;
    public static final byte STRING1 = 6;
    public static final byte STRING4 = 7;
    public static final byte STRUCT_BEGIN = 10;
    public static final byte STRUCT_END = 11;
    public static final byte ZERO_TAG = 12;

    public static java.lang.String toDisplaySimpleString(com.qq.taf.jce.JceStruct jceStruct) {
        if (jceStruct == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        jceStruct.displaySimple(sb6, 0);
        return sb6.toString();
    }

    public boolean containField(java.lang.String str) {
        return false;
    }

    public void display(java.lang.StringBuilder sb6, int i17) {
    }

    public void displaySimple(java.lang.StringBuilder sb6, int i17) {
    }

    public java.lang.Object getFieldByName(java.lang.String str) {
        return null;
    }

    public com.qq.taf.jce.JceStruct newInit() {
        return null;
    }

    public abstract void readFrom(com.qq.taf.jce.JceInputStream jceInputStream);

    public void recyle() {
    }

    public void setFieldByName(java.lang.String str, java.lang.Object obj) {
    }

    public byte[] toByteArray() {
        com.qq.taf.jce.JceOutputStream jceOutputStream = new com.qq.taf.jce.JceOutputStream();
        writeTo(jceOutputStream);
        return jceOutputStream.toByteArray();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        display(sb6, 0);
        return sb6.toString();
    }

    public abstract void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream);
}
