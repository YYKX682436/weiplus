package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f86807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f86808e;

    public k0(com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader, com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f86807d = n7Var;
        this.f86808e = o6Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f86807d.V3();
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = this.f86807d.getRuntime().E0();
        k91.z5 z5Var = new k91.z5();
        z5Var.f305863a = E0.f305842e;
        z5Var.f305872j = 3;
        z5Var.f305873k = this.f86807d.a2() == null ? "" : this.f86807d.X1();
        z5Var.f305870h = E0.f305852r.f75399d;
        z5Var.f305869g = E0.f305852r.pkgVersion;
        com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.V6(this.f86807d.getF147807d(), this.f86808e.u0().f47278x, 12, "", false, z5Var.a(), null, com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate.a(this.f86807d.getF147807d()));
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
