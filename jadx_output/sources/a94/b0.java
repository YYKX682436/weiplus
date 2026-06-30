package a94;

/* loaded from: classes4.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.SensorManager f2446a = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");

    /* renamed from: b, reason: collision with root package name */
    public a94.a0 f2447b;

    public b0(android.content.Context context) {
    }

    public final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasASensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        boolean z17 = false;
        android.hardware.SensorManager sensorManager = this.f2446a;
        if (sensorManager == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdShakeSensor", "cannot init sensor manager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasASensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
            return false;
        }
        java.util.List<android.hardware.Sensor> sensorList = sensorManager.getSensorList(1);
        if (sensorList != null && sensorList.size() > 0) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasASensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        return z17;
    }

    public boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasListen", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        boolean z17 = this.f2447b != null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasListen", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        return z17;
    }

    public boolean c() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShakeSupported", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        if (a()) {
            z17 = true;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasGSensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasGSensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasGYSensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasGYSensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShakeSupported", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        return z17;
    }

    public void d(a94.a0 a0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startListen", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        e();
        if (a()) {
            this.f2447b = a0Var;
            android.hardware.SensorManager sensorManager = this.f2446a;
            sensorManager.registerListener(a0Var, sensorManager.getDefaultSensor(1), 1);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdShakeSensor", "no sensor found for shake detection");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startListen", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
    }

    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopListen", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        a94.a0 a0Var = this.f2447b;
        if (a0Var != null) {
            a0Var.a();
            a94.a0 a0Var2 = this.f2447b;
            android.hardware.SensorManager sensorManager = this.f2446a;
            sensorManager.unregisterListener(a0Var2, sensorManager.getDefaultSensor(1));
            this.f2447b = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopListen", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
    }
}
