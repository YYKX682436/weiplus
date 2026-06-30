package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class PreviewPixelHDRnetQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.List<java.lang.String> SUPPORTED_DEVICES = java.util.Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    public static boolean load() {
        return "Google".equals(android.os.Build.MANUFACTURER) && SUPPORTED_DEVICES.contains(android.os.Build.DEVICE.toLowerCase(java.util.Locale.getDefault()));
    }
}
