package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(dc1.e.CTRL_INDEX)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderFeedDetailUI;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderProfileTimeLineUI extends com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int R = 0;
    public java.lang.String A;
    public boolean B;
    public long C;
    public java.lang.Boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public long H;

    /* renamed from: J, reason: collision with root package name */
    public int f109504J;
    public r45.a34 L;
    public r45.q13 N;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.kr f109506u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f109507v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderLikeDrawer f109508w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderLikeDrawer f109509x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderFavDrawer f109510y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.xr f109511z;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f109505t = "Finder.FinderProfileTimeLineUI";
    public java.lang.String I = "";
    public java.lang.String K = "";
    public java.lang.String M = "";
    public final jz5.g P = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.fj(this));
    public final com.tencent.mm.plugin.finder.feed.ui.dj Q = new com.tencent.mm.plugin.finder.feed.ui.dj();

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        boolean z17 = kotlin.jvm.internal.o.b(getIntent().getStringExtra("finder_username"), xy2.c.e(this)) && getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false);
        int intExtra = getIntent().getIntExtra("KEY_SPECIFY_COMMENTSCENE", 0);
        return intExtra != 0 ? intExtra : z17 ? 8 : 1;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    public com.tencent.mm.plugin.finder.feed.kr c7(com.tencent.mm.ui.MMActivity context, java.lang.String username, boolean z17, long j17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        return new com.tencent.mm.plugin.finder.feed.kr(context, username, z17, j17, this.F, this.G, this.H, this.I, this.f109504J, this.K, this.L, this.M, this.N);
    }

    public final vb2.m d7() {
        return (vb2.m) ((jz5.n) this.P).getValue();
    }

    public final void e7() {
        com.tencent.mars.xlog.Log.i(this.f109505t, "goBack");
        pf5.u uVar = pf5.u.f353936a;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (((com.tencent.mm.plugin.finder.viewmodel.component.di) uVar.c(context).a(com.tencent.mm.plugin.finder.viewmodel.component.di.class)).onBackPressed()) {
            return;
        }
        com.tencent.mm.plugin.finder.playlist.w1 w1Var = (com.tencent.mm.plugin.finder.playlist.w1) uVar.c(this).e(com.tencent.mm.plugin.finder.playlist.w1.class);
        if (w1Var != null && w1Var.onBackPressed()) {
            return;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC) uVar.c(this).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.class);
        if (finderProfileDrawerUIC != null && finderProfileDrawerUIC.onBackPressed()) {
            return;
        }
        com.tencent.mm.plugin.finder.highlight.u uVar2 = (com.tencent.mm.plugin.finder.highlight.u) uVar.c(this).e(com.tencent.mm.plugin.finder.highlight.u.class);
        if (uVar2 != null && uVar2.onBackPressed()) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.v6 v6Var = (com.tencent.mm.plugin.finder.viewmodel.component.v6) uVar.c(context2).e(com.tencent.mm.plugin.finder.viewmodel.component.v6.class);
        if (v6Var != null && v6Var.O6()) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f109506u;
        if (krVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.view.f5 j27 = krVar.j2();
        if (j27 != null && j27.b()) {
            j27.a();
            return;
        }
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = this.f109508w;
        if (finderLikeDrawer == null) {
            kotlin.jvm.internal.o.o("likeDrawer");
            throw null;
        }
        if (finderLikeDrawer.q()) {
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer2 = this.f109508w;
            if (finderLikeDrawer2 != null) {
                finderLikeDrawer2.u();
                return;
            } else {
                kotlin.jvm.internal.o.o("likeDrawer");
                throw null;
            }
        }
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer3 = this.f109509x;
        if (finderLikeDrawer3 == null) {
            kotlin.jvm.internal.o.o("friendLikeDrawer");
            throw null;
        }
        if (finderLikeDrawer3.q()) {
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer4 = this.f109509x;
            if (finderLikeDrawer4 != null) {
                finderLikeDrawer4.u();
                return;
            } else {
                kotlin.jvm.internal.o.o("friendLikeDrawer");
                throw null;
            }
        }
        com.tencent.mm.plugin.finder.view.FinderFavDrawer finderFavDrawer = this.f109510y;
        if (finderFavDrawer == null) {
            kotlin.jvm.internal.o.o("friendFavDrawer");
            throw null;
        }
        if (!finderFavDrawer.q()) {
            androidx.lifecycle.c1 a17 = uVar.c(this).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            if (((com.tencent.mm.plugin.finder.viewmodel.component.gg) a17).P6(false)) {
                return;
            }
            finish();
            return;
        }
        com.tencent.mm.plugin.finder.view.FinderFavDrawer finderFavDrawer2 = this.f109510y;
        if (finderFavDrawer2 == null) {
            kotlin.jvm.internal.o.o("friendFavDrawer");
            throw null;
        }
        if (finderFavDrawer2.q()) {
            finderFavDrawer2.n(true);
        }
    }

    public void f7() {
        if (this.f109506u != null) {
            com.tencent.mars.xlog.Log.i(this.f109505t, "saveLoaderData");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mm.plugin.finder.feed.kr krVar = this.f109506u;
            if (krVar == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            arrayList.addAll(krVar.m().getDataListJustForAdapter());
            java.util.Iterator it = arrayList.iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                so2.j5 j5Var = (so2.j5) next;
                if ((j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getIsProfileAdFeed()) {
                    it.remove();
                } else if ((j5Var instanceof so2.n1) && ((so2.n1) j5Var).f2()) {
                    it.remove();
                }
            }
            android.content.Intent intent = getIntent();
            com.tencent.mm.plugin.finder.feed.kr krVar2 = this.f109506u;
            if (krVar2 == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            hc2.e0.b(intent, 0, arrayList, krVar2.m().getLastBuffer(), null);
            setResult(-1, getIntent());
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if ((((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.E1).getValue()).r()).intValue() == 1 && this.E && kotlin.jvm.internal.o.b(this.D, java.lang.Boolean.TRUE)) ? false : true) {
            f7();
        } else {
            com.tencent.mars.xlog.Log.i(this.f109505t, "can't save loader data,because hasFinish=" + this.E + ",needBackData=" + this.D);
        }
        super.finish();
        this.E = true;
    }

    public final void g7() {
        if (!com.tencent.mm.ui.bk.y()) {
            d7().f434678n.setVisibility(8);
            d7().f434676l.setVisibility(8);
            d7().f434672h.setVisibility(8);
            return;
        }
        d7().f434678n.setVisibility(0);
        d7().f434676l.setVisibility(0);
        d7().f434672h.setVisibility(4);
        if (com.tencent.mm.ui.bk.w0()) {
            if (com.tencent.mm.ui.fj.b(this)) {
                d7().f434679o.setImageResource(com.tencent.mm.R.raw.icons_outlined_merge);
            } else {
                d7().f434679o.setImageResource(com.tencent.mm.R.raw.icons_outlined_sperated);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b7e;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.pt.class, com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class, com.tencent.mm.plugin.finder.viewmodel.component.h80.class, com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class, com.tencent.mm.plugin.finder.viewmodel.component.sx.class, com.tencent.mm.plugin.finder.viewmodel.component.f2.class, com.tencent.mm.plugin.finder.viewmodel.component.fy.class, ni3.n.class, cs2.k.class, hy2.f.class, com.tencent.mm.plugin.finder.viewmodel.component.a4.class, com.tencent.mm.plugin.finder.viewmodel.component.gg.class, com.tencent.mm.plugin.finder.viewmodel.component.di.class, com.tencent.mm.plugin.finder.viewmodel.component.u6.class, com.tencent.mm.plugin.finder.viewmodel.component.v6.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.v9.class))});
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.Object obj;
        java.util.LinkedList linkedList;
        fc2.c n17;
        fc2.c n18;
        fc2.c n19;
        ya2.g gVar = ya2.h.f460484a;
        java.lang.String str = this.A;
        kotlin.jvm.internal.o.d(str);
        ya2.b2 b17 = gVar.b(str);
        setMMTitle(b17 != null ? b17.w0() : "");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f109507v = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById;
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.aj(this));
        java.lang.String str2 = this.A;
        kotlin.jvm.internal.o.d(str2);
        com.tencent.mm.plugin.finder.feed.kr c76 = c7(this, str2, this.B, this.C);
        this.f109506u = c76;
        if (c76 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.xr xrVar = new com.tencent.mm.plugin.finder.feed.xr(this, c76);
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f109506u;
        if (krVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        krVar.f107247x = xrVar;
        int i17 = krVar.f107232f ? 8 : 1;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader m17 = krVar.m();
        if (!(m17 instanceof com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader)) {
            m17 = null;
        }
        if (m17 != null) {
            m17.setFetchTopCallback(new com.tencent.mm.plugin.finder.feed.vq(krVar));
        }
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader m18 = krVar.m();
        if (!(m18 instanceof com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader)) {
            m18 = null;
        }
        if (m18 != null) {
            m18.setFetchEndCallback(new com.tencent.mm.plugin.finder.feed.wq(krVar));
        }
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader m19 = krVar.m();
        if (!(m19 instanceof com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader)) {
            m19 = null;
        }
        if (m19 != null) {
            m19.setGuideToDiscoverAppendedCallback(new com.tencent.mm.plugin.finder.feed.xq(krVar));
        }
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader m27 = krVar.m();
        if (!(m27 instanceof com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader)) {
            m27 = null;
        }
        if (m27 != null) {
            m27.setTopFetchEndCallback(new com.tencent.mm.plugin.finder.feed.yq(krVar));
        }
        krVar.f107229J.alive();
        krVar.K.alive();
        if (bd2.r.f19284a.b()) {
            krVar.L.alive();
        }
        krVar.M.alive();
        com.tencent.mm.plugin.finder.view.ContactUninterestEventListener contactUninterestEventListener = new com.tencent.mm.plugin.finder.view.ContactUninterestEventListener(krVar.m());
        krVar.F = contactUninterestEventListener;
        contactUninterestEventListener.alive();
        cw2.f8 f8Var = krVar.I;
        com.tencent.mm.plugin.finder.feed.xr xrVar2 = krVar.f107247x;
        kotlin.jvm.internal.o.d(xrVar2);
        cw2.f8.L0(f8Var, xrVar2.f111095d, null, new com.tencent.mm.plugin.finder.feed.rq(krVar), false, 8, null);
        boolean z17 = ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127797l0).getValue()).r()).booleanValue() || ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127815m0).getValue()).r()).booleanValue();
        com.tencent.mm.ui.MMActivity activity = krVar.f107230d;
        if (z17) {
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            ni3.n nVar = (ni3.n) zVar.a(activity).a(ni3.n.class);
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataListJustForAdapter = krVar.m().getDataListJustForAdapter();
            cw2.f8 f8Var2 = krVar.I;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            nVar.P6(dataListJustForAdapter, 0, f8Var2, nyVar != null ? zy2.ra.n1(nyVar, 0, 1, null) : null, -1);
        }
        com.tencent.mm.plugin.finder.feed.zq zqVar = new com.tencent.mm.plugin.finder.feed.zq(krVar);
        int i18 = krVar.C;
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = krVar.f107249z;
        l0Var.N0(i18, i17, zqVar);
        com.tencent.mm.plugin.finder.feed.xr xrVar3 = krVar.f107247x;
        androidx.recyclerview.widget.RecyclerView recyclerView = xrVar3 != null ? xrVar3.getRecyclerView() : null;
        com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = recyclerView instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView ? (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView : null;
        if (finderRecyclerView != null) {
            finderRecyclerView.setSkipsTouchInterceptionListener(krVar.X);
        }
        com.tencent.mm.plugin.finder.feed.xr xrVar4 = krVar.f107247x;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = xrVar4 != null ? xrVar4.getRecyclerView() : null;
        com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView2 = recyclerView2 instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView ? (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView2 : null;
        if (finderRecyclerView2 != null) {
            finderRecyclerView2.setInterceptTouchEventListener(krVar.Z);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(activity);
        if (e17 != null && (n19 = zy2.ra.n1(e17, 0, 1, null)) != null) {
            n19.a(l0Var);
        }
        pf5.z zVar2 = pf5.z.f353948a;
        krVar.G = new com.tencent.mm.plugin.finder.report.w3(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar2.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6()).f125421b;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(activity);
        if (e18 != null && (n18 = zy2.ra.n1(e18, 0, 1, null)) != null) {
            fc2.d dVar = krVar.G;
            if (dVar == null) {
                kotlin.jvm.internal.o.o("observerForExposeReport");
                throw null;
            }
            n18.a(dVar);
        }
        zy2.h8 h8Var = krVar.A;
        com.tencent.mm.plugin.finder.feed.ar arVar = new com.tencent.mm.plugin.finder.feed.ar(krVar);
        com.tencent.mm.plugin.finder.feed.xr xrVar5 = krVar.f107247x;
        com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) h8Var;
        s3Var.N0(arVar, xrVar5 != null ? xrVar5.getRecyclerView() : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(activity);
        if (e19 != null && (n17 = zy2.ra.n1(e19, 0, 1, null)) != null) {
            s3Var.getClass();
            n17.a(s3Var);
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC) zVar2.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC.class)).P6(xrVar.getRecyclerView());
        java.lang.String stringExtra = activity.getIntent().getStringExtra("FLOAT_BALL_KEY");
        boolean z18 = !(stringExtra == null || stringExtra.length() == 0);
        java.lang.String str3 = krVar.f107243t;
        com.tencent.mars.xlog.Log.i(str3, "fromFloatBall " + z18);
        if (!z18) {
            java.util.ArrayList arrayList = krVar.f107245v;
            r45.q13 q13Var = krVar.f107242s;
            if (q13Var != null && (linkedList = q13Var.f383564f) != null) {
                int i19 = 0;
                for (java.lang.Object obj2 : linkedList) {
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.Integer num = (java.lang.Integer) obj2;
                    java.util.LinkedList linkedList2 = q13Var.f383563e;
                    java.lang.Integer num2 = linkedList2 != null ? (java.lang.Integer) linkedList2.get(i19) : null;
                    if (num2 != null) {
                        kotlin.jvm.internal.o.d(num);
                        arrayList.add(new com.tencent.mm.plugin.finder.feed.yr(num.intValue(), num2.intValue(), 0L, null));
                    } else {
                        kotlin.jvm.internal.o.d(num);
                        arrayList.add(new com.tencent.mm.plugin.finder.feed.yr(num.intValue(), 0, 0L, null));
                    }
                    i19 = i27;
                }
            }
            if (q13Var != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("promotionAdsInfo style_info ");
                sb6.append(q13Var.f383565g);
                sb6.append(" text ");
                r45.fg6 fg6Var = q13Var.f383565g;
                sb6.append(fg6Var != null ? fg6Var.f374324d : null);
                com.tencent.mars.xlog.Log.i(str3, sb6.toString());
            }
            if (arrayList.size() > 1) {
                kz5.g0.t(arrayList, new com.tencent.mm.plugin.finder.feed.uq());
            }
        }
        com.tencent.mm.plugin.finder.feed.xr xrVar6 = krVar.f107247x;
        if (xrVar6 != null) {
            xrVar6.getRecyclerView().i(krVar.H);
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = xrVar.f111098g;
        if (refreshLoadMoreLayout == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout.setActionCallback(new com.tencent.mm.plugin.finder.feed.qr(xrVar));
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        pm0.v.J(km5.u.d(), new com.tencent.mm.plugin.finder.feed.ur(xrVar));
        int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.M().r()).intValue();
        androidx.recyclerview.widget.RecyclerView recyclerView3 = xrVar.f111099h;
        if (intValue == -1) {
            if (recyclerView3 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            oj5.x.e(recyclerView3, kz5.c0.i(new int[]{4, 6}, new int[]{2, 3}), null, null, 6, null);
        }
        com.tencent.mm.ui.MMActivity activity2 = xrVar.f111095d;
        kotlin.jvm.internal.o.g(activity2, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) a17).Z6(-1);
        if (Z6 != null) {
            if (recyclerView3 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            Z6.d(recyclerView3);
        }
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        if ((recyclerView3 instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) && (recyclerView3.getLayoutManager() instanceof androidx.recyclerview.widget.LinearLayoutManager)) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView3.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            obj = null;
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView.i1((com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView3, (androidx.recyclerview.widget.LinearLayoutManager) layoutManager, null, 2, null);
        } else {
            obj = null;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(xrVar.f111097f.m(), xrVar.f111101m, false, 2, obj);
        this.f109511z = xrVar;
        com.tencent.mm.plugin.finder.view.vc vcVar = com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D;
        this.f109508w = com.tencent.mm.plugin.finder.view.vc.a(vcVar, this, getWindow(), 2, false, false, 24, null);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f109509x = com.tencent.mm.plugin.finder.view.vc.a(vcVar, context, getWindow(), 1, false, false, 24, null);
        com.tencent.mm.plugin.finder.view.p9 p9Var = com.tencent.mm.plugin.finder.view.FinderFavDrawer.B;
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        this.f109510y = p9Var.a(context2, getWindow(), 0);
        androidx.appcompat.app.AppCompatActivity context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        com.tencent.mm.plugin.finder.view.vc.a(vcVar, context3, getWindow(), 4, false, false, 24, null);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ggn);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById(com.tencent.mm.R.id.aa9).setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.bj(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ggl);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context4 = getContext();
        java.lang.String w07 = b17 != null ? b17.w0() : "";
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context4, w07));
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
        getWindow().setStatusBarColor(0);
        getController().W0(this, getResources().getColor(com.tencent.mm.R.color.a9e));
        com.tencent.mm.ui.r0.a(this, false);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            supportActionBar.o();
        }
        int h17 = com.tencent.mm.ui.bl.h(this);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.ggn);
        viewGroup.setPadding(0, h17, 0, 0);
        com.tencent.mm.ui.a4.g(viewGroup, true);
        g7();
        d7().f434678n.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.zi(this));
        getController().O0(true);
        d7().f434665a.setBackgroundColor(-16777216);
        setNavigationbarColor(-16777216);
        ((android.view.ViewGroup) findViewById(com.tencent.mm.R.id.m67)).setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f479160rk));
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f109507v;
        if (refreshLoadMoreLayout2 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.bs8, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        refreshLoadMoreLayout2.setLoadMoreFooter(inflate);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f483315aa4);
        if (weImageView != null) {
            weImageView.setIconColor(getResources().getColor(com.tencent.mm.R.color.f479252u4));
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.g8o);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.cj(this));
        com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = (com.tencent.mm.plugin.finder.viewmodel.component.gg) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        com.tencent.mm.plugin.finder.feed.kr krVar2 = this.f109506u;
        if (krVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        ggVar.f134512n = krVar2.m();
        ggVar.U6(getIntent().getExtras());
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isHideStatusBar */
    public boolean getP() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        e7();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        g7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        byte[] byteArrayExtra;
        super.onCreate(bundle);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.FinderProfileTimelineUI;
        ((cy1.a) rVar).ak(this, cVar);
        this.A = getIntent().getStringExtra("finder_username");
        boolean z17 = false;
        this.B = getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false);
        this.C = getIntent().getLongExtra("KEY_FROM_TOPIC_ID", 0L);
        this.F = getIntent().getBooleanExtra("key_from_profile_search", false);
        this.G = getIntent().getBooleanExtra("key_from_biz_photo", false);
        this.H = getIntent().getLongExtra("feed_encrypted_object_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("feed_object_nonceId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.I = stringExtra;
        this.f109504J = getIntent().getIntExtra("key_reuqest_scene", 0);
        this.K = getIntent().getStringExtra("key_session_id");
        r45.a34 a34Var = new r45.a34();
        a34Var.set(0, java.lang.Integer.valueOf(getIntent().getIntExtra("KEY_JSAPI_SOURCE_TYPE", 0)));
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_JSAPI_SOURCE_BUFFER");
        if (stringExtra2 != null) {
            a34Var.set(1, stringExtra2);
        }
        this.L = a34Var;
        java.lang.String stringExtra3 = getIntent().getStringExtra("feed_encrypted_object_id");
        this.M = stringExtra3 != null ? stringExtra3 : "";
        if (getIntent().hasExtra("KEY_REQUEST_BACK_DATA")) {
            this.D = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("KEY_REQUEST_BACK_DATA", false));
        }
        if (getIntent().hasExtra("key_profile_promotion_ads_info") && (byteArrayExtra = getIntent().getByteArrayExtra("key_profile_promotion_ads_info")) != null) {
            r45.q13 q13Var = new r45.q13();
            this.N = q13Var;
            q13Var.parseFrom(byteArrayExtra);
        }
        com.tencent.mars.xlog.Log.i(this.f109505t, "username " + this.A + ", selfFlag " + this.B + ", topicId " + this.C + ", needBackData " + this.D);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.A)) {
            finish();
            return;
        }
        java.lang.String str = this.A;
        if (str != null) {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            z17 = str.equals(xy2.c.e(context));
        }
        if (z17) {
            boolean z18 = this.B;
        }
        initView();
        com.tencent.mm.plugin.finder.feed.xr xrVar = this.f109511z;
        if (xrVar != null) {
            xrVar.getRecyclerView().i(this.Q);
        }
        d7().f434671g.setBackground(null);
        if (getIntent().hasExtra("key_extra_info")) {
            long longExtra = getIntent().getLongExtra("KEY_FINDER_FEEDID", 0L);
            java.lang.String stringExtra4 = getIntent().getStringExtra("KEY_FINDER_FEED_DUP_FLAG");
            androidx.appcompat.app.AppCompatActivity context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar != null) {
                nyVar.t7(longExtra, stringExtra4, this.A);
            }
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, cVar);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.Finder);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, getClass().getSimpleName());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 40, 24184);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.tencent.mm.plugin.finder.feed.ui.ej(this));
        com.tencent.mm.plugin.finder.feed.xr xrVar2 = this.f109511z;
        if (xrVar2 != null) {
            androidx.recyclerview.widget.RecyclerView recyclerView = xrVar2.getRecyclerView();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
            if (finderLinearLayoutManager == null) {
                return;
            }
            recyclerView.post(new com.tencent.mm.plugin.finder.feed.ui.wi(this, finderLinearLayoutManager, recyclerView));
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.finder.feed.xr xrVar = this.f109511z;
        if (xrVar != null) {
            xrVar.getRecyclerView().V0(this.Q);
        }
        super.onDestroy();
        com.tencent.mm.plugin.finder.feed.xr xrVar2 = this.f109511z;
        if (xrVar2 != null) {
            com.tencent.mm.plugin.finder.feed.kr krVar = xrVar2.f111097f;
            krVar.m().unregister(xrVar2.f111101m);
            krVar.onDetach();
            xrVar2.getRecyclerView().setAdapter(null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.feed.xr xrVar = this.f109511z;
        zy2.zb.Kh(zbVar, xrVar != null ? xrVar.getRecyclerView() : null, ml2.x1.f328202f, "1", ml2.y.f328241f, 0, 0L, 0, 112, null);
        r30.p pVar = (r30.p) i95.n0.c(r30.p.class);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        java.lang.String simpleName = getClass().getSimpleName();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i17 = r30.p.f368949f1;
        long j17 = currentTimeMillis - r30.o.f368947a;
        long j18 = r30.o.f368947a;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String d17 = b52.b.d();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String e17 = v52.c.g().e();
        p52.d[] dVarArr = p52.d.f352007d;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        java.lang.String str = r30.m.f368946a;
        kotlin.jvm.internal.o.d(b17);
        ((q30.k) pVar).wi(new q52.e(Ri, simpleName, j17, j18, currentTimeMillis2, d17, e17, 0, false, str, null, b17, false, 0, false, 0, 0, null, 259328, null));
        com.tencent.mm.plugin.finder.feed.xr xrVar2 = this.f109511z;
        if (xrVar2 != null) {
            xrVar2.f111097f.D.getClass();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.finder.feed.kr krVar;
        com.tencent.mm.plugin.finder.feed.xr xrVar;
        super.onResume();
        kk.l lVar = so2.f0.f410334a;
        java.lang.String str = this.A;
        if (str == null) {
            str = "";
        }
        so2.f0.f410335b = str;
        com.tencent.mm.plugin.finder.feed.xr xrVar2 = this.f109511z;
        if (xrVar2 != null && (xrVar = (krVar = xrVar2.f111097f).f107247x) != null) {
            xrVar.getRecyclerView().post(new com.tencent.mm.plugin.finder.feed.br(krVar));
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.feed.xr xrVar3 = this.f109511z;
        zy2.zb.Kh(zbVar, xrVar3 != null ? xrVar3.getRecyclerView() : null, ml2.x1.f328202f, "1", ml2.y.f328240e, 0, 0L, 0, 112, null);
        int i17 = r30.p.f368949f1;
        r30.o.f368947a = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i(this.f109505t, "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
