package androidx.camera.core.internal.compat.quirk;

/* loaded from: classes13.dex */
public final class LargeJpegImageQuirk implements androidx.camera.core.impl.Quirk {
    private static final int INVALID_JPEG_DATA_CHECK_THRESHOLD = 10000000;
    private static final java.util.Set<java.lang.String> SAMSUNG_DEVICE_MODELS = new java.util.HashSet(java.util.Arrays.asList("SM-A520F", "SM-A520L", "SM-A520K", "SM-A520S", "SM-A520X", "SM-A520W", "SM-A525F", "SM-A525M", "SM-A705F", "SM-A705FN", "SM-A705GM", "SM-A705MN", "SM-A7050", "SM-A705W", "SM-A705YN", "SM-A705U", "SM-A715F", "SM-A715F/DS", "SM-A715F/DSM", "SM-A715F/DSN", "SM-A715W", "SM-A715X", "SM-A725F", "SM-A725M", "SM-M515F", "SM-M515F/DSN", "SM-G930T", "SM-G930V", "SM-S901B", "SM-S901B/DS", "SM-S906B"));
    private static final java.util.Set<java.lang.String> VIVO_DEVICE_MODELS = new java.util.HashSet(java.util.Arrays.asList("V2244A", "V2045", "V2046"));

    private static boolean isSamsungDevice() {
        return "Samsung".equalsIgnoreCase(android.os.Build.BRAND);
    }

    private static boolean isSamsungProblematicDevice() {
        return "Samsung".equalsIgnoreCase(android.os.Build.BRAND) && SAMSUNG_DEVICE_MODELS.contains(android.os.Build.MODEL.toUpperCase(java.util.Locale.US));
    }

    private static boolean isVivoProblematicDevice() {
        return "Vivo".equalsIgnoreCase(android.os.Build.BRAND) && VIVO_DEVICE_MODELS.contains(android.os.Build.MODEL.toUpperCase(java.util.Locale.US));
    }

    public static boolean load() {
        return isSamsungDevice() || isVivoProblematicDevice();
    }

    public boolean shouldCheckInvalidJpegData(byte[] bArr) {
        return isSamsungProblematicDevice() || isVivoProblematicDevice() || bArr.length > INVALID_JPEG_DATA_CHECK_THRESHOLD;
    }
}
