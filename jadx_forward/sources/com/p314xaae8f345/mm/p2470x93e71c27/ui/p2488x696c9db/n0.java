package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public abstract class n0 {
    public static void a() {
        gm0.j1.u().c().w(69121, "");
    }

    public static boolean b(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppNewIconUtil", "markNew fail, appId is empty");
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppNewIconUtil", "markNew fail, cfgStg is null");
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.m0 m0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.m0(null);
        m0Var.a((java.lang.String) c17.l(69121, null));
        if (!((java.util.ArrayList) m0Var.f273302a).contains(str)) {
            ((java.util.ArrayList) m0Var.f273302a).add(str);
        }
        c17.w(69121, m0Var.b());
        return true;
    }

    public static boolean c(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppNewIconUtil", "unmarkNew fail, appId is empty");
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppNewIconUtil", "unmarkNew fail, cfgStg is null");
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.m0 m0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.m0(null);
        m0Var.a((java.lang.String) c17.l(69121, null));
        if (((java.util.ArrayList) m0Var.f273302a).contains(str)) {
            ((java.util.ArrayList) m0Var.f273302a).remove(str);
        }
        c17.w(69121, m0Var.b());
        return true;
    }
}
