package kr3;

/* loaded from: classes11.dex */
public abstract class t extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f393009d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 f393010e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f393011f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f393012g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f393013h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f393014i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f393015m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f393016n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f393017o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f393018p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f393019q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f393014i = jz5.h.b(new kr3.r(this));
        this.f393015m = jz5.h.b(new kr3.s(this));
        this.f393016n = jz5.h.b(new kr3.l(activity));
        this.f393017o = jz5.h.b(new kr3.k(this));
        this.f393018p = jz5.h.b(new kr3.q(this));
        this.f393019q = jz5.h.b(new kr3.m(this));
    }

    public void O6() {
    }

    public void P6(xg3.q0 op6, com.p314xaae8f345.mm.p944x882e457a.f cgiBack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(op6, "op");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiBack, "cgiBack");
    }

    public final boolean Q6() {
        com.p314xaae8f345.mm.p670x38b72420.o U6 = U6();
        if (U6 == null) {
            return false;
        }
        return ((tc0.s) ((uc0.o) i95.n0.c(uc0.o.class))).Bi(((yq3.v) U6).k() ? 2 : 1);
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

    public final com.p314xaae8f345.mm.p670x38b72420.o U6() {
        return (com.p314xaae8f345.mm.p670x38b72420.o) ((jz5.n) this.f393016n).mo141623x754a37bb();
    }

    public java.lang.String V6() {
        return "BaseRemarkUI";
    }

    public xg3.q0 W6() {
        return null;
    }

    public final boolean X6() {
        return ((java.lang.Boolean) ((jz5.n) this.f393015m).mo141623x754a37bb()).booleanValue();
    }

    public lr3.a Y6() {
        return null;
    }

    public abstract boolean Z6();

    public boolean a7() {
        return true;
    }

    public abstract android.view.View b7(java.lang.String str, com.p314xaae8f345.mm.p670x38b72420.o oVar);

    public void c7() {
    }

    public void d7() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        kr3.q1 q1Var = (kr3.q1) pf5.z.f435481a.a(activity).a(kr3.q1.class);
        q1Var.getClass();
        ym5.a1.f(new kr3.h1(q1Var));
    }

    public void e7() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        boolean z17 = ((kr3.q1) pf5.z.f435481a.a(activity).a(kr3.q1.class)).f392989m;
        java.lang.Long g76 = g7();
        if (g76 != null) {
            long longValue = g76.longValue();
            if (longValue < 0) {
                return;
            }
            jz5.l[] lVarArr = new jz5.l[4];
            lVarArr[0] = new jz5.l("profile_half_screen_source", java.lang.Long.valueOf(longValue));
            lVarArr[1] = new jz5.l("half_screen_exit_type", java.lang.Integer.valueOf(z17 ? 1 : 2));
            lVarArr[2] = new jz5.l("chat_name", m144228x6c03c64c());
            lVarArr[3] = new jz5.l("finish_is_revise", z17 ? 1 : null);
            java.util.Map l17 = kz5.c1.l(lVarArr);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.BaseRemarkUI", "username(" + m144228x6c03c64c() + "), reportMap: " + l17);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("page_unexp", l17, 34575);
        }
    }

    public void f7(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6829x19be670f struct) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
    }

    @Override // pf5.p
    /* renamed from: findViewById */
    public android.view.View mo144222x4ff8c0f0(int i17) {
        android.view.View findViewById;
        android.view.View view = this.f393012g;
        return (view == null || (findViewById = view.findViewById(i17)) == null) ? m158354x19263085().findViewById(i17) : findViewById;
    }

    public java.lang.Long g7() {
        return null;
    }

    /* renamed from: getUsername */
    public final java.lang.String m144228x6c03c64c() {
        return (java.lang.String) ((jz5.n) this.f393014i).mo141623x754a37bb();
    }

    public boolean h7() {
        return true;
    }

    public int i7() {
        return -1;
    }

    public abstract int k7();

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onClickDialogSpaceOnHalfScreenMode */
    public boolean mo10662xe0085496() {
        return Z6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        d7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        super.mo2277xb2f1ab1a(bundle);
        if (X6()) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                abstractActivityC21394xb3d2c0cf.m78495xf385c157();
                abstractActivityC21394xb3d2c0cf.mo56582xbf7c1df6(k7());
            }
        }
    }
}
