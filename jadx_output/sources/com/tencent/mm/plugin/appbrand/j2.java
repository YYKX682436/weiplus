package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f78449d;

    public j2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f78449d = appBrandRuntime;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f78449d;
        com.tencent.mm.plugin.appbrand.hc hcVar = appBrandRuntime.f74796e;
        if (hcVar == null) {
            appBrandRuntime.d0();
        } else {
            hcVar.r(appBrandRuntime);
        }
    }
}
