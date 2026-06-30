package com.p314xaae8f345.mm.p815xbe0af3c9.app;

/* loaded from: classes4.dex */
public class t0 implements java.lang.Runnable {
    public t0(com.p314xaae8f345.mm.p815xbe0af3c9.app.u0 u0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("SnsMMKV").getLong("SnsMMKVCleanDbCount", -1L);
            if (j17 < 0) {
                j17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b2();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("SnsMMKV").B("SnsMMKVCleanDbCount", j17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatSplashStartup", "cleanSnsTablesByTimeLimit snsDbCount:%s", java.lang.Long.valueOf(j17));
        } catch (java.lang.Exception unused) {
        }
    }
}
