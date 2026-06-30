package ac2;

/* loaded from: classes2.dex */
public final class b0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public long f84545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.C13721x95edc87c f84546e;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.C13721x95edc87c c13721x95edc87c) {
        this.f84546e = c13721x95edc87c;
    }

    public final java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.C13721x95edc87c c13721x95edc87c = this.f84546e;
        if (c13721x95edc87c.f186822d == 0 || c13721x95edc87c.f186824f == -1) {
            return null;
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(c13721x95edc87c.f186822d, c13721x95edc87c.f186823e, c13721x95edc87c.f186824f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e() {
        this.f84545d = java.lang.System.currentTimeMillis();
        ac2.a0 a0Var = new ac2.a0(0, 0, "", true, 0L, null, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f84546e.f186830o;
        if (abstractC14490x69736cb5 != null) {
            a0Var.m56420x2a5f836b(kz5.c0.k(abstractC14490x69736cb5));
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
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int r29, int r30, java.lang.String r31, com.p314xaae8f345.mm.p944x882e457a.i r32, com.p314xaae8f345.mm.p2495xc50a8b8b.f r33) {
        /*
            Method dump skipped, instructions count: 1093
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ac2.b0.mo983xfcd2013a(int, int, java.lang.String, com.tencent.mm.modelbase.i, com.tencent.mm.protobuf.f):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.C13721x95edc87c c13721x95edc87c = this.f84546e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNativeDramaTimelineFeedLoader", "dramaReq loadMore ".concat(pm0.v.u(c13721x95edc87c.f186828m.f84604a)));
        r45.qt2 m56354xfe9224be = c13721x95edc87c.m56354xfe9224be();
        ac2.z zVar = c13721x95edc87c.f186828m;
        return new bq.u0(m56354xfe9224be, zVar.f84604a, zVar.f84609f, zVar.f84607d, zVar.f84610g, 2, zVar.f84605b, zVar.f84606c, c13721x95edc87c.f186822d, b(), c13721x95edc87c.f186825g, this.f84545d, c13721x95edc87c.f186832q, c13721x95edc87c.f186829n);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.C13721x95edc87c c13721x95edc87c = this.f84546e;
        ac2.z zVar = c13721x95edc87c.f186827i;
        int i17 = zVar.f84605b == null ? 0 : 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNativeDramaTimelineFeedLoader", "dramaReq refresh ".concat(pm0.v.u(zVar.f84604a)));
        r45.qt2 m56354xfe9224be = c13721x95edc87c.m56354xfe9224be();
        ac2.z zVar2 = c13721x95edc87c.f186827i;
        return new bq.u0(m56354xfe9224be, zVar2.f84604a, zVar2.f84609f, zVar2.f84607d, zVar2.f84610g, i17, zVar2.f84605b, zVar2.f84606c, c13721x95edc87c.f186822d, b(), c13721x95edc87c.f186825g, this.f84545d, c13721x95edc87c.f186832q, c13721x95edc87c.f186829n);
    }
}
