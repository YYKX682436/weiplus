package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class ja extends com.tencent.luggage.sdk.launching.h implements im5.a {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.AppBrandRuntime f84702e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f84703f;

    /* renamed from: g, reason: collision with root package name */
    public ph1.p f84704g;

    public ja(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.String str, ph1.p pVar, kotlin.jvm.internal.i iVar) {
        this.f84702e = appBrandRuntime;
        this.f84703f = str;
        this.f84704g = pVar;
        if (appBrandRuntime != null) {
            appBrandRuntime.keep(this);
        }
    }

    @Override // com.tencent.luggage.sdk.launching.h
    public void a(android.os.Parcelable parcelable) {
        com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$IPCCallResult modularizingPkgRetrieverContract$IPCCallResult = (com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$IPCCallResult) parcelable;
        if (modularizingPkgRetrieverContract$IPCCallResult == null) {
            return;
        }
        try {
            int i17 = modularizingPkgRetrieverContract$IPCCallResult.f84447d;
            if (i17 == 1) {
                ph1.p pVar = this.f84704g;
                if (pVar != null) {
                    com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress wxaPkgLoadProgress = modularizingPkgRetrieverContract$IPCCallResult.f84448e;
                    kotlin.jvm.internal.o.d(wxaPkgLoadProgress);
                    pVar.a(wxaPkgLoadProgress);
                    return;
                }
                return;
            }
            if (i17 != 2) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResult, appId:");
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f84702e;
            sb6.append(appBrandRuntime != null ? appBrandRuntime.f74803n : null);
            sb6.append(", module:");
            sb6.append(this.f84703f);
            sb6.append(", succeed:");
            sb6.append(modularizingPkgRetrieverContract$IPCCallResult.f84450g);
            com.tencent.mars.xlog.Log.i("MicroMsg.ModularizingPkgRetrieverContract.IPCCallback", sb6.toString());
            if (modularizingPkgRetrieverContract$IPCCallResult.f84450g) {
                ph1.p pVar2 = this.f84704g;
                if (pVar2 != null) {
                    java.util.List list = modularizingPkgRetrieverContract$IPCCallResult.f84449f;
                    kotlin.jvm.internal.o.d(list);
                    pVar2.b(true, list);
                }
            } else {
                ph1.p pVar3 = this.f84704g;
                if (pVar3 != null) {
                    pVar3.b(false, null);
                }
            }
            dead();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ModularizingPkgRetrieverContract.IPCCallback", "IPCCallTask.onCallback t=" + th6);
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.launching.ia(th6));
        }
    }

    @Override // im5.a
    public void dead() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f84702e;
        if (appBrandRuntime != null) {
            appBrandRuntime.n2(this);
        }
        this.f84702e = null;
        this.f84704g = null;
    }
}
