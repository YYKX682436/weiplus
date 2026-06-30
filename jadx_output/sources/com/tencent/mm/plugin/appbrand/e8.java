package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class e8 extends ph.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f77997b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(com.tencent.mm.plugin.appbrand.o6 o6Var, boolean z17) {
        super(z17);
        this.f77997b = o6Var;
    }

    @Override // ph.f, ph.g
    public boolean f(ph.c cVar, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "onStateChanged receive event：%s", str);
        if (!str.equals(wh.e1.a(com.tencent.mm.sdk.platformtools.x2.f193071a))) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "receive ACTION_POWER_SAVE_MODE_CHANGED");
        hb1.a aVar = new hb1.a();
        com.tencent.mm.plugin.appbrand.service.c0 C0 = this.f77997b.C0();
        boolean isOnPowerSavedMode = ((com.tencent.mm.plugin.appbrand.fc) i95.n0.c(com.tencent.mm.plugin.appbrand.fc.class)).isOnPowerSavedMode();
        com.tencent.mars.xlog.Log.i("MicroMsg.OnBatteryInfoChangeJsApiEvent", "dispatch save battery change to web ， isLowPowerModeEnabled:%b", java.lang.Boolean.valueOf(isOnPowerSavedMode));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("isLowPowerModeEnabled", java.lang.Boolean.valueOf(isOnPowerSavedMode));
        aVar.u(C0);
        com.tencent.mars.xlog.Log.i("MicroMsg.OnBatteryInfoChangeJsApiEvent", "dispatch battery event");
        aVar.t(hashMap);
        aVar.m();
        return false;
    }
}
