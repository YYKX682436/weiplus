package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class ij implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderRecommendReasonTimelineUI f110157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader f110158b;

    public ij(com.tencent.mm.plugin.finder.feed.ui.FinderRecommendReasonTimelineUI finderRecommendReasonTimelineUI, com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader finderRecommendReasonLoader) {
        this.f110157a = finderRecommendReasonTimelineUI;
        this.f110158b = finderRecommendReasonLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.feed.ui.FinderRecommendReasonTimelineUI activity = this.f110157a;
        com.tencent.mm.plugin.finder.feed.ds dsVar = activity.f109521y;
        if (dsVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = dsVar.getRecyclerView().getLayoutManager();
        if (layoutManager != null) {
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager;
            int initPos = this.f110158b.getInitPos();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(initPos));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(finderLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderRecommendReasonTimelineUI$createFeedLoader$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            finderLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderRecommendReasonTimelineUI$createFeedLoader$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = (com.tencent.mm.plugin.finder.viewmodel.component.gg) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        com.tencent.mm.plugin.finder.feed.ds dsVar2 = activity.f109521y;
        if (dsVar2 != null) {
            ggVar.Q6(dsVar2.getRecyclerView());
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }
}
