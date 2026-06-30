package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.s04 f86419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader f86421f;

    public b0(com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader, r45.s04 s04Var, java.lang.String str) {
        this.f86421f = appBrandMenuHeader;
        this.f86419d = s04Var;
        this.f86420e = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.s04 s04Var = this.f86419d;
        java.lang.String str = s04Var.f385366h;
        java.lang.String str2 = s04Var.f385364f;
        java.lang.String str3 = s04Var.f385365g;
        l01.o0 o0Var = com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader.G;
        this.f86421f.b(str, str2, str3);
        com.tencent.mm.plugin.appbrand.report.v0.k(this.f86420e, 2, 3, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
