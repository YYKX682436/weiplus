package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class z implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI f101117d;

    public z(com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI) {
        this.f101117d = favMediaGalleryUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        this.f101117d.f100875i = null;
    }
}
