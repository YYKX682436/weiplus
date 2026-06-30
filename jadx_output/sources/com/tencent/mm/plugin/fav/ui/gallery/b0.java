package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes5.dex */
public class b0 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI f100896b;

    public b0(com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI, java.lang.String str) {
        this.f100896b = favMediaGalleryUI;
        this.f100895a = str;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaGalleryUI", "save video now video path %s out path %s", this.f100895a, str2);
        com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI = this.f100896b;
        dp.a.makeText(favMediaGalleryUI.getContext(), favMediaGalleryUI.getString(com.tencent.mm.R.string.k7b, q75.c.c(str2)), 1).show();
        q75.c.f(str2, favMediaGalleryUI.getContext());
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaGalleryUI", "save video now video path %s out path %s", this.f100895a, str2);
        com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI = this.f100896b;
        dp.a.makeText(favMediaGalleryUI.getContext(), favMediaGalleryUI.getString(com.tencent.mm.R.string.k7a), 1).show();
    }
}
