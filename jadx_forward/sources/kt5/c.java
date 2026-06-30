package kt5;

/* loaded from: classes13.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f393582a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.reflect.Method f393583b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f393584c;

    static {
        java.lang.Object obj;
        java.lang.reflect.Method declaredMethod;
        java.lang.reflect.Method method = null;
        try {
            try {
                obj = kt5.f.b(kt5.f.a(null, "libcore.io.Libcore", null), "os", null);
            } catch (java.lang.Throwable unused) {
                f393584c = false;
                return;
            }
        } catch (java.lang.Throwable th6) {
            ot5.g.e(th6);
            obj = null;
        }
        f393582a = obj;
        java.lang.Class<?>[] clsArr = {java.lang.String.class};
        try {
            java.lang.Class a17 = kt5.f.a(null, "libcore.io.Os", null);
            if (a17 != null) {
                try {
                    if (!android.text.TextUtils.isEmpty("stat") && (declaredMethod = a17.getDeclaredMethod("stat", clsArr)) != null) {
                        declaredMethod.setAccessible(true);
                        method = declaredMethod;
                    }
                } catch (java.lang.Throwable th7) {
                    ot5.g.e(th7);
                }
            }
        } catch (java.lang.Throwable th8) {
            ot5.g.e(th8);
        }
        f393583b = method;
        f393584c = true;
    }
}
