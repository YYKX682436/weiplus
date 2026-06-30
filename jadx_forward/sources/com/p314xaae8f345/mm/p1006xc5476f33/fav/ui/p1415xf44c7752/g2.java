package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f182465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f182466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f182467f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f182468g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f182469h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2 f182470i;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2 l2Var, boolean z17, java.util.List list, java.util.List list2, java.util.List list3, int i17) {
        this.f182470i = l2Var;
        this.f182465d = z17;
        this.f182466e = list;
        this.f182467f = list2;
        this.f182468g = list3;
        this.f182469h = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        boolean z17 = this.f182465d;
        int i17 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2 l2Var = this.f182470i;
        if (z17) {
            l2Var.f182527b.clear();
            l2Var.f182535j = 0;
            l2Var.f182534i = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().I7(this.f182466e, this.f182467f, this.f182468g);
            l2Var.f182533h = l2Var.f182534i.size();
        }
        int i18 = Integer.MAX_VALUE;
        int i19 = this.f182469h;
        if (i19 >= 0) {
            int i27 = l2Var.f182533h;
            if (i27 - i19 > Integer.MAX_VALUE) {
                i18 = i27 - i19;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "offset:%s limit:%s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (linkedList.size() < i18 && l2Var.f182535j < l2Var.f182534i.size()) {
            int i28 = l2Var.f182535j;
            int i29 = i28 + i18;
            if (i29 > l2Var.f182534i.size()) {
                i29 = l2Var.f182534i.size();
            }
            java.util.List a17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2.a(l2Var, l2Var.f182534i.subList(i28, i29));
            l2Var.f182535j = i29;
            java.util.Iterator it = ((java.util.ArrayList) a17).iterator();
            long j18 = -1;
            while (it.hasNext()) {
                java.util.List b17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2.b(l2Var, (o72.r2) it.next());
                int i37 = i17;
                while (true) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) b17;
                    if (i37 < arrayList.size()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o1 o1Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o1) arrayList.get(i37);
                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2 l2Var2 = l2Var;
                        long a18 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(o1Var.f182571d));
                        if (a18 != j18) {
                            j17 = a18;
                            linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o1(o1Var.f182571d));
                        } else {
                            j17 = a18;
                        }
                        linkedList.add(o1Var);
                        i37++;
                        l2Var = l2Var2;
                        j18 = j17;
                        i17 = 0;
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2 l2Var3 = l2Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "traverse until size ok. start:%s, end:%s, idListSize:%s, limit:%s, linklistSize:%s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(l2Var3.f182534i.size()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(linkedList.size()));
            l2Var = l2Var3;
            i17 = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2 l2Var4 = l2Var;
        int size = linkedList.size();
        l2Var4.f182527b.addAll(0, linkedList);
        linkedList.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[loadData] %s", java.lang.Integer.valueOf(l2Var4.f182527b.size()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.f2(this, size));
    }
}
