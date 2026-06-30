package com.tencent.mm.plugin.appbrand.task.preload;

/* loaded from: classes7.dex */
public final class y implements hm0.q {
    @Override // hm0.q
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // hm0.q
    public void onLowMemory() {
    }

    @Override // hm0.q
    public void onTerminate() {
    }

    @Override // hm0.q
    public void onTrimMemory(int i17) {
        if (i17 == 5 || i17 == 10 || i17 == 15) {
            com.tencent.mm.plugin.appbrand.task.preload.w wVar = com.tencent.mm.plugin.appbrand.task.preload.x.f89149a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreloadIntervalLimiter", "onTrimMemory level=" + i17 + ", process=" + bm5.f1.a());
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.B(915L, 21L);
            if (i17 == 5) {
                g0Var.B(915L, 24L);
            } else if (i17 == 10) {
                g0Var.B(915L, 25L);
            } else if (i17 == 15) {
                g0Var.B(915L, 26L);
            } else if (i17 == 40) {
                g0Var.B(915L, 27L);
            } else if (i17 == 60) {
                g0Var.B(915L, 28L);
            } else if (i17 == 80) {
                g0Var.B(915L, 29L);
            }
            long millis = java.util.concurrent.TimeUnit.MINUTES.toMillis(10L);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = millis + java.lang.System.currentTimeMillis();
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("__appbrand__preload__interval__limiter__");
            M.getClass();
            M.putLong("hold_until_ms", currentTimeMillis);
        }
    }
}
