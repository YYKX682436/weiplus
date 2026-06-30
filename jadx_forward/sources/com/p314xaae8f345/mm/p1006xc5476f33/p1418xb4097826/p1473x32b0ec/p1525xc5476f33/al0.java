package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class al0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f193437d;

    public al0(android.view.View view) {
        this.f193437d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f193437d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRActionTipsLazyPlugin$autoHideTipTask$2$1$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRActionTipsLazyPlugin$autoHideTipTask$2$1$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
