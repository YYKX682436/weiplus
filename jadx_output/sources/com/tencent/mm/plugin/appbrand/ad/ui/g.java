package com.tencent.mm.plugin.appbrand.ad.ui;

/* loaded from: classes7.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI f74947d;

    public g(com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI appBrandAdUI) {
        this.f74947d = appBrandAdUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ad/ui/AppBrandAdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f74947d.f74926e != null) {
            com.tencent.mm.plugin.appbrand.ad.jsapi.g gVar = new com.tencent.mm.plugin.appbrand.ad.jsapi.g();
            gVar.f74905i = "menu";
            gVar.f74906m = "close";
            gVar.x(this.f74947d.f74926e.C0());
            com.tencent.mm.plugin.appbrand.x0.g(this.f74947d.f74926e.f74803n, com.tencent.mm.plugin.appbrand.w0.CLOSE);
            this.f74947d.f74926e.S();
            com.tencent.mm.plugin.appbrand.ad.jsapi.i iVar = new com.tencent.mm.plugin.appbrand.ad.jsapi.i();
            iVar.f74910i = "menu";
            iVar.x(this.f74947d.f74926e.C0());
        }
        this.f74947d.finish();
        ((com.tencent.mm.plugin.appbrand.ui.u8) ((com.tencent.mm.plugin.appbrand.ui.dd) nd.f.a(com.tencent.mm.plugin.appbrand.ui.dd.class))).j(this.f74947d, null);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ad/ui/AppBrandAdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
