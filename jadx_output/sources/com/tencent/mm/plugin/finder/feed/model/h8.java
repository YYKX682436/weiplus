package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class h8 extends com.tencent.mm.plugin.finder.feed.model.m8 {

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f107914i;

    /* renamed from: m, reason: collision with root package name */
    public im5.c f107915m;

    /* renamed from: n, reason: collision with root package name */
    public final int f107916n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f107917o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f107918p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader, eb2.m0 streamFetcher, com.tencent.mm.plugin.finder.feed.model.internal.m0 scene) {
        super(finderTimelineFeedLoader, streamFetcher, scene);
        kotlin.jvm.internal.o.g(streamFetcher, "streamFetcher");
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f107918p = finderTimelineFeedLoader;
        this.f107914i = jz5.h.b(com.tencent.mm.plugin.finder.feed.model.g8.f107888d);
        this.f107916n = com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62;
        this.f107917o = jz5.h.b(com.tencent.mm.plugin.finder.feed.model.f8.f107860d);
    }

    public static final java.lang.String c(com.tencent.mm.plugin.finder.feed.model.h8 h8Var, r45.jd1 jd1Var) {
        h8Var.getClass();
        return "lon=" + jd1Var.getFloat(0) + ",lat=" + jd1Var.getFloat(1) + ",time=" + jd1Var.getInteger(2);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.m8, db2.u3
    public void a(com.tencent.mm.plugin.finder.feed.model.d info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.f107918p;
        r45.qt2 contextObj = finderTimelineFeedLoader.getContextObj();
        finderTimelineFeedLoader.f(contextObj != null ? contextObj.getInteger(5) : 0, info.f107767e);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.m8, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void alive() {
        super.alive();
        this.f107915m = new im5.c();
    }

    public final com.tencent.mm.plugin.finder.feed.model.o8 d(int i17, java.lang.Object obj, com.tencent.mm.modelbase.f fVar) {
        r45.id1 id1Var;
        com.tencent.mm.plugin.finder.feed.model.o8 o8Var = new com.tencent.mm.plugin.finder.feed.model.o8(fVar.f70615a, fVar.f70616b, fVar.f70617c, null, 8, null);
        boolean b17 = fVar.b();
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.f107918p;
        if (b17) {
            java.util.LinkedList list = ((r45.b71) fVar.f70618d).getList(1);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj2;
                kotlin.jvm.internal.o.d(finderObject);
                if (hc2.o0.C(finderObject)) {
                    arrayList.add(obj2);
                }
            }
            java.util.List j17 = cu2.u.f222441a.j(arrayList, hc2.d0.d(finderTimelineFeedLoader.f107652h.f250822g), finderTimelineFeedLoader.getContextObj());
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(j17, 10));
            java.util.Iterator it = ((java.util.ArrayList) j17).iterator();
            while (it.hasNext()) {
                arrayList2.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()));
            }
            java.util.LinkedList linkedList = new java.util.LinkedList(arrayList2);
            if (!arrayList.isEmpty()) {
                cu2.u.f222441a.m(linkedList, this.f107916n, "", o8Var.getIsNeedClear());
            }
            o8Var.setIncrementList(linkedList);
            o8Var.setPullType(i17);
            o8Var.setLastBuffer(((r45.b71) fVar.f70618d).getByteString(2));
            o8Var.setHasMore(((r45.b71) fVar.f70618d).getInteger(3) != 0);
            o8Var.setRequest(obj);
            java.util.List incrementList = o8Var.getIncrementList();
            if (incrementList != null) {
                r45.qt2 contextObj = finderTimelineFeedLoader.getContextObj();
                finderTimelineFeedLoader.f(contextObj != null ? contextObj.getInteger(5) : 0, incrementList);
            }
            r45.id1 id1Var2 = (r45.id1) ((r45.b71) fVar.f70618d).getCustom(4);
            java.util.ArrayList arrayList3 = null;
            java.lang.Integer valueOf = id1Var2 != null ? java.lang.Integer.valueOf(id1Var2.getInteger(0)) : null;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LBS_SAMECITY_SWITCH_CONFIG_INT_SYNC, java.lang.Integer.valueOf(valueOf != null ? valueOf.intValue() : 0));
            r45.b71 b71Var = (r45.b71) fVar.f70618d;
            if (b71Var != null && (id1Var = (r45.id1) b71Var.getCustom(4)) != null) {
                int integer = id1Var.getInteger(1);
                i95.m c17 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((cq.k) c17).f221228i = java.lang.Integer.valueOf(integer);
            }
            java.lang.String tag = getTAG();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lbsStreamFetchImpl(tabType=");
            sb6.append(finderTimelineFeedLoader.f107652h.f250822g);
            sb6.append(") success,cityConfig=");
            sb6.append(valueOf);
            sb6.append(",respList=");
            java.util.List incrementList2 = o8Var.getIncrementList();
            if (incrementList2 != null) {
                arrayList3 = new java.util.ArrayList(kz5.d0.q(incrementList2, 10));
                java.util.Iterator it6 = incrementList2.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(hc2.b0.f((so2.j5) it6.next(), true));
                }
            }
            sb6.append(arrayList3);
            com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        } else {
            com.tencent.mars.xlog.Log.i(getTAG(), "lbsStreamFetchImpl(tabType=" + finderTimelineFeedLoader.f107652h.f250822g + ") fail,errType=" + fVar.f70615a + ",errCode=" + fVar.f70616b + ",errMsg=" + fVar.f70617c);
        }
        return o8Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.m8, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void dead() {
        super.dead();
        im5.c cVar = this.f107915m;
        if (cVar != null) {
            cVar.dead();
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.m8, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (obj instanceof com.tencent.mm.plugin.finder.feed.model.n8) {
            com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore finderStreamTabPreloadCore = (com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class);
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.f107918p;
            bs2.n1 R6 = finderStreamTabPreloadCore.R6(finderTimelineFeedLoader.f107652h.f250822g);
            jz5.f0 f0Var = null;
            bs2.a0 a0Var = R6 instanceof bs2.a0 ? (bs2.a0) R6 : null;
            com.tencent.mm.modelbase.f B = a0Var != null ? a0Var.B() : null;
            if (a0Var != null) {
                a0Var.b();
            }
            if (a0Var != null) {
                a0Var.e(true, "request_" + ((com.tencent.mm.plugin.finder.feed.model.n8) obj).f108212a);
            }
            if (B != null) {
                com.tencent.mm.plugin.finder.feed.model.n8 n8Var = (com.tencent.mm.plugin.finder.feed.model.n8) obj;
                com.tencent.mm.plugin.finder.feed.model.o8 d17 = d(n8Var.f108212a, obj, B);
                callback.onFetchDone(d17);
                com.tencent.mars.xlog.Log.i(getTAG(), "lbsStreamFetch pullType=" + n8Var.f108212a + " end with preload(lbsSameCityPreloadSuccess)," + d17);
                return;
            }
            com.tencent.mm.plugin.finder.feed.model.d8 d8Var = new com.tencent.mm.plugin.finder.feed.model.d8(this, finderTimelineFeedLoader, obj, callback);
            java.lang.String tag = getTAG();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lbsStreamFetch pullType=");
            com.tencent.mm.plugin.finder.feed.model.n8 n8Var2 = (com.tencent.mm.plugin.finder.feed.model.n8) obj;
            sb6.append(n8Var2.f108212a);
            sb6.append(" task=");
            sb6.append(d8Var);
            com.tencent.mars.xlog.Log.i(tag, sb6.toString());
            if (n8Var2.f108218g && n8Var2.f108212a == 1 && ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.r1().r()).booleanValue()) {
                com.tencent.mars.xlog.Log.i(getTAG(), "[lbsStreamRequestClear] pullType=" + n8Var2.f108212a + " clear request.");
                fp0.b bVar = this.f108183f;
                if (bVar != null) {
                    bVar.reset();
                }
                this.f108183f = b();
            }
            fp0.b bVar2 = this.f108183f;
            if (bVar2 != null) {
                bVar2.b(((java.lang.Boolean) ((jz5.n) this.f108184g).getValue()).booleanValue() ? new mn2.k3(d8Var, null, 2, null) : new fp0.r(d8Var, null, 2, null));
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e(getTAG(), "fetchRefresh err,taskExecutor=" + this.f108183f);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.m8, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i(getTAG(), "lbsStreamFetchInit...");
        super.fetchInit(callback);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.m8, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i(getTAG(), "lbsStreamFetchLoadMore...");
        com.tencent.mm.plugin.finder.feed.model.n8 n8Var = new com.tencent.mm.plugin.finder.feed.model.n8(2, null, 2, null);
        n8Var.f108217f = this.f107918p.f107664w;
        fetch(n8Var, callback, z17);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.m8, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchRefresh(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.f107918p;
        int i17 = finderTimelineFeedLoader.f107649e;
        com.tencent.mm.plugin.finder.feed.model.n8 n8Var = new com.tencent.mm.plugin.finder.feed.model.n8(i17, null, 2, null);
        n8Var.f108212a = i17;
        if (i17 == 0) {
            finderTimelineFeedLoader.f107649e = 1;
        }
        com.tencent.mars.xlog.Log.i(getTAG(), "lbsStreamFetchRefresh pullType=" + n8Var.f108212a);
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this, n8Var, callback, false, 4, null);
    }
}
