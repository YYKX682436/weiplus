package kr3;

/* loaded from: classes11.dex */
public class q1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    public static final java.util.List A = kz5.c0.i(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.j1.class, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.w0.class, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.n0.class, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.g.class, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.i0.class);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f392983d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f392984e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f392985f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f392986g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f392987h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f392988i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f392989m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f392990n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f392991o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f392992p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f392993q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f392994r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f392995s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f392996t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f392997u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f392998v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f392999w;

    /* renamed from: x, reason: collision with root package name */
    public int f393000x;

    /* renamed from: y, reason: collision with root package name */
    public long f393001y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f393002z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f392983d = jz5.h.b(new kr3.z0(activity));
        this.f392984e = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MicroMsg.ModProfile.ContactAssembleManagerUIC");
        this.f392985f = jz5.h.b(new kr3.o1(this));
        this.f392986g = jz5.h.b(new kr3.t0(this));
        this.f392987h = jz5.h.b(new kr3.y0(this));
        this.f392990n = jz5.h.b(new kr3.p1(this));
        this.f392992p = jz5.h.b(new kr3.s0(this, activity));
        this.f392993q = jz5.h.b(new kr3.x0(this));
        this.f392994r = jz5.h.b(new kr3.w0(this));
        this.f392995s = jz5.h.b(new kr3.u0(this));
        this.f392996t = jz5.h.b(new kr3.v0(this));
        this.f392997u = jz5.h.b(new kr3.r0(this));
        this.f392998v = new java.util.concurrent.atomic.AtomicInteger(1);
        this.f393001y = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.b().h());
        sb6.append('_');
        sb6.append(c01.id.c());
        this.f393002z = sb6.toString();
    }

    public static final void O6(kr3.q1 q1Var) {
        if (!q1Var.S6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "onSaveWrapper(): not change, exit");
            q1Var.W6(null);
            q1Var.m158354x19263085().finish();
        } else {
            if (q1Var.U6()) {
                q1Var.f392989m = true;
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(q1Var.m158354x19263085(), q1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), q1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.p6s), true, true, new kr3.g1(h0Var));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "modProfileSync");
                h0Var.f391656d = p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(q1Var.m158354x19263085()), null, null, new kr3.f1(q1Var, Q, null), 3, null);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "onSaveWrapper(): not valid");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(q1Var.m158354x19263085());
            u1Var.g(q1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.nbj));
            u1Var.a(true);
            u1Var.n(q1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571241h));
            u1Var.q(false);
        }
    }

    public static java.lang.Object Y6(kr3.q1 q1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSaveFailDialog");
        }
        if ((i17 & 2) != 0) {
            str = q1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572443n92);
        }
        q1Var.getClass();
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new kr3.n1(u3Var, q1Var, str, null), interfaceC29045xdcb5ca57);
        return g17 == pz5.a.f440719d ? g17 : jz5.f0.f384359a;
    }

    public final void P6(int i17) {
        if (i17 > 0) {
            this.f392999w = true;
        } else if (i17 < 0) {
            this.f393000x = java.lang.Math.min(this.f393000x, i17);
        }
        if (this.f392998v.decrementAndGet() <= 0) {
            int i18 = this.f393000x;
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
            if (this.f392999w) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
                int i28 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x192630853);
                e4Var3.d(com.p314xaae8f345.mm.R.C30867xcad56011.f574301od2);
                e4Var3.f293312f = false;
                e4Var3.c();
            }
        }
    }

    public final java.util.List Q6() {
        return (java.util.List) ((jz5.n) this.f392992p).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p670x38b72420.o R6() {
        return (com.p314xaae8f345.mm.p670x38b72420.o) ((jz5.n) this.f392986g).mo141623x754a37bb();
    }

    public final boolean S6() {
        boolean z17 = true;
        if (this.f392988i) {
            return true;
        }
        java.util.List<java.lang.Class> Q6 = Q6();
        if (!(Q6 instanceof java.util.Collection) || !Q6.isEmpty()) {
            for (java.lang.Class cls : Q6) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                if (((kr3.t) pf5.z.f435481a.a(activity).a(cls)).Z6()) {
                    break;
                }
            }
        }
        z17 = false;
        this.f392988i = z17;
        return z17;
    }

    public final boolean T6() {
        return ((java.lang.Boolean) ((jz5.n) this.f392994r).mo141623x754a37bb()).booleanValue();
    }

    public final boolean U6() {
        java.util.List<java.lang.Class> Q6 = Q6();
        if ((Q6 instanceof java.util.Collection) && Q6.isEmpty()) {
            return true;
        }
        for (java.lang.Class cls : Q6) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            if (!((kr3.t) pf5.z.f435481a.a(activity).a(cls)).a7()) {
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
        u1Var.b(new kr3.i1(this));
        u1Var.q(false);
        return false;
    }

    public final void W6(java.lang.Boolean bool) {
        com.p314xaae8f345.mm.p670x38b72420.o R6;
        ((ku5.t0) ku5.t0.f394148d).a(new kr3.m1(this, bool));
        for (java.lang.Class cls : Q6()) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((kr3.t) pf5.z.f435481a.a(activity).a(cls)).e7();
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE) || (R6 = R6()) == null) {
            return;
        }
        ((yq3.v) R6).o();
    }

    public final void X6() {
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89;
        jz5.f0 f0Var;
        if (T6() || (c1095x65355f89 = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.mcq)) == null) {
            return;
        }
        android.view.View view = this.f392991o;
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
        return (p3325xe03a0797.p3326xc267989b.y0) this.f392983d.mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        return !V6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        jz5.g gVar;
        android.widget.LinearLayout linearLayout;
        this.f393001y = java.lang.System.currentTimeMillis();
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.rji);
        jz5.g gVar2 = this.f392993q;
        if (((java.lang.Boolean) ((jz5.n) gVar2).mo141623x754a37bb()).booleanValue()) {
            android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.obp);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "loadAssembleViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "loadAssembleViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f564981sl4);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(mo144222x4ff8c0f02, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "loadAssembleViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo144222x4ff8c0f02.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(mo144222x4ff8c0f02, "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "loadAssembleViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.Iterator it = Q6().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            gVar = this.f392990n;
            if (!hasNext) {
                break;
            }
            java.lang.Class cls = (java.lang.Class) it.next();
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e3w, (android.view.ViewGroup) linearLayout2, false);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            kr3.t tVar = (kr3.t) pf5.z.f435481a.a(activity).a(cls);
            if (((java.lang.Boolean) ((jz5.n) gVar2).mo141623x754a37bb()).booleanValue() && T6()) {
                android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.hjn);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "loadAssembleViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "loadAssembleViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
                if (abstractActivityC21394xb3d2c0cf != null) {
                    java.lang.String str = (java.lang.String) ((jz5.n) this.f392995s).mo141623x754a37bb();
                    if (str == null) {
                        str = m158362x2fec8307(tVar.k7());
                    }
                    abstractActivityC21394xb3d2c0cf.mo54450xbf7c1df6(str);
                }
            } else {
                android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.hjn);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "loadAssembleViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "loadAssembleViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            tVar.f393012g = inflate;
            if (tVar.m144228x6c03c64c() == null || tVar.U6() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.BaseRemarkUI", "username(" + tVar.m144228x6c03c64c() + ") or contact(" + tVar.U6() + ") is null");
            }
            java.lang.String m144228x6c03c64c = tVar.m144228x6c03c64c();
            com.p314xaae8f345.mm.p670x38b72420.o U6 = tVar.U6();
            if (m144228x6c03c64c != null && U6 != null) {
                tVar.f393009d = (android.widget.LinearLayout) tVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.uy8);
                tVar.f393010e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18) tVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.uy9);
                tVar.f393011f = (android.widget.TextView) tVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.uy_);
                if (!tVar.X6()) {
                    ((android.widget.TextView) tVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.hjn)).setText(tVar.k7());
                }
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = tVar.f393010e;
                if (c21475x81dbaa18 != null) {
                    c21475x81dbaa18.setVisibility(8);
                }
                android.widget.TextView textView = tVar.f393011f;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                android.view.View b76 = tVar.b7(m144228x6c03c64c, U6);
                tVar.f393013h = b76;
                if (b76 != null && (linearLayout = tVar.f393009d) != null) {
                    linearLayout.addView(b76, -1, -2);
                }
                tVar.c7();
            }
            jz5.g gVar3 = this.f392996t;
            if (((java.lang.Number) ((jz5.n) gVar3).mo141623x754a37bb()).intValue() == tVar.i7()) {
                this.f392991o = inflate;
                java.lang.String str2 = "highlight-" + ((java.lang.Number) ((jz5.n) gVar3).mo141623x754a37bb()).intValue();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f392984e;
                boolean i17 = o4Var.i(str2, false);
                if (!i17) {
                    o4Var.G(str2, true);
                }
                boolean z17 = !i17;
                lr3.a Y6 = tVar.Y6();
                if (Y6 != null) {
                    android.view.View view = tVar.f393013h;
                    if (view != null) {
                        view.post(new kr3.n(z17, Y6));
                    }
                    p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(tVar.m158354x19263085()), null, null, new kr3.p(Y6, null), 3, null);
                }
            }
            this.f392998v.incrementAndGet();
            if (!((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue()) {
                tVar.T6(new kr3.a1(this, tVar));
            }
            linearLayout2.addView(inflate);
        }
        P6(0);
        if (T6()) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = m158354x192630852 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852 : null;
            if (abstractActivityC21394xb3d2c0cf2 != null) {
                abstractActivityC21394xb3d2c0cf2.m78495xf385c157();
            }
        } else {
            ((p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.mcq)).post(new kr3.b1(this));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("contact: ");
        sb6.append(R6());
        sb6.append(", isStranger: ");
        sb6.append(((java.lang.Boolean) ((jz5.n) this.f392987h).mo141623x754a37bb()).booleanValue());
        sb6.append(", username: ");
        com.p314xaae8f345.mm.p670x38b72420.o R6 = R6();
        sb6.append(R6 != null ? ((yq3.v) R6).h() : null);
        sb6.append(", encryptUsername: ");
        com.p314xaae8f345.mm.p670x38b72420.o R62 = R6();
        sb6.append(R62 != null ? ((yq3.v) R62).e() : null);
        sb6.append(", viewOnly: ");
        sb6.append(((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue());
        sb6.append(", addContactScene: ");
        sb6.append(((java.lang.Number) ((jz5.n) this.f392997u).mo141623x754a37bb()).intValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", sb6.toString());
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = m158354x192630853 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630853 : null;
        if (abstractActivityC21394xb3d2c0cf3 != null) {
            if (!((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue()) {
                if (!T6()) {
                    abstractActivityC21394xb3d2c0cf3.mo54450xbf7c1df6("");
                }
                abstractActivityC21394xb3d2c0cf3.m78494xd9193382(0, abstractActivityC21394xb3d2c0cf3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new kr3.k1(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
                abstractActivityC21394xb3d2c0cf3.mo78514x143f1b92().t0(false);
                abstractActivityC21394xb3d2c0cf3.mo78514x143f1b92().x0(abstractActivityC21394xb3d2c0cf3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new kr3.l1(this, abstractActivityC21394xb3d2c0cf3));
                return;
            }
            abstractActivityC21394xb3d2c0cf3.mo78514x143f1b92().t0(true);
            abstractActivityC21394xb3d2c0cf3.mo74406x9c8c0d33(new kr3.j1(abstractActivityC21394xb3d2c0cf3), com.p314xaae8f345.mm.R.raw.f79708x60cfbb44);
            abstractActivityC21394xb3d2c0cf3.m78520x322d3abd().setBackground(i65.a.i(abstractActivityC21394xb3d2c0cf3, com.p314xaae8f345.mm.R.C30861xcebc809e.f562412a64));
            int f17 = i65.a.f(abstractActivityC21394xb3d2c0cf3, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            abstractActivityC21394xb3d2c0cf3.m78520x322d3abd().setLayoutParams(new android.widget.LinearLayout.LayoutParams(f17, f17));
            int f18 = i65.a.f(abstractActivityC21394xb3d2c0cf3, com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj);
            abstractActivityC21394xb3d2c0cf3.m78520x322d3abd().setPadding(f18, f18, f18, f18);
            int f19 = i65.a.f(abstractActivityC21394xb3d2c0cf3, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            int f27 = i65.a.f(abstractActivityC21394xb3d2c0cf3, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
            android.view.ViewParent parent = abstractActivityC21394xb3d2c0cf3.m78520x322d3abd().getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.setPadding(f19, f27, f19, f27);
            }
            android.view.View findViewById3 = abstractActivityC21394xb3d2c0cf3.findViewById(com.p314xaae8f345.mm.R.id.obp);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById4 = abstractActivityC21394xb3d2c0cf3.findViewById(com.p314xaae8f345.mm.R.id.f564981sl4);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById4, arrayList6.toArray(), "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
