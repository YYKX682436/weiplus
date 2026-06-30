package dh3;

/* loaded from: classes5.dex */
public final class b implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f314021a;

    public b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f314021a = f9Var;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        java.util.Map.Entry it = (java.util.Map.Entry) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.getValue(), dh3.c.f314022a.h(this.f314021a));
    }
}
