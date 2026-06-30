package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class x4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer f92375d;

    public x4(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer appBrandRuntimeContainer) {
        this.f92375d = appBrandRuntimeContainer;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime = this.f92375d.getActiveRuntime();
        if (activeRuntime != null) {
            activeRuntime.f0();
        }
    }
}
