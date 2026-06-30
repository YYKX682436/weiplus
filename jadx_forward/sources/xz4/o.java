package xz4;

/* loaded from: classes8.dex */
public class o implements java.lang.Runnable {
    public o(xz4.p pVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (xz4.q.class) {
            if (gm0.j1.a() && !gm0.m.r()) {
                int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                if (m40067xab9ed241 == xz4.q.f539829b) {
                    return;
                }
                xz4.q.f539829b = m40067xab9ed241;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgAutoDownloader", "onNetStateChange, netState = " + m40067xab9ed241);
                if (m40067xab9ed241 == 0) {
                    boolean a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.a();
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEPKG_CHECK_DOWNLOAD_TIME_LONG;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) c17.m(u3Var, 0L))).longValue()) > 1800;
                    if (!z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgAutoDownloader", "dont auto download in wifi, because from the last time is not enough for %s s", 1800L);
                    }
                    if (!a17 && z17) {
                        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3 c6276xb08681d3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3();
                        c6276xb08681d3.f136525g.f89502a = 0;
                        c6276xb08681d3.e();
                    }
                } else {
                    xz4.d.a().b();
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WepkgAutoDownloader", "acc has not ready");
        }
    }
}
