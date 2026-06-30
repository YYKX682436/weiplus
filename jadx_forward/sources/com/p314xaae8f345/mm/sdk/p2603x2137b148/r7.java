package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class r7 implements android.hardware.SensorListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Runnable f274494a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f274495b = {0.0f, 0.0f, 0.0f};

    public r7(java.lang.Runnable runnable) {
        this.f274494a = runnable;
    }

    @Override // android.hardware.SensorListener
    public void onAccuracyChanged(int i17, int i18) {
    }

    @Override // android.hardware.SensorListener
    public void onSensorChanged(int i17, float[] fArr) {
        float[] fArr2 = new float[3];
        boolean z17 = false;
        for (int i18 = 0; i18 < 3; i18++) {
            float f17 = fArr[i18];
            float[] fArr3 = this.f274495b;
            float abs = java.lang.Math.abs(f17 - fArr3[i18]);
            fArr2[i18] = abs;
            if (fArr3[i18] != 0.0f && abs > 1.0f) {
                z17 = true;
            }
            fArr3[i18] = fArr[i18];
        }
        if (z17) {
            this.f274494a.run();
        }
    }
}
