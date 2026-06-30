package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class s2 extends com.tencent.mm.plugin.finder.feed.model.internal.p0 {

    /* renamed from: d, reason: collision with root package name */
    public fp0.t f108309d;

    /* renamed from: e, reason: collision with root package name */
    public eb2.b0 f108310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader f108311f;

    public s2(com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader finderLbsLoader) {
        this.f108311f = finderLbsLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void alive() {
        super.alive();
        com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader finderLbsLoader = this.f108311f;
        this.f108310e = new eb2.b0(2, finderLbsLoader.getContextObj());
        fp0.t tVar = new fp0.t("FinderFollowTlSingleExecutor");
        tVar.e();
        this.f108309d = tVar;
        finderLbsLoader.getContextObj();
        td2.a aVar = td2.a.f417618d;
        td2.a aVar2 = td2.a.f417618d;
        td2.a aVar3 = td2.a.f417618d;
        td2.a aVar4 = td2.a.f417618d;
        new eb2.w(2);
        new im5.c();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void dead() {
        im5.c cVar;
        super.dead();
        eb2.b0 b0Var = this.f108310e;
        if (b0Var != null && (cVar = b0Var.f250718m) != null) {
            cVar.dead();
        }
        fp0.t tVar = this.f108309d;
        if (tVar != null) {
            tVar.reset();
        }
        this.f108309d = null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        fp0.t tVar;
        kotlin.jvm.internal.o.g(callback, "callback");
        if (!(obj instanceof com.tencent.mm.plugin.finder.feed.model.o2) || (tVar = this.f108309d) == null) {
            return;
        }
        tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.feed.model.r2(this, obj, this.f108311f, callback), null, 2, null));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        eb2.w wVar;
        com.tencent.mm.protobuf.g gVar;
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            linkedList.addAll(bu2.e0.f24498a.k(9));
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_LBS_SECTION_LASTBUF_STRING_SYNC, "");
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            byte[] h17 = com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m17);
            eb2.b0 b0Var = this.f108310e;
            byte[] bArr = null;
            eb2.w wVar2 = b0Var != null ? b0Var.f250717i : null;
            if (wVar2 != null) {
                wVar2.f250858b = com.tencent.mm.protobuf.g.b(h17);
            }
            java.lang.String tag = getTAG();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLbsLoader load init data from FirstPage, size:");
            sb6.append(linkedList.size());
            sb6.append(", lastBuffer:");
            eb2.b0 b0Var2 = this.f108310e;
            if (b0Var2 != null && (wVar = b0Var2.f250717i) != null && (gVar = wVar.f250858b) != null) {
                bArr = gVar.g();
            }
            sb6.append(com.tencent.mm.sdk.platformtools.t8.l(bArr));
            com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(getTAG(), th6, "lxl FinderLbsLoader load init data exception", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.finder.feed.model.n2 n2Var = new com.tencent.mm.plugin.finder.feed.model.n2(0, 0, "");
        n2Var.setPullType(1000);
        n2Var.setIncrementList(linkedList);
        callback.onFetchDone(n2Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this, new com.tencent.mm.plugin.finder.feed.model.o2(2), callback, false, 4, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchRefresh(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this, new com.tencent.mm.plugin.finder.feed.model.o2(4), callback, false, 4, null);
    }
}
