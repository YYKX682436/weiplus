package cl;

/* loaded from: classes7.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f124296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f124298f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124299g;

    public t0(cl.q0 q0Var, java.lang.Object obj, java.lang.String str, java.lang.Class cls) {
        this.f124299g = q0Var;
        this.f124296d = obj;
        this.f124297e = str;
        this.f124298f = cls;
    }

    @Override // java.lang.Runnable
    public void run() {
        cl.q0 q0Var = this.f124299g;
        q0Var.getClass();
        java.lang.Object obj = this.f124296d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Class<?> cls = obj.getClass(); cls != java.lang.Object.class; cls = cls.getSuperclass()) {
            java.util.Iterator it = new java.util.ArrayList(java.util.Arrays.asList(cls.getDeclaredMethods())).iterator();
            while (it.hasNext()) {
                java.lang.reflect.Method method = (java.lang.reflect.Method) it.next();
                java.lang.Class<? extends java.lang.annotation.Annotation> cls2 = this.f124298f;
                if (cls2 == null || method.isAnnotationPresent(cls2)) {
                    arrayList.add(method);
                }
            }
        }
        com.p159x477cd522.p160x333422.C1477x4679881 mo16400x4b75a221 = q0Var.f().mo16400x4b75a221();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.reflect.Method method2 = (java.lang.reflect.Method) it6.next();
            mo16400x4b75a221.m16441x1af320a6(obj, method2.getName(), method2.getName(), method2.getParameterTypes());
        }
        q0Var.f().add(this.f124297e, mo16400x4b75a221);
        mo16400x4b75a221.mo15825x41012807();
    }
}
