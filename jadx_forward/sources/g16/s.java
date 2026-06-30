package g16;

/* loaded from: classes15.dex */
public final class s extends g16.r {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f349188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g16.t f349189c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o06.g f349190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n16.b f349191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f349192f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o06.x1 f349193g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(g16.t tVar, o06.g gVar, n16.b bVar, java.util.List list, o06.x1 x1Var) {
        super(tVar);
        this.f349189c = tVar;
        this.f349190d = gVar;
        this.f349191e = bVar;
        this.f349192f = list;
        this.f349193g = x1Var;
        this.f349188b = new java.util.HashMap();
    }

    @Override // g16.m0
    public void a() {
        java.util.HashMap arguments = this.f349188b;
        g16.t tVar = this.f349189c;
        tVar.getClass();
        n16.b annotationClassId = this.f349191e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotationClassId, "annotationClassId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arguments, "arguments");
        boolean z17 = false;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(annotationClassId, k06.a.f384694b)) {
            java.lang.Object obj = arguments.get(n16.g.k("value"));
            t16.x xVar = obj instanceof t16.x ? (t16.x) obj : null;
            if (xVar != null) {
                java.lang.Object obj2 = xVar.f496146a;
                t16.v vVar = obj2 instanceof t16.v ? (t16.v) obj2 : null;
                if (vVar != null) {
                    z17 = tVar.p(vVar.f496161a.f496144a);
                }
            }
        }
        if (z17 || tVar.p(annotationClassId)) {
            return;
        }
        this.f349192f.add(new p06.d(this.f349190d.k(), arguments, this.f349193g));
    }

    @Override // g16.r
    public void g(n16.g gVar, t16.g value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        if (gVar != null) {
            this.f349188b.put(gVar, value);
        }
    }
}
