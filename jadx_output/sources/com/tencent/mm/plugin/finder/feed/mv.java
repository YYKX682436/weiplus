package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class mv implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f108529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xv f108530b;

    public mv(com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader, com.tencent.mm.plugin.finder.feed.xv xvVar) {
        this.f108529a = finderTimelineFeedLoader;
        this.f108530b = xvVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.f108529a;
        java.lang.String f123427d = finderTimelineFeedLoader.getF123427d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initData] canTimelineRefresh=");
        com.tencent.mm.plugin.finder.feed.xv xvVar = this.f108530b;
        sb6.append(xvVar.f111108g);
        sb6.append(", incrementCount=");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(f123427d, sb6.toString());
        boolean z17 = xvVar.f111108g;
        if (z17) {
            boolean z18 = i17 <= 0;
            com.tencent.mm.view.RefreshLoadMoreLayout j17 = ((com.tencent.mm.plugin.finder.feed.cw) xvVar.c()).j();
            j17.postDelayed(new com.tencent.mm.plugin.finder.feed.kv(j17, z18), 0L);
            return;
        }
        ey2.o0 N6 = xvVar.f111106e.N6(4);
        int i18 = N6.f257445e;
        int i19 = N6.f257446f;
        xvVar.f111110i = i19;
        com.tencent.mars.xlog.Log.i(finderTimelineFeedLoader.getF123427d(), "[initData] canTimelineRefresh " + z17 + " lastPos=" + i18 + " fromTopPixel=" + i19);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = ((com.tencent.mm.plugin.finder.feed.cw) xvVar.c()).getRecyclerView().getLayoutManager();
        ey2.j2 j2Var = (ey2.j2) xvVar.f111107f.f257420d.get(4);
        if (j2Var == null) {
            j2Var = new ey2.j2(4);
        }
        xvVar.f111112n = j2Var.f257409b;
        xvVar.f();
        if (layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i19));
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(staggeredGridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineMachinePresenter$feedLoader$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            staggeredGridLayoutManager.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelineMachinePresenter$feedLoader$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            ((com.tencent.mm.plugin.finder.feed.cw) xvVar.c()).getRecyclerView().post(new com.tencent.mm.plugin.finder.feed.lv(layoutManager, i18, i19));
        }
    }
}
