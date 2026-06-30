package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public final class t0 {

    /* renamed from: l, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.quality.w f88312l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f88313m;

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.Boolean f88314n;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f88315a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f88316b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f88317c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f88318d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f88319e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f88320f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f88321g;

    /* renamed from: h, reason: collision with root package name */
    public final int f88322h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f88323i = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f88324j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f88325k;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (true == sp3.d.c()) goto L11;
     */
    static {
        /*
            com.tencent.mm.plugin.appbrand.report.quality.v r0 = com.tencent.mm.plugin.appbrand.report.quality.w.f88365e
            r0.getClass()
            boolean r0 = wo.w0.q()
            if (r0 == 0) goto Le
            com.tencent.mm.plugin.appbrand.report.quality.w r0 = com.tencent.mm.plugin.appbrand.report.quality.w.f88368h
            goto L28
        Le:
            java.lang.Class<ob0.h3> r0 = ob0.h3.class
            i95.m r0 = i95.n0.c(r0)
            ob0.h3 r0 = (ob0.h3) r0
            if (r0 == 0) goto L20
            boolean r0 = sp3.d.c()
            r1 = 1
            if (r1 != r0) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            if (r1 == 0) goto L26
            com.tencent.mm.plugin.appbrand.report.quality.w r0 = com.tencent.mm.plugin.appbrand.report.quality.w.f88366f
            goto L28
        L26:
            com.tencent.mm.plugin.appbrand.report.quality.w r0 = com.tencent.mm.plugin.appbrand.report.quality.w.f88367g
        L28:
            com.tencent.mm.plugin.appbrand.report.quality.t0.f88312l = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.tencent.mm.plugin.appbrand.report.quality.t0.f88313m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.report.quality.t0.<clinit>():void");
    }

    public t0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z17) {
        this.f88315a = str;
        this.f88316b = str2;
        this.f88317c = str3;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f88318d = fp.s0.a(str4 == null ? "" : str4);
        this.f88319e = str5;
        this.f88322h = z17 ? 1 : 0;
        this.f88324j = bm5.f1.a();
        if (z17) {
            this.f88325k = "";
        } else {
            this.f88325k = org.xwalk.core.XWalkEnvironment.d() + "";
        }
        this.f88321g = new java.util.HashMap();
        this.f88320f = new java.util.ArrayList();
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.report.quality.r0(this), "QualityKVReporter_19941");
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, boolean z17) {
        if (!android.text.TextUtils.isEmpty(str) && d()) {
            com.tencent.mm.plugin.appbrand.report.quality.n1 n1Var = com.tencent.mm.plugin.appbrand.report.quality.k1.f88215a;
            boolean z18 = n1Var.f88246c;
            if (!z18 && !z18) {
                n1Var.f88246c = true;
                n1Var.f88244a = i17;
                n1Var.f88245b = new com.tencent.mm.plugin.appbrand.report.quality.l1(n1Var, null);
                ((ku5.t0) ku5.t0.f312615d).h(n1Var.f88245b, "QualityKVReporter_19941");
                com.tencent.mars.xlog.Log.i("MicroMsg.QualitySampleHelper", "startSample interval:%d", java.lang.Integer.valueOf(i17));
            }
            com.tencent.mm.plugin.appbrand.page.je jeVar = com.tencent.mm.plugin.appbrand.page.je.f86803a;
            com.tencent.mm.plugin.appbrand.page.je.f86804b = true;
            java.util.Map map = f88313m;
            if (((java.util.HashMap) map).containsKey(str2)) {
                return;
            }
            ((java.util.HashMap) map).put(str2, new com.tencent.mm.plugin.appbrand.report.quality.t0(str, str2, str3, str4, str5, z17));
            com.tencent.mm.plugin.appbrand.x0.a(str2, new com.tencent.mm.plugin.appbrand.report.quality.p0(str2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(java.lang.String r10, int r11) {
        /*
            boolean r0 = d()
            if (r0 != 0) goto L7
            return
        L7:
            int r4 = com.tencent.mm.plugin.appbrand.l.c()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.LinkedHashMap r1 = com.tencent.mm.plugin.appbrand.l.f84209b
            monitor-enter(r1)
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lbc
            java.util.Collection r2 = r1.values()     // Catch: java.lang.Throwable -> Lb9
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lb9
        L1c:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lb9
            if (r3 == 0) goto L39
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lb9
            com.tencent.mm.plugin.appbrand.o6 r3 = (com.tencent.mm.plugin.appbrand.o6) r3     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r3 = r3.f74803n     // Catch: java.lang.Throwable -> Lb9
            r0.append(r3)     // Catch: java.lang.Throwable -> Lb9
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lb9
            if (r3 == 0) goto L1c
            java.lang.String r3 = "_"
            r0.append(r3)     // Catch: java.lang.Throwable -> Lb9
            goto L1c
        L39:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> Lbc
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lbc
            com.tencent.mm.plugin.appbrand.page.je r0 = com.tencent.mm.plugin.appbrand.page.je.f86803a
            monitor-enter(r0)
            java.util.ArrayList r1 = com.tencent.mm.plugin.appbrand.page.je.f86805c     // Catch: java.lang.Throwable -> Lb6
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lb6
            r2 = 0
            r6 = r2
        L4a:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Lb6
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Lb6
            com.tencent.mm.plugin.appbrand.page.n7 r3 = (com.tencent.mm.plugin.appbrand.page.n7) r3     // Catch: java.lang.Throwable -> Lb6
            boolean r3 = r3.p2()     // Catch: java.lang.Throwable -> Lb6
            if (r3 == 0) goto L4a
            int r6 = r6 + 1
            goto L4a
        L5f:
            monitor-exit(r0)
            com.tencent.mm.plugin.appbrand.page.je r0 = com.tencent.mm.plugin.appbrand.page.je.f86803a
            monitor-enter(r0)
            java.util.ArrayList r1 = com.tencent.mm.plugin.appbrand.page.je.f86805c     // Catch: java.lang.Throwable -> Lb3
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lb3
            r7 = r2
        L6a:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Lb3
            com.tencent.mm.plugin.appbrand.page.n7 r3 = (com.tencent.mm.plugin.appbrand.page.n7) r3     // Catch: java.lang.Throwable -> Lb3
            boolean r3 = r3.p2()     // Catch: java.lang.Throwable -> Lb3
            if (r3 != 0) goto L6a
            int r7 = r7 + 1
            goto L6a
        L7f:
            monitor-exit(r0)
            df.a1 r0 = df.a1.f229421a
            java.util.HashMap r0 = df.a1.f229423c
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r8 = r2
        L8d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La1
            java.lang.Object r1 = r0.next()
            df.x0 r1 = (df.x0) r1
            java.util.ArrayList r1 = r1.f229608f
            int r1 = r1.size()
            int r8 = r8 + r1
            goto L8d
        La1:
            ku5.u0 r0 = ku5.t0.f312615d
            com.tencent.mm.plugin.appbrand.report.quality.q0 r9 = new com.tencent.mm.plugin.appbrand.report.quality.q0
            r1 = r9
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r10 = "QualityKVReporter_19941"
            ku5.t0 r0 = (ku5.t0) r0
            r0.h(r9, r10)
            return
        Lb3:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        Lb6:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        Lb9:
            r10 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb9
            throw r10     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r10 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lbc
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.report.quality.t0.c(java.lang.String, int):void");
    }

    public static boolean d() {
        java.lang.Boolean bool = f88314n;
        if (bool != null) {
            return bool.booleanValue();
        }
        int nextInt = new java.util.Random().nextInt(100);
        com.tencent.mars.xlog.Log.i("MicroMsg.QualitySampleHelper", "shouldReport:%d", java.lang.Integer.valueOf(nextInt));
        boolean z17 = true;
        if (nextInt != 1 && !z65.c.a()) {
            z17 = false;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        f88314n = valueOf;
        return valueOf.booleanValue();
    }

    public final void a(int i17) {
        com.tencent.mm.plugin.appbrand.report.quality.s0 s0Var = new com.tencent.mm.plugin.appbrand.report.quality.s0(null);
        s0Var.f88277a = i17;
        com.tencent.mm.plugin.appbrand.report.quality.n1 n1Var = com.tencent.mm.plugin.appbrand.report.quality.k1.f88215a;
        n1Var.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - n1Var.f88247d > 1000) {
            n1Var.a();
            n1Var.f88247d = currentTimeMillis;
        }
        s0Var.f88278b = n1Var.b(i17).f88243d;
        ((java.util.ArrayList) this.f88320f).add(s0Var);
    }
}
