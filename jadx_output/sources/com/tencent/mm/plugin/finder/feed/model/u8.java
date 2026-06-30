package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class u8 extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f108399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f108400b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader) {
        super(finderTimelineFeedLoader, false, 1, null);
        this.f108400b = finderTimelineFeedLoader;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        this.f108399a = z65.c.a();
    }

    public final void a(int i17, java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
        am.ia iaVar = feedUpdateEvent.f54252g;
        iaVar.f6921d = 0;
        iaVar.f6925h = i17;
        iaVar.f6924g = str;
        iaVar.f6919b = 9;
        feedUpdateEvent.e();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h
    public void cleanDataList(com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        super.cleanDataList(dataList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0220, code lost:
    
        if (r10 != null) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0220 A[EDGE_INSN: B:65:0x0220->B:66:0x0220 BREAK  A[LOOP:3: B:54:0x01fa->B:67:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[LOOP:3: B:54:0x01fa->B:67:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0234  */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.finder.feed.model.internal.u0 mergeDataAndNotify(int r26, java.util.List r27, boolean r28, java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.u8.mergeDataAndNotify(int, java.util.List, boolean, java.lang.Object):com.tencent.mm.plugin.finder.feed.model.internal.u0");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        boolean z17 = response instanceof com.tencent.mm.plugin.finder.feed.model.o8;
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.f108400b;
        if (z17) {
            finderTimelineFeedLoader.getDataListJustForAdapter().setBuffer(((com.tencent.mm.plugin.finder.feed.model.o8) response).f108231b);
        }
        ym5.s3 s3Var = new ym5.s3(response.getPullType());
        s3Var.f463521f = response.getHasMore();
        s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f88);
        s3Var.f463517b = 2;
        s3Var.f463522g = !response.getHasMore();
        com.tencent.mars.xlog.Log.i(finderTimelineFeedLoader.getF123427d(), "[onFetchLoadMoreDone] tabtype=" + finderTimelineFeedLoader.f107648d.f108034d + " reason=" + s3Var);
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.s8(this, new com.tencent.mm.plugin.finder.feed.model.internal.y0(response.getHasMore() ? 1 : 5, response.getIncrementList(), false, null, 12, null), s3Var, this.f108400b, lVar, response));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        int i17;
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.f108400b;
        finderTimelineFeedLoader.f107657p = true;
        int pullType = response.getPullType();
        ym5.s3 s3Var = new ym5.s3(pullType);
        if (response.getErrType() == 0 && response.getErrCode() == 0) {
            s3Var.f463517b = 1;
        } else {
            s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.o2z);
            s3Var.f463517b = -1;
        }
        s3Var.f463520e = response;
        yz5.l lVar2 = finderTimelineFeedLoader.A;
        if (lVar2 != null) {
            lVar2.invoke(response);
        }
        s3Var.f463522g = response.getPullType() != 0;
        s3Var.f463521f = response.getHasMore();
        if (response.getErrType() == 0 && response.getErrCode() == 0 && (pullType == 0 || pullType == 4 || pullType == 1)) {
            if (s3Var.f463523h > 0 || finderTimelineFeedLoader.getDataListJustForAdapter().size() <= 0) {
                s3Var.f463518c = null;
            } else {
                s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.erb);
            }
        }
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(as2.k.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        eb2.f0 f0Var = finderTimelineFeedLoader.f107650f;
        int i18 = f0Var.f250749h;
        com.tencent.mm.plugin.finder.feed.model.internal.m0 m0Var = finderTimelineFeedLoader.f107648d;
        boolean z17 = i18 == 1 && m0Var.f108034d == 4 && !finderTimelineFeedLoader.f107656o;
        boolean z18 = bu2.j.f24534a.h(f0Var.f250745d) != null;
        if (finderTimelineFeedLoader.f107662u != 0) {
            finderTimelineFeedLoader.f107662u = 0L;
            s3Var.f463525j = false;
            i17 = 13;
        } else {
            if ((z17 && z18) || f0Var.f250750i) {
                s3Var.f463525j = true;
            } else {
                so2.j5 j5Var = (so2.j5) kz5.n0.Z(finderTimelineFeedLoader.getDataListJustForAdapter());
                if (j5Var != null && j5Var.getItemId() == finderTimelineFeedLoader.f107663v) {
                    finderTimelineFeedLoader.f107663v = 0L;
                    s3Var.f463525j = true;
                } else if (response.getHasMore()) {
                    s3Var.f463525j = false;
                    if (response.getPullType() == 0) {
                        if (!f0Var.f250753l || !f0Var.f250754m.contains(java.lang.Integer.valueOf(m0Var.f108034d)) || !hc2.e.a()) {
                            i17 = 10;
                        }
                    } else if (response.getPullType() == 1 && finderTimelineFeedLoader.f107658q) {
                        finderTimelineFeedLoader.f107658q = false;
                    } else {
                        i17 = 4;
                    }
                } else {
                    s3Var.f463525j = false;
                    i17 = 6;
                }
                i17 = 11;
            }
            i17 = 9;
        }
        com.tencent.mars.xlog.Log.i(finderTimelineFeedLoader.getF123427d(), "[onFetchRefreshDone] tabType=" + m0Var.f108034d + " opType:" + i17 + " isNeedClear:" + response.getIsNeedClear() + " reason=" + s3Var);
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.t8(this, response, z17, new com.tencent.mm.plugin.finder.feed.model.internal.y0(i17, response.getIncrementList(), response.getIsNeedClear(), response.getRequest()), s3Var, this.f108400b, lVar));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.a0
    public boolean needCleanWhenRefresh(java.util.List newList) {
        kotlin.jvm.internal.o.g(newList, "newList");
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if ((r4 == null || r4.isEmpty()) == false) goto L22;
     */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onDataReplace(com.tencent.mm.plugin.finder.feed.model.internal.r0 r9, int r10) {
        /*
            r8 = this;
            so2.j5 r9 = (so2.j5) r9
            java.lang.String r0 = "feed"
            kotlin.jvm.internal.o.g(r9, r0)
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r0 = r8.f108400b
            java.lang.Object r1 = r0.safeGet(r10)
            so2.j5 r1 = (so2.j5) r1
            boolean r2 = r9 instanceof so2.i1
            r3 = 0
            if (r2 == 0) goto La3
            boolean r2 = r1 instanceof so2.i1
            if (r2 == 0) goto La3
            so2.n r2 = so2.o.f410511e
            r4 = r1
            so2.i1 r4 = (so2.i1) r4
            java.util.ArrayList r4 = r4.f()
            r5 = r9
            so2.i1 r5 = (so2.i1) r5
            java.util.ArrayList r5 = r5.f()
            so2.o r2 = r2.a(r4, r5)
            java.util.ArrayList r4 = r2.f410512a
            r5 = 1
            if (r4 == 0) goto L3a
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L38
            goto L3a
        L38:
            r4 = r3
            goto L3b
        L3a:
            r4 = r5
        L3b:
            if (r4 == 0) goto L4d
            java.util.ArrayList r4 = r2.f410513b
            if (r4 == 0) goto L4a
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L48
            goto L4a
        L48:
            r4 = r3
            goto L4b
        L4a:
            r4 = r5
        L4b:
            if (r4 != 0) goto L4e
        L4d:
            r3 = r5
        L4e:
            java.lang.String r4 = r2.f410514c
            r8.a(r5, r4)
            java.lang.String r4 = r2.f410515d
            r6 = 2
            r8.a(r6, r4)
            java.lang.String r4 = r0.getF123427d()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[updateLiveList] onDataReplace oriData:"
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = " newData:"
            r6.append(r1)
            r6.append(r9)
            java.lang.String r9 = ", update:"
            r6.append(r9)
            r6.append(r3)
            java.lang.String r9 = ", increment username:"
            r6.append(r9)
            java.lang.String r9 = r2.f410514c
            r6.append(r9)
            java.lang.String r9 = ", remove username:"
            r6.append(r9)
            java.lang.String r9 = r2.f410515d
            r6.append(r9)
            java.lang.String r9 = r6.toString()
            com.tencent.mars.xlog.Log.i(r4, r9)
            com.tencent.mm.plugin.finder.feed.model.internal.j0 r9 = r0.getDispatcher()
            if (r3 == 0) goto L9c
            r9.b(r10, r5)
            goto La3
        L9c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r9.c(r10, r5, r0)
        La3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.u8.onDataReplace(com.tencent.mm.plugin.finder.feed.model.internal.r0, int):boolean");
    }
}
