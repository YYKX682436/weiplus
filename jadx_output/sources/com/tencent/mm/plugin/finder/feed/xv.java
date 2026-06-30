package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class xv implements com.tencent.mm.plugin.finder.feed.iv {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader f111105d;

    /* renamed from: e, reason: collision with root package name */
    public final ey2.t0 f111106e;

    /* renamed from: f, reason: collision with root package name */
    public final ey2.k2 f111107f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f111108g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.jv f111109h;

    /* renamed from: i, reason: collision with root package name */
    public int f111110i;

    /* renamed from: m, reason: collision with root package name */
    public final so2.u f111111m;

    /* renamed from: n, reason: collision with root package name */
    public r45.lw0 f111112n;

    /* renamed from: o, reason: collision with root package name */
    public r45.r03 f111113o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f111114p;

    /* renamed from: q, reason: collision with root package name */
    public final ym5.q1 f111115q;

    /* renamed from: r, reason: collision with root package name */
    public final so2.v f111116r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f111117s;

    /* renamed from: t, reason: collision with root package name */
    public final so2.t f111118t;

    public xv(com.tencent.mm.ui.MMActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.feed.model.internal.l0 l0Var = com.tencent.mm.plugin.finder.feed.model.internal.m0.f108015e;
        int i17 = l0Var.a(4).f108034d;
        pf5.u uVar = pf5.u.f353936a;
        this.f111105d = new com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader(0L, "", 4, null, i17, false, null, null, null, null, 0, null, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.c(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), 0.0f, 0.0f, 28648, null);
        androidx.lifecycle.c1 a17 = uVar.e(c61.l7.class).a(ey2.t0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ey2.t0 t0Var = (ey2.t0) a17;
        this.f111106e = t0Var;
        androidx.lifecycle.c1 a18 = uVar.e(c61.l7.class).a(ey2.k2.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        this.f111107f = (ey2.k2) a18;
        boolean R6 = t0Var.R6(4);
        this.f111108g = R6;
        this.f111111m = new so2.u();
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = new com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader(l0Var.a(4), !R6 ? 1 : 0, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.c(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), null, null, 24, null);
        finderTimelineFeedLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.mv(finderTimelineFeedLoader, this));
        this.f111114p = finderTimelineFeedLoader;
        this.f111115q = new com.tencent.mm.plugin.finder.feed.wv(this);
        this.f111116r = new so2.v(new r45.xn5());
        this.f111118t = new so2.t();
    }

    public final com.tencent.mm.plugin.finder.feed.jv c() {
        com.tencent.mm.plugin.finder.feed.jv jvVar = this.f111109h;
        if (jvVar != null) {
            return jvVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    public final void f() {
        if (this.f111112n != null) {
            r45.xn5 xn5Var = new r45.xn5();
            xn5Var.set(0, new java.util.LinkedList());
            r45.lw0 lw0Var = this.f111112n;
            kotlin.jvm.internal.o.d(lw0Var);
            java.util.LinkedList<r45.kw0> list = lw0Var.getList(0);
            kotlin.jvm.internal.o.f(list, "getCategoryInfo(...)");
            for (r45.kw0 kw0Var : list) {
                r45.r03 r03Var = new r45.r03();
                r03Var.set(0, kw0Var.getString(0));
                xn5Var.getList(0).add(r03Var);
            }
            so2.v vVar = this.f111116r;
            vVar.getClass();
            vVar.f410643d = xn5Var;
            in5.n0.j0(((com.tencent.mm.plugin.finder.feed.cw) c()).g(), vVar.hashCode(), false, 2, null);
            com.tencent.mm.plugin.finder.feed.cw cwVar = (com.tencent.mm.plugin.finder.feed.cw) c();
            com.tencent.mm.plugin.finder.view.FinderTagView.f131494w.a();
            android.view.View findViewById = cwVar.f106507f.findViewById(com.tencent.mm.R.id.egh);
            if (findViewById != null) {
                android.view.View view = ((com.tencent.mm.plugin.finder.feed.cw) c()).f106507f;
                kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) view).removeView(findViewById);
            }
            in5.n0.S(((com.tencent.mm.plugin.finder.feed.cw) c()).g(), vVar, false, 2, null);
        }
    }

    public final void g(yz5.a aVar) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = ((com.tencent.mm.plugin.finder.feed.cw) c()).getRecyclerView().getLayoutManager();
        if (layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(staggeredGridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineMachinePresenter", "scrollToTop", "(Lkotlin/jvm/functions/Function0;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            staggeredGridLayoutManager.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelineMachinePresenter", "scrollToTop", "(Lkotlin/jvm/functions/Function0;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            ((com.tencent.mm.plugin.finder.feed.cw) c()).getRecyclerView().post(new com.tencent.mm.plugin.finder.feed.vv(layoutManager, aVar));
        }
    }

    @Override // fs2.a
    public void onDetach() {
        this.f111114p.unregister(((com.tencent.mm.plugin.finder.feed.cw) c()).j());
        com.tencent.mm.sdk.event.IListener iListener = this.f111117s;
        if (iListener != null) {
            iListener.dead();
        }
    }
}
