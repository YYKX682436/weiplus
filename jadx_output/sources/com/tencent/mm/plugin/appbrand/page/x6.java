package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class x6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f87247d = true;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f87248e = new com.tencent.mm.plugin.appbrand.page.u6(this);

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f87249f = new com.tencent.mm.plugin.appbrand.page.v6(this);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f87250g;

    public x6(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f87250g = v5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandPageView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f87247d) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f87250g;
        v5Var.j(new com.tencent.mm.plugin.appbrand.page.w6(this), nf.o.a(v5Var.getContext()) ? 100 : 0);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
