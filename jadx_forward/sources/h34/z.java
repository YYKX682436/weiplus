package h34;

/* loaded from: classes11.dex */
public abstract class z {
    public static void a(h34.h0 h0Var, android.content.Context context, int i17) {
        if (h0Var == null) {
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h0Var.f4178xdec927b) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h0Var.f4175x4344608b)) {
            b(h0Var.f4178xdec927b, h0Var.f4175x4344608b, i17, context);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.ShakeTVLogic", "doShakeTvHistoryItemClick start do nth");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String str = h0Var.f4178xdec927b;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = 0;
        g0Var.d(12108, objArr);
    }

    public static void b(java.lang.String str, java.lang.String str2, int i17, android.content.Context context) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(android.net.Uri.parse(str2));
        intent.putExtra("translate_link_scene", (i17 == 3 || i17 == 4) ? 17 : 16);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/shake/shakemedia/model/ShakeTVLogic", "doShakeTvOpenTempSession", "(Ljava/lang/String;Ljava/lang/String;ILandroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/shake/shakemedia/model/ShakeTVLogic", "doShakeTvOpenTempSession", "(Ljava/lang/String;Ljava/lang/String;ILandroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.ShakeTVLogic", "doShakeTvHistoryItemClick start tempsession open deeplink");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = 1;
        g0Var.d(12108, objArr);
    }

    public static void c(c34.r rVar, android.content.Context context, boolean z17) {
        if (rVar == null) {
            return;
        }
        switch (rVar.f66443x2262335f) {
            case 6:
                java.lang.String str = rVar.f66444xdec927b;
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
                if (n17 != null) {
                    android.content.Intent intent = new android.content.Intent();
                    if (n17.r2() && n17.k2()) {
                        r01.q3.cj().b1(str);
                        if (rVar.f66426x2ef4959a.equals("1")) {
                            intent.putExtra("Chat_User", str);
                            intent.putExtra("finish_direct", true);
                            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent, context);
                            return;
                        }
                    }
                    intent.putExtra("Contact_User", str);
                    intent.putExtra("force_get_contact", true);
                    j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
                    return;
                }
                return;
            case 7:
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("geta8key_scene", z17 ? 26 : 18);
                intent2.putExtra("stastic_scene", 6);
                intent2.putExtra("KAppId", "wxaf060266bfa9a35c");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("jsapi_args_appid", "wxaf060266bfa9a35c");
                intent2.putExtra("jsapiargs", bundle);
                intent2.putExtra("rawUrl", rVar.f66444xdec927b);
                intent2.putExtra("srcUsername", rVar.f66426x2ef4959a);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent2, context);
                return;
            case 8:
                android.content.Intent intent3 = new android.content.Intent();
                intent3.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17681x5e0a88e4.class);
                intent3.putExtra("key_TV_xml_bytes", rVar.f66430xbcdbef);
                intent3.putExtra("key_TV_come_from_shake", true);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent3);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/shake/shakemedia/model/ShakeTVLogic", "handleRedirect", "(Lcom/tencent/mm/plugin/shake/model/ShakeItem;Landroid/content/Context;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/shake/shakemedia/model/ShakeTVLogic", "handleRedirect", "(Lcom/tencent/mm/plugin/shake/model/ShakeItem;Landroid/content/Context;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            case 9:
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec();
                am.df dfVar = c5587xf7a06bec.f135909g;
                dfVar.f87979a = 11;
                dfVar.f87980b = rVar.f66444xdec927b;
                dfVar.f87981c = new java.lang.ref.WeakReference(context);
                c5587xf7a06bec.f273897d = null;
                c5587xf7a06bec.b(android.os.Looper.myLooper());
                return;
            case 10:
                android.content.Intent intent4 = new android.content.Intent();
                intent4.putExtra("key_product_id", rVar.f66444xdec927b);
                intent4.putExtra("key_product_scene", 9);
                j45.l.j(context, "product", ".ui.MallProductUI", intent4, null);
                return;
            case 11:
            default:
                return;
            case 12:
                b(rVar.f66426x2ef4959a, rVar.f66444xdec927b, z17 ? 4 : 3, context);
                return;
            case 13:
                java.lang.String str2 = rVar.f66444xdec927b;
                java.lang.String str3 = rVar.f66436x13320506;
                int i17 = rVar.f66435x13320505;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.ShakeTVLogic", "gotoAppBrand commField.app_brand_user_name is null");
                    return;
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
                am.nx nxVar = c6113xa3727625.f136390g;
                nxVar.f88999a = str2;
                if (str3 == null) {
                    str3 = "";
                }
                nxVar.f89000b = str3;
                nxVar.f89001c = 0;
                nxVar.f89002d = mc1.h.f72824x366c91de;
                nxVar.f89007i = i17;
                c6113xa3727625.e();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.ShakeTVLogic", "gotoAppBrand userName:%s, path:%s, scene:%d openType:%d version:%d", nxVar.f88999a, nxVar.f89000b, java.lang.Integer.valueOf(nxVar.f89002d), java.lang.Integer.valueOf(nxVar.f89001c), java.lang.Integer.valueOf(nxVar.f89007i));
                return;
        }
    }

    public static boolean d(int i17) {
        return 7 == i17 || 6 == i17 || 8 == i17 || 9 == i17 || 10 == i17 || 12 == i17 || 13 == i17;
    }

    public static boolean e() {
        if (x51.o1.f533591k) {
            return true;
        }
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ShowShakeTV");
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) && d17.equals("1");
    }
}
