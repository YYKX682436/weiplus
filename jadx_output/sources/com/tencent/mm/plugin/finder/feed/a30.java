package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class a30 extends com.tencent.mm.plugin.finder.feed.model.internal.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader f106197d;

    public a30(com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader nativeDramaGridLoader) {
        this.f106197d = nativeDramaGridLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader nativeDramaGridLoader = this.f106197d;
        java.util.List list = nativeDramaGridLoader.f106167f.N6(nativeDramaGridLoader.f106166e).f257443c;
        kotlin.jvm.internal.o.d(list);
        if (!list.isEmpty()) {
            eb2.c0 c0Var = new eb2.c0(0, 0, "");
            c0Var.setIncrementList(new java.util.ArrayList(list));
            c0Var.setPullType(1000);
            eb2.e0 e0Var = nativeDramaGridLoader.f106165d;
            com.tencent.mm.protobuf.g gVar = nativeDramaGridLoader.f106167f.N6(nativeDramaGridLoader.f106166e).f257451k;
            e0Var.f250736e = gVar != null ? gVar.i() : null;
            c0Var.setHasMore(true);
            com.tencent.mars.xlog.Log.i(getTAG(), "fetchInit from tlCache, size=" + list.size());
            callback.onFetchDone(c0Var);
            return;
        }
        java.util.List i17 = bu2.d0.i(bu2.e0.f24498a, 37, null, 2, null);
        if (!(!i17.isEmpty())) {
            com.tencent.mars.xlog.Log.i(getTAG(), "fetchInit cacheDataSize=" + list.size());
            com.tencent.mm.plugin.finder.feed.model.o8 o8Var = new com.tencent.mm.plugin.finder.feed.model.o8(0, 0, "", null, 8, null);
            o8Var.setPullType(1000);
            callback.onFetchDone(o8Var);
            return;
        }
        eb2.c0 c0Var2 = new eb2.c0(0, 0, "");
        c0Var2.setIncrementList(new java.util.ArrayList(i17));
        c0Var2.setPullType(1000);
        c0Var2.setHasMore(true);
        java.lang.Object m17 = gm0.j1.u().c().m(hc2.d0.c(nativeDramaGridLoader.f106166e), "");
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) m17;
        nativeDramaGridLoader.f106165d.f250736e = str.length() == 0 ? null : str;
        com.tencent.mars.xlog.Log.i(getTAG(), "fetchInit from FinderPage cache, size=" + ((java.util.LinkedList) i17).size() + " nextPageBuffer " + str);
        callback.onFetchDone(c0Var2);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f106197d.f106165d.fetchLoadMore(callback, z17);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchRefresh(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i(getTAG(), "fetchRefresh");
        if (this.f106197d.f106165d.f250738g == 0) {
            bs2.w wVar = ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class)).f122544f;
            com.tencent.mm.modelbase.f fVar = null;
            fVar = null;
            r1 = null;
            java.lang.Integer num = null;
            if (wVar != null) {
                java.util.concurrent.locks.ReentrantLock reentrantLock = wVar.f23965c;
                reentrantLock.lock();
                try {
                    com.tencent.mm.modelbase.f b17 = wVar.b();
                    if (b17 == null) {
                        com.tencent.mars.xlog.Log.i("Finder.NativeDramaTabPreloadWorker", "requestDramaCache: cache miss/expired, respTime=" + wVar.f23968f + " isLoading=" + wVar.f23969g);
                        wVar.f23970h = true;
                    } else {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestDramaCache: hit size=");
                        r45.wj2 wj2Var = (r45.wj2) b17.f70618d;
                        if (wj2Var != null && (list = wj2Var.getList(1)) != null) {
                            num = java.lang.Integer.valueOf(list.size());
                        }
                        sb6.append(num);
                        com.tencent.mars.xlog.Log.i("Finder.NativeDramaTabPreloadWorker", sb6.toString());
                        wVar.a("requestDramaCache");
                        fVar = b17;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            java.lang.String tag = getTAG();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("fetchRefresh preloadCache=");
            sb7.append(fVar != null);
            com.tencent.mars.xlog.Log.i(tag, sb7.toString());
            if (fVar != null) {
                this.f106197d.f106165d.f250736e = ((r45.wj2) fVar.f70618d).getString(2);
                eb2.e0 e0Var = this.f106197d.f106165d;
                java.lang.String string = ((r45.wj2) fVar.f70618d).getString(2);
                e0Var.f250737f = !(string == null || string.length() == 0);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.LinkedList<r45.jt4> list2 = ((r45.wj2) fVar.f70618d).getList(1);
                kotlin.jvm.internal.o.f(list2, "getRecommend_item_info(...)");
                com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader nativeDramaGridLoader = this.f106197d;
                for (r45.jt4 jt4Var : list2) {
                    eb2.e0 e0Var2 = nativeDramaGridLoader.f106165d;
                    kotlin.jvm.internal.o.d(jt4Var);
                    com.tencent.mm.plugin.finder.feed.model.d5 b18 = e0Var2.b(jt4Var);
                    if (b18 != null) {
                        b18.f107792d.set(2, java.lang.Long.valueOf(((r45.wj2) fVar.f70618d).getLong(3)));
                        arrayList.add(b18);
                    }
                }
                eb2.c0 c0Var = new eb2.c0(fVar.f70615a, fVar.f70616b, fVar.f70617c);
                c0Var.setIncrementList(arrayList);
                java.lang.String string2 = ((r45.wj2) fVar.f70618d).getString(2);
                c0Var.setHasMore(!(string2 == null || string2.length() == 0));
                c0Var.setPullType(0);
                com.tencent.mars.xlog.Log.i(getTAG(), "fetchRefresh from preloadCache size=" + arrayList.size() + " nextPageBuffer " + this.f106197d.f106165d.f250736e);
                callback.onFetchDone(c0Var);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(getTAG(), "fetchRefresh from CGI");
        this.f106197d.f106165d.fetchRefresh(callback);
    }
}
