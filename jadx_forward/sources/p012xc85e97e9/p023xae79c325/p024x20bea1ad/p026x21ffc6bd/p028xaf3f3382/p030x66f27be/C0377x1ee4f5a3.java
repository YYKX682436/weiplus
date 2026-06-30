package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk */
/* loaded from: classes13.dex */
public class C0377x1ee4f5a3 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {

    /* renamed from: KNOWN_AFFECTED_MODELS */
    private static final java.util.Set<android.util.Pair<java.lang.String, java.lang.String>> f709x87bec979 = new java.util.HashSet();

    static {
        m3975xbe936ceb("sprd", "lemp");
        m3975xbe936ceb("sprd", "DM20C");
    }

    /* renamed from: addAffectedDevice */
    private static void m3975xbe936ceb(java.lang.String str, java.lang.String str2) {
        java.util.Set<android.util.Pair<java.lang.String, java.lang.String>> set = f709x87bec979;
        java.util.Locale locale = java.util.Locale.US;
        set.add(new android.util.Pair<>(str.toLowerCase(locale), str2.toLowerCase(locale)));
    }

    /* renamed from: load */
    public static boolean m3976x32c4e6() {
        java.util.Set<android.util.Pair<java.lang.String, java.lang.String>> set = f709x87bec979;
        java.lang.String str = android.os.Build.MANUFACTURER;
        java.util.Locale locale = java.util.Locale.US;
        return set.contains(new android.util.Pair(str.toLowerCase(locale), android.os.Build.MODEL.toLowerCase(locale)));
    }
}
