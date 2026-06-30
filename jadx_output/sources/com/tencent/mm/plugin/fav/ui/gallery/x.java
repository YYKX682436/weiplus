package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class x implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI f101100d;

    public x(com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI) {
        this.f101100d = favMediaGalleryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI.C;
        this.f101100d.T6();
        return true;
    }
}
