package b3;

/* loaded from: classes8.dex */
public abstract class p {
    public static <T> T[] a(android.content.Intent intent, java.lang.String str, java.lang.Class<T> cls) {
        return (T[]) intent.getParcelableArrayExtra(str, cls);
    }

    public static <T> java.util.ArrayList<T> b(android.content.Intent intent, java.lang.String str, java.lang.Class<? extends T> cls) {
        return intent.getParcelableArrayListExtra(str, cls);
    }

    public static <T> T c(android.content.Intent intent, java.lang.String str, java.lang.Class<T> cls) {
        return (T) intent.getParcelableExtra(str, cls);
    }
}
