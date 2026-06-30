package ri;

/* loaded from: classes12.dex */
public class k extends qh.v {

    /* renamed from: g, reason: collision with root package name */
    public int f477426g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f477427h;

    @Override // qh.v, rh.i3
    public void a(rh.h3 h3Var) {
        java.lang.String str = h3Var.f476943a;
        java.lang.String str2 = h3Var.f476944b;
        java.lang.String str3 = h3Var.f476945c;
        long j17 = h3Var.f476946d;
        java.util.List list = ri.p.f477492a;
        qh.b a17 = qh.b.a();
        if (a17.f444853m) {
            int c17 = a17.c();
            int d17 = a17.d();
            java.lang.String f17 = ri.i.f();
            long max = j17 > 0 ? java.lang.Math.max(1L, j17 / 60000) : 0L;
            java.lang.String str4 = android.text.TextUtils.isEmpty(str2) ? "empty" : str2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.BatteryReporter", "#reportIllegalNotification");
            android.util.SparseArray sparseArray = ri.s.f477541a;
            if (android.text.TextUtils.isEmpty(str)) {
                str = "empty";
            }
            ri.s.b(1, 5, f17, str4, c17, d17, "illNotify", 0L, str, 0L, "duringMin", max, a17.f444849i, str3, a17.f444842b, a17.f444845e, a17.f444850j, "");
        }
    }

    @Override // qh.v, rh.r3
    public void b(final rh.w3 w3Var, final long j17) {
        java.lang.String str = w3Var.f477073b;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.String str2 = w3Var.f477074c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.listener", "#onBgWakeLockTimeout tag=%s packageName=%s millis=%s", str, str2, valueOf);
        jx3.f.INSTANCE.mo68477x336bdfd8(1540L, 50L, 1L, false);
        if (!android.text.TextUtils.isEmpty(w3Var.f477075d)) {
            final long a17 = w3Var.a();
            this.f444922e.x(rh.w.class, new wh.t0() { // from class: ri.k$$a
                @Override // wh.t0
                /* renamed from: accept */
                public final void mo40853xab27b508(java.lang.Object obj) {
                    final long j18 = a17;
                    final long j19 = j17;
                    final rh.w3 w3Var2 = w3Var;
                    rh.w wVar = (rh.w) obj;
                    ri.k kVar = ri.k.this;
                    kVar.getClass();
                    rh.v k17 = wVar.k(j18);
                    if (k17.f476898c) {
                        final long longValue = ((java.lang.Long) k17.f477053f.f477085a).longValue();
                        wh.h2 b17 = wVar.l(j18).b();
                        if (b17 != null) {
                            final java.lang.String str3 = b17.f527329a;
                            final long j27 = b17.f527330b;
                            kVar.f444922e.x(rh.d2.class, new wh.t0() { // from class: ri.k$$d
                                @Override // wh.t0
                                /* renamed from: accept */
                                public final void mo40853xab27b508(java.lang.Object obj2) {
                                    long j28 = j19;
                                    long j29 = longValue;
                                    java.lang.String str4 = str3;
                                    long j37 = j27;
                                    rh.a2 m17 = ((rh.d2) obj2).m(j18);
                                    if (m17.f476898c) {
                                        long longValue2 = ((java.lang.Long) m17.f476833e.f477085a).longValue();
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.battery.listener", "#onBgWakeLockTimeout report as exception!");
                                        java.util.List list = ri.p.f477492a;
                                        java.lang.String f17 = ri.i.f();
                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                        rh.w3 w3Var3 = w3Var2;
                                        sb6.append(w3Var3.f477074c);
                                        sb6.append("-");
                                        sb6.append(w3Var3.f477073b);
                                        java.lang.String sb7 = sb6.toString();
                                        int d17 = ri.i.d();
                                        int e17 = ri.i.e();
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.BatteryReporter", "#reportWakeLocksOvertimeBg, mills = " + j28);
                                        android.util.SparseArray sparseArray = ri.s.f477541a;
                                        ri.s.b(1, 5, f17, sb7, d17, e17, "wakeBgException", j28, "lockMils", w3Var3.a(), "flag", (long) w3Var3.f477072a, str4, w3Var3.f477075d, j29, longValue2, j37, "");
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }
        if (w3Var.a() > 3600000 || !mm.o.c()) {
            return;
        }
        java.lang.String f17 = ri.i.f();
        java.lang.String str3 = str2 + "-" + w3Var.f477073b;
        int d17 = ri.i.d();
        int e17 = ri.i.e();
        java.lang.String a18 = ri.t.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.BatteryReporter", "#statBgWakeLocks, millis = " + j17);
        android.util.SparseArray sparseArray = ri.s.f477541a;
        ri.s.b(0, 5, f17, str3, d17, e17, "wakeBgWarning", j17, "lockMils", w3Var.a(), "flag", (long) w3Var.f477072a, a18, w3Var.f477075d, 0L, 0L, 0L, "");
    }

    @Override // qh.v, qh.e0
    public void c(boolean z17) {
        rh.e3 w17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.listener", "#onTraceEnd, fg = " + z17);
        if ((z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) && (w17 = this.f444922e.w(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k.class)) != null) {
            ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k) w17).k("Canary End: count = " + this.f477426g + ", fg = " + z17, 0, java.util.Collections.emptyMap());
        }
        super.c(z17);
    }

    @Override // qh.v, qh.e0
    public void d() {
        rh.e3 w17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.listener", "#onTraceBegin");
        if (this.f444922e.E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.battery.listener", "monitors is still running, cancel it before a re-start");
            this.f444922e.a();
            this.f444922e.b();
        }
        if ((z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) && (w17 = this.f444922e.w(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k.class)) != null) {
            ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k) w17).k("Canary Begin: count = " + this.f477426g, 0, java.util.Collections.emptyMap());
        }
        super.d();
    }

    @Override // qh.v, rh.t
    public void e(boolean z17, int i17, int i18, android.content.ComponentName componentName, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.listener", "statForegroundServiceLeak");
        if ((z17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) && mm.o.c() && componentName != null) {
            java.lang.String f17 = ri.i.f();
            java.lang.String className = componentName.getClassName();
            int d17 = ri.i.d();
            int e17 = ri.i.e();
            java.lang.String a17 = ri.t.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.BatteryReporter", "#statForegroundServiceLeak, isMyself = " + z17);
            android.util.SparseArray sparseArray = ri.s.f477541a;
            ri.s.b(0, 5, f17, className, d17, e17, z17 ? "statMyImportance" : "statOtherImportance", i17, "gblIpt", i18, "duringMin", j17, a17, "", 0L, 0L, 0L, "");
        }
    }

    @Override // qh.v, rh.f2
    public void f(rh.o2 o2Var) {
        gi.w0 w0Var = new gi.w0(this.f444921d, "internal");
        w0Var.f476863l = qh.b.b(o2Var.f477020d);
        ((java.util.HashMap) w0Var.f476854c).put(rh.g2.class, o2Var);
        new ri.n("internal").a(w0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d8 A[LOOP:7: B:86:0x02d6->B:87:0x02d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x030a A[LOOP:8: B:90:0x0308->B:91:0x030a, LOOP_END] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.lang.CharSequence, java.lang.String] */
    @Override // qh.v, com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.InterfaceC4634x2b4532bc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(rh.y2 r45) {
        /*
            Method dump skipped, instructions count: 991
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.k.g(rh.y2):void");
    }

    @Override // qh.v, rh.r3
    public void h(final int i17, final rh.w3 w3Var) {
        java.lang.String str = w3Var.f477073b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String str2 = w3Var.f477074c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.listener", "#onWakeLockTimeout tag=%s packageName=%s warningCount=%s", str, str2, valueOf);
        if (i17 <= 1) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1013L, 201L, 1L, false);
        }
        long j17 = i17;
        if (j17 == java.lang.Math.max(gi.d.f353533h, 2L) && !android.text.TextUtils.isEmpty(w3Var.f477075d)) {
            final long a17 = w3Var.a();
            this.f444922e.x(rh.w.class, new wh.t0() { // from class: ri.k$$b
                @Override // wh.t0
                /* renamed from: accept */
                public final void mo40853xab27b508(java.lang.Object obj) {
                    final long j18 = a17;
                    final int i18 = i17;
                    final rh.w3 w3Var2 = w3Var;
                    rh.w wVar = (rh.w) obj;
                    ri.k kVar = ri.k.this;
                    kVar.getClass();
                    rh.v k17 = wVar.k(j18);
                    if (k17.f476898c) {
                        final long longValue = ((java.lang.Long) k17.f477053f.f477085a).longValue();
                        wh.h2 b17 = wVar.l(j18).b();
                        if (b17 != null) {
                            final java.lang.String str3 = b17.f527329a;
                            final long j19 = b17.f527330b;
                            kVar.f444922e.x(rh.d2.class, new wh.t0() { // from class: ri.k$$e
                                @Override // wh.t0
                                /* renamed from: accept */
                                public final void mo40853xab27b508(java.lang.Object obj2) {
                                    long j27 = longValue;
                                    java.lang.String str4 = str3;
                                    long j28 = j19;
                                    rh.a2 m17 = ((rh.d2) obj2).m(j18);
                                    if (m17.f476898c) {
                                        long longValue2 = ((java.lang.Long) m17.f476833e.f477085a).longValue();
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.battery.listener", "#onWakeLockTimeout report as exception!");
                                        java.util.List list = ri.p.f477492a;
                                        java.lang.String f17 = ri.i.f();
                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                        rh.w3 w3Var3 = w3Var2;
                                        sb6.append(w3Var3.f477074c);
                                        sb6.append("-");
                                        sb6.append(w3Var3.f477073b);
                                        java.lang.String sb7 = sb6.toString();
                                        int d17 = ri.i.d();
                                        int e17 = ri.i.e();
                                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("#reportWakeLocksOvertime, count = ");
                                        int i19 = i18;
                                        sb8.append(i19);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.BatteryReporter", sb8.toString());
                                        android.util.SparseArray sparseArray = ri.s.f477541a;
                                        ri.s.b(1, 5, f17, sb7, d17, e17, "wakeWarningException", i19, "lockMils", w3Var3.a(), "flag", w3Var3.f477072a, str4, w3Var3.f477075d, j27, longValue2, j28, "");
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }
        if (i17 > 100 || w3Var.a() > 3600000 || !mm.o.c()) {
            return;
        }
        java.lang.String f17 = ri.i.f();
        java.lang.String str3 = str2 + "-" + w3Var.f477073b;
        int d17 = ri.i.d();
        int e17 = ri.i.e();
        java.lang.String a18 = ri.t.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.BatteryReporter", "#statWakeLocks, count = " + i17);
        android.util.SparseArray sparseArray = ri.s.f477541a;
        ri.s.b(0, 5, f17, str3, d17, e17, "wakeWarning", j17, "lockMils", w3Var.a(), "flag", (long) w3Var.f477072a, a18, w3Var.f477075d, 0L, 0L, 0L, "");
    }

    @Override // qh.v
    public qh.v i(qh.f0 f0Var) {
        this.f444921d = f0Var;
        this.f444922e = new ri.l(this, f0Var, "canary").f353554a;
        return this;
    }

    @Override // qh.v
    public void j(final rh.c1 c1Var) {
        final qh.b bVar;
        super.j(c1Var);
        if (!gi.d.g(c1Var.f476870s, c1Var) || (bVar = c1Var.f476863l) == null) {
            return;
        }
        c1Var.u(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class, new wh.t0() { // from class: ri.k$$f
            @Override // wh.t0
            /* renamed from: accept */
            public final void mo40853xab27b508(java.lang.Object obj) {
                final rh.o2 o2Var = (rh.o2) obj;
                if (!o2Var.b() || ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477019c).f134095h.f477093a.isEmpty()) {
                    return;
                }
                final qh.b bVar2 = bVar;
                rh.c1.this.x(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c.class, new wh.t0() { // from class: ri.k$$g
                    @Override // wh.t0
                    /* renamed from: accept */
                    public final void mo40853xab27b508(java.lang.Object obj2) {
                        ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c) obj2).m(qh.b.this.h(), android.os.Process.myPid(), ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot) ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477019c).f134095h.f477093a.get(0)).f134098b);
                    }
                });
            }
        });
    }

    @Override // qh.v
    public qh.t k() {
        return new ri.m();
    }

    @Override // qh.v
    public void l(rh.c1 c1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.listener", "onCanaryDump monitors");
        c1Var.q(new wh.t0() { // from class: ri.k$$c
            @Override // wh.t0
            /* renamed from: accept */
            public final void mo40853xab27b508(java.lang.Object obj) {
                ri.k kVar = ri.k.this;
                kVar.getClass();
                long j17 = ((qh.b) obj).f444854n;
                if (j17 < gi.d.c()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.battery.BatteryReporter", "#batteryDumpError, minWindowMillis = " + gi.d.c() + ", actual = " + j17);
                    if (j17 <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Matrix.battery.BatteryReporter", "#batteryDumpError fatal, windowMillis = " + j17);
                        jx3.f.INSTANCE.mo68477x336bdfd8(1540L, 9L, 1L, false);
                    } else {
                        jx3.f.INSTANCE.mo68477x336bdfd8(1540L, 10L, 1L, false);
                    }
                } else if (j17 <= 600000) {
                    jx3.f.INSTANCE.mo68477x336bdfd8(1540L, 11L, 1L, false);
                } else if (j17 <= 1200000) {
                    jx3.f.INSTANCE.mo68477x336bdfd8(1540L, 12L, 1L, false);
                } else if (j17 <= 1800000) {
                    jx3.f.INSTANCE.mo68477x336bdfd8(1540L, 13L, 1L, false);
                } else {
                    jx3.f.INSTANCE.mo68477x336bdfd8(1540L, 14L, 1L, false);
                }
                java.lang.String valueOf = java.lang.String.valueOf(android.text.format.DateFormat.format("yyyyMMdd", java.lang.System.currentTimeMillis()));
                if (!android.text.TextUtils.isEmpty(kVar.f477427h) && !kVar.f477427h.equalsIgnoreCase(valueOf)) {
                    kVar.f477426g = 0;
                }
                kVar.f477427h = valueOf;
                int i17 = kVar.f477426g + 1;
                kVar.f477426g = i17;
                int i18 = i17 + 200;
                if (i18 <= 256) {
                    jx3.f.INSTANCE.mo68477x336bdfd8(1540L, i18, 1L, false);
                }
            }
        });
        super.l(c1Var);
    }

    @Override // qh.v
    public void m(rh.c1 c1Var) {
        new ri.n("canary").a(c1Var);
        super.m(c1Var);
    }
}
