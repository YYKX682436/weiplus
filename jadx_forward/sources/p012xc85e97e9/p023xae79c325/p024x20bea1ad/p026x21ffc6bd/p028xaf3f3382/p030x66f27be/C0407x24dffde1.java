package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk */
/* loaded from: classes13.dex */
public class C0407x24dffde1 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {

    /* renamed from: AFFECTED_SAMSUNG_MODEL */
    private static final java.util.List<java.lang.String> f729x3da33fd9 = java.util.Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1");

    /* renamed from: AFFECTED_XIAOMI_MODEL */
    private static final java.util.List<java.lang.String> f730x77e9ba70 = java.util.Arrays.asList("MI 8");

    /* renamed from: isAffectedModel */
    private static boolean m4067x9c2fd80b(java.util.List<java.lang.String> list) {
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            if (android.os.Build.MODEL.toUpperCase(java.util.Locale.US).startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isAffectedSamsungDevices */
    private static boolean m4068xa0daf8e1() {
        return "samsung".equalsIgnoreCase(android.os.Build.BRAND) && m4067x9c2fd80b(f729x3da33fd9);
    }

    /* renamed from: isAffectedXiaoMiDevices */
    private static boolean m4069x5eb39264() {
        return "xiaomi".equalsIgnoreCase(android.os.Build.BRAND) && m4067x9c2fd80b(f730x77e9ba70);
    }

    /* renamed from: load */
    public static boolean m4070x32c4e6() {
        return m4068xa0daf8e1() || m4069x5eb39264();
    }
}
