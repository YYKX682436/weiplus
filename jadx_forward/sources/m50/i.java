package m50;

/* loaded from: classes.dex */
public final class i implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m50.x f405016a;

    public i(m50.x xVar) {
        this.f405016a = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String stringExtra;
        k50.o0 o0Var;
        if (i17 == -1) {
            m50.x xVar = this.f405016a;
            if (xVar.m158354x19263085().isFinishing() || xVar.m158354x19263085().isDestroyed()) {
                return;
            }
            int intExtra = intent != null ? intent.getIntExtra("selected_app_index", 0) : 0;
            if (intent != null && (stringExtra = intent.getStringExtra("selected_app")) != null) {
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    o0Var = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(k50.o0.m141988xdce0328(stringExtra));
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    o0Var = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                r2 = p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(o0Var) ? null : o0Var;
            }
            int i18 = r2 != null ? m50.h.f405015a[r2.ordinal()] : -1;
            if (i18 == 1) {
                java.util.Map m17 = kz5.c1.m(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.a(xVar.c7(), xVar.g7(), xVar.a7()), kz5.b1.e(new jz5.l("forward_other_app_index", java.lang.Integer.valueOf(intExtra))));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardReportHelper", "reportForwardOtherWecomBtn: " + m17);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_other_wecom_btn", "view_clk", m17, 32337);
                xi5.e eVar = new xi5.e(1);
                m50.x.T6(xVar, eVar, xVar.a7(), new m50.f(xVar, eVar));
                return;
            }
            if (i18 == 2) {
                java.util.Map m18 = kz5.c1.m(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.a(xVar.c7(), xVar.g7(), xVar.a7()), kz5.b1.e(new jz5.l("forward_other_app_index", java.lang.Integer.valueOf(intExtra))));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardReportHelper", "reportForwardOtherWeGovBtn: " + m18);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_other_wegov_btn", "view_clk", m18, 32337);
                xi5.e eVar2 = new xi5.e(2);
                m50.x.T6(xVar, eVar2, xVar.a7(), new m50.g(xVar, eVar2));
                return;
            }
            if (i18 != 3) {
                if (i18 != 4) {
                    return;
                }
                xVar.h7(intent.getStringExtra("selected_clawbot_username"));
                return;
            }
            java.util.Map m19 = kz5.c1.m(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.a(xVar.c7(), xVar.g7(), xVar.a7()), kz5.b1.e(new jz5.l("forward_other_app_index", java.lang.Integer.valueOf(intExtra))));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardReportHelper", "reportForwardOtherYuanBaoBtn: " + m19);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_other_yuanbao_btn", "view_clk", m19, 32337);
            ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).cj();
            xVar.l7();
        }
    }
}
