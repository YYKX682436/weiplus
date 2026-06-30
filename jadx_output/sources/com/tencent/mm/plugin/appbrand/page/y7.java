package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class y7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f87290d;

    public y7(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f87290d = n7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f87290d;
        n7Var.Y3(n7Var.G1(), null, null, false);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
