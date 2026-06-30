package vz4;

/* loaded from: classes8.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f523277a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f523278b = true;

    /* renamed from: c, reason: collision with root package name */
    public static int f523279c = 0;

    public static int a(java.lang.String str) {
        if (!f523278b) {
            return 12;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WePkgLoader", "config wepkg disable");
            f523278b = false;
            return 12;
        }
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("we_pkg_sp", 4);
        if (sharedPreferences == null || !sharedPreferences.getBoolean("disable_we_pkg", false)) {
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WePkgLoader", "white screen, disable wepkg");
        f523278b = false;
        return 11;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s b(java.lang.String str, boolean z17) {
        boolean z18;
        if (com.p314xaae8f345.mm.p794xb0fa9b5e.d0.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b)) {
            z18 = true;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.a("", new vz4.q());
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("EnterWeb", str, kh0.i.a(str), null, 0L, 0L, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.d(10));
            z18 = false;
        }
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WePkgLoader", "wepkg service is dead, start");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(859, 36);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s(10, false, "");
        }
        int a17 = a(str);
        if (a17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WePkgLoader", "load enable false");
            return new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s(a17, false, "");
        }
        java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270034a;
        java.lang.String a18 = kh0.i.a(str);
        if (z17) {
            java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.d().m77784x795fa299(new vz4.r(a18));
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a18) ? new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s(9, false, "") : c(str);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s sVar;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda;
        java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270034a;
        java.lang.String a17 = kh0.i.a(str);
        java.util.HashMap hashMap = (java.util.HashMap) f523277a;
        if (hashMap.containsKey(a17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s sVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s) hashMap.get(a17);
            java.lang.String host = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? "" : android.net.Uri.parse(str).getHost();
            if (sVar2 != null && (c19543x781c5eda = sVar2.f269995d) != null && host.equalsIgnoreCase(c19543x781c5eda.f269915o)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda2 = sVar2.f269995d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WePkgLoader", "memory has pkgid:%s record, version:%s", c19543x781c5eda2.f269907d, c19543x781c5eda2.f269909f);
                return sVar2;
            }
        }
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.z.class) {
            java.lang.String a18 = kh0.i.a(str);
            java.lang.String host2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? "" : android.net.Uri.parse(str).getHost();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a18) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(host2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(859L, 6L, 1L, false);
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.e(a18);
                if (e17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgManager", "DB dont have valid record, pkgid:%s, domain:%s, version:%s:", a18, "", "");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("EnterWeb", str, a18, null, 0L, 0L, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.d(14));
                    g0Var.mo68477x336bdfd8(859L, 7L, 1L, false);
                    sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s(14, false, "");
                } else {
                    boolean z18 = e17.f269923w;
                    if (z18 && (e17.f269924x || !e17.f269925y)) {
                        if (host2.equalsIgnoreCase(e17.f269915o)) {
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17.f269909f)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgManager", "this pkgid(%s) is disable form server", a18);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("EnterWeb", str, a18, null, 0L, 0L, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.d(15));
                                g0Var.mo68477x336bdfd8(859L, 9L, 1L, false);
                                sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s(15, true, e17.f269909f);
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.z.c(a18, e17.f269909f, e17.f269910g, e17.f269916p, e17.f269918r);
                                if (c17 != null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17.f269910g)) {
                                    java.util.Map d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.z.d(a18, e17.f269925y);
                                    if (d17 == null) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("EnterWeb", str, a18, e17.f269909f, 0L, 0L, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.d(18));
                                        g0Var.mo68477x336bdfd8(859L, 11L, 1L, false);
                                        sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s(18, true, e17.f269909f);
                                    } else {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s sVar3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s(e17, c17, d17);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgManager", "loadWepkg time:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                                        g0Var.mo68477x336bdfd8(859L, 12L, 1L, false);
                                        sVar = sVar3;
                                    }
                                } else {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("EnterWeb", str, a18, e17.f269909f, 0L, 0L, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.d(17));
                                    g0Var.mo68477x336bdfd8(859L, 11L, 1L, false);
                                    sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s(17, true, e17.f269909f);
                                }
                            }
                            z17 = false;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgManager", "the domain not match, pkgid:%s, version:%s, UrlDomain[%s] != DBDomain[%s]", a18, e17.f269909f, host2, e17.f269915o);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("EnterWeb", str, a18, null, 0L, 0L, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.d(13));
                            g0Var.mo68477x336bdfd8(859L, 8L, 1L, false);
                            sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s(13, true, e17.f269909f);
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgManager", "local cache disable, pkgid:%s, version:%s, bigPackageReady:%s, preloadFilesReady:%s, preloadFilesAtomic:%s", e17.f269907d, e17.f269909f, java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(e17.f269924x), java.lang.Boolean.valueOf(e17.f269925y));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("EnterWeb", str, a18, e17.f269909f, 0L, 0L, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.d(16));
                    g0Var.mo68477x336bdfd8(859L, 10L, 1L, false);
                    sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s(16, false, e17.f269909f);
                    z17 = false;
                }
                z17 = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WepkgManager", "pkgId = %s, domain = %s", a18, host2);
            z17 = false;
            sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s(8, false, "");
        }
        if (sVar.f269928a == 0 ? true : z17) {
            hashMap.put(a17, sVar);
        }
        return sVar;
    }
}
