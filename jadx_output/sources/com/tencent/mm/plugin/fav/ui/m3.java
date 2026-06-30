package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f101268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavImgGalleryUI f101269e;

    public m3(com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI, android.app.Dialog dialog) {
        this.f101269e = favImgGalleryUI;
        this.f101268d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f101268d.dismiss();
        com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI = this.f101269e;
        com.tencent.mm.ui.widget.snackbar.j.c(favImgGalleryUI.getString(com.tencent.mm.R.string.c9u), null, favImgGalleryUI, null, null);
    }
}
