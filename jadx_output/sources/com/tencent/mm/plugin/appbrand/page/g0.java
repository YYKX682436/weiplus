package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.h0 f86629d;

    public g0(com.tencent.mm.plugin.appbrand.page.h0 h0Var) {
        this.f86629d = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$15$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.page.h0 h0Var = this.f86629d;
        h0Var.f86649e.invoke();
        com.tencent.mm.plugin.appbrand.report.v0.k(h0Var.f86650f, 2, 4, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$15$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
