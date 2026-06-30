package fp;

/* loaded from: classes3.dex */
public abstract class h {
    public static boolean a(int i17) {
        return android.os.Build.VERSION.SDK_INT < i17;
    }

    public static boolean b(int i17) {
        return android.os.Build.VERSION.SDK_INT > i17;
    }

    public static boolean c(int i17) {
        return android.os.Build.VERSION.SDK_INT >= i17;
    }
}
