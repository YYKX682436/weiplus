package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4;

/* loaded from: classes2.dex */
public final class u extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.f8 {

    /* renamed from: d, reason: collision with root package name */
    public in5.s0 f193001d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.C14161x3a122e13 f193002e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.p f193003f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.l f193004g;

    /* renamed from: h, reason: collision with root package name */
    public cw2.ea f193005h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f193006i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.p(m158354x19263085());
        this.f193003f = pVar;
        this.f193004g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.l(pVar);
        this.f193006i = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public final void O6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f;
        in5.s0 s0Var = this.f193001d;
        if (s0Var != null && (c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k)) != null) {
            cw2.ea eaVar = this.f193005h;
            if (eaVar != null) {
                c15196x85976f5f.T(eaVar);
            }
            c15196x85976f5f.S();
        }
        this.f193005h = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.C14161x3a122e13 c14161x3a122e13 = this.f193002e;
        boolean z17 = false;
        if (c14161x3a122e13 != null ? c14161x3a122e13.q() : false) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.C14161x3a122e13 c14161x3a122e132 = this.f193002e;
            z17 = true;
            if (c14161x3a122e132 != null && c14161x3a122e132.q()) {
                c14161x3a122e132.n(true);
            }
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveHighlightDrawerUIC", "remove highlight progress listener to drawer, on destroy");
        O6();
        this.f193003f.f192988b = null;
        this.f193001d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.C14161x3a122e13 c14161x3a122e13 = this.f193002e;
        if (c14161x3a122e13 != null) {
            c14161x3a122e13.b();
        }
        this.f193006i.clear();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.C14161x3a122e13 c14161x3a122e13 = this.f193002e;
        if (c14161x3a122e13 == null || !c14161x3a122e13.q()) {
            return;
        }
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Y9).mo141623x754a37bb()).r()).intValue() == 1) {
            c14161x3a122e13.m82804xbcf4cbbe(false);
            c14161x3a122e13.m82802x7ea6418d(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.p(m158354x19263085());
        this.f193003f = pVar;
        this.f193004g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.l(pVar);
        this.f193006i = new java.util.concurrent.CopyOnWriteArrayList();
    }
}
