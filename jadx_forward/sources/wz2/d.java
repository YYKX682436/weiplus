package wz2;

/* loaded from: classes14.dex */
public class d implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public float f532302d;

    public d(wz2.f fVar, wz2.c cVar) {
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 5) {
            this.f532302d = sensorEvent.values[0];
        }
    }
}
