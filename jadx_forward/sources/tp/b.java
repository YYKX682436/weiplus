package tp;

/* loaded from: classes7.dex */
public class b implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f502538a;

    public b(android.view.WindowManager windowManager) {
        this.f502538a = windowManager;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        boolean z17 = false;
        if (method.getName().equals("removeViewImmediate")) {
            java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
            if (stackTrace.length > 0) {
                int length = stackTrace.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        break;
                    }
                    if (stackTrace[i17].getMethodName().equals("handleDestroyActivity")) {
                        z17 = true;
                        break;
                    }
                    i17++;
                }
            }
        }
        java.lang.Object obj2 = this.f502538a;
        if (!z17) {
            return method.invoke(obj2, objArr);
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WindowManagerInvocationHandler", "removeViewImmediate");
            return method.invoke(obj2, objArr);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WindowManagerInvocationHandler", "catch it");
            return null;
        }
    }
}
