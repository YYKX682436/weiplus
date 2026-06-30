package a94;

/* loaded from: classes4.dex */
public abstract class a0 implements android.hardware.SensorEventListener {

    /* renamed from: h, reason: collision with root package name */
    public static int f83973h = 5;

    /* renamed from: d, reason: collision with root package name */
    public final int f83974d;

    /* renamed from: e, reason: collision with root package name */
    public final int f83975e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f83976f = {2.0f, 2.5f, 0.5f};

    /* renamed from: g, reason: collision with root package name */
    public final float[] f83977g = new float[3];

    static {
        if (wo.w0.m().equals("LG-E510")) {
            f83973h = 4;
        }
    }

    public a0(int i17, int i18) {
        this.f83974d = 5;
        this.f83975e = 9;
        this.f83974d = i17;
        this.f83975e = i18;
        f83973h = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeSensorListener", "ShakeSensorListener, min=" + i17 + ", max=" + i18 + ", sThreshold=" + f83973h);
    }

    public abstract void a();

    public abstract void b(boolean z17);

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeSensorListener", "reset threadHold");
        f83973h = this.f83974d;
        if (wo.w0.m().equals("LG-E510")) {
            f83973h = 4;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSensorChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
        float[] fArr = new float[3];
        float[] fArr2 = sensorEvent.values;
        boolean z17 = false;
        for (int i17 = 0; i17 < 3; i17++) {
            float f17 = this.f83976f[i17];
            float f18 = fArr2[i17];
            float[] fArr3 = this.f83977g;
            float round = java.lang.Math.round(f17 * (f18 - fArr3[i17]) * 0.45f);
            fArr[i17] = round;
            float abs = java.lang.Math.abs(round);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("selfAdaptation", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
            int i18 = f83973h;
            int i19 = this.f83975e;
            if (i18 >= i19) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selfAdaptation", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
            } else if (abs >= 14.0f) {
                f83973h = i19;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selfAdaptation", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
            } else {
                int i27 = ((int) abs) - 4;
                if (i18 < i27) {
                    f83973h = i27;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selfAdaptation", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
            }
            if (abs > f83973h) {
                z17 = true;
            }
            fArr3[i17] = fArr2[i17];
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeSensorListener", "onSensorChanged, sensor=" + sensorEvent.sensor.getName() + " diff=(" + fArr[0] + " " + fArr[1] + " " + fArr[2] + ")");
            b(true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSensorChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
    }
}
