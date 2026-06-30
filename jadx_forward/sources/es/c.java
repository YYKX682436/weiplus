package es;

/* loaded from: classes13.dex */
public class c implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f337799a;

    public c(es.a aVar) {
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.ref.WeakReference weakReference = this.f337799a;
        boolean z17 = false;
        if (weakReference == null) {
            kd.c.c("MicroMsg.ActivityUtil", "swipe invoke fail, callbackRef NULL!", new java.lang.Object[0]);
            return null;
        }
        es.b bVar = (es.b) weakReference.get();
        if (bVar == null) {
            kd.c.c("MicroMsg.ActivityUtil", "swipe invoke fail, callback NULL!", new java.lang.Object[0]);
            return null;
        }
        if (objArr != null && objArr.length > 0) {
            java.lang.Object obj2 = objArr[0];
            if (obj2 instanceof java.lang.Boolean) {
                z17 = ((java.lang.Boolean) obj2).booleanValue();
            }
        }
        es.t tVar = (es.t) bVar;
        tVar.f337811c.B.post(new es.s(tVar, z17));
        return null;
    }
}
