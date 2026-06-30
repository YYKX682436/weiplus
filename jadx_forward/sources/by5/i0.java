package by5;

/* loaded from: classes13.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f118016a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Class f118017b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f118018c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Class[] f118019d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.reflect.Method f118020e;

    public i0(java.lang.Object obj, java.lang.String str, java.lang.Class... clsArr) {
        a(obj, null, str, clsArr);
    }

    public boolean a(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        this.f118016a = obj;
        if (cls == null) {
            cls = obj != null ? obj.getClass() : null;
        }
        this.f118017b = cls;
        this.f118018c = str;
        this.f118019d = clsArr;
        this.f118020e = null;
        if (cls == null) {
            return false;
        }
        try {
            this.f118020e = cls.getMethod(str, clsArr);
        } catch (java.lang.NoSuchMethodException unused) {
            for (java.lang.Class cls2 = this.f118017b; cls2 != null; cls2 = cls2.getSuperclass()) {
                try {
                    java.lang.reflect.Method declaredMethod = cls2.getDeclaredMethod(this.f118018c, this.f118019d);
                    this.f118020e = declaredMethod;
                    declaredMethod.setAccessible(true);
                    by5.c4.f("ReflectMethod", "init, find method " + this.f118018c + " in class " + this.f118017b);
                    break;
                } catch (java.lang.NoSuchMethodException e17) {
                    by5.c4.f("ReflectMethod", "init error:" + e17);
                }
            }
        }
        return this.f118020e != null;
    }

    public java.lang.Object b(java.lang.Object... objArr) {
        java.lang.reflect.Method method = this.f118020e;
        if (method == null) {
            throw new java.lang.UnsupportedOperationException(m13591x9616526c());
        }
        try {
            return method.invoke(this.f118016a, objArr);
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

    /* renamed from: toString */
    public java.lang.String m13591x9616526c() {
        java.lang.reflect.Method method = this.f118020e;
        if (method != null) {
            return method.toString();
        }
        java.lang.String str = "";
        if (this.f118017b != null) {
            str = "" + this.f118017b + ".";
        }
        if (this.f118018c == null) {
            return str;
        }
        return str + this.f118018c;
    }

    public i0(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        a(null, cls, str, clsArr);
    }
}
