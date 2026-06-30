package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class p implements java.io.Serializable {
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

    /* renamed from: a, reason: collision with root package name */
    private java.lang.Object f50595a;

    public static java.lang.String toDisplaySimpleString(com.tencent.mapsdk.internal.p pVar) {
        if (pVar == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        pVar.displaySimple(sb6, 0);
        return sb6.toString();
    }

    public java.lang.String className() {
        return "";
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

    public java.lang.Object getTag() {
        return this.f50595a;
    }

    public com.tencent.mapsdk.internal.p newInit() {
        return null;
    }

    public abstract void readFrom(com.tencent.mapsdk.internal.m mVar);

    public void recyle() {
    }

    public void setFieldByName(java.lang.String str, java.lang.Object obj) {
    }

    public void setTag(java.lang.Object obj) {
        this.f50595a = obj;
    }

    public byte[] toByteArray() {
        com.tencent.mapsdk.internal.n nVar = new com.tencent.mapsdk.internal.n();
        writeTo(nVar);
        return nVar.a();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        display(sb6, 0);
        return sb6.toString();
    }

    public abstract void writeTo(com.tencent.mapsdk.internal.n nVar);

    public byte[] toByteArray(java.lang.String str) {
        com.tencent.mapsdk.internal.n nVar = new com.tencent.mapsdk.internal.n();
        nVar.a(str);
        writeTo(nVar);
        return nVar.a();
    }
}
