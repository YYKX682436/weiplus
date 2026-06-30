package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09;

/* loaded from: classes7.dex */
public final class y implements hm0.q {
    @Override // hm0.q
    /* renamed from: onConfigurationChanged */
    public void mo43788x50e1c15d(android.content.res.Configuration configuration) {
    }

    @Override // hm0.q
    /* renamed from: onLowMemory */
    public void mo43789xb5d8ba56() {
    }

    @Override // hm0.q
    /* renamed from: onTerminate */
    public void mo43790x7784fb42() {
    }

    @Override // hm0.q
    /* renamed from: onTrimMemory */
    public void mo43791x29685b02(int i17) {
        if (i17 == 5 || i17 == 10 || i17 == 15) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.w wVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.x.f170682a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PreloadIntervalLimiter", "onTrimMemory level=" + i17 + ", process=" + bm5.f1.a());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
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
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = millis + java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("__appbrand__preload__interval__limiter__");
            M.getClass();
            M.putLong("hold_until_ms", currentTimeMillis);
        }
    }
}
