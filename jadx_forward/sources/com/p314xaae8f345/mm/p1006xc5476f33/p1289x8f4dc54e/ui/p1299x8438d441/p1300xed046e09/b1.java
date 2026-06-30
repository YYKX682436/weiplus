package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes5.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f175721a;

    /* renamed from: b, reason: collision with root package name */
    public final int f175722b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f175723c;

    public b1(java.lang.String url, int i17, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f175721a = url;
        this.f175722b = i17;
        this.f175723c = userName;
    }

    /* renamed from: equals */
    public boolean m54343xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f175721a, b1Var.f175721a) && this.f175722b == b1Var.f175722b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f175723c, b1Var.f175723c);
    }

    /* renamed from: hashCode */
    public int m54344x8cdac1b() {
        return (((this.f175721a.hashCode() * 31) + java.lang.Integer.hashCode(this.f175722b)) * 31) + this.f175723c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m54345x9616526c() {
        return "ReaderItem(url=" + this.f175721a + ", type=" + this.f175722b + ", userName=" + this.f175723c + ')';
    }
}
