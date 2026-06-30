package oj;

/* loaded from: classes12.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f427203a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f427204b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f427205c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Method f427206d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Class[] f427207e;

    public b0(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        if (cls == null || str == null || str.length() == 0) {
            throw new java.lang.IllegalArgumentException("Both of invoker and fieldName can not be null or nil.");
        }
        this.f427203a = cls;
        this.f427204b = str;
        this.f427207e = clsArr;
    }

    public synchronized java.lang.Object a(java.lang.Object obj, boolean z17, java.lang.Object... objArr) {
        synchronized (this) {
            if (!this.f427205c) {
                for (java.lang.Class cls = this.f427203a; cls != null; cls = cls.getSuperclass()) {
                    try {
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod(this.f427204b, this.f427207e);
                        declaredMethod.setAccessible(true);
                        this.f427206d = declaredMethod;
                        break;
                    } catch (java.lang.Exception unused) {
                    }
                }
                this.f427205c = true;
            }
        }
        java.lang.reflect.Method method = this.f427206d;
        if (method != null) {
            return method.invoke(obj, objArr);
        }
        if (z17) {
            oj.j.f("ReflectFiled", "Field %s is no exists", this.f427204b);
            return null;
        }
        throw new java.lang.NoSuchFieldException("Method " + this.f427204b + " is not exists.");
    }
}
