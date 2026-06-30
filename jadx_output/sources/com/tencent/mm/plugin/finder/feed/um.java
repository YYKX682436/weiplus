package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class um extends com.tencent.mm.plugin.finder.feed.k0 {

    /* renamed from: i, reason: collision with root package name */
    public final int f110823i;

    /* renamed from: m, reason: collision with root package name */
    public final ey2.t0 f110824m;

    /* renamed from: n, reason: collision with root package name */
    public ey2.o0 f110825n;

    /* renamed from: o, reason: collision with root package name */
    public final in5.w f110826o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f110827p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public um(com.tencent.mm.ui.MMActivity r8, int r9, int r10) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r8, r0)
            com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader r0 = new com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader
            pf5.u r1 = pf5.u.f353936a
            pf5.v r2 = r1.c(r8)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r3 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r2 = r2.a(r3)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r2
            r45.qt2 r2 = r2.W6(r10)
            r0.<init>(r2)
            r2 = 0
            r7.<init>(r8, r2, r9, r0)
            r7.f110823i = r10
            java.lang.Class<c61.l7> r8 = c61.l7.class
            pf5.v r8 = r1.e(r8)
            java.lang.Class<ey2.t0> r9 = ey2.t0.class
            androidx.lifecycle.c1 r8 = r8.a(r9)
            java.lang.String r9 = "get(...)"
            kotlin.jvm.internal.o.f(r8, r9)
            ey2.t0 r8 = (ey2.t0) r8
            r7.f110824m = r8
            so2.s r8 = new so2.s
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 15
            r6 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f110826o = r8
            java.util.concurrent.ConcurrentHashMap r8 = new java.util.concurrent.ConcurrentHashMap
            r8.<init>()
            r7.f110827p = r8
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader r8 = r7.f107156e
            com.tencent.mm.plugin.finder.feed.nm r9 = new com.tencent.mm.plugin.finder.feed.nm
            r9.<init>(r7)
            r8.setInitDone(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.um.<init>(com.tencent.mm.ui.MMActivity, int, int):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public in5.s c() {
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
        com.tencent.mm.plugin.finder.storage.vj0 q17 = a1Var != null ? a1Var.q() : null;
        kotlin.jvm.internal.o.d(q17);
        return q17.b(new com.tencent.mm.plugin.finder.feed.pm(this));
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void g() {
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
        if (a1Var != null) {
            a1Var.r(this.f107156e.getDataListJustForAdapter());
        }
        y("initViewCallback");
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void h() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void i() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f107156e, false, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x004d, code lost:
    
        if (r0 == null) goto L6;
     */
    @Override // com.tencent.mm.plugin.finder.feed.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(com.tencent.mm.plugin.finder.feed.a1 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.o.g(r4, r0)
            super.m(r4)
            ey2.t0 r4 = r3.f110824m
            int r0 = r3.f110823i
            ey2.o0 r4 = r4.N6(r0)
            r3.f110825n = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "onAttach tabType="
            r4.<init>(r1)
            r4.append(r0)
            java.lang.String r0 = " tabCache="
            r4.append(r0)
            ey2.o0 r0 = r3.f110825n
            if (r0 == 0) goto L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "pos="
            r1.<init>(r2)
            int r2 = r0.f257445e
            r1.append(r2)
            java.lang.String r2 = " topPx="
            r1.append(r2)
            int r2 = r0.f257446f
            r1.append(r2)
            java.lang.String r2 = " dataSize="
            r1.append(r2)
            java.util.List r0 = r0.f257443c
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            if (r0 != 0) goto L51
        L4f:
            java.lang.String r0 = "null"
        L51:
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "FinderNativeDramaGridUIContract.Presenter"
            com.tencent.mars.xlog.Log.i(r0, r4)
            r4 = 1
            r0 = 0
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader r1 = r3.f107156e
            r2 = 0
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(r1, r2, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.um.m(com.tencent.mm.plugin.finder.feed.a1):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0, fs2.a
    public void onDetach() {
        super.onDetach();
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f107156e;
        com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader nativeDramaGridLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader ? (com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader) baseFeedLoader : null;
        if (nativeDramaGridLoader != null) {
            nativeDramaGridLoader.f106165d.f250738g = 0;
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void onRefreshEnd(ym5.s3 reason) {
        com.tencent.mm.plugin.finder.feed.a1 a1Var;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.i("FinderNativeDramaGridUIContract.Presenter", "[onRefreshEnd] reason=" + reason);
        if (reason.f463523h <= 0 && (a1Var = this.f107157f) != null && (refreshLoadMoreLayout = a1Var.f106180m) != null) {
            refreshLoadMoreLayout.W(com.tencent.mm.plugin.finder.storage.t70.f127590a.Q1(), com.tencent.mm.plugin.finder.feed.sm.f108998d);
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.qm(reason, this));
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.rm(this, reason, true));
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        int i17 = this.f110823i;
        com.tencent.mm.ui.MMActivity activity = this.f107155d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.report.v1.o(v1Var, i17, false, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), false, 0L, false, 24, null);
        y("onRefreshEnd");
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void p(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.qm(reason, this));
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.rm(this, reason, false));
        com.tencent.mm.plugin.finder.report.v1.o(com.tencent.mm.plugin.finder.report.v1.f125393a, this.f110823i, false, null, false, 0L, false, 28, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void v() {
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
        androidx.recyclerview.widget.RecyclerView recyclerView = a1Var != null ? a1Var.getRecyclerView() : null;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if ((layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) layoutManager : null) == null) {
            return;
        }
        pm0.v.K(null, new com.tencent.mm.plugin.finder.feed.tm(this));
    }

    public final void y(java.lang.String str) {
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_TWO_FLOW_PRELOAD_NUM_INT_SYNC, 0);
        if (r17 > 0) {
            com.tencent.mars.xlog.Log.i("FinderNativeDramaGridUIContract.Presenter", "checkPreloadThreshold: source=" + str + ", set customPreloadThreshold=" + r17);
            com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
            sc2.c8 u17 = a1Var != null ? a1Var.u() : null;
            if (u17 == null) {
                return;
            }
            u17.f405818f = r17;
        }
    }
}
