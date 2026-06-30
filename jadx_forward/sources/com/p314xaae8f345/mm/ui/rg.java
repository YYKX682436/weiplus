package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class rg extends com.p314xaae8f345.mm.ui.p2740x696c9db.fd implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f291268x = {2, 1, 10, 20};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f291269y = {2, 1, 10};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f291270z = {2, 1, 10};

    /* renamed from: q, reason: collision with root package name */
    public final android.view.LayoutInflater f291271q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.mg f291272r;

    /* renamed from: s, reason: collision with root package name */
    public android.util.SparseArray f291273s;

    /* renamed from: t, reason: collision with root package name */
    public final android.content.Context f291274t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.C21410x67d80e90 f291275u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.gg f291276v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f291277w;

    public rg(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e90) {
        super(activityC0065xcd7aa112);
        this.f291276v = null;
        this.f291274t = activityC0065xcd7aa112;
        this.f291275u = c21410x67d80e90;
        this.f291271q = android.view.LayoutInflater.from(activityC0065xcd7aa112);
        this.f291963n = false;
        this.f291964o = com.p314xaae8f345.mm.R.C30868x68b1db1.f575683fi;
        if (com.p314xaae8f345.mm.ui.gg.f290225h == null) {
            com.p314xaae8f345.mm.ui.gg.f290225h = new com.p314xaae8f345.mm.ui.gg();
        }
        this.f291276v = com.p314xaae8f345.mm.ui.gg.f290225h;
    }

    public static com.p314xaae8f345.mm.ui.pg f(int i17) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (i17 == 22) {
            ((java.lang.Integer) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        } else if (i17 != 24) {
            if (i17 == 2147483646) {
                return new com.p314xaae8f345.mm.ui.pg(2147483646, "TIT", "", com.p314xaae8f345.mm.R.raw.f80772x7998b0bf, 0);
            }
            switch (i17) {
                case 1:
                    return com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278271a0.booleanValue() ? new com.p314xaae8f345.mm.ui.pg(1, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gum), "", com.p314xaae8f345.mm.R.raw.f80769xb0c5547c, com.p314xaae8f345.mm.R.C30859x5a72f63.aaq) : new com.p314xaae8f345.mm.ui.pg(1, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gum), "", com.p314xaae8f345.mm.R.raw.f80770x68220200, 0);
                case 2:
                    return com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278272b0.booleanValue() ? new com.p314xaae8f345.mm.ui.pg(2, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.guq), "", com.p314xaae8f345.mm.R.raw.f80776x1b40bb3, com.p314xaae8f345.mm.R.C30859x5a72f63.aaq) : new com.p314xaae8f345.mm.ui.pg(2, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.guq), "", com.p314xaae8f345.mm.R.raw.f80777x635c2e77, 0);
                case 3:
                    return new com.p314xaae8f345.mm.ui.pg(3, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gus), "", com.p314xaae8f345.mm.R.raw.f78737xae79c325, 0);
                case 4:
                    return 1 == com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VOIPCallType"), 0) ? new com.p314xaae8f345.mm.ui.pg(4, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.guv), "", com.p314xaae8f345.mm.R.raw.f80786x1e6d3826, 0) : new com.p314xaae8f345.mm.ui.pg(4, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gun), "", com.p314xaae8f345.mm.R.raw.f80771xdb3511ab, 0);
                case 5:
                    return new com.p314xaae8f345.mm.ui.pg(5, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.itn), "", com.p314xaae8f345.mm.R.raw.f80782x851df2b7, 0);
                case 6:
                    return new com.p314xaae8f345.mm.ui.pg(6, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iss), "", com.p314xaae8f345.mm.R.raw.f80774x2d04bc38, 0);
                case 7:
                    return new com.p314xaae8f345.mm.ui.pg(7, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.isu), "", com.p314xaae8f345.mm.R.raw.f80772x7998b0bf, 0);
                case 8:
                    return new com.p314xaae8f345.mm.ui.pg(8, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.byb), "", com.p314xaae8f345.mm.R.raw.f80773x13ec9615, 0);
                case 9:
                    return new com.p314xaae8f345.mm.ui.pg(9, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.its), "", com.p314xaae8f345.mm.R.raw.f80780x5cb5e255, 0);
                case 10:
                    return new com.p314xaae8f345.mm.ui.pg(10, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cfs), "", com.p314xaae8f345.mm.R.raw.f80783x9bacc541, 0);
                case 11:
                    return new com.p314xaae8f345.mm.ui.pg(11, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j_b), "", com.p314xaae8f345.mm.R.raw.f80779x51b53e0f, 0);
                case 12:
                    return new com.p314xaae8f345.mm.ui.pg(12, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fow), "", com.p314xaae8f345.mm.R.raw.f80775x434b1628, 0);
                case 13:
                    return new com.p314xaae8f345.mm.ui.pg(13, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j39), "", com.p314xaae8f345.mm.R.raw.f80785xa1fddc7b, 0);
                case 14:
                    return new com.p314xaae8f345.mm.ui.pg(14, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h6j), "", com.p314xaae8f345.mm.R.raw.f80781x3cb30cf0, 0);
                default:
                    switch (i17) {
                        case 16:
                            return new com.p314xaae8f345.mm.ui.pg(16, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ior), "", com.p314xaae8f345.mm.R.raw.f80787xc4177007, 0);
                        case 17:
                            return new com.p314xaae8f345.mm.ui.pg(17, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gt9), "", com.p314xaae8f345.mm.R.raw.f80778x68ef7727, 0);
                        case 18:
                            return new com.p314xaae8f345.mm.ui.pg(18, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cfu), "", com.p314xaae8f345.mm.R.raw.f80784xdca9987b, 0);
                        case 19:
                            return new com.p314xaae8f345.mm.ui.pg(19, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cfx), "", com.p314xaae8f345.mm.R.raw.f78347x264ea0db, 0);
                        case 20:
                            if (((java.lang.Integer) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue() <= 1) {
                                return new com.p314xaae8f345.mm.ui.pg(20, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571465fv), "", com.p314xaae8f345.mm.R.raw.f80946xb40669b9, 0, "plus_receiveorpay");
                            }
                        default:
                            return null;
                    }
            }
        } else if (((java.lang.Integer) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue() == 8) {
            return new com.p314xaae8f345.mm.ui.pg(24, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hkz), "", com.p314xaae8f345.mm.R.raw.f80946xb40669b9, 0);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.fd
    public android.widget.BaseAdapter b() {
        if (this.f291272r == null) {
            this.f291272r = new com.p314xaae8f345.mm.ui.mg(this, null);
        }
        return this.f291272r;
    }

    public final void e(boolean z17) {
        qg0.b0 b0Var = (qg0.b0) i95.n0.c(qg0.b0.class);
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        ((pg0.a3) b0Var).getClass();
        gm0.j1.n().f354821b.g(new ot4.b(intValue));
        this.f291277w = z17;
    }

    public final boolean g() {
        java.lang.String n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n0(this.f291274t);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n07) || !n07.equals("LauncherUI")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusSubMenuHelper", "LauncherUI is not on ActivityTask Top：%s", n07);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusSubMenuHelper", "LauncherUI is on ActivityTask Top ");
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x00b2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x075e  */
    @Override // android.widget.AdapterView.OnItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onItemClick(android.widget.AdapterView r18, android.view.View r19, int r20, long r21) {
        /*
            Method dump skipped, instructions count: 2006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.rg.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusSubMenuHelper", "on Scene End：errType %s , errCode：%s，errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var.mo808xfb85f7b0() == 2540) {
            android.content.Context context = this.f291274t;
            if (i17 == 0 && i18 == 0) {
                r45.o65 o65Var = (r45.o65) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a;
                if (o65Var.f463519d == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusSubMenuHelper", "NetScenePayIBGQuickGetOverseaWallet on SceneEnd ok，pay_wallet_wxapp_h5_url：%s, cache_time：%s", o65Var.f463521f, java.lang.Integer.valueOf(o65Var.f463522g));
                    if (!this.f291277w && g() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o65Var.f463521f)) {
                        if (o65Var.f463521f.equals("wxpay://bizmall/hk_offlinepay")) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusSubMenuHelper", "goto native hk offlinepay");
                            ((h45.q) i95.n0.c(h45.q.class)).mo24804x3b8ef1e3(context, 2);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusSubMenuHelper", "on Scene End jump h5 ");
                            qg0.h0.fe(context, o65Var.f463521f, false);
                        }
                    }
                    long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
                    o65Var.f463523h = currentTimeMillis;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusSubMenuHelper", "on Scene End currentTime ：%s ", java.lang.Long.valueOf(currentTimeMillis));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusSubMenuHelper", "OfflineH5 setConfig");
                    try {
                        str2 = new java.lang.String(o65Var.mo14344x5f01b1f6(), com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a);
                    } catch (java.io.IOException e17) {
                        e = e17;
                        str2 = " ";
                    }
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusSubMenuHelper", "OfflineH5 setConfig success");
                    } catch (java.io.IOException e18) {
                        e = e18;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PlusSubMenuHelper", "save config exp, " + e.getLocalizedMessage());
                        qg0.b0 b0Var = (qg0.b0) i95.n0.c(qg0.b0.class);
                        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_HK_WALLET_ADD_CONFIG_STRING_SYNC;
                        ((pg0.a3) b0Var).getClass();
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(u3Var, str2);
                        ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).getClass();
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().g(true);
                        gm0.j1.d().q(2540, this);
                    }
                    qg0.b0 b0Var2 = (qg0.b0) i95.n0.c(qg0.b0.class);
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_HK_WALLET_ADD_CONFIG_STRING_SYNC;
                    ((pg0.a3) b0Var2).getClass();
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(u3Var2, str2);
                    ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).getClass();
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().g(true);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusSubMenuHelper", "NetScenePayIBGQuickGetOverseaWallet on SceneEnd failed show dialog ");
                    if (!this.f291277w && g()) {
                        db5.e1.E(context, o65Var.f463520e, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), false, new com.p314xaae8f345.mm.ui.kg(this));
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusSubMenuHelper", "NetScenePayIBGQuickGetOverseaWallet on SceneEnd faile show error dialog ");
                if (!this.f291277w && g()) {
                    db5.e1.E(context, str, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), false, new com.p314xaae8f345.mm.ui.lg(this));
                }
            }
            gm0.j1.d().q(2540, this);
        }
    }
}
