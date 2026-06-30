package vc1;

/* loaded from: classes13.dex */
public class g3 implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public float f516502d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public long f516503e = 200;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        vc1.c3 c3Var;
        if (sensorEvent.sensor.getType() == 3) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f516503e;
            float f17 = sensorEvent.values[0];
            if (f17 <= 0.0f) {
                f17 += (((((int) f17) * (-1)) / com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) + 1) * com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
            }
            float f18 = f17 % 360.0f;
            if (currentTimeMillis <= 200 || java.lang.Math.abs(f18 - this.f516502d) <= 3.0f) {
                return;
            }
            java.util.Map map = vc1.h3.f516508a;
            synchronized (map) {
                java.util.Iterator it = ((java.util.HashMap) map).values().iterator();
                while (it.hasNext()) {
                    for (vc1.a3 a3Var : ((java.util.HashMap) it.next()).values()) {
                        if (a3Var != null) {
                            float f19 = this.f516502d;
                            vc1.p1 p1Var = (vc1.p1) a3Var;
                            if (p1Var.f516596b0 && !p1Var.f516603f && (c3Var = p1Var.f516598c0) != null) {
                                c3Var.a(f19, f18);
                            }
                        }
                    }
                }
            }
            this.f516502d = f18;
            this.f516503e = java.lang.System.currentTimeMillis();
        }
    }
}
