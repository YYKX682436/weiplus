package j0;

/* loaded from: classes14.dex */
public final class i1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2.l f377862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2.r0 f377863e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.e0 f377864f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f377865g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f377866h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f377867i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g2.v f377868m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f377869n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c1.d0 f377870o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(g2.l lVar, g2.r0 r0Var, g2.e0 e0Var, boolean z17, boolean z18, boolean z19, j0.c5 c5Var, g2.v vVar, k0.y0 y0Var, c1.d0 d0Var) {
        super(1);
        this.f377862d = lVar;
        this.f377863e = r0Var;
        this.f377864f = e0Var;
        this.f377865g = z17;
        this.f377866h = z19;
        this.f377867i = c5Var;
        this.f377868m = vVar;
        this.f377869n = y0Var;
        this.f377870o = d0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        y1.p0 semantics = (y1.p0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(semantics, "$this$semantics");
        int i17 = this.f377862d.f349254e;
        f06.v[] vVarArr = y1.m0.f540303a;
        y1.m0.f540312j.a(semantics, vVarArr[11], new g2.k(i17));
        a2.d dVar = this.f377863e.f349277a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<set-?>");
        y1.m0.f540310h.a(semantics, vVarArr[9], dVar);
        g2.e0 e0Var = this.f377864f;
        long j17 = e0Var.f349227b;
        y1.m0.f540311i.a(semantics, vVarArr[10], new a2.m1(j17));
        boolean z17 = this.f377865g;
        if (!z17) {
            y1.m0.a(semantics);
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        j0.c5 c5Var = this.f377867i;
        j0.a1 a1Var = new j0.a1(c5Var);
        y1.o0 o0Var = y1.k.f540282a;
        y1.a aVar = new y1.a(null, a1Var);
        y1.l lVar = (y1.l) semantics;
        lVar.g(o0Var, aVar);
        lVar.g(y1.k.f540289h, new y1.a(null, new j0.b1(c5Var)));
        lVar.g(y1.k.f540288g, new y1.a(null, new j0.c1(this.f377868m, this.f377865g, this.f377864f, this.f377869n, this.f377867i)));
        c1.d0 d0Var = this.f377870o;
        boolean z18 = this.f377866h;
        y1.m0.b(semantics, null, new j0.d1(c5Var, d0Var, z18));
        k0.y0 y0Var = this.f377869n;
        lVar.g(y1.k.f540284c, new y1.a(null, new j0.e1(y0Var)));
        if (!a2.m1.b(e0Var.f349227b)) {
            lVar.g(y1.k.f540290i, new y1.a(null, new j0.f1(y0Var)));
            if (z17 && !z18) {
                lVar.g(y1.k.f540291j, new y1.a(null, new j0.g1(y0Var)));
            }
        }
        if (z17 && !z18) {
            lVar.g(y1.k.f540292k, new y1.a(null, new j0.h1(y0Var)));
        }
        return f0Var;
    }
}
