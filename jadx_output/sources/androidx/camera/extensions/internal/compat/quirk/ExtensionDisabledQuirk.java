package androidx.camera.extensions.internal.compat.quirk;

/* loaded from: classes14.dex */
public class ExtensionDisabledQuirk implements androidx.camera.core.impl.Quirk {
    private static boolean isAdvancedExtenderSupported() {
        return androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(androidx.camera.extensions.internal.Version.VERSION_1_2) && androidx.camera.extensions.internal.ExtensionVersion.isAdvancedExtenderSupported();
    }

    private static boolean isMoto() {
        return "motorola".equalsIgnoreCase(android.os.Build.BRAND);
    }

    private static boolean isPixel5() {
        return "google".equalsIgnoreCase(android.os.Build.BRAND) && "redfin".equalsIgnoreCase(android.os.Build.DEVICE);
    }

    private static boolean isRealme() {
        return "realme".equalsIgnoreCase(android.os.Build.BRAND);
    }

    public static boolean load() {
        return isPixel5() || isMoto() || isRealme();
    }

    public boolean shouldDisableExtension() {
        if (isPixel5() && !isAdvancedExtenderSupported()) {
            return true;
        }
        if (isMoto() && androidx.camera.extensions.internal.ExtensionVersion.isMaximumCompatibleVersion(androidx.camera.extensions.internal.Version.VERSION_1_1)) {
            return true;
        }
        return isRealme() && androidx.camera.extensions.internal.ExtensionVersion.isMaximumCompatibleVersion(androidx.camera.extensions.internal.Version.VERSION_1_1);
    }
}
