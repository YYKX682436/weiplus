package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class p implements java.io.Serializable {

    /* renamed from: BYTE */
    public static final byte f17385x1f5908 = 0;

    /* renamed from: DOUBLE */
    public static final byte f17386x788a6fd1 = 5;

    /* renamed from: FLOAT */
    public static final byte f17387x3fe2a3c = 4;
    public static final byte INT = 2;

    /* renamed from: JCE_MAX_STRING_LENGTH */
    public static final int f17388x3ad31bc6 = 104857600;

    /* renamed from: LIST */
    public static final byte f17389x23a89e = 9;

    /* renamed from: LONG */
    public static final byte f17390x23be7c = 3;
    public static final byte MAP = 8;

    /* renamed from: SHORT */
    public static final byte f17391x4b38c5c = 1;

    /* renamed from: SIMPLE_LIST */
    public static final byte f17392x2d80fb0b = 13;

    /* renamed from: STRING1 */
    public static final byte f17393xbaa22e40 = 6;

    /* renamed from: STRING4 */
    public static final byte f17394xbaa22e43 = 7;

    /* renamed from: STRUCT_BEGIN */
    public static final byte f17395x53b6f9f = 10;

    /* renamed from: STRUCT_END */
    public static final byte f17396x27f6c951 = 11;

    /* renamed from: ZERO_TAG */
    public static final byte f17397x57aad563 = 12;

    /* renamed from: a, reason: collision with root package name */
    private java.lang.Object f132128a;

    /* renamed from: toDisplaySimpleString */
    public static java.lang.String m36877x42e543ca(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p pVar) {
        if (pVar == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        pVar.mo36081x93891d14(sb6, 0);
        return sb6.toString();
    }

    /* renamed from: className */
    public java.lang.String mo36073xff691c23() {
        return "";
    }

    /* renamed from: containField */
    public boolean m36878x7dee7086(java.lang.String str) {
        return false;
    }

    /* renamed from: display */
    public void mo36080x63a518c2(java.lang.StringBuilder sb6, int i17) {
    }

    /* renamed from: displaySimple */
    public void mo36081x93891d14(java.lang.StringBuilder sb6, int i17) {
    }

    /* renamed from: getFieldByName */
    public java.lang.Object m36879xd270a7e6(java.lang.String str) {
        return null;
    }

    /* renamed from: getTag */
    public java.lang.Object m36880xb5887064() {
        return this.f132128a;
    }

    /* renamed from: newInit */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p m36881x6df6b2d0() {
        return null;
    }

    /* renamed from: readFrom */
    public abstract void mo36074xcc442a60(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar);

    /* renamed from: recyle */
    public void m36882xc8469122() {
    }

    /* renamed from: setFieldByName */
    public void m36883x68d61b5a(java.lang.String str, java.lang.Object obj) {
    }

    /* renamed from: setTag */
    public void m36884xca0297d8(java.lang.Object obj) {
        this.f132128a = obj;
    }

    /* renamed from: toByteArray */
    public byte[] m36885x5f01b1f6() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n();
        mo36076x5f8be6ba(nVar);
        return nVar.a();
    }

    /* renamed from: toString */
    public java.lang.String mo36075x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        mo36080x63a518c2(sb6, 0);
        return sb6.toString();
    }

    /* renamed from: writeTo */
    public abstract void mo36076x5f8be6ba(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar);

    /* renamed from: toByteArray */
    public byte[] m36886x5f01b1f6(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n();
        nVar.a(str);
        mo36076x5f8be6ba(nVar);
        return nVar.a();
    }
}
