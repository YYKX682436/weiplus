package com.tencent.mm.plugin.appbrand.ad.ui;

/* loaded from: classes7.dex */
public class i implements i81.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI f74949a;

    public i(com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI appBrandAdUI) {
        this.f74949a = appBrandAdUI;
    }

    @Override // i81.p
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI appBrandAdUI = this.f74949a;
        if (appBrandAdUI.f74926e == null || !"menu".equalsIgnoreCase(str)) {
            return;
        }
        com.tencent.mm.plugin.appbrand.ad.jsapi.k kVar = new com.tencent.mm.plugin.appbrand.ad.jsapi.k();
        kVar.f74914i = str;
        kVar.x(appBrandAdUI.f74926e.C0());
        com.tencent.mm.plugin.appbrand.ad.jsapi.i iVar = new com.tencent.mm.plugin.appbrand.ad.jsapi.i();
        iVar.f74910i = str;
        iVar.x(appBrandAdUI.f74926e.C0());
    }

    @Override // i81.p
    public void onDetach() {
    }
}
