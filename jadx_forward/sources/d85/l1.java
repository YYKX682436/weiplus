package d85;

/* loaded from: classes12.dex */
public final class l1 implements java.lang.reflect.InvocationHandler {

    /* renamed from: c, reason: collision with root package name */
    public static final d85.k1 f308747c = new d85.k1(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.os.IBinder f308748a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f308749b;

    public l1(java.lang.String str, java.lang.String str2, d85.m1 m1Var) {
        try {
            d85.k1 k1Var = f308747c;
            android.os.IBinder b17 = k1Var.b(str);
            this.f308748a = b17;
            this.f308749b = d85.k1.a(k1Var, str, str2, b17, m1Var);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SystemServiceBinderHooker", "catch exception on init, e:" + th6.getMessage());
        }
    }

    public final android.os.IBinder a() {
        java.lang.Class<?> cls = java.lang.Class.forName("android.os.ServiceManager");
        java.lang.ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            throw new java.lang.IllegalStateException("Can not get ClassLoader of ".concat(cls.getName()));
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(classLoader, new java.lang.Class[]{android.os.IBinder.class}, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newProxyInstance, "null cannot be cast to non-null type android.os.IBinder");
        return (android.os.IBinder) newProxyInstance;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proxy, "proxy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(method, "method");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("queryLocalInterface", method.getName())) {
            return this.f308749b;
        }
        android.os.IBinder iBinder = this.f308748a;
        return objArr == null ? method.invoke(iBinder, new java.lang.Object[0]) : method.invoke(iBinder, java.util.Arrays.copyOf(objArr, objArr.length));
    }
}
