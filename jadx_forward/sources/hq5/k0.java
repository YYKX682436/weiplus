package hq5;

/* loaded from: classes5.dex */
public final class k0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f364772d;

    /* renamed from: e, reason: collision with root package name */
    public int f364773e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f364774f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f364772d = "MicroMsg.WeDrop.WeDropProgressUIC";
        this.f364774f = jz5.h.b(new hq5.b0(this));
    }

    public final void T6() {
        java.lang.String string;
        java.lang.String string2;
        if (kz5.c0.i(13, 14, 16, 9, 10, 3, 4, 11, 12, 17).contains(java.lang.Integer.valueOf(this.f364773e))) {
            m158354x19263085().finish();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(m80379x76847179());
        int i17 = this.f364773e;
        if (i17 == 7) {
            string = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nsi);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else if (i17 != 8) {
            string = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nrn);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else {
            string = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nrs);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        }
        u1Var.u(string);
        u1Var.n(m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nys));
        int i18 = this.f364773e;
        if (i18 != 5 && i18 != 6) {
            if (i18 == 7) {
                string2 = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nsh);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            } else if (i18 == 8) {
                string2 = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nrr);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            } else if (i18 != 15) {
                string2 = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nr9);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            }
            u1Var.j(string2);
            u1Var.k(m80379x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            u1Var.b(new hq5.c0(this));
            u1Var.q(false);
        }
        string2 = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nrq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        u1Var.j(string2);
        u1Var.k(m80379x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
        u1Var.b(new hq5.c0(this));
        u1Var.q(false);
    }

    public final em.i4 U6() {
        return (em.i4) ((jz5.n) this.f364774f).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        T6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new hq5.d0(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        android.widget.TextView c17;
        super.mo739xfd763ae1(bundle);
        em.i4 U6 = U6();
        if (U6 == null || (c17 = U6.c()) == null) {
            return;
        }
        c17.setOnClickListener(new hq5.e0(this));
    }
}
