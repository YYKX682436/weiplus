package zw1;

/* loaded from: classes15.dex */
public class w3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.x3 f558370d;

    public w3(zw1.x3 x3Var) {
        this.f558370d = x3Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        zw1.x3 x3Var = this.f558370d;
        if (itemId != 1) {
            int itemId2 = (menuItem.getItemId() - 1) - 1;
            if (itemId2 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletCollectQrCodeUI", "illegal pos: %s", java.lang.Integer.valueOf(itemId2));
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.d(25983, 10, java.lang.Integer.valueOf(x3Var.f558377a));
            r45.uk4 uk4Var = (r45.uk4) x3Var.f558378b.get(itemId2);
            int i18 = uk4Var.f468964d;
            if (i18 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletCollectQrCodeUI", "wrong native type: %s", uk4Var.f468966f);
                g0Var.d(14526, 2, 1, uk4Var.f468965e, "", "", "", 2);
                return;
            }
            if (i18 == 2) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uk4Var.f468966f)) {
                    return;
                }
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(x3Var.f558379c.mo55332x76847179(), uk4Var.f468966f, false);
                g0Var.d(14526, 2, 2, uk4Var.f468965e, "", "", uk4Var.f468966f, 2);
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
                g0Var.d(14526, 2, 3, uk4Var.f468965e, uk4Var.f468967g, uk4Var.f468968h, "", 2);
                return;
            }
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3.W6(x3Var.f558379c, x3Var.f558377a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = x3Var.f558379c;
            int i19 = x3Var.f558377a;
            if (i19 == 0) {
                i19 = activityC13149x63b02cb3.f177968d;
            }
            if (i19 != 1) {
                activityC13149x63b02cb3.getClass();
                if (i19 != 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
                } else {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_F2F_RING_TONE_MCH_STRING, "in.caf");
                    ww1.a3 a3Var = activityC13149x63b02cb3.f177970f;
                    pq5.g l17 = new ww1.q(3, a3Var.T ? a3Var.U : 0L).l();
                    l17.f(activityC13149x63b02cb3);
                    l17.h(new zw1.a4(activityC13149x63b02cb3));
                }
            } else {
                activityC13149x63b02cb3.f177987z &= -32769;
                gm0.j1.i();
                gm0.j1.u().c().w(147457, java.lang.Long.valueOf(activityC13149x63b02cb3.f177987z));
                r45.no4 no4Var = new r45.no4();
                no4Var.f463092d = 2;
                ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(209, no4Var));
                tw1.f.Di().wi();
            }
            dp.a.m125853x26a183b(x3Var.f558379c.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.b_2, 1).show();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.d(13944, 8);
            g0Var2.d(25983, 9, java.lang.Integer.valueOf(x3Var.f558377a));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb32 = x3Var.f558379c;
        int i27 = x3Var.f558377a;
        if (i27 == 0) {
            i27 = activityC13149x63b02cb32.f177968d;
        }
        if (i27 != 1) {
            activityC13149x63b02cb32.getClass();
            if (i27 != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
            } else {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_F2F_RING_TONE_MCH_STRING, "cash.caf");
                ww1.a3 a3Var2 = activityC13149x63b02cb32.f177970f;
                pq5.g l18 = new ww1.q(2, a3Var2.T ? a3Var2.U : 0L).l();
                l18.f(activityC13149x63b02cb32);
                l18.h(new zw1.z3(activityC13149x63b02cb32));
            }
        } else {
            activityC13149x63b02cb32.f177987z |= 32768;
            gm0.j1.i();
            gm0.j1.u().c().w(147457, java.lang.Long.valueOf(activityC13149x63b02cb32.f177987z));
            r45.no4 no4Var2 = new r45.no4();
            no4Var2.f463092d = 1;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(209, no4Var2));
            tw1.f.Di().Ai();
        }
        dp.a.m125853x26a183b(x3Var.f558379c.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.b_d, 1).show();
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.d().k(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var3.d(13944, 7);
        g0Var3.d(25983, 8, java.lang.Integer.valueOf(x3Var.f558377a));
    }
}
