package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class g7 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader f107887d;

    public g7(com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader finderRecommendReasonLoader) {
        this.f107887d = finderRecommendReasonLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mars.xlog.Log.i(getTAG(), "fetchInit");
        com.tencent.mm.plugin.finder.feed.model.h7 h7Var = new com.tencent.mm.plugin.finder.feed.model.h7(0, 0, "");
        com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader finderRecommendReasonLoader = this.f107887d;
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderRecommendReasonLoader.getCache();
        h7Var.setIncrementList(cache != null ? cache.f108300a : null);
        com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderRecommendReasonLoader.getCache();
        h7Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        return h7Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.plugin.finder.feed.model.h7 h7Var = new com.tencent.mm.plugin.finder.feed.model.h7(i17, i18, str);
        if ((fVar instanceof r45.x91) && (iVar instanceof db2.p1)) {
            db2.p1 p1Var = (db2.p1) iVar;
            r45.x91 x91Var = (r45.x91) fVar;
            boolean z17 = (i17 == 0 && i18 == 0 && x91Var.getInteger(4) == 0) ? false : true;
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = x91Var.getList(2);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
                com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                kotlin.jvm.internal.o.d(finderObject);
                com.tencent.mm.plugin.finder.storage.FinderItem a17 = h90Var.a(finderObject, 6291456);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.finder.feed.ui.fragment.FinderRecommendReasonFragment.I;
                com.tencent.mm.plugin.finder.feed.ui.fragment.FinderRecommendReasonFragment.I.put(java.lang.Long.valueOf(a17.getId()), a17);
                long id6 = finderObject.getId();
                com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader finderRecommendReasonLoader = this.f107887d;
                r45.qt2 contextObj = finderRecommendReasonLoader.getContextObj();
                int integer = contextObj != null ? contextObj.getInteger(5) : 0;
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
                r45.dm2 object_extend = finderObject.getObject_extend();
                o3Var.qk(id6, object_extend != null ? object_extend.getString(62) : null, integer, finderObject.getSessionBuffer(), (r20 & 16) != 0 ? 0L : 0L, (r20 & 32) != 0 ? null : null);
                i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) c18;
                r45.dm2 object_extend2 = finderObject.getObject_extend();
                com.tencent.mm.plugin.finder.report.e6 hk6 = com.tencent.mm.plugin.finder.report.o3.hk(o3Var2, id6, object_extend2 != null ? object_extend2.getString(62) : null, integer, null, 8, null);
                if (hk6 != null) {
                    try {
                        r45.fl2 fl2Var = hk6.f125012a;
                        db2.t4 t4Var = db2.t4.f228171a;
                        java.lang.String string = fl2Var.getString(5);
                        if (string == null) {
                            string = "";
                        }
                        java.lang.String str2 = finderRecommendReasonLoader.f107627i;
                        fl2Var.set(5, db2.t4.m(t4Var, string, str2 == null ? "" : str2, false, 4, null));
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.e(getTAG(), "Error parsing JSON", e17);
                    }
                }
                if (integer == finderRecommendReasonLoader.f107629n) {
                    i95.m c19 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    kotlin.jvm.internal.o.f(c19, "getService(...)");
                    com.tencent.mm.plugin.finder.report.o3 o3Var3 = (com.tencent.mm.plugin.finder.report.o3) c19;
                    int i19 = finderRecommendReasonLoader.f107630o;
                    int i27 = finderRecommendReasonLoader.f107629n;
                    r45.dm2 object_extend3 = finderObject.getObject_extend();
                    com.tencent.mm.plugin.finder.report.o3.Vi(o3Var3, id6, i19, i27, null, object_extend3 != null ? object_extend3.getString(62) : null, 8, null);
                }
                arrayList.add(cu2.u.f222441a.p(a17));
            }
            java.util.List V0 = kz5.n0.V0(arrayList);
            h7Var.setResponse(x91Var);
            h7Var.setIncrementList(V0);
            if (p1Var.f228110t != 2) {
                cu2.t tVar = cu2.u.f222441a;
                java.util.List incrementList = h7Var.getIncrementList();
                kotlin.jvm.internal.o.e(incrementList, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.finder.model.RVFeed>");
                tVar.m(incrementList, 6291456, "", true);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
            java.util.List incrementList2 = h7Var.getIncrementList();
            sb6.append(incrementList2 != null ? java.lang.Integer.valueOf(incrementList2.size()) : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderPoiFeedLoader", sb6.toString());
            h7Var.setPullType(p1Var.f228110t);
            h7Var.setLastBuffer(x91Var.getByteString(3));
            h7Var.setHasMore(z17);
        }
        return h7Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader finderRecommendReasonLoader = this.f107887d;
        db2.p1 p1Var = new db2.p1(finderRecommendReasonLoader.getContextObj(), finderRecommendReasonLoader.f107622d, finderRecommendReasonLoader.getLastBuffer(), finderRecommendReasonLoader.f107623e, finderRecommendReasonLoader.f107625g, finderRecommendReasonLoader.f107626h);
        p1Var.f228110t = 2;
        return p1Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader finderRecommendReasonLoader = this.f107887d;
        db2.p1 p1Var = new db2.p1(finderRecommendReasonLoader.getContextObj(), finderRecommendReasonLoader.f107622d, finderRecommendReasonLoader.getLastBuffer(), finderRecommendReasonLoader.f107623e, finderRecommendReasonLoader.f107625g, finderRecommendReasonLoader.f107626h);
        p1Var.f228110t = 0;
        return p1Var;
    }
}
