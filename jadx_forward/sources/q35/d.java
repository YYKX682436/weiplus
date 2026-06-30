package q35;

/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.SensorManager f441507a = (android.hardware.SensorManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor");

    /* renamed from: b, reason: collision with root package name */
    public q35.c f441508b;

    public d(android.content.Context context) {
    }

    public void a(q35.c cVar) {
        b();
        android.hardware.SensorManager sensorManager = this.f441507a;
        boolean z17 = false;
        if (sensorManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShakeSensorService", "cannot init sensor manager");
        } else {
            java.util.List<android.hardware.Sensor> sensorList = sensorManager.getSensorList(1);
            if (sensorList != null && sensorList.size() > 0) {
                z17 = true;
            }
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShakeSensorService", "no sensor found for shake detection");
        } else {
            this.f441508b = cVar;
            sensorManager.registerListener(cVar, sensorManager.getDefaultSensor(1), 1);
        }
    }

    public void b() {
        q35.c cVar = this.f441508b;
        if (cVar != null) {
            cVar.a();
            q35.c cVar2 = this.f441508b;
            android.hardware.SensorManager sensorManager = this.f441507a;
            sensorManager.unregisterListener(cVar2, sensorManager.getDefaultSensor(1));
            this.f441508b = null;
        }
    }
}
