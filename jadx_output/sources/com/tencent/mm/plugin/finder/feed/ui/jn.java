package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class jn implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI f110201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$TopicLoader f110202b;

    public jn(com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI finderTopicTimelineUI, com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$TopicLoader finderTopicTimelineUIContract$TopicLoader) {
        this.f110201a = finderTopicTimelineUI;
        this.f110202b = finderTopicTimelineUIContract$TopicLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI activity = this.f110201a;
        com.tencent.mm.plugin.finder.feed.v20 v20Var = activity.E;
        if (v20Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = v20Var.getRecyclerView().getLayoutManager();
        com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$TopicLoader finderTopicTimelineUIContract$TopicLoader = this.f110202b;
        if (layoutManager != null) {
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager;
            int initPos = finderTopicTimelineUIContract$TopicLoader.getInitPos();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(initPos));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(finderLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$initOnCreate$5$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            finderLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$initOnCreate$5$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderTopicTimelineUIContract$TopicLoader.getCache();
        com.tencent.mm.plugin.finder.feed.model.c cVar = cache != null ? cache.f108303d : null;
        if (cVar instanceof com.tencent.mm.plugin.finder.feed.g30) {
            com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$TopicLoader finderTopicTimelineUIContract$TopicLoader2 = activity.F;
            if (finderTopicTimelineUIContract$TopicLoader2 == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            finderTopicTimelineUIContract$TopicLoader2.f106163m = ((com.tencent.mm.plugin.finder.feed.g30) cVar).f106820a;
        }
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = (com.tencent.mm.plugin.finder.viewmodel.component.gg) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        com.tencent.mm.plugin.finder.feed.v20 v20Var2 = activity.E;
        if (v20Var2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        ggVar.Q6(v20Var2.getRecyclerView());
        if (!activity.T || finderTopicTimelineUIContract$TopicLoader.getCache() == null) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.v20 v20Var3 = activity.E;
        if (v20Var3 != null) {
            v20Var3.y();
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }
}
