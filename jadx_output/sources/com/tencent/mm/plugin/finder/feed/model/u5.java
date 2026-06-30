package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class u5 extends com.tencent.mm.plugin.finder.feed.model.internal.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader f108396d;

    public u5(com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader finderPoiTimelineLoader) {
        this.f108396d = finderPoiTimelineLoader;
    }

    public static final void b(com.tencent.mm.plugin.finder.feed.model.u5 u5Var, db2.l2 l2Var, com.tencent.mm.modelbase.f fVar, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var) {
        if (fVar == null) {
            com.tencent.mars.xlog.Log.e(u5Var.getTAG(), "cgiBack is null");
            return;
        }
        u5Var.getClass();
        r45.zo2 zo2Var = (r45.zo2) fVar.f70618d;
        if (zo2Var == null) {
            com.tencent.mars.xlog.Log.e(u5Var.getTAG(), "cgiBack?.resp is null");
            return;
        }
        boolean z17 = (fVar.f70615a == 0 && fVar.f70616b == 0 && zo2Var.getInteger(3) == 0) ? false : true;
        com.tencent.mm.plugin.finder.feed.model.r5 r5Var = new com.tencent.mm.plugin.finder.feed.model.r5(fVar.f70615a, fVar.f70616b, fVar.f70617c);
        com.tencent.mm.protobuf.f fVar2 = l2Var.f70646f.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPoiStreamResponse");
        java.util.LinkedList list = ((r45.zo2) fVar2).getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(cu2.u.f222441a.p(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a((com.tencent.mm.protocal.protobuf.FinderObject) it.next(), 33040)));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            r45.dm2 object_extend = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) next).getFeedObject().getFeedObject().getObject_extend();
            if ((object_extend != null ? (r45.jq4) object_extend.getCustom(54) : null) == null) {
                arrayList2.add(next);
            }
        }
        r5Var.setIncrementList(arrayList2);
        cu2.t tVar = cu2.u.f222441a;
        com.tencent.mm.protobuf.f fVar3 = l2Var.f70646f.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPoiStreamResponse");
        java.util.LinkedList list2 = ((r45.zo2) fVar3).getList(1);
        kotlin.jvm.internal.o.f(list2, "getObject(...)");
        tVar.j(list2, 33040, u5Var.f108396d.getContextObj());
        if (l2Var.f228056w != 2) {
            java.util.List incrementList = r5Var.getIncrementList();
            kotlin.jvm.internal.o.e(incrementList, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed>");
            tVar.m(incrementList, 33040, "", true);
        }
        java.lang.String tag = u5Var.getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List incrementList2 = r5Var.getIncrementList();
        sb6.append(incrementList2 != null ? java.lang.Integer.valueOf(incrementList2.size()) : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        r5Var.setPullType(l2Var.f228056w);
        com.tencent.mm.protobuf.f fVar4 = l2Var.f70646f.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPoiStreamResponse");
        r5Var.setLastBuffer(((r45.zo2) fVar4).getByteString(2));
        r5Var.setHasMore(z17);
        n0Var.onFetchDone(r5Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.r5 r5Var = new com.tencent.mm.plugin.finder.feed.model.r5(0, 0, "");
        com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader finderPoiTimelineLoader = this.f108396d;
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderPoiTimelineLoader.getCache();
        r5Var.setIncrementList(cache != null ? cache.f108300a : null);
        com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderPoiTimelineLoader.getCache();
        r5Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        r5Var.setPullType(1000);
        callback.onFetchDone(r5Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader finderPoiTimelineLoader = this.f108396d;
        r45.f96 f96Var = finderPoiTimelineLoader.f107554d;
        zy2.o9 o9Var = finderPoiTimelineLoader.f107555e;
        if (f96Var == null || o9Var == null) {
            return;
        }
        db2.l2 l2Var = new db2.l2(f96Var, o9Var, finderPoiTimelineLoader.getLastBuffer(), finderPoiTimelineLoader.f107556f, null, finderPoiTimelineLoader.f107558h, 0, 0L, null, com.tencent.mm.plugin.appbrand.jsapi.share.r1.CTRL_INDEX, null);
        l2Var.f228056w = 2;
        l2Var.l().K(new com.tencent.mm.plugin.finder.feed.model.s5(this, l2Var, callback));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchRefresh(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader finderPoiTimelineLoader = this.f108396d;
        r45.f96 f96Var = finderPoiTimelineLoader.f107554d;
        zy2.o9 o9Var = finderPoiTimelineLoader.f107555e;
        if (f96Var == null || o9Var == null) {
            return;
        }
        db2.l2 l2Var = new db2.l2(f96Var, o9Var, finderPoiTimelineLoader.getLastBuffer(), finderPoiTimelineLoader.f107556f, null, finderPoiTimelineLoader.f107558h, 0, 0L, null, com.tencent.mm.plugin.appbrand.jsapi.share.r1.CTRL_INDEX, null);
        l2Var.f228056w = 0;
        l2Var.l().K(new com.tencent.mm.plugin.finder.feed.model.t5(this, l2Var, callback));
    }
}
