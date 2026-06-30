package ka4;

/* loaded from: classes4.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ka4.h f387664d = new ka4.h();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$getBeforeMinToPredict$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "getBeforeMinToPredict >> " + ka4.m.b());
        if (ka4.m.b() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$getBeforeMinToPredict$1");
            return;
        }
        java.util.List b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.i2.f247555a.b(ka4.m.b(), 50);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getBeforeMinToPredict getSnsInfoSmallThanCreateTimeAndLimit >> ");
        sb6.append(((java.util.ArrayList) b17).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", sb6.toString());
        if (!r5.isEmpty()) {
            int m70357x3fdd41df = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) kz5.n0.i0(b17)).m70357x3fdd41df();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            ka4.m.f387675g = m70357x3fdd41df;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            ka4.m.c(ka4.m.f387669a, (java.util.ArrayList) b17, true, ka4.c.f387657g);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$getBeforeMinToPredict$1");
    }
}
