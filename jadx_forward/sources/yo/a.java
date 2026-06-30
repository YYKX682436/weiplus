package yo;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object[] f545572a = new java.lang.Object[0];

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object[] f545573b = new java.lang.Object[73];

    public static boolean a(int[] iArr, int i17) {
        for (int i18 : iArr) {
            if (i18 == i17) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(java.lang.Object[] objArr, java.lang.Object obj) {
        for (java.lang.Object obj2 : objArr) {
            if (obj2 == null) {
                if (obj == null) {
                    return true;
                }
            } else if (obj != null && obj2.equals(obj)) {
                return true;
            }
        }
        return false;
    }
}
