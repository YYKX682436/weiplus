package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes.dex */
public final class vw implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f192464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f192465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f192466f;

    public vw(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de, int i17, int i18) {
        this.f192464d = c1162x665295de;
        this.f192465e = i17;
        this.f192466f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.f192464d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(this.f192466f));
        arrayList.add(java.lang.Integer.valueOf(this.f192465e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$feedLoader$2$2$call$1$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$feedLoader$2$2$call$1$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }
}
