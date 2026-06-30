package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class ImageCapturePixelHDRPlusQuirk implements androidx.camera.core.impl.Quirk {
    public static final java.util.List<java.lang.String> BUILD_MODELS = java.util.Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    public static boolean load() {
        return BUILD_MODELS.contains(android.os.Build.MODEL) && "Google".equals(android.os.Build.MANUFACTURER) && android.os.Build.VERSION.SDK_INT >= 26;
    }
}
