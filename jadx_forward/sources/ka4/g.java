package ka4;

/* loaded from: classes4.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ka4.g f387663d = new ka4.g();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$getAfterMaxToPredict$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "getAfterMaxToPredict >> " + ka4.m.a());
        if (ka4.m.a() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$getAfterMaxToPredict$1");
            return;
        }
        java.util.List a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.i2.f247555a.a(ka4.m.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getAfterMaxToPredict getSnsInfoLargeThanCreateTime >> ");
        sb6.append(((java.util.ArrayList) a17).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", sb6.toString());
        if (!r5.isEmpty()) {
            int m70357x3fdd41df = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) kz5.n0.X(a17)).m70357x3fdd41df();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            ka4.m.f387674f = m70357x3fdd41df;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            ka4.m.c(ka4.m.f387669a, (java.util.ArrayList) a17, true, ka4.c.f387656f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$getAfterMaxToPredict$1");
    }
}
