package com.tencent.liteapp.ui;

/* loaded from: classes9.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f46223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppUI f46224e;

    public t0(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI, long j17) {
        this.f46224e = wxaLiteAppUI;
        this.f46223d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Vibrator vibrator = (android.os.Vibrator) this.f46224e.getSystemService("vibrator");
        if (vibrator == null) {
            return;
        }
        vibrator.vibrate(this.f46223d);
    }
}
