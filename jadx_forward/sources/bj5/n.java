package bj5;

/* loaded from: classes.dex */
public final class n extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f102732d;

    /* renamed from: e, reason: collision with root package name */
    public int f102733e;

    /* renamed from: f, reason: collision with root package name */
    public int f102734f;

    /* renamed from: g, reason: collision with root package name */
    public int f102735g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f102736h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f102737i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f102738m;

    /* renamed from: n, reason: collision with root package name */
    public int f102739n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f102740o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f102741p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f102742q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f102736h = "";
        this.f102737i = "";
        this.f102741p = jz5.h.b(new bj5.j(this));
        this.f102742q = jz5.h.b(new bj5.i(this));
    }

    public final void T6(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6328x5bd52de3 c6328x5bd52de3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6328x5bd52de3();
        long j17 = 1;
        long j18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f102737i) ? 1L : 2L;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f102738m;
        boolean z17 = false;
        if (!(a3Var != null && a3Var.L0(c01.z1.r()))) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var2 = this.f102738m;
            if (a3Var2 != null && a3Var2.G0(c01.z1.r())) {
                z17 = true;
            }
            j17 = z17 ? 2L : 3L;
        }
        c6328x5bd52de3.f136863e = j17;
        c6328x5bd52de3.f136865g = i17;
        c6328x5bd52de3.f136862d = c6328x5bd52de3.b("ChatName", this.f102736h, true);
        c6328x5bd52de3.f136864f = this.f102738m != null ? r12.f69098xbcb1bed0 : 0L;
        c6328x5bd52de3.f136867i = this.f102733e;
        c6328x5bd52de3.f136866h = this.f102732d;
        c6328x5bd52de3.f136868j = j18;
        c6328x5bd52de3.f136869k = this.f102734f;
        c6328x5bd52de3.f136870l = this.f102735g;
        c6328x5bd52de3.f136871m = this.f102739n;
        c6328x5bd52de3.k();
        c6328x5bd52de3.o();
    }

    public final void U6(wi5.n0 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMenu: ");
        java.util.LinkedList linkedList = state.f527852o;
        sb6.append(linkedList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AtSomeOneTopMenuUIC", sb6.toString());
        this.f102734f = linkedList.size();
        if (linkedList.contains(this.f102737i)) {
            this.f102735g = 1;
        }
        if (!state.e()) {
            this.f102740o = false;
            abstractActivityC21394xb3d2c0cf.m78560xe21cbbf(true);
            abstractActivityC21394xb3d2c0cf.m78615xdf8a9a94(1, com.p314xaae8f345.mm.ui.fb.TRANSPARENT);
            abstractActivityC21394xb3d2c0cf.m78612x9ba2f8f1(1, new bj5.m(this), null);
            abstractActivityC21394xb3d2c0cf.mo60878xf6b21fea(1, m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572026wm));
            abstractActivityC21394xb3d2c0cf.m78500x43e00957(1, true);
            return;
        }
        abstractActivityC21394xb3d2c0cf.m78560xe21cbbf(false);
        abstractActivityC21394xb3d2c0cf.mo78514x143f1b92().x0(m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new bj5.k(this));
        abstractActivityC21394xb3d2c0cf.m78615xdf8a9a94(1, com.p314xaae8f345.mm.ui.fb.GREEN);
        abstractActivityC21394xb3d2c0cf.m78612x9ba2f8f1(1, new bj5.l(this), null);
        if (linkedList.size() > 0) {
            abstractActivityC21394xb3d2c0cf.mo60878xf6b21fea(1, m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5) + '(' + linkedList.size() + ')');
        } else {
            abstractActivityC21394xb3d2c0cf.mo60878xf6b21fea(1, m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5));
        }
        if (linkedList.size() > state.f527850m) {
            abstractActivityC21394xb3d2c0cf.m78500x43e00957(1, true);
            this.f102740o = false;
        } else {
            abstractActivityC21394xb3d2c0cf.m78500x43e00957(1, false);
            this.f102740o = true;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onClickDialogSpaceOnHalfScreenMode */
    public boolean mo10662xe0085496() {
        T6(3);
        return this.f102740o;
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
        this.f102737i = stringExtra;
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("chatroomName");
        this.f102736h = stringExtra2 != null ? stringExtra2 : "";
        this.f102739n = m158359x1e885992().getIntExtra("showSource", 0);
        this.f102738m = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f102736h);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null && (m67437x4bd53102 = P6.m67437x4bd5310()) != null) {
            m67437x4bd53102.L2(m158354x19263085(), new bj5.g(this, h0Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 == null || (m67437x4bd5310 = P62.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.z3(m158354x19263085(), bj5.h.f102720d);
    }
}
