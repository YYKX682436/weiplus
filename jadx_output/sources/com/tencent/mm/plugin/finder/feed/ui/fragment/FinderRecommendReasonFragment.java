package com.tencent.mm.plugin.finder.feed.ui.fragment;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/fragment/FinderRecommendReasonFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderBaseGridFeedFragment;", "Lcom/tencent/mm/plugin/finder/feed/bs;", "Lcom/tencent/mm/plugin/finder/feed/as;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderRecommendReasonFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment<com.tencent.mm.plugin.finder.feed.bs, com.tencent.mm.plugin.finder.feed.as> {
    public static final java.util.concurrent.ConcurrentHashMap I = new java.util.concurrent.ConcurrentHashMap();
    public int C;
    public long D;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.as f110058u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.bs f110059v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f110060w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader f110061x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f110062y;

    /* renamed from: z, reason: collision with root package name */
    public long f110063z;
    public java.lang.String A = "";
    public int B = 1;
    public java.lang.String E = "";
    public int F = 336;
    public int G = 337;
    public java.lang.String H = "";

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public com.tencent.mm.plugin.finder.feed.a1 A0() {
        com.tencent.mm.plugin.finder.feed.bs bsVar = this.f110059v;
        if (bsVar != null) {
            return bsVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public void C0(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        I.clear();
        pf5.z zVar = pf5.z.f353948a;
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.b(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        androidx.lifecycle.c1 a17 = zVar.b(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny.l7((com.tencent.mm.plugin.finder.viewmodel.component.ny) a17, this.F, 3, null, 4, null);
        this.f110060w = view.findViewById(com.tencent.mm.R.id.sa9);
        com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader finderRecommendReasonLoader = new com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader(V6);
        finderRecommendReasonLoader.f107622d = this.f110062y;
        finderRecommendReasonLoader.f107623e = null;
        finderRecommendReasonLoader.f107624f = this.C;
        finderRecommendReasonLoader.f107625g = this.f110063z;
        finderRecommendReasonLoader.f107626h = this.A;
        java.lang.String str = this.H;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        finderRecommendReasonLoader.f107628m = str;
        finderRecommendReasonLoader.f107630o = this.G;
        finderRecommendReasonLoader.f107629n = this.F;
        finderRecommendReasonLoader.setInitDone(new hd2.t0(this));
        finderRecommendReasonLoader.f107632q = new hd2.u0(this);
        this.f110061x = finderRecommendReasonLoader;
        com.tencent.mm.ui.MMActivity y07 = y0();
        int i17 = this.F;
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = this.f110061x;
        if (baseFinderFeedLoader == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        this.f110058u = new com.tencent.mm.plugin.finder.feed.as(y07, 2, i17, baseFinderFeedLoader);
        hd2.v0 v0Var = new hd2.v0(this, view, y0(), this.F);
        v0Var.f106413w = this.G;
        v0Var.f106414x = this.F;
        this.f110059v = v0Var;
        sc2.c8 u17 = v0Var.u();
        if (u17 != null) {
            u17.f405818f = 4;
        }
        com.tencent.mm.plugin.finder.feed.bs bsVar = this.f110059v;
        if (bsVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.as asVar = this.f110058u;
        if (asVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        bsVar.f106182o = asVar;
        new db2.o1(V6, this.f110062y, this.E).l().h(new hd2.w0(view));
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dnm;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.ui.component.UIComponentFragment
    public java.util.Set l0() {
        return kz5.o1.c(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderRecommendReasonPage);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.Finder);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "jump_dstream_halfscreen");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(this, 8, 1, false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new hd2.x0(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        I.clear();
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        ((com.tencent.mm.plugin.finder.viewmodel.component.ut) pf5.z.f353948a.b(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class)).R6(true);
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        ((com.tencent.mm.plugin.finder.viewmodel.component.ut) pf5.z.f353948a.b(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class)).R6(false);
        this.D = java.lang.System.currentTimeMillis();
        super.onResume();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0, reason: from getter */
    public int getF() {
        return this.F;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public int x0() {
        return 3;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public com.tencent.mm.plugin.finder.feed.k0 z0() {
        com.tencent.mm.plugin.finder.feed.as asVar = this.f110058u;
        if (asVar != null) {
            return asVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }
}
