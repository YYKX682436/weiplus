package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes.dex */
public final class aa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager f106242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f106243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f106244f;

    public aa(androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager, int i17, int i18) {
        this.f106242d = staggeredGridLayoutManager;
        this.f106243e = i17;
        this.f106244f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = this.f106242d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f106244f));
        arrayList.add(java.lang.Integer.valueOf(this.f106243e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(staggeredGridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$Presenter$2$1$call$1$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        staggeredGridLayoutManager.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$Presenter$2$1$call$1$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }
}
