package wj;

/* loaded from: classes8.dex */
public final class v implements java.util.function.BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f528067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f528068b;

    public v(yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        this.f528067a = lVar;
        this.f528068b = c0Var;
    }

    @Override // java.util.function.BiFunction
    public java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Set set = (java.util.Set) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((wj.t0) obj, "<anonymous parameter 0>");
        yz5.l lVar = this.f528067a;
        if (set == null) {
            return kz5.p1.e(lVar);
        }
        set.add(lVar);
        this.f528068b.f391645d = false;
        return set;
    }
}
