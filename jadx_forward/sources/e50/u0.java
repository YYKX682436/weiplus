package e50;

/* loaded from: classes11.dex */
public final class u0 implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k {
    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void off() {
        boolean mo40975xf7b3660d = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120.f19966x4fbc8495.mo40975xf7b3660d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterEngineService", "onExitOverlayForeground: hasUI=" + mo40975xf7b3660d);
        if (mo40975xf7b3660d) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.m137637x90960956(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AppForegroundState.FOREGROUND);
        } else {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.m137637x90960956(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AppForegroundState.BACKGROUND);
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void on() {
        boolean mo40975xf7b3660d = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120.f19966x4fbc8495.mo40975xf7b3660d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterEngineService", "onExitOverlayForeground: hasUI=" + mo40975xf7b3660d);
        if (mo40975xf7b3660d) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.m137637x90960956(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AppForegroundState.FOREGROUND);
        } else {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.m137637x90960956(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AppForegroundState.FLOAT_WINDOW_FOREGROUND);
        }
    }
}
