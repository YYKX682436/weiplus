package androidx.camera.core;

/* loaded from: classes14.dex */
public interface CameraInfo {
    public static final java.lang.String IMPLEMENTATION_TYPE_CAMERA2 = "androidx.camera.camera2";
    public static final java.lang.String IMPLEMENTATION_TYPE_CAMERA2_LEGACY = "androidx.camera.camera2.legacy";
    public static final java.lang.String IMPLEMENTATION_TYPE_FAKE = "androidx.camera.fake";
    public static final java.lang.String IMPLEMENTATION_TYPE_UNKNOWN = "<unknown>";
    public static final float INTRINSIC_ZOOM_RATIO_UNKNOWN = 1.0f;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface ImplementationType {
    }

    static boolean mustPlayShutterSound() {
        return androidx.camera.core.internal.compat.MediaActionSoundCompat.mustPlayShutterSound();
    }

    androidx.camera.core.CameraSelector getCameraSelector();

    androidx.lifecycle.g0 getCameraState();

    androidx.camera.core.ExposureState getExposureState();

    java.lang.String getImplementationType();

    default float getIntrinsicZoomRatio() {
        return 1.0f;
    }

    default int getLensFacing() {
        return -1;
    }

    default java.util.Set<androidx.camera.core.CameraInfo> getPhysicalCameraInfos() {
        return java.util.Collections.emptySet();
    }

    int getSensorRotationDegrees();

    int getSensorRotationDegrees(int i17);

    default java.util.Set<android.util.Range<java.lang.Integer>> getSupportedFrameRateRanges() {
        return java.util.Collections.emptySet();
    }

    androidx.lifecycle.g0 getTorchState();

    androidx.lifecycle.g0 getZoomState();

    boolean hasFlashUnit();

    default boolean isFocusMeteringSupported(androidx.camera.core.FocusMeteringAction focusMeteringAction) {
        return false;
    }

    default boolean isLogicalMultiCameraSupported() {
        return false;
    }

    default boolean isPrivateReprocessingSupported() {
        return false;
    }

    default boolean isZslSupported() {
        return false;
    }

    default java.util.Set<androidx.camera.core.DynamicRange> querySupportedDynamicRanges(java.util.Set<androidx.camera.core.DynamicRange> set) {
        return androidx.camera.core.impl.DynamicRanges.findAllPossibleMatches(set, java.util.Collections.singleton(androidx.camera.core.DynamicRange.SDR));
    }
}
