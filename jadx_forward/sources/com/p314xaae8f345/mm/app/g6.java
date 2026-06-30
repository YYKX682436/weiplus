package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class g6 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.u6 f134965d;

    public g6(com.p314xaae8f345.mm.app.u6 u6Var) {
        this.f134965d = u6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.lang.String str = "[tomys] Fail to get ActivityManager, return empty for RunningAppProcessInfo list.";
        try {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) this.f134965d.f135361e.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            if (activityManager == null) {
                com.p314xaae8f345.mm.app.p5.c("MicroMsg.StartupCostReporter", "[tomys] Fail to get ActivityManager, return empty for RunningAppProcessInfo list.", new java.lang.Object[0]);
                str = java.util.Collections.emptyList();
            } else {
                ?? runningAppProcesses = activityManager.getRunningAppProcesses();
                str = runningAppProcesses != null ? runningAppProcesses : java.util.Collections.emptyList();
            }
            return str;
        } catch (java.lang.Throwable th6) {
            if (!(th6 instanceof java.lang.InterruptedException)) {
                com.p314xaae8f345.mm.app.p5.d("MicroMsg.StartupCostReporter", th6, str, new java.lang.Object[0]);
            }
            return java.util.Collections.emptyList();
        }
    }
}
