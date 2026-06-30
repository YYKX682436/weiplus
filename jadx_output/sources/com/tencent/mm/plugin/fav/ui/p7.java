package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class p7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.z7 f101337d;

    public p7(com.tencent.mm.plugin.fav.ui.z7 z7Var) {
        this.f101337d = z7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavTopFilter$initInputPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fav.ui.z7 z7Var = this.f101337d;
        android.view.View view2 = z7Var.f101662h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopFilter$initInputPanel$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavTopFilter$initInputPanel$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = z7Var.f101656b;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopFilter$initInputPanel$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/fav/ui/FavTopFilter$initInputPanel$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        z7Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "[showSoftInput]");
        z7Var.f101668n.toggleSoftInput(0, 2);
        z7Var.f101661g.q();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "[mRlSearchClick], context.currentFocus = " + z7Var.f101655a + ".currentFocus");
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.ui.MMActivity mMActivity = z7Var.f101655a;
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = mMActivity instanceof com.tencent.mm.plugin.fav.ui.FavoriteIndexUI ? (com.tencent.mm.plugin.fav.ui.FavoriteIndexUI) mMActivity : null;
        java.lang.String str = favoriteIndexUI != null ? favoriteIndexUI.Y : null;
        if (str == null) {
            str = "";
        }
        hashMap.put("fav_homepage_sessionid", str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_search_input", "view_clk", hashMap, 32903);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavTopFilter$initInputPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
