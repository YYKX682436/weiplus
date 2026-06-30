package aq1;

/* loaded from: classes11.dex */
public class t0 implements vg3.x4 {
    @Override // vg3.x4
    public void A(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27;
        r45.j4 j4Var = (r45.j4) fVar;
        java.lang.String g17 = x51.j1.g(j4Var.f459091e);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(g17)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 W0 = ((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).W0(g17);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(g17, true);
            if (n17 == null || ((int) n17.E2) <= 0) {
                ((c01.k7) c01.n8.a()).b(g17, 32, new aq1.s0(this, W0, g17));
            } else if (W0.Q0()) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5732x9b42e3d5 c5732x9b42e3d5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5732x9b42e3d5();
                am.vk vkVar = c5732x9b42e3d5.f136057g;
                vkVar.f89732a = g17;
                vkVar.f89733b = W0.D0();
                c5732x9b42e3d5.e();
            }
        }
        long j17 = j4Var.f459101r;
        int i17 = c01.ia.f118787a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17) || j17 <= 0) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = c01.ia.f118788b;
        if (!concurrentHashMap.containsKey(java.lang.Long.valueOf(j17)) || (o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g17, j17)) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o27.Q0()) || o27.I0() <= 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSourceHelper", "found sec msg of %s", java.lang.Long.valueOf(j17));
        c01.ia.O(o27, (java.lang.String) concurrentHashMap.get(java.lang.Long.valueOf(j17)), true);
        concurrentHashMap.remove(java.lang.Long.valueOf(j17));
    }

    @Override // vg3.x4
    public void E0(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        java.lang.String g17 = x51.j1.g(((r45.j4) fVar).f459091e);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17) || ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().j0(g17)) {
            return;
        }
        c01.n8.a().c(g17, 29);
    }
}
