package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes9.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f270353d;

    public c0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f270353d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f270353d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMessageExtension", "autoDownloadFile2 %s %s", java.lang.Long.valueOf(f9Var.I0()), java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 != null) {
            java.lang.String str = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.f(lp0.b.t(), v17.n(), v17.f430223o) + "_lan_tmp";
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = str != null ? str : "";
                objArr[1] = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.j(str));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMessageExtension", "startToDownloadFile tmpFile:%s, %s", objArr);
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).J0(f9Var.m124847x74d37ac6(), f9Var.Q0());
                if (J0 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMessageExtension", "startToDownloadFile info is null");
                } else if (com.p314xaae8f345.mm.vfs.w6.k(str) == J0.f68113xeb1a61d6) {
                    boolean J2 = bt3.l0.J(f9Var, str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMessageExtension", "startToDownloadFile use lan, status:%s", java.lang.Long.valueOf(J0.f68112x10a0fed7));
                    if (J2) {
                        return;
                    }
                } else {
                    java.lang.Object[] objArr2 = new java.lang.Object[2];
                    objArr2[0] = str != null ? str : "";
                    objArr2[1] = java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(str));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMessageExtension", "startToDownloadFile tmpFile:%s, length:%s", objArr2);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMessageExtension", "startToDownloadFile content is null");
        }
        android.util.Pair n17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a0.n(f9Var, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMessageExtension", "autoDownloadFile3 %s %s, tryInitAttach:%s meidaId:%s", java.lang.Long.valueOf(f9Var.I0()), java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), n17.first, n17.second);
        if (((java.lang.Boolean) n17.first).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMessageExtension", "startToDownloadFile");
            c01.d9.e().g(new bt3.l0(f9Var.m124847x74d37ac6(), f9Var.Q0(), (java.lang.String) n17.second, null));
            com.p314xaae8f345.mm.p957x53236a1b.g1.M(f9Var);
        }
        d35.h.f307877a.c(f9Var);
    }
}
