package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes.dex */
public final class lv implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager f188862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f188863e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f188864f;

    public lv(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, int i17, int i18) {
        this.f188862d = layoutManager;
        this.f188863e = i17;
        this.f188864f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) this.f188862d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(this.f188864f));
        arrayList.add(java.lang.Integer.valueOf(this.f188863e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1164x587b7ff1, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineMachinePresenter$feedLoader$1$1$call$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        c1164x587b7ff1.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(c1164x587b7ff1, "com/tencent/mm/plugin/finder/feed/FinderTimelineMachinePresenter$feedLoader$1$1$call$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }
}
