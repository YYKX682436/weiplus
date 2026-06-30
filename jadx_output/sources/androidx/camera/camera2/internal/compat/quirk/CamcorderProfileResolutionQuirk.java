package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes14.dex */
public class CamcorderProfileResolutionQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.lang.String TAG = "CamcorderProfileResolutionQuirk";
    private final androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat mStreamConfigurationMapCompat;
    private java.util.List<android.util.Size> mSupportedResolutions = null;

    public CamcorderProfileResolutionQuirk(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mStreamConfigurationMapCompat = cameraCharacteristicsCompat.getStreamConfigurationMapCompat();
    }

    public static boolean load(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        java.lang.Integer num = (java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public java.util.List<android.util.Size> getSupportedResolutions() {
        if (this.mSupportedResolutions == null) {
            android.util.Size[] outputSizes = this.mStreamConfigurationMapCompat.getOutputSizes(34);
            this.mSupportedResolutions = outputSizes != null ? java.util.Arrays.asList((android.util.Size[]) outputSizes.clone()) : java.util.Collections.emptyList();
            androidx.camera.core.Logger.d(TAG, "mSupportedResolutions = " + this.mSupportedResolutions);
        }
        return new java.util.ArrayList(this.mSupportedResolutions);
    }
}
