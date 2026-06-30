package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be;

/* renamed from: androidx.camera.core.internal.compat.quirk.LowMemoryQuirk */
/* loaded from: classes13.dex */
public class C0857xc371a769 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {

    /* renamed from: DEVICE_MODELS */
    private static final java.util.Set<java.lang.String> f2105x125d1c73 = new java.util.HashSet(java.util.Arrays.asList("SM-A520W", "MOTOG3"));

    /* renamed from: load */
    public static boolean m6192x32c4e6() {
        return f2105x125d1c73.contains(android.os.Build.MODEL.toUpperCase(java.util.Locale.US));
    }
}
