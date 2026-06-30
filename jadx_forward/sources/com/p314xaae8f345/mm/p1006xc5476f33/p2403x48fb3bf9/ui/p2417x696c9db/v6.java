package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class v6 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f268496a;

    public v6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var) {
        this.f268496a = c6Var;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        if (i18 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewMenuHelper", "do del cancel");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = this.f268496a;
        bundle.putLong("fav_local_id", c6Var.b().getLongExtra("fav_local_id", -1L));
        try {
            if (!c6Var.c().L1.A.uf(bundle)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewMenuHelper", "try to del web url fail");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewMenuHelper", "del fav web url ok, finish webview ui");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.b6 b6Var = c6Var.c().f265368m2;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.p5 p5Var = b6Var.f264340j;
            if (p5Var != null) {
                try {
                    p5Var.a("mm_del_fav", bool);
                } catch (java.lang.Exception unused) {
                }
            }
            c6Var.c().finish();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewMenuHelper", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewMenuHelper", "try to del web url crash");
        }
    }
}
