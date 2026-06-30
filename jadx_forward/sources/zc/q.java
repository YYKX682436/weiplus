package zc;

/* loaded from: classes14.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 f552897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f552898e;

    public q(com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238, int i17) {
        this.f552897d = c3646xcf902238;
        this.f552898e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238 = this.f552897d;
        if (i17 == 26) {
            c3646xcf902238.getClass();
            kd.c.e("LiteApp.WxaLiteAppWidgetAdapter", "avoid setRequestedOrientation when Oreo", new java.lang.Object[0]);
            return;
        }
        int i18 = this.f552898e;
        c3646xcf902238.f127513v = i18;
        android.app.Activity activity = c3646xcf902238.f127508q;
        if (i18 == 0) {
            activity.setRequestedOrientation(1);
            return;
        }
        if (i18 == 1) {
            if (android.provider.Settings.System.getInt(activity.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                activity.setRequestedOrientation(10);
                return;
            } else {
                activity.setRequestedOrientation(1);
                return;
            }
        }
        if (i18 == 2) {
            activity.setRequestedOrientation(1);
        } else {
            if (i18 != 3) {
                return;
            }
            activity.setRequestedOrientation(6);
        }
    }
}
