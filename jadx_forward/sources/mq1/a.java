package mq1;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.m1.class})
/* loaded from: classes12.dex */
public class a extends i95.w {
    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        if (gm0.m.r()) {
            return;
        }
        gm0.j1.b().f354779i = true;
        gm0.m b17 = gm0.j1.b();
        if (!b17.m()) {
            synchronized (b17.f354773c) {
                if (!b17.m()) {
                    try {
                        if (wo.w0.s()) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6388x682a936a c6388x682a936a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6388x682a936a();
                            c6388x682a936a.f137324d = c6388x682a936a.b("PreFirstInstallTime", wo.w0.f529389r, true);
                            c6388x682a936a.f137325e = c6388x682a936a.b("CurFirstInstallTime", wo.w0.d(), true);
                            c6388x682a936a.f137326f = c6388x682a936a.b("PreAndroidId", wo.w0.f529390s, true);
                            c6388x682a936a.f137327g = c6388x682a936a.b("CurAndroidId", wo.w0.c(), true);
                            c6388x682a936a.f137328h = c6388x682a936a.b("PreDeviceModel", wo.w0.f529391t, true);
                            c6388x682a936a.f137329i = c6388x682a936a.b("CurDeviceModel", wo.w0.m(), true);
                            c6388x682a936a.k();
                        }
                    } catch (java.lang.Error e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MMKernel.CoreAccount", e17, null, new java.lang.Object[0]);
                    }
                    int a17 = gm0.l.a(gm0.m.f354766v);
                    if (a17 != 0) {
                        b17.f354784n = android.os.SystemClock.elapsedRealtime();
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMKernel.CoreAccount", "auto set up account storage uin: %d, stack: %s", java.lang.Integer.valueOf(a17), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                        b17.p(false);
                    }
                }
            }
        }
        gm0.j1.b().f354779i = false;
    }
}
