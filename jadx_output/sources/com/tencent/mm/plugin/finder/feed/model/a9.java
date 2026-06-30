package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class a9 extends com.tencent.mm.plugin.finder.feed.model.internal.p0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.internal.n0 f107702d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f107703e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public fp0.t f107704f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader f107705g;

    public a9(com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader) {
        this.f107705g = finderTopicFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void alive() {
        super.alive();
        this.f107705g.f107678q = false;
        fp0.t tVar = new fp0.t("FinderTopicFeedSingleTaskExecutor");
        tVar.e();
        this.f107704f = tVar;
        gm0.j1.d().a(817, this);
    }

    public final void b(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.List incrementList;
        so2.j5 j5Var;
        if (m1Var instanceof db2.t5) {
            boolean remove = this.f107703e.remove(m1Var);
            com.tencent.mars.xlog.Log.i(getTAG(), "isRemoved :" + remove);
            if (remove) {
                com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader = this.f107705g;
                int i19 = finderTopicFeedLoader.f107668d;
                if (i19 == 7 || i19 == 12) {
                    db2.t5 t5Var = (db2.t5) m1Var;
                    if (t5Var.Q() == 7 && t5Var.R() != finderTopicFeedLoader.f107682u) {
                        com.tencent.mars.xlog.Log.i(getTAG(), "activity request ignore not my tab innerTabType:" + finderTopicFeedLoader.f107682u + "  tabType: " + t5Var.R());
                        return;
                    }
                    if (t5Var.Q() == 12) {
                        com.tencent.mm.protobuf.f fVar = t5Var.f228178g.f70710a.f70684a;
                        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListRequest");
                        if (((r45.na1) fVar).getLong(13) != finderTopicFeedLoader.f107680s) {
                            com.tencent.mars.xlog.Log.i(getTAG(), "activity request ignore not my tab innerTabType:" + finderTopicFeedLoader.f107682u + " eventTopicId:" + finderTopicFeedLoader.f107680s + " tabType: " + t5Var.R());
                            return;
                        }
                    }
                    if (t5Var.Q() != 7 && t5Var.Q() != 12) {
                        com.tencent.mars.xlog.Log.i(getTAG(), "other type request if current is activity ignore!! innerTabType:" + finderTopicFeedLoader.f107682u + "  tabType: " + t5Var.R());
                        return;
                    }
                }
                db2.t5 t5Var2 = (db2.t5) m1Var;
                com.tencent.mm.protobuf.f fVar2 = t5Var2.f228178g.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                com.tencent.mm.plugin.finder.feed.model.f9 f9Var = new com.tencent.mm.plugin.finder.feed.model.f9(i17, i18, (r45.r03) ((r45.oa1) fVar2).getCustom(5), str);
                com.tencent.mars.xlog.Log.i(getTAG(), "handleScene errType:" + i17 + " errCode:" + i18);
                if (i17 == 0 && i18 == 0) {
                    com.tencent.mm.modelbase.o oVar = t5Var2.f228178g;
                    com.tencent.mm.protobuf.f fVar3 = oVar.f70711b.f70700a;
                    kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                    f9Var.setLastBuffer(((r45.oa1) fVar3).getByteString(2));
                    com.tencent.mm.protobuf.f fVar4 = oVar.f70711b.f70700a;
                    kotlin.jvm.internal.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                    f9Var.f107862b = ((r45.oa1) fVar4).getLong(4);
                    java.util.LinkedList P = t5Var2.P();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(P, 10));
                    java.util.Iterator it = P.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a((com.tencent.mm.protocal.protobuf.FinderObject) it.next(), 64);
                        com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI.I.put(java.lang.Long.valueOf(a17.getId()), a17);
                        arrayList.add(cu2.u.f222441a.p(a17));
                    }
                    f9Var.setIncrementList(arrayList);
                    java.lang.String tag = getTAG();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleScene incrementList :");
                    java.util.List incrementList2 = f9Var.getIncrementList();
                    sb6.append(incrementList2 != null ? incrementList2.size() : 0);
                    sb6.append(", pullType: ");
                    sb6.append(t5Var2.f228181m);
                    sb6.append(", hasMore: ");
                    sb6.append(t5Var2.O() != 0);
                    com.tencent.mars.xlog.Log.i(tag, sb6.toString());
                    if (t5Var2.f228183o == 4) {
                        java.util.List incrementList3 = f9Var.getIncrementList();
                        if ((incrementList3 != null ? incrementList3.size() : 0) > 0 && (incrementList = f9Var.getIncrementList()) != null && (j5Var = (so2.j5) incrementList.get(0)) != null) {
                            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                            java.lang.String u17 = pm0.v.u(baseFinderFeed.getFeedObject().field_id);
                            r45.o03 N = t5Var2.N();
                            java.lang.Object string = N != null ? N.getString(3) : null;
                            if (string == null) {
                                string = 0;
                            }
                            baseFinderFeed.E1(kotlin.jvm.internal.o.b(u17, string));
                        }
                    }
                    f9Var.setPullType(t5Var2.f228181m);
                    f9Var.setHasMore(t5Var2.O() != 0);
                    com.tencent.mm.protobuf.f fVar5 = oVar.f70711b.f70700a;
                    kotlin.jvm.internal.o.e(fVar5, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                    f9Var.f107863c = (r45.xn5) ((r45.oa1) fVar5).getCustom(7);
                    com.tencent.mm.protobuf.f fVar6 = oVar.f70711b.f70700a;
                    kotlin.jvm.internal.o.e(fVar6, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                    r45.ea5 ea5Var = (r45.ea5) ((r45.oa1) fVar6).getCustom(8);
                    f9Var.f107864d = ea5Var != null ? ea5Var.getString(0) : null;
                    com.tencent.mm.protobuf.f fVar7 = oVar.f70711b.f70700a;
                    kotlin.jvm.internal.o.e(fVar7, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                    r45.r03 r03Var = (r45.r03) ((r45.oa1) fVar7).getCustom(5);
                    f9Var.f107866f = r03Var != null ? (r45.zi2) r03Var.getCustom(10) : null;
                    f9Var.setBgmInfo(t5Var2.N());
                    com.tencent.mm.protobuf.f fVar8 = oVar.f70711b.f70700a;
                    kotlin.jvm.internal.o.e(fVar8, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                    r45.r03 r03Var2 = (r45.r03) ((r45.oa1) fVar8).getCustom(5);
                    f9Var.f107867g = r03Var2 != null ? r03Var2.getInteger(13) : 0;
                    com.tencent.mm.protobuf.f fVar9 = oVar.f70711b.f70700a;
                    kotlin.jvm.internal.o.e(fVar9, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                    r45.r03 r03Var3 = (r45.r03) ((r45.oa1) fVar9).getCustom(5);
                    f9Var.f107868h = r03Var3 != null ? r03Var3.getInteger(15) : 0;
                    getTAG();
                    f9Var.f107865e = t5Var2.f228182n;
                }
                com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var = this.f107702d;
                if (n0Var != null) {
                    n0Var.onFetchDone(f9Var);
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void dead() {
        super.dead();
        fp0.t tVar = this.f107704f;
        if (tVar != null) {
            tVar.reset();
        }
        this.f107704f = null;
        gm0.j1.d().q(817, this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        fp0.t tVar = this.f107704f;
        if (tVar != null) {
            tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.feed.model.z8(obj, this, callback), null, 2, null));
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader = this.f107705g;
        jz5.f0 f0Var = null;
        if (finderTopicFeedLoader.f107684w) {
            com.tencent.mm.plugin.finder.feed.model.r9 cache = finderTopicFeedLoader.getCache();
            if (cache != null) {
                java.lang.String tag = getTAG();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("topic fetchInit size:");
                java.util.ArrayList arrayList = cache.f108300a;
                sb6.append(arrayList.size());
                com.tencent.mars.xlog.Log.i(tag, sb6.toString());
                com.tencent.mm.plugin.finder.feed.model.f9 f9Var = new com.tencent.mm.plugin.finder.feed.model.f9(0, 0, null, "");
                f9Var.setIncrementList(arrayList);
                f9Var.setPullType(1000);
                f9Var.setLastBuffer(cache.f108301b);
                callback.onFetchDone(f9Var);
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                callback.onFetchDone(new com.tencent.mm.plugin.finder.feed.model.internal.b0());
                return;
            }
            return;
        }
        ey2.n2 N6 = finderTopicFeedLoader.f107686y.N6(ey2.p2.f257467g.a(finderTopicFeedLoader.f107680s, finderTopicFeedLoader.f107681t, finderTopicFeedLoader.f107669e, finderTopicFeedLoader.f107671g, finderTopicFeedLoader.f107682u), false);
        java.lang.String tag2 = getTAG();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[fetchInit] topic:");
        r45.r03 r03Var = N6.f257439c;
        sb7.append(r03Var != null ? r03Var.getString(0) : null);
        sb7.append(" size:");
        sb7.append(N6.f257438b.size());
        com.tencent.mars.xlog.Log.i(tag2, sb7.toString());
        if (N6.f257439c == null || !(!N6.f257438b.isEmpty())) {
            callback.onFetchDone(new com.tencent.mm.plugin.finder.feed.model.internal.b0());
            return;
        }
        com.tencent.mm.plugin.finder.feed.model.f9 f9Var2 = new com.tencent.mm.plugin.finder.feed.model.f9(0, 0, N6.f257439c, "");
        f9Var2.setIncrementList(N6.f257438b);
        f9Var2.setPullType(1000);
        callback.onFetchDone(f9Var2);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchRefresh(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType ");
        sb6.append(i17);
        sb6.append(", errCode ");
        sb6.append(i18);
        sb6.append(", errMsg ");
        sb6.append(str);
        sb6.append(" activeTabType:");
        com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader = this.f107705g;
        sb6.append(finderTopicFeedLoader.f107683v);
        sb6.append(" innerTabType:");
        sb6.append(finderTopicFeedLoader.f107682u);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        int i19 = finderTopicFeedLoader.f107668d;
        if (i19 != 7 && i19 != 12) {
            if (m1Var != null) {
                b(i17, i18, str, m1Var);
            }
        } else {
            int i27 = finderTopicFeedLoader.f107683v;
            if ((i27 == -1 || i27 == finderTopicFeedLoader.f107682u) && m1Var != null) {
                b(i17, i18, str, m1Var);
            }
        }
    }
}
