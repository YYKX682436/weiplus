package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk */
/* loaded from: classes13.dex */
public class C0381xe3e162b7 implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.InterfaceC0363xc472cf58, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.InterfaceC0861x5142641e {
    /* renamed from: isBluStudioX10 */
    public static boolean m3986x3cbdcc00() {
        return "blu".equalsIgnoreCase(android.os.Build.BRAND) && "studio x10".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: isItelW6004 */
    public static boolean m3987xc45b2539() {
        return "itel".equalsIgnoreCase(android.os.Build.BRAND) && "itel w6004".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: isMotoE13 */
    public static boolean m3988x277893e0() {
        return "motorola".equalsIgnoreCase(android.os.Build.BRAND) && "moto e13".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: isPixel4XLApi29 */
    private static boolean m3989x89d58015() {
        return "pixel 4 xl".equalsIgnoreCase(android.os.Build.MODEL) && android.os.Build.VERSION.SDK_INT == 29;
    }

    /* renamed from: isPositivoTwist2Pro */
    public static boolean m3990xe30c65f5() {
        return "positivo".equalsIgnoreCase(android.os.Build.BRAND) && "twist 2 pro".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: isSamsungTabA8 */
    public static boolean m3991x397e64dc() {
        if ("samsung".equalsIgnoreCase(android.os.Build.BRAND)) {
            java.lang.String str = android.os.Build.DEVICE;
            if ("gta8".equalsIgnoreCase(str) || "gta8wifi".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isVivo1805 */
    public static boolean m3992x347fcc62() {
        return "vivo".equalsIgnoreCase(android.os.Build.BRAND) && "vivo 1805".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: load */
    public static boolean m3993x32c4e6() {
        return m3986x3cbdcc00() || m3987xc45b2539() || m3992x347fcc62() || m3990xe30c65f5() || m3989x89d58015() || m3988x277893e0() || m3991x397e64dc();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.InterfaceC0363xc472cf58
    /* renamed from: workaroundByCaptureIntentPreview */
    public boolean mo3927x67a6549b() {
        return m3986x3cbdcc00() || m3987xc45b2539() || m3992x347fcc62() || m3990xe30c65f5();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.InterfaceC0861x5142641e
    /* renamed from: workaroundBySurfaceProcessing */
    public boolean mo3994x9c857b0b() {
        return m3986x3cbdcc00() || m3987xc45b2539() || m3992x347fcc62() || m3990xe30c65f5() || m3989x89d58015() || m3988x277893e0() || m3991x397e64dc();
    }
}
