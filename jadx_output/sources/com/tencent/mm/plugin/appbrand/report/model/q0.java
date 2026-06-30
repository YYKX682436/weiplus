package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes7.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f88070d;

    public q0(com.tencent.mm.plugin.appbrand.report.model.r0 r0Var, java.lang.Object[] objArr) {
        this.f88070d = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = this.f88070d;
        com.tencent.mm.plugin.appbrand.profile.c cVar = (com.tencent.mm.plugin.appbrand.profile.c) nd.f.d(com.tencent.mm.plugin.appbrand.profile.c.class, true);
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Report.kv_14992", "report get null kvReporter");
            return;
        }
        try {
            java.lang.String str = (java.lang.String) objArr[18];
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                int indexOf = str.indexOf(63);
                objArr[18] = indexOf < 0 ? "" : fp.s0.a(str.substring(indexOf + 1, str.length()));
            }
        } catch (java.lang.Exception unused) {
            objArr[18] = "";
        }
        ((ch1.d) cVar).c(14992, com.tencent.mm.plugin.appbrand.report.o2.a(objArr));
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return;
        }
        com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.d();
        com.tencent.mm.plugin.appbrand.report.d.f(false);
    }
}
