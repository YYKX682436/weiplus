package d26;

/* loaded from: classes16.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.n f307551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d26.x f307552e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d26.n nVar, d26.x xVar) {
        super(1);
        this.f307551d = nVar;
        this.f307552e = xVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n16.g name = (n16.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        d26.n nVar = this.f307551d;
        i16.c0 c0Var = (i16.c0) ((java.util.LinkedHashMap) nVar.f307562a).get(name);
        if (c0Var == null) {
            return null;
        }
        d26.x xVar = this.f307552e;
        return r06.e0.u0(xVar.f307593r.f99048a.f99016a, xVar, name, nVar.f307564c, new d26.a(xVar.f307593r.f99048a.f99016a, new d26.k(xVar, c0Var)), o06.x1.f423537a);
    }
}
