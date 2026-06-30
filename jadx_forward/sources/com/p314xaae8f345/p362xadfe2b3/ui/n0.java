package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes14.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f127738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 f127739e;

    public n0(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133, int i17) {
        this.f127739e = activityC3721x69b5f133;
        this.f127738d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133 = this.f127739e;
        if (i17 == 26) {
            int i18 = com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133.f127616z1;
            activityC3721x69b5f133.getClass();
            kd.c.e("WxaLiteApp.WxaLiteAppTransparentUI", "avoid setRequestedOrientation when Oreo", new java.lang.Object[0]);
            return;
        }
        int i19 = this.f127738d;
        activityC3721x69b5f133.f127619p = i19;
        if (i19 == 0) {
            activityC3721x69b5f133.setRequestedOrientation(1);
            return;
        }
        if (i19 == 1) {
            if (android.provider.Settings.System.getInt(activityC3721x69b5f133.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                activityC3721x69b5f133.setRequestedOrientation(10);
                return;
            } else {
                activityC3721x69b5f133.setRequestedOrientation(1);
                return;
            }
        }
        if (i19 == 2) {
            activityC3721x69b5f133.setRequestedOrientation(1);
        } else if (i19 == 3) {
            activityC3721x69b5f133.setRequestedOrientation(6);
        }
    }
}
