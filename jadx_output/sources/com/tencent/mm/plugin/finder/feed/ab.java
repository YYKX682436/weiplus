package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes.dex */
public final class ab implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f106245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f106246e;

    public ab(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        this.f106245d = recyclerView;
        this.f106246e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f106245d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f106246e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFollowTimelineContract$Presenter$smoothScrollToNextPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/feed/FinderFollowTimelineContract$Presenter$smoothScrollToNextPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
