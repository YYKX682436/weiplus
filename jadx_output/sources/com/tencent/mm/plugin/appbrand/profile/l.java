package com.tencent.mm.plugin.appbrand.profile;

/* loaded from: classes7.dex */
public final class l implements com.tencent.mm.plugin.appbrand.jsruntime.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.profile.o f87692d;

    public l(com.tencent.mm.plugin.appbrand.profile.o oVar) {
        this.f87692d = oVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.x
    public final void onDestroy() {
        com.tencent.mm.plugin.appbrand.profile.o oVar = this.f87692d;
        if (oVar.f87702n) {
            com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni appBrandCommonBindingJni = oVar.f87697f;
            if (appBrandCommonBindingJni != null) {
                appBrandCommonBindingJni.stopInspector(0);
            }
            oVar.f87702n = false;
        }
    }
}
