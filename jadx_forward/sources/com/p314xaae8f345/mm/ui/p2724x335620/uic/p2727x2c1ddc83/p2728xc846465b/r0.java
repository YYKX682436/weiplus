package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes.dex */
public final class r0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f290889d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f290890e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f290891f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f290892g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f290893h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f290889d = "";
        this.f290890e = "";
        this.f290893h = jz5.h.b(new com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.n0(this));
    }

    public static final void T6(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.r0 r0Var) {
        j75.f m67437x4bd5310;
        wi5.n0 n0Var;
        int intExtra = r0Var.m158359x1e885992().getIntExtra("ForwardParams_ReportFromScene", 0);
        int intExtra2 = r0Var.m158359x1e885992().getIntExtra("ForwardParams_ForwardMsgType", 0);
        j75.f Q6 = r0Var.Q6();
        java.util.Map a17 = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.a((Q6 == null || (n0Var = (wi5.n0) Q6.mo140437x75286adb()) == null) ? null : n0Var.f527857t, intExtra, intExtra2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardReportHelper", "reportForwardMultiNextBtn: " + a17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_multi_next_btn", "view_clk", a17, 32337);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = r0Var.P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.B3(new wi5.c());
    }

    public static final void U6(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.r0 r0Var) {
        j75.f m67437x4bd5310;
        wi5.n0 n0Var;
        int intExtra = r0Var.m158359x1e885992().getIntExtra("ForwardParams_ReportFromScene", 0);
        int intExtra2 = r0Var.m158359x1e885992().getIntExtra("ForwardParams_ForwardMsgType", 0);
        j75.f Q6 = r0Var.Q6();
        java.util.Map a17 = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.a((Q6 == null || (n0Var = (wi5.n0) Q6.mo140437x75286adb()) == null) ? null : n0Var.f527857t, intExtra, intExtra2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardReportHelper", "reportForwardMultiBtn: " + a17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_multi_btn", "view_clk", a17, 32337);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = r0Var.P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.B3(new wi5.e());
    }

    public final void V6(wi5.n0 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMenu: ");
        java.util.LinkedList linkedList = state.f527852o;
        sb6.append(linkedList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopMenuUIC", sb6.toString());
        linkedList.size();
        linkedList.contains(this.f290890e);
        if (!state.e()) {
            this.f290892g = false;
            abstractActivityC21394xb3d2c0cf.m78560xe21cbbf(true);
            abstractActivityC21394xb3d2c0cf.m78615xdf8a9a94(1, com.p314xaae8f345.mm.ui.fb.TRANSPARENT);
            abstractActivityC21394xb3d2c0cf.m78612x9ba2f8f1(1, new com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.q0(this), null);
            abstractActivityC21394xb3d2c0cf.mo60878xf6b21fea(1, m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572026wm));
            abstractActivityC21394xb3d2c0cf.m78500x43e00957(1, true);
            return;
        }
        abstractActivityC21394xb3d2c0cf.m78560xe21cbbf(false);
        abstractActivityC21394xb3d2c0cf.mo78514x143f1b92().x0(m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.o0(this));
        abstractActivityC21394xb3d2c0cf.m78615xdf8a9a94(1, com.p314xaae8f345.mm.ui.fb.GREEN);
        abstractActivityC21394xb3d2c0cf.m78612x9ba2f8f1(1, new com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.p0(this), null);
        if (linkedList.size() > 0) {
            abstractActivityC21394xb3d2c0cf.mo60878xf6b21fea(1, m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5) + '(' + linkedList.size() + ')');
        } else {
            abstractActivityC21394xb3d2c0cf.mo60878xf6b21fea(1, m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5));
        }
        if (linkedList.size() > state.f527850m) {
            abstractActivityC21394xb3d2c0cf.m78500x43e00957(1, true);
            this.f290892g = false;
        } else {
            abstractActivityC21394xb3d2c0cf.m78500x43e00957(1, false);
            this.f290892g = true;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onClickDialogSpaceOnHalfScreenMode */
    public boolean mo10662xe0085496() {
        return this.f290892g;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        j75.f m67437x4bd53102;
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17;
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("msgQuoteName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f290890e = stringExtra;
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("chatroomName");
        this.f290889d = stringExtra2 != null ? stringExtra2 : "";
        rv1.f fVar = (rv1.f) gm0.j1.s(rv1.f.class);
        this.f290891f = (fVar == null || (a17 = ((qv1.a) fVar).a()) == null) ? null : a17.z0(this.f290889d);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null && (m67437x4bd53102 = P6.m67437x4bd5310()) != null) {
            m67437x4bd53102.L2(m158354x19263085(), new com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.l0(this, h0Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 == null || (m67437x4bd5310 = P62.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.z3(m158354x19263085(), com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.m0.f290879d);
    }
}
