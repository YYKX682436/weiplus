package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class s4 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader f108328d;

    public s4(com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader finderMemberQAFeedLoader) {
        this.f108328d = finderMemberQAFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.t4 t4Var = new com.tencent.mm.plugin.finder.feed.model.t4(0, 0, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader finderMemberQAFeedLoader = this.f108328d;
        java.util.List mergeLocalData = mergeLocalData(arrayList, finderMemberQAFeedLoader.f107512d, 0, Integer.MAX_VALUE);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = mergeLocalData.iterator();
        while (it.hasNext()) {
            arrayList2.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()));
        }
        if (finderMemberQAFeedLoader.f107516h) {
            arrayList2.add(0, new jo2.d());
        }
        t4Var.setIncrementList(arrayList2);
        return t4Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        boolean z17;
        java.lang.String str2;
        if (!(iVar instanceof bq.b1) || !(fVar instanceof r45.hg2)) {
            return null;
        }
        if (i17 == 0 && i18 == 0) {
            r45.ig2 ig2Var = ((r45.hg2) fVar).f376133d;
            z17 = ig2Var != null ? ig2Var.f377014e : false;
        } else {
            z17 = true;
        }
        com.tencent.mm.plugin.finder.feed.model.t4 t4Var = new com.tencent.mm.plugin.finder.feed.model.t4(i17, i18, str);
        r45.hg2 hg2Var = (r45.hg2) fVar;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> objects = hg2Var.f376134e;
        kotlin.jvm.internal.o.f(objects, "objects");
        java.util.List arrayList = new java.util.ArrayList(kz5.d0.q(objects, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : objects) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(h90Var.a(finderObject, 73728));
        }
        bq.b1 b1Var = (bq.b1) iVar;
        int i19 = b1Var.f23478o;
        com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader finderMemberQAFeedLoader = this.f108328d;
        if (i19 == 0) {
            arrayList = mergeLocalData(arrayList, finderMemberQAFeedLoader.f107513e, 0, Integer.MAX_VALUE);
        }
        int i27 = b1Var.f23478o;
        if ((i27 == 0 || i27 == 2) && arrayList.isEmpty()) {
            z17 = false;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()));
        }
        java.util.List V0 = kz5.n0.V0(arrayList2);
        if (finderMemberQAFeedLoader.f107516h && b1Var.f23478o == 0) {
            ((java.util.ArrayList) V0).add(0, new jo2.d());
        }
        t4Var.setIncrementList(V0);
        cu2.t tVar = cu2.u.f222441a;
        java.util.LinkedList objects2 = hg2Var.f376134e;
        kotlin.jvm.internal.o.f(objects2, "objects");
        tVar.j(objects2, 73728, finderMemberQAFeedLoader.getContextObj());
        if (b1Var.f23478o != 2) {
            java.util.List incrementList = t4Var.getIncrementList();
            kotlin.jvm.internal.o.e(incrementList, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed>");
            tVar.m(incrementList, 73728, "", true);
        }
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List incrementList2 = t4Var.getIncrementList();
        sb6.append(incrementList2 != null ? java.lang.Integer.valueOf(incrementList2.size()) : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        t4Var.setPullType(b1Var.f23478o);
        r45.ig2 ig2Var2 = hg2Var.f376133d;
        if (ig2Var2 != null && (str2 = ig2Var2.f377013d) != null) {
            byte[] bytes = str2.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            t4Var.setLastBuffer(new com.tencent.mm.protobuf.g(bytes, 0, bytes.length));
        }
        t4Var.setHasMore(z17);
        return t4Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        byte[] bArr;
        com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader finderMemberQAFeedLoader = this.f108328d;
        com.tencent.mm.protobuf.g lastBuffer = finderMemberQAFeedLoader.getLastBuffer();
        return new bq.b1(finderMemberQAFeedLoader.getContextObj(), finderMemberQAFeedLoader.f107512d, finderMemberQAFeedLoader.f107513e, (lastBuffer == null || (bArr = lastBuffer.f192156a) == null) ? null : new java.lang.String(bArr, r26.c.f368865a), finderMemberQAFeedLoader.f107514f, 0L, 2);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader finderMemberQAFeedLoader = this.f108328d;
        return new bq.b1(finderMemberQAFeedLoader.getContextObj(), finderMemberQAFeedLoader.f107512d, finderMemberQAFeedLoader.f107513e, null, finderMemberQAFeedLoader.f107514f, finderMemberQAFeedLoader.f107515g, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List mergeLocalData(java.util.List r9, java.lang.String r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.s4.mergeLocalData(java.util.List, java.lang.String, int, int):java.util.List");
    }
}
