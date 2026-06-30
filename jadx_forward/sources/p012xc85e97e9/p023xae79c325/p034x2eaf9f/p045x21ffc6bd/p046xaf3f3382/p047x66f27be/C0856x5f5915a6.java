package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be;

/* renamed from: androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk */
/* loaded from: classes13.dex */
public final class C0856x5f5915a6 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {

    /* renamed from: INVALID_JPEG_DATA_CHECK_THRESHOLD */
    private static final int f2102xb4a7be2e = 10000000;

    /* renamed from: SAMSUNG_DEVICE_MODELS */
    private static final java.util.Set<java.lang.String> f2103xcf9874ce = new java.util.HashSet(java.util.Arrays.asList("SM-A520F", "SM-A520L", "SM-A520K", "SM-A520S", "SM-A520X", "SM-A520W", "SM-A525F", "SM-A525M", "SM-A705F", "SM-A705FN", "SM-A705GM", "SM-A705MN", "SM-A7050", "SM-A705W", "SM-A705YN", "SM-A705U", "SM-A715F", "SM-A715F/DS", "SM-A715F/DSM", "SM-A715F/DSN", "SM-A715W", "SM-A715X", "SM-A725F", "SM-A725M", "SM-M515F", "SM-M515F/DSN", "SM-G930T", "SM-G930V", "SM-S901B", "SM-S901B/DS", "SM-S906B"));

    /* renamed from: VIVO_DEVICE_MODELS */
    private static final java.util.Set<java.lang.String> f2104x6ed38620 = new java.util.HashSet(java.util.Arrays.asList("V2244A", "V2045", "V2046"));

    /* renamed from: isSamsungDevice */
    private static boolean m6186xdb42bde6() {
        return "Samsung".equalsIgnoreCase(android.os.Build.BRAND);
    }

    /* renamed from: isSamsungProblematicDevice */
    private static boolean m6187xa383d392() {
        return "Samsung".equalsIgnoreCase(android.os.Build.BRAND) && f2103xcf9874ce.contains(android.os.Build.MODEL.toUpperCase(java.util.Locale.US));
    }

    /* renamed from: isVivoProblematicDevice */
    private static boolean m6188x8cd43ecc() {
        return "Vivo".equalsIgnoreCase(android.os.Build.BRAND) && f2104x6ed38620.contains(android.os.Build.MODEL.toUpperCase(java.util.Locale.US));
    }

    /* renamed from: load */
    public static boolean m6189x32c4e6() {
        return m6186xdb42bde6() || m6188x8cd43ecc();
    }

    /* renamed from: shouldCheckInvalidJpegData */
    public boolean m6190xe86ad374(byte[] bArr) {
        return m6187xa383d392() || m6188x8cd43ecc() || bArr.length > f2102xb4a7be2e;
    }
}
