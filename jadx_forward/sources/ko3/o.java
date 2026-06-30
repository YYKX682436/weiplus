package ko3;

/* loaded from: classes13.dex */
public abstract class o implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.IInterface f391525a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ko3.u f391526b;

    public o(ko3.u uVar, android.os.IInterface iInterface) {
        this.f391526b = uVar;
        this.f391525a = iInterface;
    }

    public android.os.IBinder a() {
        return this.f391525a.asBinder();
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        ko3.u uVar = this.f391526b;
        try {
            return "asBinder".equals(method.getName()) ? a() : method.invoke(this.f391525a, objArr);
        } catch (java.lang.reflect.InvocationTargetException e17) {
            java.lang.Throwable targetException = e17.getTargetException();
            if (targetException instanceof java.lang.RuntimeException) {
                throw targetException;
            }
            java.lang.Class<?>[] exceptionTypes = method.getExceptionTypes();
            if (exceptionTypes != null && exceptionTypes.length > 0) {
                for (java.lang.Class<?> cls : method.getExceptionTypes()) {
                    if (cls.isAssignableFrom(targetException.getClass())) {
                        throw targetException;
                    }
                }
            }
            ko3.u.d(uVar, targetException);
            return ko3.u.a(uVar, method);
        } catch (java.lang.Throwable th6) {
            ko3.u.d(uVar, th6);
            return ko3.u.a(uVar, method);
        }
    }
}
