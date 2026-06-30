package kr3;

/* loaded from: classes11.dex */
public abstract class j extends com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f392922d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 f392923e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f392924f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f392925g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f392926h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f392927i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f392928m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f392929n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f392930o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f392931p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f392932q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f392927i = jz5.h.b(new kr3.h(this));
        this.f392928m = jz5.h.b(new kr3.i(this));
        this.f392929n = jz5.h.b(new kr3.b(this));
        this.f392930o = jz5.h.b(new kr3.a(this));
        this.f392931p = jz5.h.b(new kr3.g(this));
        this.f392932q = jz5.h.b(new kr3.c(this));
    }

    public void O6() {
    }

    public void P6(xg3.q0 op6, com.p314xaae8f345.mm.p944x882e457a.f cgiBack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(op6, "op");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiBack, "cgiBack");
    }

    public final boolean Q6() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 U6 = U6();
        if (U6 == null) {
            return false;
        }
        return ((tc0.s) ((uc0.o) i95.n0.c(uc0.o.class))).Bi(U6.r2() ? 2 : 1);
    }

    public java.lang.Object R6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return java.lang.Boolean.TRUE;
    }

    public java.lang.Object S6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return jz5.f0.f384359a;
    }

    public void T6(yz5.l onResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onResult, "onResult");
        onResult.mo146xb9724478(0);
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.z3 U6() {
        return (com.p314xaae8f345.mm.p2621x8fb0427b.z3) ((jz5.n) this.f392929n).mo141623x754a37bb();
    }

    public java.lang.String V6() {
        return "BaseRemarkUI";
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.z3 W6() {
        java.lang.String d17;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 U6 = U6();
        if (U6 != null && (d17 = U6.d1()) != null) {
            boolean z17 = true;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(d17, true);
            if (n17 != null) {
                java.lang.String d18 = n17.d1();
                if (d18 != null && !r26.n0.N(d18)) {
                    z17 = false;
                }
                if (!z17) {
                    return n17;
                }
            }
        }
        return U6();
    }

    public xg3.q0 X6() {
        return null;
    }

    public final boolean Y6() {
        return ((java.lang.Boolean) ((jz5.n) this.f392928m).mo141623x754a37bb()).booleanValue();
    }

    public lr3.a Z6() {
        return null;
    }

    public abstract boolean a7();

    public boolean b7() {
        return true;
    }

    public abstract android.view.View c7(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var);

    public void d7() {
    }

    public void e7() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        kr3.q0 q0Var = (kr3.q0) pf5.z.f435481a.a(activity).a(kr3.q0.class);
        q0Var.getClass();
        ym5.a1.f(new kr3.h0(q0Var));
    }

    public void f7() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        boolean z17 = ((kr3.q0) pf5.z.f435481a.a(activity).a(kr3.q0.class)).f392969m;
        java.lang.Long h76 = h7();
        if (h76 != null) {
            long longValue = h76.longValue();
            if (longValue < 0) {
                return;
            }
            jz5.l[] lVarArr = new jz5.l[4];
            lVarArr[0] = new jz5.l("profile_half_screen_source", java.lang.Long.valueOf(longValue));
            lVarArr[1] = new jz5.l("half_screen_exit_type", java.lang.Integer.valueOf(z17 ? 1 : 2));
            lVarArr[2] = new jz5.l("chat_name", m144223x6c03c64c());
            lVarArr[3] = new jz5.l("finish_is_revise", z17 ? 1 : null);
            java.util.Map l17 = kz5.c1.l(lVarArr);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.BaseRemarkUI", "username(" + m144223x6c03c64c() + "), reportMap: " + l17);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("page_unexp", l17, 34575);
        }
    }

    @Override // pf5.p
    /* renamed from: findViewById */
    public android.view.View mo144222x4ff8c0f0(int i17) {
        android.view.View findViewById;
        android.view.View view = this.f392925g;
        return (view == null || (findViewById = view.findViewById(i17)) == null) ? m158354x19263085().findViewById(i17) : findViewById;
    }

    public void g7(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6829x19be670f struct) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
    }

    /* renamed from: getUsername */
    public final java.lang.String m144223x6c03c64c() {
        return (java.lang.String) ((jz5.n) this.f392927i).mo141623x754a37bb();
    }

    public java.lang.Long h7() {
        return null;
    }

    public boolean i7() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf
    /* renamed from: initConfig */
    public void mo10031xf3d9c872() {
        m42284x3580e2(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569451bk).m42296x639e22e8(com.p314xaae8f345.mm.R.id.f78238xaeb5384d);
    }

    public int k7() {
        return -1;
    }

    public abstract int l7();

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onClickDialogSpaceOnHalfScreenMode */
    public boolean mo10662xe0085496() {
        return a7();
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        e7();
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        super.mo2277xb2f1ab1a(bundle);
        if (Y6()) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                abstractActivityC21394xb3d2c0cf.m78495xf385c157();
                abstractActivityC21394xb3d2c0cf.mo56582xbf7c1df6(l7());
            }
        }
    }
}
