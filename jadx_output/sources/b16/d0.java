package b16;

/* loaded from: classes16.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.e0 f17146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a16.l f17147e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(b16.e0 e0Var, a16.l lVar) {
        super(1);
        this.f17146d = e0Var;
        this.f17147e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n16.g name = (n16.g) obj;
        kotlin.jvm.internal.o.g(name, "name");
        b16.e0 e0Var = this.f17146d;
        boolean contains = ((java.util.Set) ((e26.o) e0Var.f17155r).invoke()).contains(name);
        o06.g gVar = e0Var.f17151n;
        a16.l lVar = this.f17147e;
        if (contains) {
            x06.w wVar = lVar.f649a.f616b;
            n16.b f17 = v16.f.f(gVar);
            kotlin.jvm.internal.o.d(f17);
            e16.g a17 = ((t06.d) wVar).a(new x06.v(f17.d(name), null, e0Var.f17152o, 2, null));
            if (a17 != null) {
                a16.l lVar2 = this.f17147e;
                b16.r rVar = new b16.r(lVar2, e0Var.f17151n, a17, null, 8, null);
                ((x06.x) lVar2.f649a.f633s).getClass();
                return rVar;
            }
        } else if (((java.util.Set) ((e26.o) e0Var.f17156s).invoke()).contains(name)) {
            java.util.List b17 = kz5.b0.b();
            ((w16.a) lVar.f649a.f638x).c(lVar, gVar, name, b17);
            java.util.List a18 = kz5.b0.a(b17);
            int d17 = ((kz5.l) a18).d();
            if (d17 != 0) {
                if (d17 == 1) {
                    return (o06.g) kz5.n0.z0(a18);
                }
                throw new java.lang.IllegalStateException(("Multiple classes with same name are generated: " + a18).toString());
            }
        } else {
            e16.n nVar = (e16.n) ((java.util.Map) ((e26.o) e0Var.f17157t).invoke()).get(name);
            if (nVar != null) {
                e26.x b18 = ((e26.u) lVar.f649a.f615a).b(new b16.c0(e0Var));
                a16.d dVar = lVar.f649a;
                return r06.e0.u0(dVar.f615a, e0Var.f17151n, name, b18, a16.i.a(lVar, nVar), ((t06.m) dVar.f624j).a(nVar));
            }
        }
        return null;
    }
}
