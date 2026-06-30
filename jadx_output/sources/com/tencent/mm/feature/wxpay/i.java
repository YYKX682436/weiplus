package com.tencent.mm.feature.wxpay;

/* loaded from: classes9.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent f67847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.wxpay.WxPayFeatureService$1 f67848e;

    public i(com.tencent.mm.feature.wxpay.WxPayFeatureService$1 wxPayFeatureService$1, com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent beforeAggressiveCleanCacheEvent) {
        this.f67848e = wxPayFeatureService$1;
        this.f67847d = beforeAggressiveCleanCacheEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f67847d.f53999g.f7589a;
        boolean z17 = (i17 & 1) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPayFeatureService", "receive BeforeAggressiveCleanCacheEvent, flag:%s isOtherCleanEvent:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.f67848e.f67840d.wi();
            com.tencent.mars.xlog.Log.i("MicroMsg.WxPayFeatureService", "WPHK clean config cache");
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet");
            M.W("MMKV_KEY_WPHK_CONFIG_DATA");
            M.putLong("MMKV_KEY_WPHK_CONFIG_TIMESTAMP", c01.id.a());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1882, 121);
        }
    }
}
