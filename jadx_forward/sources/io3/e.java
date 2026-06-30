package io3;

/* loaded from: classes13.dex */
public class e implements android.hardware.SensorEventListener {

    /* renamed from: e, reason: collision with root package name */
    public final io3.d f375038e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f375037d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f375039f = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public android.os.HandlerThread f375041h = null;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Handler f375042i = null;

    /* renamed from: g, reason: collision with root package name */
    public final android.hardware.SensorManager f375040g = (android.hardware.SensorManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext().getSystemService("sensor");

    public e(io3.d dVar) {
        this.f375038e = null;
        this.f375038e = dVar;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        java.util.ArrayList arrayList;
        try {
            int a17 = jo3.a.a(sensorEvent.sensor.getType());
            io3.f fVar = (io3.f) ((java.util.HashMap) this.f375039f).get(java.lang.Integer.valueOf(a17));
            if (fVar == null) {
                return;
            }
            fVar.a(sensorEvent);
            java.util.List list = fVar.f375046d;
            if (((java.util.ArrayList) list).size() < 20) {
                arrayList = null;
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(list);
                ((java.util.ArrayList) list).clear();
                arrayList = arrayList2;
            }
            if (arrayList == null) {
                return;
            }
            ((io3.c) this.f375038e).c(2, a17, arrayList, 0L);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NormsgSensorListener", "onSensorChanged() error:" + th6.toString());
        }
    }
}
