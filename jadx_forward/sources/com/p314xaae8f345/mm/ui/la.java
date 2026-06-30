package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public class la implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ga f290606d;

    public la(com.p314xaae8f345.mm.ui.ga gaVar) {
        this.f290606d = gaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f290606d.f290170c0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MMActivityController$14", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/MMActivityController$14", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
