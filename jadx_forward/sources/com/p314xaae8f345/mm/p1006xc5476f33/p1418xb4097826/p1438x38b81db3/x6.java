package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class x6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f186462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s7 f186463f;

    public x6(in5.s0 s0Var, so2.y0 y0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s7 s7Var) {
        this.f186461d = s0Var;
        this.f186462e = y0Var;
        this.f186463f = s7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$initSelectStar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$initSelectStar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        in5.s0 s0Var = this.f186461d;
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.v2_);
        if (p17 != null) {
            hc2.f1.d(p17);
        }
        so2.y0 y0Var = this.f186462e;
        boolean z18 = (y0Var.f492236d.u0().m76072xefec40f7() & 2) != 0;
        int i17 = z18 ? 4 : 3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s7 s7Var = this.f186463f;
        s7Var.f186061e.U(y0Var, i17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.w6(y0Var, i17, s7Var));
        android.content.Context context = s0Var.f374654e;
        if (z18) {
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.nlf);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var.c();
        } else {
            int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.nlc);
            e4Var2.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var2.c();
        }
        boolean z19 = !z18;
        so2.g0.f(y0Var, z19);
        android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.v2_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
        s7Var.G(z19, (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) p18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(s7Var.f186062f.mo2128x1ed62e84()));
        lVarArr[1] = new jz5.l("comment_id", pm0.v.u(y0Var.mo2128x1ed62e84()));
        java.lang.String str2 = "";
        if (V6 == null || (str = V6.m75945x2fec8307(1)) == null) {
            str = "";
        }
        lVarArr[2] = new jz5.l("finder_context_id", str);
        if (V6 != null && (m75945x2fec8307 = V6.m75945x2fec8307(2)) != null) {
            str2 = m75945x2fec8307;
        }
        lVarArr[3] = new jz5.l("finder_tab_context_id", str2);
        lVarArr[4] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
        lVarArr[5] = new jz5.l("fav_result", java.lang.Integer.valueOf(i17 != 3 ? 2 : 1));
        ((cy1.a) rVar).Bj("finder_comment_fav_button", "view_clk", kz5.c1.k(lVarArr), 1, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$initSelectStar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
