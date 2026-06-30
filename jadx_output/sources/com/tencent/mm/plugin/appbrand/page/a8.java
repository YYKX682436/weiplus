package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class a8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f86400d;

    public a8(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f86400d = n7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f86400d;
        com.tencent.mm.plugin.appbrand.x0.g(n7Var.getAppId(), com.tencent.mm.plugin.appbrand.w0.CLOSE);
        n7Var.O1.S();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
