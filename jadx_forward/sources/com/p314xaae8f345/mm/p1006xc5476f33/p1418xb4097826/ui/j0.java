package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class j0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15009x8d3b9588 f210908d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15009x8d3b9588 activityC15009x8d3b9588) {
        this.f210908d = activityC15009x8d3b9588;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        if (g4Var.z()) {
            int parseColor = android.graphics.Color.parseColor("#FA5151");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15009x8d3b9588 context = this.f210908d;
            g4Var.d(0, parseColor, context.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mai));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[4];
            lVarArr[0] = new jz5.l("expose_type", 0);
            lVarArr[1] = new jz5.l("finder_context_id", V6 != null ? V6.m75945x2fec8307(1) : null);
            lVarArr[2] = new jz5.l("finder_tab_context_id", V6 != null ? V6.m75945x2fec8307(2) : null);
            lVarArr[3] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
            ((cy1.a) rVar).Bj("recently_browse_feed_delete", "view_exp", kz5.c1.k(lVarArr), 1, false);
        }
    }
}
