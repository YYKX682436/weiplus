package dt;

/* loaded from: classes11.dex */
public class j4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public j4() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10 c5691xc916fb10 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10) abstractC20979x809547d1;
        com.p314xaae8f345.mm.app.w7 w7Var = com.p314xaae8f345.mm.app.w7.f135429f;
        if (c5691xc916fb10.f136017g.f88369a != 2) {
            com.p314xaae8f345.mm.p2829xfa87f9de.s0.b("com.tencent.mm.intent.ACTION_TOOLS_REMOVE_COOKIE");
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("__webView_ad").W("AdWUID");
                com.p314xaae8f345.p3210x3857dc.a3.c(true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "clearAllWebViewCache");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "clear cookie failed : %s", e17);
            }
        }
        if (gm0.j1.a()) {
            int i17 = c5691xc916fb10.f136017g.f88369a;
            boolean z17 = i17 == 3;
            boolean z18 = i17 == 1;
            if (z17) {
                c01.b9.f118602c.d("login_user_name", "");
                gm0.m.u();
            } else {
                if (z18) {
                    gm0.m.u();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", false).commit();
                }
                c01.b9.f118602c.c((java.lang.String) c01.d9.b().p().l(6, null), c01.d9.b().p().q(9, 0), (java.lang.String) c01.d9.b().p().l(5, null));
            }
        }
        return false;
    }
}
