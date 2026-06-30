package androidx.camera.core.impl.utils;

/* loaded from: classes13.dex */
public final class ContextUtil {

    /* loaded from: classes13.dex */
    public static class Api30Impl {
        private Api30Impl() {
        }

        public static android.content.Context createAttributionContext(android.content.Context context, java.lang.String str) {
            return context.createAttributionContext(str);
        }

        public static java.lang.String getAttributionTag(android.content.Context context) {
            return context.getAttributionTag();
        }
    }

    /* loaded from: classes13.dex */
    public static class Api34Impl {
        private Api34Impl() {
        }

        public static android.content.Context createDeviceContext(android.content.Context context, int i17) {
            return context.createDeviceContext(i17);
        }

        public static int getDeviceId(android.content.Context context) {
            return context.getDeviceId();
        }
    }

    private ContextUtil() {
    }

    public static android.content.Context getApplicationContext(android.content.Context context) {
        int deviceId;
        android.content.Context applicationContext = context.getApplicationContext();
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 34 && (deviceId = androidx.camera.core.impl.utils.ContextUtil.Api34Impl.getDeviceId(context)) != androidx.camera.core.impl.utils.ContextUtil.Api34Impl.getDeviceId(applicationContext)) {
            applicationContext = androidx.camera.core.impl.utils.ContextUtil.Api34Impl.createDeviceContext(applicationContext, deviceId);
        }
        if (i17 < 30) {
            return applicationContext;
        }
        java.lang.String attributionTag = androidx.camera.core.impl.utils.ContextUtil.Api30Impl.getAttributionTag(context);
        return !java.util.Objects.equals(attributionTag, androidx.camera.core.impl.utils.ContextUtil.Api30Impl.getAttributionTag(applicationContext)) ? androidx.camera.core.impl.utils.ContextUtil.Api30Impl.createAttributionContext(applicationContext, attributionTag) : applicationContext;
    }

    public static android.app.Application getApplicationFromContext(android.content.Context context) {
        for (android.content.Context applicationContext = getApplicationContext(context); applicationContext instanceof android.content.ContextWrapper; applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof android.app.Application) {
                return (android.app.Application) applicationContext;
            }
        }
        return null;
    }
}
