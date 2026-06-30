package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public abstract class y1 {
    public static final void a(int i17, int i18, int i19, int i27, long j17, k91.z0 z0Var) {
        if (z0Var == null) {
            com.tencent.mars.xlog.Log.i("KVStoragePerformanceReport", "sysConfig is null");
            return;
        }
        if (!z0Var.f305854t) {
            com.tencent.mars.xlog.Log.i("KVStoragePerformanceReport", "performance report off");
            return;
        }
        com.tencent.mars.xlog.Log.i("KVStoragePerformanceReport", "report scheme=" + i17 + "  action=" + i18 + "  dataSize=" + i19 + "  count=" + i27 + "  cost=" + j17);
        ((ch1.d) ((com.tencent.mm.plugin.appbrand.profile.c) nd.f.d(com.tencent.mm.plugin.appbrand.profile.c.class, true))).c(16336, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(j17));
    }
}
