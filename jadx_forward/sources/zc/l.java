package zc;

/* loaded from: classes14.dex */
public final class l extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 f552887a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238, android.os.Handler handler) {
        super(handler);
        this.f552887a = c3646xcf902238;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        super.onChange(z17);
        com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238 = this.f552887a;
        if (c3646xcf902238.f127513v == 1) {
            android.app.Activity activity = c3646xcf902238.f127508q;
            if (android.provider.Settings.System.getInt(activity.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                activity.setRequestedOrientation(10);
            } else {
                activity.setRequestedOrientation(1);
            }
        }
    }
}
