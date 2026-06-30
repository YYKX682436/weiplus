package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class zb implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f183210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f183211e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f183212f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a f183213g;

    public zb(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a, o72.r2 r2Var, int i17, android.view.View view) {
        this.f183213g = activityC13579xef51058a;
        this.f183210d = r2Var;
        this.f183211e = i17;
        this.f183212f = view;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.bq0 bq0Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("card_fav_type", java.lang.Integer.valueOf(this.f183210d.f67657x2262335f));
        int itemId = menuItem.getItemId();
        v82.a aVar = v82.a.f515599a;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a = this.f183213g;
        if (itemId == 0) {
            db5.e1.B(activityC13579xef51058a.mo55332x76847179(), activityC13579xef51058a.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_h), "", activityC13579xef51058a.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0), activityC13579xef51058a.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.xb(this), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31);
            hashMap.put("card_clk_type", 4);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            return;
        }
        int i18 = 0;
        int i19 = this.f183211e;
        if (itemId == 1) {
            activityC13579xef51058a.S = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "do edit, long click info is %s", java.lang.Integer.valueOf(i19));
            activityC13579xef51058a.V = activityC13579xef51058a.T.getItem(i19 - activityC13579xef51058a.f181803h.getHeaderViewsCount());
            o72.r2 r2Var = activityC13579xef51058a.V;
            activityC13579xef51058a.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "enterEditMode: hide post");
            activityC13579xef51058a.T.g(true, r2Var);
            activityC13579xef51058a.f181803h.setOnItemLongClickListener(null);
            activityC13579xef51058a.mo74407xb0dfae51(11, false);
            activityC13579xef51058a.U.d(false, false, false, true);
            activityC13579xef51058a.Z6(1);
            hashMap.put("card_clk_type", 5);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            return;
        }
        if (itemId == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "do tag, long click info is %s", java.lang.Integer.valueOf(i19));
            o72.r2 item = activityC13579xef51058a.T.getItem(i19 - activityC13579xef51058a.f181803h.getHeaderViewsCount());
            android.content.Intent intent = new android.content.Intent(activityC13579xef51058a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d.class);
            intent.putExtra("key_fav_scene", 4);
            intent.putExtra("key_fav_item_id", item.f67645x88be67a1);
            activityC13579xef51058a.startActivityForResult(intent, 305);
            o72.z2.a("FavTagEditUI");
            hashMap.put("card_clk_type", 3);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            return;
        }
        if (itemId == 3) {
            activityC13579xef51058a.S = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "do transmit, long click info is %s", java.lang.Integer.valueOf(i19));
            activityC13579xef51058a.W = i19 - activityC13579xef51058a.f181803h.getHeaderViewsCount();
            activityC13579xef51058a.f181972p1 = activityC13579xef51058a.T.getItem(activityC13579xef51058a.W);
            activityC13579xef51058a.f181972p1 = activityC13579xef51058a.f181972p1.m150781x5a5dd5d();
            if (activityC13579xef51058a.f181972p1 == null) {
                return;
            }
            hashMap.put("card_clk_type", 2);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(activityC13579xef51058a.f181972p1);
            if (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.r7(linkedList, activityC13579xef51058a, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.yb(this), true, true)) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.o7(activityC13579xef51058a, activityC13579xef51058a.mo55332x76847179(), 4106, activityC13579xef51058a.T, activityC13579xef51058a.f181972p1);
                return;
            }
            return;
        }
        if (itemId == 5) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_detail_info_id", activityC13579xef51058a.T.getItem(i19 - activityC13579xef51058a.f181803h.getHeaderViewsCount()).f67645x88be67a1);
            intent2.setClassName(activityC13579xef51058a.mo55332x76847179(), "com.tencent.mm.plugin.repairer.ui.RepairerFavDebugUI");
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a2 = this.f183213g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC13579xef51058a2, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI$9", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC13579xef51058a2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC13579xef51058a2, "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI$9", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (itemId == 6) {
            activityC13579xef51058a.T.n(this.f183212f, i19, activityC13579xef51058a.T.getItem(i19 - activityC13579xef51058a.f181803h.getHeaderViewsCount()));
            return;
        }
        if (itemId != 7) {
            return;
        }
        o72.r2 item2 = activityC13579xef51058a.T.getItem(i19 - activityC13579xef51058a.f181803h.getHeaderViewsCount());
        activityC13579xef51058a.getClass();
        if (item2 == null || (bq0Var = item2.f67640x5ab01132) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteIndexUI", "deleteLocalFiles: itemInfo or favProto is null");
            return;
        }
        java.util.LinkedList<r45.gp0> linkedList2 = bq0Var.f452497f;
        if (linkedList2 == null || linkedList2.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteIndexUI", "deleteLocalFiles: dataList is null or empty");
            return;
        }
        for (r45.gp0 gp0Var : linkedList2) {
            java.lang.String x17 = o72.x1.x(gp0Var);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17)) {
                boolean h17 = com.p314xaae8f345.mm.vfs.w6.h(x17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "deleteLocalFiles: delete data file [%s] result: %b", x17, java.lang.Boolean.valueOf(h17));
                if (h17) {
                    i18++;
                }
            }
            java.lang.String X = o72.x1.X(gp0Var);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(X)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "deleteLocalFiles: delete thumb file [%s] result: %b", X, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.h(X)));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "deleteLocalFiles: total deleted %d files for localId %d", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(item2.f67645x88be67a1));
    }
}
