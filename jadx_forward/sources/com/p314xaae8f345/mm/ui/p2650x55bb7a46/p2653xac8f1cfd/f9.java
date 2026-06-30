package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class f9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st0.e f280568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g9 f280569e;

    public f9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g9 g9Var, st0.e eVar) {
        this.f280569e = g9Var;
        this.f280568d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "pre sync");
        st0.e eVar = this.f280568d;
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.z9) eVar).b1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "before sync");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            boolean d17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.z9) eVar).d1();
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "syncNotifyRecord finish, ret: %b, cost: %d", java.lang.Boolean.valueOf(d17), java.lang.Long.valueOf(elapsedRealtime2));
            this.f280569e.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.C(1584L, 0L, elapsedRealtime2);
            g0Var.C(1584L, 1L, 1L);
            long j17 = elapsedRealtime2 / 1000;
            int[] iArr = {5, 10, 20, 30, 40, 50, 60, 90, 180, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3, 600};
            if (j17 < 600) {
                int i18 = 0;
                while (true) {
                    if (i18 >= 11) {
                        i17 = 21;
                        break;
                    } else {
                        if (j17 < iArr[i18]) {
                            i17 = i18 + 21;
                            break;
                        }
                        i18++;
                    }
                }
            } else {
                i17 = 32;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1584L, i17, 1L);
        }
    }
}
