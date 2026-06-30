package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class a4$$z implements java.util.concurrent.Callable {
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        ob0.s3 h17 = com.tencent.mm.plugin.performance.watchdogs.b0.B.h(false, 5);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            sb6.append("totalMem:");
            sb6.append(h17.f343967x.totalMem / 1000);
            sb6.append(" ");
            sb6.append("VmSize:");
            sb6.append(h17.f343948e);
            sb6.append(" ");
            sb6.append("javaMaxMem:");
            sb6.append(h17.f343961r / 1000);
            sb6.append(" ");
            sb6.append("javaUsedMem:");
            sb6.append(h17.f343959p / 1000);
            sb6.append(" ");
            sb6.append("javaFreeMem:");
            sb6.append((h17.f343961r - h17.f343959p) / 1000);
            return sb6.toString();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MemoryInfo", "getAnrReportMemoryInfoString error : %s", th6.getMessage());
            return sb6.toString();
        }
    }
}
