package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.o1 f86778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f86779e;

    public j0(com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader, com.tencent.mm.plugin.appbrand.page.o1 o1Var, com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f86778d = o1Var;
        this.f86779e = n7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.page.o1 o1Var = this.f86778d;
        o1Var.getClass();
        new com.tencent.mm.plugin.appbrand.page.i1(o1Var, this.f86779e).run();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
