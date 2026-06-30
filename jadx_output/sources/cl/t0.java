package cl;

/* loaded from: classes7.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f42763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42764e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f42765f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42766g;

    public t0(cl.q0 q0Var, java.lang.Object obj, java.lang.String str, java.lang.Class cls) {
        this.f42766g = q0Var;
        this.f42763d = obj;
        this.f42764e = str;
        this.f42765f = cls;
    }

    @Override // java.lang.Runnable
    public void run() {
        cl.q0 q0Var = this.f42766g;
        q0Var.getClass();
        java.lang.Object obj = this.f42763d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Class<?> cls = obj.getClass(); cls != java.lang.Object.class; cls = cls.getSuperclass()) {
            java.util.Iterator it = new java.util.ArrayList(java.util.Arrays.asList(cls.getDeclaredMethods())).iterator();
            while (it.hasNext()) {
                java.lang.reflect.Method method = (java.lang.reflect.Method) it.next();
                java.lang.Class<? extends java.lang.annotation.Annotation> cls2 = this.f42765f;
                if (cls2 == null || method.isAnnotationPresent(cls2)) {
                    arrayList.add(method);
                }
            }
        }
        com.eclipsesource.mmv8.V8Object newV8Object = q0Var.f().newV8Object();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.reflect.Method method2 = (java.lang.reflect.Method) it6.next();
            newV8Object.registerJavaMethod(obj, method2.getName(), method2.getName(), method2.getParameterTypes());
        }
        q0Var.f().add(this.f42764e, newV8Object);
        newV8Object.release();
    }
}
