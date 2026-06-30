package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class e8 extends ph.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f159530b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, boolean z17) {
        super(z17);
        this.f159530b = o6Var;
    }

    @Override // ph.f, ph.g
    public boolean f(ph.c cVar, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "onStateChanged receive event：%s", str);
        if (!str.equals(wh.e1.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a))) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "receive ACTION_POWER_SAVE_MODE_CHANGED");
        hb1.a aVar = new hb1.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0 = this.f159530b.C0();
        boolean mo48898xb1b1d24e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc.class)).mo48898xb1b1d24e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnBatteryInfoChangeJsApiEvent", "dispatch save battery change to web ， isLowPowerModeEnabled:%b", java.lang.Boolean.valueOf(mo48898xb1b1d24e));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("isLowPowerModeEnabled", java.lang.Boolean.valueOf(mo48898xb1b1d24e));
        aVar.u(C0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnBatteryInfoChangeJsApiEvent", "dispatch battery event");
        aVar.t(hashMap);
        aVar.m();
        return false;
    }
}
