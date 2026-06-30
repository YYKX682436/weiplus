package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class fz implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f106790e;

    public fz(com.tencent.mm.plugin.finder.feed.pz pzVar, long j17) {
        this.f106789d = pzVar;
        this.f106790e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Collection listOfType = this.f106789d.C.getListOfType(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class);
        java.util.LinkedList<jz5.l> linkedList = new java.util.LinkedList();
        long j17 = this.f106790e;
        synchronized (listOfType) {
            int i17 = 0;
            for (java.lang.Object obj : listOfType) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
                if ((baseFinderFeed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && baseFinderFeed.getFeedObject().getId() == j17) {
                    linkedList.add(0, new jz5.l(java.lang.Integer.valueOf(i17), baseFinderFeed));
                }
                i17 = i18;
            }
        }
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f106789d;
        for (jz5.l lVar : linkedList) {
            pzVar.C.getDataListJustForAdapter().remove(lVar.f302834e);
            ((com.tencent.mm.plugin.finder.feed.dw) pzVar.G).onItemRangeRemoved(((java.lang.Number) lVar.f302833d).intValue(), 1);
        }
    }
}
