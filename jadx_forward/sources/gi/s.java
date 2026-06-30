package gi;

/* loaded from: classes12.dex */
public class s extends ph.f {

    /* renamed from: b, reason: collision with root package name */
    public long f353635b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Runnable f353636c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f353637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f353638e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z17, final android.content.Context context, boolean z18) {
        super(z17);
        this.f353637d = context;
        this.f353638e = z18;
        this.f353635b = 0L;
        this.f353636c = new java.lang.Runnable() { // from class: gi.s$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.LifeCycle", "onRefreshHealthStats");
                gi.u0.c(context);
            }
        };
    }

    @Override // ph.f, ph.g
    public boolean a(final ph.c cVar, int i17) {
        ku5.u0 u0Var = ku5.t0.f394148d;
        final android.content.Context context = this.f353637d;
        ((ku5.t0) u0Var).g(new java.lang.Runnable() { // from class: gi.s$$d
            /* JADX WARN: Removed duplicated region for block: B:18:0x01a1 A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:12:0x0175, B:14:0x0184, B:16:0x0199, B:18:0x01a1, B:19:0x01a7), top: B:11:0x0175 }] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x01a6  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x016f  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 474
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: gi.RunnableC28369x34d291.run():void");
            }
        });
        return false;
    }

    @Override // ph.f, ph.g
    public boolean c(ph.c cVar, int i17) {
        if (mm.o.c()) {
            qh.b a17 = qh.b.a();
            if (a17.f444853m) {
                java.lang.String f17 = ri.i.f();
                int c17 = a17.c();
                int d17 = a17.d();
                ri.C30087x345e2f c30087x345e2f = new ri.C30087x345e2f();
                android.util.SparseArray sparseArray = ri.s.f477541a;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                c30087x345e2f.mo3938xab27b508(linkedHashMap);
                java.lang.String a18 = ri.s.a(linkedHashMap);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.BatteryReporter", "#statSamplingData");
                ri.s.b(0, 5, f17, a18, c17, d17, "samplingData", 0L, "", 0L, "", 0L, a17.f444849i, "", a17.f444842b, a17.f444845e, a17.f444850j, "");
            }
        }
        if (i17 >= 430 && ((mm.l.b() || i17 >= 450) && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && !com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8())) {
            java.util.List list = ri.p.f477492a;
            qh.b a19 = qh.b.a();
            java.lang.String f18 = ri.i.f();
            java.lang.String a27 = ri.t.a();
            ri.C30073x33757a c30073x33757a = new ri.C30073x33757a();
            android.util.SparseArray sparseArray2 = ri.s.f477541a;
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            c30073x33757a.mo3938xab27b508(linkedHashMap2);
            java.lang.String a28 = ri.s.a(linkedHashMap2);
            int u17 = wh.m.u(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            float a29 = pj.h.f436442a ? pj.h.a() : 0.0f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.BatteryReporter", "#reportThermalException");
            ri.s.b(1, 5, f18, a28, a19.c(), a19.d(), "thermalException", u17, "oppo", (int) a29, "", i17, a27, "", 0L, 0L, 0L, "");
            final gi.q1 q1Var = gi.q1.f353624f;
            q1Var.getClass();
            try {
                if (j62.e.g().a("clicfg_battery_thermal_enable", "1", false, true).equals("1")) {
                    ph.u uVar = q1Var.f353629d;
                    if (uVar != null) {
                        final android.os.Handler handler = uVar.f435829h.f444870f;
                        handler.post(new java.lang.Runnable() { // from class: gi.q1$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                gi.q1 q1Var2 = gi.q1.this;
                                if (q1Var2.f353626a) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThermalExceptionMonitor", "monitor is already running, skip");
                                    return;
                                }
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                long j17 = gi.q1.f353625g;
                                if (j17 != 0 && currentTimeMillis - j17 < 1800000) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThermalExceptionMonitor", "monitor too many, fromLast = " + ((currentTimeMillis - gi.q1.f353625g) / 60000) + "min");
                                    return;
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThermalExceptionMonitor", "start watching");
                                ph.u e17 = gi.d.e();
                                rh.c1 c1Var = e17 == null ? null : new gi.s1(e17.f435829h, "alertBatt").f353554a;
                                q1Var2.f353628c = c1Var;
                                if (c1Var != null) {
                                    q1Var2.f353627b = 0;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThermalExceptionMonitor", "start, loop count: " + (q1Var2.f353627b + 1));
                                    q1Var2.f353628c.I();
                                    handler.postDelayed(q1Var2.f353630e, 60000L);
                                    q1Var2.f353626a = true;
                                    gi.q1.f353625g = currentTimeMillis;
                                }
                            }
                        });
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ThermalExceptionMonitor", "monitor disabled");
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    @Override // ph.f, ph.h
    public boolean d(final ph.c cVar, final long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.LifeCycle", "#onAppLowEnergy, bgMillis=" + j17);
        ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: gi.s$$e
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.LifeCycle", "isAudioActive: " + kh.y.f389480d.b());
                ph.c cVar2 = ph.c.this;
                if (cVar2.d()) {
                    return;
                }
                if (cVar2.e() && wh.m.A(cVar2.f435789b)) {
                    return;
                }
                boolean f17 = qh.b.a().f();
                long j18 = j17;
                if (!f17 && !gi.i0.f353588b && j18 >= 300000) {
                    gi.i0.b(true);
                }
                ri.o.a(j18);
            }
        });
        return false;
    }

    @Override // ph.f, ph.g
    public boolean e(ph.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.LifeCycle", "#onBatteryFullCharged");
        ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: gi.s$$c
            @Override // java.lang.Runnable
            public final void run() {
                gi.s.this.h();
                ((ob0.y2) i95.n0.c(ob0.y2.class)).getClass();
            }
        });
        return false;
    }

    @Override // ph.f, ph.g
    public boolean f(final ph.c cVar, final java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.LifeCycle", "#onStateChanged");
        ku5.u0 u0Var = ku5.t0.f394148d;
        final android.content.Context context = this.f353637d;
        final boolean z17 = this.f353638e;
        ((ku5.t0) u0Var).g(new java.lang.Runnable() { // from class: gi.s$$a
            @Override // java.lang.Runnable
            public final void run() {
                gi.s sVar = gi.s.this;
                sVar.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("currStat, charging = ");
                ph.c cVar2 = cVar;
                sb6.append(cVar2.d());
                sb6.append(", fg = ");
                sb6.append(cVar2.e());
                sb6.append(", screenOn = ");
                android.content.Context context2 = cVar2.f435789b;
                sb6.append(wh.m.A(context2));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.LifeCycle", sb6.toString());
                java.lang.String str2 = str;
                boolean equals = "android.os.action.DEVICE_IDLE_MODE_CHANGED".equals(str2);
                final android.content.Context context3 = context;
                if (equals || wh.e1.a(context3).equals(str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.LifeCycle", "currStat, devIdle = " + wh.m.z(context2) + ", powerSave = " + cVar2.c());
                }
                if ("android.intent.action.ACTION_POWER_CONNECTED".equals(str2) && java.lang.System.currentTimeMillis() - sVar.f353635b > 3600000) {
                    sVar.f353635b = java.lang.System.currentTimeMillis();
                    gi.d.f();
                }
                if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(str2) && android.os.Build.VERSION.SDK_INT < 29) {
                    sVar.h();
                    ((ob0.y2) i95.n0.c(ob0.y2.class)).getClass();
                }
                if ("android.intent.action.ACTION_POWER_CONNECTED".equals(str2) || "android.intent.action.ACTION_POWER_DISCONNECTED".equals(str2)) {
                    java.util.Map map = pj.i.f436443a;
                    ph.u e17 = gi.d.e();
                    if (e17 != null) {
                        e17.f435829h.f444870f.post(new java.lang.Runnable() { // from class: pj.i$$c
                            @Override // java.lang.Runnable
                            public final void run() {
                                final android.content.Context context4 = context3;
                                if (wh.m.w(context4)) {
                                    pj.i.b("posInCharge", "batt_amp_charge_pos", "batt_amp_charge_neg", new m3.i() { // from class: pj.i$$d
                                        @Override // m3.i
                                        public final java.lang.Object get() {
                                            android.content.Context context5 = context4;
                                            if (wh.m.w(context5)) {
                                                long h17 = wh.m.h(context5);
                                                if (h17 != -1 && h17 != 0) {
                                                    return new pj.j(h17 > 0, true, h17);
                                                }
                                            }
                                            return null;
                                        }
                                    });
                                } else {
                                    pj.i.b("posOutOfCharge", "batt_amp_uncharge_pos", "batt_amp_uncharge_neg", new m3.i() { // from class: pj.i$$e
                                        @Override // m3.i
                                        public final java.lang.Object get() {
                                            android.content.Context context5 = context4;
                                            if (!wh.m.w(context5)) {
                                                long h17 = wh.m.h(context5);
                                                if (h17 != -1 && h17 != 0) {
                                                    return new pj.j(h17 > 0, false, h17);
                                                }
                                            }
                                            return null;
                                        }
                                    });
                                }
                            }
                        });
                    }
                }
                if (z17) {
                    if ("android.intent.action.SCREEN_OFF".equals(str2)) {
                        ((lh.t) ((jz5.n) lh.t.f400166h).mo141623x754a37bb()).c(0);
                    }
                    if ("android.intent.action.SCREEN_ON".equals(str2)) {
                        ((lh.t) ((jz5.n) lh.t.f400166h).mo141623x754a37bb()).a();
                    }
                }
            }
        });
        return false;
    }

    public final void h() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.y2) i95.n0.c(ob0.y2.class))).getClass();
        cr0.r2.f303267a.c(null);
        android.os.Handler handler = gi.p.f353608a;
        java.lang.Runnable runnable = this.f353636c;
        handler.removeCallbacks(runnable);
        gi.p.f353608a.postDelayed(runnable, 300000L);
    }
}
