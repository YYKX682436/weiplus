package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class l20 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$RelativeLoader f107271d;

    public l20(com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$RelativeLoader finderTopicTimelineUIContract$RelativeLoader) {
        this.f107271d = finderTopicTimelineUIContract$RelativeLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.r9 cache = this.f107271d.getCache();
        if (cache == null) {
            return new com.tencent.mm.plugin.finder.feed.k20(0, 0, "");
        }
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchInit size:");
        java.util.ArrayList arrayList = cache.f108300a;
        sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        com.tencent.mm.plugin.finder.feed.k20 k20Var = new com.tencent.mm.plugin.finder.feed.k20(0, 0, "");
        k20Var.setIncrementList(arrayList);
        com.tencent.mm.plugin.finder.feed.model.c cVar = cache.f108303d;
        if (!(cVar instanceof com.tencent.mm.plugin.finder.feed.g30)) {
            return k20Var;
        }
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.TopicCustomData");
        k20Var.setLastBuffer(((com.tencent.mm.plugin.finder.feed.g30) cVar).f106821b);
        return k20Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if ((r2 == null || r2.isEmpty()) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[EDGE_INSN: B:33:0x0086->B:34:0x0086 BREAK  A[LOOP:0: B:15:0x0048->B:30:0x0048], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b A[LOOP:1: B:35:0x0095->B:37:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0102  */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int r9, int r10, java.lang.String r11, com.tencent.mm.modelbase.i r12, com.tencent.mm.protobuf.f r13) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.l20.dealOnSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.i, com.tencent.mm.protobuf.f):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$RelativeLoader finderTopicTimelineUIContract$RelativeLoader = this.f107271d;
        return new db2.t0(finderTopicTimelineUIContract$RelativeLoader.f106147o, finderTopicTimelineUIContract$RelativeLoader.f106148p, finderTopicTimelineUIContract$RelativeLoader.f106151s, finderTopicTimelineUIContract$RelativeLoader.getLastBuffer(), null, finderTopicTimelineUIContract$RelativeLoader.f106150r, finderTopicTimelineUIContract$RelativeLoader.f106152t, finderTopicTimelineUIContract$RelativeLoader.f106153u, finderTopicTimelineUIContract$RelativeLoader.f106154v, null, finderTopicTimelineUIContract$RelativeLoader.getContextObj(), 0.0f, 0.0f, 0, 0, 2, null, null, finderTopicTimelineUIContract$RelativeLoader.f106149q, 0, null, null, null, finderTopicTimelineUIContract$RelativeLoader.f106155w, null, null, null, null, null, null, 1065056768, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$RelativeLoader finderTopicTimelineUIContract$RelativeLoader = this.f107271d;
        if (finderTopicTimelineUIContract$RelativeLoader.getCache() == null) {
            return new db2.t0(finderTopicTimelineUIContract$RelativeLoader.f106147o, finderTopicTimelineUIContract$RelativeLoader.f106148p, finderTopicTimelineUIContract$RelativeLoader.f106151s, null, null, finderTopicTimelineUIContract$RelativeLoader.f106150r, finderTopicTimelineUIContract$RelativeLoader.f106152t, finderTopicTimelineUIContract$RelativeLoader.f106153u, finderTopicTimelineUIContract$RelativeLoader.f106154v, null, finderTopicTimelineUIContract$RelativeLoader.getContextObj(), 0.0f, 0.0f, 0, 0, 4, null, null, finderTopicTimelineUIContract$RelativeLoader.f106149q, 0, null, null, null, finderTopicTimelineUIContract$RelativeLoader.f106155w, null, null, null, null, null, null, 1065056768, null);
        }
        return null;
    }
}
