package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532;

/* loaded from: classes8.dex */
public class c0 {
    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.w wVar) {
    }

    public final void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 a17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n();
        nVar.f68737x28d45f97 = str;
        boolean mo9951xb06685ab = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().mo9951xb06685ab(nVar, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "remove SilentDownload DB, appid:%s, ret:%b", str, java.lang.Boolean.valueOf(mo9951xb06685ab));
        if (!mo9951xb06685ab || (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.k.a(str)) == null) {
            return;
        }
        long j17 = a17.f178494d;
        if (j17 > 0) {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().t(j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "remove download task, appid:%s", a17.f178499i);
        }
    }

    public void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.v Zi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi();
        Zi.getClass();
        android.database.Cursor m145256x1d3f4980 = Zi.m145256x1d3f4980(java.lang.String.format("select * from %s where %s=1 limit 1", "GameSilentDownload", "isRunning"), new java.lang.String[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n nVar = null;
        if (m145256x1d3f4980 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "first cursor is null");
        } else if (m145256x1d3f4980.moveToFirst()) {
            nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n();
            nVar.mo9015xbf5d97fd(m145256x1d3f4980);
            m145256x1d3f4980.close();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "no running task");
            m145256x1d3f4980.close();
            android.database.Cursor m145256x1d3f49802 = Zi.m145256x1d3f4980(java.lang.String.format("select * from %s where %s < ? limit 1", "GameSilentDownload", "nextCheckTime"), java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
            if (m145256x1d3f49802 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "second cursor is null");
            } else if (m145256x1d3f49802.moveToFirst()) {
                nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n();
                nVar.mo9015xbf5d97fd(m145256x1d3f49802);
                m145256x1d3f49802.close();
            } else {
                m145256x1d3f49802.close();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "no record");
            }
        }
        if (nVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "gamelog.download, push_download, checkDownload task check is empty, return");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "gamelog.download, push_download, task:[appid:%s] in DB to check download", nVar.f68737x28d45f97);
        if (nVar.f68742x876650f1 <= com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "task expire time, appId:%s", nVar.f68737x28d45f97);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.u.d(nVar.f68737x28d45f97);
            jj0.a.a().b(15, nVar.f68737x28d45f97, "task_has_expired", 0L);
            a(nVar.f68737x28d45f97);
            b(false);
            return;
        }
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "NetType is not WIFI");
            jj0.a.a().b(12, nVar.f68737x28d45f97, "not_wifi", 0L);
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().b1(nVar.f68737x28d45f97);
        gm0.j1.i();
        if (!gm0.j1.u().l()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "sdcard isnt available");
            jj0.a.a().b(12, nVar.f68737x28d45f97, "sdcard_not_available", 0L);
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().P0(nVar.f68737x28d45f97);
        if (nVar.f68755x22618426 > 0) {
            vz.u1 u1Var = (vz.u1) i95.n0.c(vz.u1.class);
            long j17 = nVar.f68755x22618426;
            ((uz.t1) u1Var).getClass();
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.u0.a(j17)) {
                vz.u1 u1Var2 = (vz.u1) i95.n0.c(vz.u1.class);
                long j18 = nVar.f68755x22618426;
                ((uz.t1) u1Var2).getClass();
                if (!com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.u0.c(j18)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "sdcard dont have enough space");
                    jj0.a.a().b(12, nVar.f68737x28d45f97, "space_not_enough", 0L);
                    return;
                }
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().W0(nVar.f68737x28d45f97);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "fromBattery：%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().z0(nVar.f68737x28d45f97);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.a a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.b.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "battery isCharging:%b  percent:%f", java.lang.Boolean.valueOf(a17.f221975a), java.lang.Float.valueOf(a17.f221976b));
            if (!a17.f221975a && a17.f221976b < 0.2d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "battery is low");
                jj0.a.a().b(12, nVar.f68737x28d45f97, "battery_is_low", 0L);
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().z0(nVar.f68737x28d45f97);
        }
        p95.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.z(this, nVar));
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.v Zi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi();
        Zi.getClass();
        android.database.Cursor m145256x1d3f4980 = Zi.m145256x1d3f4980(java.lang.String.format("select * from %s", "GameSilentDownload"), new java.lang.String[0]);
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n> arrayList = null;
        if (m145256x1d3f4980 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "cursor is null");
        } else if (m145256x1d3f4980.moveToFirst()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            do {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n();
                nVar.mo9015xbf5d97fd(m145256x1d3f4980);
                arrayList2.add(nVar);
            } while (m145256x1d3f4980.moveToNext());
            m145256x1d3f4980.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfoList size:%s", java.lang.Integer.valueOf(arrayList2.size()));
            arrayList = arrayList2;
        } else {
            m145256x1d3f4980.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfoList no record");
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
            return;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n nVar2 : arrayList) {
            if (nVar2 != null) {
                if (nVar2.f68742x876650f1 <= com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "pauseDownload, task expire time, appId:%s", nVar2.f68737x28d45f97);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.u.d(nVar2.f68737x28d45f97);
                    a(nVar2.f68737x28d45f97);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.k.a(nVar2.f68737x28d45f97);
                    if (a17 != null) {
                        long j17 = a17.f178494d;
                        if (j17 > 0 && a17.f178496f == 1) {
                            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().f178665g = true;
                            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "pauseDownload, appid:%s, ret:%b", a17.f178499i, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().o(j17)));
                        }
                    }
                }
            }
        }
    }
}
