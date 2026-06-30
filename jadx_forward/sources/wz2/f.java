package wz2;

/* loaded from: classes14.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public android.hardware.SensorManager f532304a;

    /* renamed from: b, reason: collision with root package name */
    public wz2.d f532305b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f532306c = false;

    public f(wz2.c cVar) {
    }

    public void a(android.content.Context context) {
        if (this.f532306c) {
            return;
        }
        this.f532306c = true;
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor");
        this.f532304a = sensorManager;
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(5);
        if (defaultSensor != null) {
            wz2.d dVar = new wz2.d(this, null);
            this.f532305b = dVar;
            this.f532304a.registerListener(dVar, defaultSensor, 3);
        }
    }
}
