package tb1;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 f498437d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610) {
        this.f498437d = c12042x78b65610;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610 = this.f498437d;
        int i18 = c12042x78b65610.F.m66779xe2adb975().x;
        int i19 = c12042x78b65610.F.m66779xe2adb975().y;
        tb1.x xVar = c12042x78b65610.P;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 c16529x1336da53 = c12042x78b65610.F;
        if (c16529x1336da53 == null) {
            xVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FrameDataCallbackHelper", "listenFrameChange recordView null");
            i17 = -1;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.h0 h0Var = xVar.f498482b;
            if (h0Var == null) {
                i17 = -2;
            } else {
                int i27 = xVar.f498484d;
                if (i27 != Integer.MIN_VALUE) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FrameDataCallbackHelper", "listenFrameChange destroy last one bufferId:%d", java.lang.Integer.valueOf(i27));
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) h0Var).a0(xVar.f498484d);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) h0Var;
                int T = nVar.T(i18 * i19 * 4);
                xVar.f498484d = T;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FrameDataCallbackHelper", "listenFrameChange bufferId:%d height:%d width:%d", java.lang.Integer.valueOf(T), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
                xVar.f498483c = true;
                c16529x1336da53.c(nVar.m0(xVar.f498484d), xVar);
                i17 = xVar.f498484d;
            }
        }
        if (i17 >= 0) {
            ((tb1.r0) c12042x78b65610.C).a(null, i17, i18, i19);
            return;
        }
        ((tb1.r0) c12042x78b65610.C).a(java.lang.String.format(java.util.Locale.US, "illegal state:%d", java.lang.Integer.valueOf(i17)), -1, -1, -1);
    }
}
