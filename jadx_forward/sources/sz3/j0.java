package sz3;

/* loaded from: classes15.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final sz3.j0 f495569d = new sz3.j0();

    @Override // java.lang.Runnable
    public final void run() {
        if (sz3.k0.f495579h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsSensorDetectManager", "stopSensorShakeDetect");
            android.hardware.SensorManager sensorManager = sz3.k0.f495576e;
            if (sensorManager != null) {
                sensorManager.unregisterListener(sz3.k0.f495580i);
            }
        }
        sz3.k0.f495579h = false;
    }
}
