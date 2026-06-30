package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes14.dex */
public class AfRegionFlipHorizontallyQuirk implements androidx.camera.core.impl.Quirk {
    public static boolean load(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return android.os.Build.BRAND.equalsIgnoreCase("SAMSUNG") && android.os.Build.VERSION.SDK_INT < 33 && ((java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
