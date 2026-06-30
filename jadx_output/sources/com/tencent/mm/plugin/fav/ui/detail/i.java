package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.j f100735d;

    public i(com.tencent.mm.plugin.fav.ui.detail.j jVar) {
        this.f100735d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.detail.j jVar = this.f100735d;
        db5.e1.i(jVar.f100741d.getContext(), com.tencent.mm.R.string.k7_, com.tencent.mm.R.string.k7u);
        com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI = jVar.f100741d;
        android.graphics.Bitmap i17 = com.tencent.mm.plugin.fav.ui.ra.i(favoriteFileDetailUI.F, favoriteFileDetailUI.E);
        android.widget.ImageView imageView = (android.widget.ImageView) jVar.f100741d.findViewById(com.tencent.mm.R.id.f487566p12);
        if (imageView != null) {
            imageView.setImageBitmap(i17);
            imageView.setVisibility(0);
        }
    }
}
