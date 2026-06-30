package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be;

/* renamed from: androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk */
/* loaded from: classes13.dex */
public final class C0854xd68e7e60 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {
    /* renamed from: isEmulator */
    private static boolean m6173x205c5a5f() {
        java.lang.String str = android.os.Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith(com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a)) {
            java.lang.String str2 = android.os.Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Cuttlefish") && !str2.contains("Android SDK built for x86") && !android.os.Build.MANUFACTURER.contains("Genymotion") && ((!android.os.Build.BRAND.startsWith("generic") || !android.os.Build.DEVICE.startsWith("generic")) && !android.os.Build.PRODUCT.equals("google_sdk") && !android.os.Build.HARDWARE.contains("ranchu"))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: isEmulatorAndApi21 */
    private static boolean m6174xe24e75c1() {
        m6173x205c5a5f();
        return false;
    }

    /* renamed from: isHonor9X */
    private static boolean m6175x1ea5889f() {
        return "HONOR".equalsIgnoreCase(android.os.Build.BRAND) && "STK-LX1".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: isHuaweiMate20Lite */
    private static boolean m6176xde4511e2() {
        return "HUAWEI".equalsIgnoreCase(android.os.Build.BRAND) && "SNE-LX1".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: load */
    public static boolean m6177x32c4e6() {
        return m6176xde4511e2() || m6175x1ea5889f() || m6174xe24e75c1();
    }

    /* renamed from: isSupported */
    public boolean m6178x450f16a4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option) {
        return option != p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.f1604x5742e808;
    }
}
