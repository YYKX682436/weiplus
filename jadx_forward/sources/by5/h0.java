package by5;

/* loaded from: classes13.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Class f118008a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Class[] f118009b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.reflect.Constructor f118010c;

    public h0(java.lang.Class cls, java.lang.Class... clsArr) {
        this.f118008a = cls;
        this.f118009b = clsArr;
        this.f118010c = null;
        if (cls == null) {
            return;
        }
        try {
            try {
                this.f118010c = cls.getConstructor(clsArr);
            } catch (java.lang.NoSuchMethodException e17) {
                by5.c4.c("ReflectConstructor", "init error:" + e17.getLocalizedMessage());
            }
        } catch (java.lang.NoSuchMethodException unused) {
            java.lang.reflect.Constructor declaredConstructor = this.f118008a.getDeclaredConstructor(this.f118009b);
            this.f118010c = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
    }

    public java.lang.Object a(java.lang.Object... objArr) {
        java.lang.reflect.Constructor constructor = this.f118010c;
        if (constructor == null) {
            throw new java.lang.UnsupportedOperationException(m13590x9616526c());
        }
        try {
            return constructor.newInstance(objArr);
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.util.concurrent.RejectedExecutionException(e17);
        } catch (java.lang.IllegalArgumentException e18) {
            throw e18;
        } catch (java.lang.InstantiationException e19) {
            throw new java.util.concurrent.RejectedExecutionException(e19);
        } catch (java.lang.reflect.InvocationTargetException e27) {
            throw new java.lang.RuntimeException(e27.getCause());
        }
    }

    /* renamed from: toString */
    public java.lang.String m13590x9616526c() {
        java.lang.reflect.Constructor constructor = this.f118010c;
        if (constructor != null) {
            return constructor.toString();
        }
        if (this.f118008a == null) {
            return "";
        }
        return "" + this.f118008a.toString();
    }
}
