package androidx.camera.core.internal.compat.quirk;

/* loaded from: classes13.dex */
public final class ImageCaptureRotationOptionQuirk implements androidx.camera.core.impl.Quirk {
    private static boolean isEmulator() {
        java.lang.String str = android.os.Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith(com.eclipsesource.mmv8.Platform.UNKNOWN)) {
            java.lang.String str2 = android.os.Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Cuttlefish") && !str2.contains("Android SDK built for x86") && !android.os.Build.MANUFACTURER.contains("Genymotion") && ((!android.os.Build.BRAND.startsWith("generic") || !android.os.Build.DEVICE.startsWith("generic")) && !android.os.Build.PRODUCT.equals("google_sdk") && !android.os.Build.HARDWARE.contains("ranchu"))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isEmulatorAndApi21() {
        isEmulator();
        return false;
    }

    private static boolean isHonor9X() {
        return "HONOR".equalsIgnoreCase(android.os.Build.BRAND) && "STK-LX1".equalsIgnoreCase(android.os.Build.MODEL);
    }

    private static boolean isHuaweiMate20Lite() {
        return "HUAWEI".equalsIgnoreCase(android.os.Build.BRAND) && "SNE-LX1".equalsIgnoreCase(android.os.Build.MODEL);
    }

    public static boolean load() {
        return isHuaweiMate20Lite() || isHonor9X() || isEmulatorAndApi21();
    }

    public boolean isSupported(androidx.camera.core.impl.Config.Option<?> option) {
        return option != androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION;
    }
}
