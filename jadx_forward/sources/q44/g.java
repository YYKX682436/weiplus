package q44;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final q44.b f441652a;

    public g() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(4);
        if (defaultSensor != null) {
            this.f441652a = new q44.f(context, defaultSensor);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1572, 10);
            return;
        }
        android.hardware.Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        if (defaultSensor2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1572, 12);
        } else {
            this.f441652a = new q44.d(context, defaultSensor2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1572, 11);
        }
    }
}
