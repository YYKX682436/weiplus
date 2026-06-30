package qn0;

/* loaded from: classes14.dex */
public class b implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn0.c f446421d;

    public b(qn0.c cVar) {
        this.f446421d = cVar;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 4) {
            return;
        }
        qn0.c cVar = this.f446421d;
        cVar.getClass();
        float[] fArr = sensorEvent.values;
        float f17 = (float) (cVar.f446441s + ((((fArr[0] * 1.0f) / 30.0f) / 3.141592653589793d) * 180.0d));
        cVar.f446441s = f17;
        cVar.f446442t = (float) (cVar.f446442t + ((((fArr[1] * 1.0f) / 30.0f) / 3.141592653589793d) * 180.0d));
        cVar.f446441s = java.lang.Math.max(f17, -90.0f);
        cVar.f446441s = java.lang.Math.min(cVar.f446441s, 90.0f);
    }
}
