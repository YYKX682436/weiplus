package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class m9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f89868d;

    public m9(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f89868d = appBrandRuntime;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/AppBrandUILoadingSplashWeakNetReloadButtonContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f89868d;
        if (appBrandRuntime == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandUILoadingSplashWeakNetReloadButtonContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (appBrandRuntime instanceof ze.n) {
            ((ze.n) appBrandRuntime).z1(null, wg1.b.f445715h.h());
        } else {
            appBrandRuntime.z1(null, "");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandUILoadingSplashWeakNetReloadButtonContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
