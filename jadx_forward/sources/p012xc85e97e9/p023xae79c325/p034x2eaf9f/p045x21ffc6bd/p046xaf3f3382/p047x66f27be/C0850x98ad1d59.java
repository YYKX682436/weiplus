package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be;

/* renamed from: androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk */
/* loaded from: classes13.dex */
public class C0850x98ad1d59 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {

    /* renamed from: FAILED_RETRY_ALLOW_LIST */
    private static final java.util.Set<android.util.Pair<java.lang.String, java.lang.String>> f2099x19cfc9cd = new java.util.HashSet(java.util.Collections.singletonList(android.util.Pair.create("SAMSUNG", "SM-G981U1")));

    /* renamed from: load */
    public static boolean m6167x32c4e6() {
        java.lang.String str = android.os.Build.BRAND;
        java.util.Locale locale = java.util.Locale.US;
        return f2099x19cfc9cd.contains(android.util.Pair.create(str.toUpperCase(locale), android.os.Build.MODEL.toUpperCase(locale)));
    }

    /* renamed from: getRetryCount */
    public int m6168xa8e25f3d() {
        return 1;
    }
}
