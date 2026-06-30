package j14;

/* loaded from: classes11.dex */
public class i extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public i() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        am.k3 k3Var;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5281xaccc9f21 c5281xaccc9f21 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5281xaccc9f21) abstractC20979x809547d1;
        if (c5281xaccc9f21 != null && (k3Var = c5281xaccc9f21.f135605g) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k3Var.f88659a) && k3Var.f88659a.startsWith("clicfg_settings_plugin_wetype_reddot")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreSetting", "receive clicfg_settings_plugin_wetype_reddot config.");
                java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_settings_plugin_wetype_reddot, "", true);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
                    try {
                        r45.j4 j4Var = new r45.j4();
                        j4Var.f459093g = 10002;
                        r45.du5 du5Var = new r45.du5();
                        du5Var.f454289d = Zi;
                        du5Var.f454290e = true;
                        j4Var.f459094h = du5Var;
                        com.p314xaae8f345.mm.p944x882e457a.p0 p0Var = new com.p314xaae8f345.mm.p944x882e457a.p0(j4Var, false, false, false);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
                        c01.ad.f118594a.b1(p0Var);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubCoreSetting", e17, null, new java.lang.Object[0]);
                    }
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k3Var.f88659a) && k3Var.f88659a.startsWith("clicfg_settings_plugin_params")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreSetting", "receive clicfg_settings_plugin_params config.");
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj("wxalitebf3a88de4da873052ba340892dc97559", null);
            }
        }
        return false;
    }
}
