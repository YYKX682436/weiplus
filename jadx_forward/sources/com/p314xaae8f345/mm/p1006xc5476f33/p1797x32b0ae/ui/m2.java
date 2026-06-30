package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes14.dex */
public final class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 f225976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f225977e;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 activityC16262x8382bfc0, int i17) {
        this.f225976d = activityC16262x8382bfc0;
        this.f225977e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 activityC16262x8382bfc0 = this.f225976d;
        if (i17 == 26) {
            kd.c.e(activityC16262x8382bfc0.f225886d, "avoid setRequestedOrientation when Oreo", new java.lang.Object[0]);
            return;
        }
        int i18 = this.f225977e;
        activityC16262x8382bfc0.f225898s = i18;
        if (i18 == 0) {
            activityC16262x8382bfc0.setRequestedOrientation(1);
            return;
        }
        if (i18 == activityC16262x8382bfc0.f225895p) {
            if (android.provider.Settings.System.getInt(activityC16262x8382bfc0.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                activityC16262x8382bfc0.setRequestedOrientation(10);
                return;
            } else {
                activityC16262x8382bfc0.setRequestedOrientation(1);
                return;
            }
        }
        if (i18 == activityC16262x8382bfc0.f225896q) {
            activityC16262x8382bfc0.setRequestedOrientation(1);
        } else if (i18 == activityC16262x8382bfc0.f225897r) {
            activityC16262x8382bfc0.setRequestedOrientation(6);
        }
    }
}
