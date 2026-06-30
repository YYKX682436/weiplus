package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class hg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f110120d;

    public hg(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f110120d = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f110120d.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
        int w17 = ((com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager).w() - 1;
        if (w17 >= 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f110120d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(w17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback$smoothScrollToPrevPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback$smoothScrollToPrevPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }
}
