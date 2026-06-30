package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class z0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f247715e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883.f38302x3164ae, "adsnsinfo")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f247716f = {"CREATE INDEX IF NOT EXISTS serverAdSnsNameIndex ON AdSnsInfo ( snsId )", "CREATE INDEX IF NOT EXISTS serverAdSnsTimeHeadIndex ON AdSnsInfo ( head )", "DROP INDEX IF EXISTS serverAdSnsTimeIndex", "DROP INDEX IF EXISTS serverAdSnsTimeSourceTypeIndex", "CREATE INDEX IF NOT EXISTS adsnsMultiIndex1 ON AdSnsInfo ( createTime,snsId,sourceType,type)", "CREATE INDEX IF NOT EXISTS adsnsMultiIndex2 ON AdSnsInfo ( sourceType,type,userName)"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f247717d;

    static {
        java.lang.String.format("select  %s %s,rowid from AdSnsInfo ", "snsId", "createTime");
    }

    public z0(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883.f38302x3164ae, "adsnsinfo", f247716f);
        this.f247717d = k0Var;
    }

    public android.database.Cursor D0(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdInTime", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        android.database.Cursor f17 = this.f247717d.f(("select *,rowid from AdSnsInfo  where createTime > " + i18 + " and createTime <= " + i17 + " and " + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2.f247526z) + " order by  createTime desc", null, 2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInTime", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return f17;
    }

    public android.database.Cursor J0(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdInTimeWithLimit", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        android.database.Cursor f17 = this.f247717d.f(("select *,rowid from AdSnsInfo  where createTime > " + i18 + " and createTime <= " + i17 + " and " + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2.f247526z) + " order by  createTime desc limit " + i19, null, 2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInTimeWithLimit", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return f17;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 L0(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getByLocalId", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883();
        android.database.Cursor f17 = this.f247717d.f("select *,rowid from AdSnsInfo  where AdSnsInfo.rowid=" + i17, null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getByLocalId", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
            return null;
        }
        c17932x22276883.mo9015xbf5d97fd(f17);
        f17.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getByLocalId", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return c17932x22276883;
    }

    public boolean P0(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSnsIdExist", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        android.database.Cursor f17 = this.f247717d.f("select *,rowid from AdSnsInfo  where AdSnsInfo.snsId=" + j17, null, 2);
        boolean moveToFirst = f17.moveToFirst();
        f17.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsIdExist", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return moveToFirst;
    }

    public boolean W0(long j17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883) {
        int l17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replaceUserBySnsId", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        if (P0(j17)) {
            boolean b17 = b1(j17, c17932x22276883);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceUserBySnsId", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
            return b17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorage", "added SnsId " + j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("set", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        if (c17932x22276883 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("set", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
            l17 = -1;
        } else {
            l17 = (int) this.f247717d.l(dm.n.f67539xc4fe047c, "", c17932x22276883.mo9763xeb27878e());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("set", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        }
        boolean z17 = l17 != -1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceUserBySnsId", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return z17;
    }

    public boolean b1(long j17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("update", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        android.content.ContentValues mo9763xeb27878e = c17932x22276883.mo9763xeb27878e();
        mo9763xeb27878e.remove("rowid");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        boolean z17 = this.f247717d.p(dm.n.f67539xc4fe047c, mo9763xeb27878e, "snsId=?", new java.lang.String[]{sb6.toString()}) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("update", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return z17;
    }

    /* JADX WARN: Finally extract failed */
    @Override // l75.n0
    /* renamed from: delete */
    public boolean mo70496xb06685ab(long j17) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("delete", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        java.lang.String t07 = ca4.z0.t0(j17);
        java.util.HashMap hashMap = p34.o.f433219a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("delAd", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (!android.text.TextUtils.isEmpty(t07)) {
                java.util.HashMap hashMap2 = p34.o.f433219a;
                synchronized (hashMap2) {
                    try {
                        hashMap2.remove(t07);
                        p34.o.f433220b.remove(t07);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("sns_ad_mmkv");
                        M.getClass();
                        M.remove(t07);
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delAd", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
                        throw th6;
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdLocalStoreage", "delAd, snsId=" + t07 + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdLocalStoreage", "delAd, exp=" + th7.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delAd", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
        }
        ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).e7(j17, o75.b.f425117e);
        int mo70514xb06685ab = this.f247717d.mo70514xb06685ab(dm.n.f67539xc4fe047c, "snsId=?", new java.lang.String[]{"" + j17});
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorage", "del msg " + j17 + " res " + mo70514xb06685ab);
        boolean z17 = mo70514xb06685ab > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delete", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return z17;
    }

    @Override // l75.n0
    /* renamed from: update */
    public /* bridge */ /* synthetic */ boolean mo11261xce0038c9(long j17, l75.f0 f0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("update", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        boolean b17 = b1(j17, (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883) f0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("update", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return b17;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y0(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883();
        android.database.Cursor f17 = this.f247717d.f("select *,rowid from AdSnsInfo  where AdSnsInfo.snsId=" + j17, null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
            return null;
        }
        c17932x22276883.mo9015xbf5d97fd(f17);
        f17.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return c17932x22276883;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r5 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int z0() {
        /*
            r8 = this;
            java.lang.String r0 = "getAdCount, exp="
            java.lang.String r1 = "select count(*) from AdSnsInfo where "
            java.lang.String r2 = "getAdCount"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            r4 = 0
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            java.lang.String r1 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2.f247526z     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r6.append(r1)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            l75.k0 r6 = r8.f247717d     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r7 = 2
            android.database.Cursor r5 = r6.f(r1, r5, r7)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            if (r5 == 0) goto L30
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            if (r1 == 0) goto L30
            int r0 = r5.getInt(r4)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r4 = r0
        L30:
            if (r5 == 0) goto L4d
        L32:
            r5.close()
            goto L4d
        L36:
            r0 = move-exception
            goto L51
        L38:
            r1 = move-exception
            java.lang.String r6 = "MicroMsg.AdSnsInfoStorage"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L36
            r7.append(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L36
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r0)     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L4d
            goto L32
        L4d:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return r4
        L51:
            if (r5 == 0) goto L56
            r5.close()
        L56:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.z0.z0():int");
    }
}
