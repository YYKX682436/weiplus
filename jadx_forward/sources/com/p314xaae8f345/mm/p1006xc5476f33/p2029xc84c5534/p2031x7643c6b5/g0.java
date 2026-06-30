package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* loaded from: classes12.dex */
public enum g0 implements jx3.c {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public int f239707d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f239708e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f239709f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f239710g;

    /* renamed from: h, reason: collision with root package name */
    public int f239711h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f239712i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.HashMap f239713m;

    /* renamed from: n, reason: collision with root package name */
    public int f239714n;

    /* renamed from: o, reason: collision with root package name */
    public int f239715o;

    /* renamed from: p, reason: collision with root package name */
    public long f239716p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f239717q;

    g0() {
        this.f239708e = false;
        this.f239709f = false;
        this.f239710g = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.j0(this);
            if (gm0.j1.h()) {
                j0Var.s();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMKernel", "[+] cb %s was added to post initialized callbacks.", j0Var);
                gm0.j1.f354740n.v(j0Var);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            this.f239708e = ih.a.e(e42.c0.clicfg_mars2_push_isolated_report_enable, false);
            this.f239710g = ih.a.e(e42.c0.clicfg_mars2_push_isolated_idkey_report_enable, false);
            this.f239709f = ih.a.e(e42.c0.clicfg_mars2_push_isolated_report_disable_sos, false);
        }
    }

    public static void s(com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var) {
        g0Var.getClass();
        try {
            byte[] N = com.p314xaae8f345.mm.vfs.w6.N(com.p314xaae8f345.mm.vfs.r6.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFileStreamPath("clog-settings")).u(), 0, -1);
            if (N == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.cLog", "Settings local file missing.");
                g0Var.f239717q = true;
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.cLog", "Load settings from local file.");
            g0Var.f239717q = false;
            r45.q0 q0Var = new r45.q0();
            q0Var.mo11468x92b714fd(N);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator it = q0Var.f465061f.iterator();
            while (it.hasNext()) {
                r45.o0 o0Var = (r45.o0) it.next();
                if (o0Var.f463320e != 0) {
                    long j17 = (o0Var.f463322g * io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) / 1000000;
                    hashMap.put(o0Var.f463319d, java.lang.Long.valueOf(j17));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.cLog", "Update cLog ratio: %s => %d [0x%08x]", o0Var.f463319d, java.lang.Integer.valueOf(o0Var.f463322g), java.lang.Long.valueOf(j17));
                }
            }
            g0Var.f239713m = hashMap;
            int i17 = q0Var.f465059d;
            g0Var.f239714n = i17;
            g0Var.f239715o = q0Var.f465062g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.cLog", "Update cLog version: %d / %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(g0Var.f239715o));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.cLog", e17, "Failed to update cLog ratio.", new java.lang.Object[0]);
        }
    }

    public void A(int i17, int i18) {
        B(i17, i18);
    }

    public void B(long j17, long j18) {
        C(j17, j18, 1L);
    }

    public void C(long j17, long j18, long j19) {
        mo68477x336bdfd8(j17, j18, j19, false);
    }

    public void D(final int i17, java.util.List list, final boolean z17, boolean z18) {
        java.lang.String str;
        final boolean z19 = false;
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ReportManagerKvCheck", "vals is null, use '' as value");
            str = "";
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int size = list.size() - 1;
            for (int i18 = 0; i18 < size; i18++) {
                sb6.append((java.lang.String) list.get(i18));
                sb6.append(',');
            }
            sb6.append((java.lang.String) list.get(size));
            str = sb6.toString();
        }
        final java.lang.String str2 = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            L(new java.lang.Runnable(i17, str2, z17, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$z

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f239803d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f239804e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f239805f;

                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.f(this.f239803d, this.f239804e, this.f239805f, false, false);
                }
            });
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p() && u()) {
            L(new java.lang.Runnable(i17, str2, z17, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$a0

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f239720d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f239721e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f239722f;

                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.g(this.f239720d, this.f239721e, this.f239722f, false, false);
                }
            });
        } else {
            N(i17, str2, false, z17, false);
        }
    }

    public void E(int i17, java.lang.Object... objArr) {
        if (!kx3.a.f394813a) {
            G(i17, false, false, true, objArr);
        } else {
            boolean z17 = kx3.a.f394814b;
            G(i17, z17, z17, true, objArr);
        }
    }

    public void G(final int i17, final boolean z17, boolean z18, final boolean z19, java.lang.Object... objArr) {
        final boolean z27 = false;
        final java.lang.String w17 = w(objArr);
        z65.c.a();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            final boolean z28 = false;
            L(new java.lang.Runnable(i17, w17, z17, z28, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$x

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f239795d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f239796e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f239797f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f239798g;

                {
                    this.f239798g = z19;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.f(this.f239795d, this.f239796e, this.f239797f, false, this.f239798g);
                }
            });
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p() && u()) {
            L(new java.lang.Runnable(i17, w17, z17, z27, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$y

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f239799d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f239800e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f239801f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f239802g;

                {
                    this.f239802g = z19;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.g(this.f239799d, this.f239800e, this.f239801f, false, this.f239802g);
                }
            });
        } else {
            N(i17, w17, false, z17, z19);
        }
    }

    public void H(final int i17, final boolean z17, boolean z18, java.lang.Object... objArr) {
        final java.lang.String w17 = w(objArr);
        z65.c.a();
        final boolean z19 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            L(new java.lang.Runnable(i17, w17, z17, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$m

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f239758d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f239759e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f239760f;

                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.f(this.f239758d, this.f239759e, this.f239760f, false, false);
                }
            });
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            L(new java.lang.Runnable(i17, w17, z17, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$n

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f239761d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f239762e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f239763f;

                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.g(this.f239761d, this.f239762e, this.f239763f, false, true);
                }
            });
        } else {
            N(i17, w17, false, z17, false);
        }
    }

    public boolean I(final int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, final boolean z17, boolean z18) {
        final boolean z19 = false;
        try {
            fVar.getClass().getField("import_ds_").setInt(fVar, Integer.MAX_VALUE);
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis / 86400 != 0) {
                try {
                    this.f239711h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date()), 0);
                } catch (java.lang.Exception unused) {
                }
            }
            fVar.getClass().getField("ds_").setInt(fVar, this.f239711h);
            fVar.getClass().getField("uin_").setLong(fVar, this.f239707d & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2);
            fVar.getClass().getField("device_").setInt(fVar, 2);
            fVar.getClass().getField("clientVersion_").setInt(fVar, o45.wf.f424562g);
            fVar.getClass().getField("time_stamp_").setLong(fVar, currentTimeMillis);
            try {
                final byte[] mo14344x5f01b1f6 = fVar.mo14344x5f01b1f6();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    if (kx3.a.f394813a) {
                        L(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.report.service.g0$$o
                            @Override // java.lang.Runnable
                            public final void run() {
                                long j17 = i17;
                                boolean z28 = kx3.a.f394814b;
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.d(j17, mo14344x5f01b1f6, z28, z28);
                            }
                        });
                    } else {
                        L(new java.lang.Runnable(i17, mo14344x5f01b1f6, z17, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$p

                            /* renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ int f239766d;

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ byte[] f239767e;

                            /* renamed from: f, reason: collision with root package name */
                            public final /* synthetic */ boolean f239768f;

                            @Override // java.lang.Runnable
                            public final void run() {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.d(this.f239766d, this.f239767e, this.f239768f, false);
                            }
                        });
                    }
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p() && u()) {
                    L(new java.lang.Runnable(i17, mo14344x5f01b1f6, z17, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$q

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ int f239769d;

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ byte[] f239770e;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ boolean f239771f;

                        @Override // java.lang.Runnable
                        public final void run() {
                            long j17 = this.f239769d;
                            java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.f239853a;
                            ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40396xed389306(j17, this.f239770e, this.f239771f);
                        }
                    });
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.ReportManagerKvCheck", "not in MM Process");
                }
                return true;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReportManagerKvCheck", "pbKVStat LocalReportPb error, %d, %s", java.lang.Integer.valueOf(i17), e17.toString());
                return false;
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReportManagerKvCheck", "pbKVStat  set values error, %d, %s", java.lang.Integer.valueOf(i17), e18.toString());
            return false;
        }
    }

    public void J(long j17, long j18) {
        synchronized (this.f239712i) {
            ((java.util.LinkedList) this.f239712i).add(new android.util.Pair(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18)));
        }
    }

    public final void L(java.lang.Runnable runnable) {
        if (!gm0.j1.h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ReportManagerKvCheck", new java.lang.Throwable(), "[-] MMkernel was not initialized.", new java.lang.Object[0]);
            return;
        }
        if (gm0.j1.i().f354741a.f354832d || (fp.d0.d("wechatbase") && com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37619x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class) != null && ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40378x376602e1())) {
            runnable.run();
        } else {
            gm0.j1.i().c(new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.m0(this, runnable));
        }
    }

    public void M(long j17, long j18, long j19, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17202xbfa55fb c17202xbfa55fb = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17202xbfa55fb();
        c17202xbfa55fb.f239675d = j17;
        c17202xbfa55fb.f239676e = j18;
        c17202xbfa55fb.f239677f = j19;
        c17202xbfa55fb.f239678g = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.f239657a;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.j.b((int) j17)) {
            java.lang.Exception exc = new java.lang.Exception("The IDKey has not applied yet, check your code, IDKey:(" + c17202xbfa55fb.f239675d + "," + c17202xbfa55fb.f239676e + ")");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KVCommCrossProcessReceiver", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(exc));
            c17202xbfa55fb.f239675d = 1566L;
            c17202xbfa55fb.f239676e = 1L;
            c17202xbfa55fb.f239677f = 1L;
        }
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.f239663g) {
            long j27 = 28;
            if (j27 >= 102400) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KVCommCrossProcessReceiver", new java.lang.Throwable(), "id-key data too large: %s", java.lang.Long.valueOf(j27));
                } catch (java.lang.Throwable th6) {
                    throw th6;
                }
            }
            if (j27 >= 307200) {
                throw new java.lang.OutOfMemoryError("id-key data too large: 28");
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.f239659c == 0 || com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.a(j27)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.c();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17193xfa87980b c17193xfa87980b = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.f239661e;
            c17193xfa87980b.f239651e.add(c17202xbfa55fb);
            c17193xfa87980b.a(32);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.b();
    }

    public final void N(int i17, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17197xb3ea717 c17197xb3ea717 = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17197xb3ea717();
        c17197xb3ea717.f239664d = i17;
        c17197xb3ea717.f239666f = str;
        c17197xb3ea717.f239665e = 0L;
        c17197xb3ea717.f239668h = false;
        c17197xb3ea717.f239667g = z18;
        c17197xb3ea717.f239669i = z19;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.e(c17197xb3ea717);
    }

    @Override // jx3.c
    public void a(int i17) {
        ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40387xca029c98(i17);
        this.f239707d = i17;
    }

    @Override // jx3.c
    public void b(java.util.ArrayList arrayList, boolean z17) {
        j(arrayList, z17, false);
    }

    @Override // jx3.c
    public void d(int i17, java.lang.Object... objArr) {
        if (!kx3.a.f394813a) {
            r(i17, false, false, objArr);
        } else {
            boolean z17 = kx3.a.f394814b;
            r(i17, z17, z17, objArr);
        }
    }

    @Override // jx3.c
    public void e(final int i17, final int i18, final java.lang.String str, final boolean z17, boolean z18, final boolean z19) {
        final boolean z27 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if (kx3.a.f394813a) {
                L(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.report.service.g0$$u
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.lang.String str2 = str;
                        boolean z28 = z19;
                        long j17 = i17;
                        long j18 = i18;
                        boolean z29 = kx3.a.f394814b;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.h(j17, j18, str2, z29, z29, z28);
                    }
                });
                return;
            } else {
                final boolean z28 = false;
                L(new java.lang.Runnable(i17, i18, str, z17, z28, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$v

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ int f239785d;

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ int f239786e;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ java.lang.String f239787f;

                    /* renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ boolean f239788g;

                    /* renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ boolean f239789h;

                    {
                        this.f239789h = z19;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.h(this.f239785d, this.f239786e, this.f239787f, this.f239788g, false, this.f239789h);
                    }
                });
                return;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p() && u()) {
            L(new java.lang.Runnable(i17, i18, str, z17, z27, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$w

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f239790d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f239791e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f239792f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f239793g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f239794h;

                {
                    this.f239794h = z19;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.i(this.f239790d, this.f239791e, this.f239792f, this.f239793g, false, this.f239794h);
                }
            });
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17197xb3ea717 c17197xb3ea717 = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17197xb3ea717();
        c17197xb3ea717.f239664d = i17;
        c17197xb3ea717.f239666f = str;
        c17197xb3ea717.f239665e = i18;
        c17197xb3ea717.f239668h = false;
        c17197xb3ea717.f239667g = z17;
        c17197xb3ea717.f239669i = z19;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.e(c17197xb3ea717);
    }

    @Override // jx3.c
    public void f(final int i17, final java.lang.String str, final boolean z17, boolean z18) {
        final boolean z19 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if (kx3.a.f394813a) {
                L(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.report.service.g0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.lang.String str2 = str;
                        long j17 = i17;
                        boolean z27 = kx3.a.f394814b;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.f(j17, str2, z27, z27, false);
                    }
                });
                return;
            } else {
                L(new java.lang.Runnable(i17, str, z17, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$l

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ int f239755d;

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ java.lang.String f239756e;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ boolean f239757f;

                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.f(this.f239755d, this.f239756e, this.f239757f, false, false);
                    }
                });
                return;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p() && u()) {
            L(new java.lang.Runnable(i17, str, z17, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$t

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f239778d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f239779e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f239780f;

                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.g(this.f239778d, this.f239779e, this.f239780f, false, false);
                }
            });
        } else {
            N(i17, str, false, z17, false);
        }
    }

    @Override // jx3.c
    public void g(int i17, boolean z17, boolean z18, boolean z19, java.lang.Object... objArr) {
        p(i17, w(objArr), z17, z18, z19);
    }

    @Override // jx3.c
    public boolean h(int i17, java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            mo68478xbd3cda5f(i17, str);
            return true;
        }
        if (this.f239707d == 0) {
            return false;
        }
        mo68478xbd3cda5f(i17, str);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @Override // jx3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(java.lang.String r18, java.lang.String r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.i(java.lang.String, java.lang.String, java.util.Map):void");
    }

    @Override // jx3.c
    /* renamed from: idkeyStat */
    public void mo68477x336bdfd8(final long j17, final long j18, final long j19, boolean z17) {
        boolean z18;
        final boolean z19 = false;
        if (j17 < 0 || j18 < 0 || j19 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReportManagerKvCheck", "ID %d, key %d, value %d <0", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.q qVar = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.q.INSTANCE;
        qVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.p pVar = qVar.f239836d[(((int) j17) ^ ((int) j18)) % 6];
        if (pVar != null && j17 == pVar.f239829a && j18 == pVar.f239830b) {
            java.util.concurrent.atomic.AtomicLong atomicLong = pVar.f239831c;
            if (atomicLong == null) {
                pVar.f239831c = new java.util.concurrent.atomic.AtomicLong(j19);
            } else {
                atomicLong.addAndGet(j19);
            }
            z18 = true;
        } else {
            z18 = false;
        }
        if (z18) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            final boolean z27 = false;
            L(new java.lang.Runnable(j17, j18, j19, z27) { // from class: com.tencent.mm.plugin.report.service.g0$$h

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f239745d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f239746e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f239747f;

                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.b(this.f239745d, this.f239746e, this.f239747f, false);
                }
            });
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p() && u() && this.f239710g) {
            L(new java.lang.Runnable(j17, j18, j19, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$i

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f239748d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f239749e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f239750f;

                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.c(this.f239748d, this.f239749e, this.f239750f, false);
                }
            });
        } else {
            M(j17, j18, j19, false);
        }
    }

    @Override // jx3.c
    public void j(final java.util.ArrayList arrayList, boolean z17, final boolean z18) {
        if (arrayList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReportManagerKvCheck", "report idkeyGroupStat lstIdKeyDataInfos == null return");
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = (com.p314xaae8f345.p542x3306d5.smc.C4582x424c344) it.next();
            if (c4582x424c344 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReportManagerKvCheck", "report idkeyGroupStat info == null return");
                return;
            } else if (c4582x424c344.m40327x4182ad1() < 0 || c4582x424c344.m40328x7eed3b49() < 0 || c4582x424c344.m40329x79249bdb() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReportManagerKvCheck", "report idkeyGroupStat ID %d, key %d, value %d <0", java.lang.Long.valueOf(c4582x424c344.m40327x4182ad1()), java.lang.Long.valueOf(c4582x424c344.m40328x7eed3b49()), java.lang.Long.valueOf(c4582x424c344.m40329x79249bdb()));
                return;
            }
        }
        final boolean z19 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            L(new java.lang.Runnable(arrayList, z19, z18) { // from class: com.tencent.mm.plugin.report.service.g0$$j

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ java.util.ArrayList f239751d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f239752e;

                {
                    this.f239752e = z18;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.a(this.f239751d, false, this.f239752e);
                }
            });
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p() && u() && this.f239710g) {
            L(new java.lang.Runnable(arrayList, z19, z18) { // from class: com.tencent.mm.plugin.report.service.g0$$k

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ java.util.ArrayList f239753d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f239754e;

                {
                    this.f239754e = z18;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z27 = this.f239754e;
                    java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.f239853a;
                    java.util.ArrayList arrayList2 = this.f239753d;
                    if (arrayList2 != null) {
                        boolean z28 = false;
                        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                            if (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.j.b((int) ((com.p314xaae8f345.p542x3306d5.smc.C4582x424c344) arrayList2.get(i17)).m40327x4182ad1())) {
                                java.lang.Exception exc = new java.lang.Exception("The IDKey has not applied yet, check your code. IDKey:(" + ((com.p314xaae8f345.p542x3306d5.smc.C4582x424c344) arrayList2.get(i17)).m40327x4182ad1() + "," + ((com.p314xaae8f345.p542x3306d5.smc.C4582x424c344) arrayList2.get(i17)).m40328x7eed3b49() + ")");
                                boolean z29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KVEasyReport", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(exc));
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.b(1566L, 1L, 1L, false);
                                z28 = true;
                            }
                        }
                        if (z28) {
                            return;
                        }
                        try {
                            ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40382xfbde2a92((com.p314xaae8f345.p542x3306d5.smc.C4582x424c344[]) arrayList2.toArray(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344[arrayList2.size()]), false, z27);
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KVEasyReport", th6, "", new java.lang.Object[0]);
                            if (!fp.h.a(20)) {
                                throw th6;
                            }
                            ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40382xfbde2a92((com.p314xaae8f345.p542x3306d5.smc.C4582x424c344[]) arrayList2.toArray(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344[arrayList2.size()]), false, z27);
                        }
                    }
                }
            });
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.f239657a;
        arrayList.size();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.j.b((int) ((com.p314xaae8f345.p542x3306d5.smc.C4582x424c344) arrayList.get(i17)).m40327x4182ad1())) {
                java.lang.Exception exc = new java.lang.Exception("The IDKey has not applied yet, check your code. IDKey:(" + ((com.p314xaae8f345.p542x3306d5.smc.C4582x424c344) arrayList.get(i17)).m40327x4182ad1() + "," + ((com.p314xaae8f345.p542x3306d5.smc.C4582x424c344) arrayList.get(i17)).m40328x7eed3b49() + ")");
                boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KVCommCrossProcessReceiver", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(exc));
                ((com.p314xaae8f345.p542x3306d5.smc.C4582x424c344) arrayList.get(i17)).m40330x4c144dd(1566);
                ((com.p314xaae8f345.p542x3306d5.smc.C4582x424c344) arrayList.get(i17)).m40331x936762bd(1);
                ((com.p314xaae8f345.p542x3306d5.smc.C4582x424c344) arrayList.get(i17)).m40332x57b2b64f(1L);
            }
        }
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.f239663g) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17194xb20112dd c17194xb20112dd = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17194xb20112dd(arrayList, false, z18);
            long size = (c17194xb20112dd.f239654d.size() * 28) + 4 + 4 + 4;
            if (size >= 102400) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KVCommCrossProcessReceiver", new java.lang.Throwable(), "grouped id-key data too large: %s", java.lang.Long.valueOf(size));
            }
            if (size >= 307200) {
                throw new java.lang.OutOfMemoryError("grouped id-key data too large: " + size);
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.f239659c == 0 || com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.a(size)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.c();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17193xfa87980b c17193xfa87980b = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.f239661e;
            c17193xfa87980b.f239652f.add(c17194xb20112dd);
            c17193xfa87980b.a((c17194xb20112dd.f239654d.size() * 28) + 4 + 4 + 4 + 4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.b();
    }

    @Override // jx3.c
    public void k(int i17, int i18, int i19, int i27, int i28, int i29, boolean z17) {
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c344.m40330x4c144dd(i17);
        c4582x424c344.m40331x936762bd(i19);
        c4582x424c344.m40332x57b2b64f(i28);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3442.m40330x4c144dd(i18);
        c4582x424c3442.m40331x936762bd(i27);
        c4582x424c3442.m40332x57b2b64f(i29);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c4582x424c344);
        arrayList.add(c4582x424c3442);
        j(arrayList, z17, false);
    }

    @Override // jx3.c
    /* renamed from: kvStat */
    public void mo68478xbd3cda5f(int i17, java.lang.String str) {
        if (!kx3.a.f394813a) {
            f(i17, str, false, false);
        } else {
            boolean z17 = kx3.a.f394814b;
            f(i17, str, z17, z17);
        }
    }

    @Override // jx3.c
    public void l(int i17, java.util.List list) {
        if (!kx3.a.f394813a) {
            D(i17, list, false, false);
        } else {
            boolean z17 = kx3.a.f394814b;
            D(i17, list, z17, z17);
        }
    }

    @Override // jx3.c
    public void m(int i17, int i18, int i19, int i27, boolean z17) {
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c344.m40330x4c144dd(i17);
        c4582x424c344.m40331x936762bd(i18);
        c4582x424c344.m40332x57b2b64f(i27);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3442.m40330x4c144dd(i17);
        c4582x424c3442.m40331x936762bd(i19);
        c4582x424c3442.m40332x57b2b64f(1L);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c4582x424c344);
        arrayList.add(c4582x424c3442);
        j(arrayList, false, false);
    }

    @Override // jx3.c
    public void n(final int i17, final int i18, final java.lang.String str, final boolean z17, boolean z18) {
        final boolean z19 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if (kx3.a.f394813a) {
                L(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.report.service.g0$$e
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.lang.String str2 = str;
                        long j17 = i17;
                        long j18 = i18;
                        boolean z27 = kx3.a.f394814b;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.h(j17, j18, str2, z27, z27, false);
                    }
                });
                return;
            } else {
                final boolean z27 = false;
                L(new java.lang.Runnable(i17, i18, str, z17, z27) { // from class: com.tencent.mm.plugin.report.service.g0$$f

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ int f239737d;

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ int f239738e;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ java.lang.String f239739f;

                    /* renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ boolean f239740g;

                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.h(this.f239737d, this.f239738e, this.f239739f, this.f239740g, false, false);
                    }
                });
                return;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p() && u()) {
            L(new java.lang.Runnable(i17, i18, str, z17, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$g

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f239741d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f239742e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f239743f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f239744g;

                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.i(this.f239741d, this.f239742e, this.f239743f, this.f239744g, false, false);
                }
            });
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17197xb3ea717 c17197xb3ea717 = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17197xb3ea717();
        c17197xb3ea717.f239664d = i17;
        c17197xb3ea717.f239666f = str;
        c17197xb3ea717.f239665e = i18;
        c17197xb3ea717.f239668h = false;
        c17197xb3ea717.f239667g = z17;
        c17197xb3ea717.f239669i = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.e(c17197xb3ea717);
    }

    @Override // jx3.c
    public void o() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37523x79d8456e(0);
            if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
                com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84236x79d8456e(0);
            }
        }
    }

    @Override // jx3.c
    public void p(final int i17, final java.lang.String str, final boolean z17, boolean z18, final boolean z19) {
        final boolean z27 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if (kx3.a.f394813a) {
                L(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.report.service.g0$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.lang.String str2 = str;
                        boolean z28 = z19;
                        long j17 = i17;
                        boolean z29 = kx3.a.f394814b;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.f(j17, str2, z29, z29, z28);
                    }
                });
                return;
            } else {
                final boolean z28 = false;
                L(new java.lang.Runnable(i17, str, z17, z28, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$c

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ int f239726d;

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ java.lang.String f239727e;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ boolean f239728f;

                    /* renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ boolean f239729g;

                    {
                        this.f239729g = z19;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.f(this.f239726d, this.f239727e, this.f239728f, false, this.f239729g);
                    }
                });
                return;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p() && u()) {
            L(new java.lang.Runnable(i17, str, z17, z27, z19) { // from class: com.tencent.mm.plugin.report.service.g0$$d

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f239730d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f239731e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f239732f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f239733g;

                {
                    this.f239733g = z19;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.g(this.f239730d, this.f239731e, this.f239732f, false, this.f239733g);
                }
            });
        } else {
            N(i17, str, false, z17, z19);
        }
    }

    @Override // jx3.c
    public void r(int i17, boolean z17, boolean z18, java.lang.Object... objArr) {
        G(i17, z17, z18, false, objArr);
    }

    public void t(java.lang.String str, java.lang.String str2) {
        i(str, str2, null);
    }

    public final boolean u() {
        return !this.f239709f && (this.f239708e || ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).Ui());
    }

    public java.lang.String w(java.lang.Object... objArr) {
        return jx3.f.INSTANCE.s(objArr);
    }

    public void y(int i17, int i18, int i19, boolean z17) {
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c344.m40330x4c144dd(i17);
        c4582x424c344.m40331x936762bd(i18);
        c4582x424c344.m40332x57b2b64f(1L);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3442.m40330x4c144dd(i17);
        c4582x424c3442.m40331x936762bd(i19);
        c4582x424c3442.m40332x57b2b64f(1L);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c4582x424c344);
        arrayList.add(c4582x424c3442);
        j(arrayList, false, false);
    }
}
