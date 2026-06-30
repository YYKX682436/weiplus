package um0;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Class f510234a;

    /* renamed from: field_mContext */
    private static java.lang.reflect.Field f76974xf492f227;

    /* renamed from: field_mFastgrabConfigReader */
    private static java.lang.reflect.Field f76975x2e5181f5;

    public static void a(android.app.Activity activity) {
        if ("HUAWEI".equalsIgnoreCase(android.os.Build.MANUFACTURER) && android.os.Build.VERSION.SDK_INT == 24) {
            try {
                if (f510234a == null) {
                    java.lang.Class<?> cls = java.lang.Class.forName("android.rms.iaware.FastgrabConfigReader");
                    f510234a = cls;
                    java.lang.reflect.Field declaredField = cls.getDeclaredField("mFastgrabConfigReader");
                    f76975x2e5181f5 = declaredField;
                    declaredField.setAccessible(true);
                    java.lang.reflect.Field declaredField2 = f510234a.getDeclaredField("mContext");
                    f76974xf492f227 = declaredField2;
                    declaredField2.setAccessible(true);
                }
                java.lang.Object obj = f76975x2e5181f5.get(f510234a);
                if (f76974xf492f227.get(obj) == activity) {
                    f76974xf492f227.set(obj, null);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
