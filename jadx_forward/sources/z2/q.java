package z2;

/* loaded from: classes13.dex */
public abstract class q {
    public static int a(android.app.AppOpsManager appOpsManager, java.lang.String str, int i17, java.lang.String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i17, str2);
    }

    public static java.lang.String b(android.content.Context context) {
        return context.getOpPackageName();
    }

    public static android.app.AppOpsManager c(android.content.Context context) {
        return (android.app.AppOpsManager) context.getSystemService(android.app.AppOpsManager.class);
    }
}
