package l44;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final l44.h f397689a = new l44.h();

    /* renamed from: b, reason: collision with root package name */
    public static int f397690b = 90;

    /* renamed from: c, reason: collision with root package name */
    public static int f397691c = 200;

    public static final void a() {
        l44.h hVar = f397689a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanAdStorage", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1907, 35);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            hVar.c();
        } catch (java.lang.Throwable th6) {
            ca4.q.c("cleanPullAdRecords", th6);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        try {
            hVar.b();
        } catch (java.lang.Throwable th7) {
            ca4.q.c("cleanOldAdTask", th7);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdCleanStorageManager", "cleanAdStorage, cleanPullAdCost=" + (currentTimeMillis2 - currentTimeMillis) + ", cleanOldAdCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanAdStorage", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0117, code lost:
    
        if (r2.moveToFirst() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0119, code lost:
    
        r13 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883();
        r13.mo9015xbf5d97fd(r2);
        r13 = r13.m70298xd15b2ed8();
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012f, code lost:
    
        if (ca4.m0.U(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(r13), r8) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0131, code lost:
    
        r9.add(java.lang.Long.valueOf(r13.f68891x29d1292e));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0146, code lost:
    
        if (r2.moveToNext() != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013b, code lost:
    
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1907, 39);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0148, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdCleanStorageManager", "delete ad size = " + r9.size() + "  checkedAdCount = " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0168, code lost:
    
        vz5.b.a(r2, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.h.b():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fb, code lost:
    
        if (r2.moveToFirst() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fd, code lost:
    
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$1");
        r10 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$1");
        r10.mo9015xbf5d97fd(r2);
        r5.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011d, code lost:
    
        if (r2.moveToNext() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0122, code lost:
    
        vz5.b.a(r2, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.h.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() {
        /*
            r8 = this;
            java.lang.String r0 = "AdCleanStorageManager"
            java.lang.String r1 = "isAdAutoCleanEnable called "
            java.lang.String r2 = "isAdAutoCleanEnable"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            r4 = 0
            java.lang.Class<e42.e0> r5 = e42.e0.class
            i95.m r5 = i95.n0.c(r5)     // Catch: java.lang.Throwable -> L30
            e42.e0 r5 = (e42.e0) r5     // Catch: java.lang.Throwable -> L30
            e42.d0 r6 = e42.d0.clicfg_sns_ad_auto_clean_android     // Catch: java.lang.Throwable -> L30
            h62.d r5 = (h62.d) r5     // Catch: java.lang.Throwable -> L30
            int r5 = r5.Ni(r6, r4)     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            r6.append(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L2e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L2e
            goto L44
        L2e:
            r1 = move-exception
            goto L32
        L30:
            r1 = move-exception
            r5 = r4
        L32:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "isAdAutoCleanEnable, exp="
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
        L44:
            if (r5 <= 0) goto L47
            r4 = 1
        L47:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.h.d():boolean");
    }
}
