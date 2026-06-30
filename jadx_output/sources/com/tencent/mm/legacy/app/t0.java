package com.tencent.mm.legacy.app;

/* loaded from: classes4.dex */
public class t0 implements java.lang.Runnable {
    public t0(com.tencent.mm.legacy.app.u0 u0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            long j17 = com.tencent.mm.sdk.platformtools.o4.M("SnsMMKV").getLong("SnsMMKVCleanDbCount", -1L);
            if (j17 < 0) {
                j17 = com.tencent.mm.plugin.sns.model.l4.Fj().b2();
                com.tencent.mm.sdk.platformtools.o4.M("SnsMMKV").B("SnsMMKVCleanDbCount", j17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WeChatSplashStartup", "cleanSnsTablesByTimeLimit snsDbCount:%s", java.lang.Long.valueOf(j17));
        } catch (java.lang.Exception unused) {
        }
    }
}
