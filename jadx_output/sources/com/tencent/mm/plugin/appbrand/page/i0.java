package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86696f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86697g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader f86698h;

    public i0(com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f86698h = appBrandMenuHeader;
        this.f86694d = str;
        this.f86695e = str2;
        this.f86696f = str3;
        this.f86697g = str4;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l01.o0 o0Var = com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader.G;
        this.f86698h.b(this.f86694d, this.f86695e, this.f86696f);
        com.tencent.mm.plugin.appbrand.report.v0.k(this.f86697g, 2, 2, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
