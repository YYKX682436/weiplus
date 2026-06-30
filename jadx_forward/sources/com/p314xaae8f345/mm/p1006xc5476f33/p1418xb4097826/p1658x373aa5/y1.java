package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class y1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g2 f214905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214906b;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g2 g2Var, java.lang.String str) {
        this.f214905a = g2Var;
        this.f214906b = str;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[8];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g2 g2Var = this.f214905a;
        lVarArr[0] = new jz5.l("comment_id", pm0.v.u(g2Var.f213666e));
        lVarArr[1] = new jz5.l("report_extra_data", this.f214906b);
        lVarArr[2] = new jz5.l("unexpose_reason", java.lang.Integer.valueOf(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "view_unexp") ? g2Var.f213670i : 0));
        lVarArr[3] = new jz5.l("close_ad_comment_reason", r26.i0.t(kz5.n0.g0(g2Var.f213674m, null, null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.x1.f214845d, 31, null), ",", ";", false));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(g2Var.f213663b);
        lVarArr[4] = new jz5.l("behaviour_session_id", e17 != null ? e17.f216918q : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(g2Var.f213663b);
        lVarArr[5] = new jz5.l("finder_context_id", e18 != null ? e18.f216915p : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(g2Var.f213663b);
        lVarArr[6] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f216919r : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e27 = iyVar.e(g2Var.f213663b);
        lVarArr[7] = new jz5.l("comment_scene", e27 != null ? java.lang.Integer.valueOf(e27.f216913n) : null);
        return kz5.c1.k(lVarArr);
    }
}
