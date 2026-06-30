package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class cf implements lj2.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kf f188004a;

    public cf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kf kfVar) {
        this.f188004a = kfVar;
    }

    @Override // lj2.t0
    public java.lang.String G(int i17) {
        java.lang.String str = (java.lang.String) this.f188004a.f188725f.get(java.lang.Integer.valueOf(i17));
        return str == null ? "" : str;
    }

    @Override // lj2.t0
    public int I() {
        return this.f188004a.G;
    }

    @Override // lj2.t0
    public boolean M() {
        return this.f188004a.f188731l;
    }

    @Override // lj2.t0
    public int a() {
        return this.f188004a.I;
    }

    @Override // lj2.t0
    public void b(yz5.l callback) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kf kfVar = this.f188004a;
        java.lang.String str = kfVar.f188742w;
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str == null && ((c14989xf862ae88 = kfVar.f188727h) == null || (str = c14989xf862ae88.getUserName()) == null)) {
            str = "";
        }
        ya2.b2 b17 = ya2.h.f542017a.b(str);
        if (b17 != null) {
            zl2.r4.f555483a.Y(b17.y0(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bf(callback));
        }
    }

    @Override // lj2.t0
    public java.util.List g() {
        java.util.List list = this.f188004a.f188743x;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "access$getAnchorPkUserList$p(...)");
        return list;
    }

    @Override // lj2.t0
    public int k() {
        return this.f188004a.H;
    }

    @Override // lj2.t0
    public java.util.List l() {
        java.util.List list = this.f188004a.f188744y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "access$getAudienceUserList$p(...)");
        return list;
    }

    @Override // lj2.t0
    public java.lang.String p() {
        return this.f188004a.f188741v;
    }

    @Override // lj2.t0
    public java.lang.String r() {
        return this.f188004a.f188742w;
    }

    @Override // lj2.t0
    public int y() {
        return 0;
    }
}
