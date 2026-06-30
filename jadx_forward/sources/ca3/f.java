package ca3;

/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ca3.f f121326a = new ca3.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f121327b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final ca3.e f121328c = new ca3.e();

    /* renamed from: d, reason: collision with root package name */
    public static android.hardware.SensorManager f121329d;

    public final void a(ca3.d listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.ArrayList arrayList = f121327b;
        arrayList.add(listener);
        if (arrayList.size() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppMapSensorHelper", "startListener");
            if (f121329d == null) {
                java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
                android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) systemService;
                f121329d = sensorManager;
                android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(3);
                android.hardware.SensorManager sensorManager2 = f121329d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sensorManager2);
                sensorManager2.registerListener(f121328c, defaultSensor, 1);
            }
        }
    }

    public final void b(ca3.d listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.ArrayList arrayList = f121327b;
        arrayList.remove(listener);
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppMapSensorHelper", "endListener");
            android.hardware.SensorManager sensorManager = f121329d;
            if (sensorManager != null) {
                sensorManager.unregisterListener(f121328c);
                f121329d = null;
            }
        }
    }
}
