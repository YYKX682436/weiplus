package com.tencent.mm.app;

/* loaded from: classes11.dex */
public class l2 implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.n2 f53491a;

    public l2(com.tencent.mm.app.n2 n2Var) {
        this.f53491a = n2Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
        if (ak0.o.f()) {
            if (((th6 instanceof java.lang.NoClassDefFoundError) || (th6 instanceof java.lang.VerifyError) || (th6 instanceof java.lang.IncompatibleClassChangeError) || (th6 instanceof java.lang.InternalError)) && this.f53491a.f53527c) {
                try {
                    android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("tinker_ensurance_info", 4);
                    synchronized (this.f53491a) {
                        if (!this.f53491a.f53526b) {
                            int i17 = sharedPreferences.getInt("tinker_crash_count", 0);
                            if (i17 > 3) {
                                java.lang.String str = lp0.a.f320249c + "_clean_patch_count";
                                sharedPreferences.edit().putInt(str, sharedPreferences.getInt(str, 0) + 1).putInt("tinker_crash_count", 0).commit();
                                ak0.n.a();
                                com.tencent.mars.xlog.Log.w("MicroMsg.TinkerEnsuranceOnFault", "[tomys] clean patch by ensurance logic!!");
                                com.tencent.mars.xlog.Log.appenderFlushSync();
                            } else {
                                sharedPreferences.edit().putInt("tinker_crash_count", i17 + 1).commit();
                            }
                        }
                    }
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TinkerEnsuranceOnFault", th7, "[-] Exception occurred.", new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.appenderFlushSync();
                }
            }
        }
    }
}
