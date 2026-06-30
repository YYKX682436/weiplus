package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class ne implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f86065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f86066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.oe f86067f;

    public ne(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, com.tencent.mm.plugin.appbrand.oe oeVar) {
        this.f86065d = appBrandInitConfigWC;
        this.f86066e = appBrandStatObject;
        this.f86067f = oeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = this.f86065d;
        appBrandInitConfigWC.f77309v2 = true;
        appBrandInitConfigWC.S1 = false;
        appBrandInitConfigWC.f47269b2 = this.f86066e;
        appBrandInitConfigWC.m();
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC2 = this.f86065d;
        java.lang.String instanceId = this.f86067f.f86245a.u0().f77298k2.f88134d;
        kotlin.jvm.internal.o.f(instanceId, "instanceId");
        wg1.b bVar = wg1.b.f445712e;
        appBrandInitConfigWC2.f47268a2 = new com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle(instanceId, bVar.h());
        this.f86067f.f86245a.z1(this.f86065d, bVar.h());
    }
}
