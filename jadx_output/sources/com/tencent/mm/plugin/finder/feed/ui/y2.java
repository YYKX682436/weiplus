package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class y2 implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFollowTimelineUI f110750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f110751b;

    public y2(com.tencent.mm.plugin.finder.feed.ui.FinderFollowTimelineUI finderFollowTimelineUI, com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader) {
        this.f110750a = finderFollowTimelineUI;
        this.f110751b = finderTimelineFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.feed.cb cbVar = this.f110750a.f109252y;
        if (cbVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = cbVar.getRecyclerView().getLayoutManager();
        if (layoutManager != null) {
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager;
            int initPos = this.f110751b.getInitPos();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(initPos));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(finderLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFollowTimelineUI$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            finderLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderFollowTimelineUI$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
