package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f182511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f182512e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2 f182513f;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2 l2Var, boolean z17, int i17) {
        this.f182513f = l2Var;
        this.f182511d = z17;
        this.f182512e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f182511d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2 l2Var = this.f182513f;
        if (z17) {
            l2Var.f182527b.clear();
            l2Var.f182535j = 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(21);
            l2Var.f182534i = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().I7(null, null, arrayList);
            l2Var.f182533h = l2Var.f182534i.size();
        }
        int i17 = Integer.MAX_VALUE;
        int i18 = this.f182512e;
        if (i18 >= 0) {
            int i19 = l2Var.f182533h;
            if (i19 - i18 > Integer.MAX_VALUE) {
                i17 = i19 - i18;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "offset:%s limit:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (linkedList.size() < i17 && l2Var.f182535j < l2Var.f182534i.size()) {
            int i27 = l2Var.f182535j;
            int i28 = i27 + i17;
            if (i28 > l2Var.f182534i.size()) {
                i28 = l2Var.f182534i.size();
            }
            java.util.List a17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2.a(l2Var, l2Var.f182534i.subList(i27, i28));
            l2Var.f182535j = i28;
            java.util.Iterator it = ((java.util.ArrayList) a17).iterator();
            while (it.hasNext()) {
                linkedList.addAll(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2.b(l2Var, (o72.r2) it.next()));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "traverse until size ok. start:%s, end:%s, idListSize:%s, limit:%s, linklistSize:%s", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(l2Var.f182534i.size()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(linkedList.size()));
        }
        int size = linkedList.size();
        l2Var.f182527b.addAll(0, linkedList);
        linkedList.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[loadData] %s", java.lang.Integer.valueOf(l2Var.f182527b.size()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h2(this, size));
    }
}
