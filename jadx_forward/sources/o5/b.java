package o5;

/* loaded from: classes13.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.reflect.Method f424589a;

    /* renamed from: b, reason: collision with root package name */
    public static final o5.a f424590b = new o5.a();

    public static boolean a(android.view.ViewGroup viewGroup, java.lang.String... strArr) {
        if (strArr.length == 0) {
            return false;
        }
        boolean z17 = false;
        for (java.lang.String str : strArr) {
            try {
                z17 = java.lang.Class.forName(str).isInstance(viewGroup);
            } catch (java.lang.Exception unused) {
            }
            if (z17) {
                break;
            }
        }
        return z17;
    }
}
