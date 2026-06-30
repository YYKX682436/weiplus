package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk */
/* loaded from: classes13.dex */
public class C0369x78af6be9 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {

    /* renamed from: AFFECTED_MODELS */
    static final java.util.List<java.lang.String> f700xb5948e95 = java.util.Arrays.asList("SM-A3000", "SM-A3009", "SM-A300F", "SM-A300FU", "SM-A300G", "SM-A300H", "SM-A300M", "SM-A300X", "SM-A300XU", "SM-A300XZ", "SM-A300Y", "SM-A300YZ", "SM-J510FN", "5059X");

    /* renamed from: load */
    public static boolean m3934x32c4e6() {
        return f700xb5948e95.contains(android.os.Build.MODEL.toUpperCase(java.util.Locale.US));
    }
}
