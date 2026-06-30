package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.l2 f100991d;

    public k2(com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var) {
        this.f100991d = l2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(21);
        java.util.List I7 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().I7(null, null, arrayList);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll] Found %d items in database", java.lang.Integer.valueOf(I7.size()));
        if (I7.size() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll] No image/video data found in database");
            return;
        }
        com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var = this.f100991d;
        java.util.List a17 = com.tencent.mm.plugin.fav.ui.gallery.l2.a(l2Var, I7);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = ((java.util.ArrayList) a17).iterator();
        while (it.hasNext()) {
            linkedList.addAll(com.tencent.mm.plugin.fav.ui.gallery.l2.b(l2Var, (o72.r2) it.next()));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll] Converted to %d media items", java.lang.Integer.valueOf(linkedList.size()));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.ui.gallery.j2(this, linkedList));
    }
}
