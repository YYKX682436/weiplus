package b3;

/* loaded from: classes8.dex */
public abstract class q {
    public static java.lang.Object a(android.content.Intent intent, java.lang.String str, java.lang.Class cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return b3.p.c(intent, str, cls);
        }
        android.os.Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }
}
