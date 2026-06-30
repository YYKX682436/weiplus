package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class s3 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavImgGalleryUI f101433d;

    public s3(com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI) {
        this.f101433d = favImgGalleryUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI = this.f101433d;
        favImgGalleryUI.f100361h = null;
        ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) favImgGalleryUI.f100368r).n();
    }
}
