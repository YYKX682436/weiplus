package pa3;

/* loaded from: classes5.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final pa3.v f434544d = new pa3.v();

    @Override // java.lang.Runnable
    public final void run() {
        if (java.lang.System.currentTimeMillis() - pa3.w.f434547c >= 60000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnapShotUtilKt", "stop thread SnapShotUtil");
            android.os.HandlerThread handlerThread = pa3.w.f434546b;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            pa3.w.f434546b = null;
        }
    }
}
