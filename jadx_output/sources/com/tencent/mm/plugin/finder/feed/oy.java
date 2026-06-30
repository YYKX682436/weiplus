package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class oy extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f108685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc2.a f108686e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy(com.tencent.mm.plugin.finder.feed.pz pzVar, fc2.a aVar) {
        super(0);
        this.f108685d = pzVar;
        this.f108686e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fc2.a aVar;
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f108685d;
        java.util.ArrayList dataListJustForAdapter = pzVar.C.getDataListJustForAdapter();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = dataListJustForAdapter.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (next instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                arrayList.add(next);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            aVar = this.f108686e;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it6.next();
            if (((com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj).getItemId() == ((fc2.t) aVar).f260992k) {
                break;
            }
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
        pf5.u uVar = pf5.u.f353936a;
        if (baseFinderFeed2 != null) {
            java.lang.String u17 = pm0.v.u(baseFinderFeed2.getFeedObject().getId());
            ey2.b1 b1Var = (ey2.b1) uVar.e(c61.l7.class).a(ey2.b1.class);
            java.lang.String[] strArr = {u17};
            b1Var.getClass();
            try {
                c66.q.f39493a.d().deleteObjects(ni0.d.f337207d.in((java.lang.String[]) java.util.Arrays.copyOf(strArr, 1)));
                ((kk.l) ((jz5.n) c66.q.f39501i).getValue()).remove(strArr[0]);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("removeLocalBackupFeedWithTidArray success, tidArray = ");
                java.lang.String arrays = java.util.Arrays.toString(strArr);
                kotlin.jvm.internal.o.f(arrays, "toString(...)");
                sb6.append(arrays);
                com.tencent.mars.xlog.Log.i("Finder.WCFinderWCDB", sb6.toString());
            } catch (java.lang.Exception unused) {
                java.lang.String arrays2 = java.util.Arrays.toString(strArr);
                kotlin.jvm.internal.o.f(arrays2, "toString(...)");
                com.tencent.mars.xlog.Log.e("Finder.WCFinderWCDB", "removeLocalBackupFeedWithTidArray fail, tidArray = ".concat(arrays2));
            }
            b1Var.P6();
        }
        fc2.t tVar = (fc2.t) aVar;
        java.lang.String str = pzVar.U;
        int i17 = pzVar.f108762p;
        if (i17 != 4 || hc2.e.a()) {
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = pzVar.C;
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader2 = finderTimelineFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader ? finderTimelineFeedLoader : null;
            if (finderTimelineFeedLoader2 == null || finderTimelineFeedLoader2.f107659r < com.tencent.mm.plugin.finder.storage.t70.f127590a.M0().f126615c) {
                long j17 = tVar.f260992k;
                int i18 = tVar.f260987f;
                in5.n0 T0 = pzVar.T0();
                int itemCount = T0 != null ? T0.getItemCount() - T0.a0() : 0;
                boolean z17 = itemCount > 0 && i18 + 1 == itemCount;
                java.util.Iterator it7 = finderTimelineFeedLoader.getDataListJustForAdapter().iterator();
                int i19 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        i19 = -1;
                        break;
                    }
                    if (((so2.j5) it7.next()).getItemId() == j17) {
                        break;
                    }
                    i19++;
                }
                int i27 = i19;
                if (!z17 || i27 < 0) {
                    baseFinderFeed = null;
                } else {
                    ey2.i iVar = (ey2.i) uVar.e(c61.l7.class).a(ey2.i.class);
                    java.util.RandomAccess sourceList = finderTimelineFeedLoader.getDataListJustForAdapter();
                    iVar.getClass();
                    kotlin.jvm.internal.o.g(sourceList, "sourceList");
                    baseFinderFeed = ((ey2.b1) uVar.e(c61.l7.class).a(ey2.b1.class)).N6(2, hc2.d0.b(i17));
                    if (baseFinderFeed != null) {
                        baseFinderFeed.N1(4);
                    }
                    com.tencent.mars.xlog.Log.i("FinderBackupFeedListVM", "getBackupFeed tabType:" + i17 + " feed:" + hc2.b0.h(baseFinderFeed, false, 1, null) + " list:" + hc2.b0.h(baseFinderFeed, false, 1, null) + '}');
                    if (baseFinderFeed != null) {
                        baseFinderFeed.X0(true);
                        baseFinderFeed.G1(9);
                        finderTimelineFeedLoader.getDataListJustForAdapter().add(baseFinderFeed);
                        ((com.tencent.mm.plugin.finder.feed.dw) pzVar.G).onItemRangeInserted(i27 + 1, 1);
                        finderTimelineFeedLoader.f107659r++;
                    }
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkAutoInsertBackupFeed ");
                sb7.append(hc2.b0.b(tVar.f260996o, i27));
                sb7.append(" isAutoInsert:");
                sb7.append(z17);
                sb7.append(" index:");
                sb7.append(i27);
                sb7.append(" firstVisible:");
                sb7.append(i18);
                sb7.append(" itemCount:");
                sb7.append(itemCount);
                sb7.append(" isAutoLoadingMore:");
                sb7.append(pzVar.B1);
                sb7.append(" backupFeed:");
                sb7.append(baseFinderFeed != null ? hc2.b0.h(baseFinderFeed, false, 1, null) : null);
                com.tencent.mars.xlog.Log.i(str, sb7.toString());
            }
        } else {
            com.tencent.mars.xlog.Log.i(str, "skip checkAutoInsertBackupFeed");
        }
        if (tVar.f260985d == 5) {
            java.util.List list = pzVar.J1;
            r45.lx2 lx2Var = pzVar.K1;
            if (list != null && lx2Var != null) {
                pzVar.f1(list, lx2Var, false);
            }
        }
        return jz5.f0.f302826a;
    }
}
