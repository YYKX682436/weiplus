package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f100978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f100979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.l2 f100980f;

    public i2(com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var, boolean z17, int i17) {
        this.f100980f = l2Var;
        this.f100978d = z17;
        this.f100979e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f100978d;
        com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var = this.f100980f;
        if (z17) {
            l2Var.f100994b.clear();
            l2Var.f101002j = 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(21);
            l2Var.f101001i = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().I7(null, null, arrayList);
            l2Var.f101000h = l2Var.f101001i.size();
        }
        int i17 = Integer.MAX_VALUE;
        int i18 = this.f100979e;
        if (i18 >= 0) {
            int i19 = l2Var.f101000h;
            if (i19 - i18 > Integer.MAX_VALUE) {
                i17 = i19 - i18;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "offset:%s limit:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (linkedList.size() < i17 && l2Var.f101002j < l2Var.f101001i.size()) {
            int i27 = l2Var.f101002j;
            int i28 = i27 + i17;
            if (i28 > l2Var.f101001i.size()) {
                i28 = l2Var.f101001i.size();
            }
            java.util.List a17 = com.tencent.mm.plugin.fav.ui.gallery.l2.a(l2Var, l2Var.f101001i.subList(i27, i28));
            l2Var.f101002j = i28;
            java.util.Iterator it = ((java.util.ArrayList) a17).iterator();
            while (it.hasNext()) {
                linkedList.addAll(com.tencent.mm.plugin.fav.ui.gallery.l2.b(l2Var, (o72.r2) it.next()));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "traverse until size ok. start:%s, end:%s, idListSize:%s, limit:%s, linklistSize:%s", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(l2Var.f101001i.size()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(linkedList.size()));
        }
        int size = linkedList.size();
        l2Var.f100994b.addAll(0, linkedList);
        linkedList.clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[loadData] %s", java.lang.Integer.valueOf(l2Var.f100994b.size()));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.ui.gallery.h2(this, size));
    }
}
