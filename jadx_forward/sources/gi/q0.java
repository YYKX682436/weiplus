package gi;

/* loaded from: classes12.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f353618a;

    /* renamed from: b, reason: collision with root package name */
    public rh.c1 f353619b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f353620c = false;

    public q0(java.lang.String str) {
        this.f353618a = str;
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusinessJiffiesMonitor", "finish: " + this.f353618a);
        synchronized (this) {
            this.f353620c = true;
        }
        ph.u e17 = gi.d.e();
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusinessJiffiesMonitor", "finish, plugin is nul");
            return;
        }
        rh.c1 c1Var = this.f353619b;
        if (c1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusinessJiffiesMonitor", "finish, monitor is nul");
            return;
        }
        if (c1Var instanceof gi.w0) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            rh.c1 c1Var2 = this.f353619b;
            long j17 = uptimeMillis - c1Var2.f476869r;
            if (j17 <= ((gi.w0) c1Var2).f476860i.getLong("extra_report_during", java.lang.Math.max(gi.d.f353538m, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusinessJiffiesMonitor", "skip finish, duringMs = " + j17);
                this.f353619b.a();
                return;
            }
        }
        e17.f435829h.f444870f.post(new java.lang.Runnable() { // from class: gi.q0$$a
            /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r9 = this;
                    gi.q0 r0 = gi.q0.this
                    rh.c1 r1 = r0.f353619b
                    if (r1 == 0) goto L91
                    r1.l()
                    lh.l0 r1 = lh.l0.f400143g
                    rh.c1 r2 = r0.f353619b
                    gi.w0 r2 = (gi.w0) r2
                    r1.getClass()
                    java.lang.String r3 = "monitors"
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r3)
                    boolean r3 = r1.f400148b
                    r4 = 0
                    if (r3 != 0) goto L1d
                    goto L36
                L1d:
                    java.lang.String r3 = r2.z()
                    java.lang.String r5 = r1.i()
                    boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5, r3)
                    if (r5 != 0) goto L38
                    java.lang.String r5 = r1.j()
                    boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5, r3)
                    if (r3 == 0) goto L36
                    goto L38
                L36:
                    r3 = r4
                    goto L39
                L38:
                    r3 = 1
                L39:
                    if (r3 == 0) goto L7f
                    java.util.Map r3 = r1.f400147a
                    monitor-enter(r3)
                    java.lang.String r5 = r2.z()     // Catch: java.lang.Throwable -> L7c
                    java.lang.String r6 = r1.i()     // Catch: java.lang.Throwable -> L7c
                    boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6, r5)     // Catch: java.lang.Throwable -> L7c
                    if (r6 != 0) goto L56
                    java.lang.String r6 = r1.j()     // Catch: java.lang.Throwable -> L7c
                    boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6, r5)     // Catch: java.lang.Throwable -> L7c
                    if (r5 == 0) goto L6b
                L56:
                    java.lang.String r5 = "Overall"
                    r1.g(r5, r2)     // Catch: java.lang.Throwable -> L7c
                    qh.b r5 = r2.f476863l     // Catch: java.lang.Throwable -> L7c
                    if (r5 == 0) goto L6b
                    long r5 = r5.f444854n     // Catch: java.lang.Throwable -> L7c
                    r7 = 600000(0x927c0, double:2.964394E-318)
                    int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                    if (r5 < 0) goto L6b
                    r1.h()     // Catch: java.lang.Throwable -> L7c
                L6b:
                    java.lang.String r5 = ri.i.c(r2)     // Catch: java.lang.Throwable -> L7c
                    java.lang.String r6 = "configureReportName(...)"
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r6)     // Catch: java.lang.Throwable -> L7c
                    r1.g(r5, r2)     // Catch: java.lang.Throwable -> L7c
                    monitor-exit(r3)
                    r1.b(r4)
                    goto L7f
                L7c:
                    r0 = move-exception
                    monitor-exit(r3)
                    throw r0
                L7f:
                    rh.c1 r1 = r0.f353619b
                    gi.q0$$c r2 = new gi.q0$$c
                    r2.<init>()
                    r1.q(r2)
                    rh.c1 r1 = r0.f353619b
                    r1.b()
                    r1 = 0
                    r0.f353619b = r1
                L91:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: gi.RunnableC28362x64ebda2.run():void");
            }
        });
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusinessJiffiesMonitor", "start: " + this.f353618a);
        ph.u e17 = gi.d.e();
        if (e17 != null) {
            e17.f435829h.f444870f.post(new java.lang.Runnable() { // from class: gi.q0$$b
                @Override // java.lang.Runnable
                public final void run() {
                    gi.q0 q0Var = gi.q0.this;
                    synchronized (q0Var) {
                        if (q0Var.f353620c) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusinessJiffiesMonitor", "start skip, name = " + q0Var.f353618a);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusinessJiffiesMonitor", "start, name = " + q0Var.f353618a);
                            java.lang.String str = q0Var.f353618a;
                            ph.u e18 = gi.d.e();
                            rh.c1 c1Var = e18 == null ? null : new gi.r0(e18.f435829h, "biz", str).f353554a;
                            q0Var.f353619b = c1Var;
                            if (c1Var != null) {
                                c1Var.I();
                            }
                        }
                    }
                }
            });
        }
    }
}
