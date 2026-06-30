package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f229920d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 f229921e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16479x8f884212 f229922f;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16479x8f884212 activityC16479x8f884212, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184) {
        this.f229922f = activityC16479x8f884212;
        this.f229921e = c6243x5c461184;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16479x8f884212 activityC16479x8f884212 = this.f229922f;
        if (activityC16479x8f884212.isFinishing() || activityC16479x8f884212.m83112xd8fa2fcd() || activityC16479x8f884212.isDestroyed()) {
            return;
        }
        boolean z17 = activityC16479x8f884212.f229818w.f88827c;
        if (activityC16479x8f884212.f229817v || activityC16479x8f884212.mo55332x76847179().isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicorMsg.MallIndexUI", "error for callback ac finish");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184 = this.f229921e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "after get userInfo, isFromCgiEnd: %s, hasCallback: %s", java.lang.Boolean.valueOf(c6243x5c461184.f136492h.f88844t), java.lang.Boolean.valueOf(this.f229920d));
        am.m10 m10Var = c6243x5c461184.f136492h;
        activityC16479x8f884212.f229818w = m10Var;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = m10Var.f88845u;
        if ((m1Var != null) & (m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o)) {
            com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o oVar = (com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o) m1Var;
            if (oVar.m83018x5c64639d()) {
                oVar.m83012xc93a1ec9().g(activityC16479x8f884212, new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.g1(this));
            }
        }
        am.m10 m10Var2 = activityC16479x8f884212.f229818w;
        if (m10Var2.f88828d == 0) {
            if (m10Var2.f88844t) {
                activityC16479x8f884212.j7();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "showGetNewWalletTip call");
            am.m10 m10Var3 = activityC16479x8f884212.f229818w;
            if (m10Var3 == null || !(m10Var3.f88826b || m10Var3.f88829e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicorMsg.MallIndexUI", "user is not reg or simplereg，should not show this dialog");
            } else {
                boolean e17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p().e();
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN;
                java.lang.Object m17 = c17.m(u3Var, java.lang.Boolean.FALSE);
                boolean booleanValue = m17 != null ? ((java.lang.Boolean) m17).booleanValue() : false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "showGetNewWalletTip hadShow=" + booleanValue + ";isswc=" + e17);
                if (!booleanValue && e17) {
                    gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x4.b(activityC16479x8f884212);
                }
            }
            if (!this.f229920d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "query wechat wallet");
                ef3.q.a(null, false, false, 0);
            }
            am.m10 m10Var4 = activityC16479x8f884212.f229818w;
            if (activityC16479x8f884212.L) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "isDoRealname bye bye");
            } else if ("1".equals(m10Var4.f88831g)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "need realname verify");
            } else if ("2".equals(m10Var4.f88831g)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "need upload credit");
                activityC16479x8f884212.L = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x4.c(activityC16479x8f884212, m10Var4.f88839o, m10Var4.f88838n, m10Var4.f88840p, m10Var4.f88832h, m10Var4.f88833i, m10Var4.f88834j, m10Var4.f88837m, m10Var4.f88836l, m10Var4.f88835k);
            } else if ("3".equals(m10Var4.f88831g)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "need increase the balance amount");
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43.a();
                if (a17 != null && activityC16479x8f884212.C == null && !activityC16479x8f884212.B) {
                    android.app.Dialog a18 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x4.a(activityC16479x8f884212, a17, 0);
                    activityC16479x8f884212.C = a18;
                    a18.setOnDismissListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.f1(activityC16479x8f884212));
                    activityC16479x8f884212.B = true;
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "realnameGuideFlag =  " + m10Var4.f88831g);
            }
            activityC16479x8f884212.U6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUI", "after get userInfo, isShowLqb: %s, isOpenLqb: %s, lqbOpenUrl: %s", java.lang.Integer.valueOf(activityC16479x8f884212.f229818w.f88841q), java.lang.Boolean.valueOf(activityC16479x8f884212.f229818w.f88842r), activityC16479x8f884212.f229818w.f88843s);
            am.m10 m10Var5 = activityC16479x8f884212.f229818w;
            int i17 = m10Var5.f88841q;
            java.lang.String str = m10Var5.f88843s;
            gm0.j1.i();
            int intValue = ((java.lang.Integer) gm0.j1.u().c().l(196660, 0)).intValue();
            gm0.j1.i();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig2 " + intValue + "balanceShow:" + ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BALANCE_SHOW_INT, 0)).intValue());
            com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.w0 w0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.w0(activityC16479x8f884212);
            boolean z18 = (2097152 & intValue) > 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "isShowProtocol, ret = %s switchBit %s", java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(intValue));
            activityC16479x8f884212.f229819x.d(w0Var, z18);
        }
        if (m10Var.f88844t && this.f229920d) {
            activityC16479x8f884212.k7();
        }
        this.f229920d = true;
    }
}
