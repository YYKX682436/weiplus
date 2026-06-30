package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes14.dex */
public class CaptureNoResponseQuirk implements androidx.camera.core.impl.Quirk {
    public static boolean load(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        java.lang.String str = android.os.Build.HARDWARE;
        return ("samsungexynos7420".equalsIgnoreCase(str) || "universal7420".equalsIgnoreCase(str)) && ((java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
