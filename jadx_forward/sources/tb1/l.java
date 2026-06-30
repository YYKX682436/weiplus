package tb1;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f498441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 f498442e;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f4Var) {
        this.f498442e = c12042x78b65610;
        this.f498441d = f4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f4Var = this.f498441d;
        java.lang.String obj = f4Var.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610 = this.f498442e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "currentOrientationRecord %s, lateOrientationState: %s", obj, c12042x78b65610.U.toString());
        long j17 = c12042x78b65610.S;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (android.os.SystemClock.elapsedRealtime() - j17 >= 750 && c12042x78b65610.V.get() && f4Var == c12042x78b65610.U) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "reopen camera");
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 c16529x1336da53 = c12042x78b65610.F;
            c12042x78b65610.i();
            c12042x78b65610.h();
            tb1.x xVar = c12042x78b65610.P;
            if (xVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 c16529x1336da532 = c12042x78b65610.F;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FrameDataCallbackHelper", "rebindRecordView, bufferId: %d", java.lang.Integer.valueOf(xVar.f498484d));
                if (!xVar.f498483c) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FrameDataCallbackHelper", "needn't callback");
                } else if (xVar.f498484d == Integer.MIN_VALUE) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FrameDataCallbackHelper", "buffer id illegal");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.h0 h0Var = xVar.f498482b;
                    if (h0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FrameDataCallbackHelper", "rebindRecordView mSharedBufferAddon null");
                    } else {
                        if (c16529x1336da53 != null) {
                            c16529x1336da53.c(null, null);
                        }
                        if (c16529x1336da532 != null) {
                            java.nio.ByteBuffer m07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) h0Var).m0(xVar.f498484d);
                            if (m07 != null) {
                                c16529x1336da532.c(m07, xVar);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FrameDataCallbackHelper", "buffer is null");
                            }
                        }
                    }
                }
            }
        }
        c12042x78b65610.T = false;
    }
}
