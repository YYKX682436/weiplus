package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk */
/* loaded from: classes14.dex */
public class C0361xea544f4f implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.InterfaceC0405x67332af5 {

    /* renamed from: AFFECTED_MODELS */
    public static final java.util.List<java.lang.String> f699xb5948e95 = java.util.Arrays.asList("SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", "SM-N920T", "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN");

    /* renamed from: load */
    public static boolean m3925x32c4e6(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        return f699xb5948e95.contains(android.os.Build.MODEL.toUpperCase(java.util.Locale.US)) && ((java.lang.Integer) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
