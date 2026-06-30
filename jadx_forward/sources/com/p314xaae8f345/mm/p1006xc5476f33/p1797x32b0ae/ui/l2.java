package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes14.dex */
public final class l2 extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 f225967a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 activityC16262x8382bfc0, android.os.Handler handler) {
        super(handler);
        this.f225967a = activityC16262x8382bfc0;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        super.onChange(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 activityC16262x8382bfc0 = this.f225967a;
        if (activityC16262x8382bfc0.f225898s == activityC16262x8382bfc0.f225895p) {
            if (android.provider.Settings.System.getInt(activityC16262x8382bfc0.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                activityC16262x8382bfc0.setRequestedOrientation(10);
            } else {
                activityC16262x8382bfc0.setRequestedOrientation(1);
            }
        }
    }
}
