package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes.dex */
public final class sy implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f109014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f109015e;

    public sy(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        this.f109014d = recyclerView;
        this.f109015e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f109014d;
        int i17 = this.f109015e + 1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$onRefreshEnd$6$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$onRefreshEnd$6$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
