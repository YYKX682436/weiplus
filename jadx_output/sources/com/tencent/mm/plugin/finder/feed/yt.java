package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class yt implements com.tencent.mm.plugin.finder.feed.et {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f111197d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader f111198e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ft f111199f;

    /* renamed from: g, reason: collision with root package name */
    public final ey2.t0 f111200g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f111201h;

    /* renamed from: i, reason: collision with root package name */
    public int f111202i;

    /* renamed from: m, reason: collision with root package name */
    public long f111203m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f111204n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f111205o;

    /* renamed from: p, reason: collision with root package name */
    public final so2.s f111206p;

    /* renamed from: q, reason: collision with root package name */
    public final ym5.q1 f111207q;

    public yt(com.tencent.mm.ui.MMActivity activity, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f111197d = activity;
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ey2.t0 t0Var = (ey2.t0) a17;
        this.f111200g = t0Var;
        this.f111201h = t0Var.R6(1000);
        this.f111203m = -1L;
        this.f111206p = new so2.s(null, 0, 0, null, 15, null);
        this.f111207q = new com.tencent.mm.plugin.finder.feed.xt(this);
    }

    public void c(long j17, boolean z17) {
        com.tencent.mm.view.RefreshLoadMoreLayout f17 = h().f();
        if (f17 != null) {
            f17.postDelayed(new com.tencent.mm.plugin.finder.feed.gt(f17, z17), j17);
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

    public final com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader g() {
        com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader finderLbsLoader = this.f111198e;
        if (finderLbsLoader != null) {
            return finderLbsLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.feed.ft h() {
        com.tencent.mm.plugin.finder.feed.ft ftVar = this.f111199f;
        if (ftVar != null) {
            return ftVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    public void i(boolean z17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = h().getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        int f17 = f(recyclerView);
        com.tencent.mars.xlog.Log.i("Finder.FinderTimelineLbsMixPresenter", "[onActionbarClick] position=" + f17 + " isDouble=" + z17);
        if (f17 <= 12) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter", "onActionbarClick", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter", "onActionbarClick", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter", "onActionbarClick", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter", "onActionbarClick", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
        }
        com.tencent.mm.ui.MMActivity context = this.f111197d;
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
        g().unregister(this.f111207q);
        ((ey2.t0) pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class)).T6(1000);
    }

    @Override // com.tencent.mm.plugin.finder.feed.et
    public void onLoadMore() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(g(), false, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.et
    public void onRefresh() {
        com.tencent.mm.plugin.finder.feed.qt qtVar = new com.tencent.mm.plugin.finder.feed.qt(this);
        com.tencent.mm.plugin.finder.feed.ut utVar = new com.tencent.mm.plugin.finder.feed.ut(this);
        com.tencent.mm.plugin.finder.feed.vt vtVar = new com.tencent.mm.plugin.finder.feed.vt(this);
        ey2.k0 k0Var = (ey2.k0) ((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class));
        if (!k0Var.N6()) {
            qtVar.invoke();
        } else if (c01.id.a() - k0Var.Q6() < 300000) {
            vtVar.invoke();
        } else {
            utVar.invoke();
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.et
    public void onRefreshEnd(ym5.s3 reason) {
        com.tencent.mm.view.RefreshLoadMoreLayout f17;
        com.tencent.mm.view.RefreshLoadMoreLayout f18;
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f111203m = c01.id.c();
        if (reason.f463523h <= 0 && (f18 = h().f()) != null) {
            f18.W(com.tencent.mm.plugin.finder.storage.t70.f127590a.Q1(), com.tencent.mm.plugin.finder.feed.wt.f111007d);
        }
        if (reason.f463521f) {
            com.tencent.mm.view.RefreshLoadMoreLayout f19 = h().f();
            boolean z17 = false;
            if (((f19 == null || f19.isHasBottomMore) ? false : true) && (f17 = h().f()) != null) {
                f17.setHasBottomMore(true);
            }
            com.tencent.mm.view.RefreshLoadMoreLayout f27 = h().f();
            if (f27 != null && !f27.getEnableLoadMore()) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mm.view.RefreshLoadMoreLayout f28 = h().f();
                if (f28 != null) {
                    f28.setEnableLoadMore(true);
                }
                com.tencent.mm.view.RefreshLoadMoreLayout f29 = h().f();
                if (f29 != null) {
                    android.view.View inflate = com.tencent.mm.ui.id.b(this.f111197d).inflate(com.tencent.mm.R.layout.f489227bs5, (android.view.ViewGroup) null);
                    kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                    f29.setLoadMoreFooter(inflate);
                }
            }
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.ht(reason, this));
    }

    @Override // com.tencent.mm.plugin.finder.feed.et
    public void y0(com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct struct, com.tencent.mm.plugin.finder.storage.o90 lbsItem, int i17) {
        kotlin.jvm.internal.o.g(struct, "struct");
        kotlin.jvm.internal.o.g(lbsItem, "lbsItem");
        com.tencent.mm.ui.MMActivity context = this.f111197d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        com.tencent.mm.plugin.finder.report.r0 a76 = nyVar != null ? nyVar.a7(-1) : null;
        if (a76 instanceof com.tencent.mm.plugin.finder.report.p5) {
            struct.f56993g = this.f111203m;
            com.tencent.mm.plugin.finder.report.p5 p5Var = (com.tencent.mm.plugin.finder.report.p5) a76;
            p5Var.getClass();
            p5Var.T0(struct);
            p5Var.S0(struct, lbsItem);
            if (i17 >= 0) {
                java.util.LinkedList linkedList = lbsItem.f127299b;
                if (i17 < linkedList.size()) {
                    struct.f57000n = i17;
                    java.lang.Object obj = linkedList.get(i17);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    p5Var.U0(struct, (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj);
                }
            }
            struct.k();
        }
    }
}
