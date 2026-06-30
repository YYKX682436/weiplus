package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class s6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f87081d;

    public s6(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f87081d = v5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandPageView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f87081d;
        com.tencent.mm.plugin.appbrand.x0.g(v5Var.getAppId(), com.tencent.mm.plugin.appbrand.w0.CLOSE);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) v5Var.C.get();
        if (appBrandRuntime != null) {
            appBrandRuntime.S();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
