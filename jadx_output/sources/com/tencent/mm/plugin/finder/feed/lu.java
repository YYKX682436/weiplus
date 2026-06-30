package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class lu implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f107327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.zu f107328b;

    public lu(com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader, com.tencent.mm.plugin.finder.feed.zu zuVar) {
        this.f107327a = finderTimelineFeedLoader;
        this.f107328b = zuVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.f107327a;
        java.lang.String f123427d = finderTimelineFeedLoader.getF123427d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initData] canTimelineRefresh=");
        com.tencent.mm.plugin.finder.feed.zu zuVar = this.f107328b;
        sb6.append(zuVar.f111295g);
        sb6.append(", incrementCount=");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(f123427d, sb6.toString());
        if (zuVar.f111295g) {
            zuVar.c(0L, false);
            com.tencent.mm.view.RefreshLoadMoreLayout f17 = zuVar.g().f();
            if (f17 != null) {
                f17.post(com.tencent.mm.plugin.finder.feed.iu.f107052d);
            }
        } else {
            ey2.o0 N6 = zuVar.f111294f.N6(2);
            int i18 = N6.f257445e;
            int i19 = N6.f257446f;
            com.tencent.mars.xlog.Log.i(finderTimelineFeedLoader.getF123427d(), "[initData] canTimelineRefresh " + zuVar.f111295g + " lastPos=" + i18 + " fromTopPixel=" + i19);
            androidx.recyclerview.widget.RecyclerView recyclerView = zuVar.g().getRecyclerView();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            zuVar.f111296h = i19;
            if (layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) {
                androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i19));
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(staggeredGridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsPresenter$feedLoader$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                staggeredGridLayoutManager.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsPresenter$feedLoader$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                androidx.recyclerview.widget.RecyclerView recyclerView2 = zuVar.g().getRecyclerView();
                if (recyclerView2 != null) {
                    recyclerView2.post(new com.tencent.mm.plugin.finder.feed.ju(layoutManager, i18, i19));
                }
            }
        }
        com.tencent.mm.view.RefreshLoadMoreLayout f18 = zuVar.g().f();
        if (f18 != null) {
            f18.post(com.tencent.mm.plugin.finder.feed.ku.f107253d);
        }
    }
}
