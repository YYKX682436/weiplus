package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public final class ca implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da f182083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f182084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f182085f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f182086g;

    public ca(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar, int i17, java.util.HashMap hashMap, android.view.View view) {
        this.f182083d = daVar;
        this.f182084e = i17;
        this.f182085f = hashMap;
        this.f182086g = view;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar = this.f182083d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = daVar.f182116n;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
        int headerViewsCount = daVar.R6().getHeaderViewsCount();
        int i19 = this.f182084e;
        o72.r2 item = cVar.getItem(i19 - headerViewsCount);
        int itemId = menuItem.getItemId();
        v82.a aVar = v82.a.f515599a;
        android.view.View view = this.f182086g;
        java.util.HashMap hashMap = this.f182085f;
        if (itemId == 0) {
            hashMap.put("card_clk_type", 4);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            if (i19 < daVar.R6().getHeaderViewsCount()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchManager", "do delete, long click info is %s (isExistDetail:%s)", java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(item.B1));
            if (item.B1) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da.O6(daVar, view, i19, item);
                return;
            } else {
                db5.e1.B(daVar.m80379x76847179(), i65.a.r(daVar.m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.c_h), "", i65.a.r(daVar.m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0), i65.a.r(daVar.m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.baz), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.aa(item, daVar), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31);
                return;
            }
        }
        if (itemId == 1) {
            hashMap.put("card_clk_type", 5);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchManager", "do edit, long click info is %s", java.lang.Integer.valueOf(i19));
            if (item == null) {
                i18 = 1;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar2 = daVar.f182116n;
                if (cVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
                    throw null;
                }
                i18 = 1;
                cVar2.g(true, item);
                daVar.R6().setOnItemLongClickListener(null);
                w82.k kVar = daVar.f182121s;
                if (kVar != null) {
                    kVar.d(false, false, false, true);
                }
            }
            if (daVar.m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = daVar.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.FavBaseUI");
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800) m158354x19263085).Z6(i18);
                return;
            }
            return;
        }
        if (itemId == 2) {
            hashMap.put("card_clk_type", 3);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchManager", "do tag, long click info is %s", java.lang.Integer.valueOf(i19));
            android.content.Intent intent = new android.content.Intent(daVar.m80379x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d.class);
            intent.putExtra("key_fav_scene", 4);
            intent.putExtra("key_fav_item_id", item.f67645x88be67a1);
            android.app.Activity m80379x76847179 = daVar.m80379x76847179();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(305);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(m80379x76847179, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC$showLongClickMenu$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            o72.z2.a("FavTagEditUI");
            return;
        }
        if (itemId != 3) {
            if (itemId == 4) {
                r45.dq0 dq0Var = new r45.dq0();
                dq0Var.f454192m = 1;
                ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(daVar.m80379x76847179(), item, dq0Var);
                return;
            }
            if (itemId != 5) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar3 = daVar.f182116n;
            if (cVar3 != null) {
                cVar3.n(view, i19, item);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
                throw null;
            }
        }
        hashMap.put("card_clk_type", 2);
        aVar.a("fav_page_card_operation", "view_clk", hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchManager", "do transmit, long click info is %s", java.lang.Integer.valueOf(i19));
        daVar.f182120r = item;
        daVar.f182120r = item.m150781x5a5dd5d();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        o72.r2 r2Var = daVar.f182120r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2Var);
        linkedList.add(r2Var);
        if (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.r7(linkedList, daVar.m80379x76847179(), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ba(daVar), true, true)) {
            android.app.Activity m80379x768471792 = daVar.m80379x76847179();
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar4 = daVar.f182116n;
            if (cVar4 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.g(m80379x768471792, 4106, cVar4, daVar.f182120r);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
                throw null;
            }
        }
    }
}
