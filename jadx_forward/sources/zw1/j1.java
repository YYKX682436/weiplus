package zw1;

/* loaded from: classes15.dex */
public class j1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.k1 f558206d;

    public j1(zw1.k1 k1Var) {
        this.f558206d = k1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        zw1.k1 k1Var = this.f558206d;
        if (itemId == 1) {
            if (tw1.f.Di().Ri()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7 = k1Var.f558220e;
                activityC13144xce1cfbb7.f177947y0 &= -32769;
                gm0.j1.i();
                gm0.j1.u().c().w(147457, java.lang.Long.valueOf(activityC13144xce1cfbb7.f177947y0));
                r45.no4 no4Var = new r45.no4();
                no4Var.f463092d = 2;
                ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(209, no4Var));
                tw1.f.Di().wi();
                dp.a.m125853x26a183b(k1Var.f558220e.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.b_2, 1).show();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13944, 8);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb72 = k1Var.f558220e;
            activityC13144xce1cfbb72.f177947y0 |= 32768;
            gm0.j1.i();
            gm0.j1.u().c().w(147457, java.lang.Long.valueOf(activityC13144xce1cfbb72.f177947y0));
            r45.no4 no4Var2 = new r45.no4();
            no4Var2.f463092d = 1;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(209, no4Var2));
            tw1.f.Di().Ai();
            dp.a.m125853x26a183b(k1Var.f558220e.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.b_d, 1).show();
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.d().k(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13944, 7);
            return;
        }
        int itemId2 = (menuItem.getItemId() - 1) - 1;
        if (itemId2 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CollectMainUI", "illegal pos: %s", java.lang.Integer.valueOf(itemId2));
            return;
        }
        r45.uk4 uk4Var = (r45.uk4) k1Var.f558219d.get(itemId2);
        int i18 = uk4Var.f468964d;
        if (i18 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CollectMainUI", "wrong native type: %s", uk4Var.f468966f);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14526, 2, 1, uk4Var.f468965e, "", "", "", 2);
            return;
        }
        if (i18 == 2) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uk4Var.f468966f)) {
                return;
            }
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(k1Var.f558220e.mo55332x76847179(), uk4Var.f468966f, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14526, 2, 2, uk4Var.f468965e, "", "", uk4Var.f468966f, 2);
            return;
        }
        if (i18 == 3) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
            java.lang.String str = uk4Var.f468967g;
            am.nx nxVar = c6113xa3727625.f136390g;
            nxVar.f88999a = str;
            java.lang.String str2 = uk4Var.f468968h;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            nxVar.f89000b = str2;
            nxVar.f89002d = 1072;
            nxVar.f89001c = 0;
            c6113xa3727625.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14526, 2, 3, uk4Var.f468965e, uk4Var.f468967g, uk4Var.f468968h, "", 2);
        }
    }
}
