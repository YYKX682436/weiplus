package iu4;

/* loaded from: classes9.dex */
public class h implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.e3 f376562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6 f376563e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6 viewOnClickListenerC19201x9aa113d6, com.p314xaae8f345.mm.p944x882e457a.e3 e3Var) {
        this.f376563e = viewOnClickListenerC19201x9aa113d6;
        this.f376562d = e3Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureGuardLogicUI", java.lang.String.format("Scene doModify, errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str));
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6.f262841y;
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6 viewOnClickListenerC19201x9aa113d6 = this.f376563e;
        viewOnClickListenerC19201x9aa113d6.U6();
        if (i17 == 0 && i18 == 0) {
            hu4.i.j(((r45.gz4) oVar.f152244b.f152233a).f457204d);
            com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6.T6(viewOnClickListenerC19201x9aa113d6);
            if (viewOnClickListenerC19201x9aa113d6.f262844f == 0) {
                int i27 = viewOnClickListenerC19201x9aa113d6.f262859x;
                if (i27 == 1) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca9650 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
                    c7053xf3ca9650.f143649d = 8L;
                    c7053xf3ca9650.f143650e = 2L;
                    c7053xf3ca9650.k();
                } else if (i27 == 2) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca96502 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
                    c7053xf3ca96502.f143649d = 10L;
                    c7053xf3ca96502.f143650e = 2L;
                    c7053xf3ca96502.k();
                }
            } else {
                java.lang.String stringExtra = viewOnClickListenerC19201x9aa113d6.getIntent().getStringExtra("next_action");
                if ("next_action.modify_pattern".equals(stringExtra)) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca96503 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
                    c7053xf3ca96503.f143649d = 5L;
                    c7053xf3ca96503.f143650e = 2L;
                    c7053xf3ca96503.k();
                } else if ("next_action.switch_on_pattern".equals(stringExtra)) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca96504 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
                    c7053xf3ca96504.f143649d = 4L;
                    c7053xf3ca96504.f143650e = 2L;
                    c7053xf3ca96504.k();
                } else {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca96505 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
                    c7053xf3ca96505.f143649d = 5L;
                    c7053xf3ca96505.f143650e = 2L;
                    c7053xf3ca96505.k();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.n.INSTANCE.i();
        com.p314xaae8f345.mm.p944x882e457a.e3 e3Var = this.f376562d;
        if (e3Var != null) {
            return e3Var.mo1034xf5bc2045(i17, i18, str, oVar, m1Var);
        }
        return 0;
    }
}
