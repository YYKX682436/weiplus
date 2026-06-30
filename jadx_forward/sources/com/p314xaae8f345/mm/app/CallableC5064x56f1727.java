package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.a4$$z */
/* loaded from: classes12.dex */
public final /* synthetic */ class CallableC5064x56f1727 implements java.util.concurrent.Callable {
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        ob0.s3 h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b0.B.h(false, 5);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            sb6.append("totalMem:");
            sb6.append(h17.f425500x.totalMem / 1000);
            sb6.append(" ");
            sb6.append("VmSize:");
            sb6.append(h17.f425481e);
            sb6.append(" ");
            sb6.append("javaMaxMem:");
            sb6.append(h17.f425494r / 1000);
            sb6.append(" ");
            sb6.append("javaUsedMem:");
            sb6.append(h17.f425492p / 1000);
            sb6.append(" ");
            sb6.append("javaFreeMem:");
            sb6.append((h17.f425494r - h17.f425492p) / 1000);
            return sb6.toString();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MemoryInfo", "getAnrReportMemoryInfoString error : %s", th6.getMessage());
            return sb6.toString();
        }
    }
}
