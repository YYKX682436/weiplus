package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.ContextUtil */
/* loaded from: classes13.dex */
public final class C0784x5d48d231 {

    /* renamed from: androidx.camera.core.impl.utils.ContextUtil$Api30Impl */
    /* loaded from: classes13.dex */
    public static class Api30Impl {
        private Api30Impl() {
        }

        /* renamed from: createAttributionContext */
        public static android.content.Context m5818xc935164c(android.content.Context context, java.lang.String str) {
            return context.createAttributionContext(str);
        }

        /* renamed from: getAttributionTag */
        public static java.lang.String m5819x81613f91(android.content.Context context) {
            return context.getAttributionTag();
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.ContextUtil$Api34Impl */
    /* loaded from: classes13.dex */
    public static class Api34Impl {
        private Api34Impl() {
        }

        /* renamed from: createDeviceContext */
        public static android.content.Context m5820x56bc0add(android.content.Context context, int i17) {
            return context.createDeviceContext(i17);
        }

        /* renamed from: getDeviceId */
        public static int m5821xbdf72787(android.content.Context context) {
            return context.getDeviceId();
        }
    }

    private C0784x5d48d231() {
    }

    /* renamed from: getApplicationContext */
    public static android.content.Context m5816x6e669035(android.content.Context context) {
        int m5821xbdf72787;
        android.content.Context applicationContext = context.getApplicationContext();
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 34 && (m5821xbdf72787 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0784x5d48d231.Api34Impl.m5821xbdf72787(context)) != p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0784x5d48d231.Api34Impl.m5821xbdf72787(applicationContext)) {
            applicationContext = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0784x5d48d231.Api34Impl.m5820x56bc0add(applicationContext, m5821xbdf72787);
        }
        if (i17 < 30) {
            return applicationContext;
        }
        java.lang.String m5819x81613f91 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0784x5d48d231.Api30Impl.m5819x81613f91(context);
        return !java.util.Objects.equals(m5819x81613f91, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0784x5d48d231.Api30Impl.m5819x81613f91(applicationContext)) ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0784x5d48d231.Api30Impl.m5818xc935164c(applicationContext, m5819x81613f91) : applicationContext;
    }

    /* renamed from: getApplicationFromContext */
    public static android.app.Application m5817xfe224a2b(android.content.Context context) {
        for (android.content.Context m5816x6e669035 = m5816x6e669035(context); m5816x6e669035 instanceof android.content.ContextWrapper; m5816x6e669035 = ((android.content.ContextWrapper) m5816x6e669035).getBaseContext()) {
            if (m5816x6e669035 instanceof android.app.Application) {
                return (android.app.Application) m5816x6e669035;
            }
        }
        return null;
    }
}
