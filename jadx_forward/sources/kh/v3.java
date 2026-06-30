package kh;

/* loaded from: classes10.dex */
public final class v3 extends pj.c {
    @Override // pj.c
    public java.lang.Object d(java.lang.Object obj) {
        kh.y3 y3Var;
        java.lang.Object obj2;
        if (obj != null && java.lang.reflect.Proxy.isProxyClass(obj.getClass())) {
            java.lang.reflect.InvocationHandler invocationHandler = java.lang.reflect.Proxy.getInvocationHandler(obj);
            if (invocationHandler instanceof kh.y3) {
                y3Var = (kh.y3) invocationHandler;
                return (y3Var == null || (obj2 = y3Var.f389489b) == null) ? obj : obj2;
            }
        }
        y3Var = null;
        if (y3Var == null) {
            return obj;
        }
    }
}
