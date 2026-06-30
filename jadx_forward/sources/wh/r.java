package wh;

/* loaded from: classes12.dex */
public abstract class r {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f527392b;

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f527391a = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final wh.b2 f527393c = new wh.b2("bluetooth_manager", "android.bluetooth.IBluetoothManager", new wh.n());

    public static java.lang.Object a(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.Object obj2;
        try {
            obj2 = method.invoke(obj, objArr);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.battery.BluetoothHooker", th6, "reflect invocation fail", new java.lang.Object[0]);
            obj2 = null;
        }
        if (obj2 != null) {
            return obj2;
        }
        java.lang.Class<?> returnType = method.getReturnType();
        if (returnType == null || !returnType.isPrimitive()) {
            return null;
        }
        if (returnType == java.lang.Byte.TYPE || returnType == java.lang.Short.TYPE || returnType == java.lang.Integer.TYPE) {
            return 0;
        }
        if (returnType == java.lang.Long.TYPE) {
            return 0L;
        }
        if (returnType == java.lang.Float.TYPE) {
            return java.lang.Float.valueOf(0.0f);
        }
        if (returnType == java.lang.Double.TYPE) {
            return java.lang.Double.valueOf(0.0d);
        }
        if (returnType == java.lang.Character.TYPE) {
            return (char) 0;
        }
        if (returnType == java.lang.Boolean.TYPE) {
            return java.lang.Boolean.FALSE;
        }
        return null;
    }
}
