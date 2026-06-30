package com.p314xaae8f345.mm.app;

/* loaded from: classes11.dex */
public class l2 implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.n2 f135024a;

    public l2(com.p314xaae8f345.mm.app.n2 n2Var) {
        this.f135024a = n2Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
        if (ak0.o.f()) {
            if (((th6 instanceof java.lang.NoClassDefFoundError) || (th6 instanceof java.lang.VerifyError) || (th6 instanceof java.lang.IncompatibleClassChangeError) || (th6 instanceof java.lang.InternalError)) && this.f135024a.f135060c) {
                try {
                    android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_ensurance_info", 4);
                    synchronized (this.f135024a) {
                        if (!this.f135024a.f135059b) {
                            int i17 = sharedPreferences.getInt("tinker_crash_count", 0);
                            if (i17 > 3) {
                                java.lang.String str = lp0.a.f401782c + "_clean_patch_count";
                                sharedPreferences.edit().putInt(str, sharedPreferences.getInt(str, 0) + 1).putInt("tinker_crash_count", 0).commit();
                                ak0.n.a();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TinkerEnsuranceOnFault", "[tomys] clean patch by ensurance logic!!");
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40530x65a4a38();
                            } else {
                                sharedPreferences.edit().putInt("tinker_crash_count", i17 + 1).commit();
                            }
                        }
                    }
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TinkerEnsuranceOnFault", th7, "[-] Exception occurred.", new java.lang.Object[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40530x65a4a38();
                }
            }
        }
    }
}
