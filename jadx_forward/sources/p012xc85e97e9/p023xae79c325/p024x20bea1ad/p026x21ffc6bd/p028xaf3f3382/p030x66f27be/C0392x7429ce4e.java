package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk */
/* loaded from: classes13.dex */
public class C0392x7429ce4e implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {

    /* renamed from: DEVICE_MODELS */
    private static final java.util.List<java.lang.String> f723x125d1c73 = java.util.Arrays.asList("NEXUS 4");

    /* renamed from: load */
    public static boolean m4027x32c4e6() {
        "GOOGLE".equalsIgnoreCase(android.os.Build.BRAND);
        return false;
    }

    /* renamed from: getCorrectedAspectRatio */
    public int m4028xb95ca4c0() {
        return 2;
    }
}
