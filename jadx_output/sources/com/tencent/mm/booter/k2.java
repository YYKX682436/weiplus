package com.tencent.mm.booter;

/* loaded from: classes9.dex */
public class k2 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w11.i0 f63408d;

    public k2(com.tencent.mm.booter.l2 l2Var, w11.i0 i0Var) {
        this.f63408d = i0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            r45.ta3 ta3Var = (r45.ta3) this.f63408d.f442057e.f70711b.f70700a;
            if (ta3Var.f386235g == 0) {
                r45.yx3 yx3Var = ta3Var.f386232d;
                r45.vx3 vx3Var = ta3Var.f386234f;
                java.lang.String str2 = yx3Var.f391472d + "," + yx3Var.f391473e + "," + yx3Var.f391474f + "," + yx3Var.f391475g + "," + vx3Var.f388642d + "," + vx3Var.f388643e + "," + vx3Var.f388644f;
                java.lang.String str3 = (java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_LAST_BEACONINFO_STRING, null);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str3 == null) {
                    str3 = "";
                }
                java.lang.String[] split = str3.split(",");
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                for (java.lang.String str4 : split) {
                    if (str4.equals(vx3Var.f388642d + vx3Var.f388643e + vx3Var.f388644f)) {
                        bool = java.lang.Boolean.TRUE;
                    }
                }
                if (bool.booleanValue()) {
                    c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_BEACONINFO_STRING, "");
                } else {
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var.d(12653, 1, 1);
                    g0Var.d(12653, 2, 1);
                    c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_BEACONINFO_STRING, str2);
                }
            } else {
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_BEACONINFO_STRING, "");
            }
        } else {
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_BEACONINFO_STRING, "");
        }
        c01.d9.b().getClass();
        gm0.j1.i();
        gm0.j1.b().x();
        new com.tencent.mm.autogen.events.ExDeviceIBeaconPushRefreshUIEvent().e();
        com.tencent.mm.booter.m2.f63442g = java.lang.Boolean.FALSE;
        c01.d9.e().q(1708, this);
    }
}
