package kr3;

/* loaded from: classes11.dex */
public class q0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    public static final java.util.List A = kz5.c0.i(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.k1.class, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.x0.class, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.o0.class, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.h.class, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.j0.class);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f392963d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f392964e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f392965f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f392966g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f392967h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f392968i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f392969m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f392970n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f392971o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f392972p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f392973q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f392974r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f392975s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f392976t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f392977u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f392978v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f392979w;

    /* renamed from: x, reason: collision with root package name */
    public int f392980x;

    /* renamed from: y, reason: collision with root package name */
    public long f392981y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f392982z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f392963d = jz5.h.b(new kr3.a0(activity));
        this.f392964e = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MicroMsg.ModProfile.ContactAssembleManagerUIC");
        this.f392965f = jz5.h.b(new kr3.o0(this));
        this.f392970n = jz5.h.b(new kr3.p0(this));
        this.f392972p = jz5.h.b(new kr3.v(this, activity));
        this.f392973q = jz5.h.b(new kr3.z(this));
        this.f392974r = jz5.h.b(new kr3.y(this));
        this.f392975s = jz5.h.b(new kr3.w(this));
        this.f392976t = jz5.h.b(new kr3.x(this));
        this.f392977u = jz5.h.b(new kr3.u(this));
        this.f392978v = new java.util.concurrent.atomic.AtomicInteger(1);
        this.f392981y = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.b().h());
        sb6.append('_');
        sb6.append(c01.id.c());
        this.f392982z = sb6.toString();
    }

    public static final void O6(kr3.q0 q0Var) {
        if (!q0Var.S6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "onSaveWrapper(): not change, exit");
            q0Var.W6(null);
            q0Var.m158354x19263085().finish();
        } else {
            if (q0Var.U6()) {
                q0Var.f392969m = true;
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(q0Var.m158354x19263085(), q0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), q0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.p6s), true, true, new kr3.g0(h0Var));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "modProfileSync");
                h0Var.f391656d = p3325xe03a0797.p3326xc267989b.l.d(q0Var.mo144225x95f74600(), null, null, new kr3.f0(q0Var, Q, null), 3, null);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "onSaveWrapper(): not valid");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(q0Var.m158354x19263085());
            u1Var.g(q0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.nbj));
            u1Var.a(true);
            u1Var.n(q0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571241h));
            u1Var.q(false);
        }
    }

    public static final void P6(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        lk5.s.e(intent, true);
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20629x68ff2372()) == 1) {
            java.util.Iterator it = kr3.q1.A.iterator();
            while (it.hasNext()) {
                pf5.j0.a(intent, (java.lang.Class) it.next());
            }
        } else {
            java.util.Iterator it6 = A.iterator();
            while (it6.hasNext()) {
                pf5.j0.a(intent, (java.lang.Class) it6.next());
            }
        }
        intent.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39705x8cb7317, 1);
    }

    public final void Q6(int i17) {
        if (i17 > 0) {
            this.f392979w = true;
        } else if (i17 < 0) {
            this.f392980x = java.lang.Math.min(this.f392980x, i17);
        }
        if (this.f392978v.decrementAndGet() <= 0) {
            int i18 = this.f392980x;
            if (i18 == -1) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
                int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x19263085);
                e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.f574343oe5);
                e4Var.f293312f = false;
                e4Var.c();
                return;
            }
            if (i18 != 0) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
                int i27 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x192630852);
                e4Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.ocw);
                e4Var2.f293312f = false;
                e4Var2.c();
                return;
            }
            if (this.f392979w) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
                int i28 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x192630853);
                e4Var3.d(com.p314xaae8f345.mm.R.C30867xcad56011.f574301od2);
                e4Var3.f293312f = false;
                e4Var3.c();
            }
        }
    }

    public final java.util.List R6() {
        return (java.util.List) ((jz5.n) this.f392972p).mo141623x754a37bb();
    }

    public final boolean S6() {
        boolean z17 = true;
        if (this.f392968i) {
            return true;
        }
        java.util.List<java.lang.Class> R6 = R6();
        if (!(R6 instanceof java.util.Collection) || !R6.isEmpty()) {
            for (java.lang.Class cls : R6) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                if (((kr3.j) pf5.z.f435481a.a(activity).a(cls)).a7()) {
                    break;
                }
            }
        }
        z17 = false;
        this.f392968i = z17;
        return z17;
    }

    public final boolean T6() {
        return ((java.lang.Boolean) ((jz5.n) this.f392974r).mo141623x754a37bb()).booleanValue();
    }

    public final boolean U6() {
        java.util.List<java.lang.Class> R6 = R6();
        if ((R6 instanceof java.util.Collection) && R6.isEmpty()) {
            return true;
        }
        for (java.lang.Class cls : R6) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            if (!((kr3.j) pf5.z.f435481a.a(activity).a(cls)).b7()) {
                return false;
            }
        }
        return true;
    }

    public final boolean V6() {
        if (!S6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "onCancelClick(): not change, exit");
            W6(null);
            return true;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(m158354x19263085());
        u1Var.g(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.bgj));
        u1Var.a(true);
        u1Var.n(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.bgl));
        u1Var.j(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.bgk));
        u1Var.b(new kr3.i0(this));
        u1Var.q(false);
        return false;
    }

    public final void W6(java.lang.Boolean bool) {
        ((ku5.t0) ku5.t0.f394148d).a(new kr3.m0(this, bool));
        for (java.lang.Class cls : R6()) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((kr3.j) pf5.z.f435481a.a(activity).a(cls)).f7();
        }
    }

    public final void X6() {
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89;
        jz5.f0 f0Var;
        if (T6() || (c1095x65355f89 = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.mcq)) == null) {
            return;
        }
        android.view.View view = this.f392971o;
        if (view != null) {
            int[] iArr = new int[2];
            c1095x65355f89.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            int height = iArr2[1] + view.getHeight() + i65.a.h(m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo);
            int height2 = iArr[1] + c1095x65355f89.getHeight();
            if (height >= height2) {
                c1095x65355f89.s(0 - c1095x65355f89.getScrollX(), (height - height2) - c1095x65355f89.getScrollY(), 250, false);
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((vf5.j) pf5.z.f435481a.a(activity).a(vf5.j.class)).P6(c1095x65355f89);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ((vf5.j) pf5.z.f435481a.a(activity2).a(vf5.j.class)).P6(c1095x65355f89);
        }
    }

    @Override // pf5.e
    /* renamed from: getLifecycleScope */
    public p3325xe03a0797.p3326xc267989b.y0 mo144225x95f74600() {
        return (p3325xe03a0797.p3326xc267989b.y0) this.f392963d.mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        return !V6();
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0369, code lost:
    
        if ((r5 == null || r26.n0.N(r5)) != false) goto L90;
     */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 1357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kr3.q0.mo450x3e5a77bb(android.os.Bundle):void");
    }
}
