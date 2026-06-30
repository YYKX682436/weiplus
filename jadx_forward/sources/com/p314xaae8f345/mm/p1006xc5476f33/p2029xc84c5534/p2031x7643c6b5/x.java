package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* loaded from: classes12.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Map f239853a;

    /* renamed from: b, reason: collision with root package name */
    public static final lx3.f f239854b = new lx3.f(null);

    /* renamed from: c, reason: collision with root package name */
    public static int f239855c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f239856d = false;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f239857e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f239858f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.ThreadLocal f239859g = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.w();

    public static void a(java.util.ArrayList arrayList, boolean z17, boolean z18) {
        if (arrayList != null) {
            boolean z19 = false;
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                if (arrayList.get(i17) != null && com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.j.b((int) ((com.p314xaae8f345.p542x3306d5.smc.C4582x424c344) arrayList.get(i17)).m40327x4182ad1())) {
                    java.lang.Exception exc = new java.lang.Exception("The IDKey has not applied yet, check your code. IDKey:(" + ((com.p314xaae8f345.p542x3306d5.smc.C4582x424c344) arrayList.get(i17)).m40327x4182ad1() + "," + ((com.p314xaae8f345.p542x3306d5.smc.C4582x424c344) arrayList.get(i17)).m40328x7eed3b49() + ")");
                    boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KVEasyReport", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(exc));
                    b(1566L, 1L, 1L, false);
                    z19 = true;
                }
            }
            if (z19) {
                return;
            }
            try {
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40382xfbde2a92((com.p314xaae8f345.p542x3306d5.smc.C4582x424c344[]) arrayList.toArray(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344[arrayList.size()]), z17, z18);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KVEasyReport", th6, "", new java.lang.Object[0]);
                if (!fp.h.a(20)) {
                    throw th6;
                }
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40382xfbde2a92((com.p314xaae8f345.p542x3306d5.smc.C4582x424c344[]) arrayList.toArray(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344[arrayList.size()]), z17, z18);
            }
        }
    }

    public static void b(long j17, long j18, long j19, boolean z17) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.j.b((int) j17)) {
            java.lang.Exception exc = new java.lang.Exception("The IDKey has not applied yet, check your code, IDKey:(" + j17 + "," + j18 + ")");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KVEasyReport", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(exc));
            b(1566L, 1L, 1L, false);
            return;
        }
        try {
            ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40381xf0018e90(j17, j18, j19, z17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KVEasyReport", th6, "", new java.lang.Object[0]);
            if (!fp.h.a(20)) {
                throw th6;
            }
            ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40381xf0018e90(j17, j18, j19, z17);
        }
        if (f239856d) {
            if (f239853a == null) {
                k();
            }
            long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) ((java.util.HashMap) f239853a).get(java.lang.Long.valueOf(j17)), 0L);
            if (k17 > 0) {
                b(k17, j18, j19, z17);
            }
        }
    }

    public static void c(long j17, long j18, long j19, boolean z17) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.j.b((int) j17)) {
            java.lang.Exception exc = new java.lang.Exception("The IDKey has not applied yet, check your code, IDKey:(" + j17 + "," + j18 + ")");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KVEasyReport", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(exc));
            b(1566L, 1L, 1L, false);
            return;
        }
        try {
            ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40381xf0018e90(j17, j18, j19, z17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KVEasyReport", th6, "", new java.lang.Object[0]);
            if (!fp.h.a(20)) {
                throw th6;
            }
            ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40381xf0018e90(j17, j18, j19, z17);
        }
        if (f239856d) {
            if (f239853a == null) {
                k();
            }
            long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) ((java.util.HashMap) f239853a).get(java.lang.Long.valueOf(j17)), 0L);
            if (k17 > 0) {
                b(k17, j18, j19, z17);
            }
        }
    }

    public static void d(long j17, byte[] bArr, boolean z17, boolean z18) {
        if (!z18) {
            ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40396xed389306(j17, bArr, z17);
            return;
        }
        try {
            ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40391x1c40fa8b(j17, bArr, z17);
        } catch (java.lang.Exception e17) {
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KVEasyReport", "localReport :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    public static boolean e(long j17, boolean z17) {
        if (z17) {
            return true;
        }
        return f239858f.containsKey(java.lang.Long.valueOf(j17));
    }

    public static void f(long j17, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        boolean e17 = e(j17, z19);
        if (z18) {
            try {
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40389xc123e939(j17, str, z17, e17);
            } catch (java.lang.Exception e18) {
                boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KVEasyReport", "localReport :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
            }
        } else {
            try {
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40393x468d6474(j17, str, z17, e17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KVEasyReport", th6, "", new java.lang.Object[0]);
                if (!fp.h.a(20)) {
                    throw th6;
                }
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40393x468d6474(j17, str, z17, e17);
            }
        }
        j(j17, str);
    }

    public static void g(long j17, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        boolean e17 = e(j17, z19);
        if (z18) {
            try {
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40389xc123e939(j17, str, z17, e17);
            } catch (java.lang.Exception e18) {
                boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KVEasyReport", "localReport :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
            }
        } else {
            try {
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40393x468d6474(j17, str, z17, e17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KVEasyReport", th6, "", new java.lang.Object[0]);
                if (!fp.h.a(20)) {
                    throw th6;
                }
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40393x468d6474(j17, str, z17, e17);
            }
        }
        j(j17, str);
    }

    public static void h(long j17, long j18, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        boolean e17 = e(j17, z19);
        if (z18) {
            try {
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40390x62fe579(j17, j18, str, z17, e17);
            } catch (java.lang.Exception e18) {
                boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KVEasyReport", "localReport :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
            }
        } else {
            try {
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40395x1fb3f5b4(j17, j18, str, z17, e17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KVEasyReport", th6, "", new java.lang.Object[0]);
                if (!fp.h.a(20)) {
                    throw th6;
                }
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40395x1fb3f5b4(j17, j18, str, z17, e17);
            }
        }
        j(j17, str);
    }

    public static void i(long j17, long j18, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        boolean e17 = e(j17, z19);
        if (z18) {
            try {
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40390x62fe579(j17, j18, str, z17, e17);
            } catch (java.lang.Exception e18) {
                boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KVEasyReport", "localReport :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
            }
        } else {
            try {
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40395x1fb3f5b4(j17, j18, str, z17, e17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KVEasyReport", th6, "", new java.lang.Object[0]);
                if (!fp.h.a(20)) {
                    throw th6;
                }
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40395x1fb3f5b4(j17, j18, str, z17, e17);
            }
        }
        j(j17, str);
    }

    public static void j(long j17, java.lang.String str) {
        java.lang.ThreadLocal threadLocal = f239859g;
        java.lang.Boolean bool = (java.lang.Boolean) threadLocal.get();
        if (bool == null || !bool.booleanValue()) {
            try {
                threadLocal.set(java.lang.Boolean.TRUE);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5668xbf8f173b c5668xbf8f173b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5668xbf8f173b();
                am.ji jiVar = c5668xbf8f173b.f135993g;
                jiVar.f88566a = j17;
                jiVar.f88567b = str;
                c5668xbf8f173b.e();
            } finally {
                threadLocal.set(java.lang.Boolean.FALSE);
            }
        }
    }

    public static synchronized void k() {
        int i17;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.class) {
            if (f239853a == null) {
                f239853a = new java.util.HashMap(20);
            }
            r45.gw3 a17 = f239854b.a();
            if (a17 != null && (i17 = a17.f457091d) != f239855c) {
                f239855c = i17;
                f239853a.clear();
                java.util.LinkedList linkedList = a17.f457092e;
                if (linkedList != null) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        r45.bq4 bq4Var = (r45.bq4) it.next();
                        f239853a.put(new java.lang.Long(bq4Var.f452522d), new java.lang.Long(bq4Var.f452523e));
                    }
                }
            }
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KVEasyReport", "summerhv reloadHeavyUserIDMap heavyUserIDMap[%d][%d][%s], stack[%s]", java.lang.Integer.valueOf(f239855c), java.lang.Integer.valueOf(f239853a.size()), f239853a, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        }
    }

    public static void l(boolean z17) {
        java.lang.String[] split;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(f239856d);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z17);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KVEasyReport", "summerhv setHeavyUser [%b %b], stack[%s]", valueOf, valueOf2, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        f239856d = z17;
        j62.e g17 = j62.e.g();
        g17.getClass();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String j17 = g17.j("clicfg_ignore_freq_logid", "", false, true);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17) && (split = j17.split(";")) != null) {
            for (java.lang.String str : split) {
                hashSet.add(java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str, -1L)));
            }
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f239858f;
        concurrentHashMap.clear();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            concurrentHashMap.put((java.lang.Long) it.next(), f239857e);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KVEasyReport", "reset ignore freq limit logid [%s]", concurrentHashMap);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_smc_max_log_item_size, 15);
        if (Ni > 0) {
            ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40372xd8fb81f6(Ni);
        }
    }
}
