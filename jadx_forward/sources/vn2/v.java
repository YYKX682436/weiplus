package vn2;

/* loaded from: classes10.dex */
public final class v implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f519927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f519928b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f519929c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f519930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f519931e;

    public v(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, r45.qt2 qt2Var, boolean z18, android.app.Activity activity) {
        this.f519927a = z17;
        this.f519928b = abstractC14490x69736cb5;
        this.f519929c = qt2Var;
        this.f519930d = z18;
        this.f519931e = activity;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g
    public final void a() {
        if (this.f519927a) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("view_id", "open_topstory_bar");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f519928b;
            lVarArr[1] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
            r45.qt2 qt2Var = this.f519929c;
            lVarArr[2] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(1) : null);
            lVarArr[3] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(2) : null);
            lVarArr[4] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null);
            java.lang.String m76829x97edf6c0 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76829x97edf6c0();
            if (m76829x97edf6c0 == null) {
                m76829x97edf6c0 = "";
            }
            lVarArr[5] = new jz5.l("session_buffer", m76829x97edf6c0);
            ((cy1.a) rVar).yj("view_clk", null, kz5.c1.k(lVarArr), 1, true);
            boolean z17 = this.f519930d;
            android.app.Activity ui6 = this.f519931e;
            if (z17) {
                ui6.finish();
                mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
                ((lf0.h0) g0Var).Vi(ui6, 123, bundle);
                return;
            }
            wd0.z1 z1Var = (wd0.z1) i95.n0.c(wd0.z1.class);
            vn2.u uVar = new vn2.u(ui6, abstractC14490x69736cb5);
            ((vd0.o3) z1Var).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.x3 x3Var = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17397x56ca4f48.f241753x;
            boolean a07 = c01.e2.a0();
            boolean z18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ExtFunctionSwitchEntry", 0) == 1;
            if (a07 && z18) {
                v24.o0.i(ui6, 67108864L, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.v3(true), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.w3(true, uVar), 2);
            } else {
                x3Var.a(true);
                uVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
        }
    }
}
