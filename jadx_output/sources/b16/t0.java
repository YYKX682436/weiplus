package b16;

/* loaded from: classes16.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.f1 f17253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(b16.f1 f1Var) {
        super(0);
        this.f17253d = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        y16.i kindFilter = y16.i.f458953m;
        y16.s.f458974a.getClass();
        y16.p pVar = y16.p.f458971d;
        b16.f1 f1Var = this.f17253d;
        f1Var.getClass();
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        w06.d dVar = w06.d.f441949g;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        if (kindFilter.a(y16.i.f458952l)) {
            for (n16.g gVar : f1Var.h(kindFilter, pVar)) {
                if (((java.lang.Boolean) pVar.invoke(gVar)).booleanValue()) {
                    o26.a.a(linkedHashSet, f1Var.e(gVar, dVar));
                }
            }
        }
        boolean a17 = kindFilter.a(y16.i.f458949i);
        java.util.List list = kindFilter.f458960a;
        if (a17 && !list.contains(y16.d.f458933a)) {
            for (n16.g gVar2 : f1Var.i(kindFilter, pVar)) {
                if (((java.lang.Boolean) pVar.invoke(gVar2)).booleanValue()) {
                    linkedHashSet.addAll(f1Var.b(gVar2, dVar));
                }
            }
        }
        if (kindFilter.a(y16.i.f458950j) && !list.contains(y16.d.f458933a)) {
            for (n16.g gVar3 : f1Var.o(kindFilter, pVar)) {
                if (((java.lang.Boolean) pVar.invoke(gVar3)).booleanValue()) {
                    linkedHashSet.addAll(f1Var.c(gVar3, dVar));
                }
            }
        }
        return kz5.n0.S0(linkedHashSet);
    }
}
