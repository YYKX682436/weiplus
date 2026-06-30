package b3;

/* loaded from: classes13.dex */
public abstract class d {
    public static java.io.File[] a(android.content.Context context) {
        return context.getExternalCacheDirs();
    }

    public static java.io.File[] b(android.content.Context context, java.lang.String str) {
        return context.getExternalFilesDirs(str);
    }

    public static java.io.File[] c(android.content.Context context) {
        return context.getObbDirs();
    }
}
