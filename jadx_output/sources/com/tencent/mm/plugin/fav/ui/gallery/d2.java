package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.l2 f100909d;

    public d2(com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var) {
        this.f100909d = l2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "uiCallback()");
        this.f100909d.e(true, -1);
    }
}
