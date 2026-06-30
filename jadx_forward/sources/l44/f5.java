package l44;

/* loaded from: classes3.dex */
public final class f5 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f397669a;

    public f5(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f397669a = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046 A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:3:0x0020, B:5:0x0033, B:8:0x003a, B:13:0x0046, B:17:0x0050, B:19:0x005d, B:20:0x0061, B:22:0x0069, B:23:0x007c, B:26:0x0086), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:3:0x0020, B:5:0x0033, B:8:0x003a, B:13:0x0046, B:17:0x0050, B:19:0x005d, B:20:0x0061, B:22:0x0069, B:23:0x007c, B:26:0x0086), top: B:2:0x0020 }] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r0 = "onCallback"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getFinderFollowStatus$2$1"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            kotlin.Result$Companion r2 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.String r2 = "access$parseAdFinderIsFollowedData"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            java.lang.String r4 = "FollowRequestHelper"
            java.lang.String r5 = "parseAdFinderIsFollowedData, err! "
            java.lang.String r6 = "parseAdFinderIsFollowedData, ret="
            java.lang.String r7 = "parseAdFinderIsFollowedData"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r3)
            r8 = 0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r9.<init>(r6)     // Catch: java.lang.Throwable -> L8b
            r9.append(r11)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> L8b
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r6)     // Catch: java.lang.Throwable -> L8b
            boolean r6 = r11 instanceof java.lang.String     // Catch: java.lang.Throwable -> L8b
            if (r6 == 0) goto L36
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L8b
            goto L37
        L36:
            r11 = 0
        L37:
            r6 = 1
            if (r11 == 0) goto L43
            int r9 = r11.length()     // Catch: java.lang.Throwable -> L8b
            if (r9 != 0) goto L41
            goto L43
        L41:
            r9 = r8
            goto L44
        L43:
            r9 = r6
        L44:
            if (r9 == 0) goto L50
            java.lang.String r11 = "parseAdFinderIsFollowedData, null!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r11)     // Catch: java.lang.Throwable -> L8b
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r3)     // Catch: java.lang.Throwable -> L8b
            goto La1
        L50:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8b
            r9.<init>(r11)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r11 = "followType"
            int r11 = r9.optInt(r11)     // Catch: java.lang.Throwable -> L8b
            if (r11 == r6) goto L61
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r3)     // Catch: java.lang.Throwable -> L8b
            goto La1
        L61:
            java.lang.String r11 = "errCode"
            int r11 = r9.optInt(r11)     // Catch: java.lang.Throwable -> L8b
            if (r11 == 0) goto L7c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L8b
            r6.append(r11)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r11 = r6.toString()     // Catch: java.lang.Throwable -> L8b
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r11)     // Catch: java.lang.Throwable -> L8b
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r3)     // Catch: java.lang.Throwable -> L8b
            goto La1
        L7c:
            java.lang.String r11 = "followFlg"
            int r11 = r9.optInt(r11)     // Catch: java.lang.Throwable -> L8b
            if (r11 == 0) goto L85
            goto L86
        L85:
            r6 = r8
        L86:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r3)     // Catch: java.lang.Throwable -> L8b
            r8 = r6
            goto La1
        L8b:
            r11 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "parseAdFinderIsFollowedData, exp="
            r5.<init>(r6)
            r5.append(r11)
            java.lang.String r11 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r11)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r3)
        La1:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r8)
            java.lang.Object r11 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r11)
            kotlinx.coroutines.q r2 = r10.f397669a
            kotlinx.coroutines.r r2 = (p3325xe03a0797.p3326xc267989b.r) r2
            r2.mo48700xdecd0e93(r11)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.f5.a(java.lang.Object):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getFinderFollowStatus$2$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getFinderFollowStatus$2$1");
    }
}
