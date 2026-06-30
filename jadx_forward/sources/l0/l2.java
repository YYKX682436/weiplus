package l0;

/* loaded from: classes14.dex */
public final class l2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f395887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.a3 f395888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.y1 f395889f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f395890g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.o f395891h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f395892i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.p1 f395893m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.p f395894n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f395895o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(java.util.Map map, l0.a3 a3Var, b0.y1 y1Var, boolean z17, c0.o oVar, boolean z18, l0.p1 p1Var, yz5.p pVar, float f17) {
        super(3);
        this.f395887d = map;
        this.f395888e = a3Var;
        this.f395889f = y1Var;
        this.f395890g = z17;
        this.f395891h = oVar;
        this.f395892i = z18;
        this.f395893m = p1Var;
        this.f395894n = pVar;
        this.f395895o = f17;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(43594985);
        java.util.Map map = this.f395887d;
        if (!(!map.isEmpty())) {
            throw new java.lang.IllegalArgumentException("You must have at least one anchor.".toString());
        }
        if (!(kz5.n0.Q(map.values()).size() == map.size())) {
            throw new java.lang.IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
        }
        p2.f fVar = (p2.f) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e);
        l0.a3 a3Var = this.f395888e;
        a3Var.getClass();
        if (((java.util.Map) ((n0.q4) a3Var.f395569i).mo128745x754a37bb()).isEmpty()) {
            java.lang.Float a17 = l0.m2.a(map, a3Var.b());
            if (a17 == null) {
                throw new java.lang.IllegalArgumentException("The initial value must have an associated anchor.".toString());
            }
            ((n0.q4) a3Var.f395565e).mo148714x53d8522f(a17);
            ((n0.q4) a3Var.f395567g).mo148714x53d8522f(a17);
        }
        java.util.Map map2 = this.f395887d;
        l0.a3 a3Var2 = this.f395888e;
        n0.d2.e(map2, a3Var2, new l0.i2(a3Var2, map2, this.f395893m, fVar, this.f395894n, this.f395895o, null), y0Var, 8);
        z0.p pVar = z0.p.f550454d;
        boolean booleanValue = ((java.lang.Boolean) ((n0.q4) a3Var.f395564d).mo128745x754a37bb()).booleanValue();
        b0.n1 state = a3Var.f395576p;
        boolean z17 = this.f395890g;
        c0.o oVar = this.f395891h;
        l0.k2 k2Var = new l0.k2(a3Var, null);
        boolean z18 = this.f395892i;
        b0.y0 y0Var2 = new b0.y0(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        b0.y1 orientation = this.f395889f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orientation, "orientation");
        z0.t c17 = b0.m1.c(pVar, new b0.z0(state), b0.a1.f97724d, orientation, z17, oVar, new b0.b1(booleanValue), y0Var2, k2Var, z18);
        y0Var.o(false);
        return c17;
    }
}
