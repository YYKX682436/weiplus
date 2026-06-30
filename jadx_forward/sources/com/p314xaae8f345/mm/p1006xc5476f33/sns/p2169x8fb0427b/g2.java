package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f247537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f247538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f247539f;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h2 h2Var, java.lang.String str, long j17, int i17) {
        this.f247537d = str;
        this.f247538e = j17;
        this.f247539f = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r22 = this;
            r0 = r22
            java.lang.String r1 = "run"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.SnsInfoStorage$1$1"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r1, r2)
            java.lang.String r3 = "SnsMMKV"
            com.tencent.mm.sdk.platformtools.o4 r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(r3)
            java.lang.String r4 = "SnsMMKVCleanDbCount"
            r5 = -1
            long r4 = r3.getLong(r4, r5)
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto Ld3
            java.lang.String r6 = "getSQLHashMap"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.storage.SnsSqliteDB"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r6, r7)
            java.util.concurrent.ConcurrentHashMap r8 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2.f247632b
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r7)
            if (r8 == 0) goto Ld3
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r6, r7)
            java.util.concurrent.ConcurrentHashMap r8 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2.f247632b
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r7)
            java.lang.String r6 = r0.f247537d
            int r7 = r6.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r8.get(r7)
            com.tencent.mm.plugin.sns.storage.o2 r7 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o2) r7
            if (r7 == 0) goto Ld3
            java.lang.String r8 = r7.f247620a
            if (r8 != 0) goto L4e
            java.lang.String r8 = ""
            r7.f247620a = r8
        L4e:
            java.lang.String r8 = "SnsMMKVCleanDbIsFirstTime"
            r9 = 1
            boolean r3 = r3.getBoolean(r8, r9)
            java.lang.String[] r8 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2.f247511h
            java.lang.String r8 = "access$100"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.storage.SnsInfoStorage"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r8, r10)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r8, r10)
            int r8 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2.D
            long r11 = (long) r8
            long r13 = r0.f247538e
            int r8 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r8 < 0) goto L78
            java.lang.String r8 = "access$200"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r8, r10)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r8, r10)
            boolean r8 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2.E
            if (r8 == 0) goto L78
            r8 = r9
            goto L79
        L78:
            r8 = 0
        L79:
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r8)
            int r10 = r0.f247539f
            java.lang.Integer r16 = java.lang.Integer.valueOf(r10)
            java.lang.Long r17 = java.lang.Long.valueOf(r13)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r3)
            boolean r11 = r7.f247621b
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r11)
            java.lang.String r12 = r0.f247537d
            java.lang.String r9 = r7.f247620a
            r20 = r12
            r21 = r9
            java.lang.Object[] r9 = new java.lang.Object[]{r15, r16, r17, r18, r19, r20, r21}
            java.lang.String r12 = "MicroMsg.SnsInfoStorage"
            java.lang.String r15 = "SQLExecuted needReport:%s, type:%s, time:%s, isBeforeFirstTime:%s, isMainThread:%s, sql:%s, stack:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r12, r15, r9)
            if (r8 == 0) goto Ld3
            com.tencent.mm.autogen.mmdata.rpt.SnsSQLExecuteReportStruct r8 = new com.tencent.mm.autogen.mmdata.rpt.SnsSQLExecuteReportStruct
            r8.<init>()
            r8.f142247d = r4
            r8.f142249f = r13
            r4 = 44
            r5 = 32
            java.lang.String r4 = r6.replace(r4, r5)
            java.lang.String r5 = "Sql"
            r6 = 1
            java.lang.String r4 = r8.b(r5, r4, r6)
            r8.f142250g = r4
            r8.f142248e = r10
            java.lang.String r4 = r7.f247620a
            java.lang.String r5 = "Stack"
            java.lang.String r4 = r8.b(r5, r4, r6)
            r8.f142251h = r4
            r8.f142252i = r3
            r8.f142253j = r11
            r8.l()
        Ld3:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.g2.run():void");
    }
}
