package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.f0 f86551d;

    public e0(com.tencent.mm.plugin.appbrand.page.f0 f0Var) {
        this.f86551d = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$14$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.page.f0 f0Var = this.f86551d;
        com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader = f0Var.f86596f;
        r45.v9 v9Var = f0Var.f86594d.f390876g;
        java.lang.String str = v9Var.f387996f;
        java.lang.String str2 = v9Var.f387997g;
        java.lang.String str3 = v9Var.f387998h;
        l01.o0 o0Var = com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader.G;
        appBrandMenuHeader.b(str, str2, str3);
        com.tencent.mm.plugin.appbrand.report.v0.k(f0Var.f86595e, 2, 7, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$14$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
