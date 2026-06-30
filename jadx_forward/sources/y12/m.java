package y12;

/* loaded from: classes12.dex */
public abstract class m {
    public static void a(android.content.Context context, r45.kj0 kj0Var, boolean z17) {
        if (kj0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiUINavigatorMgr", "banner is null. do nothing");
            return;
        }
        int i17 = kj0Var.f460264i;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiUINavigatorMgr", "MM_EMOTION_BANNER_SET_NULL do nothing");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13223, 1, java.lang.Integer.valueOf(kj0Var.f460262g), kj0Var.f460260e, 0, 0);
            return;
        }
        if (i17 == 1) {
            if (z17) {
                b(context, kj0Var, true, 15, 8);
            } else {
                b(context, kj0Var, true, 3, 5);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13223, 1, java.lang.Integer.valueOf(kj0Var.f460262g), kj0Var.f460260e, 0, 4);
            return;
        }
        if (i17 == 2) {
            java.lang.String str = kj0Var.f460261f;
            java.lang.String str2 = kj0Var.f460260e;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.t().booleanValue()) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str);
                intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str2);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent, context);
            } else {
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13223, 1, java.lang.Integer.valueOf(kj0Var.f460262g), kj0Var.f460260e, 0, 3);
            return;
        }
        if (i17 != 3) {
            if (i17 == 4) {
                f(context, kj0Var.f460262g, kj0Var.f460260e, kj0Var.f460266n, kj0Var.f460265m, kj0Var.f460263h, 10001);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13223, 1, java.lang.Integer.valueOf(kj0Var.f460262g), kj0Var.f460260e, 0, 1);
                return;
            }
            if (i17 != 5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiUINavigatorMgr", "Unkown type do nothing. SetType:%d", java.lang.Integer.valueOf(i17));
                return;
            }
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.t().booleanValue()) {
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", kj0Var.f460270r.f461048d);
            bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, kj0Var.f460270r.f461049e);
            bundle.putString("query", "SetKey=" + kj0Var.f460269q);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(context, bundle, true, true, new y12.l());
            return;
        }
        int i18 = kj0Var.f460262g;
        java.lang.String str3 = kj0Var.f460260e;
        java.lang.String str4 = kj0Var.f460266n;
        java.lang.String str5 = kj0Var.f460265m;
        java.lang.String str6 = kj0Var.f460263h;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.t().booleanValue()) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13319x1c4d3328.class);
            intent2.putExtra("topic_id", i18);
            intent2.putExtra("topic_name", str3);
            intent2.putExtra("topic_ad_url", str6);
            intent2.putExtra("topic_icon_url", str5);
            intent2.putExtra("topic_desc", str4);
            if (z17) {
                intent2.putExtra("extra_scence", 15);
            } else {
                intent2.putExtra("extra_scence", 3);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startEmotionList", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startEmotionList", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13223, 1, java.lang.Integer.valueOf(kj0Var.f460262g), kj0Var.f460260e, 0, 2);
    }

    public static void b(android.content.Context context, r45.kj0 kj0Var, boolean z17, int i17, int i18) {
        r45.qj0 qj0Var = new r45.qj0();
        java.lang.String str = kj0Var.f460267o;
        qj0Var.f465565d = str;
        qj0Var.f465567f = kj0Var.f460260e;
        qj0Var.f465568g = kj0Var.f460266n;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        d22.d0 d0Var = new d22.d0(str, qj0Var, null);
        d0Var.f445731g = i18;
        d0Var.f445688a = i17;
        d0Var.f445736l = true;
        d22.u.f307409a.a(context, d0Var);
    }

    public static void c(android.content.Context context, r45.zj0 zj0Var, boolean z17, int i17, int i18, int i19, java.lang.String str, int i27, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 c6419xd51df726, boolean z18) {
        d(context, zj0Var, z17, i17, i18, i19, str, i27, c6419xd51df726, z18, "");
    }

    public static void d(android.content.Context context, r45.zj0 zj0Var, boolean z17, int i17, int i18, int i19, java.lang.String str, int i27, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 c6419xd51df726, boolean z18, java.lang.String str2) {
        if (zj0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiUINavigatorMgr", "get detail intent failed. summary is null.");
            return;
        }
        j12.i iVar = new j12.i(zj0Var);
        if (c6419xd51df726 != null) {
            iVar.f378709k = c6419xd51df726.f137615p;
        }
        java.lang.String str3 = zj0Var.f473661d;
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str3 == null) {
            str3 = "";
        }
        d22.d0 d0Var = new d22.d0(str3, null, iVar);
        d0Var.f445731g = i27;
        d0Var.f445688a = i17;
        d0Var.f445736l = z18;
        if (str2 == null) {
            str2 = "";
        }
        d0Var.f445690c = str2;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            d0Var.f445732h = str;
        }
        if (c6419xd51df726 != null) {
            java.lang.String m17 = c6419xd51df726.m();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m17, "<set-?>");
            d0Var.f445737m = m17;
        }
        d22.u.f307409a.a(context, d0Var);
    }

    public static void e(android.content.Context context, r45.zj0 zj0Var, boolean z17, int i17, int i18, int i19, java.lang.String str, int i27, boolean z18) {
        c(context, zj0Var, z17, i17, i18, i19, str, i27, null, z18);
    }

    public static void f(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.t().booleanValue()) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13365x3816f414.class);
        intent.putExtra("set_id", i17);
        intent.putExtra("set_title", str);
        intent.putExtra("set_desc", str2);
        intent.putExtra("set_iconURL", str3);
        intent.putExtra("headurl", str4);
        intent.putExtra("entrance_scene", i18);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startV3SingleProductAlbumUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startV3SingleProductAlbumUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
