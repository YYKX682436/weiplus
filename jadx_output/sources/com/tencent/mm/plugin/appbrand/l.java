package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedHashMap f84208a = new com.tencent.mm.plugin.appbrand.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedHashMap f84209b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final android.util.SparseIntArray f84210c = new android.util.SparseIntArray();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054 A[Catch: all -> 0x007b, TryCatch #0 {, blocks: (B:9:0x0013, B:13:0x0022, B:14:0x0043, B:17:0x0059, B:28:0x0054, B:29:0x0037), top: B:8:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.tencent.mm.plugin.appbrand.o6 r7) {
        /*
            java.lang.String r0 = r7.f74803n
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 == 0) goto L10
            java.lang.String r7 = "MicroMsg.AppBrandBridge"
            java.lang.String r0 = "clearRuntime with nil appId"
            com.tencent.mars.xlog.Log.e(r7, r0)
            return
        L10:
            java.util.LinkedHashMap r0 = com.tencent.mm.plugin.appbrand.l.f84209b
            monitor-enter(r0)
            java.lang.String r1 = r7.f74803n     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L7b
            com.tencent.mm.plugin.appbrand.o6 r1 = (com.tencent.mm.plugin.appbrand.o6) r1     // Catch: java.lang.Throwable -> L7b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 != r7) goto L22
            goto L37
        L22:
            java.lang.String r1 = "MicroMsg.AppBrandBridge"
            java.lang.String r4 = "clearRuntime with mismatch instance, stack %s"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L7b
            java.lang.Throwable r6 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L7b
            r6.<init>()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r6 = com.tencent.mm.sdk.platformtools.z3.c(r6)     // Catch: java.lang.Throwable -> L7b
            r5[r2] = r6     // Catch: java.lang.Throwable -> L7b
            com.tencent.mars.xlog.Log.e(r1, r4, r5)     // Catch: java.lang.Throwable -> L7b
            goto L43
        L37:
            java.lang.String r1 = r7.f74803n     // Catch: java.lang.Throwable -> L7b
            r0.remove(r1)     // Catch: java.lang.Throwable -> L7b
            java.util.LinkedHashMap r1 = com.tencent.mm.plugin.appbrand.l.f84208a     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r7.f74803n     // Catch: java.lang.Throwable -> L7b
            r1.remove(r4)     // Catch: java.lang.Throwable -> L7b
        L43:
            android.util.SparseIntArray r1 = com.tencent.mm.plugin.appbrand.l.f84210c     // Catch: java.lang.Throwable -> L7b
            int r7 = r7.hashCode()     // Catch: java.lang.Throwable -> L7b
            r1.delete(r7)     // Catch: java.lang.Throwable -> L7b
            boolean r7 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7b
            if (r7 == 0) goto L54
            r1 = r3
            goto L59
        L54:
            boolean r1 = f()     // Catch: java.lang.Throwable -> L7b
            r1 = r1 ^ r3
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            if (r7 == 0) goto L6d
            ku5.u0 r7 = ku5.t0.f312615d
            com.tencent.mm.plugin.appbrand.k r0 = new com.tencent.mm.plugin.appbrand.k
            r0.<init>()
            ku5.t0 r7 = (ku5.t0) r7
            r7.getClass()
            r4 = 1000(0x3e8, double:4.94E-321)
            r7.z(r0, r4, r2)
        L6d:
            boolean r7 = com.tencent.mm.sdk.platformtools.x2.j()
            if (r7 == 0) goto L78
            if (r1 == 0) goto L78
            com.tencent.xweb.a3.z(r3)
        L78:
            return
        L79:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            throw r7
        L7b:
            r7 = move-exception
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.l.a(com.tencent.mm.plugin.appbrand.o6):void");
    }

    public static com.tencent.mm.plugin.appbrand.o6 b(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.o6 o6Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.util.LinkedHashMap linkedHashMap = f84209b;
        synchronized (linkedHashMap) {
            o6Var = (com.tencent.mm.plugin.appbrand.o6) linkedHashMap.get(str);
        }
        return o6Var;
    }

    public static int c() {
        int size;
        java.util.LinkedHashMap linkedHashMap = f84209b;
        synchronized (linkedHashMap) {
            size = linkedHashMap.size();
        }
        return size;
    }

    public static com.tencent.mm.plugin.appbrand.report.AppBrandStatObject d(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.o6 b17 = b(str);
        if (b17 == null) {
            return null;
        }
        return b17.l2();
    }

    public static com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC e(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.o6 b17 = b(str);
        if (b17 == null) {
            return null;
        }
        return b17.E0();
    }

    public static boolean f() {
        java.util.LinkedHashMap linkedHashMap = f84209b;
        synchronized (linkedHashMap) {
            for (com.tencent.mm.plugin.appbrand.o6 o6Var : linkedHashMap.values()) {
                if (o6Var != null && !o6Var.q2()) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void g(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        boolean z17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(o6Var.f74803n)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandBridge", "setRuntime with nil appId");
            return;
        }
        java.util.LinkedHashMap linkedHashMap = f84209b;
        synchronized (linkedHashMap) {
            int size = linkedHashMap.size();
            boolean z18 = linkedHashMap.put(o6Var.f74803n, o6Var) != o6Var;
            f84208a.put(o6Var.f74803n, o6Var);
            if (z18) {
                f84210c.put(o6Var.hashCode(), size);
                z17 = f();
            } else {
                z17 = false;
            }
        }
        if (com.tencent.mm.sdk.platformtools.x2.j() && z17) {
            com.tencent.xweb.a3.z(false);
        }
        if (o6Var.u0() != null) {
            com.tencent.mm.plugin.appbrand.report.w0.a(o6Var.f74803n, o6Var.u0().f47284z);
        }
    }
}
