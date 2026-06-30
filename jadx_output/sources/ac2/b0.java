package ac2;

/* loaded from: classes2.dex */
public final class b0 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public long f3012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader f3013e;

    public b0(com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader finderNativeDramaTimelineFeedLoader) {
        this.f3013e = finderNativeDramaTimelineFeedLoader;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader finderNativeDramaTimelineFeedLoader = this.f3013e;
        if (finderNativeDramaTimelineFeedLoader.f105289d == 0 || finderNativeDramaTimelineFeedLoader.f105291f == -1) {
            return null;
        }
        return ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(finderNativeDramaTimelineFeedLoader.f105289d, finderNativeDramaTimelineFeedLoader.f105290e, finderNativeDramaTimelineFeedLoader.f105291f);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        this.f3012d = java.lang.System.currentTimeMillis();
        ac2.a0 a0Var = new ac2.a0(0, 0, "", true, 0L, null, null);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f3013e.f105297o;
        if (baseFinderFeed != null) {
            a0Var.setIncrementList(kz5.c0.k(baseFinderFeed));
        }
        return a0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
    
        if ((r9 == null || r9.length() == 0) != false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c5 A[LOOP:1: B:125:0x028f->B:139:0x02c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a7 A[LOOP:2: B:173:0x0370->B:187:0x03a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0158 A[Catch: JSONException -> 0x0192, TRY_ENTER, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0192, blocks: (B:43:0x013c, B:47:0x0158, B:51:0x0168, B:54:0x0177, B:55:0x018a, B:56:0x016c), top: B:42:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0177 A[Catch: JSONException -> 0x0192, TryCatch #1 {JSONException -> 0x0192, blocks: (B:43:0x013c, B:47:0x0158, B:51:0x0168, B:54:0x0177, B:55:0x018a, B:56:0x016c), top: B:42:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016c A[Catch: JSONException -> 0x0192, TryCatch #1 {JSONException -> 0x0192, blocks: (B:43:0x013c, B:47:0x0158, B:51:0x0168, B:54:0x0177, B:55:0x018a, B:56:0x016c), top: B:42:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a8  */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34, types: [com.tencent.mm.protobuf.e] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.tencent.mm.protobuf.e] */
    /* JADX WARN: Type inference failed for: r13v7 */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int r29, int r30, java.lang.String r31, com.tencent.mm.modelbase.i r32, com.tencent.mm.protobuf.f r33) {
        /*
            Method dump skipped, instructions count: 1093
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ac2.b0.dealOnSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.i, com.tencent.mm.protobuf.f):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader finderNativeDramaTimelineFeedLoader = this.f3013e;
        com.tencent.mars.xlog.Log.i("Finder.FinderNativeDramaTimelineFeedLoader", "dramaReq loadMore ".concat(pm0.v.u(finderNativeDramaTimelineFeedLoader.f105295m.f3071a)));
        r45.qt2 contextObj = finderNativeDramaTimelineFeedLoader.getContextObj();
        ac2.z zVar = finderNativeDramaTimelineFeedLoader.f105295m;
        return new bq.u0(contextObj, zVar.f3071a, zVar.f3076f, zVar.f3074d, zVar.f3077g, 2, zVar.f3072b, zVar.f3073c, finderNativeDramaTimelineFeedLoader.f105289d, b(), finderNativeDramaTimelineFeedLoader.f105292g, this.f3012d, finderNativeDramaTimelineFeedLoader.f105299q, finderNativeDramaTimelineFeedLoader.f105296n);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader finderNativeDramaTimelineFeedLoader = this.f3013e;
        ac2.z zVar = finderNativeDramaTimelineFeedLoader.f105294i;
        int i17 = zVar.f3072b == null ? 0 : 1;
        com.tencent.mars.xlog.Log.i("Finder.FinderNativeDramaTimelineFeedLoader", "dramaReq refresh ".concat(pm0.v.u(zVar.f3071a)));
        r45.qt2 contextObj = finderNativeDramaTimelineFeedLoader.getContextObj();
        ac2.z zVar2 = finderNativeDramaTimelineFeedLoader.f105294i;
        return new bq.u0(contextObj, zVar2.f3071a, zVar2.f3076f, zVar2.f3074d, zVar2.f3077g, i17, zVar2.f3072b, zVar2.f3073c, finderNativeDramaTimelineFeedLoader.f105289d, b(), finderNativeDramaTimelineFeedLoader.f105292g, this.f3012d, finderNativeDramaTimelineFeedLoader.f105299q, finderNativeDramaTimelineFeedLoader.f105296n);
    }
}
