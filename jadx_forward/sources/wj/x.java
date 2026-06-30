package wj;

/* loaded from: classes8.dex */
public final class x implements java.util.function.BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f528077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f528078b;

    public x(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.l lVar) {
        this.f528077a = h0Var;
        this.f528078b = lVar;
    }

    @Override // java.util.function.BiFunction
    public java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        yz5.l lVar;
        java.lang.Object obj3;
        java.util.Set callbacks = (java.util.Set) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((wj.t0) obj, "<anonymous parameter 0>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbacks, "callbacks");
        java.util.Iterator it = callbacks.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            lVar = this.f528078b;
            if (!hasNext) {
                obj3 = null;
                break;
            }
            obj3 = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((yz5.l) obj3, lVar)) {
                break;
            }
        }
        this.f528077a.f391656d = obj3;
        callbacks.remove(lVar);
        if (callbacks.isEmpty()) {
            return null;
        }
        return callbacks;
    }
}
