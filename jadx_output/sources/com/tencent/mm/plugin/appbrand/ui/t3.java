package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class t3 implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f90223a;

    public t3(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI) {
        this.f90223a = appBrandDebugUI;
    }

    @Override // db5.a1
    public final boolean onFinish(java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs().edit().putLong("AppBrandDebugUI.PAGE_CONTAINER_NAVIGATION_PUSH_TIMEOUT", com.tencent.mm.sdk.platformtools.t8.V(charSequence.toString(), com.tencent.mm.plugin.appbrand.ui.e4.d())).apply();
        int i17 = com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.E;
        com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI = this.f90223a;
        appBrandDebugUI.X6();
        ex5.g gVar = appBrandDebugUI.f220127z;
        if (gVar == null) {
            return true;
        }
        gVar.notifyDataSetChanged();
        return true;
    }
}
