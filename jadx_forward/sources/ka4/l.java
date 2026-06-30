package ka4;

/* loaded from: classes4.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ka4.l f387668d = new ka4.l();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$startKaraPredict$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "startKaraPredict >> " + ka4.m.a() + ", " + ka4.m.b());
        if (ka4.m.a() == 0 || ka4.m.a() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsInfoLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorageKt");
            p75.i0 i17 = dm.va.f68837x4be43ae.i();
            i17.e(dm.va.f68821x6e9501c9.u());
            i17.c(100, 0);
            java.util.List k17 = i17.a().k(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.aj(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.class);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSnsInfoLimit >>  size: ");
            java.util.ArrayList arrayList = (java.util.ArrayList) k17;
            sb6.append(arrayList.size());
            sb6.append(", limit: 100");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageKt", sb6.toString());
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) it.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageKt", "getSnsInfoLimit >> " + c17933xe8d1b226.m70357x3fdd41df() + ", " + c17933xe8d1b226.m70367x7525eefd() + ". " + c17933xe8d1b226.f38324x142bbdc6);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfoLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorageKt");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "startKaraPredict getSnsInfoLimit >> " + arrayList.size());
            if (!arrayList.isEmpty()) {
                ka4.m mVar = ka4.m.f387669a;
                int m70357x3fdd41df = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) kz5.n0.X(k17)).m70357x3fdd41df();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                ka4.m.f387674f = m70357x3fdd41df;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                int m70357x3fdd41df2 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) kz5.n0.i0(k17)).m70357x3fdd41df();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                ka4.m.f387675g = m70357x3fdd41df2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                ka4.m.c(ka4.m.f387669a, (java.util.ArrayList) k17, true, ka4.c.f387655e);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.i2 i2Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.i2.f247555a;
            java.util.List a17 = i2Var.a(ka4.m.a());
            java.util.List b17 = i2Var.b(ka4.m.b(), 50);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("startKaraPredict getSnsInfoLargeThanCreateTime >> ");
            sb7.append(((java.util.ArrayList) a17).size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("startKaraPredict getSnsInfoSmallThanCreateTimeAndLimit >> ");
            sb8.append(((java.util.ArrayList) b17).size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", sb8.toString());
            if (!r10.isEmpty()) {
                int m70357x3fdd41df3 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) kz5.n0.X(a17)).m70357x3fdd41df();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                ka4.m.f387674f = m70357x3fdd41df3;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                ka4.m.c(ka4.m.f387669a, (java.util.ArrayList) a17, true, ka4.c.f387656f);
            }
            if (!r11.isEmpty()) {
                int m70357x3fdd41df4 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) kz5.n0.i0(b17)).m70357x3fdd41df();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                ka4.m.f387675g = m70357x3fdd41df4;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                ka4.m.c(ka4.m.f387669a, (java.util.ArrayList) b17, true, ka4.c.f387657g);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$startKaraPredict$1");
    }
}
