package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk */
/* loaded from: classes14.dex */
public class C0403x74717231 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {

    /* renamed from: AFFECTED_PIXEL_MODELS */
    private static final java.util.List<java.lang.String> f726x6791464e = java.util.Arrays.asList("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");

    /* renamed from: mCameraCharacteristics */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 f727x43bc1de6;

    public C0403x74717231(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        this.f727x43bc1de6 = c0322x11ef9595;
    }

    /* renamed from: isAffectedModel */
    private static boolean m4051x9c2fd80b(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        return m4052xd806bca1() && m4054x24672724(c0322x11ef9595);
    }

    /* renamed from: isAffectedPixelModel */
    private static boolean m4052xd806bca1() {
        java.util.Iterator<java.lang.String> it = f726x6791464e.iterator();
        while (it.hasNext()) {
            if (android.os.Build.MODEL.toUpperCase(java.util.Locale.US).equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isExternalFlashAeModeSupported */
    private static boolean m4053x72fcad2c(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        return android.os.Build.VERSION.SDK_INT >= 28 && p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.m2938xd49fdfff(c0322x11ef9595, 5) == 5;
    }

    /* renamed from: isFrontCamera */
    private static boolean m4054x24672724(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        return ((java.lang.Integer) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    /* renamed from: load */
    public static boolean m4055x32c4e6(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        return m4051x9c2fd80b(c0322x11ef9595);
    }

    /* renamed from: isFlashModeTorchRequired */
    public boolean m4056x9c2cea92() {
        return !m4053x72fcad2c(this.f727x43bc1de6);
    }
}
