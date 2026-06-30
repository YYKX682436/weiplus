package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderSelfHistoryContentFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderBaseGridFeedFragment;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderSelfHistoryContract$PlayHistoryViewCallback;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderSelfHistoryContract$PlayHistoryPresenter;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryContentFragment */
/* loaded from: classes2.dex */
public final class C14088x5e57da07 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14852xab1eeb4.PlayHistoryViewCallback, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14852xab1eeb4.PlayHistoryPresenter> {

    /* renamed from: y, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f191070y = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: u, reason: collision with root package name */
    public final int f191071u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14852xab1eeb4.PlayHistoryPresenter f191072v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14852xab1eeb4.PlayHistoryViewCallback f191073w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 f191074x;

    public C14088x5e57da07(int i17) {
        this.f191071u = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 A0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14852xab1eeb4.PlayHistoryViewCallback playHistoryViewCallback = this.f191073w;
        if (playHistoryViewCallback != null) {
            return playHistoryViewCallback;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb
    public void B0() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb
    public void C0(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        f191070y.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13915xfa910e35 c13915xfa910e35 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13915xfa910e35(this.f191071u, false, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
        c13915xfa910e35.m56375x868b9334(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.gk(this));
        c13915xfa910e35.f189179g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.hk(this);
        c13915xfa910e35.f189180h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ik(this);
        this.f191074x = c13915xfa910e35;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf y07 = y0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28 = this.f191074x;
        if (abstractC13834x56f46d28 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
            throw null;
        }
        this.f191072v = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14852xab1eeb4.PlayHistoryPresenter(y07, 0, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, abstractC13834x56f46d28);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.jk jkVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.jk(this, view, this.f191071u, y0(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e);
        this.f191073w = jkVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14852xab1eeb4.PlayHistoryPresenter playHistoryPresenter = this.f191072v;
        if (playHistoryPresenter == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        jkVar.T(playHistoryPresenter);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14852xab1eeb4.PlayHistoryViewCallback playHistoryViewCallback = this.f191073w;
        if (playHistoryViewCallback == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        playHistoryViewCallback.m56022x4905e9fa().i(playHistoryViewCallback.f204789z);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = y0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Mj(this);
        cy1.a aVar2 = (cy1.a) aVar.ak(this, iy1.c.FinderSelfHistoryUI);
        aVar2.dk(this, "recently_browse_page");
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("ref_commentscene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(7)) : null);
        lVarArr[1] = new jz5.l("finder_context_id", V6 != null ? V6.m75945x2fec8307(1) : null);
        lVarArr[2] = new jz5.l("finder_tab_context_id", V6 != null ? V6.m75945x2fec8307(2) : null);
        lVarArr[3] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
        lVarArr[4] = new jz5.l("finder_username", xy2.c.e(y0()));
        aVar2.gk(this, kz5.c1.k(lVarArr));
        aVar2.Tj(this, 12, 1, false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: getLayoutId */
    public int mo48065x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570624dp1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public java.util.Set l0() {
        return kz5.o1.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        f191070y.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14852xab1eeb4.PlayHistoryViewCallback playHistoryViewCallback = this.f191073w;
        if (playHistoryViewCallback != null) {
            playHistoryViewCallback.m56022x4905e9fa().V0(playHistoryViewCallback.f204789z);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656
    /* renamed from: r0 */
    public int getF203048s() {
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180
    public int x0() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0 z0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14852xab1eeb4.PlayHistoryPresenter playHistoryPresenter = this.f191072v;
        if (playHistoryPresenter != null) {
            return playHistoryPresenter;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }
}
