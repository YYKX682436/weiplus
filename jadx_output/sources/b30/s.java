package b30;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Field f17579a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Field f17580b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17581c;

    public s(kotlin.jvm.internal.i iVar) {
        try {
            java.lang.Object invoke = java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, new java.lang.Class[0].getClass()).invoke(java.lang.Class.class, "getDeclaredField", new java.lang.Class[]{java.lang.String.class});
            kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            java.lang.reflect.Method method = (java.lang.reflect.Method) invoke;
            java.lang.Object invoke2 = method.invoke(android.view.View.class, "mListenerInfo");
            kotlin.jvm.internal.o.e(invoke2, "null cannot be cast to non-null type java.lang.reflect.Field");
            java.lang.reflect.Field field = (java.lang.reflect.Field) invoke2;
            field.setAccessible(true);
            this.f17579a = field;
            java.lang.Object invoke3 = method.invoke(java.lang.Class.forName("android.view.View$ListenerInfo"), "mOnTouchListener");
            kotlin.jvm.internal.o.e(invoke3, "null cannot be cast to non-null type java.lang.reflect.Field");
            java.lang.reflect.Field field2 = (java.lang.reflect.Field) invoke3;
            field2.setAccessible(true);
            this.f17580b = field2;
            this.f17581c = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ViewTouchBinderHelper", "Failed to init touch listener reflection", e17);
        }
    }

    public final android.view.View.OnTouchListener a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        try {
            java.lang.reflect.Field field = this.f17579a;
            java.lang.Object obj = field != null ? field.get(view) : null;
            if (obj == null) {
                return null;
            }
            java.lang.reflect.Field field2 = this.f17580b;
            java.lang.Object obj2 = field2 != null ? field2.get(obj) : null;
            if (obj2 instanceof android.view.View.OnTouchListener) {
                return (android.view.View.OnTouchListener) obj2;
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
