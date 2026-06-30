package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.e2 f101074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI f101075e;

    public s(com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI, o72.e2 e2Var) {
        this.f101075e = favMediaGalleryUI;
        this.f101074d = e2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI = this.f101075e;
        android.view.View selectedView = favMediaGalleryUI.f100872f.getSelectedView();
        if (selectedView == null || selectedView.getTag() == null || !(selectedView.getTag() instanceof com.tencent.mm.plugin.fav.ui.gallery.g0)) {
            return;
        }
        com.tencent.mm.plugin.fav.ui.gallery.g0 g0Var = (com.tencent.mm.plugin.fav.ui.gallery.g0) selectedView.getTag();
        o72.e2 e2Var = this.f101074d;
        int i17 = e2Var.field_totalLen > 0 ? ((e2Var.field_offset * 100) / r3) - 1 : 0;
        int i18 = i17 >= 0 ? i17 : 0;
        g0Var.f100927d.setProgress(i18);
        g0Var.f100928e.setText(i18 + "%");
        if (i18 >= 100 || e2Var.w0()) {
            favMediaGalleryUI.f100873g.notifyDataSetChanged();
        }
    }
}
