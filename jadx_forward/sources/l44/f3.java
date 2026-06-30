package l44;

/* loaded from: classes4.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public static final l44.f3 f397668a = new l44.f3();

    public static final org.json.JSONObject a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdLocalRecordJSON", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            l44.f3 f3Var = f397668a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimeConfig", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            int Ni = e0Var != null ? ((h62.d) e0Var).Ni(e42.c0.clicfg_sns_ad_passthrough_report_local_ads_time_config, 0) : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeConfig", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLimitConfig", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
            e42.e0 e0Var2 = (e42.e0) i95.n0.c(e42.e0.class);
            int Ni2 = e0Var2 != null ? ((h62.d) e0Var2).Ni(e42.c0.clicfg_sns_ad_passthrough_report_local_ads_limit_config, 50) : 50;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLimitConfig", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLocalRecordHelper", "the time config is " + Ni + ", limit config is " + Ni2);
            l44.c3 b17 = f3Var.b(Ni, Ni2);
            r8 = b17 != null ? b17.a() : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLocalRecordHelper", "obtain local record json takes " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th6) {
            ca4.q.c("getAdLocalRecordJSON", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdLocalRecordJSON", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
        return r8;
    }

    public final l44.c3 b(int i17, int i18) {
        int i19;
        android.database.Cursor D0;
        android.database.Cursor d17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLocalAdRecordJson", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
        java.lang.String str = "SnsAd.AdLocalRecordHelper";
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AdLocalRecordHelper", "the time config is 0");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalAdRecordJson", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
            return null;
        }
        int e17 = c01.id.e();
        int i27 = e17 - (86400 * i17);
        if (i27 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AdLocalRecordHelper", "the time is invalid!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalAdRecordJson", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
            return null;
        }
        int i28 = i18 <= 0 ? -1 : i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fetchAdRecords", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
        l44.d3 d3Var = l44.e3.f397641k;
        if (Fj == null || (d17 = Fj.d1("", i27, i28)) == null) {
            i19 = 0;
        } else {
            int i29 = 0;
            int i37 = 0;
            while (d17.moveToNext()) {
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
                    c17933xe8d1b226.mo9015xbf5d97fd(d17);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAd", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                    boolean z17 = c17933xe8d1b226.m70377x3172ed();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAd", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                    if (z17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 m70351xaa22b9ed = c17933xe8d1b226.m70351xaa22b9ed();
                        if (m70351xaa22b9ed != null) {
                            arrayList.add(d3Var.a(m70351xaa22b9ed, i29, i37));
                            linkedHashSet.add(java.lang.Long.valueOf(m70351xaa22b9ed.f67610x29d1292e));
                            i29++;
                            i37++;
                            str = str;
                        }
                    } else {
                        i29++;
                    }
                } finally {
                }
            }
            str = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "the getAdCursorForTimeLine ad absolute pos is " + i29 + ", ad relative pos is " + i37);
            vz5.b.a(d17, null);
            i19 = i37;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.z0 Vi = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi();
        if (Vi != null && (D0 = Vi.D0(e17, i27)) != null) {
            while (D0.moveToNext()) {
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883();
                    c17932x22276883.mo9015xbf5d97fd(D0);
                    if (!linkedHashSet.contains(java.lang.Long.valueOf(c17932x22276883.f67610x29d1292e))) {
                        int i38 = i19 + 1;
                        arrayList.add(d3Var.a(c17932x22276883, -1, i19));
                        i19 = i38;
                    }
                } finally {
                }
            }
            vz5.b.a(D0, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "the getAdInTime cursor ad relative pos is " + i19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fetchAdRecords", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
        l44.c3 c3Var = new l44.c3(i17, arrayList, 0, 4, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalAdRecordJson", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
        return c3Var;
    }
}
