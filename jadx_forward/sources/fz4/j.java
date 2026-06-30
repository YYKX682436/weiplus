package fz4;

/* loaded from: classes5.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final fz4.j f348846d = new fz4.j();

    @Override // java.lang.Runnable
    public final void run() {
        if (java.lang.System.currentTimeMillis() - fz4.k.f348849c >= 60000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnapShotUtilKt", "stop thread SnapShotUtil");
            android.os.HandlerThread handlerThread = fz4.k.f348848b;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            fz4.k.f348848b = null;
        }
    }
}
