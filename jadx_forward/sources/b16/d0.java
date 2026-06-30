package b16;

/* loaded from: classes16.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.e0 f98679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a16.l f98680e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(b16.e0 e0Var, a16.l lVar) {
        super(1);
        this.f98679d = e0Var;
        this.f98680e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n16.g name = (n16.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        b16.e0 e0Var = this.f98679d;
        boolean contains = ((java.util.Set) ((e26.o) e0Var.f98688r).mo152xb9724478()).contains(name);
        o06.g gVar = e0Var.f98684n;
        a16.l lVar = this.f98680e;
        if (contains) {
            x06.w wVar = lVar.f82182a.f82149b;
            n16.b f17 = v16.f.f(gVar);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
            e16.g a17 = ((t06.d) wVar).a(new x06.v(f17.d(name), null, e0Var.f98685o, 2, null));
            if (a17 != null) {
                a16.l lVar2 = this.f98680e;
                b16.r rVar = new b16.r(lVar2, e0Var.f98684n, a17, null, 8, null);
                ((x06.x) lVar2.f82182a.f82166s).getClass();
                return rVar;
            }
        } else if (((java.util.Set) ((e26.o) e0Var.f98689s).mo152xb9724478()).contains(name)) {
            java.util.List b17 = kz5.b0.b();
            ((w16.a) lVar.f82182a.f82171x).c(lVar, gVar, name, b17);
            java.util.List a18 = kz5.b0.a(b17);
            int d17 = ((kz5.l) a18).d();
            if (d17 != 0) {
                if (d17 == 1) {
                    return (o06.g) kz5.n0.z0(a18);
                }
                throw new java.lang.IllegalStateException(("Multiple classes with same name are generated: " + a18).toString());
            }
        } else {
            e16.n nVar = (e16.n) ((java.util.Map) ((e26.o) e0Var.f98690t).mo152xb9724478()).get(name);
            if (nVar != null) {
                e26.x b18 = ((e26.u) lVar.f82182a.f82148a).b(new b16.c0(e0Var));
                a16.d dVar = lVar.f82182a;
                return r06.e0.u0(dVar.f82148a, e0Var.f98684n, name, b18, a16.i.a(lVar, nVar), ((t06.m) dVar.f82157j).a(nVar));
            }
        }
        return null;
    }
}
