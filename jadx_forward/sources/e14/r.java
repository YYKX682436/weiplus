package e14;

/* loaded from: classes10.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f327978a = new java.lang.ThreadLocal();

    public static java.util.Map a(java.lang.String str, java.lang.String str2) {
        int indexOf;
        if (str == null) {
            indexOf = -1;
        } else {
            indexOf = str.indexOf("<" + str2);
        }
        if (indexOf < 0) {
            return null;
        }
        if (indexOf > 0) {
            str = str.substring(indexOf);
        }
        try {
            return new e14.q(str).a();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
