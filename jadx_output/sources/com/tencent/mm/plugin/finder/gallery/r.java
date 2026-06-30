package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class r extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader f111401d;

    public r(com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader finderGalleryLoader) {
        this.f111401d = finderGalleryLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mars.xlog.Log.i(getTAG(), "fetchInit ");
        com.tencent.mm.plugin.finder.gallery.s sVar = new com.tencent.mm.plugin.finder.gallery.s(0, 0, "");
        com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader finderGalleryLoader = this.f111401d;
        if (finderGalleryLoader.f111337e) {
            com.tencent.mm.plugin.finder.feed.model.r9 cache = finderGalleryLoader.getCache();
            sVar.setIncrementList(cache != null ? cache.f108300a : null);
            com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderGalleryLoader.getCache();
            sVar.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        } else {
            sVar.setIncrementList(kz5.p0.f313996d);
        }
        return sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0 A[LOOP:0: B:20:0x0098->B:22:0x00a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int r9, int r10, java.lang.String r11, com.tencent.mm.modelbase.i r12, com.tencent.mm.protobuf.f r13) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.gallery.r.dealOnSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.i, com.tencent.mm.protobuf.f):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader finderGalleryLoader = this.f111401d;
        return new bq.i(2, finderGalleryLoader.f111336d.getInteger(0), finderGalleryLoader.f111336d.getInteger(1), finderGalleryLoader.f111336d.getByteString(2), finderGalleryLoader.getLastBuffer(), finderGalleryLoader.getContextObj());
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader finderGalleryLoader = this.f111401d;
        return new bq.i(0, finderGalleryLoader.f111336d.getInteger(0), finderGalleryLoader.f111336d.getInteger(1), finderGalleryLoader.f111336d.getByteString(2), null, finderGalleryLoader.getContextObj());
    }
}
