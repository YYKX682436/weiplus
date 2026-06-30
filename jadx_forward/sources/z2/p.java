package z2;

/* loaded from: classes13.dex */
public abstract class p {
    public static <T> T a(android.content.Context context, java.lang.Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static int b(android.app.AppOpsManager appOpsManager, java.lang.String str, java.lang.String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    public static int c(android.app.AppOpsManager appOpsManager, java.lang.String str, java.lang.String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    public static java.lang.String d(java.lang.String str) {
        return android.app.AppOpsManager.permissionToOp(str);
    }
}
