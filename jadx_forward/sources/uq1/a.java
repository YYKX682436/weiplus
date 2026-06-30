package uq1;

/* loaded from: classes.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        int i17;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd) abstractC20979x809547d1;
        if (c5255x5f3208fd != null) {
            am.r2 r2Var = c5255x5f3208fd.f135586g;
            int i18 = r2Var.f89292a;
            if (i18 == 62) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BoxCheckResUpdateListener", "CheckResUpdateCacheFileEvent %d", java.lang.Integer.valueOf(r2Var.f89293b));
                if (r2Var.f89293b == 2) {
                    java.lang.String Di = rq1.m0.Di();
                    if (com.p314xaae8f345.mm.vfs.w6.j(Di)) {
                        com.p314xaae8f345.mm.vfs.w6.h(Di);
                    }
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(Di);
                    if (!r6Var.s().m()) {
                        com.p314xaae8f345.mm.vfs.w6.u(r6Var.r());
                    }
                    com.p314xaae8f345.mm.vfs.w6.c(r2Var.f89294c, Di);
                    ((rq1.m0) i95.n0.c(rq1.m0.class)).aj();
                }
            } else if (i18 == 73 && (i17 = r2Var.f89293b) == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BoxCheckResUpdateListener", "[checkResUpdateListener] word bank download, subtype: %d, file path: %s, version: %s, updated: %s", java.lang.Integer.valueOf(i17), r2Var.f89294c, java.lang.Integer.valueOf(r2Var.f89295d), java.lang.Boolean.valueOf(r2Var.f89296e));
                rq1.m0.bj(r2Var.f89294c, false);
            }
        }
        return false;
    }
}
