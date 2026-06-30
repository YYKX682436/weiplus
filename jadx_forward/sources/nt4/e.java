package nt4;

/* loaded from: classes11.dex */
public class e implements com.p314xaae8f345.mm.p944x882e457a.u0, qg0.y {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f421352d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f421353e = false;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Dialog f421354f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.m1 f421355g;

    public final void a(boolean z17) {
        if (!z17 && this.f421354f == null) {
            android.content.Context context = this.f421352d;
            this.f421354f = db5.e1.O(context, null, 3, com.p314xaae8f345.mm.R.C30868x68b1db1.f575789i6, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new nt4.b(this));
        }
        gm0.j1.i();
        this.f421355g = new ot4.b(((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue());
        gm0.j1.d().g(this.f421355g);
        this.f421353e = z17;
    }

    public void b(android.content.Context context) {
        this.f421352d = context;
        this.f421354f = null;
        this.f421353e = false;
        this.f421355g = null;
        gm0.j1.d().a(2540, this);
        r45.o65 o65Var = new r45.o65();
        java.lang.String str = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_HK_WALLET_ADD_CONFIG_STRING_SYNC, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HKOfflineLogic", "OfflineH5 get PayIBGQuickGetOverseaWalletConfig failed");
        } else {
            try {
                o65Var.mo11468x92b714fd(str.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HKOfflineLogic", "OfflineH5 parse PayIBGQuickGetOverseaWalletConfig fail, " + e17.getLocalizedMessage());
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o65Var.f463521f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HKOfflineLogic", "hk OfflineH5 has no cache");
            a(false);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        long j17 = currentTimeMillis - o65Var.f463523h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HKOfflineLogic", "hk currentTime ：%s ,lastTime：%s,internalTime ：%s", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(o65Var.f463523h), java.lang.Long.valueOf(j17));
        if (j17 <= 0 || j17 >= o65Var.f463522g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HKOfflineLogic", "hk OfflineH5 is expired");
            a(false);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HKOfflineLogic", "hk OfflineH5 dont expired，url：%s", o65Var.f463521f);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o65Var.f463521f)) {
            if (o65Var.f463521f.equals("wxpay://bizmall/hk_offlinepay")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HKOfflineLogic", "goto native hk offlinepay");
                ((h45.q) i95.n0.c(h45.q.class)).mo24804x3b8ef1e3(this.f421352d, 2);
            } else {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.X(this.f421352d, o65Var.f463521f, false);
            }
        }
        a(true);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HKOfflineLogic", "on Scene End：errType %s , errCode：%s，errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.app.Dialog dialog = this.f421354f;
        if (dialog != null && dialog.isShowing()) {
            this.f421354f.dismiss();
            this.f421354f = null;
        }
        if ((m1Var instanceof ot4.b) && m1Var.equals(this.f421355g)) {
            if (i17 == 0 && i18 == 0) {
                r45.o65 o65Var = ((ot4.b) m1Var).f430403f;
                if (o65Var == null) {
                    o65Var = new r45.o65();
                }
                if (o65Var.f463519d == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HKOfflineLogic", "NetScenePayIBGQuickGetOverseaWallet on SceneEnd ok，pay_wallet_wxapp_h5_url：%s, cache_time：%s", o65Var.f463521f, java.lang.Integer.valueOf(o65Var.f463522g));
                    if (!this.f421353e && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o65Var.f463521f)) {
                        if (o65Var.f463521f.equals("wxpay://bizmall/hk_offlinepay")) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HKOfflineLogic", "goto native hk offlinepay");
                            ((h45.q) i95.n0.c(h45.q.class)).mo24804x3b8ef1e3(this.f421352d, 2);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HKOfflineLogic", "on Scene End jump h5 ");
                            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.X(this.f421352d, o65Var.f463521f, false);
                        }
                    }
                    o65Var.f463523h = java.lang.System.currentTimeMillis() / 1000;
                    try {
                        str2 = new java.lang.String(o65Var.mo14344x5f01b1f6(), java.nio.charset.StandardCharsets.ISO_8859_1);
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HKOfflineLogic", "save config exp, " + e17.getLocalizedMessage());
                        str2 = " ";
                    }
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_HK_WALLET_ADD_CONFIG_STRING_SYNC, str2);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HKOfflineLogic", "NetScenePayIBGQuickGetOverseaWallet on SceneEnd failed show dialog ");
                    if (!this.f421353e) {
                        java.lang.String n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n0(this.f421352d);
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n07) && n07.equals("LauncherUI")) {
                            android.content.Context context = this.f421352d;
                            db5.e1.E(context, o65Var.f463520e, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), false, new nt4.c(this));
                        }
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HKOfflineLogic", "NetScenePayIBGQuickGetOverseaWallet on SceneEnd faile show error dialog ");
                if (!this.f421353e) {
                    java.lang.String n08 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n0(this.f421352d);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n08) && n08.equals("LauncherUI")) {
                        android.content.Context context2 = this.f421352d;
                        db5.e1.E(context2, str, "", context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), false, new nt4.d(this));
                    }
                }
            }
        }
        gm0.j1.d().q(2540, this);
        this.f421355g = null;
    }
}
