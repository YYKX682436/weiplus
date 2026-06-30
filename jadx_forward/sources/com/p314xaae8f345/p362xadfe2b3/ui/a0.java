package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes9.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f127659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 f127660e;

    public a0(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133, long j17) {
        this.f127660e = activityC3721x69b5f133;
        this.f127659d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Vibrator vibrator = (android.os.Vibrator) this.f127660e.getSystemService("vibrator");
        if (vibrator == null) {
            return;
        }
        vibrator.vibrate(this.f127659d);
    }
}
