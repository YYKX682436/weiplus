package com.tencent.mm.legacy.app;

/* loaded from: classes11.dex */
public class f0 extends hm0.x {
    public f0(com.tencent.mm.legacy.app.WeChatSplashStartup weChatSplashStartup) {
    }

    @Override // hm0.t
    public void b() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            synchronized (wo.w0.f447854p) {
                int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigUseNewDeviceChangeDetect());
                if (c17 != 0) {
                    try {
                        if (c17 != 1) {
                            java.io.File file = wo.w0.f447853o;
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                        } else {
                            java.io.File file2 = wo.w0.f447853o;
                            if (file2.exists()) {
                                file2.delete();
                            }
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                }
            }
        }
    }
}
