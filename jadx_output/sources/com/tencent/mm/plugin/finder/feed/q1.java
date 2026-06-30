package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class q1 extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f108787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f108788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f108789c;

    public q1(r45.qt2 qt2Var, yz5.l lVar, yz5.l lVar2) {
        this.f108787a = qt2Var;
        this.f108788b = lVar;
        this.f108789c = lVar2;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onExposeTimeRecorded: size = ");
        sb6.append(recordsSet.size());
        sb6.append(", commentScene=");
        r45.qt2 qt2Var = this.f108787a;
        sb6.append(qt2Var.getInteger(5));
        com.tencent.mars.xlog.Log.i("Finder.FinderBaseGridFeedUIContract.ViewCallback", sb6.toString());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = recordsSet.iterator();
        while (it.hasNext()) {
            in5.j jVar = (in5.j) it.next();
            if (jVar.f293070a instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                r45.ni4 ni4Var = new r45.ni4();
                in5.c cVar = jVar.f293070a;
                kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar;
                linkedList2.add(baseFinderFeed);
                ni4Var.set(0, java.lang.Long.valueOf(baseFinderFeed.getItemId()));
                ni4Var.set(15, baseFinderFeed.w());
                ni4Var.set(6, java.lang.Integer.valueOf(jVar.f293074e));
                so2.h3.f410392d.f(ni4Var, qt2Var.getInteger(5), qt2Var.getInteger(7));
                ni4Var.set(5, java.lang.Integer.valueOf((int) jVar.f293073d));
                ni4Var.set(4, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(baseFinderFeed.getItemId(), baseFinderFeed.w(), qt2Var.getInteger(5)));
                linkedList.add(ni4Var);
                yz5.l lVar = this.f108788b;
                if (lVar != null) {
                    lVar.invoke(jVar);
                }
                qt2Var.getInteger(5);
                baseFinderFeed.getFeedObject().getFeedObject().getNickname();
                pm0.v.u(baseFinderFeed.getItemId());
            }
        }
        so2.h3.f410392d.e(linkedList, linkedList2, qt2Var, -1);
    }

    @Override // in5.p
    public void d(in5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        in5.c cVar = item.f293070a;
        if (cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar;
            r45.qt2 qt2Var = this.f108787a;
            qt2Var.getInteger(5);
            baseFinderFeed.getFeedObject().getFeedObject().getNickname();
            pm0.v.u(baseFinderFeed.getItemId());
            r45.ni4 ni4Var = new r45.ni4();
            ni4Var.set(0, java.lang.Long.valueOf(baseFinderFeed.getItemId()));
            ni4Var.set(15, baseFinderFeed.w());
            ni4Var.set(6, java.lang.Integer.valueOf(item.f293074e));
            ni4Var.set(4, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(baseFinderFeed.getItemId(), baseFinderFeed.w(), qt2Var.getInteger(5)));
            ni4Var.set(11, 1);
            yz5.l lVar = this.f108789c;
            if (lVar != null) {
                lVar.invoke(item);
            }
            so2.h3 h3Var = so2.h3.f410392d;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(ni4Var);
            h3Var.d(linkedList);
        }
    }
}
