package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsruntime.r1 f84037a = new com.tencent.mm.plugin.appbrand.jsruntime.r1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f84038b = {"page_scripts"};

    public static final void a(kotlin.jvm.internal.f0 f0Var, com.tencent.mm.plugin.appbrand.jsruntime.q1 q1Var, kotlin.jvm.internal.f0 f0Var2, java.lang.String str) {
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17 = com.tencent.mm.vfs.w6.s(str, false);
        if (s17 != null) {
            for (com.tencent.mm.vfs.x1 x1Var : s17) {
                if (x1Var.f213236f) {
                    java.lang.String[] strArr = f84038b;
                    java.lang.String name = x1Var.f213232b;
                    kotlin.jvm.internal.o.f(name, "name");
                    if (!kz5.z.G(strArr, name)) {
                        f0Var.f310116d++;
                        kotlin.jvm.internal.o.f(name, "name");
                        com.tencent.mm.plugin.appbrand.jsruntime.q1 q1Var2 = r26.i0.y(name, "WA", false) ? q1Var : null;
                        if (q1Var2 != null) {
                            f0Var2.f310116d += q1Var2.invoke(str, x1Var).intValue();
                            if (f84037a.e(x1Var, str)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.V8CodeCacheCleanupLogic", "delete relPath %s", x1Var.f213231a);
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
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17 = com.tencent.mm.vfs.w6.s(str2, false);
        if (s17 != null) {
            for (com.tencent.mm.vfs.x1 x1Var : s17) {
                java.lang.String name = x1Var.f213232b;
                kotlin.jvm.internal.o.f(name, "name");
                if (r26.i0.n(name, str, false)) {
                    linkedList.add(x1Var);
                }
            }
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.vfs.w6.g(str2 + '/' + ((com.tencent.mm.vfs.x1) it.next()).f213232b, true);
        }
    }

    public static final void c() {
        java.lang.StringBuilder sb6;
        x51.k0 Ri = com.tencent.mm.plugin.appbrand.app.r9.Ri();
        if (Ri == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.p1 p1Var = new com.tencent.mm.plugin.appbrand.jsruntime.p1(Ri);
        com.tencent.mm.plugin.appbrand.jsruntime.o1 o1Var = new com.tencent.mm.plugin.appbrand.jsruntime.o1(Ri);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
        try {
            try {
                java.lang.String a17 = com.tencent.mm.plugin.appbrand.jsruntime.u1.a();
                kotlin.jvm.internal.o.f(a17, "retrieve(...)");
                d(f0Var, o1Var, p1Var, f0Var2, a17);
                java.lang.String c17 = com.tencent.mm.plugin.appbrand.jsruntime.u1.c();
                kotlin.jvm.internal.o.f(c17, "retrieveSnapshot(...)");
                d(f0Var, o1Var, p1Var, f0Var2, c17);
                sb6 = new java.lang.StringBuilder("doCleanup() cost:");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.V8CodeCacheCleanupLogic", e17, "doCleanup() get exception, db.isClose=" + Ri.J(), new java.lang.Object[0]);
                sb6 = new java.lang.StringBuilder("doCleanup() cost:");
            }
            sb6.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            sb6.append("ms, dirVisitedCount:");
            sb6.append(f0Var.f310116d);
            sb6.append(", fileDeletedCount:");
            sb6.append(f0Var2.f310116d);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.V8CodeCacheCleanupLogic", sb6.toString());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.V8CodeCacheCleanupLogic", "doCleanup() cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms, dirVisitedCount:" + f0Var.f310116d + ", fileDeletedCount:" + f0Var2.f310116d);
            throw th6;
        }
    }

    public static final void d(kotlin.jvm.internal.f0 f0Var, com.tencent.mm.plugin.appbrand.jsruntime.o1 o1Var, com.tencent.mm.plugin.appbrand.jsruntime.p1 p1Var, kotlin.jvm.internal.f0 f0Var2, java.lang.String str) {
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17 = com.tencent.mm.vfs.w6.s(str, false);
        if (s17 != null) {
            for (com.tencent.mm.vfs.x1 x1Var : s17) {
                if (x1Var.f213236f) {
                    java.lang.String[] strArr = f84038b;
                    java.lang.String name = x1Var.f213232b;
                    kotlin.jvm.internal.o.f(name, "name");
                    if (!kz5.z.G(strArr, name)) {
                        f0Var.f310116d++;
                        kotlin.jvm.internal.o.f(name, "name");
                        f0Var2.f310116d += ((java.lang.Number) (r26.i0.y(name, "WA", false) ? o1Var : p1Var).invoke(str, x1Var)).intValue();
                        if (f84037a.e(x1Var, str)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.V8CodeCacheCleanupLogic", "delete relPath %s", x1Var.f213231a);
                            x1Var.a();
                        }
                    }
                }
            }
        }
    }

    public final boolean e(com.tencent.mm.vfs.x1 x1Var, java.lang.String str) {
        if (!x1Var.f213236f) {
            return false;
        }
        java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(str + '/' + x1Var.f213232b, false);
        java.util.List S0 = s17 != null ? kz5.n0.S0(s17) : null;
        return S0 == null || S0.isEmpty();
    }
}
