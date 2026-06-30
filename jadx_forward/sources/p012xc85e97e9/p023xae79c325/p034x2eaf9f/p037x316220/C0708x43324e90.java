package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.ExtendedCameraConfigProviderStore */
/* loaded from: classes14.dex */
public final class C0708x43324e90 {

    /* renamed from: LOCK */
    private static final java.lang.Object f1660x23bd2b = new java.lang.Object();

    /* renamed from: CAMERA_CONFIG_PROVIDERS */
    private static final java.util.Map<java.lang.Object, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0666x5d1a69f8> f1659xfb4cc99f = new java.util.HashMap();

    private C0708x43324e90() {
    }

    /* renamed from: addConfig */
    public static void m5436xe4772b43(java.lang.Object obj, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0666x5d1a69f8 interfaceC0666x5d1a69f8) {
        synchronized (f1660x23bd2b) {
            f1659xfb4cc99f.put(obj, interfaceC0666x5d1a69f8);
        }
    }

    /* renamed from: clear */
    public static void m5437x5a5b64d() {
        synchronized (f1660x23bd2b) {
            f1659xfb4cc99f.clear();
        }
    }

    /* renamed from: getConfigProvider */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0666x5d1a69f8 m5438xf6475849(java.lang.Object obj) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0666x5d1a69f8 interfaceC0666x5d1a69f8;
        synchronized (f1660x23bd2b) {
            interfaceC0666x5d1a69f8 = f1659xfb4cc99f.get(obj);
        }
        return interfaceC0666x5d1a69f8 == null ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0666x5d1a69f8.f1553x3f08d2d : interfaceC0666x5d1a69f8;
    }
}
