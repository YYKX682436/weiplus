package h14;

/* loaded from: classes9.dex */
public class k0 implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        java.lang.String g17 = x51.j1.g(p0Var.f152259a.f459094h);
        if (g17 == null || g17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RedPointInfoListener", "onReceiveMsg, ShakeCardRedDotMsg msgContent is null");
            return;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
        if (d17 == null) {
            return;
        }
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.RedPoints.redPoint.path");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.RedPoints.redPoint.redPointId");
        if (str2 == null) {
            str2 = "";
        }
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str2, 0);
        java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.RedPoints.redPoint.mustClearInSameTime");
        if (str3 == null) {
            str3 = "";
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str3, 0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (str.equals("my_setting_privaty_recentOption")) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_RECENT_RED_DOT_ID_INT;
            if (((java.lang.Integer) c17.m(u3Var, 0)).intValue() >= D1) {
                return;
            }
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(D1));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MY_RED_DOT_WILL_SHOW_ID_INT, java.lang.Integer.valueOf(D1));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_RED_DOT_WILL_SHOW_ID_INT, java.lang.Integer.valueOf(D1));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PRIVATY_RED_DOT_WILL_SHOW_ID_INT, java.lang.Integer.valueOf(D1));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_RECENT_RED_DOT_WILL_SHOW_ID_INT, java.lang.Integer.valueOf(D1));
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().p(266260, true);
            return;
        }
        if (str.equals("my_setting_plugin_switch")) {
            java.lang.String str4 = (java.lang.String) d17.get(".sysmsg.RedPoints.redPoint.ext");
            if (str4 == null) {
                str4 = "";
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_PLUGIN_SWITCH_REDDOT_INT;
            if (((java.lang.Integer) c18.m(u3Var2, 0)).intValue() >= D1) {
                return;
            }
            gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(D1));
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c19 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_PLUGIN_SWITCH_NAMES_STRING;
            java.lang.String str5 = (java.lang.String) c19.m(u3Var3, "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                str4 = str4.concat(",").concat(str5);
            }
            gm0.j1.u().c().x(u3Var3, str4);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().p(262158, true);
        }
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
