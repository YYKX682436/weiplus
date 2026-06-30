package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes9.dex */
public class k2 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w11.i0 f144941d;

    public k2(com.p314xaae8f345.mm.p642xad8b531f.l2 l2Var, w11.i0 i0Var) {
        this.f144941d = i0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            r45.ta3 ta3Var = (r45.ta3) this.f144941d.f523590e.f152244b.f152233a;
            if (ta3Var.f467768g == 0) {
                r45.yx3 yx3Var = ta3Var.f467765d;
                r45.vx3 vx3Var = ta3Var.f467767f;
                java.lang.String str2 = yx3Var.f473005d + "," + yx3Var.f473006e + "," + yx3Var.f473007f + "," + yx3Var.f473008g + "," + vx3Var.f470175d + "," + vx3Var.f470176e + "," + vx3Var.f470177f;
                java.lang.String str3 = (java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_PUSH_LAST_BEACONINFO_STRING, null);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str3 == null) {
                    str3 = "";
                }
                java.lang.String[] split = str3.split(",");
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                for (java.lang.String str4 : split) {
                    if (str4.equals(vx3Var.f470175d + vx3Var.f470176e + vx3Var.f470177f)) {
                        bool = java.lang.Boolean.TRUE;
                    }
                }
                if (bool.booleanValue()) {
                    c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_PUSH_BEACONINFO_STRING, "");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var.d(12653, 1, 1);
                    g0Var.d(12653, 2, 1);
                    c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_PUSH_BEACONINFO_STRING, str2);
                }
            } else {
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_PUSH_BEACONINFO_STRING, "");
            }
        } else {
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_PUSH_BEACONINFO_STRING, "");
        }
        c01.d9.b().getClass();
        gm0.j1.i();
        gm0.j1.b().x();
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5349x11c946c9().e();
        com.p314xaae8f345.mm.p642xad8b531f.m2.f144975g = java.lang.Boolean.FALSE;
        c01.d9.e().q(1708, this);
    }
}
