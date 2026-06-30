package sf5;

/* loaded from: classes9.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final sf5.a f489161d = new sf5.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.reflect.Method method = java.lang.Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new java.lang.Class[0]);
        method.setAccessible(true);
        java.lang.Object invoke = method.invoke(null, new java.lang.Object[0]);
        java.lang.reflect.Field declaredField = invoke.getClass().getDeclaredField("mInstrumentation");
        declaredField.setAccessible(true);
        java.lang.Object obj = declaredField.get(invoke);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type android.app.Instrumentation");
        android.app.Instrumentation instrumentation = (android.app.Instrumentation) obj;
        java.lang.String str = "rawInstrumentation=" + instrumentation;
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f435466a != null) {
            java.lang.Object[] obj2 = java.util.Arrays.copyOf(objArr, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj2, "obj");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ActivityLifecycleInjector", str, obj2);
        }
        return instrumentation;
    }
}
