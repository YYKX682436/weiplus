package ef3;

/* loaded from: classes9.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f333959a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f333960b = new java.util.ArrayList();

    public static void a(ef3.p pVar, boolean z17, boolean z18, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QueryWeChatWalletManager", "do query wechat wallet: %s", java.lang.Boolean.valueOf(z17));
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.QueryWeChatWalletManager", "account not ready");
            return;
        }
        r45.wh5 wh5Var = new r45.wh5();
        java.lang.String str = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_RESP_CACHE_STRING_SYNC, null);
        boolean z19 = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                wh5Var.mo11468x92b714fd(str.getBytes(s46.a.f484534a));
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.QueryWeChatWalletManager", e17, "", new java.lang.Object[0]);
            }
        }
        if (z18) {
            if (pVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallWalletUI", "cache callback");
                com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16483x6e20aea1 activityC16483x6e20aea1 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.t2) pVar).f230026a;
                android.app.Dialog dialog = activityC16483x6e20aea1.f229854m;
                if (dialog != null) {
                    dialog.dismiss();
                    activityC16483x6e20aea1.f229854m = null;
                }
                activityC16483x6e20aea1.f229852h = wh5Var.f470698d;
                activityC16483x6e20aea1.V6(true);
            }
            z19 = true;
        }
        if ((!z18 || z19) && !z17) {
            return;
        }
        if (pVar != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) f333960b;
            if (!arrayList.contains(pVar)) {
                arrayList.add(pVar);
            }
        }
        if (f333959a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QueryWeChatWalletManager", "is quering");
        } else {
            f333959a = true;
            ef3.m mVar = new ef3.m(i17, wh5Var);
            java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new c01.ra(new com.p314xaae8f345.mm.p2802xd031a825.ui.g1("wallet_balance_version", mVar), null));
        }
        if (z19 || z17) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(997, 1);
    }
}
