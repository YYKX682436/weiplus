package b0;

/* loaded from: classes14.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f16406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.o f16407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f16408f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16409g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.q f16410h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.q f16411i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b0.y1 f16412m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f16413n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f16414o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(yz5.p pVar, c0.o oVar, yz5.a aVar, yz5.l lVar, yz5.q qVar, yz5.q qVar2, b0.y1 y1Var, boolean z17, boolean z18) {
        super(3);
        this.f16406d = pVar;
        this.f16407e = oVar;
        this.f16408f = aVar;
        this.f16409g = lVar;
        this.f16410h = qVar;
        this.f16411i = qVar2;
        this.f16412m = y1Var;
        this.f16413n = z17;
        this.f16414o = z18;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-1487259950);
        b0.e2 e2Var = (b0.e2) this.f16406d.invoke(y0Var, 0);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i17 = n0.o.f333629a;
        java.lang.Object obj4 = n0.n.f333620a;
        if (y17 == obj4) {
            y17 = n0.s4.c(null, null, 2, null);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        n0.v2 v2Var = (n0.v2) y17;
        c0.o oVar = this.f16407e;
        n0.d2.c(oVar, new b0.e1(v2Var, oVar), y0Var, 0);
        y0Var.U(-492369756);
        java.lang.Object y18 = y0Var.y();
        if (y18 == obj4) {
            y18 = u26.z.a(Integer.MAX_VALUE, null, null, 6, null);
            y0Var.g0(y18);
        }
        y0Var.o(false);
        u26.w wVar = (u26.w) y18;
        n0.e5 e17 = n0.s4.e(this.f16408f, y0Var, 0);
        n0.e5 e18 = n0.s4.e(this.f16409g, y0Var, 0);
        n0.d2.f(e2Var, new b0.g1(wVar, e2Var, n0.s4.e(new b0.t0(this.f16410h, this.f16411i, v2Var, oVar), y0Var, 0), null), y0Var, 0);
        int i18 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f16413n);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(this.f16414o);
        b0.y1 y1Var = this.f16412m;
        java.lang.Object[] objArr = {y1Var, valueOf, valueOf2};
        b0.k1 k1Var = new b0.k1(this.f16413n, e18, e17, y1Var, wVar, this.f16414o, null);
        p1.l lVar = p1.x0.f350924a;
        boolean z17 = androidx.compose.ui.platform.f3.f10562a;
        z0.t a17 = z0.m.a(pVar, androidx.compose.ui.platform.e3.f10553d, new p1.w0(objArr, k1Var));
        y0Var.o(false);
        return a17;
    }
}
