package lu1;

/* loaded from: classes15.dex */
public abstract class d {
    public static void a(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17, com.p314xaae8f345.mm.ui.da daVar) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("select_is_ret", false);
        intent.putExtra("Select_Conv_Type", 3);
        j45.l.w(abstractActivityC21394xb3d2c0cf, ".ui.transmit.SelectConversationUI", intent, i17, daVar);
    }

    public static void b(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, boolean z17) {
        android.content.Intent intent = new android.content.Intent(abstractActivityC21394xb3d2c0cf, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365.class);
        intent.putExtra("from_menu", z17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(abstractActivityC21394xb3d2c0cf, arrayList.toArray(), "com/tencent/mm/plugin/card/util/CardActivityHelper", "goCardNewMsgUI", "(Lcom/tencent/mm/ui/MMActivity;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        abstractActivityC21394xb3d2c0cf.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(abstractActivityC21394xb3d2c0cf, "com/tencent/mm/plugin/card/util/CardActivityHelper", "goCardNewMsgUI", "(Lcom/tencent/mm/ui/MMActivity;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "CardMsgCenterView", 0, "", "", 0, 0, "", 0, "");
    }

    public static void c(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, float f17, float f18, java.lang.String str, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 13);
        intent.putExtra("kwebmap_slat", f17);
        intent.putExtra("kwebmap_lng", f18);
        intent.putExtra("kPoiName", str);
        intent.putExtra("Kwebmap_locaion", str2);
        j45.l.j(abstractActivityC21394xb3d2c0cf, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, null);
    }

    public static boolean d(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardActivityHelper", "gotoAppBrand commField.app_brand_user_name is null");
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
        am.nx nxVar = c6113xa3727625.f136390g;
        nxVar.f88999a = str2;
        if (str3 == null) {
            str3 = "";
        }
        nxVar.f89000b = str3;
        nxVar.f89001c = i18;
        if (i17 == 26) {
            nxVar.f89002d = 1029;
        } else {
            nxVar.f89002d = 1028;
        }
        nxVar.f89003e = str;
        nxVar.f89011m = true;
        c6113xa3727625.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardActivityHelper", "gotoAppBrand userName:%s, path:%s, scene:%d openType:%d", nxVar.f88999a, nxVar.f89000b, java.lang.Integer.valueOf(nxVar.f89002d), java.lang.Integer.valueOf(nxVar.f89001c));
        return true;
    }

    public static boolean e(java.lang.String str, r45.w50 w50Var, int i17, int i18) {
        if (w50Var != null) {
            return d(str, w50Var.f470420p, w50Var.f470421q, i17, i18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardActivityHelper", "gotoAppBrand commField is null");
        return false;
    }

    public static void f(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
        am.nx nxVar = c6113xa3727625.f136390g;
        nxVar.f88999a = str;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        nxVar.f89000b = str2;
        if (i17 > 0) {
            nxVar.f89007i = i17;
        }
        nxVar.f89002d = 1028;
        c6113xa3727625.e();
    }

    public static void g(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17, java.lang.String str, boolean z17, tt1.j jVar) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_from_scene", 3);
        intent.putExtra("key_expire_time", i17);
        intent.putExtra("key_begin_time", java.lang.System.currentTimeMillis());
        intent.putExtra("key_card_tips", str);
        intent.putExtra("key_is_mark", z17);
        intent.putExtra("key_card_id", jVar.f());
        intent.putExtra("key_user_card_id", jVar.g());
        intent.putExtra("key_card_code", jVar.i0().f466722o);
        j45.l.j(abstractActivityC21394xb3d2c0cf, "offline", ".ui.WalletOfflineEntranceUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(11850, 5, 0);
        g0Var.d(19671, 1, jVar.g());
    }

    public static void h(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_BRAND_NAME", str);
        j45.l.j(abstractActivityC21394xb3d2c0cf, "card", ".ui.CardShowWaringTransparentUI", intent, null);
    }

    public static void i(android.content.Context context, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardActivityHelper", "context is null, err");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str);
        intent.putExtra("force_get_contact", true);
        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    public static void j(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, java.lang.String str, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("stastic_scene", i17);
        j45.l.j(abstractActivityC21394xb3d2c0cf, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static void k(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, java.lang.String str, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("stastic_scene", 0);
        intent.putExtra("rawUrl", str);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str2);
        j45.l.j(abstractActivityC21394xb3d2c0cf, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static void l(android.content.Context context, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (!c01.e2.J(str)) {
            i(context, str);
        } else {
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", str);
            intent.putExtra("finish_direct", true);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
        }
    }
}
