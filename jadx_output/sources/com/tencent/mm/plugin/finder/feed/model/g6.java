package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class g6 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader f107886d;

    public g6(com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader finderProfileDraftLoader) {
        this.f107886d = finderProfileDraftLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader finderProfileDraftLoader = this.f107886d;
        java.lang.String str = finderProfileDraftLoader.f107580d;
        if (str == null) {
            str = "";
        }
        java.util.ArrayList c17 = com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader.c(finderProfileDraftLoader, arrayList, str);
        com.tencent.mars.xlog.Log.i(getTAG(), "callInit size:" + c17.size());
        com.tencent.mm.plugin.finder.feed.model.h6 h6Var = new com.tencent.mm.plugin.finder.feed.model.h6(0, 0, "", false, 8, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(c17, 10));
        java.util.Iterator it = c17.iterator();
        while (it.hasNext()) {
            arrayList2.add(new so2.k0((com.tencent.mm.plugin.finder.storage.x80) it.next()));
        }
        h6Var.setIncrementList(arrayList2);
        h6Var.setLastBuffer(null);
        h6Var.setHasMore(true);
        return h6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1 A[LOOP:0: B:26:0x00bb->B:28:0x00c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0040  */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int r8, int r9, java.lang.String r10, com.tencent.mm.modelbase.i r11, com.tencent.mm.protobuf.f r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.g6.dealOnSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.i, com.tencent.mm.protobuf.f):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader finderProfileDraftLoader = this.f107886d;
        if (kotlin.jvm.internal.o.b(xy2.c.f(finderProfileDraftLoader.getContextObj()), finderProfileDraftLoader.f107580d)) {
            return new bq.g0(finderProfileDraftLoader.f107580d, finderProfileDraftLoader.getLastBuffer(), 2, finderProfileDraftLoader.getContextObj());
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader finderProfileDraftLoader = this.f107886d;
        if (kotlin.jvm.internal.o.b(xy2.c.f(finderProfileDraftLoader.getContextObj()), finderProfileDraftLoader.f107580d)) {
            return new bq.g0(finderProfileDraftLoader.f107580d, null, 1, finderProfileDraftLoader.getContextObj());
        }
        return null;
    }
}
