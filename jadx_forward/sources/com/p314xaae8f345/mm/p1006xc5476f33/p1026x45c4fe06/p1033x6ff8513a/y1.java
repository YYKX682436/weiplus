package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public abstract class y1 {
    public static final void a(int i17, int i18, int i19, int i27, long j17, k91.z0 z0Var) {
        if (z0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KVStoragePerformanceReport", "sysConfig is null");
            return;
        }
        if (!z0Var.f387387t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KVStoragePerformanceReport", "performance report off");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KVStoragePerformanceReport", "report scheme=" + i17 + "  action=" + i18 + "  dataSize=" + i19 + "  count=" + i27 + "  cost=" + j17);
        ((ch1.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c.class, true))).c(16336, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(j17));
    }
}
