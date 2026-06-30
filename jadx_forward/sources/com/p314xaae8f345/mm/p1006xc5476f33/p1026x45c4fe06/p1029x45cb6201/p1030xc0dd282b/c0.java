package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b;

/* loaded from: classes7.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f157281a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.p6 f157282b;

    /* renamed from: c, reason: collision with root package name */
    public cf.d f157283c;

    public c0(java.lang.String localRequestKey, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.p6 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localRequestKey, "localRequestKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f157281a = localRequestKey;
        this.f157282b = callback;
    }

    /* renamed from: equals */
    public boolean m49414xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.c0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.c0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157281a, c0Var.f157281a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157282b, c0Var.f157282b);
    }

    /* renamed from: hashCode */
    public int m49415x8cdac1b() {
        return (this.f157281a.hashCode() * 31) + this.f157282b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m49416x9616526c() {
        return "CallbackContext(localRequestKey=" + this.f157281a + ", callback=" + this.f157282b + ')';
    }
}
