package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class a2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f100449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f100450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f100451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavFilterUI f100452g;

    public a2(com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI, int i17, java.util.HashMap hashMap, android.view.View view) {
        this.f100452g = favFilterUI;
        this.f100449d = i17;
        this.f100450e = hashMap;
        this.f100451f = view;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem == null) {
            return;
        }
        com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI = this.f100452g;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = favFilterUI.f100335o;
        int headerViewsCount = favFilterUI.f100336p.getHeaderViewsCount();
        int i18 = this.f100449d;
        o72.r2 item = cVar.getItem((i18 - headerViewsCount) - 1);
        int itemId = menuItem.getItemId();
        v82.a aVar = v82.a.f434066a;
        android.view.View view = this.f100451f;
        java.util.HashMap hashMap = this.f100450e;
        switch (itemId) {
            case 0:
                hashMap.put("card_clk_type", 4);
                aVar.a("fav_page_card_operation", "view_clk", hashMap);
                if (i18 < favFilterUI.f100336p.getHeaderViewsCount()) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FavFilterUI", "do delete, long click info is %s (isExistDetail:%s)", java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(item.B1));
                if (item.B1) {
                    com.tencent.mm.plugin.fav.ui.FavFilterUI.V6(favFilterUI, view, i18, item);
                    return;
                } else {
                    db5.e1.B(favFilterUI.getContext(), favFilterUI.getContext().getString(com.tencent.mm.R.string.c_h), "", favFilterUI.getContext().getString(com.tencent.mm.R.string.f490367t0), favFilterUI.getContext().getString(com.tencent.mm.R.string.baz), new com.tencent.mm.plugin.fav.ui.x1(this, item), null, com.tencent.mm.R.color.f479482a31);
                    return;
                }
            case 1:
                hashMap.put("card_clk_type", 5);
                aVar.a("fav_page_card_operation", "view_clk", hashMap);
                com.tencent.mars.xlog.Log.i("MicroMsg.FavFilterUI", "do edit, long click info is %s", java.lang.Integer.valueOf(i18));
                favFilterUI.f100335o.g(true, item);
                favFilterUI.f100336p.setOnItemLongClickListener(null);
                favFilterUI.D.d(false, true, false, true);
                return;
            case 2:
                hashMap.put("card_clk_type", 3);
                aVar.a("fav_page_card_operation", "view_clk", hashMap);
                com.tencent.mars.xlog.Log.i("MicroMsg.FavFilterUI", "do tag, long click info is %s", java.lang.Integer.valueOf(i18));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_fav_scene", 4);
                intent.putExtra("key_fav_item_id", item.field_localId);
                o72.x1.L0(favFilterUI.getContext(), ".ui.FavTagEditUI", intent, null);
                o72.z2.a("FavTagEditUI");
                favFilterUI.Z6(7, i18, false);
                return;
            case 3:
                hashMap.put("card_clk_type", 2);
                aVar.a("fav_page_card_operation", "view_clk", hashMap);
                com.tencent.mars.xlog.Log.i("MicroMsg.FavFilterUI", "do transmit, long click info is %s", java.lang.Integer.valueOf(i18));
                favFilterUI.C = item;
                favFilterUI.C = item.clone();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(favFilterUI.C);
                if (com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.r7(linkedList, favFilterUI, new com.tencent.mm.plugin.fav.ui.z1(this), true, true)) {
                    com.tencent.mm.plugin.fav.ui.ec.g(favFilterUI.getContext(), 4106, favFilterUI.f100335o, favFilterUI.C);
                    favFilterUI.Z6(3, i18, false);
                    return;
                }
                return;
            case 4:
                r45.dq0 dq0Var = new r45.dq0();
                dq0Var.f372659m = 1;
                ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(favFilterUI.getContext(), item, dq0Var);
                return;
            case 5:
                favFilterUI.f100335o.n(view, i18, item);
                favFilterUI.Z6(8, i18, false);
                return;
            case 6:
                if (i18 < favFilterUI.f100336p.getHeaderViewsCount()) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FavFilterUI", "do remove, long click info is %s (isExistDetail:%s)", java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(item.B1));
                db5.e1.A(favFilterUI.getContext(), favFilterUI.getContext().getString(com.tencent.mm.R.string.cci), "", favFilterUI.getContext().getString(com.tencent.mm.R.string.f490568yq), favFilterUI.getContext().getString(com.tencent.mm.R.string.baz), new com.tencent.mm.plugin.fav.ui.y1(this, item), null);
                return;
            case 7:
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("key_detail_info_id", item.field_localId);
                intent2.setClassName(favFilterUI.getContext(), "com.tencent.mm.plugin.repairer.ui.RepairerFavDebugUI");
                com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI2 = this.f100452g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(favFilterUI2, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavFilterUI$11", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                favFilterUI2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(favFilterUI2, "com/tencent/mm/plugin/fav/ui/FavFilterUI$11", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            default:
                return;
        }
    }
}
