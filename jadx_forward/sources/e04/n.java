package e04;

/* loaded from: classes7.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final e04.n f327560d = new e04.n();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineScanManager", "OfflineScan onNetworkChange netWorkStatus: %d, current: %d", java.lang.Integer.valueOf(gm0.j1.d().n()), java.lang.Integer.valueOf(e04.o.f327568b));
        if (gm0.j1.d().n() != 6 && gm0.j1.d().n() != 4) {
            e04.o.f327568b = gm0.j1.d().n();
            return;
        }
        if (e04.o.f327568b == gm0.j1.d().n()) {
            return;
        }
        e04.o.f327568b = gm0.j1.d().n();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineScanManager", "notifyMessage");
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineScanManager", "notifyMessage account not ready and ignore");
            return;
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_OFFLINE_SCAN_LOCAL_STORAGE_STRING_SYNC, null);
        if (m17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineScanManager", "notifyOfflineScanMessage no message, ignore");
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new e04.m(m17));
    }
}
