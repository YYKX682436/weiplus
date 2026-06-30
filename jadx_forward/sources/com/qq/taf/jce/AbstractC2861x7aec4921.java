package com.qq.taf.jce;

/* renamed from: com.qq.taf.jce.JceStruct */
/* loaded from: classes13.dex */
public abstract class AbstractC2861x7aec4921 implements java.io.Serializable {

    /* renamed from: BYTE */
    public static final byte f9753x1f5908 = 0;

    /* renamed from: DOUBLE */
    public static final byte f9754x788a6fd1 = 5;

    /* renamed from: FLOAT */
    public static final byte f9755x3fe2a3c = 4;
    public static final byte INT = 2;

    /* renamed from: JCE_MAX_STRING_LENGTH */
    public static final int f9756x3ad31bc6 = 104857600;

    /* renamed from: LIST */
    public static final byte f9757x23a89e = 9;

    /* renamed from: LONG */
    public static final byte f9758x23be7c = 3;
    public static final byte MAP = 8;

    /* renamed from: SHORT */
    public static final byte f9759x4b38c5c = 1;

    /* renamed from: SIMPLE_LIST */
    public static final byte f9760x2d80fb0b = 13;

    /* renamed from: STRING1 */
    public static final byte f9761xbaa22e40 = 6;

    /* renamed from: STRING4 */
    public static final byte f9762xbaa22e43 = 7;

    /* renamed from: STRUCT_BEGIN */
    public static final byte f9763x53b6f9f = 10;

    /* renamed from: STRUCT_END */
    public static final byte f9764x27f6c951 = 11;

    /* renamed from: ZERO_TAG */
    public static final byte f9765x57aad563 = 12;

    /* renamed from: toDisplaySimpleString */
    public static java.lang.String m21365x42e543ca(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921) {
        if (abstractC2861x7aec4921 == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        abstractC2861x7aec4921.mo21367x93891d14(sb6, 0);
        return sb6.toString();
    }

    /* renamed from: containField */
    public boolean m21366x7dee7086(java.lang.String str) {
        return false;
    }

    /* renamed from: display */
    public void mo21232x63a518c2(java.lang.StringBuilder sb6, int i17) {
    }

    /* renamed from: displaySimple */
    public void mo21367x93891d14(java.lang.StringBuilder sb6, int i17) {
    }

    /* renamed from: getFieldByName */
    public java.lang.Object m21368xd270a7e6(java.lang.String str) {
        return null;
    }

    /* renamed from: newInit */
    public com.qq.taf.jce.AbstractC2861x7aec4921 mo21369x6df6b2d0() {
        return null;
    }

    /* renamed from: readFrom */
    public abstract void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e);

    /* renamed from: recyle */
    public void m21370xc8469122() {
    }

    /* renamed from: setFieldByName */
    public void m21371x68d61b5a(java.lang.String str, java.lang.Object obj) {
    }

    /* renamed from: toByteArray */
    public byte[] m21372x5f01b1f6() {
        com.qq.taf.jce.C2860x6de9642d c2860x6de9642d = new com.qq.taf.jce.C2860x6de9642d();
        mo21235x5f8be6ba(c2860x6de9642d);
        return c2860x6de9642d.m21334x5f01b1f6();
    }

    /* renamed from: toString */
    public java.lang.String m21373x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        mo21232x63a518c2(sb6, 0);
        return sb6.toString();
    }

    /* renamed from: writeTo */
    public abstract void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d);
}
