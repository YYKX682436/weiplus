package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public class d0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.vfs.r6[] G;
        java.lang.String c17 = com.tencent.mm.plugin.appbrand.keylogger.f0.c();
        if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DefaultKeyStepLogger", "doCleanJob getKeyStepRootDir null");
        } else {
            long e17 = com.tencent.mm.plugin.appbrand.keylogger.f0.e(com.tencent.mm.plugin.appbrand.keylogger.f0.f84150a.format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - 604800000)));
            com.tencent.mars.xlog.Log.i("MicroMsg.DefaultKeyStepLogger", "doCleanJob rootDir:%s expiredDateTime:%d", c17, java.lang.Long.valueOf(e17));
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(c17);
            if (r6Var.y()) {
                com.tencent.mm.vfs.r6[] G2 = r6Var.G();
                if (G2 == null || G2.length == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.DefaultKeyStepLogger", "doCleanJob no dirs");
                } else {
                    for (int i17 = 0; i17 < G2.length; i17++) {
                        if (G2[i17].y()) {
                            long e18 = com.tencent.mm.plugin.appbrand.keylogger.f0.e(G2[i17].getName());
                            com.tencent.mars.xlog.Log.i("MicroMsg.DefaultKeyStepLogger", "dateTimeOfDir:%d", java.lang.Long.valueOf(e18));
                            if (e18 <= e17) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.DefaultKeyStepLogger", "doCleanJob expired dirPath:%s", G2[i17].u());
                                com.tencent.mm.vfs.r6 r6Var2 = G2[i17];
                                if (r6Var2 != null && r6Var2.m() && r6Var2.y() && (G = r6Var2.G()) != null) {
                                    for (com.tencent.mm.vfs.r6 r6Var3 : G) {
                                        r6Var3.l();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        com.tencent.mm.sdk.platformtools.x2.d().edit().putLong("MMTempKeyStepLogger-Last-Clean-Time", java.lang.System.currentTimeMillis()).commit();
    }
}
