package b16;

/* loaded from: classes16.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.f1 f98786d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(b16.f1 f1Var) {
        super(0);
        this.f98786d = f1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        y16.i kindFilter = y16.i.f540486m;
        y16.s.f540507a.getClass();
        y16.p pVar = y16.p.f540504d;
        b16.f1 f1Var = this.f98786d;
        f1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kindFilter, "kindFilter");
        w06.d dVar = w06.d.f523482g;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        if (kindFilter.a(y16.i.f540485l)) {
            for (n16.g gVar : f1Var.h(kindFilter, pVar)) {
                if (((java.lang.Boolean) pVar.mo146xb9724478(gVar)).booleanValue()) {
                    o26.a.a(linkedHashSet, f1Var.e(gVar, dVar));
                }
            }
        }
        boolean a17 = kindFilter.a(y16.i.f540482i);
        java.util.List list = kindFilter.f540493a;
        if (a17 && !list.contains(y16.d.f540466a)) {
            for (n16.g gVar2 : f1Var.i(kindFilter, pVar)) {
                if (((java.lang.Boolean) pVar.mo146xb9724478(gVar2)).booleanValue()) {
                    linkedHashSet.addAll(f1Var.b(gVar2, dVar));
                }
            }
        }
        if (kindFilter.a(y16.i.f540483j) && !list.contains(y16.d.f540466a)) {
            for (n16.g gVar3 : f1Var.o(kindFilter, pVar)) {
                if (((java.lang.Boolean) pVar.mo146xb9724478(gVar3)).booleanValue()) {
                    linkedHashSet.addAll(f1Var.c(gVar3, dVar));
                }
            }
        }
        return kz5.n0.S0(linkedHashSet);
    }
}
