package oe1;

/* loaded from: classes13.dex */
public class v1 implements oe1.q1 {

    /* renamed from: h, reason: collision with root package name */
    public static oe1.v1 f426279h;

    /* renamed from: d, reason: collision with root package name */
    public boolean f426280d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f426281e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f426282f = false;

    /* renamed from: g, reason: collision with root package name */
    public final te1.i f426283g = new oe1.t1(this);

    public v1() {
        ((oe1.u1) i95.n0.c(oe1.u1.class)).Kd(this);
    }

    public static oe1.v1 h() {
        if (f426279h == null) {
            synchronized (oe1.v1.class) {
                if (f426279h == null) {
                    f426279h = new oe1.v1();
                }
            }
        }
        return f426279h;
    }

    @Override // oe1.q1
    public r9.j G4() {
        if (this.f426281e) {
            return null;
        }
        return bf1.h.i().f101123e;
    }

    public void b(java.lang.String str, long j17, long j18) {
        if (!this.f426281e) {
            bf1.h.i().h(str, j17, j18);
            return;
        }
        try {
            te1.l.b().d(str, j18);
        } catch (java.lang.Exception e17) {
            ve1.g.p(6, "MicroMsg.SameLayer.VideoCore", "preload exception", e17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.VideoCore", "mkdirs fail 2, not dir:%s", r1);
        com.p314xaae8f345.mm.vfs.w6.h(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.u(r1) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.VideoCore", "mkdirs fail 3, no space? dir:%s", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = "MicroMsg.SameLayer.VideoCore"
            java.lang.String r1 = lp0.b.D()
            java.lang.String r2 = "/"
            boolean r3 = r1.endsWith(r2)
            if (r3 != 0) goto L12
            java.lang.String r1 = r1.concat(r2)
        L12:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r13)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r2 = 0
            boolean r3 = com.p314xaae8f345.mm.vfs.w6.u(r1)     // Catch: java.lang.Throwable -> L9a
            if (r3 != 0) goto L90
            java.lang.String r3 = "mkdirs fail 1, maybe dir exist:%s"
            java.lang.Object[] r4 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L9a
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r3, r4)     // Catch: java.lang.Throwable -> L9a
            com.tencent.mm.vfs.z7 r3 = com.p314xaae8f345.mm.vfs.z7.a(r1)     // Catch: java.lang.Throwable -> L9a
            r4 = 0
            java.lang.String r5 = r3.f294812f
            if (r5 == 0) goto L56
            java.lang.String r9 = com.p314xaae8f345.mm.vfs.e8.l(r5, r4, r4)     // Catch: java.lang.Throwable -> L9a
            boolean r5 = r5.equals(r9)     // Catch: java.lang.Throwable -> L9a
            if (r5 != 0) goto L56
            com.tencent.mm.vfs.z7 r5 = new com.tencent.mm.vfs.z7     // Catch: java.lang.Throwable -> L9a
            java.lang.String r7 = r3.f294810d     // Catch: java.lang.Throwable -> L9a
            java.lang.String r8 = r3.f294811e     // Catch: java.lang.Throwable -> L9a
            java.lang.String r10 = r3.f294813g     // Catch: java.lang.Throwable -> L9a
            java.lang.String r11 = r3.f294814h     // Catch: java.lang.Throwable -> L9a
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L9a
            r3 = r5
        L56:
            com.tencent.mm.vfs.b3 r5 = com.p314xaae8f345.mm.vfs.a3.f294314a     // Catch: java.lang.Throwable -> L9a
            com.tencent.mm.vfs.z2 r3 = r5.m(r3, r2)     // Catch: java.lang.Throwable -> L9a
            boolean r5 = r3.a()     // Catch: java.lang.Throwable -> L9a
            if (r5 != 0) goto L63
            goto L72
        L63:
            com.tencent.mm.vfs.q2 r5 = r3.f294799a     // Catch: java.lang.Throwable -> L9a
            java.lang.String r3 = r3.f294800b     // Catch: java.lang.Throwable -> L9a
            com.tencent.mm.vfs.x1 r3 = r5.m(r3)     // Catch: java.lang.Throwable -> L9a
            if (r3 == 0) goto L72
            boolean r3 = r3.f294769f     // Catch: java.lang.Throwable -> L9a
            if (r3 == 0) goto L72
            r4 = 1
        L72:
            if (r4 != 0) goto L90
            java.lang.String r3 = "mkdirs fail 2, not dir:%s"
            java.lang.Object[] r4 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L9a
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r3, r4)     // Catch: java.lang.Throwable -> L9a
            com.p314xaae8f345.mm.vfs.w6.h(r1)     // Catch: java.lang.Throwable -> L9a
            boolean r3 = com.p314xaae8f345.mm.vfs.w6.u(r1)     // Catch: java.lang.Throwable -> L9a
            if (r3 != 0) goto L90
            java.lang.String r13 = "mkdirs fail 3, no space? dir:%s"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L9a
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r13, r1)     // Catch: java.lang.Throwable -> L9a
            return r2
        L90:
            java.lang.String r3 = "ensureDir %s:%s"
            java.lang.Object[] r13 = new java.lang.Object[]{r13, r1}     // Catch: java.lang.Throwable -> L9a
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r3, r13)     // Catch: java.lang.Throwable -> L9a
            return r1
        L9a:
            r13 = move-exception
            java.lang.String r1 = "mkdirs exception:%s"
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1, r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: oe1.v1.c(java.lang.String):java.lang.String");
    }

    public java.lang.String f(java.lang.String str) {
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String uri = parse.toString();
        if (str != null) {
            try {
                if (parse.getHost().equals("mpvideo.qpic.cn") && parse.getQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54503x6397ab9d) != null) {
                    uri = parse.getPath() + "_" + parse.getQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54503x6397ab9d);
                    java.lang.String queryParameter = parse.getQueryParameter("format_id");
                    if (queryParameter != null) {
                        uri = uri + "_" + queryParameter;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.VideoCore", "[TRACE_VIDEO_PRELOAD] cachekey = %s", uri);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return uri;
    }

    public void i(android.content.Context context, boolean z17, boolean z18, ue1.a aVar, te1.d dVar) {
        if (this.f426280d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.VideoCore", "init already, current enableProxy:%s", java.lang.Boolean.valueOf(this.f426281e));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.VideoCore", "init, enableProxy:%s, enableHlsProxy:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f426280d = true;
        this.f426282f = z18;
        this.f426281e = z17;
        if (z17) {
            java.lang.String c17 = c("wxvideocache");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
                this.f426281e = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.VideoCore", "init, disableProxy for cache dir make fail");
                ((lm1.c) aVar).g(-1);
            } else {
                android.content.Context applicationContext = context.getApplicationContext();
                if (qe1.a.f443548r == null) {
                    synchronized (qe1.a.class) {
                        if (qe1.a.f443548r == null) {
                            qe1.a.f443548r = new qe1.a(applicationContext);
                        }
                    }
                }
                qe1.a a17 = qe1.a.a();
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                a17.f443550b = false;
                qe1.a.a().f443559k = 1048576L;
                qe1.a.a().f443558j = 536870912L;
                qe1.a.a().f443551c = true;
                qe1.a.a().f443552d = true;
                qe1.a.a().f443553e = true;
                qe1.a.a().f443554f = z18;
                qe1.a.a().f443555g = false;
                qe1.a.a().f443560l = 3;
                qe1.a.a().f443561m = new oe1.w1();
                qe1.a.a().f443564p = new re1.j();
                qe1.a.a().f443562n = aVar;
                qe1.a.a().f443565q = dVar;
                qe1.a.a().f443563o = this.f426283g;
                qe1.a.a().f443557i = c17;
                qe1.a.a().f443556h = c("wxvideotmp");
                if (te1.l.f499323c == null) {
                    synchronized (te1.l.class) {
                        if (te1.l.f499323c == null) {
                            te1.l.f499323c = new te1.l();
                        }
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.VideoCore", "init, costTimeMs:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // oe1.q1
    public long q0(java.lang.String str, long j17, long j18) {
        if (!this.f426281e) {
            return bf1.h.i().q0(str, j17, j18);
        }
        try {
            return te1.l.b().a(str);
        } catch (java.lang.Exception e17) {
            ve1.g.p(6, "MicroMsg.SameLayer.VideoCore", "getCachedBytes exception", e17);
            return 0L;
        }
    }

    @Override // oe1.q1
    public void t5(java.lang.String str) {
        if (this.f426281e) {
            return;
        }
        bf1.h.i().t5(str);
    }

    @Override // oe1.q1
    public java.lang.String z7(java.lang.String str) {
        if (!this.f426281e) {
            bf1.h.i().getClass();
            return str;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.startsWith("http://127.0.0.1"))) {
                try {
                    return te1.l.b().f499324a.b(str, true, true, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54280xf59ed10d, 90);
                } catch (java.lang.Exception e17) {
                    ve1.g.p(6, "MicroMsg.SameLayer.VideoCore", "getProxyUrl exception", e17);
                }
            }
        }
        return str;
    }
}
