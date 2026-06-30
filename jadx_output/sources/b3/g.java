package b3;

/* loaded from: classes13.dex */
public abstract class g {
    public static android.content.Context a(android.content.Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static java.io.File b(android.content.Context context) {
        return context.getDataDir();
    }

    public static boolean c(android.content.Context context) {
        return context.isDeviceProtectedStorage();
    }
}
