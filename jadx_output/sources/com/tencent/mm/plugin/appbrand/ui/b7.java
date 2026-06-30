package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes.dex */
public class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f89576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f89577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.c7 f89578f;

    public b7(com.tencent.mm.plugin.appbrand.ui.c7 c7Var, android.view.View view, android.view.ViewGroup viewGroup) {
        this.f89578f = c7Var;
        this.f89576d = view;
        this.f89577e = viewGroup;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f89576d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandRuntimeRestartLoadingSplash$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/AppBrandRuntimeRestartLoadingSplash$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f89577e.removeView(this.f89576d);
        yz5.a aVar = this.f89578f.f89625d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
