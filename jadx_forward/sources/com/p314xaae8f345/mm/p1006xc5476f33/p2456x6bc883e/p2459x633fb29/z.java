package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29;

/* loaded from: classes8.dex */
public abstract class z {
    public static boolean a(com.p314xaae8f345.mm.vfs.r6 r6Var, java.util.Map map) {
        com.p314xaae8f345.mm.vfs.r6[] G;
        if (map == null) {
            map = new java.util.HashMap();
        }
        if (r6Var == null || !r6Var.y() || (G = r6Var.G()) == null || G.length == 0) {
            return false;
        }
        for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
            com.p314xaae8f345.mm.vfs.r6[] G2 = r6Var2.G();
            if (G2 != null && G2.length != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.p314xaae8f345.mm.vfs.r6 r6Var3 : G2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.y yVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.y(null);
                    yVar.f270012a = r6Var3.m82467xfb82e301();
                    java.lang.String str = r6Var3.o() + "/package";
                    if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                        yVar.f270013b = str;
                    }
                    com.p314xaae8f345.mm.vfs.r6 r6Var4 = new com.p314xaae8f345.mm.vfs.r6(r6Var3.o() + "/preload_files");
                    if (r6Var4.y()) {
                        com.p314xaae8f345.mm.vfs.r6[] G3 = r6Var4.G();
                        if (G3 == null || G3.length == 0) {
                            arrayList.add(yVar);
                        } else {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            for (com.p314xaae8f345.mm.vfs.r6 r6Var5 : G3) {
                                arrayList2.add(r6Var5.m82467xfb82e301());
                            }
                            yVar.f270014c = arrayList2;
                            arrayList.add(yVar);
                        }
                    } else {
                        arrayList.add(yVar);
                    }
                }
                map.put(r6Var2.m82467xfb82e301(), arrayList);
            }
        }
        return true;
    }

    public static void b(kh0.f fVar) {
        java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.l.c();
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(c17);
        if ((!r6Var.m() || !r6Var.y()) && fVar != null) {
            fVar.a(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072 c19540x47e34072 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072();
        c19540x47e34072.f269876h = 1001;
        c19540x47e34072.f269883r = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.u(c19540x47e34072, c17, r6Var, fVar);
        c19540x47e34072.d();
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgManager", "pkgid or pkgPath or md5 is null, pkg invalid");
            return null;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str3));
        if (!r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgManager", "readCacheWepkg, pkgPath:%s, file dont exist", str3);
            f(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("PkgModified", null, str, str2, 1L, 0L, null);
            return null;
        }
        if (r6Var.C() != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgManager", "readCacheWepkg, [server_pkgSize:%d] != [local_pkgSize:%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(r6Var.C()));
            r6Var.l();
            f(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("PkgModified", null, str, str2, 2L, 0L, null);
            return null;
        }
        if (r6Var.C() <= 5242880) {
            java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(r6Var.u());
            if (!str4.equalsIgnoreCase(p17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgManager", "readCacheBigPackage, [server_md5:%s] != [local_md5:%s]", str4, p17);
                r6Var.l();
                f(str);
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("PkgModified", null, str, str2, 3L, 0L, null);
                return null;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgManager", "readCacheBigPackage fileLength(%d) > checkSize(%d). dont check md5", java.lang.Long.valueOf(r6Var.C()), 5242880L);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgManager", "this is big package. localPath: %s", str3);
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o(r6Var);
        if (oVar.f269980b && oVar.f269983e != null) {
            return oVar;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i.c().g(str, 2, 4);
        return null;
    }

    public static java.util.Map d(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27> c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.c(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c17)) {
            return hashMap;
        }
        boolean z18 = false;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27 c19542xf3901c27 : c17) {
            if (c19542xf3901c27 != null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19542xf3901c27.f269898g)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgManager", "readCachePreloadFiles, pkgPath is null, isAtomic:%s", java.lang.Boolean.valueOf(z17));
                    if (z17) {
                        e(c19542xf3901c27.f269896e, c19542xf3901c27.f269899h);
                        z18 = true;
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.g(str, c19542xf3901c27.f269899h, "", false, null);
                    }
                } else {
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(c19542xf3901c27.f269898g);
                    if (r6Var.m()) {
                        long C = r6Var.C();
                        int i17 = c19542xf3901c27.f269903o;
                        if (C != i17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgManager", "readCachePreloadFiles, [server_pkgSize:%d] != [local_pkgSize:%d], isAtomic:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(r6Var.C()), java.lang.Boolean.valueOf(z17));
                            if (z17) {
                                e(c19542xf3901c27.f269896e, c19542xf3901c27.f269899h);
                                r6Var.l();
                                z18 = true;
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.g(str, c19542xf3901c27.f269899h, "", false, null);
                            }
                        } else {
                            hashMap.put(c19542xf3901c27.f269899h, c19542xf3901c27);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgManager", "readCachePreloadFiles, pkgPath:%s, file dont exist, isAtomic:%s", c19542xf3901c27.f269898g, java.lang.Boolean.valueOf(z17));
                        if (z17) {
                            e(c19542xf3901c27.f269896e, c19542xf3901c27.f269899h);
                            z18 = true;
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.g(str, c19542xf3901c27.f269899h, "", false, null);
                        }
                    }
                }
            }
        }
        if (z18) {
            return null;
        }
        return hashMap;
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.g(str, str2, "", false, new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.x(str, new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.w()));
    }

    public static void f(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.h(str, "", false, new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.v());
    }
}
