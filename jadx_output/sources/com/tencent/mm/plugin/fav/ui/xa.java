package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class xa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavoriteIndexUI f101607d;

    public xa(com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI) {
        this.f101607d = favoriteIndexUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavoriteIndexUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_fav_search_from", 0);
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = this.f101607d;
        if (intValue == 20) {
            com.tencent.mm.plugin.fav.ui.ec.d(favoriteIndexUI.getContext(), intent);
        } else {
            intent.putExtra("key_preset_search_type", intValue);
            androidx.appcompat.app.AppCompatActivity context = favoriteIndexUI.getContext();
            if (favoriteIndexUI.T.f100484q) {
                intent.putExtra("key_search_type", 2);
                o72.x1.M0(context, ".ui.FavFilterUI", intent, 4103, null);
            } else {
                o72.x1.L0(context, ".ui.FavFilterUI", intent, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
