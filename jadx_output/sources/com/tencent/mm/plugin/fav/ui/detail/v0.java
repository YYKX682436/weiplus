package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI f100805d;

    public v0(com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI) {
        this.f100805d = favoriteImgDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.gp0 gp0Var = (r45.gp0) view.getTag();
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI = this.f100805d;
        intent.putExtra("key_detail_info_id", favoriteImgDetailUI.f100627o.field_localId);
        intent.putExtra("key_detail_data_id", gp0Var.T);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_media_gallery_ui_fav", "0").equals("1")) {
            try {
                pf5.j0.a(intent, bi5.a.class);
                o72.x1.L0(favoriteImgDetailUI.getContext(), "com.tencent.mm.ui.media.MediaGalleryContainerUI", intent, null);
            } catch (java.lang.ClassNotFoundException unused) {
            }
        } else {
            o72.x1.L0(favoriteImgDetailUI.getContext(), ".ui.FavImgGalleryUI", intent, null);
        }
        favoriteImgDetailUI.f100600g.f343486k++;
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
