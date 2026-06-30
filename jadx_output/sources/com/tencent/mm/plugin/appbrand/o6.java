package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class o6 extends ze.n implements com.tencent.mm.plugin.appbrand.launching.y4, cf.h {

    /* renamed from: n3, reason: collision with root package name */
    public static final boolean f86162n3;

    /* renamed from: o3, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f86163o3;
    public i81.b0 A2;
    public final bm5.z0 B2;
    public int C2;
    public com.tencent.mm.plugin.appbrand.c D2;
    public ze.p E2;
    public final com.tencent.mm.plugin.appbrand.report.i2 F2;
    public final com.tencent.mm.plugin.appbrand.report.h2 G2;
    public final com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 H2;
    public final com.tencent.mm.plugin.appbrand.widget.h I2;
    public final com.tencent.mm.plugin.appbrand.na J2;
    public n91.g K2;
    public com.tencent.mm.plugin.appbrand.page.t L2;
    public com.tencent.mm.plugin.appbrand.report.model.t0 M2;
    public com.tencent.mm.sdk.event.IListener N2;
    public final bm5.i1 O2;
    public final bm5.i1 P2;
    public android.util.LongSparseArray Q2;
    public com.tencent.mm.plugin.appbrand.report.quality.h1 R2;
    public final java.lang.Object S2;
    public volatile zd1.a0 T2;
    public final com.tencent.mm.plugin.appbrand.game.preload.i[] U2;
    public final com.tencent.mm.plugin.appbrand.page.ye[] V2;
    public final com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a[] W2;
    public boolean X2;
    public final bm5.z0 Y2;
    public com.tencent.mm.plugin.appbrand.screenshot.w Z2;

    /* renamed from: a3, reason: collision with root package name */
    public final java.lang.Object f86164a3;

    /* renamed from: b3, reason: collision with root package name */
    public ih1.u f86165b3;

    /* renamed from: c3, reason: collision with root package name */
    public boolean f86166c3;

    /* renamed from: d3, reason: collision with root package name */
    public boolean f86167d3;

    /* renamed from: e3, reason: collision with root package name */
    public re.n f86168e3;

    /* renamed from: f3, reason: collision with root package name */
    public final bm5.x0 f86169f3;

    /* renamed from: g3, reason: collision with root package name */
    public final bm5.z0 f86170g3;

    /* renamed from: h3, reason: collision with root package name */
    public xa1.b f86171h3;

    /* renamed from: i2, reason: collision with root package name */
    public final bm5.x0 f86172i2;

    /* renamed from: i3, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.task.w0 f86173i3;

    /* renamed from: j2, reason: collision with root package name */
    public java.lang.String f86174j2;

    /* renamed from: j3, reason: collision with root package name */
    public final java.util.Queue f86175j3;

    /* renamed from: k2, reason: collision with root package name */
    public final vd1.b f86176k2;

    /* renamed from: k3, reason: collision with root package name */
    public xi1.q f86177k3;

    /* renamed from: l2, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.report.model.l0 f86178l2;

    /* renamed from: l3, reason: collision with root package name */
    public final bm5.i1 f86179l3;

    /* renamed from: m2, reason: collision with root package name */
    public boolean f86180m2;

    /* renamed from: m3, reason: collision with root package name */
    public final ph.f f86181m3;

    /* renamed from: n2, reason: collision with root package name */
    public volatile boolean f86182n2;

    /* renamed from: o2, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f86183o2;

    /* renamed from: p2, reason: collision with root package name */
    public int f86184p2;

    /* renamed from: q2, reason: collision with root package name */
    public boolean f86185q2;

    /* renamed from: r2, reason: collision with root package name */
    public final java.util.List f86186r2;

    /* renamed from: s2, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f86187s2;

    /* renamed from: t2, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.j3 f86188t2;

    /* renamed from: u2, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.ae f86189u2;

    /* renamed from: v2, reason: collision with root package name */
    public volatile u65.a f86190v2;

    /* renamed from: w2, reason: collision with root package name */
    public volatile u65.a f86191w2;

    /* renamed from: x2, reason: collision with root package name */
    public android.content.res.Configuration f86192x2;

    /* renamed from: y2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.floatball.u f86193y2;

    /* renamed from: z2, reason: collision with root package name */
    public rh1.j f86194z2;

    static {
        if (!m91.f.f324952b.getAndSet(true)) {
            com.tencent.mm.app.MMCrashReportContents.S.f(m91.d.f324949d);
            com.tencent.mm.app.MMBugReportContents.f53230k.f53733w.f(m91.e.f324950d);
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        f86162n3 = z65.c.a() || com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d || o45.wf.f343033k || o45.wf.f343034l;
        f86163o3 = new java.util.concurrent.atomic.AtomicInteger(1);
    }

    public o6(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC) {
        super((com.tencent.mm.plugin.appbrand.hc) appBrandRuntimeContainerWC);
        this.f86172i2 = new bm5.x0(new com.tencent.mm.plugin.appbrand.o6$$a());
        this.f86174j2 = "";
        this.f86176k2 = new vd1.b();
        this.f86182n2 = false;
        this.f86183o2 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f86184p2 = 0;
        this.f86186r2 = new java.util.LinkedList();
        this.f86187s2 = null;
        this.B2 = new bm5.z0(new bm5.y0() { // from class: com.tencent.mm.plugin.appbrand.o6$$l
            @Override // bm5.y0
            public final boolean a() {
                return com.tencent.mm.plugin.appbrand.o6.A2(com.tencent.mm.plugin.appbrand.o6.this);
            }
        });
        this.C2 = 0;
        this.G2 = new com.tencent.mm.plugin.appbrand.report.h2(this);
        this.H2 = new com.tencent.mm.plugin.appbrand.widget.halfscreen.l0(this);
        this.I2 = new com.tencent.mm.plugin.appbrand.widget.h(this);
        this.J2 = new com.tencent.mm.plugin.appbrand.na(this);
        this.K2 = null;
        this.O2 = new bm5.i1(new bm5.h1() { // from class: com.tencent.mm.plugin.appbrand.o6$$t
            @Override // bm5.h1
            public final java.lang.Object a() {
                boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                o6Var.getClass();
                return new com.tencent.mm.plugin.appbrand.n6(o6Var);
            }
        }, null);
        this.P2 = new bm5.i1(new bm5.h1() { // from class: com.tencent.mm.plugin.appbrand.o6$$u
            @Override // bm5.h1
            public final java.lang.Object a() {
                boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                o6Var.getClass();
                return new com.tencent.mm.plugin.appbrand.launching.rc(o6Var);
            }
        }, null);
        this.S2 = new byte[0];
        this.U2 = new com.tencent.mm.plugin.appbrand.game.preload.i[]{null};
        this.V2 = new com.tencent.mm.plugin.appbrand.page.ye[]{null};
        this.W2 = new com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a[]{null};
        this.Y2 = new bm5.z0(new com.tencent.mm.plugin.appbrand.o6$$v());
        this.Z2 = null;
        this.f86164a3 = new java.lang.Object();
        this.f86165b3 = null;
        this.f86166c3 = false;
        this.f86167d3 = false;
        this.f86169f3 = new bm5.x0(new bm5.w0() { // from class: com.tencent.mm.plugin.appbrand.o6$$w
            @Override // bm5.w0
            public final java.lang.Object a() {
                boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                o6Var.getClass();
                return new com.tencent.mm.plugin.appbrand.b7(o6Var);
            }
        });
        this.f86170g3 = new bm5.z0(new bm5.y0() { // from class: com.tencent.mm.plugin.appbrand.o6$$x
            @Override // bm5.y0
            public final boolean a() {
                return com.tencent.mm.plugin.appbrand.o6.z2(com.tencent.mm.plugin.appbrand.o6.this);
            }
        });
        iz5.a.g("AppBrandRuntimeWC's initial context should be AppBrandRuntimePersistentContextWrapper", this.f74795d instanceof com.tencent.mm.plugin.appbrand.ui.z6);
        this.F2 = new com.tencent.mm.plugin.appbrand.report.i2();
        this.I1 = f86162n3;
        this.f86173i3 = new com.tencent.mm.plugin.appbrand.x7(this);
        this.f86175j3 = new java.util.concurrent.LinkedBlockingQueue();
        this.f86179l3 = new bm5.i1(new bm5.h1() { // from class: com.tencent.mm.plugin.appbrand.o6$$y
            @Override // bm5.h1
            public final java.lang.Object a() {
                boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                o6Var.getClass();
                return new com.tencent.mm.plugin.appbrand.trade.d(o6Var);
            }
        }, null);
        this.f86181m3 = new com.tencent.mm.plugin.appbrand.e8(this, true);
        O1(appBrandRuntimeContainerWC);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A2(com.tencent.mm.plugin.appbrand.o6 r13) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.o6.A2(com.tencent.mm.plugin.appbrand.o6):boolean");
    }

    public static boolean B2() {
        int i17;
        jz5.g gVar = com.tencent.mm.plugin.appbrand.utils.s.f90548a;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z65.c.a() || (i17 = com.tencent.mm.sdk.platformtools.o4.M("appbrand_debug_expt").getInt("afterlaunch_advance_override", -1)) < 0) {
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            if ((e0Var != null ? ((h62.d) e0Var).Ni(e42.c0.clicfg_android_wxa_afterlaunch_advance, 0) : 0) == 1) {
                return true;
            }
        } else if (i17 == 1) {
            return true;
        }
        return false;
    }

    public static com.tencent.mm.plugin.appbrand.launching.r1 D2(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.u8 u8Var, com.tencent.mm.plugin.appbrand.a6 a6Var) {
        com.tencent.mm.plugin.appbrand.keylogger.w.g(o6Var.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareResourceGroup);
        com.tencent.mm.plugin.appbrand.keylogger.w.g(o6Var.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareResourceWaitForResult);
        o6Var.H.d();
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.appbrand.launching.r1 r1Var = new com.tencent.mm.plugin.appbrand.launching.r1(o6Var.r0(), o6Var);
        r1Var.f85094c = new com.tencent.mm.plugin.appbrand.launching.e1(r1Var, o6Var, new com.tencent.mm.plugin.appbrand.n7(o6Var, r1Var, u8Var));
        o6Var.K("before startPrepare(), task[%d]", java.lang.Integer.valueOf(r1Var.hashCode()));
        r1Var.c();
        return r1Var;
    }

    public static void E2(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        super.b1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void J2(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        try {
            com.tencent.luggage.sdk.launching.k.b(appBrandInitConfigWC.f47274p1);
            com.tencent.luggage.sdk.launching.k.b(appBrandInitConfigWC.f47272l1);
            com.tencent.luggage.sdk.launching.k.b(appBrandInitConfigWC.f47280x1);
            com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy weAppOpenUICallbackIPCProxy = appBrandInitConfigWC.f77313z2;
            if (weAppOpenUICallbackIPCProxy != null) {
                com.tencent.luggage.sdk.launching.k.b(weAppOpenUICallbackIPCProxy.f84476d);
                com.tencent.luggage.sdk.launching.k.b(weAppOpenUICallbackIPCProxy.f84477e);
                com.tencent.luggage.sdk.launching.k.b(weAppOpenUICallbackIPCProxy.f84478f);
                com.tencent.luggage.sdk.launching.k.b(weAppOpenUICallbackIPCProxy.f84479g);
            }
            com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener = appBrandInitConfigWC.L1.f77366p;
            if (weAppHalfScreenStatusChangeListener != null) {
                android.os.ResultReceiver resultReceiver = weAppHalfScreenStatusChangeListener.f77397e;
                if (resultReceiver != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    k91.q3[] q3VarArr = k91.q3.f305733d;
                    bundle.putInt("action", 4);
                    resultReceiver.send(0, bundle);
                }
                appBrandInitConfigWC.L1.f77366p = null;
            }
        } finally {
            appBrandInitConfigWC.f47274p1 = null;
            appBrandInitConfigWC.f47272l1 = null;
            appBrandInitConfigWC.f77313z2 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r0.C != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean z2(com.tencent.mm.plugin.appbrand.o6 r6) {
        /*
            boolean r0 = r6.e3()
            r1 = 0
            if (r0 != 0) goto L9
            goto L95
        L9:
            boolean r0 = com.tencent.mm.plugin.appbrand.o6.f86162n3
            r2 = 1
            if (r0 == 0) goto L1a
            java.lang.String r0 = "SAVE_STACK_WHEN_LOOP_JUMP"
            com.tencent.mm.sdk.platformtools.o4 r3 = k91.d1.f305561a
            boolean r0 = r3.getBoolean(r0, r1)
            if (r0 == 0) goto L1a
            goto L85
        L1a:
            k91.r r0 = r6.m0()
            java.lang.String r3 = "MicroMsg.AppBrandRuntimeWC"
            if (r0 == 0) goto L27
            boolean r0 = r0.C
            if (r0 == 0) goto L2d
            goto L85
        L27:
            java.lang.String r0 = "supportSaveStackWhenLoopJump config is null "
            com.tencent.mars.xlog.Log.i(r3, r0)
        L2d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "clicfg_weapp_cycle_jump_keep_context_android_"
            r0.<init>(r4)
            java.lang.String r4 = r6.f74803n
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.Class<e42.e0> r4 = e42.e0.class
            i95.m r4 = i95.n0.c(r4)
            e42.e0 r4 = (e42.e0) r4
            java.lang.String r5 = ""
            h62.d r4 = (h62.d) r4
            java.lang.String r0 = r4.aj(r0, r5)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L95
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L87
            r4.<init>(r0)     // Catch: java.lang.Exception -> L87
            java.lang.String r0 = "keepContextPageInCycleJump"
            int r0 = r4.optInt(r0, r2)     // Catch: java.lang.Exception -> L87
            if (r0 != r2) goto L62
            r0 = r2
            goto L63
        L62:
            r0 = r1
        L63:
            java.lang.String r5 = "supportInnerVersion"
            int r4 = r4.optInt(r5, r1)     // Catch: java.lang.Exception -> L87
            int r5 = r6.d2()     // Catch: java.lang.Exception -> L87
            if (r4 <= r5) goto L80
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r4 = r6.f74805p     // Catch: java.lang.Exception -> L87
            int r4 = r4.f77281g     // Catch: java.lang.Exception -> L87
            if (r4 == r2) goto L80
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r6 = r6.f74805p     // Catch: java.lang.Exception -> L87
            int r6 = r6.f77281g     // Catch: java.lang.Exception -> L87
            r3 = 2
            if (r6 != r3) goto L7e
            goto L80
        L7e:
            r6 = r1
            goto L81
        L80:
            r6 = r2
        L81:
            if (r0 == 0) goto L95
            if (r6 == 0) goto L95
        L85:
            r1 = r2
            goto L95
        L87:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r0 = "getSupportSaveStackWhenLoopJumpConfig Exception:%s"
            com.tencent.mars.xlog.Log.e(r3, r0, r6)
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.o6.z2(com.tencent.mm.plugin.appbrand.o6):boolean");
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public int A0(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.d5 x07;
        if (!gf.y0.a(this, str) || (x07 = x0()) == null) {
            return -1;
        }
        k91.r m07 = m0();
        if (!((m07 == null || m07.e() == null) ? false : m07.e().a(str))) {
            com.tencent.mm.plugin.appbrand.page.w2 currentPage = x07.getCurrentPage();
            if (currentPage != null && currentPage.B() && (!(currentPage instanceof com.tencent.mm.plugin.appbrand.page.y1) || m0().e().f305688f)) {
                return currentPage.getCurrentWindowId();
            }
        } else if (x07.getTabWindowId() != -1) {
            return x07.getTabWindowId();
        }
        return -1;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void A1(com.tencent.mm.plugin.appbrand.hc hcVar, com.tencent.mm.plugin.appbrand.PopPageStackType popPageStackType) {
        com.tencent.mm.plugin.appbrand.z5 z5Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "removeAppBrandRuntimePageStack reason " + popPageStackType + " ,mAppBrandRuntimeStacks: " + this.f74797f.size());
        if (this.f74797f.size() >= 2) {
            android.app.Activity r07 = r0();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if (popPageStackType == com.tencent.mm.plugin.appbrand.PopPageStackType.Activity_Finish || popPageStackType == com.tencent.mm.plugin.appbrand.PopPageStackType.Activity_Destroy) {
                for (int size = this.f74797f.size() - 1; size >= 0; size--) {
                    com.tencent.mm.plugin.appbrand.z5 z5Var2 = (com.tencent.mm.plugin.appbrand.z5) this.f74797f.get(size);
                    if (z5Var2.f92444a == hcVar) {
                        linkedList.add(z5Var2);
                    }
                }
            } else if (popPageStackType == com.tencent.mm.plugin.appbrand.PopPageStackType.Call_Runtime_Close) {
                int size2 = this.f74797f.size() - 1;
                while (true) {
                    if (size2 < 0) {
                        break;
                    }
                    com.tencent.mm.plugin.appbrand.z5 z5Var3 = (com.tencent.mm.plugin.appbrand.z5) this.f74797f.get(size2);
                    if (z5Var3.f92444a == hcVar) {
                        linkedList.add(z5Var3);
                        break;
                    }
                    size2--;
                }
            } else if (popPageStackType == com.tencent.mm.plugin.appbrand.PopPageStackType.Remove_from_Stack) {
                int size3 = this.f74797f.size() - 1;
                while (true) {
                    if (size3 < 0) {
                        break;
                    }
                    com.tencent.mm.plugin.appbrand.z5 z5Var4 = (com.tencent.mm.plugin.appbrand.z5) this.f74797f.get(size3);
                    if (z5Var4.f92444a == hcVar) {
                        linkedList.add(z5Var4);
                        break;
                    }
                    size3--;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "removeAppBrandRuntimePageStack removeStack " + linkedList);
            if (linkedList.isEmpty()) {
                return;
            }
            int size4 = this.f74797f.size() - 1;
            while (true) {
                if (size4 < 0) {
                    z5Var = null;
                    break;
                }
                z5Var = (com.tencent.mm.plugin.appbrand.z5) this.f74797f.get(size4);
                if (!linkedList.contains(z5Var)) {
                    break;
                } else {
                    size4--;
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Is resumeStack currentStack ? ");
            sb6.append(z5Var == this.f74797f.peekLast());
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", sb6.toString());
            if (z5Var == this.f74797f.peekLast()) {
                linkedList.forEach(new java.util.function.Consumer() { // from class: com.tencent.mm.plugin.appbrand.o6$$g
                    @Override // java.util.function.Consumer
                    public final void accept(java.lang.Object obj) {
                        com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                        com.tencent.mm.plugin.appbrand.z5 z5Var5 = (com.tencent.mm.plugin.appbrand.z5) obj;
                        boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                        o6Var.f74797f.remove(z5Var5);
                        com.tencent.mm.plugin.appbrand.page.i3 i3Var = z5Var5.f92445b;
                        if (i3Var != o6Var.f74809r) {
                            if (i3Var instanceof com.tencent.mm.plugin.appbrand.page.d5) {
                                com.tencent.mm.plugin.appbrand.page.r5.a((com.tencent.mm.plugin.appbrand.page.d5) i3Var);
                            }
                            if (i3Var != null) {
                                i3Var.h();
                            }
                        }
                        o6Var.N.a(new com.tencent.mm.plugin.appbrand.h8(o6Var, z5Var5));
                    }
                });
                return;
            }
            this.f74796e = z5Var.f92444a;
            if (r07 != z5Var.a()) {
                android.view.ViewParent parent = this.f74810s.getParent();
                if (parent instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) parent).removeView(this.f74810s);
                }
                this.f74796e.m(this.f74810s);
                ((com.tencent.mm.plugin.appbrand.ui.z6) this.f74795d).setBaseContext(z5Var.a());
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "is same activity, do not need call attachRtViewToTree");
            }
            com.tencent.mm.plugin.appbrand.page.d5 x07 = x0();
            com.tencent.mm.plugin.appbrand.page.w2 currentPage = x07.getCurrentPage();
            com.tencent.mm.plugin.appbrand.ef efVar = com.tencent.mm.plugin.appbrand.ef.AppBrandPageContainer;
            efVar.b(this, x07);
            this.f74809r = z5Var.f92445b;
            efVar.a(this, this.f74809r);
            com.tencent.mm.plugin.appbrand.page.w2 currentPage2 = this.f74809r.getCurrentPage();
            if (currentPage2 != null) {
                this.f74809r.x(currentPage, currentPage2);
            }
            linkedList.forEach(new java.util.function.Consumer() { // from class: com.tencent.mm.plugin.appbrand.o6$$h
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                    com.tencent.mm.plugin.appbrand.z5 z5Var5 = (com.tencent.mm.plugin.appbrand.z5) obj;
                    boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                    o6Var.f74797f.remove(z5Var5);
                    com.tencent.mm.plugin.appbrand.page.i3 i3Var = z5Var5.f92445b;
                    if (i3Var != o6Var.f74809r) {
                        if (i3Var instanceof com.tencent.mm.plugin.appbrand.page.d5) {
                            com.tencent.mm.plugin.appbrand.page.r5.a((com.tencent.mm.plugin.appbrand.page.d5) i3Var);
                        }
                        if (i3Var != null) {
                            i3Var.h();
                        }
                    }
                    o6Var.N.a(new com.tencent.mm.plugin.appbrand.j8(o6Var, z5Var5));
                }
            });
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig = z5Var.f92446c;
            if (appBrandInitConfig instanceof com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) {
                ((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) appBrandInitConfig).I2 = true;
            }
            if (this.N.b() == u81.b.BACKGROUND) {
                U1(appBrandInitConfig);
            } else {
                this.N.a(new com.tencent.mm.plugin.appbrand.k8(this, appBrandInitConfig));
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeWC", "removeAppBrandRuntimePageStack error");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "removeAppBrandRuntimePageStack after ,mAppBrandRuntimeStacks: " + this.f74797f.size());
    }

    public final com.tencent.mm.plugin.appbrand.jsapi.g0 C2(java.lang.Class cls) {
        java.util.ArrayList arrayList;
        if (uh1.a.class != cls) {
            if (com.tencent.mm.plugin.appbrand.jsapi.file.h.class == cls) {
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting wxaAttributes$WxaDynamicInfo$Setting = u0().R;
                java.lang.String str = this.f74803n;
                int i17 = wxaAttributes$WxaDynamicInfo$Setting.f77409d;
                k91.f1 f1Var = k91.g1.f305588d;
                f1Var.getClass();
                if (!android.text.TextUtils.isEmpty(str)) {
                    synchronized (f1Var.f305580a) {
                        f1Var.f305580a.put(str.hashCode(), i17);
                    }
                }
                java.lang.String str2 = this.f74803n;
                int i18 = wxaAttributes$WxaDynamicInfo$Setting.f77410e;
                k91.f1 f1Var2 = k91.g1.f305589e;
                f1Var2.getClass();
                if (!android.text.TextUtils.isEmpty(str2)) {
                    synchronized (f1Var2.f305580a) {
                        f1Var2.f305580a.put(str2.hashCode(), i18);
                    }
                }
                return com.tencent.mm.plugin.appbrand.config.a.b(u0());
            }
            if (com.tencent.mm.plugin.appbrand.utils.t3.class == cls) {
                java.lang.String str3 = com.tencent.mm.plugin.appbrand.config.a.f77518a;
                com.tencent.mm.plugin.appbrand.utils.t3 t3Var = new com.tencent.mm.plugin.appbrand.utils.t3();
                t3Var.f90566h = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().B;
                return t3Var;
            }
            if (u81.a.class == cls) {
                java.lang.String str4 = com.tencent.mm.plugin.appbrand.config.a.f77518a;
                com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = E0();
                k91.r m07 = m0();
                u81.a aVar = new u81.a();
                if (E0 != null && m07 != null) {
                    if (com.tencent.mm.plugin.appbrand.appcache.g0.a(E0.f305852r.f75399d)) {
                        aVar.f425398d = ((java.util.HashSet) m07.f305750t).contains("audio");
                        aVar.f425399e = ((java.util.HashSet) m07.f305750t).contains(ya.b.LOCATION);
                        aVar.f425400f = ((java.util.HashSet) m07.f305750t).contains("bluetooth");
                    } else {
                        aVar.f425398d = E0.f305845h;
                        aVar.f425399e = E0.f305846i;
                        aVar.f425400f = E0.f305847m;
                    }
                }
                return aVar;
            }
            if (com.tencent.mm.plugin.appbrand.performance.a.class != cls) {
                return null;
            }
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E02 = E0();
            if (E02 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeWC", "RUNTIME_CONFIG_FACTORY for appId:%s, AppBrandMonitorConfig, null SysConfig", this.f74803n);
                return null;
            }
            java.lang.String str5 = com.tencent.mm.plugin.appbrand.config.a.f77518a;
            com.tencent.mm.plugin.appbrand.performance.a aVar2 = new com.tencent.mm.plugin.appbrand.performance.a();
            aVar2.f87324d = E02.f47297x && (E02.f305852r.f75399d == 1 || E02.f305852r.f75399d == 2 || z65.c.a());
            r3 = E02.f305852r.f75399d != 0;
            aVar2.f87325e = r3;
            aVar2.f87326f = E02.f47296w;
            aVar2.f87324d |= com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d;
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            aVar2.f87325e = z65.c.a() | r3;
            return aVar2;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E03 = E0();
        if (E03 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeWC", "RUNTIME_CONFIG_FACTORY for appId:%s, AppBrandNetworkConfig, null SysConfig", this.f74803n);
            return null;
        }
        k91.r m08 = m0();
        if (m08 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeWC", "RUNTIME_CONFIG_FACTORY for appId:%s, AppBrandNetworkConfig, null AppConfig", this.f74803n);
            return null;
        }
        java.lang.String str7 = com.tencent.mm.plugin.appbrand.config.a.f77518a;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = u0();
        uh1.a aVar3 = new uh1.a();
        java.lang.Boolean bool = u07.A;
        if (bool != null) {
            bool.booleanValue();
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(u07.N.f77455r)) {
            u07.A = java.lang.Boolean.FALSE;
        } else {
            try {
                org.json.JSONArray optJSONArray = new org.json.JSONObject(u07.N.f77455r).optJSONArray("call_plugin_info");
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(optJSONArray != null && optJSONArray.length() > 0);
                u07.A = valueOf;
                valueOf.booleanValue();
            } catch (java.lang.Exception unused) {
            }
        }
        aVar3.f427740d = com.tencent.mm.plugin.appbrand.config.a.c(E03);
        k91.e eVar = m08.f305747q;
        int i19 = eVar.f305563a;
        if (i19 > 0) {
            aVar3.f427741e = i19;
        }
        int i27 = eVar.f305564b;
        if (i27 > 0) {
            aVar3.f427742f = i27;
        }
        int i28 = eVar.f305565c;
        if (i28 > 0) {
            aVar3.f427743g = i28;
        }
        int i29 = eVar.f305566d;
        if (i29 > 0) {
            aVar3.f427744h = i29;
        }
        aVar3.f427745i = E03.F;
        aVar3.f427746m = E03.I;
        aVar3.f427747n = E03.G;
        aVar3.f427748o = E03.H;
        aVar3.f427749p = E03.P;
        aVar3.f427750q = E03.Q;
        aVar3.f427751r = E03.R;
        aVar3.f427752s = E03.S;
        aVar3.f427753t = E03.T;
        aVar3.f427754u = E03.U;
        com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.HttpSetting httpSetting = E03.Y.f77221s;
        int i37 = httpSetting.f77251d;
        if (i37 == 1) {
            java.util.ArrayList arrayList2 = httpSetting.f77252e;
            if (arrayList2 != null) {
                aVar3.f427755v = arrayList2;
            }
        } else if (i37 == 2 && (arrayList = httpSetting.f77253f) != null) {
            aVar3.f427756w = arrayList;
        }
        aVar3.E = i37;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        ik1.b0 b0Var = new ik1.b0();
        getFileSystem().readFile("cer", b0Var);
        if (b0Var.f291824a != null) {
            byte[] a17 = ik1.f.a((java.nio.ByteBuffer) b0Var.f291824a);
            try {
                r45.uh4 uh4Var = new r45.uh4();
                uh4Var.parseFrom(a17);
                java.util.LinkedList linkedList = uh4Var.f387384d;
                if (linkedList != null) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((com.tencent.mm.protobuf.g) it.next()).f192156a);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("", "readPkgCertificate, parse error: " + e17);
            }
        }
        aVar3.f427757x = arrayList3;
        aVar3.f427758y = u07.k() ? E03.Y.E : E03.Y.f77210h;
        aVar3.f427759z = E03.Y.f77233z1;
        aVar3.A = E03.K;
        aVar3.G = E03.L;
        aVar3.B = k91.d3.a(com.tencent.mm.sdk.platformtools.x2.f193071a, k91.n0.a());
        com.tencent.mars.xlog.Log.i("Luggage.FULL.AppBrandConfigAdapter", "runtime(%s).getNetworkConfig.userAgentString = [ %s ]", this.f74803n, aVar3.B);
        sd1.a aVar4 = (sd1.a) nd.f.a(sd1.a.class);
        if (aVar4 != null) {
            aVar3.C = ((com.tencent.mm.plugin.appbrand.utils.p5) aVar4).a(m08.L);
        } else {
            com.tencent.mars.xlog.Log.w("", "getNetworkConfig, referrerHelper is null");
        }
        aVar3.D = com.tencent.mm.plugin.appbrand.config.a.a(E03);
        aVar3.F = u07.G;
        if (pe.a.f353588a != null) {
            java.lang.String a18 = j62.e.g().a("clicfg_appbrand_network_check_user_trust_ca", "", true, true);
            com.tencent.mars.xlog.Log.i("Luggage.FULL.AppBrandConfigAdapter", "exptCheckCA = %s", a18);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(a18) && a18.equalsIgnoreCase("false")) {
                aVar3.I = false;
            }
        } else {
            com.tencent.mars.xlog.Log.i("Luggage.FULL.AppBrandConfigAdapter", "exptCheckCA has no delegate");
        }
        boolean a19 = com.tencent.mm.plugin.appbrand.appcache.g0.a(E03.f305852r.f75399d);
        aVar3.H = a19;
        if (a19 || !com.tencent.mm.sdk.platformtools.t8.L0(aVar3.f427757x)) {
            com.tencent.mm.plugin.appbrand.service.c0 C0 = C0();
            com.tencent.mm.plugin.appbrand.jsruntime.t f147808e = C0 == null ? null : C0.getF147808e();
            com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var = f147808e != null ? (com.tencent.mm.plugin.appbrand.jsruntime.f0) f147808e.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class) : null;
            if (f0Var != null && f0Var.g()) {
                r3 = true;
            }
            if (!r3) {
                uh1.j0.r(aVar3);
            }
        }
        return aVar3;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public final com.tencent.mm.plugin.appbrand.ui.vc D0() {
        return this.f74811t;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.y4
    public void E(int i17) {
        com.tencent.mm.plugin.appbrand.ui.vc vcVar = this.f74811t;
        if (vcVar instanceof com.tencent.mm.plugin.appbrand.launching.y4) {
            ((com.tencent.mm.plugin.appbrand.launching.y4) vcVar).E(i17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public final void F1(boolean z17, java.lang.String str, com.tencent.mm.plugin.appbrand.appcache.y8 y8Var) {
        if (z17) {
            com.tencent.mm.plugin.appbrand.c6.a(53, u0());
            return;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig = u0();
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1906, 53);
        com.tencent.mm.plugin.appbrand.report.v0.i(initConfig.f77278d, com.tencent.mm.plugin.appbrand.appcache.g0.b(initConfig.f77281g) ? initConfig.N.f77444d : 0, initConfig.f77281g, 1906, 53, 1);
    }

    public void F2(java.lang.Runnable runnable) {
        com.tencent.mm.plugin.appbrand.c7 c7Var = new com.tencent.mm.plugin.appbrand.c7(this, runnable);
        this.f86175j3.add(c7Var);
        I1(c7Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void G1() {
        if (com.tencent.mm.plugin.appbrand.ui.u8.o(this)) {
            return;
        }
        super.G1();
    }

    public final void G2() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "callSuperClose appId:%s", this.f74803n);
        T(null, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void H1() {
        if (this.f74797f.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeWC", "resumeNewestPageStack error ");
            return;
        }
        java.util.LinkedList linkedList = this.f74797f;
        com.tencent.mm.plugin.appbrand.z5 z5Var = (com.tencent.mm.plugin.appbrand.z5) linkedList.get(linkedList.size() - 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "resumeNewestPageStack  " + z5Var.f92447d);
        com.tencent.mm.plugin.appbrand.page.i3 i3Var = z5Var.f92445b;
        if (i3Var == null || this.f74809r == i3Var) {
            return;
        }
        com.tencent.mm.plugin.appbrand.ef efVar = com.tencent.mm.plugin.appbrand.ef.AppBrandPageContainer;
        efVar.b(this, this.f74809r);
        this.f74809r = i3Var;
        efVar.a(this, this.f74809r);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        i3Var.c0(new com.tencent.mm.plugin.appbrand.page.k4(i3Var, z5Var.f92447d, null, null));
        m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.o6$$b
            @Override // java.lang.Runnable
            public final void run() {
                boolean z18 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                com.tencent.mm.plugin.appbrand.page.n7 N2 = o6Var.N2();
                long j17 = currentTimeMillis;
                if (N2 == null || N2.m2()) {
                    ((com.tencent.mm.plugin.appbrand.launching.rc) o6Var.P2.b()).b(com.tencent.mm.plugin.appbrand.page.wd.NAVIGATE_TO, j17);
                } else {
                    N2.P(new com.tencent.mm.plugin.appbrand.g8(o6Var, N2, j17));
                }
            }
        });
        x0().setActuallyVisible(true);
    }

    public android.graphics.Bitmap H2(boolean z17) {
        android.graphics.Bitmap b17;
        mi1.v vVar = this.f74821z;
        if (vVar != null && !z17) {
            vVar.k();
            mi1.v vVar2 = this.f74821z;
            if (vVar2.f326703b != null) {
                vVar2.c().setVisibility(4);
                com.tencent.mars.xlog.Log.i("AppBrandCapsuleBarManager", "hideCapsuleBar");
            }
        }
        boolean shouldInLargeScreenCompatMode = getWindowAndroid().shouldInLargeScreenCompatMode();
        com.tencent.mm.plugin.appbrand.widget.q qVar = this.f74810s;
        if (shouldInLargeScreenCompatMode) {
            int width = x0().getWidth();
            int height = x0().getHeight();
            if (qVar.getWidth() <= 0 || qVar.getHeight() <= 0 || width <= 0 || height <= 0) {
                b17 = null;
            } else {
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(java.lang.Integer.valueOf(width));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/page/ScreenshotDrawableTraversal", "getScreenshotBitmapForChildView", "(Landroid/view/ViewGroup;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                b17 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, b17, "com/tencent/mm/plugin/appbrand/page/ScreenshotDrawableTraversal", "getScreenshotBitmapForChildView", "(Landroid/view/ViewGroup;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Canvas canvas = new android.graphics.Canvas(b17);
                int childCount = qVar.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    com.tencent.mm.plugin.appbrand.page.ie.a(qVar.getChildAt(i17), qVar.getChildAt(i17), canvas);
                }
            }
        } else {
            b17 = com.tencent.mm.plugin.appbrand.page.ie.b(qVar);
        }
        mi1.v vVar3 = this.f74821z;
        if (vVar3 != null && !z17) {
            vVar3.j();
        }
        return b17;
    }

    @Override // cf.h
    public java.lang.String I() {
        return "AppBrandRuntimeWC@" + hashCode();
    }

    public final void I2() {
        if (!(u0().L1.c() || u0().M1) || r0() == null) {
            return;
        }
        if (n91.t.b(this)) {
            this.E2 = new n91.u(this, super.getWindowAndroid());
        } else {
            this.E2 = new com.tencent.mm.plugin.appbrand.widget.halfscreen.f(this, super.getWindowAndroid());
        }
        if (C0() != null) {
            C0().N0(getWindowAndroid());
        }
        com.tencent.mm.plugin.appbrand.page.n7 N2 = N2();
        if (N2 != null) {
            N2.N0(getWindowAndroid());
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public boolean J1() {
        boolean z17;
        boolean z18;
        com.tencent.mm.plugin.appbrand.page.i3 i3Var;
        boolean R0 = R0();
        if (R0) {
            z17 = this.f86170g3.a();
            if (z17) {
                java.util.LinkedList linkedList = this.f74797f;
                if (!linkedList.isEmpty() && (i3Var = ((com.tencent.mm.plugin.appbrand.z5) linkedList.get(0)).f92445b) != null) {
                    z18 = i3Var.D;
                }
            }
            z18 = false;
        } else {
            z17 = false;
            z18 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "runSaveStackWhenLoopJump? isInBackStack %s, supportSaveStackWhenLoopJump %s, firstPageReady %s", java.lang.Boolean.valueOf(R0), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        return R0 && z17 && z18;
    }

    public final void K2() {
        this.f74817x1 = false;
        com.tencent.mm.plugin.appbrand.hc hcVar = this.f74796e;
        if (hcVar != null) {
            try {
                hcVar.k(this);
            } finally {
                if (hcVar instanceof com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC) {
                    ((com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC) hcVar).a0();
                }
            }
        }
        l0();
    }

    public final void L2(java.lang.Runnable runnable) {
        if (runnable != null) {
            this.N.a(new com.tencent.mm.plugin.appbrand.r6(this, runnable));
        }
        l0();
    }

    public int[] M2(java.lang.String str) {
        int andIncrement = f86163o3.getAndIncrement();
        if (!"preload_skyline".equals(str)) {
            int A0 = A0(str);
            if (A0 == -1) {
                A0 = andIncrement;
            }
            com.tencent.mm.plugin.appbrand.utils.s3.b("MicroMsg.AppBrandRuntimeWC", "genWindowAndPageId url:[%s] ids:[%d]-[%d]", str, java.lang.Integer.valueOf(A0), java.lang.Integer.valueOf(andIncrement));
            return new int[]{A0, andIncrement};
        }
        com.tencent.mm.plugin.appbrand.service.c0 C0 = C0();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("useForPageView appBrandService:");
        sb6.append(C0);
        sb6.append(" appBrandService.componentId:");
        sb6.append(C0 != null ? java.lang.Integer.valueOf(C0.getComponentId()) : null);
        sb6.append(" preloadFlutter:false useForAppServiceId:");
        sb6.append(df.c1.f229439e);
        sb6.append(" preloadSkylineRuntime:");
        sb6.append(df.c1.f229437c);
        sb6.append(" skylineRuntimeId:");
        com.tencent.skyline.SkylineRuntime skylineRuntime = df.c1.f229437c;
        sb6.append(skylineRuntime != null ? java.lang.Integer.valueOf(skylineRuntime.hashCode()) : null);
        com.tencent.skyline.SkylineLog.i("SkylinePreloader", sb6.toString());
        com.tencent.mm.plugin.appbrand.utils.s3.b("MicroMsg.AppBrandRuntimeWC", "PRELOAD_SKYLINE_URL ids:[%d]-[%d]", java.lang.Integer.valueOf(andIncrement), java.lang.Integer.valueOf(andIncrement));
        return new int[]{andIncrement, andIncrement};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void N(com.tencent.mm.plugin.appbrand.hc hcVar, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addAppBrandRuntimePageStack before ,mAppBrandRuntimeStacks: ");
        java.util.LinkedList linkedList = this.f74797f;
        sb6.append(linkedList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", sb6.toString());
        ((com.tencent.mm.plugin.appbrand.ui.z6) this.f74795d).setBaseContext(hcVar instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.r0 ? ((com.tencent.mm.plugin.appbrand.platform.window.activity.r0) hcVar).w() : hcVar instanceof com.tencent.mm.plugin.appbrand.l5 ? q75.a.a(hcVar.getContext()) : null);
        this.f74796e = hcVar;
        this.Z = false;
        this.f74806p0 = false;
        this.f74816x0 = false;
        this.f74819y0 = true;
        linkedList.addLast(new com.tencent.mm.plugin.appbrand.z5(hcVar, Z(), appBrandInitConfig, appBrandInitConfig.f77283i));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "addAppBrandRuntimePageStack  " + linkedList.peekLast());
        appBrandInitConfig.f77283i = u0().f77283i;
        if (appBrandInitConfig instanceof com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) {
            ((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) appBrandInitConfig).I2 = true;
        }
        U1(appBrandInitConfig);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "addAppBrandRuntimePageStack after ,mAppBrandRuntimeStacks: " + linkedList.size());
    }

    public com.tencent.mm.plugin.appbrand.page.n7 N2() {
        if (x0() == null || x0().getCurrentPage() == null) {
            return null;
        }
        return (com.tencent.mm.plugin.appbrand.page.n7) x0().getCurrentPage().getCurrentPageView();
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public boolean O0(com.tencent.mm.plugin.appbrand.hc hcVar) {
        java.util.LinkedList linkedList = this.f74797f;
        if (linkedList.isEmpty()) {
            return true;
        }
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            if (((com.tencent.mm.plugin.appbrand.z5) linkedList.get(i17)).f92444a != hcVar) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (r5 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0069, code lost:
    
        if (com.tencent.mm.plugin.appbrand.ui.b1.isBlackListing(r0()) != false) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O1(com.tencent.mm.plugin.appbrand.hc r5) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.o6.O1(com.tencent.mm.plugin.appbrand.hc):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    /* renamed from: O2, reason: merged with bridge method [inline-methods] */
    public final com.tencent.mm.plugin.appbrand.page.t s0() {
        if (this.L2 == null) {
            this.L2 = com.tencent.mm.plugin.appbrand.page.v.f87153a.a(com.tencent.mm.plugin.appbrand.task.x0.d(q2()));
        }
        return this.L2;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public boolean P0() {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = u0();
        return u07 != null && u07.L1.c() && u07.L1.D == k91.x2.f305816d;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public boolean P1() {
        com.tencent.mm.plugin.appbrand.hc hcVar;
        if (e3() && (hcVar = this.f74796e) != null && hcVar.n(this)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "shouldHandleSuspendTimeout skip for in stack fakeNative, appId:%s", this.f74803n);
            return false;
        }
        com.tencent.mm.plugin.appbrand.wd wdVar = this.E1;
        if ((wdVar != null ? wdVar.f90960d : null) != null) {
            if ((wdVar != null ? wdVar.f90960d : null).S1()) {
                return false;
            }
        }
        return super.P1();
    }

    public com.tencent.mm.plugin.appbrand.game.preload.i P2() {
        if (this.U2[0] == null) {
            if (L0() || this.S) {
                return null;
            }
            synchronized (this.U2) {
                com.tencent.mm.plugin.appbrand.game.preload.i[] iVarArr = this.U2;
                if (iVarArr[0] == null) {
                    iVarArr[0] = new com.tencent.mm.plugin.appbrand.game.preload.i(this);
                }
            }
        }
        return this.U2[0];
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public boolean Q0() {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = u0();
        if (u07 != null) {
            return u07.L1.c();
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public boolean Q1() {
        return !q2();
    }

    public xa1.b Q2() {
        if (this.f86171h3 == null && !L0()) {
            if (u0().f47284z == 19) {
                xa1.b bVar = xa1.b.f452772a;
                this.f86171h3 = bVar;
                return bVar;
            }
            this.f86171h3 = new com.tencent.mm.plugin.appbrand.n8(this);
        }
        return this.f86171h3;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public boolean R1(java.lang.Runnable runnable) {
        if (this.f74811t instanceof com.tencent.mm.plugin.appbrand.ui.uc) {
            j(runnable, 3000L);
            return true;
        }
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_appbrand_game_splashscreen, false)) {
            return false;
        }
        boolean z17 = m0().f305753w;
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeWC", "manualHideSplash:%b", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    @Override // ze.n, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    /* renamed from: R2, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u0() {
        return (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) ((com.tencent.luggage.sdk.config.AppBrandInitConfigLU) this.f74805p);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.o6.S():void");
    }

    public final com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader S2(boolean z17) {
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = (com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) K1(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class);
        if (iCommLibReader == null && z17) {
            throw new com.tencent.mm.plugin.appbrand.appstorage.r1();
        }
        return iCommLibReader;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public boolean T0() {
        return rh1.b.f395626c;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void T1() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stripToOneInstance mAppBrandRuntimeStacks: ");
        java.util.LinkedList linkedList = this.f74797f;
        sb6.append(linkedList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", sb6.toString());
        if (linkedList.size() < 2 || this.f74796e == null) {
            return;
        }
        for (int i17 = 0; i17 < linkedList.size() - 1; i17++) {
            com.tencent.mm.plugin.appbrand.z5 z5Var = (com.tencent.mm.plugin.appbrand.z5) linkedList.get(i17);
            com.tencent.mm.plugin.appbrand.hc hcVar = z5Var.f92444a;
            if (hcVar != this.f74796e) {
                hcVar.r(this);
                z5Var.f92444a.k(this);
            }
        }
        this.f74796e.s(this);
        while (linkedList.size() > 1) {
            com.tencent.mm.plugin.appbrand.z5 z5Var2 = (com.tencent.mm.plugin.appbrand.z5) linkedList.remove(0);
            com.tencent.mm.plugin.appbrand.page.d5 d5Var = (com.tencent.mm.plugin.appbrand.page.d5) z5Var2.f92445b;
            if (d5Var != null) {
                com.tencent.mm.plugin.appbrand.page.r5.a(d5Var);
                d5Var.h();
            }
            J2((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) z5Var2.f92446c);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x002c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a T2() {
        /*
            r5 = this;
            r0 = 0
            com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a[] r1 = r5.W2     // Catch: java.lang.Throwable -> L3f
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
            boolean r1 = r5.L0()     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L2f
            boolean r1 = r5.S     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L12
            goto L2f
        L12:
            com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a[] r1 = r5.W2     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L3f
            com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a[] r2 = r5.W2     // Catch: java.lang.Throwable -> L2c
            r3 = r2[r0]     // Catch: java.lang.Throwable -> L2c
            if (r3 != 0) goto L24
            com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.b r3 = new com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.b     // Catch: java.lang.Throwable -> L2c
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L2c
            r2[r0] = r3     // Catch: java.lang.Throwable -> L2c
            r2 = 1
            goto L25
        L24:
            r2 = r0
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            goto L32
        L27:
            r0 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L2d
        L2c:
            r2 = move-exception
        L2d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
            throw r2     // Catch: java.lang.Throwable -> L3f
        L2f:
            r0 = 0
            return r0
        L31:
            r2 = r0
        L32:
            com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a[] r1 = r5.W2     // Catch: java.lang.Throwable -> L3c
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L3b
            r5.u3()
        L3b:
            return r0
        L3c:
            r1 = move-exception
            r0 = r2
            goto L40
        L3f:
            r1 = move-exception
        L40:
            if (r0 == 0) goto L45
            r5.u3()
        L45:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.o6.T2():com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a");
    }

    @Override // ze.n, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void U1(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        n91.g gVar = this.K2;
        boolean z17 = (gVar == null || gVar.f335873c == n91.j.DESTROYED) ? false : true;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) appBrandInitConfig;
        if (n91.t.c(appBrandInitConfigWC) && !z17) {
            n91.t.a(appBrandInitConfigWC);
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = u0();
        if (u07 != appBrandInitConfig && appBrandInitConfigWC.f47269b2.f87790f == 1038) {
            appBrandInitConfigWC.U = null;
        }
        if (u07.M1 || u07.L1.c()) {
            appBrandInitConfigWC.M1 = true;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = u07.D;
        if (appBrandLaunchReferrer.f77322d == 1) {
            java.lang.String str = appBrandLaunchReferrer.f77323e;
            if (!(str == null || str.length() == 0)) {
                com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer2 = appBrandInitConfigWC.D;
                if (appBrandLaunchReferrer2.f77322d != 1 || !kotlin.jvm.internal.o.b(appBrandLaunchReferrer2.f77323e, appBrandLaunchReferrer.f77323e)) {
                    java.lang.String appId = appBrandLaunchReferrer.f77323e;
                    kotlin.jvm.internal.o.f(appId, "appId");
                    uk0.a.b(new com.tencent.mm.ipcinvoker.type.IPCString(appId), new com.tencent.mm.plugin.appbrand.task.ipc.v(), null);
                }
            }
        }
        super.U1(appBrandInitConfig);
        boolean z18 = u0().K1 != u07.K1 && (u0().K1 == 1 || u07.K1 == 1);
        if (z18) {
            this.Z = true;
        }
        if (appBrandInitConfigWC.f47283y1) {
            this.Z = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "updateConfig %s, willRestart[%b], willRelaunch[%b], destroyed[%b], scene[%d], lastLaunchMode[%d], currentLaunchMode[%d], instanceId[%s], sessionId[%s]", this, java.lang.Boolean.valueOf(this.Z), java.lang.Boolean.valueOf(this.f74806p0), java.lang.Boolean.valueOf(L0()), java.lang.Integer.valueOf(g2()), java.lang.Integer.valueOf(u07.K1), java.lang.Integer.valueOf(u0().K1), appBrandInitConfigWC.f47277w, appBrandInitConfigWC.f47276v);
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.g(this);
        m3(u07, appBrandInitConfigWC);
        if (this.Z || L0()) {
            return;
        }
        if (!u46.l.c(appBrandInitConfigWC.f47277w, u07.f47277w)) {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            int i17 = appBrandInitConfigWC.f77281g;
            int i18 = u07.f77281g;
            if (i17 != i18) {
                this.Z = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "updateConfig %s, versionType changed[%d]->[%d], setWillRestart", this, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(appBrandInitConfigWC.f77281g));
                return;
            }
            if (com.tencent.mm.plugin.appbrand.appcache.g0.b(i17)) {
                int i19 = appBrandInitConfigWC.L;
                int i27 = u07.L;
                if (i19 != i27) {
                    this.Z = true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "updateConfig %s, appVersion changed[%d]->[%d], setWillRestart", this, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(appBrandInitConfigWC.L));
                    return;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeWC", "updateConfig %s, newConfig.instanceId changed, reset [%s]->[%s]", this, appBrandInitConfigWC.f47277w, u07.f47277w);
            appBrandInitConfigWC.f77298k2 = u07.f77298k2;
            appBrandInitConfigWC.i(u07.f47277w);
        }
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime a17 = com.tencent.mm.plugin.appbrand.report.quality.e.a(this);
        java.util.Objects.requireNonNull(a17);
        a17.f88141n = false;
        com.tencent.mm.plugin.appbrand.report.quality.u.e(this, true, com.tencent.mm.plugin.appbrand.utils.t.b(u0().f77295h2));
        qp3.a.a("onNewConfig", this.f74803n, u0().V);
        java.util.Iterator it = this.f86186r2.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.gc) it.next()).a(u0());
        }
        if (x0() != null) {
            com.tencent.mm.plugin.appbrand.page.d5 x07 = x0();
            x07.getReporter().h(false);
            x07.P = false;
            x07.Q = false;
            x07.R = false;
            x07.W = null;
        }
        com.tencent.mm.plugin.appbrand.launching.n2.a(this);
        if (this.Y2.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[AfterLaunchTiming] hot_start: updateConfig, calling afterlaunch, appId=%s", this.f74803n);
            com.tencent.mm.plugin.appbrand.trade.l.a(this);
        }
        q3();
        I2();
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfigWC = u0();
        if (initConfigWC != null) {
            this.E2.onInitConfigUpdated(initConfigWC);
            com.tencent.mm.plugin.appbrand.widget.h hVar = this.I2;
            hVar.getClass();
            hVar.b(initConfigWC);
            com.tencent.mm.plugin.appbrand.jsapi.fakenative.c.f80940h.a(this, initConfigWC);
        }
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = this.H2;
        l0Var.f91201g = false;
        com.tencent.mm.plugin.appbrand.widget.f0 f0Var = l0Var.f91198d;
        if (f0Var != null) {
            f0Var.c0(false);
        }
        com.tencent.mm.plugin.appbrand.na naVar = this.J2;
        naVar.getClass();
        kotlin.jvm.internal.o.g(initConfigWC, "initConfigWC");
        if ((naVar.f86059b.length() > 0) && !initConfigWC.L1.c() && 1038 != initConfigWC.f47269b2.f87790f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmbedHalfScreenWxaManager", "[onInitConfigUpdated] mark should re-show embedded wxa");
            naVar.f86061d.set(true);
        }
        com.tencent.mm.plugin.appbrand.report.i2 i2Var = this.F2;
        i2Var.getClass();
        boolean c17 = appBrandInitConfigWC.L1.c();
        com.tencent.luggage.sdk.launching.p pVar = com.tencent.luggage.sdk.launching.p.PRE_RENDER;
        if (c17) {
            i2Var.a(1);
            if (appBrandInitConfigWC.W1 != pVar) {
                i2Var.a(6);
                if (i2Var.f87874a) {
                    i2Var.a(8);
                }
                if (!i2Var.f87876c) {
                    i2Var.a(7);
                    if (i2Var.f87874a) {
                        i2Var.a(9);
                    }
                    i2Var.f87876c = true;
                }
            }
        }
        if (z18) {
            i2Var.a(4);
        }
        if (i2Var.f87875b != appBrandInitConfigWC.L1.c() && appBrandInitConfigWC.W1 != pVar) {
            if (appBrandInitConfigWC.L1.c()) {
                i2Var.a(3);
            } else {
                i2Var.a(2);
            }
        }
        if (appBrandInitConfigWC.W1 != pVar) {
            i2Var.f87875b = appBrandInitConfigWC.L1.c();
        }
        if (!appBrandInitConfigWC.L1.c()) {
            mi1.v vVar = this.f74821z;
            if (vVar.f326703b != null) {
                vVar.c().setAlpha(1.0f);
            }
            mi1.v vVar2 = this.f74821z;
            al1.h0 h0Var = al1.h0.HalfScreenConfig;
            vVar2.getClass();
            ((mi1.o) vVar2.f326708g.getValue()).h(true, h0Var);
        }
        l3(appBrandInitConfigWC, false);
        if (this.f74806p0 && appBrandInitConfigWC.r() == k91.z3.TRANSPARENT && this.f74810s != null) {
            java.lang.Runnable runnable = (java.lang.Runnable) this.f86169f3.b();
            runnable.run();
            this.f74810s.post(runnable);
        }
        if (this.Z) {
            return;
        }
        com.tencent.mm.plugin.appbrand.launching.rc rcVar = (com.tencent.mm.plugin.appbrand.launching.rc) this.P2.b();
        rcVar.getClass();
        com.tencent.mm.plugin.appbrand.api.WeAppExportLaunchInfoBundle a18 = rcVar.a();
        a18.f74975e = u07.W1.h();
        a18.f74976f = true;
        rcVar.f85126b = a18;
    }

    public com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a U2() {
        com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a aVar;
        com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a[] aVarArr = this.W2;
        com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a aVar2 = aVarArr[0];
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (aVarArr) {
            aVar = this.W2[0];
        }
        return aVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public mi1.v V() {
        mi1.v vVar = new mi1.v(this);
        vVar.f326705d = new com.tencent.mm.plugin.appbrand.c8(this);
        return vVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public boolean V1() {
        return rh1.b.f395624a;
    }

    public rh1.c V2() {
        rh1.j jVar = this.f86194z2;
        if (jVar != null) {
            return jVar.f395636c;
        }
        return null;
    }

    @Override // ze.n, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public com.tencent.mm.plugin.appbrand.appstorage.u1 W() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            nd.f.f(com.tencent.mm.plugin.appbrand.appstorage.v1.class, new com.tencent.mm.plugin.appbrand.jsapi.file.d());
            com.tencent.mm.plugin.appbrand.jsapi.file.h hVar = (com.tencent.mm.plugin.appbrand.jsapi.file.h) p0(com.tencent.mm.plugin.appbrand.jsapi.file.h.class, false);
            if (hVar == null) {
                hVar = (com.tencent.mm.plugin.appbrand.jsapi.file.h) C2(com.tencent.mm.plugin.appbrand.jsapi.file.h.class);
            }
            java.util.Objects.requireNonNull(hVar);
            return new com.tencent.mm.plugin.appbrand.jsapi.file.f(this, hVar);
        } finally {
            K("createFileSystem() cost %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    @Override // ze.n, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    /* renamed from: W2, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.page.d5 x0() {
        return (com.tencent.mm.plugin.appbrand.page.d5) ((we.a) this.f74809r);
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public com.tencent.mm.plugin.appbrand.ui.vc X() {
        if (q2()) {
            com.tencent.mm.plugin.appbrand.game.preload.j a17 = com.tencent.mm.plugin.appbrand.game.preload.j.a();
            a17.f78229f = 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGamePreloadStatisManager", "misPreload:%d", 1);
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = u0();
            a17.f78224a = u07.f77278d;
            a17.f78225b = u07.L;
            a17.f78226c = u07.f77281g;
            a17.f78227d = u07.f47284z + 1000;
            a17.f78228e = u07.f77298k2.f88134d;
            int i17 = a17.f78226c;
            if (i17 == 0) {
                a17.f78226c = 1;
            } else if (i17 == 1) {
                a17.f78226c = 2;
            } else if (i17 == 2) {
                a17.f78226c = 3;
            }
            if (l2() != null) {
                a17.f78230g = l2().f87790f;
            }
            int i18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_appbrand_game_splashscreen, false) ? 1 : 0;
            a17.f78232i = i18;
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGamePreloadStatisManager", "mHasSplashScreen:%d", java.lang.Integer.valueOf(i18));
        }
        com.tencent.mm.plugin.appbrand.ui.vc a18 = com.tencent.mm.plugin.appbrand.ui.s5.a(r0(), this);
        a18.j(u0().f77280f, u0().f77279e);
        a18.setCanShowHideAnimation(false);
        if (a18 instanceof com.tencent.mm.plugin.appbrand.ui.f6) {
            ((com.tencent.mm.plugin.appbrand.ui.f6) a18).setLoadingIconVisibility(true ^ android.text.TextUtils.isEmpty(u0().f77295h2));
        }
        return a18;
    }

    public final zd1.a0 X2() {
        if (this.T2 == null) {
            if (L0() || this.S) {
                return null;
            }
            synchronized (this.S2) {
                if (this.T2 == null) {
                    this.T2 = new zd1.a0(this);
                }
            }
        }
        return this.T2;
    }

    @Override // ze.n, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public ph1.h Y() {
        return super.Y();
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void Y0(int i17) {
        java.lang.Object obj;
        com.tencent.mm.plugin.appbrand.z5 z5Var;
        com.tencent.mm.plugin.appbrand.page.g4 g4Var;
        com.tencent.mm.plugin.appbrand.page.i3 i3Var;
        if (i17 > y0()) {
            i17 = y0() - 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "navigateBackAppBrandRuntimePageStack before PageCount: %d , delta: %d , stacks: %d", java.lang.Integer.valueOf(y0()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f74797f.size()));
        if (this.f74797f.size() <= 1) {
            return;
        }
        int size = this.f74797f.size() - 1;
        while (true) {
            obj = null;
            if (size < 0) {
                z5Var = null;
                break;
            }
            com.tencent.mm.plugin.appbrand.page.i3 i3Var2 = ((com.tencent.mm.plugin.appbrand.z5) this.f74797f.get(size)).f92445b;
            if (i3Var2 != null) {
                if (i17 < i3Var2.getPageCount()) {
                    z5Var = (com.tencent.mm.plugin.appbrand.z5) this.f74797f.get(size);
                    break;
                }
                i17 -= i3Var2.getPageCount();
            }
            size--;
        }
        if (z5Var == null && (i3Var = (z5Var = (com.tencent.mm.plugin.appbrand.z5) this.f74797f.get(0)).f92445b) != null) {
            i17 = i3Var.getPageCount() - 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "navigateBackAppBrandRuntimePageStack to stackIndex: %d , have %d page to remove", java.lang.Integer.valueOf(this.f74797f.indexOf(z5Var)), java.lang.Integer.valueOf(i17));
        final android.app.Activity r07 = r0();
        if (r07 == z5Var.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "navigateBackAppBrandRuntimePageStack degrade to close");
            S();
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f74796e.o(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "navigateBackAppBrandRuntimePageStack showSnapshot cost %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        this.f74796e = z5Var.f92444a;
        android.view.ViewParent parent = this.f74810s.getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(this.f74810s);
        }
        this.f74796e.m(this.f74810s);
        ((com.tencent.mm.plugin.appbrand.ui.z6) this.f74795d).setBaseContext(z5Var.a());
        com.tencent.mm.plugin.appbrand.page.w2 currentPage = this.f74809r.getCurrentPage();
        com.tencent.mm.plugin.appbrand.ef efVar = com.tencent.mm.plugin.appbrand.ef.AppBrandPageContainer;
        efVar.b(this, x0());
        this.f74809r = z5Var.f92445b;
        java.util.Iterator h07 = this.f74809r.h0(false);
        do {
            g4Var = (com.tencent.mm.plugin.appbrand.page.g4) h07;
            com.tencent.mm.plugin.appbrand.page.w2 w2Var = (com.tencent.mm.plugin.appbrand.page.w2) g4Var.next();
            if (i17 <= 0) {
                break;
            }
            i17--;
            this.f74809r.k0(w2Var, false, true, null);
        } while (g4Var.hasNext());
        efVar.a(this, this.f74809r);
        com.tencent.mm.plugin.appbrand.page.w2 currentPage2 = this.f74809r.getCurrentPage();
        if (currentPage2 != null) {
            this.f74809r.x(currentPage, currentPage2);
        }
        final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = u0();
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig = z5Var.f92446c;
        if (appBrandInitConfig instanceof com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) {
            ((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) appBrandInitConfig).I2 = true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (this.f74797f.peekLast() != z5Var) {
            com.tencent.mm.plugin.appbrand.z5 z5Var2 = (com.tencent.mm.plugin.appbrand.z5) this.f74797f.removeLast();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "navigateBackAppBrandRuntimePageStack removeStack " + z5Var2);
            if (z5Var2.a() != z5Var.a()) {
                arrayList.add(new java.lang.ref.WeakReference(z5Var2.a()));
            }
            com.tencent.mm.plugin.appbrand.page.i3 i3Var3 = z5Var2.f92445b;
            if (i3Var3 != this.f74809r) {
                if (i3Var3 instanceof com.tencent.mm.plugin.appbrand.page.d5) {
                    com.tencent.mm.plugin.appbrand.page.r5.a((com.tencent.mm.plugin.appbrand.page.d5) i3Var3);
                }
                if (i3Var3 != null) {
                    i3Var3.h();
                }
            }
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig2 = z5Var2.f92446c;
            if (appBrandInitConfig2 instanceof com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) {
                this.N.a(new com.tencent.mm.plugin.appbrand.l8(this, appBrandInitConfig2));
            }
            com.tencent.mm.plugin.appbrand.hc hcVar = z5Var2.f92444a;
            if (hcVar != null) {
                f0();
                hcVar.p(this);
            }
        }
        U1(appBrandInitConfig);
        if (r07 != r0()) {
            ((com.tencent.mm.plugin.appbrand.ui.AppBrandUI) r07).D = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.o6$$k
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                    ((com.tencent.mm.plugin.appbrand.ui.AppBrandUI) r07).s7(u07);
                }
            };
            android.app.Activity activity = r0();
            com.tencent.mm.plugin.appbrand.app.d dVar = com.tencent.mm.plugin.appbrand.app.d.f75045a;
            kotlin.jvm.internal.o.g(activity, "activity");
            java.util.Iterator it = com.tencent.mm.plugin.appbrand.app.d.f75046b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.o.b((android.app.Activity) ((cf.a) next).f40816b.get(), activity)) {
                    obj = next;
                    break;
                }
            }
            cf.a aVar = (cf.a) obj;
            if (aVar == null) {
                com.tencent.mars.xlog.Log.i("ActivityCrossProcessManager", "popToActivity fail");
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeWC", "popToActivity fail");
                arrayList.forEach(new com.tencent.mm.plugin.appbrand.o6$$q());
            } else {
                java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
                kotlin.jvm.internal.o.f(runningAppProcesses, "getRunningAppProcesses(...)");
                for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    boolean b17 = kotlin.jvm.internal.o.b(runningAppProcessInfo.processName, bm5.f1.a());
                    long j17 = aVar.f40815a;
                    int i18 = aVar.f40817c;
                    if (b17) {
                        com.tencent.mm.plugin.appbrand.app.d.f75045a.b(new com.tencent.luggage.sdk.wxa_ktx.PopActivityRecord(i18, j17));
                    } else {
                        com.tencent.mm.ipcinvoker.d0.d(runningAppProcessInfo.processName, new com.tencent.luggage.sdk.wxa_ktx.PopActivityRecord(i18, j17), com.tencent.mm.plugin.appbrand.ipc.d0.class, com.tencent.mm.plugin.appbrand.app.c.f75025d);
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "navigateBackAppBrandRuntimePageStack after mAppBrandRuntimeStacks %d", java.lang.Integer.valueOf(this.f74797f.size()));
    }

    @Override // ze.n
    /* renamed from: Y2, reason: merged with bridge method [inline-methods] */
    public final com.tencent.mm.plugin.appbrand.service.c0 C0() {
        return (com.tencent.mm.plugin.appbrand.service.c0) ((com.tencent.luggage.sdk.jsapi.component.service.y) this.f74808q);
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public com.tencent.mm.plugin.appbrand.page.i3 Z() {
        android.content.Context context = this.f74795d;
        try {
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(this.f74803n, true);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            b17.G = java.lang.System.currentTimeMillis();
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.appbrand.page.d5 jVar = q2() ? new pa1.j(context, this) : new com.tencent.mm.plugin.appbrand.page.d5(context, this);
        jVar.setDecorWidgetFactory(s0());
        if (!q2()) {
            jVar.Y(oi1.n.f345608e, new oi1.a());
        }
        jVar.Y(oi1.n.f345607d, new oi1.b());
        if (this.f86188t2 != null) {
            com.tencent.mm.plugin.appbrand.j3 j3Var = this.f86188t2;
            com.tencent.mm.plugin.appbrand.page.n7 n7Var = j3Var.f78455g;
            j3Var.f78455g = null;
            if (n7Var != null) {
                if (n7Var != null && jVar.getRuntime() != null) {
                    if (n7Var.x().compareTo(jVar.getRuntime().S2(false)) != 0) {
                        throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.ENGLISH, "stashPreloadedPageView appId[%s] mismatch libReader, runtime[%s] page[%s]", jVar.getAppId(), jVar.getRuntime().S2(false).W0(), n7Var.x().W0()));
                    }
                    synchronized (jVar.f86524p0) {
                        ((java.util.LinkedList) jVar.f86524p0).addLast(n7Var);
                    }
                }
                if (n7Var instanceof com.tencent.mm.plugin.appbrand.page.md) {
                    jVar.setWAAutoWebViewJs(((com.tencent.mm.plugin.appbrand.page.md) n7Var).getWaAutoWebViewJs());
                }
            }
        }
        return jVar;
    }

    @Override // ze.n
    /* renamed from: Z2, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0() {
        return (com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) p0(com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC.class, false);
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public com.tencent.mm.plugin.appbrand.widget.q a0(android.content.Context context) {
        if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_resizable_user_custom_layout, 1) == 1) && !com.tencent.mm.plugin.appbrand.ui.b1.isBlackListing(context) && !Q0()) {
            return super.a0(context);
        }
        com.tencent.mm.plugin.appbrand.widget.q qVar = (com.tencent.mm.plugin.appbrand.widget.q) com.tencent.mm.plugin.appbrand.widget.q.f91848m.pollFirst();
        return qVar != null ? qVar : new com.tencent.mm.plugin.appbrand.widget.q(context);
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void a1(android.content.res.Configuration configuration) {
        super.a1(configuration);
        android.content.res.Configuration configuration2 = this.f86192x2;
        this.f86192x2 = new android.content.res.Configuration(configuration);
        this.E2.onConfigurationChanged(configuration);
        com.tencent.mm.plugin.appbrand.floatball.u uVar = this.f86193y2;
        if (uVar != null) {
            uVar.getClass();
            if (configuration2 != null && configuration2.orientation != configuration.orientation) {
                uVar.c(null);
            }
        }
        com.tencent.mm.plugin.appbrand.location.b.d(this.f74803n, g2(), u0().f47276v);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "requestReportLocation from onConfigurationChanged");
    }

    public final void a3(java.lang.String targetAppId) {
        kotlin.jvm.internal.o.g(targetAppId, "targetAppId");
        if (a2()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RuntimeMigrateRestartHelper", "handleStartMigrateTargetApp(" + this.f74803n + "), finish directly because prerender-ing");
            K2();
            return;
        }
        if (!com.tencent.mm.plugin.appbrand.appcache.g0.a(this.f74805p.f77281g)) {
            java.lang.String str = u0().f47277w;
            kotlin.jvm.internal.o.f(str, "getWxaLaunchInstanceId(...)");
            uk0.a.b(new com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs(str, targetAppId), com.tencent.mm.plugin.appbrand.se.f88598d, new com.tencent.mm.plugin.appbrand.ue(this, targetAppId));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RuntimeMigrateRestartHelper", "handleStartMigrateTargetApp(" + this.f74803n + "), finish directly because versionType:" + this.f74805p.f77281g);
            K2();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public com.tencent.mm.plugin.appbrand.e9 b0() {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var2 = null;
        if (!super.s2()) {
            if (this.f86188t2 != null) {
                com.tencent.mm.plugin.appbrand.j3 j3Var = this.f86188t2;
                com.tencent.mm.plugin.appbrand.service.c0 c0Var3 = j3Var.f78456h;
                j3Var.f78456h = null;
                c0Var2 = c0Var3;
            }
            if (c0Var2 != null) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = this.f74803n;
                objArr[1] = q2() ? "WAGame" : "WAService";
                com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime a17 = com.tencent.mm.plugin.appbrand.report.quality.e.a(this);
                java.util.Objects.requireNonNull(a17);
                objArr[2] = a17.D.name();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[%s][%s] [applaunch] [preload] createService preloaded, reason=%s", objArr);
            }
            if (c0Var2 == null) {
                java.lang.Object[] objArr2 = new java.lang.Object[2];
                objArr2[0] = this.f74803n;
                objArr2[1] = q2() ? "WAGame" : "WAService";
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[%s][%s] [applaunch] [preload] createService got no preloaded", objArr2);
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                if (com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d && com.tencent.mm.plugin.appbrand.task.d.a()) {
                    throw new java.lang.IllegalStateException("[ForcePreload] enabled, but not preload");
                }
                c0Var = q2() ? new fa1.t() : new com.tencent.mm.plugin.appbrand.service.c0();
            } else {
                c0Var = c0Var2;
            }
        } else if (q2()) {
            com.tencent.mm.plugin.appbrand.j3 j3Var2 = this.f86188t2;
            c0Var = j3Var2.f78456h;
            j3Var2.f78456h = null;
            if (c0Var == null) {
                c0Var = new fa1.t();
            } else {
                com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime a18 = com.tencent.mm.plugin.appbrand.report.quality.e.a(this);
                java.util.Objects.requireNonNull(a18);
                a18.D = com.tencent.mm.plugin.appbrand.report.quality.o0.PreloadOnProcessCreated;
            }
        } else {
            c0Var = com.tencent.mm.plugin.appbrand.debugger.y1.f(u0().F).f77634g == 1 ? new com.tencent.mm.plugin.appbrand.service.c0() : new com.tencent.mm.plugin.appbrand.service.c0(com.tencent.mm.plugin.appbrand.debugger.v1.class);
        }
        com.tencent.mm.plugin.appbrand.profile.o oVar = c0Var.A1().f47371r;
        if ((oVar != null && oVar.f87698g) && com.tencent.mm.plugin.appbrand.appcache.g0.b(u0().f77281g) && !com.tencent.mm.sdk.platformtools.s9.f192975c) {
            dp.a.makeText(r0(), r0().getString(com.tencent.mm.R.string.f490259f81), 0).show();
            l0();
        }
        return c0Var;
    }

    @Override // ze.n, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void b1() {
        com.tencent.mm.plugin.appbrand.keylogger.w.g(this.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareRuntime);
        com.tencent.mm.plugin.appbrand.y5 y5Var = com.tencent.mm.plugin.appbrand.y5.f92411a;
        if (((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.appbrand.y5.f92414d).getValue()).booleanValue()) {
            x.d dVar = com.tencent.mm.plugin.appbrand.y5.f92415e;
            dVar.add(this);
            if (dVar.f450816f == 1) {
                gj.o oVar = gj.o.f272367n;
                if (oVar.f272374m) {
                    oVar.b(y5Var);
                }
            }
        }
        cf.i.b("clearDuplicatedInstanceOnAppCreate", new com.tencent.mm.plugin.appbrand.g7(this));
        com.tencent.mm.plugin.appbrand.report.quality.j jVar = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = u0();
        com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession = u07 != null ? u07.f77298k2 : null;
        if (qualitySession != null) {
            pm0.v.K(null, new com.tencent.mm.plugin.appbrand.report.quality.m(com.tencent.mm.plugin.appbrand.l.c(), qualitySession, u07));
        }
        com.tencent.mm.plugin.appbrand.l.g(this);
        com.tencent.mm.plugin.appbrand.report.quality.e.i(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "AppBrandRuntimeProfile|onCreate %s, scene:%d, instanceId:%s, sessionId:%s", this, java.lang.Integer.valueOf(g2()), u0().f47277w, u0().f47276v);
        w1(new com.tencent.mm.plugin.appbrand.o8(this));
        w1(new com.tencent.mm.plugin.appbrand.r8(this, null));
        w1(new com.tencent.mm.plugin.appbrand.u6(this));
        w1(new com.tencent.mm.plugin.appbrand.v6(this));
        com.tencent.mm.plugin.appbrand.b6 b6Var = new com.tencent.mm.plugin.appbrand.b6(this);
        w1(b6Var);
        w1(new com.tencent.mm.plugin.appbrand.u8(this, b6Var));
        com.tencent.mm.plugin.appbrand.j3 j3Var = new com.tencent.mm.plugin.appbrand.j3(this);
        this.f86188t2 = j3Var;
        w1(j3Var);
        w1(new com.tencent.mm.plugin.appbrand.w6(this));
        if (u0().R.f77428z) {
            w1(new com.tencent.mm.plugin.appbrand.y6(this));
        }
        w1(new com.tencent.mm.plugin.appbrand.z6(this));
        w1(new com.tencent.mm.plugin.appbrand.v8(this, null));
        w1(new com.tencent.mm.plugin.appbrand.a7(this));
        if (q2()) {
            w1(new com.tencent.mm.plugin.appbrand.d7(this));
        }
        w1(new com.tencent.mm.plugin.appbrand.f7(this));
        ph.t.k().b(this.f86181m3);
        com.tencent.mm.plugin.appbrand.location.b.d(this.f74803n, g2(), u0().f47276v);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "requestReportLocation from onCreate");
    }

    @Override // ze.n
    public final boolean b2() {
        return u0().F2 && (super.b2() || (z65.c.a() && x51.o1.f452063p));
    }

    public final void b3() {
        if (e3() || com.tencent.mm.plugin.appbrand.kf.a(this)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeWC", "initFloatBallHelper appId[%s], skip fakeNative", this.f74803n);
            return;
        }
        if (this.f86193y2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "initFloatBallHelper, destroy");
            this.f86193y2.d();
        }
        final com.tencent.mm.plugin.appbrand.floatball.u uVar = new com.tencent.mm.plugin.appbrand.floatball.u(this);
        this.f86193y2 = uVar;
        com.tencent.mm.plugin.appbrand.o6 o6Var = uVar.f78147a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "init, runtime:%s", o6Var.f74803n);
        o6Var.l(new com.tencent.mm.plugin.appbrand.floatball.v(uVar, o6Var));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "resume, runtime:%s", uVar.f78147a.f74803n);
        uVar.f(new com.tencent.mm.plugin.appbrand.floatball.z(uVar));
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.floatball.x(uVar, o6Var), "FloatBallHelperThread");
        if (!uVar.f78149c || !rh1.b.a() || uVar.f78147a.e3() || uVar.f78147a.q2()) {
            return;
        }
        final ov.f0 f0Var = (ov.f0) ((pv.c0) i95.n0.c(pv.c0.class));
        if (f0Var.Di(pv.a0.f358476g)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "addFloatBallEduView wait init");
        uVar.f(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.floatball.u$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.floatball.u uVar2 = com.tencent.mm.plugin.appbrand.floatball.u.this;
                uVar2.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "addFloatBallEduView wait ui");
                uVar2.f78161o.postDelayed(new com.tencent.mm.plugin.appbrand.floatball.y(uVar2, f0Var), 1500L);
            }
        });
    }

    @Override // ze.n, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void c1() {
        boolean z17;
        boolean z18;
        android.view.View rootView;
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityCloseBeforeReadyStruct weAppQualityCloseBeforeReadyStruct;
        com.tencent.mm.plugin.appbrand.report.quality.t0.c(this.f74803n, 5);
        k91.a3 a3Var = (k91.a3) i95.n0.c(k91.a3.class);
        if (a3Var != null) {
            java.lang.String appId = this.f74803n;
            kotlin.jvm.internal.o.g(appId, "appId");
            ((k91.u0) a3Var).Ai().W(k91.s0.a(k91.u0.f305775e, appId));
        }
        if (u0().f77313z2 != null) {
            com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy weAppOpenUICallbackIPCProxy = u0().f77313z2;
            boolean z19 = r0() != null && r0().isFinishing();
            if (!weAppOpenUICallbackIPCProxy.f84481i) {
                weAppOpenUICallbackIPCProxy.f84477e.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(z19));
            }
        }
        super.c1();
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.G(C0());
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.H("Common_IPC_appid");
        m91.f.b(this);
        com.tencent.mm.plugin.appbrand.report.quality.j jVar = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(this.f74803n, false);
        if (b17 != null && (weAppQualityCloseBeforeReadyStruct = b17.f88143J) != null) {
            weAppQualityCloseBeforeReadyStruct.f62443d = weAppQualityCloseBeforeReadyStruct.b("InstanceId", b17.f88134d, true);
            weAppQualityCloseBeforeReadyStruct.f62444e = weAppQualityCloseBeforeReadyStruct.b("AppId", b17.f88135e, true);
            weAppQualityCloseBeforeReadyStruct.f62445f = b17.f88139i;
            int i17 = b17.f88136f;
            weAppQualityCloseBeforeReadyStruct.f62446g = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.u.demo : cm.u.debug : cm.u.release;
            weAppQualityCloseBeforeReadyStruct.f62447h = b17.f88137g;
            weAppQualityCloseBeforeReadyStruct.f62449j = b17.f88138h;
            weAppQualityCloseBeforeReadyStruct.f62452m = weAppQualityCloseBeforeReadyStruct.b(dm.i4.COL_USERNAME, u0().f47278x, true);
            weAppQualityCloseBeforeReadyStruct.f62453n = b17.L ? 1L : 0L;
            weAppQualityCloseBeforeReadyStruct.f62454o = b17.a();
            weAppQualityCloseBeforeReadyStruct.f62455p = weAppQualityCloseBeforeReadyStruct.b("networkType", com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
            weAppQualityCloseBeforeReadyStruct.f62456q = u0().S1 ? 1L : 0L;
            weAppQualityCloseBeforeReadyStruct.f62457r = b17.K ? 1L : 0L;
            weAppQualityCloseBeforeReadyStruct.f62450k = b17.f88145q;
            long i18 = weAppQualityCloseBeforeReadyStruct.i();
            weAppQualityCloseBeforeReadyStruct.f62451l = i18;
            weAppQualityCloseBeforeReadyStruct.f62448i = i18 - weAppQualityCloseBeforeReadyStruct.f62450k;
            weAppQualityCloseBeforeReadyStruct.f62461v = b17.M ? 1L : 0L;
            weAppQualityCloseBeforeReadyStruct.f62462w = b17.N ? 1L : 0L;
            if (b17.f88151w != null) {
                weAppQualityCloseBeforeReadyStruct.f62458s = 1L;
            } else {
                weAppQualityCloseBeforeReadyStruct.f62458s = 0L;
            }
            weAppQualityCloseBeforeReadyStruct.f62459t = this.A2 != null ? r0.f289528e : 9;
            weAppQualityCloseBeforeReadyStruct.f62460u = i81.d.c();
            weAppQualityCloseBeforeReadyStruct.k();
            if (com.tencent.mars.xlog.Log.getLogLevel() >= 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandQualitySystem", "onRuntimeDestroy report 18033 " + weAppQualityCloseBeforeReadyStruct.n());
            }
        }
        com.tencent.mm.plugin.appbrand.y5 y5Var = com.tencent.mm.plugin.appbrand.y5.f92411a;
        if (((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.appbrand.y5.f92414d).getValue()).booleanValue()) {
            y5Var.a(this);
        }
        n91.g gVar = this.K2;
        if (gVar != null) {
            n91.n nVar = (n91.n) gVar.f335872b.f74811t;
            if (nVar != null) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) nVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(nVar);
                }
                com.tencent.mm.plugin.appbrand.o6 runtime = nVar.f335891d;
                kotlin.jvm.internal.o.g(runtime, "runtime");
                com.tencent.mm.plugin.appbrand.page.d5 x07 = runtime.x0();
                android.view.View findViewById = (x07 == null || (rootView = x07.getRootView()) == null) ? null : rootView.findViewById(com.tencent.mm.R.id.w_);
                hk1.e eVar = findViewById instanceof hk1.e ? (hk1.e) findViewById : null;
                if (eVar != null) {
                    android.view.ViewGroup viewGroup2 = eVar.f281876f;
                    if (viewGroup2 != null) {
                        eVar.removeView(viewGroup2);
                    }
                    eVar.f281877g = null;
                }
                runtime.f74811t = null;
            }
            gVar.b();
        }
        if (this.f86184p2 != 0) {
            com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMiniProgramLaunchEnable(), this.f86184p2);
            this.f86184p2 = 0;
        }
        if (com.tencent.mm.plugin.appbrand.performance.m.c().booleanValue()) {
            if (this.f86187s2 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "stopDumpTrace");
                this.f86187s2.d();
                this.f86187s2 = null;
            }
            java.lang.String str = this.f74803n;
            java.util.HashMap hashMap = com.tencent.mm.plugin.appbrand.performance.h.f87351a;
            com.tencent.mm.plugin.appbrand.performance.f fVar = (com.tencent.mm.plugin.appbrand.performance.f) hashMap.get(str);
            if (fVar != null) {
                hashMap.remove(str);
                fVar.h();
            }
            final com.tencent.mm.plugin.appbrand.performance.a aVar = (com.tencent.mm.plugin.appbrand.performance.a) b(com.tencent.mm.plugin.appbrand.performance.a.class);
            ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.o6$$m
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z27 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                    com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                    o6Var.getClass();
                    com.tencent.mm.plugin.appbrand.performance.h.b(o6Var, aVar);
                }
            });
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPerformanceTracer", "closeAudits");
            com.tencent.mm.plugin.appbrand.performance.m.f87366d = java.lang.Boolean.FALSE;
        }
        if (com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d) {
            java.lang.String str2 = this.f74803n;
            java.lang.String[] strArr = com.tencent.mm.plugin.appbrand.debugger.c0.f77637a;
            for (int i19 = 0; i19 < 3; i19++) {
                java.lang.String str3 = str2 + "-" + strArr[i19];
                java.lang.String string = com.tencent.mm.sdk.platformtools.o4.N("MicroMsg.AppBrand.ForceOpenAppNotify.TestInjectJsPath", 2, null).getString(str3, null);
                if (!android.text.TextUtils.isEmpty(string)) {
                    com.tencent.mm.vfs.w6.h(string);
                }
                com.tencent.mm.sdk.platformtools.o4.N("MicroMsg.AppBrand.ForceOpenAppNotify.TestInjectJsPath", 2, null).remove(str3);
            }
        }
        if (q2()) {
            com.tencent.mm.plugin.appbrand.game.preload.i[] iVarArr = this.U2;
            if (iVarArr[0] != null) {
                synchronized (iVarArr) {
                    com.tencent.mm.plugin.appbrand.game.preload.i iVar = this.U2[0];
                    if (iVar != null) {
                        try {
                            iVar.b();
                            this.U2[0] = null;
                        } catch (java.lang.Throwable th6) {
                            this.U2[0] = null;
                            throw th6;
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.appbrand.media.music.d dVar = com.tencent.mm.plugin.appbrand.media.music.d.f85757c;
        dVar.f85758a.clear();
        dVar.f85759b = "";
        com.tencent.mm.plugin.appbrand.m6.c(this.f74803n);
        com.tencent.mm.plugin.appbrand.media.record.h.a(this.f74803n);
        g3(true);
        com.tencent.mm.plugin.appbrand.page.t tVar = this.L2;
        if (tVar != null) {
            java.util.HashMap hashMap2 = tVar.f87104c.f87069a;
            java.util.Collection values = hashMap2.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            java.util.Iterator it = values.iterator();
            while (it.hasNext()) {
                ((java.util.LinkedList) it.next()).clear();
            }
            hashMap2.clear();
        }
        com.tencent.mm.plugin.appbrand.l.a(this);
        com.tencent.mm.plugin.appbrand.report.model.l0 l0Var = this.f86178l2;
        if (l0Var != null) {
            l0Var.f88054h = u0().f47276v;
            l0Var.f88049c = com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            l0Var.f88050d = this.f74803n;
            l0Var.f88051e = E0() == null ? u0().L : E0().f305852r.pkgVersion;
            l0Var.f88052f = this.f74805p.f77281g + 1;
            l0Var.f88053g = g2();
            l0Var.f88055i = l0Var.f88048b ? 1 : 0;
            long j17 = l0Var.f88047a;
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            l0Var.f88056j = android.os.SystemClock.elapsedRealtime() - j17;
            l0Var.f88057k = java.lang.System.currentTimeMillis();
            l0Var.f88058l = u0().f47278x;
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime a17 = com.tencent.mm.plugin.appbrand.report.quality.e.a(this);
            if (a17 == null) {
                z18 = false;
            } else {
                l0Var.f88059m = a17.f88137g;
                l0Var.f88060n = a17.f88134d;
                z18 = true;
            }
            if (z18) {
                l0Var.a();
            }
            if (ek1.d.a(this.f74803n, this.f74805p.f77281g)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.z.CTRL_INDEX, 51);
            }
        }
        this.f86178l2 = null;
        this.f86180m2 = false;
        this.f86182n2 = false;
        this.f86183o2.set(false);
        if (this.f86188t2 != null) {
            com.tencent.mm.plugin.appbrand.j3 j3Var = this.f86188t2;
            com.tencent.mm.plugin.appbrand.service.c0 c0Var = j3Var.f78456h;
            if (c0Var != null) {
                c0Var.h();
                j3Var.f78456h = null;
            }
            com.tencent.mm.plugin.appbrand.page.n7 n7Var = j3Var.f78455g;
            if (n7Var != null) {
                n7Var.h();
                j3Var.f78455g = null;
            }
        }
        this.f86188t2 = null;
        this.f86189u2 = null;
        if (this.f86190v2 != null) {
            this.f86190v2.a();
            this.f86190v2 = null;
        }
        if (this.f86191w2 != null) {
            this.f86191w2.a();
            this.f86191w2 = null;
        }
        i81.b0 b0Var = this.A2;
        if (b0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "onDestroy");
            b0Var.m("onDestroy");
            com.tencent.mm.plugin.appbrand.o6 o6Var = b0Var.f289525b;
            if (o6Var.v0()) {
                int i27 = b0Var.f289528e;
                if (!(i27 == 10 || i81.m0.t4(i27))) {
                    com.tencent.mm.plugin.appbrand.report.quality.e.g(o6Var, true, 0L);
                }
            }
            this.A2 = null;
        }
        fe.g.b(this.f74803n);
        ((java.util.concurrent.LinkedBlockingQueue) this.f86175j3).clear();
        ((java.util.LinkedList) this.f86186r2).clear();
        com.tencent.mm.sdk.event.IListener iListener = this.N2;
        if (iListener != null) {
            iListener.dead();
            this.N2 = null;
        }
        com.tencent.mm.plugin.appbrand.floatball.u uVar = this.f86193y2;
        if (uVar != null) {
            uVar.d();
            this.f86193y2 = null;
        }
        rh1.j jVar2 = this.f86194z2;
        if (jVar2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMultiTaskLogic", "destroy, runtime:%s", jVar2.f395635b.f74803n);
            if (jVar2.f395636c != null) {
                jVar2.f395636c.getClass();
            }
            jVar2.f395635b = null;
            this.f86194z2 = null;
        }
        this.f86176k2.a();
        com.tencent.mm.plugin.appbrand.c cVar = this.D2;
        if (cVar != null) {
            cVar.a(this);
        }
        this.D2 = null;
        bm5.z0 z0Var = this.B2;
        int[] iArr = z0Var.f22766a;
        if (-1 != iArr[0]) {
            synchronized (iArr) {
                z0Var.f22766a[0] = -1;
            }
        }
        bm5.z0 z0Var2 = this.f86170g3;
        int[] iArr2 = z0Var2.f22766a;
        if (-1 != iArr2[0]) {
            synchronized (iArr2) {
                z0Var2.f22766a[0] = -1;
            }
        }
        this.C2 = 0;
        this.I2.c();
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var2 = this.H2;
        l0Var2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenManger", "[onRuntimeDestroy] setCapsuleBarBackgroundRenderer null");
        l0Var2.o(null);
        if (l0Var2.e().c()) {
            l0Var2.m();
        }
        this.O2.c();
        this.P2.c();
        android.util.LongSparseArray longSparseArray = this.Q2;
        if (longSparseArray != null) {
            longSparseArray.clear();
            this.Q2 = null;
        }
        try {
            com.tencent.mm.plugin.appbrand.report.quality.h1 h1Var = this.R2;
            if (h1Var != null) {
                com.tencent.mm.plugin.appbrand.report.quality.d1 d1Var = h1Var.f88202d;
                if (d1Var.f88163b) {
                    kotlinx.coroutines.z0.e(d1Var.f88170i, null, 1, null);
                }
                m91.j.f324956b.remove(h1Var);
            }
            this.R2 = null;
            synchronized (this.S2) {
                try {
                    if (this.T2 != null) {
                        zd1.a0 a0Var = this.T2;
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SecuritySnapshotContext", "destroy for " + a0Var.f471521a.f74803n);
                        z17 = true;
                        a0Var.b(true);
                    } else {
                        z17 = true;
                    }
                } finally {
                    this.T2 = null;
                }
            }
            com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a[] aVarArr = this.W2;
            if (aVarArr[0] != null) {
                synchronized (aVarArr) {
                    com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a aVar2 = this.W2[0];
                    if (aVar2 != null) {
                        try {
                            ((com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.b) aVar2).a();
                            this.W2[0] = null;
                        } catch (java.lang.Throwable th7) {
                            this.W2[0] = null;
                            throw th7;
                        }
                    }
                }
            }
            com.tencent.mm.plugin.appbrand.jsapi.auth.k4.J(this.f74803n);
            ((j81.a) ((x71.m) i95.n0.c(x71.m.class))).wi(this.f74803n);
            if (i95.n0.c(com.tencent.mm.plugin.appbrand.complaint.s.class) != null) {
                ((com.tencent.mm.plugin.appbrand.complaint.f) ((com.tencent.mm.plugin.appbrand.complaint.s) i95.n0.c(com.tencent.mm.plugin.appbrand.complaint.s.class))).wi();
            }
            com.tencent.mm.plugin.appbrand.appstorage.f.f76162i.a(new kk.v(u0().f47279x0).longValue(), this.f74803n);
            if (u0() != null) {
                java.lang.String wxaLaunchInstanceId = u0().f47277w;
                if (!((wxaLaunchInstanceId == null || wxaLaunchInstanceId.length() == 0) ? z17 : false)) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.appbrand.launching.c.f84530a;
                    kotlin.jvm.internal.o.g(wxaLaunchInstanceId, "wxaLaunchInstanceId");
                }
            }
            o3(u0(), com.tencent.mm.plugin.appbrand.s8.OnDestroy);
            synchronized (this.f86164a3) {
                if (this.f86165b3 != null) {
                    this.f86165b3 = null;
                }
            }
            com.tencent.mm.plugin.appbrand.screenshot.w wVar = this.Z2;
            if (wVar != null) {
                r0();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandScreenshotComponentHelper", "onDestroy: cleaning up screenshot component helper");
                ((com.tencent.mm.ui.feature.api.screenshot.j1) ((ct.e3) i95.n0.c(ct.e3.class))).Ni(null);
                wVar.f88586a = null;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandScreenshotComponentHelper", "clearEnterPath");
            }
            ph.t.k().p(this.f86181m3);
        } catch (java.lang.Throwable th8) {
            this.R2 = null;
            throw th8;
        }
    }

    @Override // ze.n
    public com.tencent.mm.plugin.appbrand.ui.ga c2() {
        java.util.List list = ((com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle) b(com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle.class)).f84408f;
        if (!com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            java.util.Iterator it = list.iterator();
            long j17 = 0;
            while (it.hasNext()) {
                j17 = java.lang.Math.max(j17, ((com.tencent.mm.plugin.appbrand.report.model.kv_14609) it.next()).f88034o);
            }
            com.tencent.mm.plugin.appbrand.performance.h.d(this, 201, j17);
        }
        if (com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d) {
            return null;
        }
        return super.c2();
    }

    public final void c3() {
        if (e3() || com.tencent.mm.plugin.appbrand.kf.a(this)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeWC", "initMultiTaskHelper appId[%s], skip fakeNative", this.f74803n);
            return;
        }
        if (this.f86194z2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "initMultiTaskHelper, destroy");
            rh1.j jVar = this.f86194z2;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMultiTaskLogic", "destroy, runtime:%s", jVar.f395635b.f74803n);
            if (jVar.f395636c != null) {
                jVar.f395636c.getClass();
            }
            jVar.f395635b = null;
        }
        rh1.j jVar2 = new rh1.j(this);
        this.f86194z2 = jVar2;
        if (jVar2.f395635b == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMultiTaskLogic", "init, runtime:%s", jVar2.f395635b.f74803n);
        jVar2.f395634a = jVar2.f395635b.f74803n;
        ((ku5.t0) ku5.t0.f312615d).h(jVar2.f395637d, "MultiTaskHelperThread");
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void d1() {
        if (!this.f86166c3) {
            com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.d(this, com.tencent.mm.plugin.appbrand.jsapi.fakenative.h0.DetachFromStack);
        }
        super.d1();
    }

    public final void d3() {
        x1(com.tencent.mm.plugin.appbrand.networking.c0.class, com.tencent.mm.plugin.appbrand.networking.m0.INSTANCE);
        this.L.c(com.tencent.mm.plugin.appbrand.networking.d0.class);
        x1(com.tencent.mm.plugin.appbrand.networking.d0.class, new com.tencent.mm.plugin.appbrand.networking.h0(this));
        x1(gb1.k.class, new com.tencent.mm.plugin.appbrand.ja());
        if (u0().h()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "installWechatServices WxAssistantFactoryInterface, isWxAssistEnable=%b", java.lang.Boolean.valueOf(u0().h()));
            x1(ui1.x.class, new com.tencent.mm.plugin.appbrand.wxassistant.g3());
        }
        com.tencent.mm.plugin.appbrand.m6.a(this.f74803n);
    }

    @Override // ze.n, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void e1() {
        super.e1();
        if (q2()) {
            this.f86168e3 = null;
        } else {
            re.n nVar = new re.n(this);
            this.f86168e3 = nVar;
            hm1.m mVar = hm1.m.f282203a;
            nVar.f394280c = 2;
            nVar.f394281d = true;
            nVar.f394282e = true;
        }
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.c.f80940h.a(this, u0());
        l3(u0(), true);
        m3(null, u0());
    }

    public boolean e3() {
        return u0().f77292e2;
    }

    @Override // ze.n, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void f1() {
        super.f1();
        if (this.f86190v2 != null) {
            this.f86190v2.a();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[ILaunchWxaAppInfoNotify] onInitBeforeComponentsInstalled, appId[%s] mPendingPermissionUpdateTasks.size=%d", this.f74803n, java.lang.Integer.valueOf(((java.util.concurrent.LinkedBlockingQueue) this.f86175j3).size()));
        while (!this.f86175j3.isEmpty()) {
            ((java.lang.Runnable) this.f86175j3.remove()).run();
        }
        if (this.S || L0()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeWC", "[ILaunchWxaAppInfoNotify] onInitBeforeComponentsInstalled, appId[%s], may be finish by launch", this.f74803n);
            return;
        }
        if (E0().A.f47305h) {
            h3();
        }
        com.tencent.mm.plugin.appbrand.keylogger.w.e(this.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareRuntime);
        com.tencent.mm.plugin.appbrand.keylogger.w.g(this.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInitRuntimeGroup);
        com.tencent.mm.plugin.appbrand.keylogger.w.g(this.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInitRuntimeGroup_Game);
        ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.appbrand.y7(this, u0().f47277w));
        if (p0(uh1.a.class, false) != null) {
            N1((uh1.a) C2(uh1.a.class), true);
        }
    }

    public final void f3() {
        if (Z1() || a2()) {
            u0().Y = true;
            new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRegisterTask(this, S2(false)).s();
        } else {
            new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRegisterTask(this, S2(false)).d();
        }
        n91.g gVar = this.K2;
        if (gVar != null) {
            gVar.d();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public boolean g1() {
        int i17;
        int i18;
        if (!u0().f47283y1 || !com.tencent.mm.plugin.appbrand.appcache.g0.b(this.f74805p.f77281g) || (i17 = u0().G2) <= (i18 = u0().L)) {
            return false;
        }
        K("onInterceptReloadOnNewConfig, return true for reloadIfExist:true, preferVersionInLaunchParams:%d, appVersion:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        wg1.b bVar = wg1.b.f445717m;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeRestartHelper", "restartAppImplOnLaunchRequestedLatestVersion appId:%s", this.f74803n);
        new com.tencent.mm.plugin.appbrand.ye$$a(this, bVar).run();
        return true;
    }

    @Override // ze.n
    public int g2() {
        return l2().f87790f;
    }

    public final void g3(boolean z17) {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "notifyRemovedToMMTaskManager(isForDestroy:%b), appId:%s", java.lang.Boolean.valueOf(z17), this.f74803n);
        if (z17 || !L0()) {
            new com.tencent.luggage.sdk.processes.main.LuggageRemoveTask(this, z17 || L0()).d();
            if (this.f74816x0 || (u07 = u0()) == null) {
                return;
            }
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = u07.D;
            if (appBrandLaunchReferrer.f77322d == 1) {
                java.lang.String str = appBrandLaunchReferrer.f77323e;
                if (str == null || str.length() == 0) {
                    return;
                }
                java.lang.String appId = appBrandLaunchReferrer.f77323e;
                kotlin.jvm.internal.o.f(appId, "appId");
                uk0.a.b(new com.tencent.mm.ipcinvoker.type.IPCString(appId), new com.tencent.mm.plugin.appbrand.task.ipc.v(), null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public xi1.g getWindowAndroid() {
        xi1.g windowAndroid;
        com.tencent.mm.plugin.appbrand.hc hcVar = this.f74796e;
        if (hcVar == null || (windowAndroid = hcVar.getWindowAndroid()) == null) {
            return super.getWindowAndroid();
        }
        ze.p pVar = this.E2;
        if (pVar == null || !(pVar instanceof xi1.s)) {
            return windowAndroid;
        }
        if (!((xi1.s) pVar).shouldInLargeScreenCompatMode() && !(this.E2 instanceof com.tencent.mm.plugin.appbrand.widget.halfscreen.f)) {
            return windowAndroid;
        }
        xi1.q qVar = this.f86177k3;
        if (qVar == null || qVar.f454713d != windowAndroid || qVar.f454714e != this.E2) {
            this.f86177k3 = new xi1.r(windowAndroid, (xi1.s) this.E2);
        }
        return this.f86177k3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        if ((r8.A2 != null) != false) goto L23;
     */
    @Override // ze.n, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h1() {
        /*
            r8 = this;
            super.h1()
            r0 = 0
            r8.r3(r0)
            r8.u0()
            boolean r1 = n91.t.b(r8)
            r2 = 0
            if (r1 == 0) goto L1c
            n91.g r1 = new n91.g
            r1.<init>(r8)
            n91.c r3 = r1.f335875e
            r8.Q(r3)
            goto L1d
        L1c:
            r1 = r2
        L1d:
            r8.K2 = r1
            r8.I2()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r8.u0()
            if (r1 == 0) goto L2f
            r1.f47283y1 = r0
            ze.p r3 = r8.E2
            r3.init(r1)
        L2f:
            com.tencent.mm.plugin.appbrand.c r3 = new com.tencent.mm.plugin.appbrand.c
            r3.<init>()
            r8.D2 = r3
            i81.b0 r4 = new i81.b0
            r4.<init>(r8, r3)
            r8.A2 = r4
            r3 = 1
            r4.k(r3)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r4 = r8.u0()
            com.tencent.mm.plugin.appbrand.report.i2 r5 = r8.F2
            r5.getClass()
            java.lang.String r6 = "initConfig"
            kotlin.jvm.internal.o.g(r4, r6)
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r6 = r4.L1
            boolean r6 = r6.c()
            if (r6 == 0) goto L64
            r5.a(r0)
            com.tencent.luggage.sdk.launching.p r6 = r4.W1
            com.tencent.luggage.sdk.launching.p r7 = com.tencent.luggage.sdk.launching.p.PRE_RENDER
            if (r6 == r7) goto L64
            r6 = 5
            r5.a(r6)
        L64:
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r4 = r4.L1
            boolean r4 = r4.c()
            r5.f87875b = r4
            com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 r4 = r8.H2
            r4.getClass()
            java.lang.String r5 = "MicroMsg.HalfScreenManger"
            java.lang.String r6 = "[onRuntimeLaunch]"
            com.tencent.mars.xlog.Log.i(r5, r6)
            r4.u()
            boolean r4 = r8 instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t
            if (r4 == 0) goto L80
            goto Lb6
        L80:
            boolean r4 = r8.v0()
            if (r4 == 0) goto L8d
            i81.b0 r4 = r8.A2
            if (r4 == 0) goto L8b
            r0 = r3
        L8b:
            if (r0 == 0) goto Lb6
        L8d:
            if (r1 == 0) goto Lb6
            boolean r0 = r1.k()
            if (r0 == 0) goto Lb6
            java.lang.String r0 = r1.f77282h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb6
            com.tencent.mm.plugin.appbrand.hc r0 = r8.f74796e
            if (r0 == 0) goto Lb6
            java.lang.String r0 = r1.f77282h
            xi1.o r0 = xi1.o.d(r0)
            xi1.g r1 = r8.getWindowAndroid()
            xi1.p r1 = r1.getOrientationHandler()
            if (r0 != 0) goto Lb3
            xi1.o r0 = xi1.o.PORTRAIT
        Lb3:
            r1.b(r0, r2)
        Lb6:
            boolean r0 = r8.r2()
            if (r0 != 0) goto Lbd
            goto Lc9
        Lbd:
            com.tencent.mm.plugin.appbrand.task.ipc.AppBrandNotifyAppBrandForeground r0 = new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandNotifyAppBrandForeground
            com.tencent.luggage.sdk.processes.main.RuntimeInfo r1 = ye.e.a(r8)
            r0.<init>(r1)
            r0.d()
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.o6.h1():void");
    }

    public void h3() {
        if (com.tencent.mm.plugin.appbrand.appcache.g0.b(this.f74805p.f77281g)) {
            com.tencent.mm.plugin.appbrand.n6 n6Var = (com.tencent.mm.plugin.appbrand.n6) this.O2.b();
            if (n6Var.f86027a.getAndSet(true) || !n6Var.f86028b.get()) {
                return;
            }
            ((com.tencent.mm.plugin.appbrand.n6$$a) n6Var.f86030d).run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void i1() {
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17;
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = u0();
        if (u07 != null && (appBrandLaunchReferrer = u07.D) != null && appBrandLaunchReferrer.f77335t != null) {
            appBrandLaunchReferrer.f77335t = null;
        }
        if (com.tencent.mm.plugin.appbrand.widget.recent.y0.a() && !e3()) {
            final android.graphics.Bitmap H2 = H2(false);
            ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.o6$$j
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                    android.graphics.Bitmap bitmap = H2;
                    boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                    o6Var.r0();
                    java.lang.String str = o6Var.f74803n;
                    kk.l lVar = com.tencent.mm.plugin.appbrand.widget.recent.f1.f91978a;
                    int i17 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandTaskScreenshotBitmap", "saveScreenshotBitmap appId:%s", str);
                    if (bitmap == null || bitmap.isRecycled()) {
                        return;
                    }
                    java.lang.String str2 = com.tencent.mm.plugin.appbrand.widget.recent.f1.f91979b;
                    if (!com.tencent.mm.vfs.w6.j(str2)) {
                        com.tencent.mm.vfs.w6.u(str2);
                    }
                    java.lang.String a17 = com.tencent.mm.plugin.appbrand.widget.recent.f1.a(str);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                        return;
                    }
                    com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(a17);
                    java.lang.String str3 = a18.f213279f;
                    if (str3 != null) {
                        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                        if (!str3.equals(l17)) {
                            a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
                        }
                    }
                    com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
                    if (m17.a()) {
                        m17.f213266a.d(m17.f213267b);
                    }
                    if (!com.tencent.mm.vfs.w6.j(a17)) {
                        try {
                            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 50, android.graphics.Bitmap.CompressFormat.JPEG, a17, true);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandTask.AppBrandTaskScreenshotBitmap", e17, "", new java.lang.Object[0]);
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandTaskScreenshotBitmap", "saveScreenshotBitmap thumbPath:%s, exist:%b", a17, java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.j(a17)));
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str2);
                    if (r6Var.m() && r6Var.y()) {
                        com.tencent.mm.vfs.r6[] G = r6Var.G();
                        int length = G != null ? G.length : 0;
                        java.lang.Object[] objArr = {java.lang.Integer.valueOf(length)};
                        int i18 = rl.b.f397143a;
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandTaskScreenshotBitmap", "checkRemoveOldestSnapshot cache file count:%d", objArr);
                        if (G == null || length <= 10) {
                            return;
                        }
                        com.tencent.mm.vfs.r6 r6Var2 = G[0];
                        for (com.tencent.mm.vfs.r6 r6Var3 : G) {
                            if (r6Var3.A() && r6Var2 != null && r6Var3.B() < r6Var2.B()) {
                                r6Var2 = r6Var3;
                            }
                        }
                        if (r6Var2 != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandTaskScreenshotBitmap", "oldestFile deletePath:%s, delete:%b", r6Var2.o(), java.lang.Boolean.valueOf(r6Var2.l()));
                        }
                    }
                }
            });
        }
        new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandNotifyPauseTask(ye.e.a(this)).d();
        com.tencent.mm.plugin.appbrand.floatball.u uVar = this.f86193y2;
        if (uVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "pause, runtime:%s", uVar.f78147a.f74803n);
            uVar.f(new com.tencent.mm.plugin.appbrand.floatball.b0(uVar));
        }
        rh1.j jVar = this.f86194z2;
        if (jVar != null && jVar.f395635b != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMultiTaskLogic", "onRuntimePause", jVar.f395634a);
            if (jVar.f395636c != null) {
                jVar.f395636c.getClass();
            }
            jVar.f395636c = null;
        }
        xa1.b Q2 = Q2();
        if (Q2 != null) {
            Q2.c();
        }
        this.H2.getClass();
        com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a U2 = U2();
        if (U2 != null) {
            com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.b bVar = (com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.b) U2;
            com.tencent.mars.xlog.Log.i(bVar.f85735b, "pause");
            android.util.SparseArray sparseArray = bVar.f85736c;
            int i17 = 0;
            while (true) {
                if (!(i17 < sparseArray.size())) {
                    break;
                }
                int i18 = i17 + 1;
                fh1.x0 x0Var = ((fh1.z) ((fh1.i) sparseArray.valueAt(i17))).f262635i;
                if (x0Var != null) {
                    com.tencent.mars.xlog.Log.i(x0Var.getTag(), "pause");
                    jc3.j0 j0Var = x0Var.f282995g;
                    if (j0Var != null) {
                        ((rc3.w0) j0Var).pause();
                    }
                }
                i17 = i18;
            }
        }
        n91.g gVar = this.K2;
        if (gVar != null && gVar.f335873c.ordinal() <= 1) {
            gVar.f335872b.l0();
        }
        synchronized (this.f86164a3) {
            ih1.u uVar2 = this.f86165b3;
            if (uVar2 != null) {
                uVar2.c();
            }
        }
        java.lang.String str = this.f74803n;
        synchronized (com.tencent.mm.plugin.appbrand.location.b.f85512b) {
            com.tencent.mm.plugin.appbrand.location.b.f85511a.put(str, java.lang.Boolean.FALSE);
        }
        if (this.Z2 != null) {
            r0();
            ((com.tencent.mm.ui.feature.api.screenshot.j1) ((ct.e3) i95.n0.c(ct.e3.class))).Ni(null);
        }
        com.tencent.mm.plugin.appbrand.report.quality.j jVar2 = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a;
        java.lang.String str2 = this.f74803n;
        if (android.text.TextUtils.isEmpty(str2) || (b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(str2, false)) == null || b17.f88144p != this) {
            return;
        }
        b17.f88154z.f88309i = false;
    }

    public void i3(android.content.Intent intent) {
        com.tencent.luggage.sdk.jsapi.component.b bVar;
        x0().getReporter().d(intent);
        if (!wo.w0.q() || (bVar = (com.tencent.luggage.sdk.jsapi.component.b) x0().getCurrentPage().getCurrentPageView()) == null || bVar.z3()) {
            return;
        }
        com.tencent.mm.plugin.appbrand.page.fb a27 = x0().getCurrentPage().getCurrentPageView().a2();
        if (a27 instanceof gf.a2) {
            gf.f1 f1Var = (gf.f1) a27.getContentView();
            if (f1Var.f271055o) {
                com.tencent.mm.sdk.platformtools.n3 n3Var = f1Var.f271057q;
                n3Var.removeCallbacks(f1Var.f271058r);
                boolean a17 = com.tencent.mm.plugin.appbrand.utils.d5.a();
                java.lang.Runnable runnable = f1Var.f271060t;
                if (a17) {
                    ((gf.d1) runnable).run();
                } else {
                    n3Var.post(runnable);
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void j1() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1761, 20);
        com.tencent.mm.plugin.appbrand.report.v0.i(this.f74803n, d2(), this.f74805p.f77281g, 1761, 20, 1);
        super.j1();
    }

    public void j3() {
        if (L0() || this.S) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        I1(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.o6$$d
            @Override // java.lang.Runnable
            public final void run() {
                boolean z18 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                o6Var.getClass();
                com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime a17 = com.tencent.mm.plugin.appbrand.report.quality.e.a(o6Var);
                if (a17 == null || a17.f88150v > 0) {
                    return;
                }
                a17.f88150v = currentTimeMillis;
            }
        });
        com.tencent.mm.plugin.appbrand.ui.vc vcVar = this.f74811t;
        if (vcVar != null) {
            vcVar.setCanShowHideAnimation(true);
            if (vcVar instanceof com.tencent.mm.plugin.appbrand.ui.f6) {
                ((com.tencent.mm.plugin.appbrand.ui.f6) vcVar).setLoadingIconVisibility(true);
            }
        }
        n91.g gVar = this.K2;
        if (gVar != null && gVar.f335873c == n91.j.NOT_STARTED) {
            n91.c0 c0Var = (n91.c0) gVar.f335871a;
            c0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingImpl", "[gameload] onHalfScreenDone");
            ((ne0.n) ((oe0.r) i95.n0.c(oe0.r.class))).Ai("halfScreenDone", c0Var.f335859c, "");
            gVar.f335873c = n91.j.HALF_SCREEN;
        }
        if (r0() != null) {
            vj5.n.b(r0()).e();
        }
        if (u0().f77313z2 != null) {
            com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy weAppOpenUICallbackIPCProxy = u0().f77313z2;
            weAppOpenUICallbackIPCProxy.f84476d.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public com.tencent.mm.plugin.appbrand.jsapi.h0 k(java.lang.Class cls) {
        com.tencent.mm.plugin.appbrand.jsapi.h0 k17 = super.k(cls);
        if (k17 != null) {
            return k17;
        }
        if (i95.m.class.isAssignableFrom(cls)) {
            return (com.tencent.mm.plugin.appbrand.jsapi.h0) i95.n0.c(cls);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void k1() {
        n91.n nVar;
        K("onPostInit", new java.lang.Object[0]);
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.D(C0());
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.E("Common_IPC_appid");
        ((com.tencent.mm.plugin.appbrand.report.d3) com.tencent.mm.plugin.appbrand.report.c3.f87823a.invoke()).a(this.f74803n, g2());
        if (C0().x().compareTo(S2(false)) != 0) {
            throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.ENGLISH, "onPostInit appId[%s] mismatch libReader, self[%s] service[%s]", this.f74803n, S2(false).W0(), C0().x().W0()));
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig = u0();
        com.tencent.mm.plugin.appbrand.performance.m.e(this.f74803n, "Native", "ActivityCreate", "X", u0().I, java.lang.System.currentTimeMillis(), null);
        com.tencent.mm.plugin.appbrand.report.i2 i2Var = this.F2;
        i2Var.getClass();
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        if (!i2Var.f87874a && initConfig.W1 == com.tencent.luggage.sdk.launching.p.PRE_RENDER) {
            i2Var.f87874a = true;
        }
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.B(this.f74803n, new com.tencent.mm.plugin.appbrand.h7(this));
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.B("Common_IPC_appid", new com.tencent.mm.plugin.appbrand.i7(this));
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.B(this.f74803n, new com.tencent.mm.plugin.appbrand.j7(this));
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.B(this.f74803n, new com.tencent.mm.plugin.appbrand.k7(this));
        new com.tencent.mm.plugin.appbrand.report.p0(this, null);
        com.tencent.mm.plugin.appbrand.c6.a(2, u0());
        C0().N0(getWindowAndroid());
        com.tencent.mm.plugin.appbrand.page.n7 N2 = N2();
        if (N2 != null) {
            N2.N0(getWindowAndroid());
        }
        com.tencent.mm.plugin.appbrand.widget.h hVar = this.I2;
        hVar.getClass();
        hVar.b(initConfig);
        n91.g gVar = this.K2;
        if (gVar != null && (nVar = (n91.n) gVar.f335872b.f74811t) != null) {
            nVar.b();
        }
        com.tencent.mm.plugin.appbrand.menu.h1 h1Var = com.tencent.mm.plugin.appbrand.menu.h1.f85963a;
        if (this.I1) {
            j(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.o6$$r
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                    com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                    if (o6Var.N2() != null) {
                        iz5.a.g(null, o6Var.J0());
                    }
                }
            }, 1L);
        }
        tj1.f.f419694b = new tj1.g();
    }

    public final boolean k3(java.lang.Runnable runnable) {
        boolean containsValue;
        boolean z17 = false;
        if (!R0()) {
            synchronized (com.tencent.mm.plugin.appbrand.l.f84209b) {
                containsValue = com.tencent.mm.plugin.appbrand.l.f84208a.containsValue(this);
            }
            if (!containsValue) {
                u81.h hVar = this.N;
                if (!(hVar == null ? false : hVar.d())) {
                    z17 = true;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[wxa_reload]recycleRuntime %s, recycle[%b]", toString(), java.lang.Boolean.valueOf(z17));
        if (z17) {
            L2(runnable);
        }
        return z17;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public final void l0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "finish appId[%s] type[%d] hash[%d] stacktrace=%s", this.f74803n, java.lang.Integer.valueOf(this.f74805p.f77281g), java.lang.Integer.valueOf(hashCode()), android.util.Log.getStackTraceString(new java.lang.Throwable()));
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.d(this, com.tencent.mm.plugin.appbrand.jsapi.fakenative.h0.BackByClose);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.appbrand.v1.f90640a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessSharedPersistentRuntimeStore", "remove: " + this);
        boolean remove = com.tencent.mm.plugin.appbrand.v1.f90640a.remove(this.f74803n, this);
        if (remove) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = com.tencent.mm.plugin.appbrand.v1.f90640a;
            new com.tencent.luggage.sdk.processes.main.LuggagePopRuntimeTask(this).s();
        }
        if (remove || this.f74796e == null) {
            m(new com.tencent.mm.plugin.appbrand.s6(this));
            return;
        }
        super.l0();
        com.tencent.mm.plugin.appbrand.floatball.u uVar = this.f86193y2;
        if (uVar != null) {
            uVar.d();
            this.f86193y2 = null;
        }
    }

    public final void l3(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, boolean z17) {
        j91.d dVar = (j91.d) K1(j91.d.class);
        if (dVar != null) {
            if (this.f74806p0 || z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "refreshChatToolUser appBrandLaunchModeParams:%s user:%s", appBrandInitConfigWC.f47271d2, appBrandInitConfigWC.f47270c2);
                com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams appBrandLaunchModeParams = appBrandInitConfigWC.f47271d2;
                if ("subpackage".equals(appBrandLaunchModeParams == null ? "" : appBrandLaunchModeParams.f77321d)) {
                    java.lang.String str = appBrandInitConfigWC.f77283i;
                    if (j91.c.b(q2(), appBrandInitConfigWC.N.F, str)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "refreshChatToolUser enterPath:%s is chatTool path.", str);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "refreshChatToolUser enterPath:%s is not chatTool path, intercept", str);
                        appBrandInitConfigWC.f47270c2 = "";
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(appBrandInitConfigWC.f47270c2)) {
                        ((com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar).b();
                        return;
                    } else {
                        ((com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar).h("subpackage", appBrandInitConfigWC.G1, appBrandInitConfigWC.f47270c2);
                        return;
                    }
                }
                com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams appBrandLaunchModeParams2 = appBrandInitConfigWC.f47271d2;
                if ("allPage".equals(appBrandLaunchModeParams2 == null ? "" : appBrandLaunchModeParams2.f77321d)) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(appBrandInitConfigWC.f47270c2)) {
                        ((com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar).b();
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "refreshChatToolUserAllPage enterPath:%s is chatTool path.", appBrandInitConfigWC.f47270c2);
                    java.lang.String str2 = appBrandInitConfigWC.f47270c2;
                    com.tencent.mm.plugin.appbrand.jsapi.chattool.e[] eVarArr = com.tencent.mm.plugin.appbrand.jsapi.chattool.e.f80382d;
                    ((com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar).i(str2, 3);
                    return;
                }
                com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams appBrandLaunchModeParams3 = appBrandInitConfigWC.f47271d2;
                if (!com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE.equals(appBrandLaunchModeParams3 != null ? appBrandLaunchModeParams3.f77321d : "")) {
                    ((com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar).b();
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(appBrandInitConfigWC.f47270c2)) {
                    ((com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar).b();
                } else {
                    ((com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar).h(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, appBrandInitConfigWC.G1, appBrandInitConfigWC.f47270c2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0341 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // ze.n, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1() {
        /*
            Method dump skipped, instructions count: 2458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.o6.m1():void");
    }

    public final void m3(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC2) {
        com.tencent.mm.plugin.appbrand.wxassistant.q2 q2Var = (com.tencent.mm.plugin.appbrand.wxassistant.q2) K1(com.tencent.mm.plugin.appbrand.wxassistant.q2.class);
        if (q2Var != null) {
            q2Var.zb(appBrandInitConfigWC2.h());
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = appBrandInitConfigWC != null ? appBrandInitConfigWC.f() : "";
            objArr[1] = appBrandInitConfigWC2.f();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "refreshWxAssistant lastConfig:%s, newConfig:%s", objArr);
            if (appBrandInitConfigWC2.h()) {
                com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams appBrandAssistantParams = appBrandInitConfigWC2.A1;
                java.lang.String f17 = appBrandInitConfigWC2.f();
                appBrandAssistantParams.getClass();
                kotlin.jvm.internal.o.g(f17, "<set-?>");
                appBrandAssistantParams.f77200e = f17;
            }
            com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams appBrandAssistantParams2 = appBrandInitConfigWC2.A1;
            double d17 = appBrandAssistantParams2 != null ? appBrandAssistantParams2.f77201f : 0.0d;
            double d18 = appBrandAssistantParams2 != null ? appBrandAssistantParams2.f77202g : 0.0d;
            if (!(d17 == 0.0d)) {
                if (!(d18 == 0.0d)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CdpCommand_SetLocation", "process latitude: " + d17 + " longitude: " + d18);
                    com.tencent.mm.plugin.appbrand.wxassistant.cdp.s3 s3Var = new com.tencent.mm.plugin.appbrand.wxassistant.cdp.s3();
                    s3Var.f92184v = d17;
                    s3Var.f92185w = d18;
                    x1(lk1.c.class, s3Var);
                    nd.f.e(lk1.c.class, s3Var);
                    return;
                }
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.CdpCommand_SetLocation", "process latitude: " + d17 + " longitude: " + d18 + " ignore");
        }
    }

    @Override // ze.n, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void n1(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig, java.lang.Object obj) {
        androidx.lifecycle.o mo133getLifecycle;
        com.tencent.mm.plugin.appbrand.wd wdVar = this.E1;
        com.tencent.mm.plugin.appbrand.td tdVar = wdVar != null ? wdVar.f90960d : null;
        if (tdVar instanceof com.tencent.mm.plugin.appbrand.jsapi.fakenative.c) {
            com.tencent.mm.plugin.appbrand.jsapi.fakenative.c cVar = (com.tencent.mm.plugin.appbrand.jsapi.fakenative.c) tdVar;
            com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult miniProgramNavigationBackResult = (com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult) obj;
            iz5.a.g(null, miniProgramNavigationBackResult == null || cVar.f80942d == miniProgramNavigationBackResult.f74874d);
            com.tencent.mm.plugin.appbrand.wd wdVar2 = this.E1;
            if (wdVar2 != null) {
                wdVar2.a(cVar);
                com.tencent.mm.plugin.appbrand.wd wdVar3 = this.E1;
                com.tencent.mm.plugin.appbrand.td tdVar2 = wdVar3.f90960d;
                if (tdVar2 == null) {
                    if (tdVar2 != null && (mo133getLifecycle = tdVar2.mo133getLifecycle()) != null) {
                        mo133getLifecycle.c((androidx.lifecycle.v) ((jz5.n) wdVar3.f90961e).getValue());
                    }
                    wdVar3.f90960d = null;
                    this.E1 = null;
                }
            }
            if (cVar.f80944f) {
                return;
            }
        }
        super.n1(appBrandInitConfig, obj);
    }

    public void n3() {
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = E0();
        if (E0 == null) {
            return;
        }
        E0.A.f47304g = true;
        com.tencent.mm.sdk.event.IListener iListener = this.N2;
        if (iListener != null) {
            iListener.dead();
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$35 appBrandRuntimeWC$35 = new com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$35(this, com.tencent.mm.app.a0.f53288d);
        this.N2 = appBrandRuntimeWC$35;
        appBrandRuntimeWC$35.alive();
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public com.tencent.mm.plugin.appbrand.jsapi.g0 o1(java.lang.Class cls) {
        return C2(cls);
    }

    @Override // ze.n
    public com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode o2() {
        return this.Y1;
    }

    public void o3(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.s8 s8Var) {
        if (appBrandInitConfigWC == null) {
            return;
        }
        if (com.tencent.mm.plugin.appbrand.s8.OnDestroy != s8Var) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.d8(this, appBrandInitConfigWC));
        } else {
            if (this.f74816x0) {
                return;
            }
            J2(appBrandInitConfigWC);
        }
    }

    @Override // ze.n, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public lm0.a p1(java.lang.Class cls) {
        if (ri1.a.class == cls) {
            if (S2(false) != null) {
                return new ri1.p(this, null);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WebRenderingCacheProviderNewImpl", "try create provider but rt.libReader is NULL, appId:" + this.f74803n);
            return null;
        }
        if (be1.n.class == cls) {
            return com.tencent.mm.plugin.appbrand.luggage.customize.p.f85536d;
        }
        if (com.tencent.mm.plugin.appbrand.widget.h0.class == cls) {
            return com.tencent.mm.plugin.appbrand.widget.i0.f91268d;
        }
        if (te.b.class == cls) {
            return new te.a(kk.v.a(((v81.e) i95.n0.c(v81.e.class)).Z3(this.f74803n)), this.f74803n);
        }
        if (j91.d.class == cls) {
            return new com.tencent.mm.plugin.appbrand.jsapi.chattool.t(this);
        }
        if (yb1.p.class == cls) {
            return new yb1.o();
        }
        if (wd1.a.class == cls) {
            return new wd1.k(this);
        }
        if (com.tencent.mm.plugin.appbrand.wxassistant.q2.class == cls) {
            return u0().h() ? new com.tencent.mm.plugin.appbrand.wxassistant.k1(this) : com.tencent.mm.plugin.appbrand.wxassistant.f2.f92203d;
        }
        if (com.tencent.mm.plugin.appbrand.jsapi.share.h.class == cls) {
            return new com.tencent.mm.plugin.appbrand.jsapi.share.v1();
        }
        if (pf1.y.class == cls) {
            return new pf1.w(this);
        }
        return null;
    }

    public void p3(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader) {
        int i17 = iCommLibReader instanceof com.tencent.mm.plugin.appbrand.appcache.AssetReader ? 2 : iCommLibReader.getF90658d().pkgVersion() == 0 ? 0 : 1;
        if (i17 != 1) {
            com.tencent.mm.autogen.mmdata.rpt.WALocalPubResUsageReportStruct wALocalPubResUsageReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WALocalPubResUsageReportStruct();
            wALocalPubResUsageReportStruct.f61967d = wALocalPubResUsageReportStruct.b("Appid", this.f74803n, true);
            wALocalPubResUsageReportStruct.f61968e = wALocalPubResUsageReportStruct.b("Username", n0(), true);
            wALocalPubResUsageReportStruct.f61969f = d2();
            wALocalPubResUsageReportStruct.f61970g = this.f74805p.f77281g;
            if (this instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t) {
                wALocalPubResUsageReportStruct.f61971h = wALocalPubResUsageReportStruct.b("InstanceId", hashCode() + "#Functional", true);
            } else {
                wALocalPubResUsageReportStruct.f61971h = wALocalPubResUsageReportStruct.b("InstanceId", java.lang.String.valueOf(hashCode()), true);
            }
            wALocalPubResUsageReportStruct.f61972i = i17;
            wALocalPubResUsageReportStruct.f61973j = iCommLibReader.getF90658d().pkgVersion();
            if (com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.d()) {
                wALocalPubResUsageReportStruct.f61974k = 2L;
            } else {
                wALocalPubResUsageReportStruct.f61974k = 1L;
            }
            wALocalPubResUsageReportStruct.k();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[attachLibReader]" + iCommLibReader.getF90658d().pkgVersion());
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void q1() {
        super.q1();
        java.lang.String o6Var = toString();
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.L1;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "%s onResourcePrepareTimeout, no pending processes", o6Var);
        } else {
            java.util.Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "%s onResourcePrepareTimeout, process[%s]", o6Var, ((com.tencent.mm.plugin.appbrand.g3) it.next()).b());
            }
        }
        com.tencent.mm.plugin.appbrand.c6.a(11, u0());
        com.tencent.mm.plugin.appbrand.keylogger.w.b(this.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareResourceTimeout);
    }

    public final void q3() {
        if (f86162n3) {
            try {
                android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) b3.l.getSystemService(this.f74795d, android.view.accessibility.AccessibilityManager.class);
                if (accessibilityManager != null && !accessibilityManager.isTouchExplorationEnabled()) {
                    this.f74810s.setContentDescription(this.f74803n + ":" + u0().f77279e);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // ze.n, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void r1() {
        char c17;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17;
        n91.n nVar;
        com.tencent.mm.plugin.appbrand.widget.AppBrandGlobalNativeWidgetContainerView appBrandGlobalNativeWidgetContainerView;
        super.r1();
        com.tencent.mm.plugin.appbrand.m6.a(this.f74803n).f85721n = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.appbrand.floatball.u uVar = this.f86193y2;
        if (uVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "resume, runtime:%s", uVar.f78147a.f74803n);
            uVar.f(new com.tencent.mm.plugin.appbrand.floatball.z(uVar));
        }
        rh1.j jVar = this.f86194z2;
        if (jVar != null && jVar.f395635b != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMultiTaskLogic", "onRuntimeResume", jVar.f395634a);
            jVar.f395637d.run();
        }
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.k0.a(this.f74803n, t0(), l2());
        com.tencent.mm.plugin.appbrand.l.g(this);
        m91.f.c(this);
        u3();
        if (this.f74806p0) {
            x0().getReporter().i();
        }
        ((com.tencent.mm.plugin.appbrand.report.d3) com.tencent.mm.plugin.appbrand.report.c3.f87823a.invoke()).a(this.f74803n, g2());
        com.tencent.mm.plugin.appbrand.utils.j3 a17 = com.tencent.mm.plugin.appbrand.utils.j3.a(this, new com.tencent.mm.plugin.appbrand.l7(this));
        keep(a17);
        ((ku5.t0) ku5.t0.f312615d).h(a17, "getCopyPathMenuExpireTime");
        com.tencent.mm.plugin.appbrand.ipc.y.a(null, null);
        if (N2() != null) {
            Q2().b(N2().X1());
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeWC", "onResume, try upsertHandOff but get NULL PageView, appId:%s", this.f74803n);
        }
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = this.H2;
        l0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenManger", "[onRuntimeResume]");
        wa1.a aVar = wa1.b.f444100a;
        com.tencent.mm.plugin.appbrand.o6 o6Var = l0Var.f91195a;
        if (!aVar.c(o6Var) && (appBrandGlobalNativeWidgetContainerView = o6Var.C1) != null) {
            appBrandGlobalNativeWidgetContainerView.setCapsuleBarBackgroundRenderer(null);
        }
        if (aVar.b(o6Var) && o6Var.u0().L1.T) {
            l0Var.x();
        }
        l0Var.u();
        n91.g gVar = this.K2;
        if (gVar != null && (nVar = (n91.n) gVar.f335872b.f74811t) != null) {
            nVar.b();
        }
        com.tencent.mm.plugin.appbrand.na naVar = this.J2;
        com.tencent.mm.plugin.appbrand.o6 o6Var2 = naVar.f86058a;
        boolean z17 = o6Var2.f74806p0;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmbedHalfScreenWxaManager", "[onRuntimeResume] check willRelaunch [" + z17 + ']');
        if (z17) {
            naVar.f86059b = "";
            naVar.f86060c = 0;
            naVar.f86061d.set(false);
        }
        if (naVar.f86059b.length() > 0) {
            com.tencent.mm.plugin.appbrand.page.n7 N2 = o6Var2.N2();
            if ((N2 != null ? N2.hashCode() : 0) == naVar.f86060c && naVar.f86061d.getAndSet(false)) {
                com.tencent.mm.plugin.appbrand.hc hcVar = o6Var2.f74796e;
                kotlin.jvm.internal.o.e(hcVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC");
                ze.n nVar2 = (ze.n) ((com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC) hcVar).L(naVar.f86059b);
                if (nVar2 != null) {
                    com.tencent.mm.plugin.appbrand.o6 o6Var3 = (com.tencent.mm.plugin.appbrand.o6) nVar2;
                    com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = o6Var3.u0().L1;
                    kotlin.jvm.internal.o.f(halfScreenConfig, "halfScreenConfig");
                    if (halfScreenConfig.c()) {
                        if (halfScreenConfig.D == k91.x2.f305817e) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.EmbedHalfScreenWxaManager", "re-show embedded wxa");
                            o6Var2.u2(o6Var3.u0(), o6Var3.u0().f47269b2);
                        }
                    }
                }
                naVar.f86059b = "";
                naVar.f86060c = 0;
                naVar.f86061d.set(false);
            }
        }
        i81.b0 b0Var = this.A2;
        com.tencent.mm.plugin.appbrand.o6 o6Var4 = b0Var.f289525b;
        java.util.Map map = i81.j.f289592a;
        java.lang.String str = o6Var4.f74803n;
        if (o6Var4.f74811t != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "checkCanShowAdWhenResume, previous splashAd has not ended");
            c17 = 't';
        } else if (o6Var4.u0().L1.c()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "checkCanShowAdWhenResume, do not show ad in half screen wxa, appId: %s.", str);
            c17 = 'f';
        } else if (o6Var4.u0().r() == k91.z3.TRANSPARENT) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "checkCanShowAdWhenResume, window is transparent, appId: %s.", str);
            c17 = 'g';
        } else if (o6Var4.e3()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "checkCanShowAdWhenResume, do not show ad in plugin app, appId:%s.", str);
            c17 = 'h';
        } else {
            java.util.Set set = i81.d.f289556a;
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_appbrand_ad_hot_start, 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdABTests[AppBrandSplashAd]", "getIsHotStartEnable, IsHotStartEnable:%d", java.lang.Integer.valueOf(Ni));
            if (Ni != 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "checkCanShowAdWhenResume, clicfg_appbrand_ad_hot_start is not available, appId: %s.", str);
                c17 = 206;
            } else {
                i81.e b18 = i81.a0.b(str);
                if (b18 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "checkCanShowAdWhenResume, adInfo is null, appId: %s.", str);
                    c17 = 'j';
                } else if (!b18.f289579w) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "checkCanShowAdWhenResume, isShowWhenHotStart = false, appId: %s.", str);
                    c17 = 'k';
                } else if (!b18.f289581y) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "checkCanShowAdWhenResume, hasSuspended = false, appId: %s.", str);
                    c17 = 'l';
                } else if (java.lang.System.currentTimeMillis() < b18.f289578v + b18.f289580x) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "checkCanShowAdWhenResume, time not reach intervalThreshold, appId: %s, difference: %s.", str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - (b18.f289578v + b18.f289580x)));
                    c17 = 'm';
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "checkCanShowAdWhenResume, show ad when resume, appId: %s.", str);
                    c17 = 1;
                }
            }
        }
        if (c17 == 1) {
            b0Var.f289525b.S1();
            com.tencent.mm.plugin.appbrand.o6 o6Var5 = b0Var.f289525b;
            com.tencent.mm.plugin.appbrand.ui.vc vcVar = o6Var5.f74811t;
            if (vcVar instanceof com.tencent.mm.plugin.appbrand.ui.g) {
                i81.q qVar = ((com.tencent.mm.plugin.appbrand.ui.g) vcVar).f89719f;
                qVar.getClass();
                if (com.tencent.mm.sdk.platformtools.u3.e()) {
                    qVar.setVisibility(0);
                    qVar.bringToFront();
                } else {
                    com.tencent.mm.sdk.platformtools.u3.h(new i81.k(qVar));
                }
                b0Var.h(null);
                b0Var.k(2);
            } else {
                o6Var5.H0();
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "splash is not available, appId: %s", b0Var.f289525b.f74803n);
            }
        }
        i81.a0.a(b0Var.f289525b).f289581y = false;
        com.tencent.mm.plugin.appbrand.widget.AppBrandGlobalNativeWidgetContainerView appBrandGlobalNativeWidgetContainerView2 = this.C1;
        if (appBrandGlobalNativeWidgetContainerView2 != null) {
            appBrandGlobalNativeWidgetContainerView2.setTranslationX(0.0f);
            appBrandGlobalNativeWidgetContainerView2.setTranslationY(0.0f);
        }
        com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a U2 = U2();
        if (U2 != null) {
            com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.b bVar = (com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.b) U2;
            com.tencent.mars.xlog.Log.i(bVar.f85735b, "resume");
            android.util.SparseArray sparseArray = bVar.f85736c;
            int i17 = 0;
            while (true) {
                if (!(i17 < sparseArray.size())) {
                    break;
                }
                int i18 = i17 + 1;
                fh1.x0 x0Var = ((fh1.z) ((fh1.i) sparseArray.valueAt(i17))).f262635i;
                if (x0Var != null) {
                    com.tencent.mars.xlog.Log.i(x0Var.getTag(), "resume");
                    jc3.j0 j0Var = x0Var.f282995g;
                    if (j0Var != null) {
                        ((rc3.w0) j0Var).A();
                    }
                }
                i17 = i18;
            }
        }
        synchronized (this.f86164a3) {
            ih1.u uVar2 = this.f86165b3;
            if (uVar2 != null) {
                uVar2.e();
            }
        }
        com.tencent.mm.plugin.appbrand.screenshot.w wVar = this.Z2;
        if (wVar != null) {
            wVar.a(r0(), this);
        }
        com.tencent.mm.plugin.appbrand.report.quality.j jVar2 = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a;
        java.lang.String str2 = this.f74803n;
        if (!android.text.TextUtils.isEmpty(str2) && (b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(str2, false)) != null && b17.f88144p == this) {
            b17.f88154z.f88309i = true;
        }
        if (r2()) {
            new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandNotifyAppBrandForeground(ye.e.a(this)).d();
        }
    }

    public void r3(boolean z17) {
        boolean z18 = this.f86166c3;
        if (z17 == z18) {
            return;
        }
        K("setWillSwitchToNewContainer %b -> %b", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        this.f86166c3 = z17;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void s1() {
        com.tencent.mm.plugin.appbrand.page.n7 N2 = N2();
        if (N2 == null || !N2.j2()) {
            ((com.tencent.mm.plugin.appbrand.launching.rc) this.P2.b()).b(null, 0L);
        } else {
            N2.P(new com.tencent.mm.plugin.appbrand.jsapi.a0() { // from class: com.tencent.mm.plugin.appbrand.o6$$c
                @Override // com.tencent.mm.plugin.appbrand.jsapi.a0
                public final void onReady() {
                    ((com.tencent.mm.plugin.appbrand.launching.rc) com.tencent.mm.plugin.appbrand.o6.this.P2.b()).b(null, 0L);
                }
            });
        }
    }

    @Override // ze.n
    public boolean s2() {
        return super.s2();
    }

    public final void s3() {
        if (this instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t) {
            java.lang.Class[] clsArr = {uh1.a.class, com.tencent.mm.plugin.appbrand.jsapi.file.h.class, com.tencent.mm.plugin.appbrand.utils.t3.class, u81.a.class, com.tencent.mm.plugin.appbrand.performance.a.class};
            for (int i17 = 0; i17 < 5; i17++) {
                this.E.add(C2(clsArr[i17]));
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void t1() {
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.D(C0());
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.E("Common_IPC_appid");
        f3();
    }

    @Override // ze.n
    public boolean t2() {
        return ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Ni();
    }

    public void t3() {
        if (com.tencent.mm.plugin.appbrand.performance.m.c().booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "start AuditsTrace");
            int i17 = com.tencent.mm.plugin.appbrand.performance.k.f87355b;
            java.lang.String str = this.f74803n;
            java.util.HashMap hashMap = com.tencent.mm.plugin.appbrand.performance.h.f87351a;
            com.tencent.mm.plugin.appbrand.performance.f fVar = (com.tencent.mm.plugin.appbrand.performance.f) hashMap.get(str);
            if (!(fVar instanceof com.tencent.mm.plugin.appbrand.performance.j)) {
                if (fVar != null) {
                    fVar.h();
                }
                fVar = new com.tencent.mm.plugin.appbrand.performance.j(this);
                hashMap.put(str, fVar);
            }
            fVar.g();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "startDumpTrace");
            com.tencent.mm.sdk.platformtools.b4 b4Var = this.f86187s2;
            if (b4Var == null) {
                this.f86187s2 = new com.tencent.mm.sdk.platformtools.b4(com.tencent.mm.plugin.appbrand.performance.i.INST.h().getLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.appbrand.w7(this, (com.tencent.mm.plugin.appbrand.performance.a) b(com.tencent.mm.plugin.appbrand.performance.a.class)), true);
            } else {
                b4Var.d();
            }
            this.f86187s2.c(1000L, 1000L);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "[AppBrandRuntimeWC::%s::%s::%d::@%d]", this.f74803n, n0(), java.lang.Integer.valueOf(this.f74805p.f77281g), java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void u1() {
        com.tencent.mm.plugin.appbrand.report.quality.j jVar = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(this.f74803n, true);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandQualitySystem", "onAppBrandSplashViewRemoved appId[%s] NULL session", this.f74803n);
        } else {
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityFinishLoadingStruct weAppQualityFinishLoadingStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityFinishLoadingStruct();
            weAppQualityFinishLoadingStruct.f62463d = weAppQualityFinishLoadingStruct.b("InstanceId", b17.f88134d, true);
            weAppQualityFinishLoadingStruct.f62464e = weAppQualityFinishLoadingStruct.b("AppId", b17.f88135e, true);
            weAppQualityFinishLoadingStruct.f62465f = b17.f88139i;
            int i17 = b17.f88136f;
            weAppQualityFinishLoadingStruct.f62466g = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.v.demo : cm.v.debug : cm.v.release;
            weAppQualityFinishLoadingStruct.f62467h = b17.f88137g;
            weAppQualityFinishLoadingStruct.f62469j = u0().I;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            weAppQualityFinishLoadingStruct.f62470k = currentTimeMillis;
            weAppQualityFinishLoadingStruct.f62468i = currentTimeMillis - weAppQualityFinishLoadingStruct.f62469j;
            java.lang.String t07 = t0();
            if (t07 == null) {
                t07 = "";
            }
            weAppQualityFinishLoadingStruct.f62471l = weAppQualityFinishLoadingStruct.b(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, fp.s0.a(t07), true);
            weAppQualityFinishLoadingStruct.f62472m = b17.L ? 1L : 0L;
            weAppQualityFinishLoadingStruct.f62473n = (b17.f88151w == null || !b17.f88151w.a()) ? 0L : 1L;
            weAppQualityFinishLoadingStruct.f62474o = b17.a();
            weAppQualityFinishLoadingStruct.f62475p = b17.H;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            long j17 = b17.f88150v;
            if (j17 <= 0) {
                weAppQualityFinishLoadingStruct.f62476q = 0L;
            } else if (currentTimeMillis2 > j17) {
                weAppQualityFinishLoadingStruct.f62476q = currentTimeMillis2;
            } else {
                weAppQualityFinishLoadingStruct.f62476q = 0L;
            }
            weAppQualityFinishLoadingStruct.k();
        }
        I1(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.o6$$e
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                o6Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "showThirdBusiTipsWhenSplashRemoved");
                if (o6Var.L0() || o6Var.S) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeWC", "showThirdBusiTipsWhenSplashRemoved fail, isDestroyed:%b isFinishing:%b", java.lang.Boolean.valueOf(o6Var.S), java.lang.Boolean.valueOf(o6Var.L0()));
                    return;
                }
                if (o6Var.E0() != null && o6Var.E0().A != null) {
                    final com.tencent.mm.plugin.appbrand.trade.d dVar = (com.tencent.mm.plugin.appbrand.trade.d) o6Var.f86179l3.b();
                    com.tencent.mm.plugin.appbrand.o6 o6Var2 = dVar.f89238a;
                    final com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized launchWxaAppInfoParcelized = o6Var2.E0().A;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandThirdBusiTipsManager", "showThirdBusiTips: %b", java.lang.Boolean.valueOf(launchWxaAppInfoParcelized.f47307m));
                    if (launchWxaAppInfoParcelized.f47307m) {
                        mi1.o0 o0Var = mi1.o0.f326652a;
                        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = o6Var2.E0();
                        java.lang.String str = E0.f305843f;
                        if (android.text.TextUtils.isEmpty(str)) {
                            java.lang.String[] strArr = E0.Z;
                            if (strArr.length > 0) {
                                str = strArr[0];
                            }
                        }
                        o0Var.a(o6Var2, str, new yz5.a() { // from class: com.tencent.mm.plugin.appbrand.trade.d$$a
                            @Override // yz5.a
                            public final java.lang.Object invoke() {
                                com.tencent.mm.plugin.appbrand.trade.d dVar2 = com.tencent.mm.plugin.appbrand.trade.d.this;
                                com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized launchWxaAppInfoParcelized2 = launchWxaAppInfoParcelized;
                                dVar2.getClass();
                                launchWxaAppInfoParcelized2.f47307m = false;
                                com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(dVar2.f89238a.f74803n), com.tencent.mm.plugin.appbrand.trade.e.class, null);
                                return null;
                            }
                        });
                    }
                }
                if (o6Var.Y2.a()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[AfterLaunchTiming] cold_start NEW path: splash removed, skip afterlaunch (already called at onResourcePrepareComplete), appId=%s", o6Var.f74803n);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[AfterLaunchTiming] cold_start OLD path: splash removed, calling afterlaunch, appId=%s", o6Var.f74803n);
                    com.tencent.mm.plugin.appbrand.trade.l.a(o6Var);
                }
            }
        });
        if (u0().h()) {
            ((com.tencent.mm.plugin.appbrand.wxassistant.u0) ((com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class))).Ui(u0().f(), this.f74803n, com.tencent.mm.plugin.appbrand.service.o0.f88728f);
        }
    }

    public final void u3() {
        new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandUpdateTask(this, S2(false)).d();
        n91.g gVar = this.K2;
        if (gVar != null) {
            gVar.d();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public boolean v0() {
        return this.B2.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x023a  */
    @Override // ze.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w2() {
        /*
            Method dump skipped, instructions count: 1001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.o6.w2():void");
    }

    @Override // ze.n
    public boolean x2() {
        return e3();
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void y1() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        super.y1();
        m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.o6$$i
            @Override // java.lang.Runnable
            public final void run() {
                boolean z18 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                com.tencent.mm.plugin.appbrand.page.n7 N2 = o6Var.N2();
                long j17 = currentTimeMillis;
                if (N2 == null || N2.m2()) {
                    ((com.tencent.mm.plugin.appbrand.launching.rc) o6Var.P2.b()).b(com.tencent.mm.plugin.appbrand.page.wd.AUTO_RE_LAUNCH, j17);
                } else {
                    N2.P(new com.tencent.mm.plugin.appbrand.u7(o6Var, N2, j17));
                }
            }
        });
    }

    @Override // ze.n
    public boolean y2(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) appBrandInitConfig;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = appBrandInitConfigWC.f47269b2;
        if (appBrandInitConfigWC.I2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return false. appId[%s] enterPath[%s], isFromSaveStackWhenLoopJump", this.f74803n, appBrandInitConfigWC.f77283i);
            return false;
        }
        if (this.f74797f.size() >= 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return false. appId[%s] enterPath[%s], mAppBrandRuntimePageStacks.size()>=2", this.f74803n, appBrandInitConfigWC.f77283i);
            return false;
        }
        if (this.f86185q2 || appBrandStatObject.f87790f == 1099) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return true. appId[%s] mShouldRelaunchCausedByFunctionalPageOpen[%b] newScene[%d]", this.f74803n, java.lang.Boolean.valueOf(this.f86185q2), java.lang.Integer.valueOf(appBrandStatObject.f87790f));
            this.f86185q2 = appBrandStatObject.f87790f == 1099;
            return true;
        }
        if (android.text.TextUtils.isEmpty(appBrandInitConfigWC.f77283i) && com.tencent.mm.plugin.appbrand.dc.a(this)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return true. appId[%s] enterPath[%s], old is gameFunctionalPage", this.f74803n, appBrandInitConfigWC.f77283i);
            return true;
        }
        if (1038 == appBrandStatObject.f87790f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return false. appId[%s], reason=1038 back from other MiniProgram", this.f74803n);
            return false;
        }
        if (appBrandInitConfigWC.f47273p0) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = u0();
            java.util.Objects.requireNonNull(u07);
            java.lang.String currentUrl = x0().getCurrentUrl();
            if ((u46.l.e(appBrandInitConfigWC.f77283i) ? java.lang.Boolean.TRUE : u46.l.c(appBrandInitConfigWC.f77283i, currentUrl) ? java.lang.Boolean.TRUE : "wxca8d4b8e8feedc2a".equals(this.f74803n) ? java.lang.Boolean.FALSE : (u46.l.c(appBrandInitConfigWC.f77283i, u07.f77283i) && appBrandInitConfigWC.K1 == u07.K1) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE).booleanValue()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return false. appId:%s, by forceIndexNoReLaunch, newUrl:%s, oldUrl:%s, currentUrl:%s, newMode:%d, oldMode:%d", this.f74803n, appBrandInitConfigWC.f77283i, u07.f77283i, currentUrl, java.lang.Integer.valueOf(appBrandInitConfigWC.K1), java.lang.Integer.valueOf(u07.K1));
                return false;
            }
        }
        iz5.a.e(com.tencent.luggage.sdk.launching.p.HEADLESS, appBrandInitConfigWC.W1);
        if (x0() != null && x0().t()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return true, appId[%s], coldStartMode:%s, hasHeadlessPage:true", this.f74803n, appBrandInitConfigWC.W1);
            return true;
        }
        java.util.Iterator it = this.f86186r2.iterator();
        while (it.hasNext()) {
            java.lang.Boolean b17 = ((com.tencent.mm.plugin.appbrand.gc) it.next()).b(appBrandInitConfigWC);
            if (b17 != null) {
                return b17.booleanValue();
            }
        }
        if (!android.text.TextUtils.isEmpty(appBrandInitConfigWC.f77283i)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return true. appId[%s] enterPath[%s]", this.f74803n, appBrandInitConfigWC.f77283i);
            return true;
        }
        if (u0().L1.c() != appBrandInitConfigWC.L1.c()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return true. appId[%s] halfScreenConfig enable change to:%b", this.f74803n, java.lang.Boolean.valueOf(appBrandInitConfigWC.L1.c()));
            return true;
        }
        if (u46.a.a(new int[]{1001, 1003, 1023, 1038, yc1.s.CTRL_INDEX, 1080, com.tencent.mm.plugin.appbrand.jsapi.p6.CTRL_INDEX, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.z.CTRL_INDEX, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h0.CTRL_INDEX, 1103, 1104, 1113, 1114, 1117, 1131, com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_OUT, 1112, 1127, 1134, 1187, 1223}, appBrandStatObject.f87790f)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return false. keepNoRelaunch appId[%s] newScene[%d]", this.f74803n, java.lang.Integer.valueOf(appBrandStatObject.f87790f));
            return false;
        }
        if (1030 == appBrandStatObject.f87790f && android.text.TextUtils.isEmpty(appBrandInitConfigWC.f77283i)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return false. special for monkey test appId[%s]", this.f74803n);
            return false;
        }
        if (8000 == appBrandStatObject.f87790f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return true. appId[%s] newScene[%d]", this.f74803n, java.lang.Integer.valueOf(appBrandStatObject.f87790f));
            return true;
        }
        if (N0() && android.text.TextUtils.isEmpty(appBrandInitConfigWC.f77283i)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return false. special for wx assistant appId[%s]", this.f74803n);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return true. appId[%s] fallback logic", this.f74803n);
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public com.tencent.mm.plugin.appbrand.pip.o0 z0() {
        com.tencent.mm.plugin.appbrand.pip.o0 z07 = super.z0();
        if (z07 != null) {
            com.tencent.mm.plugin.appbrand.pip.u0 u0Var = com.tencent.mm.plugin.appbrand.pip.u0.f87555a;
            if (z07.A != u0Var) {
                z07.A = u0Var;
                z07.f();
            }
            z07.C = com.tencent.mm.plugin.appbrand.pip.p0.INSTANCE;
        }
        return z07;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.tencent.mm.plugin.appbrand.o6$$f] */
    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public final void z1(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig, final java.lang.String str) {
        ?? r07 = new java.lang.Object() { // from class: com.tencent.mm.plugin.appbrand.o6$$f
            public final java.lang.Object a(java.lang.Object obj) {
                com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                java.lang.String str2 = str;
                boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                o6Var.getClass();
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) ((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig) obj);
                appBrandInitConfigWC.m();
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                appBrandInitConfigWC.I = java.lang.System.currentTimeMillis();
                appBrandInitConfigWC.f47267J = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(java.lang.System.currentTimeMillis()) + (java.lang.System.nanoTime() % 1000000);
                appBrandInitConfigWC.K = sj1.l.a();
                appBrandInitConfigWC.f47268a2 = new com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle(o6Var.u0().f77298k2.f88134d, str2);
                appBrandInitConfigWC.f77298k2 = new com.tencent.mm.plugin.appbrand.report.quality.QualitySession(com.tencent.mm.plugin.appbrand.utils.t.a(o6Var.u0().f47279x0), o6Var.u0(), o6Var.l2(), 0L);
                appBrandInitConfigWC.i(appBrandInitConfigWC.f77298k2.f88134d);
                return null;
            }
        };
        if (appBrandInitConfig == null) {
            r07.a(u0());
            if (this.f471745e2) {
                u0().L1 = com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.Y;
            }
            if (n91.t.c(u0())) {
                u0().L1 = com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.Y;
                u0().Y = false;
                u0().f77292e2 = false;
                u0().M1 = false;
                u0().C1 = null;
            }
        } else if (appBrandInitConfig instanceof com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) appBrandInitConfig;
            if (u46.l.c(appBrandInitConfigWC.f47277w, u0().f47277w)) {
                r07.a(appBrandInitConfig);
                if (appBrandInitConfigWC.f47269b2 == null) {
                    appBrandInitConfigWC.f47269b2 = l2();
                }
            }
        }
        this.L.c(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class);
        super.z1(appBrandInitConfig, str);
    }

    public o6(com.tencent.mm.plugin.appbrand.l5 l5Var) {
        super((com.tencent.mm.plugin.appbrand.hc) l5Var);
        this.f86172i2 = new bm5.x0(new com.tencent.mm.plugin.appbrand.o6$$a());
        this.f86174j2 = "";
        this.f86176k2 = new vd1.b();
        this.f86182n2 = false;
        this.f86183o2 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f86184p2 = 0;
        this.f86186r2 = new java.util.LinkedList();
        this.f86187s2 = null;
        this.B2 = new bm5.z0(new bm5.y0() { // from class: com.tencent.mm.plugin.appbrand.o6$$l
            @Override // bm5.y0
            public final boolean a() {
                return com.tencent.mm.plugin.appbrand.o6.A2(com.tencent.mm.plugin.appbrand.o6.this);
            }
        });
        this.C2 = 0;
        this.G2 = new com.tencent.mm.plugin.appbrand.report.h2(this);
        this.H2 = new com.tencent.mm.plugin.appbrand.widget.halfscreen.l0(this);
        this.I2 = new com.tencent.mm.plugin.appbrand.widget.h(this);
        this.J2 = new com.tencent.mm.plugin.appbrand.na(this);
        this.K2 = null;
        this.O2 = new bm5.i1(new bm5.h1() { // from class: com.tencent.mm.plugin.appbrand.o6$$t
            @Override // bm5.h1
            public final java.lang.Object a() {
                boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                o6Var.getClass();
                return new com.tencent.mm.plugin.appbrand.n6(o6Var);
            }
        }, null);
        this.P2 = new bm5.i1(new bm5.h1() { // from class: com.tencent.mm.plugin.appbrand.o6$$u
            @Override // bm5.h1
            public final java.lang.Object a() {
                boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                o6Var.getClass();
                return new com.tencent.mm.plugin.appbrand.launching.rc(o6Var);
            }
        }, null);
        this.S2 = new byte[0];
        this.U2 = new com.tencent.mm.plugin.appbrand.game.preload.i[]{null};
        this.V2 = new com.tencent.mm.plugin.appbrand.page.ye[]{null};
        this.W2 = new com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a[]{null};
        this.Y2 = new bm5.z0(new com.tencent.mm.plugin.appbrand.o6$$v());
        this.Z2 = null;
        this.f86164a3 = new java.lang.Object();
        this.f86165b3 = null;
        this.f86166c3 = false;
        this.f86167d3 = false;
        this.f86169f3 = new bm5.x0(new bm5.w0() { // from class: com.tencent.mm.plugin.appbrand.o6$$w
            @Override // bm5.w0
            public final java.lang.Object a() {
                boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                o6Var.getClass();
                return new com.tencent.mm.plugin.appbrand.b7(o6Var);
            }
        });
        this.f86170g3 = new bm5.z0(new bm5.y0() { // from class: com.tencent.mm.plugin.appbrand.o6$$x
            @Override // bm5.y0
            public final boolean a() {
                return com.tencent.mm.plugin.appbrand.o6.z2(com.tencent.mm.plugin.appbrand.o6.this);
            }
        });
        iz5.a.g("AppBrandRuntimeWC's initial context should be AppBrandRuntimePersistentContextWrapper", this.f74795d instanceof com.tencent.mm.plugin.appbrand.ui.z6);
        this.F2 = new com.tencent.mm.plugin.appbrand.report.i2();
        this.I1 = f86162n3;
        this.f86173i3 = new com.tencent.mm.plugin.appbrand.x7(this);
        this.f86175j3 = new java.util.concurrent.LinkedBlockingQueue();
        this.f86179l3 = new bm5.i1(new bm5.h1() { // from class: com.tencent.mm.plugin.appbrand.o6$$y
            @Override // bm5.h1
            public final java.lang.Object a() {
                boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                o6Var.getClass();
                return new com.tencent.mm.plugin.appbrand.trade.d(o6Var);
            }
        }, null);
        this.f86181m3 = new com.tencent.mm.plugin.appbrand.e8(this, true);
        O1(l5Var);
    }

    public o6(xi1.g gVar) {
        super(gVar);
        this.f86172i2 = new bm5.x0(new com.tencent.mm.plugin.appbrand.o6$$a());
        this.f86174j2 = "";
        this.f86176k2 = new vd1.b();
        this.f86182n2 = false;
        this.f86183o2 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f86184p2 = 0;
        this.f86186r2 = new java.util.LinkedList();
        this.f86187s2 = null;
        this.B2 = new bm5.z0(new bm5.y0() { // from class: com.tencent.mm.plugin.appbrand.o6$$l
            @Override // bm5.y0
            public final boolean a() {
                return com.tencent.mm.plugin.appbrand.o6.A2(com.tencent.mm.plugin.appbrand.o6.this);
            }
        });
        this.C2 = 0;
        this.G2 = new com.tencent.mm.plugin.appbrand.report.h2(this);
        this.H2 = new com.tencent.mm.plugin.appbrand.widget.halfscreen.l0(this);
        this.I2 = new com.tencent.mm.plugin.appbrand.widget.h(this);
        this.J2 = new com.tencent.mm.plugin.appbrand.na(this);
        this.K2 = null;
        this.O2 = new bm5.i1(new bm5.h1() { // from class: com.tencent.mm.plugin.appbrand.o6$$t
            @Override // bm5.h1
            public final java.lang.Object a() {
                boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                o6Var.getClass();
                return new com.tencent.mm.plugin.appbrand.n6(o6Var);
            }
        }, null);
        this.P2 = new bm5.i1(new bm5.h1() { // from class: com.tencent.mm.plugin.appbrand.o6$$u
            @Override // bm5.h1
            public final java.lang.Object a() {
                boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                o6Var.getClass();
                return new com.tencent.mm.plugin.appbrand.launching.rc(o6Var);
            }
        }, null);
        this.S2 = new byte[0];
        this.U2 = new com.tencent.mm.plugin.appbrand.game.preload.i[]{null};
        this.V2 = new com.tencent.mm.plugin.appbrand.page.ye[]{null};
        this.W2 = new com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a[]{null};
        this.Y2 = new bm5.z0(new com.tencent.mm.plugin.appbrand.o6$$v());
        this.Z2 = null;
        this.f86164a3 = new java.lang.Object();
        this.f86165b3 = null;
        this.f86166c3 = false;
        this.f86167d3 = false;
        this.f86169f3 = new bm5.x0(new bm5.w0() { // from class: com.tencent.mm.plugin.appbrand.o6$$w
            @Override // bm5.w0
            public final java.lang.Object a() {
                boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                o6Var.getClass();
                return new com.tencent.mm.plugin.appbrand.b7(o6Var);
            }
        });
        this.f86170g3 = new bm5.z0(new bm5.y0() { // from class: com.tencent.mm.plugin.appbrand.o6$$x
            @Override // bm5.y0
            public final boolean a() {
                return com.tencent.mm.plugin.appbrand.o6.z2(com.tencent.mm.plugin.appbrand.o6.this);
            }
        });
        iz5.a.g("AppBrandRuntimeWC's initial context should be AppBrandRuntimePersistentContextWrapper", this.f74795d instanceof com.tencent.mm.plugin.appbrand.ui.z6);
        this.F2 = new com.tencent.mm.plugin.appbrand.report.i2();
        this.I1 = f86162n3;
        this.f86173i3 = new com.tencent.mm.plugin.appbrand.x7(this);
        this.f86175j3 = new java.util.concurrent.LinkedBlockingQueue();
        this.f86179l3 = new bm5.i1(new bm5.h1() { // from class: com.tencent.mm.plugin.appbrand.o6$$y
            @Override // bm5.h1
            public final java.lang.Object a() {
                boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                o6Var.getClass();
                return new com.tencent.mm.plugin.appbrand.trade.d(o6Var);
            }
        }, null);
        this.f86181m3 = new com.tencent.mm.plugin.appbrand.e8(this, true);
        O1(null);
    }
}
