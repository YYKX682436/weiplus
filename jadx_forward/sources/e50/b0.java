package e50;

/* loaded from: classes11.dex */
public final class b0 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {
    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterEngineService", "onEnterActivityForeground: ");
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.m137637x90960956(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AppForegroundState.FOREGROUND);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        boolean m41037x57bab7e6 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9.f19946x4fbc8495.m41037x57bab7e6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterEngineService", "onExitActivityForeground: hasOverlay=" + m41037x57bab7e6);
        if (m41037x57bab7e6) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.m137637x90960956(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AppForegroundState.FLOAT_WINDOW_FOREGROUND);
        } else {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.m137637x90960956(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AppForegroundState.BACKGROUND);
        }
    }
}
