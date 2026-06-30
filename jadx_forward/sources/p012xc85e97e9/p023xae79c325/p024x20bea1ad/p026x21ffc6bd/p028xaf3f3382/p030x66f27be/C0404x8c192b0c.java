package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk */
/* loaded from: classes13.dex */
public class C0404x8c192b0c implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {

    /* renamed from: BUILD_MODELS */
    public static final java.util.List<java.lang.String> f728xda1c797b = java.util.Arrays.asList("mi a1", "mi a2", "mi a2 lite", "redmi 4x", "redmi 5a", "redmi note 5", "redmi note 5 pro", "redmi 6 pro");

    /* renamed from: load */
    public static boolean m4058x32c4e6() {
        return f728xda1c797b.contains(android.os.Build.MODEL.toLowerCase(java.util.Locale.US));
    }
}
