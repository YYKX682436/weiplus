package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes14.dex */
public class z extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 f127776a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133, android.os.Handler handler) {
        super(handler);
        this.f127776a = activityC3721x69b5f133;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        super.onChange(z17);
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133 = this.f127776a;
        if (activityC3721x69b5f133.f127619p == 1) {
            if (android.provider.Settings.System.getInt(activityC3721x69b5f133.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                activityC3721x69b5f133.setRequestedOrientation(10);
            } else {
                activityC3721x69b5f133.setRequestedOrientation(1);
            }
        }
    }
}
