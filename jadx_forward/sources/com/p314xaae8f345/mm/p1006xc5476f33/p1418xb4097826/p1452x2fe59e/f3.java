package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class f3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f188227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f188228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f188229f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, boolean z17, so2.y0 y0Var) {
        super(0);
        this.f188227d = a7Var;
        this.f188228e = z17;
        this.f188229f = y0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f188227d;
        android.app.Dialog dialog = a7Var.F1;
        if (dialog != null) {
            dialog.dismiss();
        }
        boolean z17 = this.f188228e;
        so2.y0 y0Var = this.f188229f;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7.h(a7Var, y0Var, true);
        }
        a7Var.P(y0Var, false);
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        android.content.Context context = a7Var.f187740d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.b(com.p314xaae8f345.mm.R.raw.f79676xdf4900bc);
        e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cst);
        e4Var.c();
        if (z17) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[10];
            lVarArr[0] = new jz5.l("comment_id", pm0.v.u(y0Var.mo2128x1ed62e84()));
            lVarArr[1] = new jz5.l("feed_id", pm0.v.u(y0Var.f492236d.f68959xf9a02e3e));
            lVarArr[2] = new jz5.l("session_buffer", "");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(context);
            lVarArr[3] = new jz5.l("behaviour_session_id", e17 != null ? e17.f216918q : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(context);
            lVarArr[4] = new jz5.l("finder_context_id", e18 != null ? e18.f216915p : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(context);
            lVarArr[5] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f216919r : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e27 = iyVar.e(context);
            lVarArr[6] = new jz5.l("extra_info", e27 != null ? e27.X6() : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e28 = iyVar.e(context);
            lVarArr[7] = new jz5.l("enter_source_info", e28 != null ? e28.A : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e29 = iyVar.e(context);
            lVarArr[8] = new jz5.l("comment_scene", e29 != null ? java.lang.Integer.valueOf(e29.f216913n) : null);
            lVarArr[9] = new jz5.l("comment_username", y0Var.f492236d.Z0());
            ((cy1.a) rVar).Cj("feed_comment_del_click", null, kz5.c1.k(lVarArr), 24617);
        }
        return jz5.f0.f384359a;
    }
}
