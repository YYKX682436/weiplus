package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61;

/* loaded from: classes5.dex */
public abstract class p0 {
    public static void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.PostTaskCheckResUpdateScene", "doCheck %s", java.lang.Integer.valueOf(i17));
        gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.k0());
        if (gm0.j1.b().m()) {
            long c17 = c01.id.c();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_RES_DOWNLOADER_CHECK_RES_LAST_CHECK_TIME_LONG, java.lang.Long.valueOf(c17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.PostTaskCheckResUpdateScene", "refreshCheckTime %s %s", java.lang.Long.valueOf(c17), k35.m1.e(c17));
        }
    }

    public static void b() {
        if (gm0.j1.b().m()) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            v65.b bVar = new v65.b("MicroMsg.ResDownloader.PostTaskCheckResUpdateScene", c01.id.c(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_RES_DOWNLOADER_CHECK_RES_LAST_CHECK_TIME_LONG, null), 0L), ((java.lang.Math.abs(gm0.j1.b().h() % 2) * 3600) + 86400) * 1000);
            try {
                java.lang.String e17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().e(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20245xe98bc0cf());
                if (!e17.isEmpty()) {
                    java.lang.String[] split = e17.split(";");
                    if (split.length > 0) {
                        for (java.lang.String str : split) {
                            bVar.a(str);
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.PostTaskCheckResUpdateScene", "apply exptConfigStr %s", e17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResDownloader.PostTaskCheckResUpdateScene", th6, "run", new java.lang.Object[0]);
            }
            if (bVar.b()) {
                a(0);
            }
        }
    }
}
