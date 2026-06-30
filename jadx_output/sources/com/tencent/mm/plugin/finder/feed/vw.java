package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes.dex */
public final class vw implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f110931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f110932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f110933f;

    public vw(androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, int i17, int i18) {
        this.f110931d = linearLayoutManager;
        this.f110932e = i17;
        this.f110933f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f110931d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f110933f));
        arrayList.add(java.lang.Integer.valueOf(this.f110932e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$feedLoader$2$2$call$1$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$feedLoader$2$2$call$1$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }
}
