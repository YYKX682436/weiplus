package com.tencent.liteapp.ui;

/* loaded from: classes10.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f46227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppUI f46229f;

    public u0(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI, long j17, int i17) {
        this.f46229f = wxaLiteAppUI;
        this.f46227d = j17;
        this.f46228e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Vibrator vibrator = (android.os.Vibrator) this.f46229f.getSystemService("vibrator");
        if (vibrator == null) {
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        long j17 = this.f46227d;
        if (i17 < 26 || !vibrator.hasAmplitudeControl()) {
            vibrator.vibrate(j17);
        } else {
            vibrator.vibrate(android.os.VibrationEffect.createOneShot(j17, this.f46228e));
        }
    }
}
