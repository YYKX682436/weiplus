package com.tencent.liteapp.ui;

/* loaded from: classes9.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f46126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppTransparentUI f46127e;

    public a0(com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI, long j17) {
        this.f46127e = wxaLiteAppTransparentUI;
        this.f46126d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Vibrator vibrator = (android.os.Vibrator) this.f46127e.getSystemService("vibrator");
        if (vibrator == null) {
            return;
        }
        vibrator.vibrate(this.f46126d);
    }
}
