package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class h70 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u70 f200084d;

    public h70(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u70 u70Var) {
        this.f200084d = u70Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        ya2.b2 b17;
        java.lang.String str2;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u70 u70Var = this.f200084d;
        if (itemId == 1) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = u70Var.N6();
            if (N6 != null) {
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                ae2.in inVar = ae2.in.f85221a;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.O6).mo141623x754a37bb()).r()).intValue() == 0) {
                    str = lp0.b.K();
                } else {
                    ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                    str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183676l;
                }
                java.lang.String str3 = "microMsg." + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
                ((ub0.r) oVar).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.l(N6, str, str3, 10011);
            }
            u70Var.g7(ml2.x3.f409756f);
            return;
        }
        if (itemId == 2) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N62 = u70Var.N6();
            if (N62 != null) {
                ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.c(N62, 10010, 1, 28, 1, false, null);
            }
            u70Var.g7(ml2.x3.f409757g);
            return;
        }
        if (itemId != 3 || (b17 = ya2.h.f542017a.b(xy2.c.e(u70Var.O6()))) == null || (str2 = b17.f69301x81118c51) == null) {
            return;
        }
        if (!(str2.length() > 0)) {
            str2 = null;
        }
        if (str2 != null) {
            ml2.x3 x3Var = ml2.x3.f409763p;
            u70Var.g7(x3Var);
            if (android.webkit.URLUtil.isNetworkUrl(str2)) {
                p3325xe03a0797.p3326xc267989b.l.d(u70Var.f201491q, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b70(str2, u70Var, null), 3, null);
            } else {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).bk(x3Var);
                u70Var.b7(str2);
            }
        }
    }
}
