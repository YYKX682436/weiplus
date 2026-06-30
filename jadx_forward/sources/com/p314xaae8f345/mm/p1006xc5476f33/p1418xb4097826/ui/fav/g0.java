package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

/* loaded from: classes2.dex */
public final class g0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.p {

    /* renamed from: o, reason: collision with root package name */
    public final int f210702o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f210703p = "FinderGlobalMixFavPresenter";

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f210704q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.f0(this));

    public g0(int i17) {
        this.f210702o = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.p
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 A(r45.qt2 qt2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13877xf5f46f3c c13877xf5f46f3c = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13877xf5f46f3c(false, qt2Var, 4, this.f210702o);
        c13877xf5f46f3c.f189062h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.d0(c13877xf5f46f3c, this);
        return c13877xf5f46f3c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a
    public java.util.ArrayList c() {
        return z().m56387xe6796cde();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a
    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f210682e = callback;
        f().g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7.m56397xe61f0140(z(), (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.e0) ((jz5.n) this.f210704q).mo141623x754a37bb(), false, 2, null);
        m();
        f().j();
        q();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a, fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        super.mo979x3f5eee52();
        z().m56401x31d4943c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.e0) ((jz5.n) this.f210704q).mo141623x754a37bb());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.p
    public int v(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.p
    public java.lang.String y(so2.j5 feed, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        if (!(feed instanceof so2.a0)) {
            return super.y(feed, j17);
        }
        bu2.e0.f106031a.d(35, "", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.c0(feed.mo2128x1ed62e84()), true);
        return pm0.v.u(feed.mo2128x1ed62e84());
    }
}
