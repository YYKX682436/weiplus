package com.tencent.mm.plugin.finder.feed.ui.fragment;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/fragment/FinderPostPlayFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderBaseGridFeedFragment;", "Lcom/tencent/mm/plugin/finder/feed/ko;", "Lcom/tencent/mm/plugin/finder/feed/io;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderPostPlayFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment<com.tencent.mm.plugin.finder.feed.ko, com.tencent.mm.plugin.finder.feed.io> {
    public static final java.util.concurrent.ConcurrentHashMap L = new java.util.concurrent.ConcurrentHashMap();
    public int B;
    public int C;
    public long D;
    public boolean E;
    public int I;
    public yz5.l K;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.io f110043u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ko f110044v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader f110045w;

    /* renamed from: x, reason: collision with root package name */
    public long f110046x;

    /* renamed from: z, reason: collision with root package name */
    public long f110048z;

    /* renamed from: y, reason: collision with root package name */
    public int f110047y = 1;
    public java.lang.String A = "";
    public java.lang.String F = "";
    public java.lang.String G = "";
    public java.lang.String H = "";

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f110042J = "";

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public com.tencent.mm.plugin.finder.feed.a1 A0() {
        com.tencent.mm.plugin.finder.feed.ko koVar = this.f110044v;
        if (koVar != null) {
            return koVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public void C0(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        L.clear();
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        com.tencent.mm.plugin.finder.feed.model.FinderPostPlayLoader finderPostPlayLoader = new com.tencent.mm.plugin.finder.feed.model.FinderPostPlayLoader(V6);
        finderPostPlayLoader.f107559d = java.lang.Long.valueOf(this.f110046x);
        finderPostPlayLoader.f107560e = java.lang.Integer.valueOf(this.f110047y);
        finderPostPlayLoader.f107563h = this.A;
        finderPostPlayLoader.f107561f = java.lang.Long.valueOf(this.f110048z);
        finderPostPlayLoader.f107562g = 0;
        java.lang.String str = this.H;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        finderPostPlayLoader.f107565m = str;
        finderPostPlayLoader.f107569q = this.C;
        finderPostPlayLoader.f107568p = this.B;
        finderPostPlayLoader.f107570r = this.F;
        java.lang.String str2 = this.f110042J;
        kotlin.jvm.internal.o.g(str2, "<set-?>");
        finderPostPlayLoader.f107567o = str2;
        finderPostPlayLoader.setInitDone(new hd2.w(this));
        finderPostPlayLoader.f107571s = new hd2.x(this);
        yz5.l lVar = this.K;
        if (lVar != null) {
            finderPostPlayLoader.f107572t = lVar;
        }
        this.f110045w = finderPostPlayLoader;
        com.tencent.mm.ui.MMActivity y07 = y0();
        int i17 = this.B;
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = this.f110045w;
        if (baseFinderFeedLoader == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        this.f110043u = new com.tencent.mm.plugin.finder.feed.io(y07, 2, i17, baseFinderFeedLoader);
        hd2.y yVar = new hd2.y(this, view, y0(), this.B);
        this.f110044v = yVar;
        sc2.c8 u17 = yVar.u();
        if (u17 != null) {
            u17.f405818f = 4;
        }
        com.tencent.mm.plugin.finder.feed.ko koVar = this.f110044v;
        if (koVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.io ioVar = this.f110043u;
        if (ioVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        koVar.f106182o = ioVar;
        com.tencent.mm.plugin.finder.feed.io ioVar2 = this.f110043u;
        if (ioVar2 != null) {
            ioVar2.h();
        } else {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
    }

    public final void G0() {
        if (this.D <= 0) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.D;
        this.D = 0L;
        com.tencent.mm.ui.MMActivity y07 = y0();
        jz5.f0 f0Var = null;
        com.tencent.mm.plugin.finder.activity.postplay.ui.FinderPostPlayUI finderPostPlayUI = y07 instanceof com.tencent.mm.plugin.finder.activity.postplay.ui.FinderPostPlayUI ? (com.tencent.mm.plugin.finder.activity.postplay.ui.FinderPostPlayUI) y07 : null;
        int i17 = this.f110047y;
        if (finderPostPlayUI != null) {
            if (i17 == 1 || i17 == 2) {
                int i18 = i17 - 1;
                java.util.ArrayList arrayList = finderPostPlayUI.f101800u;
                arrayList.set(i18, java.lang.Long.valueOf(((java.lang.Number) arrayList.get(i18)).longValue() + currentTimeMillis));
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayFragment", "tabId is null or activity err");
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ed_;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.o1.c(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        super.o0();
        this.E = true;
        this.D = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        L.clear();
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        ((com.tencent.mm.plugin.finder.viewmodel.component.ut) pf5.z.f353948a.b(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class)).R6(true);
        G0();
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        ((com.tencent.mm.plugin.finder.viewmodel.component.ut) pf5.z.f353948a.b(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class)).R6(false);
        if (this.E) {
            this.D = java.lang.System.currentTimeMillis();
        }
        super.onResume();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        super.p0();
        this.E = false;
        G0();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0, reason: from getter */
    public int getF121515s() {
        return this.B;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public int x0() {
        return 3;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public com.tencent.mm.plugin.finder.feed.k0 z0() {
        com.tencent.mm.plugin.finder.feed.io ioVar = this.f110043u;
        if (ioVar != null) {
            return ioVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }
}
