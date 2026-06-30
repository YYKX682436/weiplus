package com.tencent.mm.plugin.appbrand.ad.ui;

/* loaded from: classes7.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI f74946d;

    public f(com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI appBrandAdUI) {
        this.f74946d = appBrandAdUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ad/ui/AppBrandAdUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI appBrandAdUI = this.f74946d;
        if (appBrandAdUI.f74926e != null) {
            com.tencent.mm.plugin.appbrand.ad.jsapi.g gVar = new com.tencent.mm.plugin.appbrand.ad.jsapi.g();
            gVar.f74905i = "menu";
            gVar.f74906m = "back";
            gVar.x(appBrandAdUI.f74926e.C0());
        }
        appBrandAdUI.finish();
        appBrandAdUI.overridePendingTransition(com.tencent.mm.ui.uc.f211080c, com.tencent.mm.ui.uc.f211081d);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ad/ui/AppBrandAdUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
