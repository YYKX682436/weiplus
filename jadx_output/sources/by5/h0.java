package by5;

/* loaded from: classes13.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Class f36475a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Class[] f36476b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.reflect.Constructor f36477c;

    public h0(java.lang.Class cls, java.lang.Class... clsArr) {
        this.f36475a = cls;
        this.f36476b = clsArr;
        this.f36477c = null;
        if (cls == null) {
            return;
        }
        try {
            try {
                this.f36477c = cls.getConstructor(clsArr);
            } catch (java.lang.NoSuchMethodException e17) {
                by5.c4.c("ReflectConstructor", "init error:" + e17.getLocalizedMessage());
            }
        } catch (java.lang.NoSuchMethodException unused) {
            java.lang.reflect.Constructor declaredConstructor = this.f36475a.getDeclaredConstructor(this.f36476b);
            this.f36477c = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
    }

    public java.lang.Object a(java.lang.Object... objArr) {
        java.lang.reflect.Constructor constructor = this.f36477c;
        if (constructor == null) {
            throw new java.lang.UnsupportedOperationException(toString());
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

    public java.lang.String toString() {
        java.lang.reflect.Constructor constructor = this.f36477c;
        if (constructor != null) {
            return constructor.toString();
        }
        if (this.f36475a == null) {
            return "";
        }
        return "" + this.f36475a.toString();
    }
}
