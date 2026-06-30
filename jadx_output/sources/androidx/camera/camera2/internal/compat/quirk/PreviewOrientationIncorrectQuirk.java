package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes14.dex */
public class PreviewOrientationIncorrectQuirk implements androidx.camera.core.impl.Quirk {
    public static boolean load(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        java.lang.Integer num = (java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
