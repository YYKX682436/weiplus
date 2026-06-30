package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class d7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.z7 f100574d;

    public d7(com.tencent.mm.plugin.fav.ui.z7 z7Var) {
        this.f100574d = z7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavTopFilter$handleDownMenu$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "[handleDownMenu] click, show menu");
        com.tencent.mm.plugin.fav.ui.z7 z7Var = this.f100574d;
        z7Var.f101661g.f();
        z7Var.f101661g.post(new com.tencent.mm.plugin.fav.ui.c7(z7Var));
        z7Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.ui.MMActivity mMActivity = z7Var.f101655a;
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = mMActivity instanceof com.tencent.mm.plugin.fav.ui.FavoriteIndexUI ? (com.tencent.mm.plugin.fav.ui.FavoriteIndexUI) mMActivity : null;
        java.lang.String str = favoriteIndexUI != null ? favoriteIndexUI.Y : null;
        if (str == null) {
            str = "";
        }
        hashMap.put("fav_homepage_sessionid", str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_filter_unfold", "view_clk", hashMap, 32903);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavTopFilter$handleDownMenu$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
