package d55;

/* loaded from: classes12.dex */
public class j0 extends d55.b0 {

    /* renamed from: r, reason: collision with root package name */
    public int f308125r;

    /* renamed from: s, reason: collision with root package name */
    public d55.h0 f308126s;

    /* renamed from: t, reason: collision with root package name */
    public long f308127t;

    /* renamed from: u, reason: collision with root package name */
    public long f308128u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f308129v;

    public j0(android.content.Context context) {
        super(context);
        this.f308125r = 2;
        this.f308127t = 0L;
        this.f308128u = 0L;
        this.f308129v = true;
    }

    @Override // d55.b0
    public boolean f() {
        boolean f17 = super.f();
        if (!f17) {
            return f17;
        }
        d55.w wVar = new d55.w(this.f308097d, "recovery_statistic");
        wVar.e();
        wVar.mo123525xb58848b9("crash_count", 0);
        wVar.mo123524x41a8a7f2("launch_recovery", false);
        boolean mo123524x41a8a7f2 = wVar.mo123524x41a8a7f2("launch_recovery_real", false);
        boolean mo123524x41a8a7f22 = wVar.mo123524x41a8a7f2("recover_from_crash", false);
        int mo123525xb58848b9 = wVar.mo123525xb58848b9("recovery_status", -1);
        wVar.mo123525xb58848b9("recovery_from", 0);
        int mo123525xb58848b92 = wVar.mo123525xb58848b9("recover_internal_status", 0);
        int mo123525xb58848b93 = wVar.mo123525xb58848b9("recover_launch_mode", 0);
        wVar.mo123526xfb822ef2("recover_running_time", 0L);
        wVar.mo123524x41a8a7f2("recover_is_discard", false);
        java.lang.String mo123527x2fec8307 = wVar.mo123527x2fec8307("recover_app_ver", "");
        int i17 = this.f308105o.f308124d.f308130a;
        int i18 = this.f308125r;
        long max = java.lang.Math.max(this.f308128u, 0L);
        wVar.g("crash_count", i17);
        wVar.mo123528x1c849219("launch_recovery", true);
        wVar.mo123528x1c849219("launch_recovery_real", mo123524x41a8a7f2);
        wVar.mo123528x1c849219("recover_from_crash", mo123524x41a8a7f22);
        wVar.mo123529xc5c55e60("recovery_status", mo123525xb58848b9);
        wVar.mo123529xc5c55e60("recovery_from", i18);
        wVar.mo123529xc5c55e60("recover_internal_status", mo123525xb58848b92);
        wVar.mo123529xc5c55e60("recover_launch_mode", mo123525xb58848b93);
        wVar.mo123530xf2e7ce2b("recover_running_time", max);
        wVar.mo123528x1c849219("recover_is_discard", false);
        wVar.mo123531xe4673800("recover_app_ver", mo123527x2fec8307);
        wVar.c();
        return f17;
    }

    public void j(int i17) {
        int i18;
        boolean z17;
        this.f308103m = java.lang.System.currentTimeMillis();
        c();
        d55.o0.a(4, "MicroMsg.recovery.signalHandler", "#begin");
        this.f308125r = i17;
        long j17 = this.f308127t;
        if (j17 > 0) {
            this.f308128u = this.f308103m - j17;
        }
        long j18 = this.f308128u;
        if (j18 <= 0) {
            j18 = this.f308103m - this.f308106p.f308121a;
        }
        d55.o0.a(4, "MicroMsg.recovery.signalHandler", "recovery interval = " + j18);
        long j19 = this.f308107q.f308092e;
        boolean z18 = this.f308129v;
        if (j19 > 0 && j18 < j19) {
            d55.o0.a(4, "MicroMsg.recovery.signalHandler", "too fast, skip and do nothing, min = " + j19);
            if (z18) {
                d55.o0.a(4, "MicroMsg.recovery.signalHandler", "try fallback trigger");
                d55.i0 i0Var = new d55.i0(this);
                i0Var.f308127t = this.f308127t;
                i0Var.j(this.f308125r);
                return;
            }
            return;
        }
        d55.b0 b0Var = this.f308101h;
        if (b0Var instanceof d55.g0) {
            ((d55.g0) b0Var).f308117s.set(true);
        }
        if (!android.text.TextUtils.isEmpty(this.f308106p.f308122b) && !this.f308106p.f308122b.equals(this.f308104n)) {
            d55.o0.a(4, "MicroMsg.recovery.signalHandler", "version code mismatch, skip");
            b();
        }
        d55.a0 a0Var = this.f308107q;
        if (j18 < a0Var.f308090c) {
            d55.o0.a(4, "MicroMsg.recovery.signalHandler", "within interval, inc");
            e();
        } else {
            long j27 = a0Var.f308091d;
            if (j18 >= j27 || this.f308126s == null) {
                d55.o0.a(4, "MicroMsg.recovery.signalHandler", "over signal interval, clear point");
                b();
                e();
            } else {
                d55.o0.a(4, "MicroMsg.recovery.signalHandler", "within signal interval");
                if (j18 >= j27) {
                    i18 = 0;
                } else {
                    float f17 = (float) j18;
                    float f18 = (float) j27;
                    i18 = f17 >= 0.75f * f18 ? 25 : f17 >= 0.5f * f18 ? 50 : f17 >= f18 * 0.25f ? 75 : 100;
                }
                d55.h0 h0Var = this.f308126s;
                int i19 = h0Var.f308119a + i18;
                h0Var.f308119a = i19;
                if (i19 >= 100) {
                    h0Var.f308119a = 0;
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    d55.o0.a(4, "MicroMsg.recovery.signalHandler", "acc meet, inc");
                    e();
                }
                d55.w wVar = (d55.w) this.f308126s.f308120b;
                wVar.g("acc_total", r1.f308119a);
                wVar.h();
            }
        }
        int i27 = this.f308105o.f308124d.f308130a;
        d55.o0.a(4, "MicroMsg.recovery.signalHandler", "recovery crashCount = " + i27);
        if (i27 >= this.f308107q.f308088a) {
            if (!f()) {
                d55.o0.a(5, "MicroMsg.recovery.signalHandler", "launch recovery fail");
                i(true);
                return;
            }
            if (i27 < this.f308107q.f308089b) {
                g(1);
            } else {
                g(2);
                a();
            }
            i(true);
            h();
            return;
        }
        i(true);
        if (z18) {
            d55.o0.a(4, "MicroMsg.recovery.signalHandler", "try fallback trigger");
            d55.i0 i0Var2 = new d55.i0(this);
            i0Var2.f308127t = this.f308127t;
            i0Var2.j(this.f308125r);
        }
        d55.o0.a(4, "MicroMsg.recovery.signalHandler", "onLaunchNormal");
        if (this.f308105o.f308124d.f308130a >= 1) {
            d55.w wVar2 = new d55.w(this.f308097d, "recovery_statistic");
            wVar2.e();
            wVar2.mo123525xb58848b9("crash_count", 0);
            wVar2.mo123524x41a8a7f2("launch_recovery", false);
            boolean mo123524x41a8a7f2 = wVar2.mo123524x41a8a7f2("launch_recovery_real", false);
            boolean mo123524x41a8a7f22 = wVar2.mo123524x41a8a7f2("recover_from_crash", false);
            int mo123525xb58848b9 = wVar2.mo123525xb58848b9("recovery_status", -1);
            wVar2.mo123525xb58848b9("recovery_from", 0);
            int mo123525xb58848b92 = wVar2.mo123525xb58848b9("recover_internal_status", 0);
            int mo123525xb58848b93 = wVar2.mo123525xb58848b9("recover_launch_mode", 0);
            wVar2.mo123526xfb822ef2("recover_running_time", 0L);
            wVar2.mo123524x41a8a7f2("recover_is_discard", false);
            java.lang.String mo123527x2fec8307 = wVar2.mo123527x2fec8307("recover_app_ver", "");
            int i28 = this.f308105o.f308124d.f308130a;
            int i29 = this.f308125r;
            long max = java.lang.Math.max(this.f308128u, 0L);
            wVar2.g("crash_count", i28);
            wVar2.mo123528x1c849219("launch_recovery", false);
            wVar2.mo123528x1c849219("launch_recovery_real", mo123524x41a8a7f2);
            wVar2.mo123528x1c849219("recover_from_crash", mo123524x41a8a7f22);
            wVar2.g("recovery_status", mo123525xb58848b9);
            wVar2.g("recovery_from", i29);
            wVar2.g("recover_internal_status", mo123525xb58848b92);
            wVar2.g("recover_launch_mode", mo123525xb58848b93);
            wVar2.g("recover_running_time", max);
            wVar2.mo123528x1c849219("recover_is_discard", false);
            wVar2.mo123531xe4673800("recover_app_ver", mo123527x2fec8307);
            wVar2.h();
        }
    }

    public j0(d55.b0 b0Var) {
        super(b0Var);
        this.f308125r = 2;
        this.f308127t = 0L;
        this.f308128u = 0L;
        this.f308129v = true;
    }
}
