package gi;

/* loaded from: classes12.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final rh.c1 f353554a;

    public d1(qh.f0 f0Var, java.lang.String str) {
        this.f353554a = new gi.w0(f0Var, str);
        a();
    }

    public abstract void a();

    public gi.d1 b(boolean z17, boolean z18) {
        rh.c1 c1Var = this.f353554a;
        c1Var.F(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class);
        if (z17) {
            c1Var.F(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc.class);
        }
        if (z18) {
            c1Var.F(rh.n1.class);
        }
        return this;
    }

    public gi.d1 c() {
        this.f353554a.F(rh.f1.class);
        return this;
    }

    public gi.d1 d() {
        rh.c1 c1Var = this.f353554a;
        if (c1Var instanceof gi.w0) {
            gi.w0 monitors = (gi.w0) c1Var;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.t2) i95.n0.c(ob0.t2.class))).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(monitors, "monitors");
            java.lang.String str = monitors.f476870s;
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "canary");
            qh.f0 f0Var = monitors.f476862k;
            if (b17) {
                cr0.u1 u1Var = cr0.u1.f303293a;
                if (!u1Var.e() ? false : u1Var.g().f303290a) {
                    monitors.F(cr0.k0.class);
                }
                if (cr0.w3.f303333a.b()) {
                    monitors.F(cr0.n3.class);
                }
                if (cr0.k3.f303199a.a()) {
                    monitors.F(cr0.d3.class);
                }
                if ((f0Var != null ? (gi.y1) f0Var.i(gi.y1.class) : null) != null) {
                    monitors.F(gi.x1.class);
                }
                if ((f0Var != null ? (kh.k1) f0Var.i(kh.k1.class) : null) != null) {
                    monitors.F(kh.w0.class);
                    if (kh.b0.f389289f.c()) {
                        monitors.F(kh.a0.class);
                    }
                    if (kh.g.f389335f.c()) {
                        monitors.F(kh.f.class);
                    }
                    if (kh.t3.f389455f.c()) {
                        monitors.F(kh.s3.class);
                    }
                }
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "module") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(monitors.z(), "Finder")) {
                cr0.u1 u1Var2 = cr0.u1.f303293a;
                if (!u1Var2.e() ? false : u1Var2.g().f303290a) {
                    monitors.F(cr0.k0.class);
                    monitors.F(cr0.j.class);
                }
                if (cr0.w3.f303333a.b()) {
                    monitors.F(cr0.n3.class);
                    monitors.F(cr0.p.class);
                }
                if (cr0.k3.f303199a.a()) {
                    monitors.F(cr0.d3.class);
                }
                if ((f0Var != null ? (gi.y1) f0Var.i(gi.y1.class) : null) != null) {
                    monitors.F(gi.x1.class);
                }
                if ((f0Var != null ? (kh.k1) f0Var.i(kh.k1.class) : null) != null) {
                    monitors.F(kh.w0.class);
                    if (kh.b0.f389289f.c()) {
                        monitors.F(kh.a0.class);
                    }
                    if (kh.g.f389335f.c()) {
                        monitors.F(kh.f.class);
                    }
                    if (kh.t3.f389455f.c()) {
                        monitors.F(kh.s3.class);
                    }
                }
                monitors.H(oh.f.class, 5000L);
            }
        }
        return this;
    }

    public gi.d1 e() {
        if (j62.e.g().a("clicfg_battery_health_enable", "1", false, true).equals("1")) {
            rh.c1 c1Var = this.f353554a;
            c1Var.F(uh.g.class);
            c1Var.F(rh.j1.class);
            c1Var.F(rh.n3.class);
            if ((c1Var instanceof gi.w0) && "biz".equals(c1Var.f476870s)) {
                java.lang.String z17 = ((gi.w0) c1Var).z();
                if ("ExplicitBg".equals(z17) || "ExplicitFg".equals(z17)) {
                    long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(j62.e.g().a("clicfg_battery_health_acc_ms", "1", false, true));
                    if (E1 >= 1) {
                        if (E1 == 1) {
                            E1 = "ExplicitBg".equals(z17) ? lh.l0.f400145i : lh.l0.f400144h;
                        }
                        c1Var.H(uh.g.class, E1);
                    }
                }
            }
        }
        return this;
    }

    public gi.d1 f(java.lang.String str) {
        rh.c1 c1Var = this.f353554a;
        if (c1Var instanceof gi.w0) {
            ((gi.w0) c1Var).f476860i.putString("extra_module_name", str);
        }
        return this;
    }

    public gi.d1 g(long j17) {
        boolean equals = j62.e.g().a("clicfg_battery_allpid_enable", "1", false, true).equals("1");
        boolean equals2 = j62.e.g().a("clicfg_battery_thermal_sample_2", "1", false, true).equals("1");
        boolean equals3 = j62.e.g().a("clicfg_battery_cpu_sample", "1", false, true).equals("1");
        rh.c1 c1Var = this.f353554a;
        c1Var.H(rh.t1.class, j17);
        c1Var.H(rh.w1.class, j17);
        c1Var.H(rh.n3.class, j17);
        if (equals2) {
            c1Var.H(rh.c2.class, j17);
            c1Var.H(rh.u1.class, j17);
            c1Var.H(gi.k.class, j17);
            c1Var.H(gi.n.class, j17);
            c1Var.H(gi.o.class, j17);
            if (pj.h.f436442a) {
                c1Var.H(gi.l.class, j17);
                c1Var.H(gi.m.class, j17);
            }
        }
        if (equals3) {
            c1Var.H(rh.f1.class, j17);
            c1Var.H(rh.r1.class, j17);
        }
        if (equals) {
            c1Var.H(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc.class, j17);
        }
        return this;
    }

    public gi.d1 h(long j17) {
        rh.c1 c1Var = this.f353554a;
        if (c1Var instanceof gi.w0) {
            ((gi.w0) c1Var).f476860i.putLong("extra_report_during", j17);
        }
        return this;
    }
}
