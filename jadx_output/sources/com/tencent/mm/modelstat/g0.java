package com.tencent.mm.modelstat;

/* loaded from: classes8.dex */
public class g0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        long j17;
        synchronized (com.tencent.mm.modelstat.i0.class) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetTypeReporter", "run scene:%d foreground:%b lastGpsTime:%d", 1005, java.lang.Boolean.valueOf(z65.c.f470455a), java.lang.Long.valueOf(com.tencent.mm.modelstat.i0.f71519i));
            try {
                j17 = com.tencent.mm.modelstat.i0.f71519i;
            } catch (java.lang.Throwable th6) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "run :%s", com.tencent.mm.sdk.platformtools.z3.c(th6));
            }
            if (j17 <= 0) {
                if (z65.c.f470455a) {
                    com.tencent.mm.modelstat.i0.c(1005, 0.0f, 0.0f, 0, 0L);
                    return;
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.NetTypeReporter", "run is not foreground give up %d ", 1005);
                    return;
                }
            }
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
            int i17 = com.tencent.mm.modelstat.i0.f71523m;
            float f17 = com.tencent.mm.modelstat.i0.f71520j;
            float f18 = com.tencent.mm.modelstat.i0.f71521k;
            int i18 = com.tencent.mm.modelstat.i0.f71522l;
            com.tencent.mm.modelstat.i0.f71519i = 0L;
            com.tencent.mm.modelstat.i0.f71520j = 0.0f;
            com.tencent.mm.modelstat.i0.f71521k = 0.0f;
            com.tencent.mm.modelstat.i0.f71522l = 0;
            com.tencent.mm.modelstat.i0.f71523m = 0;
            com.tencent.mm.modelstat.i0.c(i17, f18, f17, i18, currentTimeMillis);
        }
    }
}
