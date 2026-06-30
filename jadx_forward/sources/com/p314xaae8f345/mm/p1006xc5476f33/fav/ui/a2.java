package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class a2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f181982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f181983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f181984f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13566x76c62427 f181985g;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13566x76c62427 activityC13566x76c62427, int i17, java.util.HashMap hashMap, android.view.View view) {
        this.f181985g = activityC13566x76c62427;
        this.f181982d = i17;
        this.f181983e = hashMap;
        this.f181984f = view;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13566x76c62427 activityC13566x76c62427 = this.f181985g;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = activityC13566x76c62427.f181868o;
        int headerViewsCount = activityC13566x76c62427.f181869p.getHeaderViewsCount();
        int i18 = this.f181982d;
        o72.r2 item = cVar.getItem((i18 - headerViewsCount) - 1);
        int itemId = menuItem.getItemId();
        v82.a aVar = v82.a.f515599a;
        android.view.View view = this.f181984f;
        java.util.HashMap hashMap = this.f181983e;
        switch (itemId) {
            case 0:
                hashMap.put("card_clk_type", 4);
                aVar.a("fav_page_card_operation", "view_clk", hashMap);
                if (i18 < activityC13566x76c62427.f181869p.getHeaderViewsCount()) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFilterUI", "do delete, long click info is %s (isExistDetail:%s)", java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(item.B1));
                if (item.B1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13566x76c62427.V6(activityC13566x76c62427, view, i18, item);
                    return;
                } else {
                    db5.e1.B(activityC13566x76c62427.mo55332x76847179(), activityC13566x76c62427.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_h), "", activityC13566x76c62427.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0), activityC13566x76c62427.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x1(this, item), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31);
                    return;
                }
            case 1:
                hashMap.put("card_clk_type", 5);
                aVar.a("fav_page_card_operation", "view_clk", hashMap);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFilterUI", "do edit, long click info is %s", java.lang.Integer.valueOf(i18));
                activityC13566x76c62427.f181868o.g(true, item);
                activityC13566x76c62427.f181869p.setOnItemLongClickListener(null);
                activityC13566x76c62427.D.d(false, true, false, true);
                return;
            case 2:
                hashMap.put("card_clk_type", 3);
                aVar.a("fav_page_card_operation", "view_clk", hashMap);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFilterUI", "do tag, long click info is %s", java.lang.Integer.valueOf(i18));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_fav_scene", 4);
                intent.putExtra("key_fav_item_id", item.f67645x88be67a1);
                o72.x1.L0(activityC13566x76c62427.mo55332x76847179(), ".ui.FavTagEditUI", intent, null);
                o72.z2.a("FavTagEditUI");
                activityC13566x76c62427.Z6(7, i18, false);
                return;
            case 3:
                hashMap.put("card_clk_type", 2);
                aVar.a("fav_page_card_operation", "view_clk", hashMap);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFilterUI", "do transmit, long click info is %s", java.lang.Integer.valueOf(i18));
                activityC13566x76c62427.C = item;
                activityC13566x76c62427.C = item.m150781x5a5dd5d();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(activityC13566x76c62427.C);
                if (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.r7(linkedList, activityC13566x76c62427, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z1(this), true, true)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.g(activityC13566x76c62427.mo55332x76847179(), 4106, activityC13566x76c62427.f181868o, activityC13566x76c62427.C);
                    activityC13566x76c62427.Z6(3, i18, false);
                    return;
                }
                return;
            case 4:
                r45.dq0 dq0Var = new r45.dq0();
                dq0Var.f454192m = 1;
                ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(activityC13566x76c62427.mo55332x76847179(), item, dq0Var);
                return;
            case 5:
                activityC13566x76c62427.f181868o.n(view, i18, item);
                activityC13566x76c62427.Z6(8, i18, false);
                return;
            case 6:
                if (i18 < activityC13566x76c62427.f181869p.getHeaderViewsCount()) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFilterUI", "do remove, long click info is %s (isExistDetail:%s)", java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(item.B1));
                db5.e1.A(activityC13566x76c62427.mo55332x76847179(), activityC13566x76c62427.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cci), "", activityC13566x76c62427.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572101yq), activityC13566x76c62427.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y1(this, item), null);
                return;
            case 7:
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("key_detail_info_id", item.f67645x88be67a1);
                intent2.setClassName(activityC13566x76c62427.mo55332x76847179(), "com.tencent.mm.plugin.repairer.ui.RepairerFavDebugUI");
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13566x76c62427 activityC13566x76c624272 = this.f181985g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activityC13566x76c624272, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavFilterUI$11", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC13566x76c624272.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activityC13566x76c624272, "com/tencent/mm/plugin/fav/ui/FavFilterUI$11", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            default:
                return;
        }
    }
}
