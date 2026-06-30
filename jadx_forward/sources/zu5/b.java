package zu5;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f557425a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.reflect.Method f557426b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Class[] f557427c;

    public b(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        if (cls == null || str == null || str.length() == 0) {
            throw new java.lang.IllegalArgumentException("Both of invoker and fieldName can not be null or nil.");
        }
        this.f557427c = clsArr;
    }

    public synchronized java.lang.Object a(java.lang.Object obj, boolean z17, java.lang.Object... objArr) {
        synchronized (this) {
            if (!this.f557425a) {
                for (java.lang.Class<android.os.Message> cls = android.os.Message.class; cls != null; cls = cls.getSuperclass()) {
                    try {
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("recycleUnchecked", this.f557427c);
                        declaredMethod.setAccessible(true);
                        this.f557426b = declaredMethod;
                        break;
                    } catch (java.lang.Exception unused) {
                    }
                }
                this.f557425a = true;
            }
        }
        java.lang.reflect.Method method = this.f557426b;
        if (method != null) {
            return method.invoke(obj, objArr);
        }
        if (z17) {
            ku5.o.f394132c.w("ReflectFiled", "Field %s is no exists", "recycleUnchecked");
            return null;
        }
        throw new java.lang.NoSuchFieldException("Method recycleUnchecked is not exists.");
    }
}
