package i64;

/* loaded from: classes4.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f370867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i64.b1 f370868e;

    public v0(i64.b1 b1Var, java.util.Map map) {
        this.f370868e = b1Var;
        this.f370867d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        boolean containsKey;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$5");
        for (java.lang.String str : this.f370867d.keySet()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 L0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().L0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.m(str));
            if (L0 != null) {
                java.lang.String t07 = ca4.z0.t0(L0.f67610x29d1292e);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 m70298xd15b2ed8 = L0.m70298xd15b2ed8();
                L0.m70323x74fd560a();
                int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
                int i18 = 0;
                if (this.f370867d.containsKey(str)) {
                    currentTimeMillis = ((java.lang.Integer) this.f370867d.get(str)).intValue();
                    i17 = 1;
                } else {
                    i17 = 0;
                }
                if (L0.f67600xa9e31799 <= 0) {
                    L0.f67600xa9e31799 = currentTimeMillis;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStatistic", "update Ad ExposureTime, snsId=" + t07 + ", exposuretime=" + currentTimeMillis + "， sys.currentTimeMis=" + java.lang.System.currentTimeMillis() + ", type=" + i17);
                }
                i64.b1 b1Var = this.f370868e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                boolean z17 = b1Var.f370640v;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                if (z17) {
                    int i19 = L0.f67599x919325c3;
                    java.util.Map map = i64.z0.f370916a;
                    synchronized (i64.z0.class) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasCache", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                        if (android.text.TextUtils.isEmpty(t07)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdExposureCountCache", "hasCache, err id=" + t07);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasCache", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                            containsKey = false;
                        } else {
                            containsKey = ((java.util.HashMap) i64.z0.f370916a).containsKey(t07);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasCache", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                        }
                    }
                    if (containsKey) {
                        synchronized (i64.z0.class) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                            if (android.text.TextUtils.isEmpty(t07)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdExposureCountCache", "getExposureCount, err id=" + t07);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                            } else {
                                java.util.Map map2 = i64.z0.f370916a;
                                if (((java.util.HashMap) map2).containsKey(t07)) {
                                    i18 = ((java.lang.Integer) ((java.util.HashMap) map2).get(t07)).intValue();
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                                } else {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                                }
                            }
                        }
                        L0.f67599x919325c3 = i18;
                    } else {
                        i18 = -1;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdExposureCountCache", "write db, snsId=" + t07 + ", localId=" + str + ", cacheCount=" + i18 + ", exposureCountInDb=" + i19);
                }
                if (m70298xd15b2ed8 != null) {
                    m70298xd15b2ed8.m70444x74fd560a();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().v3(m70298xd15b2ed8.f68891x29d1292e, m70298xd15b2ed8);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().b1(L0.f67610x29d1292e, L0);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdExposureCountCache", "clear, snsInfo==null, localId=" + str);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$5");
    }
}
