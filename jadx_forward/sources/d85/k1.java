package d85;

/* loaded from: classes12.dex */
public final class k1 {
    public k1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final java.lang.Object a(d85.k1 k1Var, java.lang.String str, java.lang.String str2, android.os.IBinder iBinder, d85.m1 m1Var) {
        k1Var.getClass();
        java.lang.Class<?> cls = java.lang.Class.forName(str2);
        java.lang.Class<?> cls2 = java.lang.Class.forName(str2 + "$Stub");
        java.lang.ClassLoader classLoader = cls2.getClassLoader();
        if (classLoader == null) {
            throw new java.lang.IllegalStateException("get service manager ClassLoader fail!");
        }
        java.lang.Object invoke = cls2.getDeclaredMethod("asInterface", android.os.IBinder.class).invoke(null, iBinder);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(invoke);
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(classLoader, new java.lang.Class[]{android.os.IBinder.class, android.os.IInterface.class, cls}, new d85.n1(str, str2, m1Var, invoke));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(newProxyInstance);
        return newProxyInstance;
    }

    public final android.os.IBinder b(java.lang.String str) {
        java.lang.Class<?> cls = java.lang.Class.forName("android.os.ServiceManager");
        java.lang.reflect.Field declaredField = cls.getDeclaredField("sCache");
        declaredField.setAccessible(true);
        java.lang.Object obj = declaredField.get(null);
        java.util.Map map = p3321xbce91901.jvm.p3324x21ffc6bd.m0.h(obj) ? (java.util.Map) obj : null;
        if (map != null) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("getCurrentBinder", "isContaints " + str + " : " + (map != null ? java.lang.Boolean.valueOf(map.containsKey(str)) : null));
        java.lang.Object invoke = cls.getDeclaredMethod("getService", java.lang.String.class).invoke(null, str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke, "null cannot be cast to non-null type android.os.IBinder");
        return (android.os.IBinder) invoke;
    }
}
