package androidx.camera.core.impl.compat;

/* loaded from: classes14.dex */
public final class EncoderProfilesProxyCompat {
    private static final java.lang.String TAG = "EncoderProfilesProxyCompat";

    private EncoderProfilesProxyCompat() {
    }

    public static androidx.camera.core.impl.EncoderProfilesProxy from(android.media.EncoderProfiles encoderProfiles) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 33) {
            return androidx.camera.core.impl.compat.EncoderProfilesProxyCompatApi33Impl.from(encoderProfiles);
        }
        if (i17 >= 31) {
            return androidx.camera.core.impl.compat.EncoderProfilesProxyCompatApi31Impl.from(encoderProfiles);
        }
        throw new java.lang.RuntimeException("Unable to call from(EncoderProfiles) on API " + i17 + ". Version 31 or higher required.");
    }

    public static androidx.camera.core.impl.EncoderProfilesProxy from(android.media.CamcorderProfile camcorderProfile) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 31) {
            androidx.camera.core.Logger.w(TAG, "Should use from(EncoderProfiles) on API " + i17 + "instead. CamcorderProfile is deprecated on API 31.");
        }
        return androidx.camera.core.impl.compat.EncoderProfilesProxyCompatBaseImpl.from(camcorderProfile);
    }
}
