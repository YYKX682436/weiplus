package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p040xaf3f3382;

/* renamed from: androidx.camera.core.impl.compat.EncoderProfilesProxyCompat */
/* loaded from: classes14.dex */
public final class C0772xb6fc56aa {
    private static final java.lang.String TAG = "EncoderProfilesProxyCompat";

    private C0772xb6fc56aa() {
    }

    /* renamed from: from */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08 m5767x3017aa(android.media.EncoderProfiles encoderProfiles) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 33) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p040xaf3f3382.C0774x6d9453b0.m5771x3017aa(encoderProfiles);
        }
        if (i17 >= 31) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p040xaf3f3382.C0773x6d7824ae.m5768x3017aa(encoderProfiles);
        }
        throw new java.lang.RuntimeException("Unable to call from(EncoderProfiles) on API " + i17 + ". Version 31 or higher required.");
    }

    /* renamed from: from */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08 m5766x3017aa(android.media.CamcorderProfile camcorderProfile) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 31) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Should use from(EncoderProfiles) on API " + i17 + "instead. CamcorderProfile is deprecated on API 31.");
        }
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p040xaf3f3382.C0775xaf17d5b.m5774x3017aa(camcorderProfile);
    }
}
