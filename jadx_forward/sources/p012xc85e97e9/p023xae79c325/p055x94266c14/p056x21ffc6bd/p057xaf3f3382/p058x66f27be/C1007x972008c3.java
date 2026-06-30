package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p058x66f27be;

/* renamed from: androidx.camera.extensions.internal.compat.quirk.ExtensionDisabledQuirk */
/* loaded from: classes14.dex */
public class C1007x972008c3 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {
    /* renamed from: isAdvancedExtenderSupported */
    private static boolean m6733x36c5fd1b() {
        return p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6700x18d7a440(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2441xa9797f9d) && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6697x36c5fd1b();
    }

    /* renamed from: isMoto */
    private static boolean m6734xb9a617e7() {
        return "motorola".equalsIgnoreCase(android.os.Build.BRAND);
    }

    /* renamed from: isPixel5 */
    private static boolean m6735xed4b7039() {
        return "google".equalsIgnoreCase(android.os.Build.BRAND) && "redfin".equalsIgnoreCase(android.os.Build.DEVICE);
    }

    /* renamed from: isRealme */
    private static boolean m6736xf0726980() {
        return "realme".equalsIgnoreCase(android.os.Build.BRAND);
    }

    /* renamed from: load */
    public static boolean m6737x32c4e6() {
        return m6735xed4b7039() || m6734xb9a617e7() || m6736xf0726980();
    }

    /* renamed from: shouldDisableExtension */
    public boolean m6738x7c91720a() {
        if (m6735xed4b7039() && !m6733x36c5fd1b()) {
            return true;
        }
        if (m6734xb9a617e7() && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6699x884246e(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2440xa9797f9c)) {
            return true;
        }
        return m6736xf0726980() && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6699x884246e(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2440xa9797f9c);
    }
}
