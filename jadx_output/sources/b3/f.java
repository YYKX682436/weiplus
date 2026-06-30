package b3;

/* loaded from: classes13.dex */
public abstract class f {
    public static int a(android.content.Context context, int i17) {
        return context.getColor(i17);
    }

    public static <T> T b(android.content.Context context, java.lang.Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static java.lang.String c(android.content.Context context, java.lang.Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
