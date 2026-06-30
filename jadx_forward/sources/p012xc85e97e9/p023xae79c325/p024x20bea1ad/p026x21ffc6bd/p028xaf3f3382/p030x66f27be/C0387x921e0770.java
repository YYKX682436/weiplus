package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk */
/* loaded from: classes13.dex */
public class C0387x921e0770 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {

    /* renamed from: AFFECTED_PIXEL_MODELS */
    private static final java.util.List<java.lang.String> f720x6791464e = java.util.Arrays.asList("pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");

    /* renamed from: AFFECTED_ONE_PLUS_MODELS */
    private static final java.util.List<java.lang.String> f718x7c6a5c6b = java.util.Arrays.asList("cph2417", "cph2451");

    /* renamed from: AFFECTED_OPPO_MODELS */
    private static final java.util.List<java.lang.String> f719xfcbc9a9e = java.util.Arrays.asList("cph2437", "cph2525", "pht110");

    /* renamed from: isAPI33 */
    private static boolean m4005x7a650af0() {
        return android.os.Build.VERSION.SDK_INT == 33;
    }

    /* renamed from: isAffectedOnePlusDevices */
    private static boolean m4006xf311b4fb() {
        return m4007xd08c72c7() && m4005x7a650af0();
    }

    /* renamed from: isAffectedOnePlusModel */
    private static boolean m4007xd08c72c7() {
        return f718x7c6a5c6b.contains(android.os.Build.MODEL.toLowerCase(java.util.Locale.ROOT));
    }

    /* renamed from: isAffectedOppoDevices */
    private static boolean m4008x93f6747f() {
        return m4009xebe3434b() && m4005x7a650af0();
    }

    /* renamed from: isAffectedOppoModel */
    private static boolean m4009xebe3434b() {
        return f719xfcbc9a9e.contains(android.os.Build.MODEL.toLowerCase(java.util.Locale.ROOT));
    }

    /* renamed from: isAffectedPixelBuild */
    private static boolean m4010xd76e87e6() {
        return m4017xb13371f8() || m4015xd2a55784();
    }

    /* renamed from: isAffectedPixelDevices */
    private static boolean m4011x520f055() {
        return m4012xd806bca1() && m4010xd76e87e6();
    }

    /* renamed from: isAffectedPixelModel */
    private static boolean m4012xd806bca1() {
        return f720x6791464e.contains(android.os.Build.MODEL.toLowerCase(java.util.Locale.ROOT));
    }

    /* renamed from: isAffectedSamsungDevices */
    private static boolean m4013xa0daf8e1() {
        return "samsung".equalsIgnoreCase(android.os.Build.BRAND) && m4017xb13371f8();
    }

    /* renamed from: isAffectedXiaomiDevices */
    private static boolean m4014xe7417284() {
        java.lang.String str = android.os.Build.BRAND;
        return ("redmi".equalsIgnoreCase(str) || "xiaomi".equalsIgnoreCase(str)) && (m4016x9173c40d() || m4017xb13371f8());
    }

    /* renamed from: isTd1aBuild */
    private static boolean m4015xd2a55784() {
        return android.os.Build.ID.toLowerCase(java.util.Locale.ROOT).startsWith("td1a");
    }

    /* renamed from: isTkq1Build */
    private static boolean m4016x9173c40d() {
        return android.os.Build.ID.toLowerCase(java.util.Locale.ROOT).startsWith("tkq1");
    }

    /* renamed from: isTp1aBuild */
    private static boolean m4017xb13371f8() {
        return android.os.Build.ID.toLowerCase(java.util.Locale.ROOT).startsWith("tp1a");
    }

    /* renamed from: load */
    public static boolean m4018x32c4e6() {
        return m4013xa0daf8e1() || m4011x520f055() || m4014xe7417284() || m4006xf311b4fb() || m4008x93f6747f();
    }
}
