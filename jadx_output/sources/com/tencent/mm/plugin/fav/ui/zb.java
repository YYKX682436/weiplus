package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class zb implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f101677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f101678e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f101679f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavoriteIndexUI f101680g;

    public zb(com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI, o72.r2 r2Var, int i17, android.view.View view) {
        this.f101680g = favoriteIndexUI;
        this.f101677d = r2Var;
        this.f101678e = i17;
        this.f101679f = view;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.bq0 bq0Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("card_fav_type", java.lang.Integer.valueOf(this.f101677d.field_type));
        int itemId = menuItem.getItemId();
        v82.a aVar = v82.a.f434066a;
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = this.f101680g;
        if (itemId == 0) {
            db5.e1.B(favoriteIndexUI.getContext(), favoriteIndexUI.getContext().getString(com.tencent.mm.R.string.c_h), "", favoriteIndexUI.getContext().getString(com.tencent.mm.R.string.f490367t0), favoriteIndexUI.getContext().getString(com.tencent.mm.R.string.baz), new com.tencent.mm.plugin.fav.ui.xb(this), null, com.tencent.mm.R.color.f479482a31);
            hashMap.put("card_clk_type", 4);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            return;
        }
        int i18 = 0;
        int i19 = this.f101678e;
        if (itemId == 1) {
            favoriteIndexUI.S = com.tencent.mm.sdk.platformtools.t8.i1();
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "do edit, long click info is %s", java.lang.Integer.valueOf(i19));
            favoriteIndexUI.V = favoriteIndexUI.T.getItem(i19 - favoriteIndexUI.f100270h.getHeaderViewsCount());
            o72.r2 r2Var = favoriteIndexUI.V;
            favoriteIndexUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "enterEditMode: hide post");
            favoriteIndexUI.T.g(true, r2Var);
            favoriteIndexUI.f100270h.setOnItemLongClickListener(null);
            favoriteIndexUI.showOptionMenu(11, false);
            favoriteIndexUI.U.d(false, false, false, true);
            favoriteIndexUI.Z6(1);
            hashMap.put("card_clk_type", 5);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            return;
        }
        if (itemId == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "do tag, long click info is %s", java.lang.Integer.valueOf(i19));
            o72.r2 item = favoriteIndexUI.T.getItem(i19 - favoriteIndexUI.f100270h.getHeaderViewsCount());
            android.content.Intent intent = new android.content.Intent(favoriteIndexUI, (java.lang.Class<?>) com.tencent.mm.plugin.fav.ui.FavTagEditUI.class);
            intent.putExtra("key_fav_scene", 4);
            intent.putExtra("key_fav_item_id", item.field_localId);
            favoriteIndexUI.startActivityForResult(intent, 305);
            o72.z2.a("FavTagEditUI");
            hashMap.put("card_clk_type", 3);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            return;
        }
        if (itemId == 3) {
            favoriteIndexUI.S = com.tencent.mm.sdk.platformtools.t8.i1();
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "do transmit, long click info is %s", java.lang.Integer.valueOf(i19));
            favoriteIndexUI.W = i19 - favoriteIndexUI.f100270h.getHeaderViewsCount();
            favoriteIndexUI.f100439p1 = favoriteIndexUI.T.getItem(favoriteIndexUI.W);
            favoriteIndexUI.f100439p1 = favoriteIndexUI.f100439p1.clone();
            if (favoriteIndexUI.f100439p1 == null) {
                return;
            }
            hashMap.put("card_clk_type", 2);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(favoriteIndexUI.f100439p1);
            if (com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.r7(linkedList, favoriteIndexUI, new com.tencent.mm.plugin.fav.ui.yb(this), true, true)) {
                com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.o7(favoriteIndexUI, favoriteIndexUI.getContext(), 4106, favoriteIndexUI.T, favoriteIndexUI.f100439p1);
                return;
            }
            return;
        }
        if (itemId == 5) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_detail_info_id", favoriteIndexUI.T.getItem(i19 - favoriteIndexUI.f100270h.getHeaderViewsCount()).field_localId);
            intent2.setClassName(favoriteIndexUI.getContext(), "com.tencent.mm.plugin.repairer.ui.RepairerFavDebugUI");
            com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI2 = this.f101680g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(favoriteIndexUI2, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI$9", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            favoriteIndexUI2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(favoriteIndexUI2, "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI$9", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (itemId == 6) {
            favoriteIndexUI.T.n(this.f101679f, i19, favoriteIndexUI.T.getItem(i19 - favoriteIndexUI.f100270h.getHeaderViewsCount()));
            return;
        }
        if (itemId != 7) {
            return;
        }
        o72.r2 item2 = favoriteIndexUI.T.getItem(i19 - favoriteIndexUI.f100270h.getHeaderViewsCount());
        favoriteIndexUI.getClass();
        if (item2 == null || (bq0Var = item2.field_favProto) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteIndexUI", "deleteLocalFiles: itemInfo or favProto is null");
            return;
        }
        java.util.LinkedList<r45.gp0> linkedList2 = bq0Var.f370964f;
        if (linkedList2 == null || linkedList2.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteIndexUI", "deleteLocalFiles: dataList is null or empty");
            return;
        }
        for (r45.gp0 gp0Var : linkedList2) {
            java.lang.String x17 = o72.x1.x(gp0Var);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(x17)) {
                boolean h17 = com.tencent.mm.vfs.w6.h(x17);
                com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "deleteLocalFiles: delete data file [%s] result: %b", x17, java.lang.Boolean.valueOf(h17));
                if (h17) {
                    i18++;
                }
            }
            java.lang.String X = o72.x1.X(gp0Var);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(X)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "deleteLocalFiles: delete thumb file [%s] result: %b", X, java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.h(X)));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "deleteLocalFiles: total deleted %d files for localId %d", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(item2.field_localId));
    }
}
