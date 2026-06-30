package cj5;

/* loaded from: classes.dex */
public final class j0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f123682d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f123683e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f123684f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f123685g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f123686h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f123682d = "";
        this.f123683e = "";
        this.f123686h = jz5.h.b(new cj5.g0(this));
    }

    public static final void T6(cj5.j0 j0Var, int i17) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = j0Var.P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.B3(new wi5.t(i17));
    }

    public final em.l2 U6() {
        return (em.l2) ((jz5.n) this.f123686h).mo141623x754a37bb();
    }

    public final void V6(wi5.n0 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMenu: ");
        java.util.LinkedList linkedList = state.f527852o;
        sb6.append(linkedList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiSelectModeUIC", sb6.toString());
        linkedList.size();
        linkedList.contains(this.f123683e);
        abstractActivityC21394xb3d2c0cf.m78560xe21cbbf(false);
        abstractActivityC21394xb3d2c0cf.mo78514x143f1b92().x0(m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new cj5.h0(this));
        abstractActivityC21394xb3d2c0cf.m78615xdf8a9a94(1, com.p314xaae8f345.mm.ui.fb.GREEN);
        abstractActivityC21394xb3d2c0cf.m78612x9ba2f8f1(1, new cj5.i0(this), null);
        if (linkedList.size() > 0) {
            abstractActivityC21394xb3d2c0cf.mo60878xf6b21fea(1, m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5) + '(' + linkedList.size() + ')');
        } else {
            abstractActivityC21394xb3d2c0cf.mo60878xf6b21fea(1, m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5));
        }
        if (linkedList.size() > state.f527850m) {
            abstractActivityC21394xb3d2c0cf.m78500x43e00957(1, true);
            this.f123685g = false;
        } else {
            abstractActivityC21394xb3d2c0cf.m78500x43e00957(1, false);
            this.f123685g = true;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onClickDialogSpaceOnHalfScreenMode */
    public boolean mo10662xe0085496() {
        return this.f123685g;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        j75.f m67437x4bd53102;
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("msgQuoteName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f123683e = stringExtra;
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("chatroomName");
        this.f123682d = stringExtra2 != null ? stringExtra2 : "";
        this.f123684f = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f123682d);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null && (m67437x4bd53102 = P6.m67437x4bd5310()) != null) {
            m67437x4bd53102.L2(m158354x19263085(), new cj5.e0(this, h0Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 == null || (m67437x4bd5310 = P62.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.z3(m158354x19263085(), cj5.f0.f123649d);
    }
}
