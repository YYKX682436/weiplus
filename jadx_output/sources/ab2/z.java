package ab2;

/* loaded from: classes2.dex */
public final class z extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader f2800d;

    public z(com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader finderBizProfileLoader) {
        this.f2800d = finderBizProfileLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mars.xlog.Log.i(getTAG(), "fetchInit initCount ");
        ab2.a0 a0Var = new ab2.a0(0, 0, "");
        com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader finderBizProfileLoader = this.f2800d;
        if (finderBizProfileLoader.f102769e) {
            com.tencent.mm.plugin.finder.feed.model.r9 cache = finderBizProfileLoader.getCache();
            a0Var.setIncrementList(cache != null ? cache.f108300a : null);
            com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderBizProfileLoader.getCache();
            a0Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        } else {
            bu2.d0 d0Var = bu2.e0.f24498a;
            finderBizProfileLoader.getClass();
            a0Var.setIncrementList(d0Var.h(21, finderBizProfileLoader.f102768d));
        }
        return a0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        java.util.ArrayList arrayList = null;
        if (!(iVar instanceof bq.z1)) {
            return null;
        }
        boolean z17 = (i17 == 0 && i18 == 0) ? ((bq.z1) iVar).f23548z : true;
        ab2.a0 a0Var = new ab2.a0(i17, i18, str);
        bq.z1 z1Var = (bq.z1) iVar;
        java.util.List list = z1Var.f23547y;
        if (list != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()));
            }
        }
        a0Var.setIncrementList(arrayList);
        a0Var.setPullType(z1Var.B);
        a0Var.setHasMore(z17);
        a0Var.setLastBuffer(z1Var.E());
        if (z1Var.B == 1) {
            int i19 = z1Var.H;
            com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader finderBizProfileLoader = this.f2800d;
            finderBizProfileLoader.f102775n = i19;
            finderBizProfileLoader.f102774m = z1Var.G;
        }
        return a0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader finderBizProfileLoader = this.f2800d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed d17 = finderBizProfileLoader.d();
        return new bq.z1("", d17 != null ? d17.getItemId() : 0L, finderBizProfileLoader.getLastBuffer(), 2, finderBizProfileLoader.getContextObj(), 0, 0L, false, finderBizProfileLoader.f102768d, finderBizProfileLoader.f102771g, null, null, null, finderBizProfileLoader.f102770f, false, null, false, null, null, d17 != null ? d17.w() : null, 515296, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader finderBizProfileLoader = this.f2800d;
        return new bq.z1("", 0L, null, 1, finderBizProfileLoader.getContextObj(), 0, 0L, false, finderBizProfileLoader.f102768d, finderBizProfileLoader.f102771g, null, null, null, finderBizProfileLoader.f102770f, false, null, false, null, null, null, 1039584, null);
    }
}
