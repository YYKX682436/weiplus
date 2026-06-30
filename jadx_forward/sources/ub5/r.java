package ub5;

/* loaded from: classes8.dex */
public final class r implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ub5.k f507777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f507778e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wp f507779f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f507780g;

    public r(ub5.k kVar, java.util.List list, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wp wpVar, java.lang.String str) {
        this.f507777d = kVar;
        this.f507778e = list;
        this.f507779f = wpVar;
        this.f507780g = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        xj.m mVar;
        gm0.b bVar;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a;
        int itemId = menuItem.getItemId();
        java.util.List list = this.f507778e;
        ub5.k kVar = this.f507777d;
        if (itemId == 1) {
            ub5.u.a(kVar, list);
            return;
        }
        if (itemId != 2) {
            return;
        }
        ub5.u uVar = ub5.u.f507787a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wp wpVar = this.f507779f;
        if (wpVar != null && (bVar = gm0.j1.b().f354778h) != null && (c20976x6ba6452a = bVar.f354678e) != null) {
            v65.i.b(c20976x6ba6452a, null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.up(wpVar, null), 1, null);
        }
        ct.k3 k3Var = (ct.k3) i95.n0.c(ct.k3.class);
        jz5.l lVar = new jz5.l("share_type", 12);
        jz5.l lVar2 = new jz5.l("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(list.size()));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.d6 d6Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.d6) kVar;
        jz5.l lVar3 = new jz5.l("chat_username", d6Var.f280458a.f280113d.x());
        java.lang.String str = this.f507780g;
        jz5.l lVar4 = new jz5.l("share_session_id", str);
        tb5.h0 h0Var = tb5.h0.f498586d;
        jz5.l lVar5 = new jz5.l("selected_msg_list", kz5.n0.g0(list, "#", null, null, 0, null, h0Var, 30, null));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 b5Var = d6Var.f280458a;
        qg5.e3 e3Var = (qg5.e3) k3Var;
        java.util.Map l17 = kz5.c1.l(lVar, lVar2, lVar3, lVar4, lVar5, new jz5.l("enter_source", java.lang.Integer.valueOf(e3Var.aj(b5Var.f280113d.x()))));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("bottom_options_controls", "view_clk", kz5.c1.k(new jz5.l("click_btn_name", "more_yuanbao"), new jz5.l("selected_msg_list", kz5.n0.g0(list, "#", null, null, 0, null, h0Var, 30, null)), new jz5.l("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(list.size())), new jz5.l("share_session_id", str), new jz5.l("chat_username", b5Var.f280113d.x())), 35480);
        e3Var.qj("journey_copy", str);
        e3Var.sj("journey_copy", l17);
        ct.j3 j3Var = (ct.j3) i95.n0.c(ct.j3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j3Var);
        android.app.Activity uiCtx = b5Var.f280113d.g();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = b5Var.f280230h;
        if (wpVar != null) {
            mVar = wpVar.f281722b;
            if (mVar == null) {
                mVar = wpVar.f281723c;
            }
        } else {
            mVar = null;
        }
        ub5.p pVar = new ub5.p(d6Var);
        qg5.z2 z2Var = (qg5.z2) j3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiCtx, "uiCtx");
        if (mVar == null) {
            ((wj.j0) z2Var.Zi()).Vi(wj.t0.f528046v, 2000L, new qg5.w2(z2Var, uiCtx, list, z3Var, true, true, pVar));
        } else {
            if (!jm0.g.class.isAssignableFrom(qg5.u3.class)) {
                throw new java.lang.IllegalArgumentException(qg5.z2.class.getName().concat(" must extends FeatureServiceComponent"));
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(z2Var.getViewModel(), new jm0.e(z2Var)).a(qg5.u3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ((qg5.u3) ((jm0.g) a17)).V6(uiCtx, list, z3Var, mVar, true, true, pVar);
        }
    }
}
