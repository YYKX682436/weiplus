package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class h8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f86672d;

    public h8(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f86672d = n7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f86672d;
        com.tencent.mm.plugin.appbrand.report.v0.e(n7Var.getAppId(), n7Var.X1(), 22, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
