package m50;

/* loaded from: classes.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m50.x f405034d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(m50.x xVar) {
        super(1);
        this.f405034d = xVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            m50.x xVar = this.f405034d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseForwardUIC", "SelectConfirmAction usernameList:" + c0Var.f527815b + ": ");
            java.util.List list = c0Var.f527815b;
            xVar.f405046e.clear();
            xVar.f405046e.addAll(list);
            java.util.Map a17 = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.a(xVar.c7(), xVar.g7(), xVar.a7());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardReportHelper", "reportForwardItemBtn: " + a17);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_item_btn", "view_clk", a17, 32337);
            xVar.X6(list);
        }
        xi5.e eVar = (xi5.e) state.a(xi5.e.class);
        if (eVar != null) {
            m50.x xVar2 = this.f405034d;
            co.a c76 = xVar2.c7();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 e76 = xVar2.e7();
            android.content.Intent m158359x1e885992 = xVar2.m158359x1e885992();
            if (c76 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ForwardReportHelper", "reportClickForwardToWework viewmodel is null");
            } else {
                int intExtra = m158359x1e885992 != null ? m158359x1e885992.getIntExtra("content_type_forward_to_wework", -1) : -1;
                if (m158359x1e885992 == null || (str = m158359x1e885992.getStringExtra("Retr_Msg_view_model")) == null) {
                    str = "";
                }
                ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.p2690x38b72420.b4(c76, m158359x1e885992 != null ? m158359x1e885992.getBooleanExtra("ForwardParams_FromSingleMultiForward", false) : false, intExtra, e76, str), "forward_wework_report");
            }
            if (eVar.f536274b == 2) {
                java.util.Map a18 = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.a(xVar2.c7(), xVar2.g7(), xVar2.a7());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardReportHelper", "reportForwardWeGovBtn: " + a18);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_wegov_btn", "view_clk", a18, 32337);
            } else {
                java.util.Map a19 = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.a(xVar2.c7(), xVar2.g7(), xVar2.a7());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardReportHelper", "reportForwardWecomBtn: " + a19);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_wecom_btn", "view_clk", a19, 32337);
            }
            m50.x.T6(xVar2, eVar, xVar2.a7(), new m50.r(xVar2, eVar));
        }
        if (((xi5.f) state.a(xi5.f.class)) != null) {
            m50.x xVar3 = this.f405034d;
            co.a c77 = xVar3.c7();
            int g76 = xVar3.g7();
            int a76 = xVar3.a7();
            com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e eVar2 = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a;
            java.util.Map a27 = eVar2.a(c77, g76, a76);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardReportHelper", "reportForwardYuanBaoBtn: " + a27);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_yuanbao_btn", "view_clk", a27, 32337);
            com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290833g = eVar2.a(xVar3.c7(), xVar3.g7(), xVar3.a7());
            ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).cj();
            xVar3.l7();
        }
        if (((xi5.c) state.a(xi5.c.class)) != null) {
            m50.x xVar4 = this.f405034d;
            com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290833g = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.a(xVar4.c7(), xVar4.m158359x1e885992().getIntExtra("ForwardParams_ReportFromScene", 0), 0);
            xVar4.h7(null);
        }
        if (((xi5.d) state.a(xi5.d.class)) != null) {
            m50.x xVar5 = this.f405034d;
            co.a c78 = xVar5.c7();
            int g77 = xVar5.g7();
            int a77 = xVar5.a7();
            com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e eVar3 = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a;
            java.util.Map a28 = eVar3.a(c78, g77, a77);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardReportHelper", "reportForwardOtherAppBtn: " + a28);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_other_app_btn", "view_clk", a28, 32337);
            com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290833g = eVar3.a(xVar5.c7(), xVar5.g7(), xVar5.a7());
            xVar5.i7();
        }
        return jz5.f0.f384359a;
    }
}
