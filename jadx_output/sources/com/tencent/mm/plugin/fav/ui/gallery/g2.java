package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f100932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f100933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f100934f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f100935g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f100936h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.l2 f100937i;

    public g2(com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var, boolean z17, java.util.List list, java.util.List list2, java.util.List list3, int i17) {
        this.f100937i = l2Var;
        this.f100932d = z17;
        this.f100933e = list;
        this.f100934f = list2;
        this.f100935g = list3;
        this.f100936h = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        boolean z17 = this.f100932d;
        int i17 = 0;
        com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var = this.f100937i;
        if (z17) {
            l2Var.f100994b.clear();
            l2Var.f101002j = 0;
            l2Var.f101001i = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().I7(this.f100933e, this.f100934f, this.f100935g);
            l2Var.f101000h = l2Var.f101001i.size();
        }
        int i18 = Integer.MAX_VALUE;
        int i19 = this.f100936h;
        if (i19 >= 0) {
            int i27 = l2Var.f101000h;
            if (i27 - i19 > Integer.MAX_VALUE) {
                i18 = i27 - i19;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "offset:%s limit:%s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (linkedList.size() < i18 && l2Var.f101002j < l2Var.f101001i.size()) {
            int i28 = l2Var.f101002j;
            int i29 = i28 + i18;
            if (i29 > l2Var.f101001i.size()) {
                i29 = l2Var.f101001i.size();
            }
            java.util.List a17 = com.tencent.mm.plugin.fav.ui.gallery.l2.a(l2Var, l2Var.f101001i.subList(i28, i29));
            l2Var.f101002j = i29;
            java.util.Iterator it = ((java.util.ArrayList) a17).iterator();
            long j18 = -1;
            while (it.hasNext()) {
                java.util.List b17 = com.tencent.mm.plugin.fav.ui.gallery.l2.b(l2Var, (o72.r2) it.next());
                int i37 = i17;
                while (true) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) b17;
                    if (i37 < arrayList.size()) {
                        com.tencent.mm.plugin.fav.ui.gallery.o1 o1Var = (com.tencent.mm.plugin.fav.ui.gallery.o1) arrayList.get(i37);
                        com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var2 = l2Var;
                        long a18 = com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(o1Var.f101038d));
                        if (a18 != j18) {
                            j17 = a18;
                            linkedList.add(new com.tencent.mm.plugin.fav.ui.gallery.o1(o1Var.f101038d));
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
            com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var3 = l2Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "traverse until size ok. start:%s, end:%s, idListSize:%s, limit:%s, linklistSize:%s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(l2Var3.f101001i.size()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(linkedList.size()));
            l2Var = l2Var3;
            i17 = 0;
        }
        com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var4 = l2Var;
        int size = linkedList.size();
        l2Var4.f100994b.addAll(0, linkedList);
        linkedList.clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[loadData] %s", java.lang.Integer.valueOf(l2Var4.f100994b.size()));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.ui.gallery.f2(this, size));
    }
}
