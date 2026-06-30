package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class kt implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader f107251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.yt f107252b;

    public kt(com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader finderLbsLoader, com.tencent.mm.plugin.finder.feed.yt ytVar) {
        this.f107251a = finderLbsLoader;
        this.f107252b = ytVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader finderLbsLoader = this.f107251a;
        java.lang.String f123427d = finderLbsLoader.getF123427d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initData] canTimelineRefresh=");
        com.tencent.mm.plugin.finder.feed.yt ytVar = this.f107252b;
        sb6.append(ytVar.f111201h);
        sb6.append(", incrementCount=");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(f123427d, sb6.toString());
        boolean z17 = ytVar.f111201h;
        if (z17) {
            ytVar.c(0L, false);
        } else {
            ey2.o0 N6 = ytVar.f111200g.N6(1000);
            int i18 = N6.f257445e;
            int i19 = N6.f257446f;
            com.tencent.mars.xlog.Log.i(finderLbsLoader.getF123427d(), "[initData] canTimelineRefresh " + z17 + " lastPos=" + i18 + " fromTopPixel=" + i19);
            androidx.recyclerview.widget.RecyclerView recyclerView = ytVar.h().getRecyclerView();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            ytVar.f111202i = i19;
            if (layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) {
                androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i19));
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(staggeredGridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                staggeredGridLayoutManager.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                androidx.recyclerview.widget.RecyclerView recyclerView2 = ytVar.h().getRecyclerView();
                if (recyclerView2 != null) {
                    recyclerView2.post(new com.tencent.mm.plugin.finder.feed.jt(layoutManager, i18, i19));
                }
            }
        }
        if (i17 <= 0) {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ht(z17 ? new ym5.s3(0) : null, ytVar));
        }
    }
}
