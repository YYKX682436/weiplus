package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class i8 implements db2.u3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.m8 f107950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f107951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f107952f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fp0.r f107953g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f107954h;

    public i8(com.tencent.mm.plugin.finder.feed.model.m8 m8Var, java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, fp0.r rVar, com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader) {
        this.f107950d = m8Var;
        this.f107951e = obj;
        this.f107952f = n0Var;
        this.f107953g = rVar;
        this.f107954h = finderTimelineFeedLoader;
    }

    @Override // db2.u3
    public void a(com.tencent.mm.plugin.finder.feed.model.d info, int i17) {
        java.util.List incrementList;
        so2.j5 j5Var;
        boolean z17;
        r45.kv0 kv0Var;
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.String tag = this.f107950d.getTAG();
        java.lang.Object obj = this.f107951e;
        com.tencent.mm.plugin.finder.feed.model.n8 n8Var = (com.tencent.mm.plugin.finder.feed.model.n8) obj;
        n8Var.getClass();
        com.tencent.mars.xlog.Log.i(tag, "[call] onFetchDone... pullType=" + i17 + ", isPreloadMore=false");
        int i18 = 0;
        boolean z18 = info.f107770h != 0;
        com.tencent.mm.plugin.finder.feed.model.o8 o8Var = new com.tencent.mm.plugin.finder.feed.model.o8(info.f107763a, info.f107764b, info.f107765c, null, 8, null);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127736hc).getValue()).r()).intValue();
        java.util.LinkedList linkedList = info.f107767e;
        int i19 = 4;
        if (intValue != 0) {
            int i27 = 0;
            for (java.lang.Object obj2 : linkedList) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.j5 j5Var2 = (so2.j5) obj2;
                if ((j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && i27 % 2 == 0) {
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2;
                    r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
                    if (object_extend != null) {
                        r45.dm2 object_extend2 = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
                        object_extend.set(2, java.lang.Integer.valueOf((object_extend2 != null ? object_extend2.getInteger(2) : i18) | i19));
                    }
                    r45.dm2 object_extend3 = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
                    if (object_extend3 != null) {
                        object_extend3.set(23, new r45.om2());
                    }
                    r45.dm2 object_extend4 = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
                    r45.om2 om2Var = object_extend4 != null ? (r45.om2) object_extend4.getCustom(23) : null;
                    if (om2Var != null) {
                        om2Var.set(1, java.lang.Integer.valueOf(i18));
                    }
                    com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                    if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127736hc).getValue()).r()).intValue() == 2) {
                        r45.dm2 object_extend5 = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
                        r45.om2 om2Var2 = object_extend5 != null ? (r45.om2) object_extend5.getCustom(23) : null;
                        if (om2Var2 != null) {
                            i18 = 0;
                            om2Var2.set(0, 1);
                        }
                    }
                    i18 = 0;
                }
                i27 = i28;
                i19 = 4;
            }
        }
        o8Var.setIncrementList(linkedList);
        o8Var.setPullType(i17);
        o8Var.setHasMore(z18);
        o8Var.setNeedClear(info.f107771i);
        o8Var.f108230a = info.f107775m;
        o8Var.f108231b = null;
        db2.c3 c3Var = info.f107778p;
        n8Var.f108214c = (c3Var == null || (kv0Var = (r45.kv0) c3Var.d().getCustom(4)) == null) ? 0L : kv0Var.getLong(5);
        db2.c3 c3Var2 = info.f107778p;
        n8Var.f108215d = c3Var2 != null ? (r45.nx2) c3Var2.d().getCustom(30) : null;
        o8Var.setRequest(obj);
        db2.c3 c3Var3 = info.f107778p;
        o8Var.f108232c = c3Var3 != null ? (r45.px2) c3Var3.getCustom(24) : null;
        db2.c3 c3Var4 = info.f107778p;
        o8Var.f108233d = c3Var4 != null ? (r45.gx2) c3Var4.getCustom(26) : null;
        db2.c3 c3Var5 = info.f107778p;
        o8Var.f108234e = c3Var5 != null ? (r45.jt2) c3Var5.getCustom(27) : null;
        o8Var.setLastBuffer(info.f107776n);
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.f107954h;
        if ((i17 == 0 || i17 == 1) && (incrementList = o8Var.getIncrementList()) != null && (j5Var = (so2.j5) kz5.n0.Z(incrementList)) != null && ((z17 = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed))) {
            if (i17 == 0) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = z17 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
                if (baseFinderFeed2 != null) {
                    baseFinderFeed2.G1(3);
                }
            } else if (i17 == 1) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = z17 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
                if (baseFinderFeed3 != null) {
                    baseFinderFeed3.G1(4);
                }
            }
            yz5.p pVar = finderTimelineFeedLoader.f107651g;
            if (pVar != null) {
                pVar.invoke("onFetchDone", j5Var);
            }
        }
        java.util.List incrementList2 = o8Var.getIncrementList();
        if (incrementList2 != null) {
            r45.qt2 contextObj = finderTimelineFeedLoader.getContextObj();
            if (contextObj != null) {
                i18 = contextObj.getInteger(5);
            }
            finderTimelineFeedLoader.f(i18, incrementList2);
        }
        this.f107952f.onFetchDone(o8Var);
        this.f107953g.b(fp0.u.f265290f);
    }
}
