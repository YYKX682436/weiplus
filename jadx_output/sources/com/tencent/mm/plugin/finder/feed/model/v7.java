package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class v7 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderSelfHistoryLoader f108415d;

    public v7(com.tencent.mm.plugin.finder.feed.model.FinderSelfHistoryLoader finderSelfHistoryLoader) {
        this.f108415d = finderSelfHistoryLoader;
    }

    public final long b(so2.j5 j5Var) {
        r45.vx0 vx0Var;
        r45.xx0 xx0Var;
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            return ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getLastPlayTime();
        }
        if (!(j5Var instanceof so2.c0) || (vx0Var = (r45.vx0) ((so2.c0) j5Var).f410286d.getCustom(2)) == null || (xx0Var = (r45.xx0) vx0Var.getCustom(23)) == null) {
            return -1L;
        }
        return xx0Var.getLong(2);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mars.xlog.Log.i(getTAG(), "fetchInit");
        com.tencent.mm.plugin.finder.feed.model.w7 w7Var = new com.tencent.mm.plugin.finder.feed.model.w7(0, 0, "", 7);
        com.tencent.mm.plugin.finder.feed.model.FinderSelfHistoryLoader finderSelfHistoryLoader = this.f108415d;
        if (finderSelfHistoryLoader.f107644e) {
            com.tencent.mm.plugin.finder.feed.model.r9 cache = finderSelfHistoryLoader.getCache();
            w7Var.setIncrementList(cache != null ? cache.f108300a : null);
            com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderSelfHistoryLoader.getCache();
            w7Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        } else {
            w7Var.setIncrementList(bu2.d0.i(bu2.e0.f24498a, 32, null, 2, null));
        }
        return w7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4 A[EDGE_INSN: B:29:0x00b4->B:30:0x00b4 BREAK  A[LOOP:0: B:11:0x0064->B:22:0x0064], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int r17, int r18, java.lang.String r19, com.tencent.mm.modelbase.i r20, com.tencent.mm.protobuf.f r21) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.v7.dealOnSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.i, com.tencent.mm.protobuf.f):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderSelfHistoryLoader finderSelfHistoryLoader = this.f108415d;
        int i17 = finderSelfHistoryLoader.f107643d;
        int i18 = 1;
        if (i17 != 0) {
            if (i17 == 1) {
                i18 = 3;
            } else if (i17 == 2) {
                i18 = 2;
            }
        }
        com.tencent.mm.protobuf.g lastBuffer = finderSelfHistoryLoader.getLastBuffer();
        return new db2.q1(i17, i18, lastBuffer != null ? lastBuffer.i() : null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        int i17 = this.f108415d.f107643d;
        int i18 = 1;
        if (i17 != 0) {
            if (i17 == 1) {
                i18 = 3;
            } else if (i17 == 2) {
                i18 = 2;
            }
        }
        return new db2.q1(i17, i18, null);
    }
}
