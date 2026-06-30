package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class f4 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderMemberAllFeedLoader f107855d;

    public f4(com.tencent.mm.plugin.finder.feed.model.FinderMemberAllFeedLoader finderMemberAllFeedLoader) {
        this.f107855d = finderMemberAllFeedLoader;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(java.util.List r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.f4.b(java.util.List, int, int):java.util.List");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.d4 d4Var = new com.tencent.mm.plugin.finder.feed.model.d4(0, 0, "");
        java.util.List b17 = b(new java.util.ArrayList(), 0, Integer.MAX_VALUE);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            arrayList.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()));
        }
        if (this.f107855d.f107503g) {
            arrayList.add(0, new jo2.d());
        }
        d4Var.setIncrementList(arrayList);
        return d4Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        java.util.List j17;
        if (!(iVar instanceof bq.y) || !(fVar instanceof r45.zr0)) {
            return null;
        }
        boolean z17 = (i17 == 0 && i18 == 0 && ((r45.zr0) fVar).f392316f != 1) ? false : true;
        com.tencent.mm.plugin.finder.feed.model.d4 d4Var = new com.tencent.mm.plugin.finder.feed.model.d4(i17, i18, str);
        r45.zr0 zr0Var = (r45.zr0) fVar;
        java.util.LinkedList linkedList = zr0Var.f392314d;
        boolean z18 = linkedList == null || linkedList.isEmpty();
        com.tencent.mm.plugin.finder.feed.model.FinderMemberAllFeedLoader finderMemberAllFeedLoader = this.f107855d;
        if (z18) {
            j17 = kz5.p0.f313996d;
        } else {
            cu2.t tVar = cu2.u.f222441a;
            java.util.LinkedList object = zr0Var.f392314d;
            kotlin.jvm.internal.o.f(object, "object");
            j17 = tVar.j(object, 73728, finderMemberAllFeedLoader.getContextObj());
        }
        bq.y yVar = (bq.y) iVar;
        int i19 = yVar.f23538o;
        if ((i19 == 0 || i19 == 2) && j17.isEmpty()) {
            z17 = false;
        }
        if (yVar.f23538o == 0) {
            if (!(j17.isEmpty())) {
                j17 = b(j17, 0, Integer.MAX_VALUE);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(j17, 10));
        java.util.Iterator it = j17.iterator();
        while (it.hasNext()) {
            arrayList.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()));
        }
        java.util.List V0 = kz5.n0.V0(arrayList);
        if (finderMemberAllFeedLoader.f107503g && yVar.f23538o == 0) {
            ((java.util.ArrayList) V0).add(0, new jo2.d());
        }
        d4Var.setIncrementList(V0);
        if (yVar.f23538o != 2) {
            java.util.List incrementList = d4Var.getIncrementList();
            if (!(incrementList instanceof java.util.List)) {
                incrementList = null;
            }
            if (incrementList != null) {
                cu2.u.f222441a.m(incrementList, 73728, "", true);
            }
        }
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List incrementList2 = d4Var.getIncrementList();
        sb6.append(incrementList2 != null ? java.lang.Integer.valueOf(incrementList2.size()) : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        d4Var.setPullType(yVar.f23538o);
        com.tencent.mm.protobuf.g gVar = zr0Var.f392315e;
        if (gVar != null) {
            byte[] g17 = gVar.g();
            d4Var.setLastBuffer(new com.tencent.mm.protobuf.g(g17, 0, g17.length));
        }
        d4Var.setHasMore(z17);
        return d4Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderMemberAllFeedLoader finderMemberAllFeedLoader = this.f107855d;
        return new bq.y(finderMemberAllFeedLoader.getContextObj(), finderMemberAllFeedLoader.f107500d, finderMemberAllFeedLoader.getLastBuffer(), finderMemberAllFeedLoader.f107502f, 2);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderMemberAllFeedLoader finderMemberAllFeedLoader = this.f107855d;
        return new bq.y(finderMemberAllFeedLoader.getContextObj(), finderMemberAllFeedLoader.f107500d, null, finderMemberAllFeedLoader.f107502f, 0);
    }
}
