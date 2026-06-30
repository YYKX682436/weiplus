package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f230023d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 f230024e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e f230025f;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e activityC16480xce80140e, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184) {
        this.f230025f = activityC16480xce80140e;
        this.f230024e = c6243x5c461184;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e activityC16480xce80140e = this.f230025f;
        if (activityC16480xce80140e.isFinishing() || activityC16480xce80140e.m83112xd8fa2fcd() || activityC16480xce80140e.isDestroyed()) {
            return;
        }
        boolean z17 = activityC16480xce80140e.f229825y.f88827c;
        if (activityC16480xce80140e.f229824x || activityC16480xce80140e.mo55332x76847179().isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicorMsg.MallIndexUIv2", "error for callback ac finish");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184 = this.f230024e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "after get userInfo, isFromCgiEnd: %s, hasCallback: %s", java.lang.Boolean.valueOf(c6243x5c461184.f136492h.f88844t), java.lang.Boolean.valueOf(this.f230023d));
        am.m10 m10Var = c6243x5c461184.f136492h;
        activityC16480xce80140e.f229825y = m10Var;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = m10Var.f88845u;
        if ((m1Var != null) & (m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o)) {
            com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o oVar = (com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o) m1Var;
            if (oVar.m83018x5c64639d()) {
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 m83012xc93a1ec9 = oVar.m83012xc93a1ec9();
                m83012xc93a1ec9.a();
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o0 o0Var = m83012xc93a1ec9.f295500f;
                if (!m83012xc93a1ec9.f295496b && m83012xc93a1ec9.f295495a == 2 && o0Var.f295488a == 1) {
                    activityC16480xce80140e.G = false;
                    activityC16480xce80140e.T.mo48813x58998cd();
                    r45.yt5 yt5Var = new r45.yt5();
                    yt5Var.f472887d = 1;
                    yt5Var.f472888e = o0Var.f295489b;
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                    try {
                        m27539xaf65a0fc.mo27555xc6c7e3f0("route_info", yt5Var.mo14344x5f01b1f6());
                        ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("commonRoute", m27539xaf65a0fc, new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.r1(this));
                    } catch (java.io.IOException e17) {
                        throw new java.lang.RuntimeException(e17);
                    }
                } else {
                    m83012xc93a1ec9.g(activityC16480xce80140e, new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.s1(this));
                }
            }
        }
        am.m10 m10Var2 = activityC16480xce80140e.f229825y;
        if (m10Var2.f88828d == 0) {
            if (m10Var2.f88844t) {
                activityC16480xce80140e.m7();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "showGetNewWalletTip call");
            am.m10 m10Var3 = activityC16480xce80140e.f229825y;
            if (m10Var3 == null || !(m10Var3.f88826b || m10Var3.f88829e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicorMsg.MallIndexUIv2", "user is not reg or simplereg，should not show this dialog");
            } else {
                boolean e18 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p().e();
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN;
                java.lang.Object m17 = c17.m(u3Var, java.lang.Boolean.FALSE);
                boolean booleanValue = m17 != null ? ((java.lang.Boolean) m17).booleanValue() : false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "showGetNewWalletTip hadShow=" + booleanValue + ";isswc=" + e18);
                if (!booleanValue && e18) {
                    gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x4.b(activityC16480xce80140e);
                }
            }
            if (!this.f230023d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "query wechat wallet");
                ef3.q.a(null, false, false, 0);
            }
            am.m10 m10Var4 = activityC16480xce80140e.f229825y;
            if (activityC16480xce80140e.W) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "isDoRealname bye bye");
            } else if ("1".equals(m10Var4.f88831g)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "need realname verify");
            } else if ("2".equals(m10Var4.f88831g)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "need upload credit");
                activityC16480xce80140e.W = true;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m10Var4.f88848x)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x4.c(activityC16480xce80140e, m10Var4.f88839o, m10Var4.f88838n, m10Var4.f88840p, m10Var4.f88832h, m10Var4.f88833i, m10Var4.f88834j, m10Var4.f88837m, m10Var4.f88836l, m10Var4.f88835k);
                } else {
                    activityC16480xce80140e.q7(m10Var4.f88848x);
                }
            } else if ("3".equals(m10Var4.f88831g)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "need increase the balance amount");
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43.a();
                if (a17 != null && activityC16480xce80140e.F == null && !activityC16480xce80140e.E) {
                    android.app.Dialog a18 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x4.a(activityC16480xce80140e, a17, 0);
                    activityC16480xce80140e.F = a18;
                    a18.setOnDismissListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.q1(activityC16480xce80140e));
                    activityC16480xce80140e.E = true;
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "realnameGuideFlag =  " + m10Var4.f88831g);
            }
            activityC16480xce80140e.W6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "after get userInfo, isShowLqb: %s, isOpenLqb: %s, lqbOpenUrl: %s", java.lang.Integer.valueOf(activityC16480xce80140e.f229825y.f88841q), java.lang.Boolean.valueOf(activityC16480xce80140e.f229825y.f88842r), activityC16480xce80140e.f229825y.f88843s);
            am.m10 m10Var5 = activityC16480xce80140e.f229825y;
            int i17 = m10Var5.f88841q;
            java.lang.String str = m10Var5.f88843s;
            gm0.j1.i();
            int intValue = ((java.lang.Integer) gm0.j1.u().c().l(196660, 0)).intValue();
            gm0.j1.i();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig2 " + intValue + "balanceShow:" + ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BALANCE_SHOW_INT, 0)).intValue());
            com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.u1 u1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.u1(activityC16480xce80140e);
            boolean z18 = (2097152 & intValue) > 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "isShowProtocol, ret = %s switchBit %s", java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(intValue));
            activityC16480xce80140e.A.d(u1Var, z18);
        }
        if (m10Var.f88844t && this.f230023d) {
            activityC16480xce80140e.M = activityC16480xce80140e.f229825y.f88846v;
            activityC16480xce80140e.n7();
        }
        am.m10 m10Var6 = activityC16480xce80140e.f229825y;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var2 = m10Var6.f88845u;
        if ((m1Var2 instanceof ss4.e0) & (m1Var2 != null)) {
            activityC16480xce80140e.q7(m10Var6.f88847w);
        }
        this.f230023d = true;
    }
}
