package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class a5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f181988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f181989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f181990f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 f181991g;

    public a5(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257, int i17, java.util.HashMap hashMap, android.view.View view) {
        this.f181991g = activityC13570xd6b9f257;
        this.f181988d = i17;
        this.f181989e = hashMap;
        this.f181990f = view;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257 = this.f181991g;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = activityC13570xd6b9f257.f181933n;
        int headerViewsCount = activityC13570xd6b9f257.f181936q.getHeaderViewsCount();
        int i18 = this.f181988d;
        o72.r2 item = cVar.getItem((i18 - headerViewsCount) - 1);
        int itemId = menuItem.getItemId();
        v82.a aVar = v82.a.f515599a;
        android.view.View view = this.f181990f;
        java.util.HashMap hashMap = this.f181989e;
        if (itemId == 0) {
            if (i18 < activityC13570xd6b9f257.f181936q.getHeaderViewsCount()) {
                return;
            }
            hashMap.put("card_clk_type", 4);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchUI", "do delete, long click info is %s (isExistDetail:%s)", java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(item.B1));
            if (item.B1) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.X6(activityC13570xd6b9f257, view, i18, item);
                return;
            } else {
                db5.e1.B(activityC13570xd6b9f257.mo55332x76847179(), activityC13570xd6b9f257.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_h), "", activityC13570xd6b9f257.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0), activityC13570xd6b9f257.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y4(this, item), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31);
                return;
            }
        }
        if (itemId == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchUI", "do edit, long click info is %s", java.lang.Integer.valueOf(i18));
            activityC13570xd6b9f257.f181933n.g(true, item);
            activityC13570xd6b9f257.f181936q.setOnItemLongClickListener(null);
            activityC13570xd6b9f257.L.d(false, true, false, true);
            hashMap.put("card_clk_type", 5);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            return;
        }
        if (itemId == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchUI", "do tag, long click info is %s", java.lang.Integer.valueOf(i18));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_fav_scene", 4);
            intent.putExtra("key_fav_item_id", item.f67645x88be67a1);
            o72.x1.L0(activityC13570xd6b9f257.mo55332x76847179(), ".ui.FavTagEditUI", intent, null);
            o72.z2.a("FavTagEditUI");
            activityC13570xd6b9f257.b7(7, i18);
            hashMap.put("card_clk_type", 3);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            return;
        }
        if (itemId != 3) {
            if (itemId != 4) {
                if (itemId != 5) {
                    return;
                }
                activityC13570xd6b9f257.f181933n.n(view, i18, item);
                activityC13570xd6b9f257.b7(8, i18);
                return;
            }
            r45.dq0 dq0Var = new r45.dq0();
            dq0Var.f454192m = 1;
            ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(activityC13570xd6b9f257.mo55332x76847179(), item, dq0Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchUI", "do transmit, long click info is %s", java.lang.Integer.valueOf(i18));
        activityC13570xd6b9f257.K = item;
        activityC13570xd6b9f257.K = item.m150781x5a5dd5d();
        hashMap.put("card_clk_type", 2);
        aVar.a("fav_page_card_operation", "view_clk", hashMap);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(activityC13570xd6b9f257.K);
        if (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.r7(linkedList, activityC13570xd6b9f257, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z4(this), true, true)) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.g(activityC13570xd6b9f257.mo55332x76847179(), 4106, activityC13570xd6b9f257.f181933n, activityC13570xd6b9f257.K);
            activityC13570xd6b9f257.b7(3, i18);
        }
    }
}
