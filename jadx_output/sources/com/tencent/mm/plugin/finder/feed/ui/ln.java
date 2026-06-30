package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class ln implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI f110283d;

    public ln(com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI finderTopicTimelineUI) {
        this.f110283d = finderTopicTimelineUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int y17;
        com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI finderTopicTimelineUI = this.f110283d;
        com.tencent.mm.plugin.finder.feed.v20 v20Var = finderTopicTimelineUI.E;
        if (v20Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        if (!(v20Var.getRecyclerView().getLayoutManager() instanceof androidx.recyclerview.widget.LinearLayoutManager) || ((androidx.recyclerview.widget.LinearLayoutManager) r1).y() - 1 < 0) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.v20 v20Var2 = finderTopicTimelineUI.E;
        if (v20Var2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = v20Var2.getRecyclerView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(y17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$initOnCreate$5$2$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$initOnCreate$5$2$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
