package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk */
/* loaded from: classes14.dex */
public class C0378x46071f39 implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.InterfaceC0405x67332af5 {

    /* renamed from: AFFECTED_MODEL_PREFIXES */
    private static final java.util.List<java.lang.String> f710xf808b061 = java.util.Arrays.asList("PIXEL 3A", "PIXEL 3A XL", "PIXEL 4", "PIXEL 5", "SM-A320", "MOTO G(20)", "ITEL L6006", "RMX3231");

    /* renamed from: isAffectedModel */
    private static boolean m3978x9c2fd80b() {
        java.util.Iterator<java.lang.String> it = f710xf808b061.iterator();
        while (it.hasNext()) {
            if (android.os.Build.MODEL.toUpperCase(java.util.Locale.US).startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: load */
    public static boolean m3979x32c4e6(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        return m3978x9c2fd80b() && ((java.lang.Integer) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
