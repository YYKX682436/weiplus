package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class a0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd f182424d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd activityC13597x28c5d1bd) {
        this.f182424d = activityC13597x28c5d1bd;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.bq0 bq0Var;
        r45.jq0 jq0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd activityC13597x28c5d1bd = this.f182424d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = activityC13597x28c5d1bd.f182406g.getItem(activityC13597x28c5d1bd.f182403d);
        if (item == null) {
            return;
        }
        java.lang.String j17 = item.j();
        if (!com.p314xaae8f345.mm.vfs.w6.j(j17) && menuItem.getItemId() != 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavMediaGalleryUI", "file not exists");
            return;
        }
        switch (menuItem.getItemId()) {
            case 0:
                o72.v2.d(activityC13597x28c5d1bd.A, 1, 0);
                if (item.k() == 2) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(j17)) {
                        o72.x1.J0(j17, activityC13597x28c5d1bd, item.t());
                        return;
                    }
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("Select_Conv_Type", 3);
                    intent.putExtra("select_is_ret", true);
                    j45.l.v(activityC13597x28c5d1bd, ".ui.transmit.SelectConversationUI", intent, 1);
                    return;
                }
                java.lang.String w17 = item.w();
                java.lang.String j18 = item.j();
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Select_Conv_Type", 3);
                intent2.putExtra("select_is_ret", true);
                intent2.putExtra("mutil_select_is_ret", true);
                if (com.p314xaae8f345.mm.vfs.w6.j(w17)) {
                    intent2.putExtra("image_path", w17);
                } else {
                    intent2.putExtra("image_path", j18);
                }
                intent2.putExtra("Retr_Msg_Type", 1);
                j45.l.v(activityC13597x28c5d1bd.mo55332x76847179(), ".ui.transmit.SelectConversationUI", intent2, 1);
                return;
            case 1:
                o72.x1.K0(j17, activityC13597x28c5d1bd);
                o72.v2.d(activityC13597x28c5d1bd.A, 0, 0);
                return;
            case 2:
                if (item.k() != 2) {
                    activityC13597x28c5d1bd.getClass();
                    ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Bi(activityC13597x28c5d1bd.mo55332x76847179(), j17, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b0(activityC13597x28c5d1bd, j17));
                    return;
                }
                activityC13597x28c5d1bd.getClass();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavMediaGalleryUI", "save image fail, path is null");
                    return;
                } else {
                    ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(activityC13597x28c5d1bd, j17, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.c0(activityC13597x28c5d1bd));
                    return;
                }
            case 3:
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7) ((java.util.HashMap) activityC13597x28c5d1bd.f182418v).get(j17);
                if (c5886xd11a0be7 != null) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197 c5292x67f91197 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197();
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6 s6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.f273431a;
                    java.lang.String e17 = s6Var.e(c5886xd11a0be7);
                    int c17 = s6Var.c(c5886xd11a0be7);
                    int d17 = s6Var.d(c5886xd11a0be7);
                    am.r3 r3Var = c5292x67f91197.f135612g;
                    r3Var.f89314b = activityC13597x28c5d1bd;
                    r3Var.f89313a = e17;
                    r3Var.f89315c = c17;
                    r3Var.f89317e = 7;
                    r3Var.f89321i = 39;
                    r3Var.f89322j = item.f();
                    r3Var.f89323k = item.e();
                    r3Var.f89325m = j17;
                    r3Var.f89327o = true;
                    r3Var.f89329q = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.b(c5886xd11a0be7);
                    r3Var.f89316d = d17;
                    android.os.Bundle bundle = new android.os.Bundle(1);
                    bundle.putInt("stat_scene", 5);
                    o72.r2 p17 = item.p();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMediaGalleryUI", "addStatInfo4AppBrand, from fav");
                    bundle.putInt("LaunchCodeScene_ScanScene", 4);
                    if (p17 != null && (bq0Var = p17.f67640x5ab01132) != null && (jq0Var = bq0Var.f452495d) != null) {
                        bundle.putString("stat_chat_talker_username", o72.c3.b(jq0Var));
                        bundle.putString("stat_send_msg_user", jq0Var.f459569f);
                        bundle.putString("stat_msg_id", jq0Var.f459579s);
                    }
                    bundle.putInt("KMsgType", 49);
                    bundle.putInt("KAppMsgType", 24);
                    r3Var.f89324l = bundle;
                    c5292x67f91197.e();
                    return;
                }
                return;
            case 4:
                activityC13597x28c5d1bd.f182414r.f454188f = activityC13597x28c5d1bd.f182406g.getCount() - activityC13597x28c5d1bd.f182403d;
                ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(activityC13597x28c5d1bd.mo55332x76847179(), item.p(), activityC13597x28c5d1bd.f182414r);
                activityC13597x28c5d1bd.finish();
                return;
            case 5:
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContextTranslate.k(activityC13597x28c5d1bd.mo55332x76847179(), null)) {
                    activityC13597x28c5d1bd.f182417u.a();
                    return;
                }
                return;
            case 6:
                java.lang.String x27 = activityC13597x28c5d1bd.x2();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMediaGalleryUI", "edit image path:%s msgId:%s", x27, 0L);
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.b(x27, "");
                b17.F = 0;
                com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc41468 = new com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468((hp.a) null);
                java.util.Map map = c10402x5bc41468.f146312h;
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                java.util.HashMap hashMap = (java.util.HashMap) map;
                hashMap.put("plugin_filter", bool);
                hashMap.put("plugin_poi", bool);
                hashMap.put("plugin_tip", bool);
                hashMap.put("plugin_menu", bool);
                b17.f237210o = c10402x5bc41468;
                ut3.m.f512715a.f(activityC13597x28c5d1bd.mo55332x76847179(), 4369, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, -1, b17, 1, 2);
                return;
            default:
                return;
        }
    }
}
