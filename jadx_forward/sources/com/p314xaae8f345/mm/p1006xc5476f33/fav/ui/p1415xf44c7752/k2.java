package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2 f182524d;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2 l2Var) {
        this.f182524d = l2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(21);
        java.util.List I7 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().I7(null, null, arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll] Found %d items in database", java.lang.Integer.valueOf(I7.size()));
        if (I7.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll] No image/video data found in database");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2 l2Var = this.f182524d;
        java.util.List a17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2.a(l2Var, I7);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = ((java.util.ArrayList) a17).iterator();
        while (it.hasNext()) {
            linkedList.addAll(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2.b(l2Var, (o72.r2) it.next()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll] Converted to %d media items", java.lang.Integer.valueOf(linkedList.size()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.j2(this, linkedList));
    }
}
