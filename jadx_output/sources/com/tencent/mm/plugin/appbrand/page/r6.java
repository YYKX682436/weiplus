package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class r6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f87059d;

    public r6(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f87059d = v5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandPageView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f87059d;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) v5Var.C.get();
        if (!v5Var.u2() && appBrandRuntime != null) {
            com.tencent.mm.plugin.appbrand.page.i3 x07 = appBrandRuntime.x0();
            com.tencent.mm.plugin.appbrand.page.w2 w2Var = v5Var.W;
            x07.getClass();
            x07.c0(new com.tencent.mm.plugin.appbrand.page.l3(x07, w2Var, "scene_actionbar_back", null));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
