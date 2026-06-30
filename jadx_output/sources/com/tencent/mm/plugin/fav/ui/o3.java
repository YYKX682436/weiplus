package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class o3 implements com.tencent.mm.ui.tools.p5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavImgGalleryUI f101315a;

    public o3(com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI) {
        this.f101315a = favImgGalleryUI;
    }

    @Override // com.tencent.mm.ui.tools.p5
    public void a() {
        com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI = this.f101315a;
        if (favImgGalleryUI.f100367q.f101302d == 1 || favImgGalleryUI.isFinishing() || favImgGalleryUI.activityHasDestroyed()) {
            return;
        }
        c01.l2 c17 = c01.n2.d().c("basescanui@datacenter", true);
        c17.i("key_basescanui_screen_position", java.lang.Boolean.TRUE);
        c17.i("key_basescanui_screen_x", java.lang.Float.valueOf(favImgGalleryUI.f100358e.getXDown()));
        c17.i("key_basescanui_screen_y", java.lang.Float.valueOf(favImgGalleryUI.f100358e.getYDown()));
        int i17 = favImgGalleryUI.f100367q.f101302d;
        if (i17 == 0 || i17 == 2) {
            favImgGalleryUI.U6(com.tencent.mm.plugin.scanner.k1.c());
        } else {
            favImgGalleryUI.U6(false);
        }
    }
}
