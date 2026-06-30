package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class w implements com.tencent.mm.ui.tools.p5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI f101090a;

    public w(com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI) {
        this.f101090a = favMediaGalleryUI;
    }

    @Override // com.tencent.mm.ui.tools.p5
    public void a() {
        com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI = this.f101090a;
        if (favMediaGalleryUI.isFinishing() || favMediaGalleryUI.activityHasDestroyed()) {
            return;
        }
        int i17 = com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI.C;
        if (!favMediaGalleryUI.U6()) {
            favMediaGalleryUI.V6(false);
            return;
        }
        int i18 = favMediaGalleryUI.f100884u.f101302d;
        if (i18 == 1) {
            return;
        }
        if (i18 == 0 || i18 == 2) {
            favMediaGalleryUI.V6(com.tencent.mm.plugin.scanner.k1.c());
        } else {
            favMediaGalleryUI.V6(false);
        }
    }
}
