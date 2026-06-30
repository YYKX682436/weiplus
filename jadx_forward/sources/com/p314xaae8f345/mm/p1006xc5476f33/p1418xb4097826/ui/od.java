package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class od implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sd f211133d;

    public od(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sd sdVar) {
        this.f211133d = sdVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sd sdVar = this.f211133d;
        switch (itemId) {
            case 4000:
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sd.a(sdVar, false);
                return;
            case 4001:
                if (hz2.d.f367846a.a("personalInfo")) {
                    return;
                }
                sdVar.getClass();
                boolean l17 = gm0.j1.u().l();
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = sdVar.f211336a;
                if (!l17) {
                    db5.t7.k(abstractActivityC21394xb3d2c0cf, null);
                    return;
                } else {
                    ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.e(abstractActivityC21394xb3d2c0cf, 2001, 1, 5, null);
                    return;
                }
            case 4002:
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sd.a(sdVar, true);
                return;
            case com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7529x7d0fa359 /* 4003 */:
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(sdVar.f211336a);
                u1Var.g(sdVar.f211336a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cnt));
                u1Var.a(true);
                u1Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.md(sdVar));
                u1Var.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.nd.f211082d);
                u1Var.q(false);
                return;
            default:
                return;
        }
    }
}
