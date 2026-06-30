package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class n3 implements com.tencent.mm.plugin.appbrand.launching.a7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f84797a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.y50 f84798b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f84799c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f84800d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f84801e;

    /* renamed from: f, reason: collision with root package name */
    public int f84802f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f84803g;

    public n3(java.lang.String session, java.util.Collection requestPkgInfoList, r45.y50 cgiCommRequestSource, java.lang.String str) {
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(requestPkgInfoList, "requestPkgInfoList");
        kotlin.jvm.internal.o.g(cgiCommRequestSource, "cgiCommRequestSource");
        this.f84797a = session;
        this.f84798b = cgiCommRequestSource;
        this.f84799c = str;
        this.f84800d = new java.util.LinkedList(requestPkgInfoList);
        this.f84801e = new java.util.HashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        r7.remove();
        r2.f84802f = r6;
        r2.f84801e.put(r3, new jz5.l(r4, r5));
        c();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[Catch: all -> 0x0066, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x001b, B:11:0x0029, B:14:0x0032, B:16:0x0037, B:17:0x003d, B:19:0x0043, B:22:0x0052), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[EDGE_INSN: B:28:0x0064->B:23:0x0064 BREAK  A[LOOP:0: B:17:0x003d->B:27:?], SYNTHETIC] */
    @Override // com.tencent.mm.plugin.appbrand.launching.a7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(com.tencent.mm.plugin.appbrand.launching.z6 r3, yz5.l r4, yz5.q r5, int r6, r45.y50 r7, java.lang.String r8) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "request"
            kotlin.jvm.internal.o.g(r3, r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = "onSuccess"
            kotlin.jvm.internal.o.g(r4, r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.o.g(r5, r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = "cgiCommRequestSource"
            kotlin.jvm.internal.o.g(r7, r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r7 = r2.f84799c     // Catch: java.lang.Throwable -> L66
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L24
            int r7 = r7.length()     // Catch: java.lang.Throwable -> L66
            if (r7 != 0) goto L22
            goto L24
        L22:
            r7 = r0
            goto L25
        L24:
            r7 = r1
        L25:
            if (r7 != 0) goto L37
            if (r8 == 0) goto L2f
            int r7 = r8.length()     // Catch: java.lang.Throwable -> L66
            if (r7 != 0) goto L30
        L2f:
            r0 = r1
        L30:
            if (r0 != 0) goto L37
            java.lang.String r7 = r2.f84799c     // Catch: java.lang.Throwable -> L66
            e56.a.a(r7, r8)     // Catch: java.lang.Throwable -> L66
        L37:
            java.util.LinkedList r7 = r2.f84800d     // Catch: java.lang.Throwable -> L66
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L66
        L3d:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r8 == 0) goto L64
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L66
            com.tencent.mm.plugin.appbrand.launching.o6 r8 = (com.tencent.mm.plugin.appbrand.launching.o6) r8     // Catch: java.lang.Throwable -> L66
            kotlin.jvm.internal.o.d(r8)     // Catch: java.lang.Throwable -> L66
            int r8 = r2.b(r8, r3)     // Catch: java.lang.Throwable -> L66
            if (r8 != 0) goto L3d
            r7.remove()     // Catch: java.lang.Throwable -> L66
            r2.f84802f = r6     // Catch: java.lang.Throwable -> L66
            java.util.HashMap r6 = r2.f84801e     // Catch: java.lang.Throwable -> L66
            jz5.l r7 = new jz5.l     // Catch: java.lang.Throwable -> L66
            r7.<init>(r4, r5)     // Catch: java.lang.Throwable -> L66
            r6.put(r3, r7)     // Catch: java.lang.Throwable -> L66
            r2.c()     // Catch: java.lang.Throwable -> L66
        L64:
            monitor-exit(r2)
            return
        L66:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.n3.a(com.tencent.mm.plugin.appbrand.launching.z6, yz5.l, yz5.q, int, r45.y50, java.lang.String):void");
    }

    public final int b(com.tencent.mm.plugin.appbrand.launching.o6 o6Var, com.tencent.mm.plugin.appbrand.launching.z6 z6Var) {
        if (kotlin.jvm.internal.o.b(o6Var.f84851d, z6Var.f85461d)) {
            if (o6Var.f84853f == z6Var.f85463f) {
                if (o6Var.f84854g == z6Var.f85464g) {
                    java.lang.String str = o6Var.f84852e;
                    java.lang.String str2 = str == null ? "" : str;
                    java.lang.String str3 = z6Var.f85462e;
                    if (kotlin.jvm.internal.o.b(str2, str3 != null ? str3 : "")) {
                        return 0;
                    }
                    if (kotlin.jvm.internal.o.b(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME, str)) {
                        java.lang.String str4 = z6Var.f85462e;
                        if (str4 == null || str4.length() == 0) {
                            return 0;
                        }
                    }
                    return 1;
                }
            }
        }
        return -1;
    }

    public final void c() {
        if (!this.f84800d.isEmpty()) {
            return;
        }
        java.util.HashMap hashMap = this.f84801e;
        int size = hashMap.size();
        java.lang.String str = this.f84797a;
        if (size <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.BatchGetCodePkgExecutor", "session(" + str + ")fireAllRequestsIfNeed requestCallbacks.size <= 0");
            return;
        }
        if (this.f84803g) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.BatchGetCodePkgExecutor", "session(" + str + ")fireAllRequestsIfNeed cgi reentry!");
            return;
        }
        try {
            java.util.LinkedList linkedList = new java.util.LinkedList(hashMap.keySet());
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BatchGetCodePkgExecutor", "session(" + str + ")fireAllRequestsIfNeed real call CgiRouter with requests(" + kz5.n0.g0(linkedList, ",", null, null, 0, null, null, 62, null) + ')');
            com.tencent.mm.plugin.appbrand.launching.x5.f85410a.e(linkedList, new com.tencent.mm.plugin.appbrand.launching.l3(this), new com.tencent.mm.plugin.appbrand.launching.m3(this), this.f84802f, this.f84798b, this.f84799c);
        } finally {
            this.f84803g = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r0.remove();
        c();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(com.tencent.mm.plugin.appbrand.launching.o6 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "request"
            kotlin.jvm.internal.o.g(r3, r0)     // Catch: java.lang.Throwable -> L26
            java.util.LinkedList r0 = r2.f84800d     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L26
        Lc:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L26
            com.tencent.mm.plugin.appbrand.launching.o6 r1 = (com.tencent.mm.plugin.appbrand.launching.o6) r1     // Catch: java.lang.Throwable -> L26
            int r1 = r1.compareTo(r3)     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto Lc
            r0.remove()     // Catch: java.lang.Throwable -> L26
            r2.c()     // Catch: java.lang.Throwable -> L26
        L24:
            monitor-exit(r2)
            return
        L26:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.n3.d(com.tencent.mm.plugin.appbrand.launching.o6):void");
    }
}
