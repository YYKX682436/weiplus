package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532;

/* loaded from: classes8.dex */
public class s extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.r f221990d = null;

    /* renamed from: e, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.p f221991e = null;

    /* renamed from: f, reason: collision with root package name */
    public static int f221992f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.s2 f221993g = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.o();

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f221994h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f221995i;

    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f221994h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5582x48b224a2>(a0Var) { // from class: com.tencent.mm.plugin.game.model.silent_download.GameSilentDownloadListener$2
            {
                this.f39173x3fe91575 = 1248113810;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5582x48b224a2 c5582x48b224a2) {
                am.ye yeVar = c5582x48b224a2.f135904g;
                int i17 = yeVar.f89987a;
                if (i17 == 2) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_SILENT_DOWNLOAD_TIME_LONG;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) c17.m(u3Var, 0L))).longValue()) > 600) {
                        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
                        m43.c.b().a("game_silent_download", new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.x(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.b0.f221979a, false));
                    }
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().u();
                } else if (i17 == 3) {
                    java.lang.String str = yeVar.f89988b;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.v Zi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi();
                        Zi.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "deleteAllItem ret:%b", java.lang.Boolean.valueOf(Zi.m145253xb158737d("GameSilentDownload", java.lang.String.format("delete from %s", "GameSilentDownload"))));
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n();
                        nVar.f68737x28d45f97 = str;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().mo9951xb06685ab(nVar, new java.lang.String[0]);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadListener", "delete silent download, appid:%s", str);
                    }
                } else if (i17 == 4) {
                    java.lang.String str2 = yeVar.f89988b;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                        h02.a d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(str2);
                        if (d17 != null) {
                            long j17 = d17.f68408x32b20428;
                            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().t(j17);
                            vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
                            long j18 = d17.f68408x32b20428;
                            ((uz.p1) q1Var).getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.i(j18);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownload.GameDownloadHelper", "delete downloadInfo in DB. appId:%s", str2);
                        }
                    }
                }
                return false;
            }
        };
        f221995i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5581xc58ff72b>(a0Var) { // from class: com.tencent.mm.plugin.game.model.silent_download.GameSilentDownloadListener$3
            {
                this.f39173x3fe91575 = 1688812315;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5581xc58ff72b c5581xc58ff72b) {
                java.lang.String str = c5581xc58ff72b.f135903g.f89909a;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadListener", "GameSilentDownloadEvent, appid is null!");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.u.c(str, 7, 0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n();
                    nVar.f68737x28d45f97 = str;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadListener", "cancel silentDownloadTask, appid:%s, ret:%b", str, java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().mo9951xb06685ab(nVar, new java.lang.String[0])));
                }
                return false;
            }
        };
    }

    public s() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5581xc58ff72b) {
            f221995i.mo1xf5bc2045((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5581xc58ff72b) abstractC20979x809547d1);
            return false;
        }
        if (!(abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5582x48b224a2)) {
            return false;
        }
        f221994h.mo1xf5bc2045((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5582x48b224a2) abstractC20979x809547d1);
        return false;
    }
}
