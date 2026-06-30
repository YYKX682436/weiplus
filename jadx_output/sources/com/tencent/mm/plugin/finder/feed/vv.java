package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes.dex */
public final class vv implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.LayoutManager f110929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f110930e;

    public vv(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, yz5.a aVar) {
        this.f110929d = layoutManager;
        this.f110930e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) this.f110929d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(staggeredGridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineMachinePresenter$scrollToTop$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        staggeredGridLayoutManager.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelineMachinePresenter$scrollToTop$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        yz5.a aVar = this.f110930e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
