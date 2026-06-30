package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes.dex */
public class e5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f86562d;

    public e5(com.tencent.mm.plugin.appbrand.page.d5 d5Var, android.view.View view) {
        this.f86562d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f86562d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/page/AppBrandPageContainerWC$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/page/AppBrandPageContainerWC$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f86562d;
        if (view2.getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) view2.getParent()).removeView(view2);
        }
    }
}
