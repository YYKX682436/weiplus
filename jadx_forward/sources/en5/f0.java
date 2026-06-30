package en5;

/* loaded from: classes5.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f336931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f336932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f336933f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f336934g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f336935h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f336936i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336937m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f336938n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f336939o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yz5.l f336940p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, fn5.n0 n0Var, n0.e5 e5Var, yz5.l lVar, int i17, n0.e5 e5Var2, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var2, yz5.l lVar2) {
        super(1);
        this.f336931d = h0Var;
        this.f336932e = n0Var;
        this.f336933f = e5Var;
        this.f336934g = lVar;
        this.f336935h = i17;
        this.f336936i = e5Var2;
        this.f336937m = str;
        this.f336938n = e0Var;
        this.f336939o = e0Var2;
        this.f336940p = lVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        fn5.p0 p0Var;
        fn5.p0 p0Var2;
        e0.u0 LazyColumn = (e0.u0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(LazyColumn, "$this$LazyColumn");
        java.util.ArrayList<aq.d> arrayList = (java.util.ArrayList) this.f336931d.f391656d;
        if (arrayList != null) {
            for (aq.d dVar : arrayList) {
                boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.f94382a, "TOP");
                java.lang.String str = null;
                fn5.n0 n0Var = this.f336932e;
                if (b17) {
                    if (n0Var != null) {
                        n0.e5 e5Var = this.f336933f;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((e5Var == null || (p0Var2 = (fn5.p0) e5Var.mo128745x754a37bb()) == null) ? null : p0Var2.name(), "PERSON") && n0Var.B) {
                            e0.r0.a(LazyColumn, null, null, u0.j.c(-1515207373, true, new en5.y(n0Var, this.f336934g)), 3, null);
                        } else {
                            if (e5Var != null && (p0Var = (fn5.p0) e5Var.mo128745x754a37bb()) != null) {
                                str = p0Var.name();
                            }
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "NORMAL")) {
                                e0.r0.a(LazyColumn, null, null, u0.j.c(-2055083620, true, new en5.z(n0Var)), 3, null);
                            }
                        }
                    } else {
                        e0.r0.a(LazyColumn, null, null, u0.j.c(-37512479, true, new en5.a0(this.f336935h)), 3, null);
                    }
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.f94382a, "BOTTOM")) {
                    e0.r0.a(LazyColumn, null, null, u0.j.c(1522667302, true, new en5.b0(this.f336936i, n0Var, this.f336937m)), 3, null);
                } else {
                    u0.a c17 = u0.j.c(-1942636727, true, new en5.c0(dVar));
                    e0.y0 y0Var = (e0.y0) LazyColumn;
                    java.util.List list = y0Var.f327258c;
                    if (list == null) {
                        list = new java.util.ArrayList();
                        y0Var.f327258c = list;
                    }
                    list.add(java.lang.Integer.valueOf(y0Var.f327256a.f91926c));
                    y0Var.a(null, null, c17);
                    e0.r0.a(LazyColumn, null, null, u0.j.c(-416341306, true, new en5.e0(dVar, this.f336938n, this.f336939o, this.f336940p)), 3, null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
