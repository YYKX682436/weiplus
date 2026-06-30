package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class zu implements com.tencent.mm.plugin.finder.feed.et {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f111292d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ft f111293e;

    /* renamed from: f, reason: collision with root package name */
    public final ey2.t0 f111294f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f111295g;

    /* renamed from: h, reason: collision with root package name */
    public int f111296h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f111297i;

    /* renamed from: m, reason: collision with root package name */
    public final ym5.q1 f111298m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f111299n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f111300o;

    /* renamed from: p, reason: collision with root package name */
    public final so2.s f111301p;

    /* renamed from: q, reason: collision with root package name */
    public final so2.t f111302q;

    public zu(com.tencent.mm.ui.MMActivity activity, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f111292d = activity;
        pf5.u uVar = pf5.u.f353936a;
        androidx.lifecycle.c1 a17 = uVar.e(c61.l7.class).a(ey2.t0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ey2.t0 t0Var = (ey2.t0) a17;
        this.f111294f = t0Var;
        boolean R6 = t0Var.R6(2);
        this.f111295g = R6;
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = new com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader(com.tencent.mm.plugin.finder.feed.model.internal.m0.f108015e.a(2), !R6 ? 1 : 0, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.c(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), null, null, 24, null);
        finderTimelineFeedLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.lu(finderTimelineFeedLoader, this));
        this.f111297i = finderTimelineFeedLoader;
        this.f111298m = new com.tencent.mm.plugin.finder.feed.yu(this);
        this.f111301p = new so2.s(null, 0, 0, null, 15, null);
        this.f111302q = new so2.t();
    }

    public void c(long j17, boolean z17) {
        com.tencent.mm.view.RefreshLoadMoreLayout f17 = g().f();
        if (f17 != null) {
            f17.postDelayed(new com.tencent.mm.plugin.finder.feed.gu(f17, z17), j17);
        }
    }

    public final int f(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) {
            int[] iArr = new int[2];
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager).u(iArr);
            return iArr[1];
        }
        if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            return ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w();
        }
        return 0;
    }

    public final com.tencent.mm.plugin.finder.feed.ft g() {
        com.tencent.mm.plugin.finder.feed.ft ftVar = this.f111293e;
        if (ftVar != null) {
            return ftVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    public void h(boolean z17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = g().getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        int f17 = f(recyclerView);
        com.tencent.mars.xlog.Log.i("Finder.TimelineLbsPresenter", "[onActionbarClick] position=" + f17 + " isDouble=" + z17);
        if (f17 <= 12) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsPresenter", "onActionbarClick", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsPresenter", "onActionbarClick", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsPresenter", "onActionbarClick", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsPresenter", "onActionbarClick", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
        }
        com.tencent.mm.ui.MMActivity context = this.f111292d;
        if (!z17) {
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            if (nyVar != null) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((com.tencent.mm.plugin.finder.report.o3) c17).aj(nyVar.V6(), 1, 0);
                return;
            }
            return;
        }
        if (f17 <= 12) {
            c(20L, false);
        } else {
            c(600L, false);
        }
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar2 != null) {
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ((com.tencent.mm.plugin.finder.report.o3) c18).aj(nyVar2.V6(), 5, 0);
        }
    }

    @Override // fs2.a
    public void onDetach() {
        this.f111297i.unregister(this.f111298m);
        ((ey2.t0) pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class)).T6(2);
    }

    @Override // com.tencent.mm.plugin.finder.feed.et
    public void onLoadMore() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f111297i, false, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.et
    public void onRefresh() {
        com.tencent.mm.plugin.finder.feed.ou ouVar = new com.tencent.mm.plugin.finder.feed.ou(this);
        com.tencent.mm.plugin.finder.feed.su suVar = new com.tencent.mm.plugin.finder.feed.su(this);
        com.tencent.mm.plugin.finder.feed.tu tuVar = new com.tencent.mm.plugin.finder.feed.tu(this);
        ey2.k0 k0Var = (ey2.k0) ((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class));
        if (!k0Var.N6()) {
            ouVar.invoke();
        } else if (c01.id.a() - k0Var.Q6() < 300000) {
            tuVar.invoke();
        } else {
            suVar.invoke();
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.et
    public void onRefreshEnd(ym5.s3 reason) {
        com.tencent.mm.view.RefreshLoadMoreLayout f17;
        kotlin.jvm.internal.o.g(reason, "reason");
        if (reason.f463523h <= 0 && (f17 = g().f()) != null) {
            f17.W(com.tencent.mm.plugin.finder.storage.t70.f127590a.Q1(), com.tencent.mm.plugin.finder.feed.uu.f110835d);
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.hu(reason, this));
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("finder_tl_nearby_tab");
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().q0("finder_tl_nearby_tab", "onRefreshEnd");
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.x1 x1Var = ml2.x1.f328201e;
        ml2.q1 q1Var = ml2.q1.f327812e;
        zy2.zb.Kh(zbVar, null, x1Var, "temp_10", ml2.y.f328242g, 0, 0L, 0, 112, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.et
    public void y0(com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct struct, com.tencent.mm.plugin.finder.storage.o90 lbsItem, int i17) {
        kotlin.jvm.internal.o.g(struct, "struct");
        kotlin.jvm.internal.o.g(lbsItem, "lbsItem");
    }
}
