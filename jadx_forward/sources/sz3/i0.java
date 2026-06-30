package sz3;

/* loaded from: classes15.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final sz3.i0 f495561d = new sz3.i0();

    @Override // java.lang.Runnable
    public final void run() {
        android.hardware.SensorManager sensorManager;
        android.hardware.SensorManager sensorManager2;
        if (sz3.k0.f495576e == null) {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
            sz3.k0.f495576e = (android.hardware.SensorManager) systemService;
        }
        if (sz3.k0.f495577f == null) {
            android.hardware.SensorManager sensorManager3 = sz3.k0.f495576e;
            sz3.k0.f495577f = sensorManager3 != null ? sensorManager3.getDefaultSensor(10) : null;
        }
        sz3.k0 k0Var = sz3.k0.f495572a;
        if (((java.lang.Boolean) ((jz5.n) sz3.k0.f495573b).mo141623x754a37bb()).booleanValue() && sz3.k0.f495578g == null) {
            android.hardware.SensorManager sensorManager4 = sz3.k0.f495576e;
            sz3.k0.f495578g = sensorManager4 != null ? sensorManager4.getDefaultSensor(4) : null;
        }
        if (sz3.k0.f495579h) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsSensorDetectManager", "startSensorShakeDetect");
        android.hardware.Sensor sensor = sz3.k0.f495577f;
        if (sensor != null && (sensorManager2 = sz3.k0.f495576e) != null) {
            sensorManager2.registerListener(sz3.k0.f495580i, sensor, 3);
        }
        android.hardware.Sensor sensor2 = sz3.k0.f495578g;
        if (sensor2 != null && (sensorManager = sz3.k0.f495576e) != null) {
            sensorManager.registerListener(sz3.k0.f495580i, sensor2, 3);
        }
        sz3.k0.f495579h = true;
    }
}
