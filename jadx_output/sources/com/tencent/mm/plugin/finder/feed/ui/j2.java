package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class j2 implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI f110171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader f110172b;

    public j2(com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI finderFeedRelatedTimelineUI, com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader) {
        this.f110171a = finderFeedRelatedTimelineUI;
        this.f110172b = finderFeedRelTimelineLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.feed.o9 o9Var = this.f110171a.f109241z;
        if (o9Var == null) {
            kotlin.jvm.internal.o.o("mViewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = o9Var.getRecyclerView().getLayoutManager();
        if (layoutManager != null) {
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager;
            int initPos = this.f110172b.getInitPos();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(initPos));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(finderLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$initOnCreate$1$2", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            finderLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$initOnCreate$1$2", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
