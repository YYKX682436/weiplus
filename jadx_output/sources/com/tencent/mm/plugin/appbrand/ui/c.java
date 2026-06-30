package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.g f89612d;

    public c(com.tencent.mm.plugin.appbrand.ui.g gVar) {
        this.f89612d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/AppBrandAdLoadingSplash$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i81.l0 l0Var = this.f89612d.f89720g;
        if (l0Var != null) {
            i81.b0 b0Var = (i81.b0) l0Var;
            b0Var.getClass();
            com.tencent.mm.plugin.appbrand.ad.jsapi.g gVar = new com.tencent.mm.plugin.appbrand.ad.jsapi.g();
            gVar.f74905i = "launch";
            gVar.f74906m = "close";
            gVar.x(b0Var.g());
            b0Var.c(true, "launch", 10, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandAdLoadingSplash$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
