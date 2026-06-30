package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class v7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w7 f87176d;

    public v7(com.tencent.mm.plugin.appbrand.page.w7 w7Var) {
        this.f87176d = w7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$16$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "CustomRightButton click");
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f87176d.f87200a;
        com.tencent.mars.xlog.Log.i("OnCustomRightButtonClickEvent", "OnCustomRightButtonClickEvent dispatch");
        pi1.f fVar = new pi1.f();
        fVar.u(n7Var.v3());
        fVar.m();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$16$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
