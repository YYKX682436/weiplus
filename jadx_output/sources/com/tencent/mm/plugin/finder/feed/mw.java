package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes.dex */
public final class mw implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f108531d;

    public mw(androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        this.f108531d = linearLayoutManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f108531d;
        if (linearLayoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$checkAutoFlingToRefresh$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$checkAutoFlingToRefresh$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
