package i64;

/* loaded from: classes4.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f370916a = new java.util.HashMap();

    public static synchronized int a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883) {
        int i17;
        boolean z17;
        synchronized (i64.z0.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
            int i18 = 0;
            if (c17932x22276883 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                return 0;
            }
            java.lang.String t07 = ca4.z0.t0(c17932x22276883.f67610x29d1292e);
            java.util.Map map = f370916a;
            if (((java.util.HashMap) map).containsKey(t07)) {
                i17 = ((java.lang.Integer) ((java.util.HashMap) map).get(t07)).intValue();
                z17 = true;
            } else {
                i17 = c17932x22276883.f67599x919325c3;
                z17 = false;
            }
            if (i17 >= 0) {
                i18 = i17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdExposureCountCache", "getExposureCount, id=" + t07 + ", count=" + i18 + ", useCache=" + z17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
            return i18;
        }
    }

    public static synchronized void b(java.lang.String str) {
        synchronized (i64.z0.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
            if (android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                return;
            }
            ((java.util.HashMap) f370916a).remove(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdExposureCountCache", "removeExposureCount, id=" + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
        }
    }
}
