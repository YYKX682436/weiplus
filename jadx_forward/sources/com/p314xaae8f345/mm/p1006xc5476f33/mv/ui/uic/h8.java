package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes.dex */
public final class h8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f232727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f232728e;

    public h8(android.view.View view, int i17) {
        this.f232727d = view;
        this.f232728e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f232727d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(this.f232728e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord$Companion$simpleSettingMethod$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord$Companion$simpleSettingMethod$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
