package com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27;

/* loaded from: classes9.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de f149380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27.C10696x2563e3b3 f149381e;

    public i(com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27.C10696x2563e3b3 c10696x2563e3b3, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de c5189xf98047de) {
        this.f149381e = c10696x2563e3b3;
        this.f149380d = c5189xf98047de;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f149380d.f135532g.f89122a;
        boolean z17 = (i17 & 1) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayFeatureService", "receive BeforeAggressiveCleanCacheEvent, flag:%s isOtherCleanEvent:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.f149381e.f149373d.wi();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayFeatureService", "WPHK clean config cache");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet");
            M.W("MMKV_KEY_WPHK_CONFIG_DATA");
            M.putLong("MMKV_KEY_WPHK_CONFIG_TIMESTAMP", c01.id.a());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1882, 121);
        }
    }
}
