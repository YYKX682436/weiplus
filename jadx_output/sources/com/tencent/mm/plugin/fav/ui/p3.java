package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class p3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavImgGalleryUI f101333d;

    public p3(com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI) {
        this.f101333d = favImgGalleryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f101333d.f100363m.a(true);
        return true;
    }
}
