package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class l3 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f107272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f107273b;

    public l3(com.tencent.mm.plugin.finder.feed.a7 a7Var, so2.y0 y0Var) {
        this.f107272a = a7Var;
        this.f107273b = y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // com.tencent.mm.plugin.lite.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onDispatch(long r1, java.lang.String r3, java.lang.Object r4, int r5) {
        /*
            r0 = this;
            java.lang.String r1 = "finderFeedCommentReportCompleted"
            boolean r1 = kotlin.jvm.internal.o.b(r3, r1)
            r2 = 0
            if (r1 == 0) goto L3f
            boolean r1 = r4 instanceof org.json.JSONObject
            if (r1 == 0) goto L3f
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            java.lang.String r1 = "result"
            r3 = 1
            boolean r5 = r4.has(r1)     // Catch: java.lang.Exception -> L22
            if (r5 != r3) goto L1a
            r5 = r3
            goto L1b
        L1a:
            r5 = r2
        L1b:
            if (r5 == 0) goto L2e
            int r1 = r4.getInt(r1)     // Catch: java.lang.Exception -> L22
            goto L2f
        L22:
            r1 = move-exception
            java.lang.String r4 = ""
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r5 = "safeGetInt"
            com.tencent.mm.sdk.platformtools.Log.a(r5, r4, r1)
        L2e:
            r1 = r2
        L2f:
            if (r1 != r3) goto L3f
            com.tencent.mm.plugin.finder.feed.a7 r1 = r0.f107272a
            android.content.Context r3 = r1.f106207d
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$exposeComment$1$1$1 r4 = new com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$exposeComment$1$1$1
            so2.y0 r5 = r0.f107273b
            r4.<init>(r5, r3)
            r4.alive()
        L3f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.l3.onDispatch(long, java.lang.String, java.lang.Object, int):boolean");
    }
}
