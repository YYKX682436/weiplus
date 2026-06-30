package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes7.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f87942d;

    public f0(com.tencent.mm.plugin.appbrand.report.model.g0 g0Var, java.lang.Object[] objArr) {
        this.f87942d = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = this.f87942d;
        com.tencent.mm.plugin.appbrand.profile.c cVar = (com.tencent.mm.plugin.appbrand.profile.c) nd.f.d(com.tencent.mm.plugin.appbrand.profile.c.class, true);
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Report.kv_13536", "report get null kvReporter");
            return;
        }
        try {
            try {
                java.lang.String str = (java.lang.String) objArr[19];
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    objArr[19] = s91.a.a(str);
                }
                java.lang.String str2 = (java.lang.String) objArr[19];
                if ((str2 == null ? "" : str2).length() > 1024) {
                    objArr[19] = str2.substring(0, 1024);
                }
            } catch (java.lang.Exception unused) {
                objArr[19] = "";
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            }
            int[] iArr = {1, 11, 13};
            for (int i17 = 0; i17 < 3; i17++) {
                int i18 = iArr[i17];
                java.lang.String str3 = (java.lang.String) objArr[i18];
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if ((str3 == null ? "" : str3).length() > 1024) {
                    objArr[i18] = str3.substring(0, 1024);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Report.kv_13536", "report " + java.util.Arrays.deepToString(objArr));
            ((ch1.d) cVar).c(13536, com.tencent.mm.plugin.appbrand.report.o2.a(objArr));
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                return;
            }
            com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.d();
            com.tencent.mm.plugin.appbrand.report.d.f(false);
        } catch (java.lang.Throwable th6) {
            java.lang.String str4 = (java.lang.String) objArr[19];
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if ((str4 != null ? str4 : "").length() > 1024) {
                objArr[19] = str4.substring(0, 1024);
            }
            throw th6;
        }
    }
}
