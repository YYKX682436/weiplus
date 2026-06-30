package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f101214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavImgGalleryUI f101215e;

    public k3(com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI, int i17) {
        this.f101215e = favImgGalleryUI;
        this.f101214d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI = this.f101215e;
        int i17 = this.f101214d;
        if (i17 != -1) {
            favImgGalleryUI.f100358e.setSelection(i17);
            favImgGalleryUI.f100357d = i17;
            return;
        }
        int i18 = favImgGalleryUI.f100357d;
        if (i18 - 1 >= 0 && i18 - 1 < favImgGalleryUI.f100360g.size()) {
            int i19 = favImgGalleryUI.f100357d;
            favImgGalleryUI.f100360g.size();
            favImgGalleryUI.f100358e.setSelection(favImgGalleryUI.f100357d - 1);
            favImgGalleryUI.f100357d--;
            return;
        }
        if (favImgGalleryUI.f100360g.size() <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavImgGalleryUI", "data list size %d, empty, finish", java.lang.Integer.valueOf(favImgGalleryUI.f100360g.size()));
            favImgGalleryUI.finish();
        } else {
            favImgGalleryUI.f100360g.size();
            favImgGalleryUI.f100358e.setSelection(0);
            favImgGalleryUI.f100357d = 0;
        }
    }
}
