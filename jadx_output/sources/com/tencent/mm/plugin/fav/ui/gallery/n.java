package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.o f101015d;

    public n(com.tencent.mm.plugin.fav.ui.gallery.o oVar, int i17) {
        this.f101015d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.fav.ui.gallery.o oVar = this.f101015d;
        com.tencent.mm.plugin.fav.ui.gallery.a aVar = oVar.f101021e;
        int i17 = oVar.f101026m;
        ((com.tencent.mm.plugin.fav.ui.gallery.u0) aVar).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryUI", "[BatchSave] Progress: $currentIndex/$totalCount");
    }
}
