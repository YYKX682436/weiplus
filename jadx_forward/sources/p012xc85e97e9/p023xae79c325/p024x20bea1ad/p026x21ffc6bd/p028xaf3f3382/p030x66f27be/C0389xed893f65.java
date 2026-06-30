package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk */
/* loaded from: classes13.dex */
public final class C0389xed893f65 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.InterfaceC0859x5340759f {

    /* renamed from: KNOWN_AFFECTED_DEVICES */
    private static final java.util.Set<java.lang.String> f722x83f12f8e = new java.util.HashSet(java.util.Arrays.asList("heroqltevzw", "heroqltetmo", "k61v1_basic_ref"));

    /* renamed from: load */
    public static boolean m4022x32c4e6(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        return f722x83f12f8e.contains(android.os.Build.DEVICE.toLowerCase(java.util.Locale.US));
    }
}
