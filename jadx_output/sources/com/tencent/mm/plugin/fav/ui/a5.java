package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class a5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f100455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f100456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f100457f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavSearchUI f100458g;

    public a5(com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI, int i17, java.util.HashMap hashMap, android.view.View view) {
        this.f100458g = favSearchUI;
        this.f100455d = i17;
        this.f100456e = hashMap;
        this.f100457f = view;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem == null) {
            return;
        }
        com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI = this.f100458g;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = favSearchUI.f100400n;
        int headerViewsCount = favSearchUI.f100403q.getHeaderViewsCount();
        int i18 = this.f100455d;
        o72.r2 item = cVar.getItem((i18 - headerViewsCount) - 1);
        int itemId = menuItem.getItemId();
        v82.a aVar = v82.a.f434066a;
        android.view.View view = this.f100457f;
        java.util.HashMap hashMap = this.f100456e;
        if (itemId == 0) {
            if (i18 < favSearchUI.f100403q.getHeaderViewsCount()) {
                return;
            }
            hashMap.put("card_clk_type", 4);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchUI", "do delete, long click info is %s (isExistDetail:%s)", java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(item.B1));
            if (item.B1) {
                com.tencent.mm.plugin.fav.ui.FavSearchUI.X6(favSearchUI, view, i18, item);
                return;
            } else {
                db5.e1.B(favSearchUI.getContext(), favSearchUI.getContext().getString(com.tencent.mm.R.string.c_h), "", favSearchUI.getContext().getString(com.tencent.mm.R.string.f490367t0), favSearchUI.getContext().getString(com.tencent.mm.R.string.baz), new com.tencent.mm.plugin.fav.ui.y4(this, item), null, com.tencent.mm.R.color.f479482a31);
                return;
            }
        }
        if (itemId == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchUI", "do edit, long click info is %s", java.lang.Integer.valueOf(i18));
            favSearchUI.f100400n.g(true, item);
            favSearchUI.f100403q.setOnItemLongClickListener(null);
            favSearchUI.L.d(false, true, false, true);
            hashMap.put("card_clk_type", 5);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            return;
        }
        if (itemId == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchUI", "do tag, long click info is %s", java.lang.Integer.valueOf(i18));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_fav_scene", 4);
            intent.putExtra("key_fav_item_id", item.field_localId);
            o72.x1.L0(favSearchUI.getContext(), ".ui.FavTagEditUI", intent, null);
            o72.z2.a("FavTagEditUI");
            favSearchUI.b7(7, i18);
            hashMap.put("card_clk_type", 3);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            return;
        }
        if (itemId != 3) {
            if (itemId != 4) {
                if (itemId != 5) {
                    return;
                }
                favSearchUI.f100400n.n(view, i18, item);
                favSearchUI.b7(8, i18);
                return;
            }
            r45.dq0 dq0Var = new r45.dq0();
            dq0Var.f372659m = 1;
            ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(favSearchUI.getContext(), item, dq0Var);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchUI", "do transmit, long click info is %s", java.lang.Integer.valueOf(i18));
        favSearchUI.K = item;
        favSearchUI.K = item.clone();
        hashMap.put("card_clk_type", 2);
        aVar.a("fav_page_card_operation", "view_clk", hashMap);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(favSearchUI.K);
        if (com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.r7(linkedList, favSearchUI, new com.tencent.mm.plugin.fav.ui.z4(this), true, true)) {
            com.tencent.mm.plugin.fav.ui.ec.g(favSearchUI.getContext(), 4106, favSearchUI.f100400n, favSearchUI.K);
            favSearchUI.b7(3, i18);
        }
    }
}
