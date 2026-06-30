package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1;

/* loaded from: classes8.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.s2 f270025a = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.b(this);

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f270026b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f270027c;

    public g() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f270026b = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5988x830151a7>(a0Var) { // from class: com.tencent.mm.plugin.wepkg.utils.WepkgListener$2
            {
                this.f39173x3fe91575 = -625487945;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5988x830151a7 c5988x830151a7) {
                boolean z17 = c5988x830151a7.f136283g.f88715a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgListener", "sendEntranceStateListener isInFindEntrance:%b", java.lang.Boolean.valueOf(z17));
                if (!z17) {
                    return false;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEPKG_ENTRANCE_TRIGGER_DOWNLOAD_TIME_LONG;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) c17.m(u3Var, 0L))).longValue()) <= 60) {
                    return false;
                }
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.g.a(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.g.this, 2);
                return false;
            }
        };
        this.f270027c = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3>(a0Var) { // from class: com.tencent.mm.plugin.wepkg.utils.WepkgListener$3
            {
                this.f39173x3fe91575 = -1170682909;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3 c6276xb08681d3) {
                wz4.e D0;
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda e17;
                boolean z17;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3 c6276xb08681d32 = c6276xb08681d3;
                boolean a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.a();
                am.t20 t20Var = c6276xb08681d32.f136525g;
                switch (t20Var.f89502a) {
                    case 0:
                        if (!a17) {
                            m43.c.b().a("wepkg_download_retry", new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.d(this));
                        }
                        return false;
                    case 1:
                        if (!a17) {
                            java.lang.String str = t20Var.f89503b;
                            int i17 = t20Var.f89506e;
                            int i18 = t20Var.f89507f;
                            java.util.HashSet hashSet = new java.util.HashSet();
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                                if (i18 == 0) {
                                    hashSet.add(str);
                                } else if (i18 == 1 && com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.d(str) != null) {
                                    hashSet.add(str);
                                }
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.f.b(hashSet, 1, i17, false);
                        }
                        return false;
                    case 2:
                        if (!a17) {
                            wz4.f L0 = wz4.f.L0();
                            java.lang.String str2 = c6276xb08681d32.f136525g.f89503b;
                            t20Var.f89504c = L0.f532336d && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (D0 = L0.D0(str2)) != null && D0.f67965xe96d84d8 && D0.f67984xc5b53450;
                        }
                        return false;
                    case 3:
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i.c();
                            synchronized (c17) {
                                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
                                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEPKG_EXPIRED_TIME_LONG;
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) c18.m(u3Var, 0L))).longValue()) > 86400) {
                                    gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.CleanWepkgMgr", "clean wepkg in one day");
                                    m43.c.b().a("wepkg_expired_clean", new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.d(c17));
                                }
                            }
                        }
                        return false;
                    case 4:
                        if (!a17 && (e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.e(t20Var.f89503b)) != null) {
                            am.t20 t20Var2 = c6276xb08681d32.f136525g;
                            int i19 = e17.f269926z;
                            t20Var2.f89505d = i19;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgListener", "total download count:%s", java.lang.Integer.valueOf(i19));
                        }
                        return false;
                    case 5:
                        if (!a17) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c19 = gm0.j1.u().c();
                            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEPKG_FRONT_TRIGGER_DOWNLOAD_TIME_LONG;
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) c19.m(u3Var2, 0L))).longValue()) > 60) {
                                gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
                                z17 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.g.a(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.g.this, 1);
                            } else {
                                z17 = false;
                            }
                            if (!z17) {
                                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c27 = gm0.j1.u().c();
                                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEPKG_CHECK_DOWNLOAD_TIME_LONG;
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) c27.m(u3Var3, 0L))).longValue()) > 1800) {
                                    gm0.j1.u().c().x(u3Var3, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
                                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3 c6276xb08681d33 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3();
                                    c6276xb08681d33.f136525g.f89502a = 0;
                                    c6276xb08681d33.e();
                                }
                            }
                        }
                        return false;
                    case 6:
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t20Var.f89503b)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i c28 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i.c();
                            c28.getClass();
                            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.d().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.e(c28, 7));
                            } else {
                                c28.g(null, 0, 7);
                            }
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i.c().e(c6276xb08681d32.f136525g.f89503b, 2, 7);
                        }
                        return false;
                    case 7:
                        ((h80.k) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0.class))).getClass();
                        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10771x8ab5e24d.a(null, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.f.class, null);
                        return false;
                    case 8:
                        int i27 = t20Var.f89508g;
                        java.util.List list = t20Var.f89509h;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
                            if (i27 == 0) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.f.a(list, 4);
                            } else if (i27 == 1) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.f.a(list, 3);
                            }
                        }
                        return false;
                    default:
                        return false;
                }
            }
        };
    }

    public static boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.g gVar, int i17) {
        java.util.HashSet hashSet;
        gVar.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.a()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgListener", "triggerDownload downloadTriggerType:%d", java.lang.Integer.valueOf(i17));
        wz4.f L0 = wz4.f.L0();
        if (L0.f532336d && i17 != -1) {
            java.util.HashSet hashSet2 = new java.util.HashSet();
            android.database.Cursor m145256x1d3f4980 = L0.m145256x1d3f4980(java.lang.String.format("select distinct %s from %s where %s=?", "pkgId", "WepkgVersion", "downloadTriggerType"), java.lang.String.valueOf(i17));
            if (m145256x1d3f4980 != null) {
                if (!m145256x1d3f4980.moveToFirst()) {
                    m145256x1d3f4980.close();
                }
                do {
                    java.lang.String string = m145256x1d3f4980.getString(0);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                        hashSet2.add(string);
                    }
                } while (m145256x1d3f4980.moveToNext());
                m145256x1d3f4980.close();
            }
            java.util.HashSet hashSet3 = new java.util.HashSet();
            android.database.Cursor m145256x1d3f49802 = L0.m145256x1d3f4980(java.lang.String.format("select distinct %s from %s where (%s=0 or %s=0) and %s=? and %s<?", "pkgId", "WepkgVersion", "bigPackageReady", "preloadFilesReady", "downloadTriggerType", "packageDownloadCount"), java.lang.String.valueOf(i17), "1");
            if (m145256x1d3f49802 != null) {
                if (!m145256x1d3f49802.moveToFirst()) {
                    m145256x1d3f49802.close();
                }
                do {
                    java.lang.String string2 = m145256x1d3f49802.getString(0);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                        hashSet3.add(string2);
                    }
                } while (m145256x1d3f49802.moveToNext());
                m145256x1d3f49802.close();
            }
            java.util.HashSet hashSet4 = new java.util.HashSet();
            android.database.Cursor m145256x1d3f49803 = L0.m145256x1d3f4980(java.lang.String.format("select distinct %s from %s where %s=0 and %s<?", "pkgId", "WepkgPreloadFiles", "completeDownload", "fileDownloadCount"), "1");
            if (m145256x1d3f49803 != null) {
                if (!m145256x1d3f49803.moveToFirst()) {
                    m145256x1d3f49803.close();
                }
                do {
                    java.lang.String string3 = m145256x1d3f49803.getString(0);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
                        hashSet4.add(string3);
                    }
                } while (m145256x1d3f49803.moveToNext());
                m145256x1d3f49803.close();
            }
            hashSet3.addAll(hashSet4);
            hashSet2.retainAll(hashSet3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "trigger Predownload size:%d, List:%s", java.lang.Integer.valueOf(hashSet2.size()), hashSet2.toString());
            hashSet = hashSet2;
        } else {
            hashSet = null;
        }
        if (hashSet == null || hashSet.size() == 0) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.d().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.e(gVar, new java.util.ArrayList(hashSet)));
        return true;
    }
}
