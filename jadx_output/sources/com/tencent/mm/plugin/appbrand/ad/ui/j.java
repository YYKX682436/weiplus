package com.tencent.mm.plugin.appbrand.ad.ui;

/* loaded from: classes7.dex */
public class j implements com.tencent.mm.plugin.appbrand.pc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI f74950a;

    public j(com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI appBrandAdUI) {
        this.f74950a = appBrandAdUI;
    }

    @Override // com.tencent.mm.plugin.appbrand.pc
    public void a(com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, jz5.l lVar, java.lang.String str) {
        if (c0Var == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.ad.jsapi.n nVar = new com.tencent.mm.plugin.appbrand.ad.jsapi.n();
        nVar.f74919i = "menu";
        com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI appBrandAdUI = this.f74950a;
        nVar.x(appBrandAdUI.f74926e.C0(), appBrandAdUI, c0Var);
    }
}
