package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes8.dex */
public class g implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI f100721d;

    public g(com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI) {
        this.f100721d = favoriteFileDetailUI;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$12", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI = this.f100721d;
        if (favoriteFileDetailUI.V == null) {
            favoriteFileDetailUI.V = new rl5.r(favoriteFileDetailUI.getContext());
        }
        com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI2 = this.f100721d;
        favoriteFileDetailUI2.V.h(view, favoriteFileDetailUI2, favoriteFileDetailUI2.Y, favoriteFileDetailUI2.W, favoriteFileDetailUI2.X);
        yj0.a.i(true, this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$12", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
