package c01;

/* loaded from: classes9.dex */
public abstract class od {
    public static boolean a(java.lang.Object obj, boolean z17) {
        if (obj instanceof java.lang.Boolean) {
            try {
                return ((java.lang.Boolean) obj).booleanValue();
            } catch (java.lang.Exception unused) {
            }
        }
        return z17;
    }

    public static int b(java.lang.Object obj, int i17) {
        if (obj instanceof java.lang.Integer) {
            try {
                return ((java.lang.Integer) obj).intValue();
            } catch (java.lang.Exception unused) {
            }
        }
        return i17;
    }

    public static java.lang.String c(java.lang.Object obj, java.lang.String str) {
        if (obj instanceof java.lang.String) {
            try {
                return (java.lang.String) obj;
            } catch (java.lang.Exception unused) {
            }
        }
        return str;
    }
}
