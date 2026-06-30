package wh;

/* loaded from: classes12.dex */
public class y1 implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wh.a2 f527433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f527434b;

    public y1(wh.a2 a2Var, java.lang.Object obj) {
        this.f527433a = a2Var;
        this.f527434b = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.Object obj2 = this.f527434b;
        wh.a2 a2Var = this.f527433a;
        if (a2Var != null) {
            a2Var.b(method, objArr);
            java.lang.Object a17 = a2Var.a(obj2, method, objArr);
            if (a17 != null) {
                return a17;
            }
        }
        return method.invoke(obj2, objArr);
    }
}
