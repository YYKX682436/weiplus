package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.e2 f101238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavImgGalleryUI f101239e;

    public l3(com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI, o72.e2 e2Var) {
        this.f101239e = favImgGalleryUI;
        this.f101238d = e2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI = this.f101239e;
        android.view.View selectedView = favImgGalleryUI.f100358e.getSelectedView();
        if (selectedView == null) {
            return;
        }
        com.tencent.mm.plugin.fav.ui.z3 z3Var = (com.tencent.mm.plugin.fav.ui.z3) selectedView.getTag();
        o72.e2 e2Var = this.f101238d;
        int i17 = e2Var.field_totalLen > 0 ? ((e2Var.field_offset * 100) / r3) - 1 : 0;
        int i18 = i17 >= 0 ? i17 : 0;
        z3Var.f101644d.setProgress(i18);
        z3Var.f101645e.setText(i18 + "%");
        if (i18 >= 100 || e2Var.w0()) {
            favImgGalleryUI.f100359f.notifyDataSetChanged();
        }
    }
}
