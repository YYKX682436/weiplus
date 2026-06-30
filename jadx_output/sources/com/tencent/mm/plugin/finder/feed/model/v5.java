package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class v5 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderPostPlayLoader f108414d;

    public v5(com.tencent.mm.plugin.finder.feed.model.FinderPostPlayLoader finderPostPlayLoader) {
        this.f108414d = finderPostPlayLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mars.xlog.Log.i(getTAG(), "fetchInit");
        com.tencent.mm.plugin.finder.feed.model.w5 w5Var = new com.tencent.mm.plugin.finder.feed.model.w5(0, 0, "");
        com.tencent.mm.plugin.finder.feed.model.FinderPostPlayLoader finderPostPlayLoader = this.f108414d;
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderPostPlayLoader.getCache();
        w5Var.setIncrementList(cache != null ? cache.f108300a : null);
        com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderPostPlayLoader.getCache();
        w5Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        return w5Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.plugin.finder.feed.model.w5 w5Var = new com.tencent.mm.plugin.finder.feed.model.w5(i17, i18, str);
        if ((fVar instanceof r45.l91) && (iVar instanceof db2.m1)) {
            db2.m1 m1Var = (db2.m1) iVar;
            r45.l91 l91Var = (r45.l91) fVar;
            int i19 = 0;
            boolean z17 = (i17 == 0 && i18 == 0 && l91Var.getInteger(5) == 0) ? false : true;
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = l91Var.getList(3);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
                com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                kotlin.jvm.internal.o.d(finderObject);
                com.tencent.mm.plugin.finder.storage.FinderItem a17 = h90Var.a(finderObject, i19);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment.L;
                com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment.L.put(java.lang.Long.valueOf(a17.getId()), a17);
                long id6 = finderObject.getId();
                com.tencent.mm.plugin.finder.feed.model.FinderPostPlayLoader finderPostPlayLoader = this.f108414d;
                r45.qt2 contextObj = finderPostPlayLoader.getContextObj();
                int integer = contextObj != null ? contextObj.getInteger(5) : i19;
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
                        java.lang.String str2 = finderPostPlayLoader.f107566n;
                        fl2Var.set(5, db2.t4.m(t4Var, string, str2 == null ? "" : str2, false, 4, null));
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.e(getTAG(), "Error parsing JSON", e17);
                    }
                }
                if (integer == finderPostPlayLoader.f107568p) {
                    i95.m c19 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    kotlin.jvm.internal.o.f(c19, "getService(...)");
                    com.tencent.mm.plugin.finder.report.o3 o3Var3 = (com.tencent.mm.plugin.finder.report.o3) c19;
                    int i27 = finderPostPlayLoader.f107569q;
                    int i28 = finderPostPlayLoader.f107568p;
                    r45.dm2 object_extend3 = finderObject.getObject_extend();
                    com.tencent.mm.plugin.finder.report.o3.Vi(o3Var3, id6, i27, i28, null, object_extend3 != null ? object_extend3.getString(62) : null, 8, null);
                }
                arrayList.add(cu2.u.f222441a.p(a17));
                i19 = 0;
            }
            java.util.List V0 = kz5.n0.V0(arrayList);
            w5Var.setResponse(l91Var);
            w5Var.setIncrementList(V0);
            if (m1Var.f228069t != 2) {
                cu2.t tVar = cu2.u.f222441a;
                java.util.List incrementList = w5Var.getIncrementList();
                kotlin.jvm.internal.o.e(incrementList, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.finder.model.RVFeed>");
                tVar.m(incrementList, 0, "", true);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
            java.util.List incrementList2 = w5Var.getIncrementList();
            sb6.append(incrementList2 != null ? java.lang.Integer.valueOf(incrementList2.size()) : null);
            com.tencent.mars.xlog.Log.i("FinderPostPlayLoader", sb6.toString());
            w5Var.setPullType(m1Var.f228069t);
            w5Var.setLastBuffer(l91Var.getByteString(4));
            w5Var.setHasMore(z17);
        }
        return w5Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderPostPlayLoader finderPostPlayLoader = this.f108414d;
        r45.qt2 contextObj = finderPostPlayLoader.getContextObj();
        java.lang.String str = finderPostPlayLoader.f107563h;
        com.tencent.mm.protobuf.g lastBuffer = finderPostPlayLoader.getLastBuffer();
        java.lang.Integer num = finderPostPlayLoader.f107562g;
        int intValue = num != null ? num.intValue() : 0;
        java.lang.Long l17 = finderPostPlayLoader.f107559d;
        long longValue = l17 != null ? l17.longValue() : 0L;
        java.lang.Integer num2 = finderPostPlayLoader.f107560e;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        java.lang.Long l18 = finderPostPlayLoader.f107561f;
        db2.m1 m1Var = new db2.m1(contextObj, str, lastBuffer, intValue, longValue, intValue2, l18 != null ? l18.longValue() : 0L, finderPostPlayLoader.f107565m, finderPostPlayLoader.f107570r);
        m1Var.f228069t = 2;
        return m1Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderPostPlayLoader finderPostPlayLoader = this.f108414d;
        r45.qt2 contextObj = finderPostPlayLoader.getContextObj();
        java.lang.String str = finderPostPlayLoader.f107563h;
        com.tencent.mm.protobuf.g lastBuffer = finderPostPlayLoader.getLastBuffer();
        java.lang.Integer num = finderPostPlayLoader.f107562g;
        int intValue = num != null ? num.intValue() : 0;
        java.lang.Long l17 = finderPostPlayLoader.f107559d;
        long longValue = l17 != null ? l17.longValue() : 0L;
        java.lang.Integer num2 = finderPostPlayLoader.f107560e;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        java.lang.Long l18 = finderPostPlayLoader.f107561f;
        db2.m1 m1Var = new db2.m1(contextObj, str, lastBuffer, intValue, longValue, intValue2, l18 != null ? l18.longValue() : 0L, finderPostPlayLoader.f107565m, finderPostPlayLoader.f107570r);
        m1Var.f228069t = 0;
        return m1Var;
    }
}
