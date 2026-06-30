package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ep extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f106665d;

    /* renamed from: e, reason: collision with root package name */
    public int f106666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.FinderProfileTemplateLoader f106667f;

    public ep(com.tencent.mm.plugin.finder.feed.FinderProfileTemplateLoader finderProfileTemplateLoader) {
        this.f106667f = finderProfileTemplateLoader;
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderProfileTemplateLoader.getCache();
        this.f106665d = cache != null ? cache.f108301b : null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.plugin.finder.feed.dp dpVar = (i17 == 0 && i18 == 0) ? com.tencent.mm.plugin.finder.feed.dp.f106581e : com.tencent.mm.plugin.finder.feed.dp.f106582f;
        com.tencent.mm.plugin.finder.feed.FinderProfileTemplateLoader finderProfileTemplateLoader = this.f106667f;
        finderProfileTemplateLoader.getClass();
        finderProfileTemplateLoader.f106107e = dpVar;
        java.util.ArrayList arrayList = null;
        if (!(fVar instanceof r45.cp3) || i17 != 0 || i18 != 0) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.cp cpVar = new com.tencent.mm.plugin.finder.feed.cp(finderProfileTemplateLoader, i17, i18, str);
        r45.cp3 cp3Var = (r45.cp3) fVar;
        java.util.LinkedList<r45.r03> list = cp3Var.getList(1);
        if (list != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (r45.r03 r03Var : list) {
                kotlin.jvm.internal.o.d(r03Var);
                arrayList.add(new so2.d5(r03Var));
            }
        }
        cpVar.setIncrementList(arrayList);
        cpVar.setHasMore(cp3Var.getInteger(3) != 0);
        cpVar.setNeedClear(this.f106666e == 0);
        cpVar.setPullType(this.f106666e);
        this.f106665d = cp3Var.getByteString(2);
        return cpVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.FinderProfileTemplateLoader finderProfileTemplateLoader = this.f106667f;
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderProfileTemplateLoader.getCache();
        if (cache == null || (obj = cache.f108300a) == null) {
            obj = kz5.p0.f313996d;
        }
        com.tencent.mars.xlog.Log.i(getTAG(), "[fetchInit] ret=" + obj);
        com.tencent.mm.plugin.finder.feed.cp cpVar = new com.tencent.mm.plugin.finder.feed.cp(finderProfileTemplateLoader, 0, 0, "");
        cpVar.setIncrementList(obj);
        com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderProfileTemplateLoader.getCache();
        cpVar.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        cpVar.setPullType(1000);
        callback.onFetchDone(cpVar);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f106666e = 2;
        super.fetchLoadMore(callback, z17);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        return new bq.x0(db2.t4.f228171a.a(10923), this.f106667f.f106106d, this.f106665d);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        db2.t4 t4Var = db2.t4.f228171a;
        com.tencent.mm.plugin.finder.feed.FinderProfileTemplateLoader finderProfileTemplateLoader = this.f106667f;
        return new bq.x0(t4Var.b(10923, finderProfileTemplateLoader.getContextObj()), finderProfileTemplateLoader.f106106d, this.f106665d);
    }
}
