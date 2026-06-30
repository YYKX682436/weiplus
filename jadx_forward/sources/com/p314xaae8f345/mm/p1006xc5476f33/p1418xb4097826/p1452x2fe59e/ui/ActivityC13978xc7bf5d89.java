package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseGridFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/ec;", "Lcom/tencent/mm/plugin/finder/feed/dc;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLbsStreamFeedUI */
/* loaded from: classes2.dex */
public final class ActivityC13978xc7bf5d89 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ec, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dc> {

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dc f190842t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ec f190843u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 f190844v;

    /* renamed from: w, reason: collision with root package name */
    public final int f190845w = 2;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f190846x = "";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.P1).mo141623x754a37bb()).r()).intValue() != 0 ? 43 : 16;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    public int Y6() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0 c7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dc dcVar = this.f190842t;
        if (dcVar != null) {
            return dcVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ec ecVar = this.f190843u;
        if (ecVar != null) {
            return ecVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f
    public void e7() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f
    public void f7() {
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_UI_TITLE");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f190846x = stringExtra;
        mo54450xbf7c1df6(stringExtra);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13866xe93ceca8 c13866xe93ceca8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13866xe93ceca8(xy2.c.e(mo55332x76847179), ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
        c13866xe93ceca8.m56361x5fd54ec8(getIntent());
        c13866xe93ceca8.f189003e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.q6(this);
        this.f190844v = c13866xe93ceca8;
        int d17 = getD();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28 = this.f190844v;
        if (abstractC13834x56f46d28 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
            throw null;
        }
        int i17 = this.f190845w;
        this.f190842t = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dc(this, i17, d17, abstractC13834x56f46d28);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ec ecVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ec(this, i17, getD(), this.f190846x);
        this.f190843u = ecVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dc dcVar = this.f190842t;
        if (dcVar != null) {
            ecVar.f187715o = dcVar;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.akw;
    }
}
