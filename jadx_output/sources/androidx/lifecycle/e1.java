package androidx.lifecycle;

/* loaded from: classes5.dex */
public class e1 extends androidx.lifecycle.h1 {

    /* renamed from: c, reason: collision with root package name */
    public static androidx.lifecycle.e1 f11621c;

    /* renamed from: b, reason: collision with root package name */
    public final android.app.Application f11622b;

    public e1(android.app.Application application) {
        this.f11622b = application;
    }

    @Override // androidx.lifecycle.h1, androidx.lifecycle.f1
    public androidx.lifecycle.c1 a(java.lang.Class cls) {
        if (!androidx.lifecycle.a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            return (androidx.lifecycle.c1) cls.getConstructor(android.app.Application.class).newInstance(this.f11622b);
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e17);
        } catch (java.lang.InstantiationException e18) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e18);
        } catch (java.lang.NoSuchMethodException e19) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e19);
        } catch (java.lang.reflect.InvocationTargetException e27) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e27);
        }
    }
}
