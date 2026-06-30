package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final bw5.lp0 f267313a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f267314b;

    public h1(bw5.lp0 tingItem, java.lang.String srcId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItem, "tingItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcId, "srcId");
        this.f267313a = tingItem;
        this.f267314b = srcId;
    }

    /* renamed from: equals */
    public boolean m74533xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.h1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.h1 h1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.h1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f267313a, h1Var.f267313a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f267314b, h1Var.f267314b);
    }

    /* renamed from: hashCode */
    public int m74534x8cdac1b() {
        return (this.f267313a.hashCode() * 31) + this.f267314b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m74535x9616526c() {
        return "WebViewListenItem(tingItem=" + this.f267313a + ", srcId=" + this.f267314b + ')';
    }
}
