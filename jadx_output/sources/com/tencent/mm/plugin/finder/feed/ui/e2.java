package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class e2 implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFeedListUI f109964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.g2 f109965b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderColumnFeedListLoader f109966c;

    public e2(com.tencent.mm.plugin.finder.feed.ui.FinderFeedListUI finderFeedListUI, com.tencent.mm.plugin.finder.feed.ui.g2 g2Var, com.tencent.mm.plugin.finder.feed.model.FinderColumnFeedListLoader finderColumnFeedListLoader) {
        this.f109964a = finderFeedListUI;
        this.f109965b = g2Var;
        this.f109966c = finderColumnFeedListLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.feed.ui.FinderFeedListUI activity = this.f109964a;
        com.tencent.mm.plugin.finder.feed.g9 g9Var = activity.f109233y;
        if (g9Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = g9Var.getRecyclerView();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager;
            int initPos = this.f109966c.getInitPos();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(initPos));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(finderLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedListUI$createFeedLoader$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            finderLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedListUI$createFeedLoader$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = (com.tencent.mm.plugin.finder.viewmodel.component.gg) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        com.tencent.mm.plugin.finder.feed.g9 g9Var2 = activity.f109233y;
        if (g9Var2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        ggVar.Q6(g9Var2.getRecyclerView());
        recyclerView.i(this.f109965b);
    }
}
