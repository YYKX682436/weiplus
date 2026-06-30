package com.tencent.liteapp.ui;

/* loaded from: classes10.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f46134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppTransparentUI f46136f;

    public b0(com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI, long j17, int i17) {
        this.f46136f = wxaLiteAppTransparentUI;
        this.f46134d = j17;
        this.f46135e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Vibrator vibrator = (android.os.Vibrator) this.f46136f.getSystemService("vibrator");
        if (vibrator == null) {
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        long j17 = this.f46134d;
        if (i17 < 26 || !vibrator.hasAmplitudeControl()) {
            vibrator.vibrate(j17);
        } else {
            vibrator.vibrate(android.os.VibrationEffect.createOneShot(j17, this.f46135e));
        }
    }
}
