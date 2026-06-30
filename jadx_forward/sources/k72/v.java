package k72;

/* loaded from: classes14.dex */
public final class v implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public android.hardware.SensorManager f386302d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.ju3 f386303e = new r45.ju3();

    /* renamed from: f, reason: collision with root package name */
    public long f386304f;

    public final void a() {
        r45.ju3 ju3Var = this.f386303e;
        if (ju3Var != null) {
            ju3Var.f459642d = false;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.Object systemService = context != null ? context.getSystemService("sensor") : null;
        android.hardware.SensorManager sensorManager = systemService instanceof android.hardware.SensorManager ? (android.hardware.SensorManager) systemService : null;
        if (sensorManager == null) {
            sensorManager = null;
        }
        this.f386302d = sensorManager;
        if (sensorManager != null) {
            android.hardware.Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(4) : null;
            if (defaultSensor != null) {
                android.hardware.SensorManager sensorManager2 = this.f386302d;
                if (sensorManager2 != null) {
                    sensorManager2.registerListener(this, defaultSensor, 3);
                }
                if (ju3Var != null) {
                    ju3Var.f459642d = true;
                }
            }
        }
        this.f386304f = 0L;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        if (sensorEvent != null) {
            r45.ku3 ku3Var = new r45.ku3();
            float[] fArr = sensorEvent.values;
            ku3Var.f460487d = fArr[0];
            ku3Var.f460488e = fArr[1];
            ku3Var.f460489f = fArr[2];
            long j17 = sensorEvent.timestamp;
            ku3Var.f460490g = j17;
            long j18 = this.f386304f;
            if (j17 - j18 > 2000000000) {
                r45.ju3 ju3Var = this.f386303e;
                if (0 == j18 && ju3Var != null && (linkedList2 = ju3Var.f459643e) != null) {
                    linkedList2.clear();
                }
                this.f386304f = sensorEvent.timestamp;
                if (ju3Var == null || (linkedList = ju3Var.f459643e) == null) {
                    return;
                }
                linkedList.add(ku3Var);
            }
        }
    }
}
