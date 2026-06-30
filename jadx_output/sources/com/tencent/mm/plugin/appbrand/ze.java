package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class ze implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f92456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wg1.b f92457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f92458f;

    public ze(com.tencent.mm.plugin.appbrand.o6 o6Var, wg1.b bVar, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        this.f92456d = o6Var;
        this.f92457e = bVar;
        this.f92458f = appBrandInitConfigWC;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeRestartHelper", "performRestart OnUiThread appId[%s]", this.f92456d.f74803n);
        try {
            android.graphics.Bitmap a17 = com.tencent.mm.plugin.appbrand.ye.a(this.f92456d);
            com.tencent.mm.plugin.appbrand.o6 o6Var = this.f92456d;
            java.lang.ThreadLocal threadLocal = com.tencent.mm.plugin.appbrand.ui.s5.f90201a;
            if (o6Var != null && a17 != null && !a17.isRecycled()) {
                com.tencent.mm.plugin.appbrand.ui.s5.f90202b.put(o6Var, a17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RuntimeRestartHelper", "performRestart  takeSnapshot appId[%s], e[%s]", this.f92456d.f74803n, e17);
        }
        java.util.Objects.requireNonNull(this.f92457e);
        this.f92458f.f47269b2 = this.f92456d.l2();
        if (this.f92456d.u0() == null || u46.l.c(this.f92456d.u0().f47276v, this.f92458f.f47276v)) {
            this.f92458f.m();
        }
        this.f92458f.f47268a2 = new com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle(this.f92456d.u0().f77298k2.f88134d, this.f92457e.h());
        if (this.f92456d.u0().f77313z2 != null) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = this.f92458f;
            if (appBrandInitConfigWC.f77313z2 == null) {
                appBrandInitConfigWC.f77313z2 = this.f92456d.u0().f77313z2;
                this.f92456d.u0().f77313z2 = null;
            }
        }
        this.f92456d.z1(this.f92458f, this.f92457e.h());
    }
}
