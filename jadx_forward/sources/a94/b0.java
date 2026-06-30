package a94;

/* loaded from: classes4.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.SensorManager f83979a = (android.hardware.SensorManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor");

    /* renamed from: b, reason: collision with root package name */
    public a94.a0 f83980b;

    public b0(android.content.Context context) {
    }

    public final boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasASensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        boolean z17 = false;
        android.hardware.SensorManager sensorManager = this.f83979a;
        if (sensorManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAdShakeSensor", "cannot init sensor manager");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasASensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
            return false;
        }
        java.util.List<android.hardware.Sensor> sensorList = sensorManager.getSensorList(1);
        if (sensorList != null && sensorList.size() > 0) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasASensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        return z17;
    }

    public boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasListen", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        boolean z17 = this.f83980b != null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasListen", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        return z17;
    }

    public boolean c() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isShakeSupported", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        if (a()) {
            z17 = true;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasGSensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasGSensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasGYSensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasGYSensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShakeSupported", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        return z17;
    }

    public void d(a94.a0 a0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startListen", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        e();
        if (a()) {
            this.f83980b = a0Var;
            android.hardware.SensorManager sensorManager = this.f83979a;
            sensorManager.registerListener(a0Var, sensorManager.getDefaultSensor(1), 1);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAdShakeSensor", "no sensor found for shake detection");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startListen", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
    }

    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopListen", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        a94.a0 a0Var = this.f83980b;
        if (a0Var != null) {
            a0Var.a();
            a94.a0 a0Var2 = this.f83980b;
            android.hardware.SensorManager sensorManager = this.f83979a;
            sensorManager.unregisterListener(a0Var2, sensorManager.getDefaultSensor(1));
            this.f83980b = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopListen", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
    }
}
