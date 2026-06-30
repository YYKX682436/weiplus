package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15013x60db486b f210577d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15013x60db486b activityC15013x60db486b) {
        this.f210577d = activityC15013x60db486b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f210577d.A;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderBlackListUI$delayLoadingRunnable$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderBlackListUI$delayLoadingRunnable$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
