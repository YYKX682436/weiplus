package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes14.dex */
public class JpegCaptureDownsizingQuirk implements androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk {
    private static final java.util.Set<java.lang.String> KNOWN_AFFECTED_FRONT_CAMERA_DEVICES = new java.util.HashSet(java.util.Arrays.asList("redmi note 8 pro"));

    public static boolean load(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return KNOWN_AFFECTED_FRONT_CAMERA_DEVICES.contains(android.os.Build.MODEL.toLowerCase(java.util.Locale.US)) && ((java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
