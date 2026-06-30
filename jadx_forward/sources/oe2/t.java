package oe2;

/* loaded from: classes8.dex */
public final class t implements vg3.q4 {
    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        r45.j4 j4Var;
        if (gm0.j1.a() && str != null && map != null) {
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.live.finderliveid");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() == 0) {
                oe2.x xVar = oe2.x.f426319a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeTipsBarConsumer liveIdStr empty, xml:");
                sb6.append(x51.j1.g((p0Var == null || (j4Var = p0Var.f152259a) == null) ? null : j4Var.f459094h));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTipsBarDataEventReceiver", sb6.toString());
            } else {
                long Z = pm0.v.Z(str2);
                oe2.x xVar2 = oe2.x.f426319a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTipsBarDataEventReceiver", "removeTipsBarConsumer recv liveId:".concat(pm0.v.u(Z)));
                rl2.v b17 = oe2.x.b(oe2.x.f426319a);
                if (b17 != null) {
                    b17.z0(Z, true);
                }
            }
        }
        return null;
    }
}
