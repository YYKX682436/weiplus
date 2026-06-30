package he;

/* loaded from: classes7.dex */
public abstract class b {
    public static int a(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar) {
        android.view.WindowInsets b17;
        int stableInsetTop;
        if (yVar.t3() != null && yVar.z1(ae.a.class) != null) {
            if (((ae.q) yVar.z1(ae.q.class)) == null || !(yVar.mo50261xee5260a9() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WAGameCommonUtil", new ae.s(), "hy: not game service", new java.lang.Object[0]);
            } else {
                android.app.Activity Z0 = yVar.Z0();
                if (Z0 != null && (b17 = com.p314xaae8f345.mm.ui.qk.b(Z0)) != null && (stableInsetTop = b17.getStableInsetTop()) > 0) {
                    return ik1.w.e(stableInsetTop);
                }
            }
        }
        return 0;
    }
}
