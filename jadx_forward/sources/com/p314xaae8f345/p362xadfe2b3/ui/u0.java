package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes10.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f127760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f127761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 f127762f;

    public u0(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7, long j17, int i17) {
        this.f127762f = activityC3722x408816c7;
        this.f127760d = j17;
        this.f127761e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Vibrator vibrator = (android.os.Vibrator) this.f127762f.getSystemService("vibrator");
        if (vibrator == null) {
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        long j17 = this.f127760d;
        if (i17 < 26 || !vibrator.hasAmplitudeControl()) {
            vibrator.vibrate(j17);
        } else {
            vibrator.vibrate(android.os.VibrationEffect.createOneShot(j17, this.f127761e));
        }
    }
}
