package by5;

/* loaded from: classes13.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f36483a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Class f36484b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f36485c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Class[] f36486d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.reflect.Method f36487e;

    public i0(java.lang.Object obj, java.lang.String str, java.lang.Class... clsArr) {
        a(obj, null, str, clsArr);
    }

    public boolean a(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        this.f36483a = obj;
        if (cls == null) {
            cls = obj != null ? obj.getClass() : null;
        }
        this.f36484b = cls;
        this.f36485c = str;
        this.f36486d = clsArr;
        this.f36487e = null;
        if (cls == null) {
            return false;
        }
        try {
            this.f36487e = cls.getMethod(str, clsArr);
        } catch (java.lang.NoSuchMethodException unused) {
            for (java.lang.Class cls2 = this.f36484b; cls2 != null; cls2 = cls2.getSuperclass()) {
                try {
                    java.lang.reflect.Method declaredMethod = cls2.getDeclaredMethod(this.f36485c, this.f36486d);
                    this.f36487e = declaredMethod;
                    declaredMethod.setAccessible(true);
                    by5.c4.f("ReflectMethod", "init, find method " + this.f36485c + " in class " + this.f36484b);
                    break;
                } catch (java.lang.NoSuchMethodException e17) {
                    by5.c4.f("ReflectMethod", "init error:" + e17);
                }
            }
        }
        return this.f36487e != null;
    }

    public java.lang.Object b(java.lang.Object... objArr) {
        java.lang.reflect.Method method = this.f36487e;
        if (method == null) {
            throw new java.lang.UnsupportedOperationException(toString());
        }
        try {
            return method.invoke(this.f36483a, objArr);
        } catch (java.lang.IllegalAccessException e17) {
            e = e17;
            throw new java.util.concurrent.RejectedExecutionException(e);
        } catch (java.lang.IllegalArgumentException e18) {
            throw e18;
        } catch (java.lang.NullPointerException e19) {
            e = e19;
            throw new java.util.concurrent.RejectedExecutionException(e);
        } catch (java.lang.reflect.InvocationTargetException e27) {
            throw new java.lang.RuntimeException(e27.getCause());
        }
    }

    public java.lang.String toString() {
        java.lang.reflect.Method method = this.f36487e;
        if (method != null) {
            return method.toString();
        }
        java.lang.String str = "";
        if (this.f36484b != null) {
            str = "" + this.f36484b + ".";
        }
        if (this.f36485c == null) {
            return str;
        }
        return str + this.f36485c;
    }

    public i0(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        a(null, cls, str, clsArr);
    }
}
