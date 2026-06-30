package com.p314xaae8f345.mm.p1006xc5476f33.hp.p1779x633fb29;

/* renamed from: com.tencent.mm.plugin.hp.model.TinkerBootsActivateListener */
/* loaded from: classes11.dex */
public class C16112xb63066a9 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47> {

    /* renamed from: d, reason: collision with root package name */
    public static long f223935d;

    public C16112xb63066a9() {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f39173x3fe91575 = -1435144905;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47 c5147x8f44fd47) {
        if (!c5147x8f44fd47.f135497g.f87945a && gm0.j1.a()) {
            if (f223935d == 0) {
                f223935d = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TINKER_BOOTS_CHECK_LAST_TIME_LONG, 0L)).longValue();
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - f223935d >= 21600000) {
                try {
                    if (fy5.a.d() != null) {
                        fy5.a.d().a(false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.TinkerBootsActivateListener", "callback post task and fetchPatchUpdate false");
                        f223935d = currentTimeMillis;
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TINKER_BOOTS_CHECK_LAST_TIME_LONG, java.lang.Long.valueOf(currentTimeMillis));
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Tinker.TinkerBootsActivateListener", th6, "failure.", new java.lang.Object[0]);
                }
            }
        }
        return false;
    }
}
