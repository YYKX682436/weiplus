package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f100906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI f100907e;

    public d0(com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI, int i17) {
        this.f100907e = favMediaGalleryUI;
        this.f100906d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI = this.f100907e;
        int i17 = this.f100906d;
        if (i17 != -1) {
            favMediaGalleryUI.f100872f.setSelection(i17);
            favMediaGalleryUI.f100870d = i17;
            return;
        }
        int i18 = favMediaGalleryUI.f100870d;
        if (i18 - 1 >= 0 && i18 - 1 < favMediaGalleryUI.f100874h.size()) {
            int i19 = favMediaGalleryUI.f100870d;
            favMediaGalleryUI.f100874h.size();
            favMediaGalleryUI.f100872f.setSelection(favMediaGalleryUI.f100870d - 1);
            favMediaGalleryUI.f100870d--;
            return;
        }
        if (favMediaGalleryUI.f100874h.size() <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavMediaGalleryUI", "data list size %d, empty, finish", java.lang.Integer.valueOf(favMediaGalleryUI.f100874h.size()));
            favMediaGalleryUI.finish();
        } else {
            favMediaGalleryUI.f100874h.size();
            favMediaGalleryUI.f100872f.setSelection(0);
            favMediaGalleryUI.f100870d = 0;
        }
    }
}
