package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk */
/* loaded from: classes14.dex */
public final class C0406x5c1f6add implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.InterfaceC0858x9966785c {
    /* renamed from: isMotorolaMotoG3 */
    private static boolean m4059xc2e64362() {
        return "motorola".equalsIgnoreCase(android.os.Build.BRAND) && "MotoG3".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: isSamsungSMA920F */
    private static boolean m4060x7a9cbb26() {
        return "samsung".equalsIgnoreCase(android.os.Build.BRAND) && "SM-A920F".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: isSamsungSMG532F */
    private static boolean m4061x7aef7aaf() {
        return "samsung".equalsIgnoreCase(android.os.Build.BRAND) && "SM-G532F".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: isSamsungSMJ415F */
    private static boolean m4062x7b1945ae() {
        return "samsung".equalsIgnoreCase(android.os.Build.BRAND) && "SM-J415F".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: isSamsungSMJ700F */
    private static boolean m4063x7b1a9e6f() {
        return "samsung".equalsIgnoreCase(android.os.Build.BRAND) && "SM-J700F".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: isXiaomiMiA1 */
    private static boolean m4064xdffbaed1() {
        return "xiaomi".equalsIgnoreCase(android.os.Build.BRAND) && "Mi A1".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: load */
    public static boolean m4065x32c4e6(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        return m4059xc2e64362() || m4061x7aef7aaf() || m4063x7b1a9e6f() || m4060x7a9cbb26() || m4062x7b1945ae() || m4064xdffbaed1();
    }
}
