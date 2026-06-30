package com.p314xaae8f345.mm.p959x883644fd;

/* loaded from: classes8.dex */
public class g0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        long j17;
        synchronized (com.p314xaae8f345.mm.p959x883644fd.i0.class) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetTypeReporter", "run scene:%d foreground:%b lastGpsTime:%d", 1005, java.lang.Boolean.valueOf(z65.c.f551988a), java.lang.Long.valueOf(com.p314xaae8f345.mm.p959x883644fd.i0.f153052i));
            try {
                j17 = com.p314xaae8f345.mm.p959x883644fd.i0.f153052i;
            } catch (java.lang.Throwable th6) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "run :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
            }
            if (j17 <= 0) {
                if (z65.c.f551988a) {
                    com.p314xaae8f345.mm.p959x883644fd.i0.c(1005, 0.0f, 0.0f, 0, 0L);
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetTypeReporter", "run is not foreground give up %d ", 1005);
                    return;
                }
            }
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
            int i17 = com.p314xaae8f345.mm.p959x883644fd.i0.f153056m;
            float f17 = com.p314xaae8f345.mm.p959x883644fd.i0.f153053j;
            float f18 = com.p314xaae8f345.mm.p959x883644fd.i0.f153054k;
            int i18 = com.p314xaae8f345.mm.p959x883644fd.i0.f153055l;
            com.p314xaae8f345.mm.p959x883644fd.i0.f153052i = 0L;
            com.p314xaae8f345.mm.p959x883644fd.i0.f153053j = 0.0f;
            com.p314xaae8f345.mm.p959x883644fd.i0.f153054k = 0.0f;
            com.p314xaae8f345.mm.p959x883644fd.i0.f153055l = 0;
            com.p314xaae8f345.mm.p959x883644fd.i0.f153056m = 0;
            com.p314xaae8f345.mm.p959x883644fd.i0.c(i17, f18, f17, i18, currentTimeMillis);
        }
    }
}
