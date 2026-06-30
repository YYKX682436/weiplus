package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532;

/* loaded from: classes8.dex */
public class q implements java.lang.Runnable {
    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.r rVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.s.class) {
            if (gm0.j1.a() && !gm0.m.r()) {
                int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                if (m40067xab9ed241 == com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.s.f221992f) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.s.f221992f = m40067xab9ed241;
                if (m40067xab9ed241 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadListener", "netStateChange, netState = %s, checkDownload", java.lang.Integer.valueOf(m40067xab9ed241));
                    m43.c.b().a("game_silent_download", new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.x(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.b0.f221979a, false));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadListener", "netStateChange, netState = %s, pauseDownload", java.lang.Integer.valueOf(m40067xab9ed241));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.b0.f221979a.c();
                }
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().u();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameSilentDownloadListener", "acc has not ready");
        }
    }
}
