package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f;

/* loaded from: classes7.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r1 f165570a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f165571b = {"page_scripts"};

    public static final void a(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.q1 q1Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, java.lang.String str) {
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17 = com.p314xaae8f345.mm.vfs.w6.s(str, false);
        if (s17 != null) {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
                if (x1Var.f294769f) {
                    java.lang.String[] strArr = f165571b;
                    java.lang.String name = x1Var.f294765b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                    if (!kz5.z.G(strArr, name)) {
                        f0Var.f391649d++;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.q1 q1Var2 = r26.i0.y(name, "WA", false) ? q1Var : null;
                        if (q1Var2 != null) {
                            f0Var2.f391649d += q1Var2.mo149xb9724478(str, x1Var).intValue();
                            if (f165570a.e(x1Var, str)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.V8CodeCacheCleanupLogic", "delete relPath %s", x1Var.f294764a);
                                x1Var.a();
                            }
                        }
                    }
                }
            }
        }
    }

    public static final void b(java.lang.String str, java.lang.String str2) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17 = com.p314xaae8f345.mm.vfs.w6.s(str2, false);
        if (s17 != null) {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
                java.lang.String name = x1Var.f294765b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                if (r26.i0.n(name, str, false)) {
                    linkedList.add(x1Var);
                }
            }
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.vfs.w6.g(str2 + '/' + ((com.p314xaae8f345.mm.vfs.x1) it.next()).f294765b, true);
        }
    }

    public static final void c() {
        java.lang.StringBuilder sb6;
        x51.k0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ri();
        if (Ri == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.p1 p1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.p1(Ri);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.o1 o1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.o1(Ri);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        try {
            try {
                java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u1.a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "retrieve(...)");
                d(f0Var, o1Var, p1Var, f0Var2, a17);
                java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u1.c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "retrieveSnapshot(...)");
                d(f0Var, o1Var, p1Var, f0Var2, c17);
                sb6 = new java.lang.StringBuilder("doCleanup() cost:");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.V8CodeCacheCleanupLogic", e17, "doCleanup() get exception, db.isClose=" + Ri.J(), new java.lang.Object[0]);
                sb6 = new java.lang.StringBuilder("doCleanup() cost:");
            }
            sb6.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            sb6.append("ms, dirVisitedCount:");
            sb6.append(f0Var.f391649d);
            sb6.append(", fileDeletedCount:");
            sb6.append(f0Var2.f391649d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.V8CodeCacheCleanupLogic", sb6.toString());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.V8CodeCacheCleanupLogic", "doCleanup() cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms, dirVisitedCount:" + f0Var.f391649d + ", fileDeletedCount:" + f0Var2.f391649d);
            throw th6;
        }
    }

    public static final void d(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.o1 o1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.p1 p1Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, java.lang.String str) {
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17 = com.p314xaae8f345.mm.vfs.w6.s(str, false);
        if (s17 != null) {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
                if (x1Var.f294769f) {
                    java.lang.String[] strArr = f165571b;
                    java.lang.String name = x1Var.f294765b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                    if (!kz5.z.G(strArr, name)) {
                        f0Var.f391649d++;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                        f0Var2.f391649d += ((java.lang.Number) (r26.i0.y(name, "WA", false) ? o1Var : p1Var).mo149xb9724478(str, x1Var)).intValue();
                        if (f165570a.e(x1Var, str)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.V8CodeCacheCleanupLogic", "delete relPath %s", x1Var.f294764a);
                            x1Var.a();
                        }
                    }
                }
            }
        }
    }

    public final boolean e(com.p314xaae8f345.mm.vfs.x1 x1Var, java.lang.String str) {
        if (!x1Var.f294769f) {
            return false;
        }
        java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(str + '/' + x1Var.f294765b, false);
        java.util.List S0 = s17 != null ? kz5.n0.S0(s17) : null;
        return S0 == null || S0.isEmpty();
    }
}
