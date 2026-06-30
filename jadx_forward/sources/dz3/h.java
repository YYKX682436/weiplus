package dz3;

/* loaded from: classes15.dex */
public class h implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz3.i f326663d;

    public h(dz3.i iVar) {
        this.f326663d = iVar;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        float[] fArr;
        android.hardware.Sensor sensor;
        if (sensorEvent == null || (fArr = sensorEvent.values) == null || fArr.length < 3 || (sensor = sensorEvent.sensor) == null) {
            return;
        }
        sensor.getType();
        int type = sensorEvent.sensor.getType();
        dz3.i iVar = this.f326663d;
        if (type == 10) {
            float[] fArr2 = sensorEvent.values;
            iVar.f326677l = fArr2[0];
            iVar.f326678m = fArr2[1];
            iVar.f326679n = fArr2[2];
            iVar.f326684s = java.lang.System.currentTimeMillis();
            return;
        }
        if (sensorEvent.sensor.getType() == 4) {
            float[] fArr3 = sensorEvent.values;
            float f17 = fArr3[0];
            float f18 = fArr3[1];
            float f19 = fArr3[2];
            iVar.f326686u = java.lang.System.currentTimeMillis();
            iVar.f326687v = java.lang.Math.sqrt((double) (((f17 * f17) + (f18 * f18)) + (f19 * f19))) > ((double) dz3.i.B);
            boolean z17 = iVar.f326687v;
        }
    }
}
