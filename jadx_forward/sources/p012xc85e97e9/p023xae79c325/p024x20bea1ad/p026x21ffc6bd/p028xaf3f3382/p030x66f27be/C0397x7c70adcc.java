package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk */
/* loaded from: classes14.dex */
public class C0397x7c70adcc implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.InterfaceC0363xc472cf58 {
    /* renamed from: isHuaweiP8Lite */
    private static boolean m4034xb4f545a7() {
        return "HUAWEI".equalsIgnoreCase(android.os.Build.MANUFACTURER) && "HUAWEI ALE-L04".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: isOppoA37F */
    private static boolean m4035xc56d516b() {
        return "OPPO".equalsIgnoreCase(android.os.Build.MANUFACTURER) && "A37F".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: isSamsungJ1AceNeo */
    private static boolean m4036x6b49198c() {
        return "Samsung".equalsIgnoreCase(android.os.Build.MANUFACTURER) && "sm-j111f".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: isSamsungJ3 */
    private static boolean m4037x8e35f499() {
        return "Samsung".equalsIgnoreCase(android.os.Build.MANUFACTURER) && "sm-j320f".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: isSamsungJ5 */
    private static boolean m4038x8e35f49b() {
        return "Samsung".equalsIgnoreCase(android.os.Build.MANUFACTURER) && "sm-j510fn".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: isSamsungJ7 */
    private static boolean m4039x8e35f49d() {
        return "Samsung".equalsIgnoreCase(android.os.Build.MANUFACTURER) && "sm-j700f".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: load */
    public static boolean m4040x32c4e6() {
        return m4034xb4f545a7() || m4037x8e35f499() || m4039x8e35f49d() || m4036x6b49198c() || m4035xc56d516b() || m4038x8e35f49b();
    }
}
