package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class x1 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final fp0.t f108445d = new fp0.t("FeedShareRelData");

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader f108446e;

    public x1(com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader) {
        this.f108446e = finderFeedShareRelativeListLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void alive() {
        super.alive();
        this.f108445d.e();
    }

    public final void b(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        baseFinderFeed.getFeedObject().getFeedObject().setPermissionFlag(finderObject.getPermissionFlag());
        r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        if (object_extend != null) {
            r45.dm2 object_extend2 = finderObject.getObject_extend();
            object_extend.set(4, object_extend2 != null ? (r45.cl2) object_extend2.getCustom(4) : null);
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = baseFinderFeed.getFeedObject().getFeedObject().getObjectDesc();
        if (objectDesc != null) {
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderObject.getObjectDesc();
            objectDesc.setEvent(objectDesc2 != null ? objectDesc2.getEvent() : null);
        }
        baseFinderFeed.getFeedObject().getFeedObject().setPosTriggerConfig(finderObject.getPosTriggerConfig());
        r45.dm2 object_extend3 = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        if (object_extend3 != null) {
            r45.dm2 object_extend4 = finderObject.getObject_extend();
            object_extend3.set(0, object_extend4 != null ? (r45.vx0) object_extend4.getCustom(0) : null);
        }
        r45.dm2 object_extend5 = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        if (object_extend5 != null) {
            r45.dm2 object_extend6 = finderObject.getObject_extend();
            object_extend5.set(22, object_extend6 != null ? object_extend6.getString(22) : null);
        }
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject = baseFinderFeed.getFeedObject();
        com.tencent.mm.protobuf.e fromJson = new r45.b21().fromJson(finderObject.getPosTriggerConfig());
        kotlin.jvm.internal.o.e(fromJson, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderEnhanceTypeList");
        feedObject.setEnhanceTriggerConfig((r45.b21) fromJson);
        r45.dm2 object_extend7 = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        if (object_extend7 != null) {
            r45.dm2 object_extend8 = finderObject.getObject_extend();
            object_extend7.set(43, object_extend8 != null ? (r45.f53) object_extend8.getCustom(43) : null);
        }
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2 = baseFinderFeed.getFeedObject();
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> likeList = finderObject.getLikeList();
        kotlin.jvm.internal.o.f(likeList, "getLikeList(...)");
        feedObject2.setLikeList(likeList);
        r45.dm2 object_extend9 = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        if (object_extend9 != null) {
            r45.dm2 object_extend10 = finderObject.getObject_extend();
            object_extend9.set(51, object_extend10 != null ? (r45.bn2) object_extend10.getCustom(51) : null);
        }
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isNativeDrama ");
        r45.dm2 object_extend11 = finderObject.getObject_extend();
        sb6.append((object_extend11 != null ? (r45.bn2) object_extend11.getCustom(51) : null) != null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f108446e;
        finderFeedShareRelativeListLoader.getDispatcher().c(0, 1, new jz5.l(34, null));
        finderFeedShareRelativeListLoader.getDispatcher().c(0, 1, new jz5.l(13, null));
        finderFeedShareRelativeListLoader.getDispatcher().c(0, 1, new jz5.l(36, null));
        finderFeedShareRelativeListLoader.getDispatcher().c(0, 1, new jz5.l(37, null));
        finderFeedShareRelativeListLoader.getDispatcher().c(0, 1, new jz5.l(51, null));
        if (hc2.o0.j(finderObject) != 9 && !baseFinderFeed.getFeedObject().isLiveFeed()) {
            finderFeedShareRelativeListLoader.getDispatcher().c(0, 1, new jz5.l(45, null));
        }
        r45.dm2 object_extend12 = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        r45.fg0 fg0Var = object_extend12 != null ? (r45.fg0) object_extend12.getCustom(28) : null;
        r45.dm2 object_extend13 = finderObject.getObject_extend();
        if (kotlin.jvm.internal.o.b(fg0Var, object_extend13 != null ? (r45.fg0) object_extend13.getCustom(28) : null) && baseFinderFeed.getFeedObject().getFeedObject().getRecommendReasonType() == finderObject.getRecommendReasonType()) {
            return;
        }
        r45.dm2 object_extend14 = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        if (object_extend14 != null) {
            r45.dm2 object_extend15 = finderObject.getObject_extend();
            object_extend14.set(28, object_extend15 != null ? (r45.fg0) object_extend15.getCustom(28) : null);
        }
        baseFinderFeed.getFeedObject().getFeedObject().setRecommendReasonType(finderObject.getRecommendReasonType());
        finderFeedShareRelativeListLoader.getDispatcher().c(0, 1, new jz5.l(46, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.x1.callInit():com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void dead() {
        super.dead();
        this.f108445d.f();
        as2.g gVar = this.f108446e.D;
        if (gVar != null) {
            gVar.f13463d.clear();
            kotlinx.coroutines.r2 r2Var = gVar.f13465f;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            gVar.f13465f = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:277:0x057d, code lost:
    
        if ((r0 != null && r0.getInteger(5) == 25) != false) goto L250;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e0 A[LOOP:8: B:115:0x02da->B:117:0x02e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0295  */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int r28, int r29, java.lang.String r30, com.tencent.mm.modelbase.i r31, com.tencent.mm.protobuf.f r32) {
        /*
            Method dump skipped, instructions count: 1444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.x1.dealOnSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.i, com.tencent.mm.protobuf.f):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f108445d.b(new fp0.r(new com.tencent.mm.plugin.finder.feed.model.w1(obj, this, this.f108446e, callback, java.lang.System.currentTimeMillis()), null, 2, null));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f108446e;
        if (finderFeedShareRelativeListLoader.f107440n) {
            return null;
        }
        return new db2.t0(finderFeedShareRelativeListLoader.f107433d, finderFeedShareRelativeListLoader.f107435f, finderFeedShareRelativeListLoader.f107436g, finderFeedShareRelativeListLoader.getLastBuffer(), null, finderFeedShareRelativeListLoader.f107438i, finderFeedShareRelativeListLoader.N, finderFeedShareRelativeListLoader.P, finderFeedShareRelativeListLoader.f107439m, null, finderFeedShareRelativeListLoader.getContextObj(), 0.0f, 0.0f, finderFeedShareRelativeListLoader.f107441o, 0, 2, null, null, null, 0, null, null, null, null, finderFeedShareRelativeListLoader.f107449w, finderFeedShareRelativeListLoader.f107450x, finderFeedShareRelativeListLoader.f107451y, null, finderFeedShareRelativeListLoader.A, null, 687823360, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        r45.m54 m54Var;
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f108446e;
        if (finderFeedShareRelativeListLoader.f107440n) {
            return null;
        }
        long j17 = finderFeedShareRelativeListLoader.f107433d;
        java.lang.String str3 = finderFeedShareRelativeListLoader.f107435f;
        int i18 = finderFeedShareRelativeListLoader.f107436g;
        com.tencent.mm.protobuf.g lastBuffer = finderFeedShareRelativeListLoader.getLastBuffer();
        int i19 = finderFeedShareRelativeListLoader.f107438i;
        java.lang.String str4 = finderFeedShareRelativeListLoader.N;
        java.lang.String str5 = finderFeedShareRelativeListLoader.P;
        java.lang.String str6 = finderFeedShareRelativeListLoader.f107439m;
        r45.qt2 contextObj = finderFeedShareRelativeListLoader.getContextObj();
        int i27 = finderFeedShareRelativeListLoader.f107441o;
        r45.sf6 sf6Var = finderFeedShareRelativeListLoader.f107444r;
        com.tencent.mm.protobuf.g gVar = finderFeedShareRelativeListLoader.f107445s;
        java.lang.String str7 = finderFeedShareRelativeListLoader.f107446t;
        java.lang.String str8 = finderFeedShareRelativeListLoader.f107447u;
        java.lang.String str9 = finderFeedShareRelativeListLoader.f107448v;
        r45.a34 a34Var = finderFeedShareRelativeListLoader.f107449w;
        java.lang.String str10 = finderFeedShareRelativeListLoader.f107450x;
        r45.nv2 nv2Var = finderFeedShareRelativeListLoader.f107451y;
        dv2.y1 y1Var = finderFeedShareRelativeListLoader.f107452z;
        if (y1Var != null) {
            r45.m54 m54Var2 = new r45.m54();
            str = str8;
            str2 = str7;
            i17 = 0;
            m54Var2.set(0, java.lang.Long.valueOf(y1Var.f243977a));
            m54Var = m54Var2;
        } else {
            str = str8;
            str2 = str7;
            i17 = 0;
            m54Var = null;
        }
        android.content.Intent intent = finderFeedShareRelativeListLoader.A;
        return new db2.t0(j17, str3, i18, lastBuffer, null, i19, str4, str5, str6, null, contextObj, 0.0f, 0.0f, i27, 0, java.lang.Integer.valueOf(i17), sf6Var, gVar, null, 0, str2, str, str9, null, a34Var, str10, nv2Var, m54Var, intent, null, 546068992, null);
    }
}
