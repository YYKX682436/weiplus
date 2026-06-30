package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class t3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e f182980d;

    public t3(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e activityC13568x82804f7e) {
        this.f182980d = activityC13568x82804f7e;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e activityC13568x82804f7e = this.f182980d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = activityC13568x82804f7e.f181892f.getItem(activityC13568x82804f7e.f181890d);
        if (item == null) {
            return;
        }
        java.lang.String j17 = item.j();
        if (!com.p314xaae8f345.mm.vfs.w6.j(j17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavImgGalleryUI", "file not exists");
            return;
        }
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            o72.v2.d(activityC13568x82804f7e.f181903t, 1, 0);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(j17)) {
                o72.x1.J0(j17, activityC13568x82804f7e, item.t());
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("select_is_ret", true);
            j45.l.v(activityC13568x82804f7e, ".ui.transmit.SelectConversationUI", intent, 1);
            return;
        }
        if (itemId == 1) {
            o72.x1.K0(j17, activityC13568x82804f7e);
            o72.v2.d(activityC13568x82804f7e.f181903t, 0, 0);
            return;
        }
        if (itemId == 2) {
            java.lang.String string = activityC13568x82804f7e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccq);
            java.lang.String t17 = item.t();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavImgGalleryUI", "save image fail, path is null");
                return;
            }
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(activityC13568x82804f7e, j17, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w3(activityC13568x82804f7e, t17, string));
            return;
        }
        if (itemId == 4) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContextTranslate.k(activityC13568x82804f7e.mo55332x76847179(), null)) {
                activityC13568x82804f7e.f181900q.a();
                return;
            }
            return;
        }
        if (itemId != 5) {
            return;
        }
        java.lang.String x27 = activityC13568x82804f7e.x2();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavImgGalleryUI", "edit image path:%s msgId:%s", x27, 0L);
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
        ut3.m.f512715a.f(activityC13568x82804f7e.mo55332x76847179(), 4369, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, -1, b17, 1, 2);
    }
}
