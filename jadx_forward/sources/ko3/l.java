package ko3;

/* loaded from: classes13.dex */
public class l implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ko3.m f391515a;

    public l(ko3.m mVar) {
        this.f391515a = mVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        boolean equals = ko3.u.f391544q.equals(method.getName());
        ko3.m mVar = this.f391515a;
        if (equals) {
            return mVar.f391521d.f391558e;
        }
        try {
            return method.invoke(mVar.f391525a.asBinder(), objArr);
        } catch (java.lang.reflect.InvocationTargetException e17) {
            java.lang.Throwable targetException = e17.getTargetException();
            java.lang.Class<?>[] exceptionTypes = method.getExceptionTypes();
            if (exceptionTypes != null && exceptionTypes.length > 0) {
                for (java.lang.Class<?> cls : method.getExceptionTypes()) {
                    if (cls.isAssignableFrom(targetException.getClass())) {
                        throw targetException;
                    }
                }
            }
            ko3.u.d(mVar.f391521d, targetException);
            return ko3.u.a(mVar.f391521d, method);
        } catch (java.lang.Throwable th6) {
            ko3.u.d(mVar.f391521d, th6);
            return ko3.u.a(mVar.f391521d, method);
        }
    }
}
