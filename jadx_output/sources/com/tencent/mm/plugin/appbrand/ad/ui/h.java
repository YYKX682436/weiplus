package com.tencent.mm.plugin.appbrand.ad.ui;

/* loaded from: classes7.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI f74948d;

    public h(com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI appBrandAdUI) {
        this.f74948d = appBrandAdUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.appbrand.page.v5 pageView;
        java.util.List<com.tencent.mm.plugin.appbrand.menu.u0> G1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ad/ui/AppBrandAdUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI appBrandAdUI = this.f74948d;
        com.tencent.mm.plugin.appbrand.o6 o6Var = appBrandAdUI.f74926e;
        if (o6Var != null && o6Var.x0() != null && appBrandAdUI.f74926e.x0().getPageView() != null && (G1 = (pageView = appBrandAdUI.f74926e.x0().getPageView()).G1()) != null && !G1.isEmpty() && (pageView instanceof com.tencent.mm.plugin.appbrand.page.n7)) {
            appBrandAdUI.f74928g = new com.tencent.mm.plugin.appbrand.ad.ui.e(appBrandAdUI, pageView, G1);
            com.tencent.mm.plugin.appbrand.ad.ui.e eVar = appBrandAdUI.f74928g;
            eVar.getClass();
            try {
                eVar.f74943b.v();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAdActionSheet", "show exception = %s", e17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ad/ui/AppBrandAdUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
