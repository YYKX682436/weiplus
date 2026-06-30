package m3;

/* loaded from: classes13.dex */
public abstract class h {
    public static void a(boolean z17) {
        if (!z17) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void b(boolean z17, java.lang.Object obj) {
        if (!z17) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
    }

    public static int c(int i17, int i18, int i19, java.lang.String str) {
        if (i17 < i18) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%d, %d] (too low)", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
        }
        if (i17 <= i19) {
            return i17;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%d, %d] (too high)", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
    }

    public static java.lang.Object d(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(obj2));
    }

    public static void e(boolean z17, java.lang.String str) {
        if (!z17) {
            throw new java.lang.IllegalStateException(str);
        }
    }
}
