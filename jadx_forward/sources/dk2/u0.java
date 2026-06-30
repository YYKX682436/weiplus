package dk2;

/* loaded from: classes.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f315673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ng1 f315674f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f315675g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ek2.f f315676h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(dk2.r4 r4Var, r45.xn1 xn1Var, r45.ng1 ng1Var, int i17, ek2.f fVar) {
        super(0);
        this.f315672d = r4Var;
        this.f315673e = xn1Var;
        this.f315674f = ng1Var;
        this.f315675g = i17;
        this.f315676h = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.util.Map map = ((mm2.y2) this.f315672d.m(mm2.y2.class)).A;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "<get-invitedVisitorExpiredMap>(...)");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) this.f315673e.m75936x14adae67(0);
        if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
            str = "";
        }
        r45.ng1 ng1Var = this.f315674f;
        map.put(str, new dk2.b8(ng1Var.m75942xfb822ef2(1) * 1000, this.f315675g));
        ek2.f fVar = this.f315676h;
        if (fVar != null) {
            fVar.a(ng1Var);
        }
        return jz5.f0.f384359a;
    }
}
