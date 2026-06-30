package ca3;

/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ca3.f f39793a = new ca3.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f39794b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final ca3.e f39795c = new ca3.e();

    /* renamed from: d, reason: collision with root package name */
    public static android.hardware.SensorManager f39796d;

    public final void a(ca3.d listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.ArrayList arrayList = f39794b;
        arrayList.add(listener);
        if (arrayList.size() == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppMapSensorHelper", "startListener");
            if (f39796d == null) {
                java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
                android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) systemService;
                f39796d = sensorManager;
                android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(3);
                android.hardware.SensorManager sensorManager2 = f39796d;
                kotlin.jvm.internal.o.d(sensorManager2);
                sensorManager2.registerListener(f39795c, defaultSensor, 1);
            }
        }
    }

    public final void b(ca3.d listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.ArrayList arrayList = f39794b;
        arrayList.remove(listener);
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppMapSensorHelper", "endListener");
            android.hardware.SensorManager sensorManager = f39796d;
            if (sensorManager != null) {
                sensorManager.unregisterListener(f39795c);
                f39796d = null;
            }
        }
    }
}
