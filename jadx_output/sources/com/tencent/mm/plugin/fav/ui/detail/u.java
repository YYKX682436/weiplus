package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes8.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI f100799e;

    public u(com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI, java.lang.String str) {
        this.f100799e = favoriteFileDetailUI;
        this.f100798d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI = this.f100799e;
        int i17 = favoriteFileDetailUI.E.field_id;
        long j17 = favoriteFileDetailUI.E.field_localId;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f100798d);
        intent.putExtra("is_favorite_item", true);
        intent.putExtra("fav_local_id", favoriteFileDetailUI.E.field_localId);
        intent.putExtra("geta8key_scene", 14);
        intent.putExtra("geta8key_scene", 14);
        j45.l.j(favoriteFileDetailUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
