package l44;

/* loaded from: classes3.dex */
public final class k5 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f397754a;

    public k5(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f397754a = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:3:0x001d, B:5:0x0030, B:7:0x0036, B:12:0x0042, B:16:0x004c, B:18:0x005a, B:19:0x005e), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:3:0x001d, B:5:0x0030, B:7:0x0036, B:12:0x0042, B:16:0x004c, B:18:0x005a, B:19:0x005e), top: B:2:0x001d }] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r0 = "onCallback"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2$1$2"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            kotlin.Result$Companion r2 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.String r2 = "access$parseAdFinderFollowResult"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            java.lang.String r4 = "FollowRequestHelper"
            java.lang.String r5 = "parseAdFinderFollowResult, ret="
            java.lang.String r6 = "parseAdFinderFollowResult"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r6, r3)
            r7 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L69
            r8.append(r10)     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Throwable -> L69
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5)     // Catch: java.lang.Throwable -> L69
            boolean r5 = r10 instanceof java.lang.String     // Catch: java.lang.Throwable -> L69
            if (r5 == 0) goto L33
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L69
            goto L34
        L33:
            r10 = 0
        L34:
            if (r10 == 0) goto L3f
            int r5 = r10.length()     // Catch: java.lang.Throwable -> L69
            if (r5 != 0) goto L3d
            goto L3f
        L3d:
            r5 = r7
            goto L40
        L3f:
            r5 = 1
        L40:
            if (r5 == 0) goto L4c
            java.lang.String r10 = "parseAdFinderFollowResult, null!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r10)     // Catch: java.lang.Throwable -> L69
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r3)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L4c:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L69
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L69
            java.lang.String r10 = "followType"
            int r10 = r5.optInt(r10)     // Catch: java.lang.Throwable -> L69
            r8 = 2
            if (r10 == r8) goto L5e
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r3)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L5e:
            java.lang.String r10 = "followRet"
            boolean r10 = r5.optBoolean(r10)     // Catch: java.lang.Throwable -> L69
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r3)     // Catch: java.lang.Throwable -> L69
            r7 = r10
            goto L7f
        L69:
            r10 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "parseAdFinderFollowResult, exp="
            r5.<init>(r8)
            r5.append(r10)
            java.lang.String r10 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r10)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r3)
        L7f:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)
            java.lang.Object r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r10)
            kotlinx.coroutines.q r2 = r9.f397754a
            kotlinx.coroutines.r r2 = (p3325xe03a0797.p3326xc267989b.r) r2
            r2.mo48700xdecd0e93(r10)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.k5.a(java.lang.Object):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2$1$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2$1$2");
    }
}
