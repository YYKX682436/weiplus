package q35;

/* loaded from: classes8.dex */
public abstract class c implements android.hardware.SensorEventListener {

    /* renamed from: f, reason: collision with root package name */
    public static int f441504f = 5;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f441505d = {2.0f, 2.5f, 0.5f};

    /* renamed from: e, reason: collision with root package name */
    public final float[] f441506e = new float[3];

    static {
        if (wo.w0.m().equals("LG-E510")) {
            f441504f = 4;
        }
    }

    public abstract void a();

    public abstract void b(boolean z17);

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        float[] fArr = new float[3];
        float[] fArr2 = sensorEvent.values;
        boolean z17 = false;
        for (int i17 = 0; i17 < 3; i17++) {
            float f17 = this.f441505d[i17];
            float f18 = fArr2[i17];
            float[] fArr3 = this.f441506e;
            float round = java.lang.Math.round(f17 * (f18 - fArr3[i17]) * 0.45f);
            fArr[i17] = round;
            float abs = java.lang.Math.abs(round);
            int i18 = f441504f;
            if (i18 < 9) {
                if (abs >= 14.0f) {
                    f441504f = 9;
                } else {
                    int i19 = ((int) abs) - 4;
                    if (i18 < i19) {
                        f441504f = i19;
                    }
                }
            }
            if (abs > f441504f) {
                z17 = true;
            }
            fArr3[i17] = fArr2[i17];
        }
        if (z17) {
            sensorEvent.sensor.getName();
            float f19 = fArr2[0];
            float f27 = fArr2[1];
            float f28 = fArr2[2];
            b(true);
        }
    }
}
