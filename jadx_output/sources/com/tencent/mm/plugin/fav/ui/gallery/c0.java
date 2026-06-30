package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes5.dex */
public class c0 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI f100902a;

    public c0(com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI) {
        this.f100902a = favMediaGalleryUI;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        java.lang.Object[] objArr = {q75.c.e()};
        com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI = this.f100902a;
        dp.a.makeText(favMediaGalleryUI, favMediaGalleryUI.getString(com.tencent.mm.R.string.f491022bm2, objArr), 1).show();
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI = this.f100902a;
        dp.a.makeText(favMediaGalleryUI, favMediaGalleryUI.getString(com.tencent.mm.R.string.ccq), 1).show();
    }
}
