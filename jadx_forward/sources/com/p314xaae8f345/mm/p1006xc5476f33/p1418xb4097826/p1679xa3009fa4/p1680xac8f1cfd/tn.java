package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class tn implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f217579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rn f217580e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo f217581f;

    public tn(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rn rnVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo eoVar) {
        this.f217579d = linkedList;
        this.f217580e = rnVar;
        this.f217581f = eoVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        java.lang.String str;
        r45.y94 y94Var = (r45.y94) kz5.n0.a0(this.f217579d, i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select encash, index:");
        sb6.append(i17);
        sb6.append(", bizEncashItem:");
        sb6.append(y94Var != null ? java.lang.Integer.valueOf(y94Var.m75939xb282bd08(0)) : null);
        sb6.append(", ");
        sb6.append(y94Var != null ? y94Var.m75945x2fec8307(1) : null);
        sb6.append(", encash_intercept_jump_info:");
        sb6.append(y94Var != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) y94Var.m75936x14adae67(4) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveIncomeListUIC", sb6.toString());
        boolean z17 = y94Var != null && y94Var.m75939xb282bd08(0) == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rn rnVar = this.f217580e;
        if (z17) {
            c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) y94Var.m75936x14adae67(4);
            if (c19786x6a1e2862 == null) {
                c19786x6a1e2862 = rnVar.f217349m;
            }
        } else {
            c19786x6a1e2862 = y94Var != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) y94Var.m75936x14adae67(4) : null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo eoVar = this.f217581f;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo.S6(eoVar, rnVar)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo.Q6(eoVar, rnVar);
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo.R6(eoVar, rnVar)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo.P6(eoVar, rnVar);
            return;
        }
        js4.i iVar = (js4.i) gm0.j1.s(js4.i.class);
        android.app.Activity m80379x76847179 = eoVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x76847179;
        js4.q qVar = new js4.q();
        qVar.f383089a = rnVar.f217343d.m75939xb282bd08(1);
        qVar.f383090b = y94Var != null ? y94Var.m75942xfb822ef2(2) : 0L;
        qVar.f383091c = rnVar.f217345f;
        qVar.f383092d = rnVar.f217346g;
        qVar.f383093e = c19786x6a1e2862;
        qVar.f383094f = rnVar.f217350n;
        qVar.f383095g = y94Var != null ? y94Var.m75939xb282bd08(0) : 0;
        qVar.f383096h = y94Var != null ? y94Var.m75945x2fec8307(1) : null;
        if (y94Var == null || (str = y94Var.m75945x2fec8307(3)) == null) {
            str = "";
        }
        qVar.f383097i = str;
        ((ms4.z) iVar).g(abstractActivityC21394xb3d2c0cf, qVar, new java.lang.ref.WeakReference(eoVar));
    }
}
