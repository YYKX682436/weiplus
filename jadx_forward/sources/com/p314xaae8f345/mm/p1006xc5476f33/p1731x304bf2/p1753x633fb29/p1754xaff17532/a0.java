package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532;

/* loaded from: classes8.dex */
public class a0 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.c0 f221978e;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.c0 c0Var, java.lang.String str) {
        this.f221978e = c0Var;
        this.f221977d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        d02.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.c0 c0Var;
        n33.b bVar;
        int i19;
        java.lang.String str2 = this.f221977d;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameSilentDownloader", "Check Error, errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
            g02.b.d(str2, 18L, 1L);
            return 0;
        }
        n33.b bVar2 = (n33.b) oVar.f152244b.f152233a;
        if (bVar2 == null) {
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "gamelog.download, query quota, ret op:%d", java.lang.Integer.valueOf(bVar2.f416014d));
        int i27 = bVar2.f416014d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.c0 c0Var2 = this.f221978e;
        if (i27 != 1) {
            if (i27 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "delay, nextInterval:%d", java.lang.Long.valueOf(bVar2.f416015e));
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.v Zi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi();
                long i110 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + bVar2.f416015e;
                Zi.getClass();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || i110 < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "updateNextCheckTime: appid is null");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadStorage", "updateNextCheckTime ret:%b", java.lang.Boolean.valueOf(Zi.m145253xb158737d("GameSilentDownload", java.lang.String.format("update %s set %s=%s where %s='%s'", "GameSilentDownload", "nextCheckTime", java.lang.String.valueOf(i110), "appId", str2))));
                }
                long j17 = bVar2.f416015e + 5;
                c0Var2.getClass();
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.w(c0Var2, j17), j17 * 1000);
            } else if (i27 != 3) {
                ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
                g02.b.d(str2, 19L, 1L);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.u.a(str2, 5, 0);
                jj0.a.a().b(15, this.f221977d, "server_cancel", 0L);
                c0Var2.a(str2);
                c0Var2.b(false);
            }
            return 0;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().D0(str2);
        d02.g gVar = bVar2.f416016f;
        if (gVar == null || (cVar = gVar.f306846d) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f306809d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameSilentDownloader", "downloadInfo is null");
            ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
            g02.b.d(str2, 20L, 1L);
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.n y07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().y0(str2);
        if (y07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "local SilentDownloadTask is deleted");
            return 0;
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j18 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str2, false, false);
        if (j18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "local appInfo is null, appid:%s", str2);
            return 0;
        }
        long j19 = bVar2.f416016f.f306846d.f306814i;
        long j27 = r53.f.j(j18.f67386xa1e9e82c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "serverVersionCode: %d, localVersionCode:%d", java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27));
        if (j19 <= 0 || j19 <= j27) {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            ((kt.c) i0Var).getClass();
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.q(context, j18)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "gamelog.download, push_download, app is installed, appid = %s", str2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.u.a(y07.f68737x28d45f97, 4, 0);
                jj0.a.a().b(15, j18.f67370x28d45f97, "app_has_installed", 0L);
                c0Var2.a(y07.f68737x28d45f97);
                c0Var2.b(false);
                return 0;
            }
            c0Var = c0Var2;
            bVar = bVar2;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "force update, serverVersionCode(%d) > localVersionCode(%d)", java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27));
            if (j27 == 0) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().J0(str2, 2);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().J0(str2, 1);
            }
            bVar = bVar2;
            c0Var = c0Var2;
        }
        java.lang.String str3 = bVar.f416016f.f306846d.f306809d;
        java.lang.String str4 = y07.f68741x238eb002;
        if (str4 == null) {
            str4 = "";
        }
        if (!str3.equals(str4)) {
            java.lang.String str5 = y07.f68741x238eb002;
            d02.c cVar2 = bVar.f416016f.f306846d;
            java.lang.String str6 = cVar2.f306809d;
            java.lang.Long valueOf = java.lang.Long.valueOf(cVar2.f306811f);
            d02.c cVar3 = bVar.f416016f.f306846d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "update downloadInfo. [oldDownloadUrl]:%s, [newDownloadUrl]:%s, [size]:%d, [md5]:%s, [SecondaryUrl]:%s", str5, str6, valueOf, cVar3.f306812g, cVar3.f306817o);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y07.f68741x238eb002)) {
                java.lang.String str7 = bVar.f416016f.f306846d.f306809d;
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 r17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().r(str7);
                if (r17 != null && r17.f178494d > 0 && (i19 = r17.f178496f) != 4 && i19 != 5) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "download task already exists");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().J0(str2, 3);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.u.a(str2, 6, 0);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().mo9951xb06685ab(y07, new java.lang.String[0]);
                    c0Var.b(false);
                    return 0;
                }
            }
            d02.c cVar4 = bVar.f416016f.f306846d;
            y07.f68741x238eb002 = cVar4.f306809d;
            y07.f68755x22618426 = cVar4.f306811f;
            y07.f68747x4b6e68b9 = cVar4.f306812g;
            y07.f68736x3c6faa0 = cVar4.f306817o;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar4.f306810e)) {
                y07.f68752xa1e9e82c = bVar.f416016f.f306846d.f306810e;
            }
            d02.g gVar2 = bVar.f416016f;
            y07.f68739x6d82dd16 = gVar2.f306850h;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(gVar2.f306846d.f306820r)) {
                d02.q qVar = new d02.q();
                qVar.f306889d = bVar.f416016f.f306846d.f306820r;
                try {
                    y07.f68754x671f82e6 = qVar.mo14344x5f01b1f6();
                } catch (java.io.IOException unused) {
                }
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().mo9952xce0038c9(y07, new java.lang.String[0]);
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            if (y07.f68755x22618426 > 0) {
                vz.u1 u1Var = (vz.u1) i95.n0.c(vz.u1.class);
                long j28 = y07.f68755x22618426;
                ((uz.t1) u1Var).getClass();
                if (!com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.u0.a(j28)) {
                    vz.u1 u1Var2 = (vz.u1) i95.n0.c(vz.u1.class);
                    long j29 = y07.f68755x22618426;
                    ((uz.t1) u1Var2).getClass();
                    if (!com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.u0.c(j29)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "sdcard dont have enough space");
                        jj0.a.a().b(12, this.f221977d, "space_not_enough", 0L);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "gamelog.download; push_download, quota check pass, start download");
            jj0.a.a().b(12, this.f221977d, "ok", 0L);
            int i28 = bVar.f416016f.f306846d.f306813h;
            c0Var.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y07.f68741x238eb002)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameSilentDownloader", "downloadInfo is null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "startDownload, appId:%s, url:%s, size:%d, md5:%s, packageName:%s, expireTime:%d, isFirst:%b, nextCheckTime:%d, isRunning:%b", y07.f68737x28d45f97, y07.f68741x238eb002, java.lang.Long.valueOf(y07.f68755x22618426), y07.f68747x4b6e68b9, y07.f68752xa1e9e82c, java.lang.Long.valueOf(y07.f68742x876650f1), java.lang.Boolean.valueOf(y07.f68744xef4a2d61), java.lang.Long.valueOf(y07.f68748xa5c53bd), java.lang.Boolean.valueOf(y07.f68745xd47e8830));
                if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.a.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameSilentDownloader", "startDownload isTeenMode and ignore");
                } else {
                    java.lang.String str8 = y07.f68741x238eb002;
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 r18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().r(str8);
                    if (r18 == null || r18.f178494d <= 0 || r18.f178496f != 2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "gamelog.download; push_download, all check pass, addDownloadTask, appid:%s", r18.f178499i);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(858L, 9L, 1L, false);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a();
                        aVar.f178770d = y07.f68737x28d45f97;
                        aVar.f178767a = y07.f68741x238eb002;
                        aVar.f178768b = y07.f68736x3c6faa0;
                        aVar.f178772f = y07.f68752xa1e9e82c;
                        aVar.f178773g = y07.f68755x22618426;
                        aVar.f178774h = y07.f68747x4b6e68b9;
                        if (y07.f68740x7a7faa5f == 3) {
                            aVar.f178777k = com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14497x624e96ad;
                            aVar.f178779m = true;
                        } else {
                            aVar.f178777k = com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14480xb9cc8658;
                            aVar.f178779m = false;
                            aVar.f178785s = true;
                        }
                        if (y07.f68754x671f82e6 != null) {
                            try {
                                d02.q qVar2 = new d02.q();
                                qVar2.mo11468x92b714fd(y07.f68754x671f82e6);
                                aVar.f178786t = qVar2.f306889d;
                            } catch (java.io.IOException unused2) {
                            }
                        }
                        lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        lt.i0 i0Var3 = (lt.i0) i95.n0.c(lt.i0.class);
                        java.lang.String str9 = y07.f68737x28d45f97;
                        ((kt.c) i0Var3).getClass();
                        aVar.f178769c = ((kt.c) i0Var2).Ui(context2, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str9));
                        aVar.f178775i = i28;
                        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().f178665g = true;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownload.GameDownloadHelper", "add downloadTask id:%d, downloaderType:%d", java.lang.Long.valueOf(((l02.q) ((m02.s) i95.n0.c(m02.s.class))).wi(aVar, null)), java.lang.Integer.valueOf(i28));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "gamelog.download; push_download, all check pass, resume downloadTask, appid:%s", r18.f178499i);
                        long j37 = r18.f178494d;
                        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().f178665g = true;
                        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().w(j37);
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloader", "cgi response back, but not in wifi");
        }
        return 0;
    }
}
