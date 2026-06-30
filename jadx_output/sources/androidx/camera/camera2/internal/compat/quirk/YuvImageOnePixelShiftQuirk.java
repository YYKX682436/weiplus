package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes14.dex */
public final class YuvImageOnePixelShiftQuirk implements androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk {
    private static boolean isMotorolaMotoG3() {
        return "motorola".equalsIgnoreCase(android.os.Build.BRAND) && "MotoG3".equalsIgnoreCase(android.os.Build.MODEL);
    }

    private static boolean isSamsungSMA920F() {
        return "samsung".equalsIgnoreCase(android.os.Build.BRAND) && "SM-A920F".equalsIgnoreCase(android.os.Build.MODEL);
    }

    private static boolean isSamsungSMG532F() {
        return "samsung".equalsIgnoreCase(android.os.Build.BRAND) && "SM-G532F".equalsIgnoreCase(android.os.Build.MODEL);
    }

    private static boolean isSamsungSMJ415F() {
        return "samsung".equalsIgnoreCase(android.os.Build.BRAND) && "SM-J415F".equalsIgnoreCase(android.os.Build.MODEL);
    }

    private static boolean isSamsungSMJ700F() {
        return "samsung".equalsIgnoreCase(android.os.Build.BRAND) && "SM-J700F".equalsIgnoreCase(android.os.Build.MODEL);
    }

    private static boolean isXiaomiMiA1() {
        return "xiaomi".equalsIgnoreCase(android.os.Build.BRAND) && "Mi A1".equalsIgnoreCase(android.os.Build.MODEL);
    }

    public static boolean load(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return isMotorolaMotoG3() || isSamsungSMG532F() || isSamsungSMJ700F() || isSamsungSMA920F() || isSamsungSMJ415F() || isXiaomiMiA1();
    }
}
