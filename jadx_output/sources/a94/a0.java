package a94;

/* loaded from: classes4.dex */
public abstract class a0 implements android.hardware.SensorEventListener {

    /* renamed from: h, reason: collision with root package name */
    public static int f2440h = 5;

    /* renamed from: d, reason: collision with root package name */
    public final int f2441d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2442e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f2443f = {2.0f, 2.5f, 0.5f};

    /* renamed from: g, reason: collision with root package name */
    public final float[] f2444g = new float[3];

    static {
        if (wo.w0.m().equals("LG-E510")) {
            f2440h = 4;
        }
    }

    public a0(int i17, int i18) {
        this.f2441d = 5;
        this.f2442e = 9;
        this.f2441d = i17;
        this.f2442e = i18;
        f2440h = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeSensorListener", "ShakeSensorListener, min=" + i17 + ", max=" + i18 + ", sThreshold=" + f2440h);
    }

    public abstract void a();

    public abstract void b(boolean z17);

    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeSensorListener", "reset threadHold");
        f2440h = this.f2441d;
        if (wo.w0.m().equals("LG-E510")) {
            f2440h = 4;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
        float[] fArr = new float[3];
        float[] fArr2 = sensorEvent.values;
        boolean z17 = false;
        for (int i17 = 0; i17 < 3; i17++) {
            float f17 = this.f2443f[i17];
            float f18 = fArr2[i17];
            float[] fArr3 = this.f2444g;
            float round = java.lang.Math.round(f17 * (f18 - fArr3[i17]) * 0.45f);
            fArr[i17] = round;
            float abs = java.lang.Math.abs(round);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selfAdaptation", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
            int i18 = f2440h;
            int i19 = this.f2442e;
            if (i18 >= i19) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selfAdaptation", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
            } else if (abs >= 14.0f) {
                f2440h = i19;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selfAdaptation", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
            } else {
                int i27 = ((int) abs) - 4;
                if (i18 < i27) {
                    f2440h = i27;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selfAdaptation", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
            }
            if (abs > f2440h) {
                z17 = true;
            }
            fArr3[i17] = fArr2[i17];
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeSensorListener", "onSensorChanged, sensor=" + sensorEvent.sensor.getName() + " diff=(" + fArr[0] + " " + fArr[1] + " " + fArr[2] + ")");
            b(true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
    }
}
