package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f101080d;

    public t(com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI, android.app.Dialog dialog) {
        this.f101080d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f101080d.dismiss();
    }
}
