package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd;

/* renamed from: androidx.camera.extensions.internal.ExtensionVersion */
/* loaded from: classes14.dex */
public abstract class AbstractC0991x252767b9 {
    private static final java.lang.String TAG = "ExtenderVersion";

    /* renamed from: sExtensionVersion */
    private static volatile p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9 f2426x6176222c;

    /* renamed from: androidx.camera.extensions.internal.ExtensionVersion$DefaultExtenderVersioning */
    /* loaded from: classes14.dex */
    public static class DefaultExtenderVersioning extends p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9 {
        @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9
        /* renamed from: getVersionObject */
        public p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 mo6701xe3b76681() {
            return null;
        }

        @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9
        /* renamed from: isAdvancedExtenderSupportedInternal */
        public boolean mo6702xc8adcf8() {
            return false;
        }
    }

    /* renamed from: androidx.camera.extensions.internal.ExtensionVersion$VendorExtenderVersioning */
    /* loaded from: classes14.dex */
    public static class VendorExtenderVersioning extends p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9 {

        /* renamed from: sImpl */
        private static androidx.camera.extensions.impl.ExtensionVersionImpl f2427x6776533;

        /* renamed from: mRuntimeVersion */
        private p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 f2428x2a95ebad;

        public VendorExtenderVersioning() {
            if (f2427x6776533 == null) {
                f2427x6776533 = new androidx.camera.extensions.impl.ExtensionVersionImpl();
            }
            p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 m6721x6581ab3 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.m6721x6581ab3(f2427x6776533.checkApiVersion(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6688xa4c95a15().m6693x462284e()));
            if (m6721x6581ab3 != null && p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6688xa4c95a15().m6692x52c258a2().mo6678x74cb5c03() == m6721x6581ab3.mo6678x74cb5c03()) {
                this.f2428x2a95ebad = m6721x6581ab3;
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.TAG, "Selected vendor runtime: " + this.f2428x2a95ebad);
        }

        @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9
        /* renamed from: getVersionObject */
        public p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 mo6701xe3b76681() {
            return this.f2428x2a95ebad;
        }

        @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9
        /* renamed from: isAdvancedExtenderSupportedInternal */
        public boolean mo6702xc8adcf8() {
            try {
                return f2427x6776533.isAdvancedExtenderImplemented();
            } catch (java.lang.NoSuchMethodError unused) {
                return false;
            }
        }
    }

    /* renamed from: getInstance */
    private static p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9 m6694x9cf0d20b() {
        if (f2426x6176222c != null) {
            return f2426x6176222c;
        }
        synchronized (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.class) {
            if (f2426x6176222c == null) {
                try {
                    f2426x6176222c = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.VendorExtenderVersioning();
                } catch (java.lang.NoClassDefFoundError unused) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "No versioning extender found. Falling back to default.");
                    f2426x6176222c = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.DefaultExtenderVersioning();
                }
            }
        }
        return f2426x6176222c;
    }

    /* renamed from: getRuntimeVersion */
    public static p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 m6695x127aaed6() {
        return m6694x9cf0d20b().mo6701xe3b76681();
    }

    /* renamed from: injectInstance */
    public static void m6696xda678146(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9 abstractC0991x252767b9) {
        f2426x6176222c = abstractC0991x252767b9;
    }

    /* renamed from: isAdvancedExtenderSupported */
    public static boolean m6697x36c5fd1b() {
        return m6694x9cf0d20b().mo6702xc8adcf8();
    }

    /* renamed from: isExtensionVersionSupported */
    public static boolean m6698x9973630b() {
        return m6694x9cf0d20b().mo6701xe3b76681() != null;
    }

    /* renamed from: isMaximumCompatibleVersion */
    public static boolean m6699x884246e(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8) {
        return m6695x127aaed6().m6723xabcba240(abstractC1001x782db4b8.mo6678x74cb5c03(), abstractC1001x782db4b8.mo6679x74cf0dff()) <= 0;
    }

    /* renamed from: isMinimumCompatibleVersion */
    public static boolean m6700x18d7a440(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8) {
        return m6695x127aaed6().m6723xabcba240(abstractC1001x782db4b8.mo6678x74cb5c03(), abstractC1001x782db4b8.mo6679x74cf0dff()) >= 0;
    }

    /* renamed from: getVersionObject */
    public abstract p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 mo6701xe3b76681();

    /* renamed from: isAdvancedExtenderSupportedInternal */
    public abstract boolean mo6702xc8adcf8();
}
