package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes.dex */
public final class lv implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.LayoutManager f107329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f107330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f107331f;

    public lv(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17, int i18) {
        this.f107329d = layoutManager;
        this.f107330e = i17;
        this.f107331f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) this.f107329d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f107331f));
        arrayList.add(java.lang.Integer.valueOf(this.f107330e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(staggeredGridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineMachinePresenter$feedLoader$1$1$call$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        staggeredGridLayoutManager.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelineMachinePresenter$feedLoader$1$1$call$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }
}
