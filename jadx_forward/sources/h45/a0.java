package h45;

/* loaded from: classes9.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f360466a = "";

    public static void a(com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19761xc2874b62.S)) {
            java.lang.String str = c19761xc2874b62.P;
            if (str == null) {
                str = "";
            }
            c19761xc2874b62.S = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletManager", "fillInitInfo fallback initRawUrl from rawUrl: %s", str);
        }
        if (c19761xc2874b62.T == 0) {
            long a17 = c01.id.a() / 1000;
            c19761xc2874b62.T = a17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletManager", "fillInitInfo fallback initTimestamp to now: %d", java.lang.Long.valueOf(a17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletManager", "fillInitInfo final: initTimestamp=%d, initRawUrl=%s", java.lang.Long.valueOf(c19761xc2874b62.T), c19761xc2874b62.S);
    }

    public static boolean b(android.content.Context context, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_scene_balance_manager", i17);
        if (c01.z1.I()) {
            j45.l.j(context, "wallet_payu", ".balance.ui.WalletPayUBalanceManagerUI", intent, null);
            return true;
        }
        if (((h45.q) i95.n0.c(h45.q.class)).mo24838x4e268286(context)) {
            return true;
        }
        j45.l.j(context, "wallet", ".balance.ui.WalletBalanceManagerUI", intent, null);
        return true;
    }

    public static boolean c(android.content.Context context, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_req_bind_scene", 5);
        intent.putExtra("key_offline_add_fee", i17);
        j45.l.j(context, "wallet", ".bind.ui.WalletBindUI", intent, null);
        return true;
    }

    public static boolean d(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62, int i17, com.p314xaae8f345.mm.ui.da daVar) {
        if (c19761xc2874b62 == null) {
            return false;
        }
        a(c19761xc2874b62);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("WalletJsapiData", c19761xc2874b62);
        intent.putExtra("requestCode", i17);
        if (daVar != null) {
            abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(daVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletManager", "startJsapiPay MMActivity %s from %s", abstractActivityC21394xb3d2c0cf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        j45.l.o(abstractActivityC21394xb3d2c0cf, "wallet_index", ".ui.WalletBrandUI", intent, i17, false);
        return true;
    }

    public static boolean e(android.content.Context context, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletManager", " walletMallV2 switch is ：%s", java.lang.Boolean.TRUE);
        android.content.Intent intent = new android.content.Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        j45.l.j(context, "mall", ".ui.MallIndexUIv2", intent, null);
        return true;
    }

    public static boolean f(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56, int i17) {
        g(context, false, "", c19760x34448d56, null, new android.content.Intent(), i17);
        return true;
    }

    public static boolean g(android.content.Context context, boolean z17, java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56, java.lang.String str2, android.content.Intent intent, int i17) {
        int i18 = c19760x34448d56.f273642e;
        if (2 == i18 || 1 == i18 || 4 == i18 || 36 == i18) {
            c19760x34448d56.f273645h = false;
        } else {
            c19760x34448d56.f273645h = true;
        }
        if (i18 == 4 || i18 == 1 || 36 == i18 || 8 == i18) {
            c19760x34448d56.f273646i = true;
        } else {
            c19760x34448d56.f273646i = false;
        }
        c19760x34448d56.Q = str2;
        intent.putExtra("key_pay_info", c19760x34448d56);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        intent.putExtra("key_force_use_bind_serail", str);
        intent.putExtra("key_is_force_use_given_card", z17);
        if (context instanceof android.app.Activity) {
            intent.putExtra("key_context_hashcode", context.hashCode());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletManager", "startPay context %s %s", context, java.lang.Integer.valueOf(context.hashCode()));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("")) {
            intent.putExtra("key_is_use_default_card", "");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletManager", "startPay context %s from %s", context, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        intent.putExtra("key_receiver_true_name", str2);
        if (c01.z1.I()) {
            j45.l.n(context, "wallet_payu", ".pay.ui.WalletPayUPayUI", intent, i17);
        } else {
            j45.l.n(context, "wallet", ".pay.ui.WalletPayUI", intent, i17);
        }
        return true;
    }

    public static boolean h(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, java.lang.String str, java.util.Map map, int i17, com.p314xaae8f345.mm.ui.da daVar) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62();
        c19761xc2874b62.A = 4;
        c19761xc2874b62.W = str;
        c19761xc2874b62.V = map;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("WalletJsapiData", c19761xc2874b62);
        intent.putExtra("requestCode", i17);
        if (daVar != null) {
            abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(daVar);
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletManager", "startPayComponent context %s from %s", abstractActivityC21394xb3d2c0cf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        j45.l.o(abstractActivityC21394xb3d2c0cf, "wallet_index", ".ui.WalletBrandUI", intent, i17, false);
        return true;
    }

    public static boolean i(android.content.Context context, int i17, java.lang.String str, int i18, nr4.a aVar) {
        j(context, i17, str, i18, aVar, null);
        return true;
    }

    public static boolean j(android.content.Context context, int i17, java.lang.String str, int i18, nr4.a aVar, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
        intent.putExtra("receiver_name", str);
        if (i18 > 0) {
            intent.putExtra("pay_channel", i18);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        nr4.a.e(aVar, intent);
        if (c01.z1.I()) {
            j45.l.j(context, "wallet_payu", ".remittance.ui.PayURemittanceAdapterUI", intent, null);
        } else if (c01.z1.z()) {
            j45.l.j(context, "remittance", ".ui.RemittanceAdapterUI", intent, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.d(12097, 12, 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            g0Var.d(11850, 7, 1);
        } else {
            j45.l.j(context, "remittance", ".ui.RemittanceAdapterUI", intent, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.d(12097, 12, 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            g0Var2.d(11850, 3, 1);
        }
        return true;
    }

    public static void k(android.content.Context context, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_from_scene", i17);
        j45.l.j(context, "collect", ".ui.CollectAdapterUI", intent, null);
    }
}
