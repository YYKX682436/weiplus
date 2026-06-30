package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class a5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f74892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer f74893e;

    public a5(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer appBrandRuntimeContainer, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f74893e = appBrandRuntimeContainer;
        this.f74892d = appBrandRuntime;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer appBrandRuntimeContainer = this.f74893e;
        nf.o.a(appBrandRuntimeContainer.f87645d);
        appBrandRuntimeContainer.T(this.f74892d);
    }
}
