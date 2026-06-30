package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class ca implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.da f100550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f100551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f100552f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f100553g;

    public ca(com.tencent.mm.plugin.fav.ui.da daVar, int i17, java.util.HashMap hashMap, android.view.View view) {
        this.f100550d = daVar;
        this.f100551e = i17;
        this.f100552f = hashMap;
        this.f100553g = view;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int i18;
        com.tencent.mm.plugin.fav.ui.da daVar = this.f100550d;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = daVar.f100583n;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        int headerViewsCount = daVar.R6().getHeaderViewsCount();
        int i19 = this.f100551e;
        o72.r2 item = cVar.getItem(i19 - headerViewsCount);
        int itemId = menuItem.getItemId();
        v82.a aVar = v82.a.f434066a;
        android.view.View view = this.f100553g;
        java.util.HashMap hashMap = this.f100552f;
        if (itemId == 0) {
            hashMap.put("card_clk_type", 4);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            if (i19 < daVar.R6().getHeaderViewsCount()) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "do delete, long click info is %s (isExistDetail:%s)", java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(item.B1));
            if (item.B1) {
                com.tencent.mm.plugin.fav.ui.da.O6(daVar, view, i19, item);
                return;
            } else {
                db5.e1.B(daVar.getContext(), i65.a.r(daVar.getContext(), com.tencent.mm.R.string.c_h), "", i65.a.r(daVar.getContext(), com.tencent.mm.R.string.f490367t0), i65.a.r(daVar.getContext(), com.tencent.mm.R.string.baz), new com.tencent.mm.plugin.fav.ui.aa(item, daVar), null, com.tencent.mm.R.color.f479482a31);
                return;
            }
        }
        if (itemId == 1) {
            hashMap.put("card_clk_type", 5);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "do edit, long click info is %s", java.lang.Integer.valueOf(i19));
            if (item == null) {
                i18 = 1;
            } else {
                com.tencent.mm.plugin.fav.ui.adapter.c cVar2 = daVar.f100583n;
                if (cVar2 == null) {
                    kotlin.jvm.internal.o.o("mResultAdapter");
                    throw null;
                }
                i18 = 1;
                cVar2.g(true, item);
                daVar.R6().setOnItemLongClickListener(null);
                w82.k kVar = daVar.f100588s;
                if (kVar != null) {
                    kVar.d(false, false, false, true);
                }
            }
            if (daVar.getActivity() instanceof com.tencent.mm.plugin.fav.ui.FavBaseUI) {
                androidx.appcompat.app.AppCompatActivity activity = daVar.getActivity();
                kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.FavBaseUI");
                ((com.tencent.mm.plugin.fav.ui.FavBaseUI) activity).Z6(i18);
                return;
            }
            return;
        }
        if (itemId == 2) {
            hashMap.put("card_clk_type", 3);
            aVar.a("fav_page_card_operation", "view_clk", hashMap);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "do tag, long click info is %s", java.lang.Integer.valueOf(i19));
            android.content.Intent intent = new android.content.Intent(daVar.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.fav.ui.FavTagEditUI.class);
            intent.putExtra("key_fav_scene", 4);
            intent.putExtra("key_fav_item_id", item.field_localId);
            android.app.Activity context = daVar.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(305);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC$showLongClickMenu$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            o72.z2.a("FavTagEditUI");
            return;
        }
        if (itemId != 3) {
            if (itemId == 4) {
                r45.dq0 dq0Var = new r45.dq0();
                dq0Var.f372659m = 1;
                ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(daVar.getContext(), item, dq0Var);
                return;
            }
            if (itemId != 5) {
                return;
            }
            com.tencent.mm.plugin.fav.ui.adapter.c cVar3 = daVar.f100583n;
            if (cVar3 != null) {
                cVar3.n(view, i19, item);
                return;
            } else {
                kotlin.jvm.internal.o.o("mResultAdapter");
                throw null;
            }
        }
        hashMap.put("card_clk_type", 2);
        aVar.a("fav_page_card_operation", "view_clk", hashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "do transmit, long click info is %s", java.lang.Integer.valueOf(i19));
        daVar.f100587r = item;
        daVar.f100587r = item.clone();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        o72.r2 r2Var = daVar.f100587r;
        kotlin.jvm.internal.o.d(r2Var);
        linkedList.add(r2Var);
        if (com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.r7(linkedList, daVar.getContext(), new com.tencent.mm.plugin.fav.ui.ba(daVar), true, true)) {
            android.app.Activity context2 = daVar.getContext();
            com.tencent.mm.plugin.fav.ui.adapter.c cVar4 = daVar.f100583n;
            if (cVar4 != null) {
                com.tencent.mm.plugin.fav.ui.ec.g(context2, 4106, cVar4, daVar.f100587r);
            } else {
                kotlin.jvm.internal.o.o("mResultAdapter");
                throw null;
            }
        }
    }
}
