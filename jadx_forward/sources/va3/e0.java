package va3;

/* loaded from: classes15.dex */
public class e0 implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public float f515807d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public long f515808e = 200;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ va3.f0 f515809f;

    public e0(va3.f0 f0Var) {
        this.f515809f = f0Var;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 3) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f515808e;
            float f17 = sensorEvent.values[0];
            if (f17 <= 0.0f) {
                f17 += (((((int) f17) * (-1)) / com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) + 1) * com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
            }
            float f18 = f17 % 360.0f;
            if (currentTimeMillis <= 200 || java.lang.Math.abs(f18 - this.f515807d) <= 3.0f) {
                return;
            }
            va3.f0 f0Var = this.f515809f;
            f0Var.f515818h = f18;
            java.util.HashSet hashSet = f0Var.f515813c;
            if (hashSet != null) {
                hashSet.size();
            }
            if (hashSet != null) {
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                    if (weakReference != null && weakReference.get() != null) {
                        ((va3.d0) weakReference.get()).a(f0Var.f515819i ? f0Var.f515814d : f0Var.f515818h);
                    }
                }
            }
            this.f515807d = f18;
            this.f515808e = java.lang.System.currentTimeMillis();
        }
    }
}
