package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI f100794d;

    public t(com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI) {
        this.f100794d = favoriteFileDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.f100607y0;
        com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI = this.f100794d;
        java.lang.String c76 = favoriteFileDetailUI.c7();
        if (4 == favoriteFileDetailUI.d7()) {
            favoriteFileDetailUI.P = false;
            favoriteFileDetailUI.k7();
        } else {
            com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.Z6(favoriteFileDetailUI, c76);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
