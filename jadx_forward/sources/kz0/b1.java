package kz0;

/* loaded from: classes5.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f395195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f395196e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f395197f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0 f395198g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f395199h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f395200i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(boolean z17, ty0.b1 b1Var, yz5.l lVar, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0 t0Var, n0.v2 v2Var, n0.v2 v2Var2) {
        super(3);
        this.f395195d = z17;
        this.f395196e = b1Var;
        this.f395197f = lVar;
        this.f395198g = t0Var;
        this.f395199h = v2Var;
        this.f395200i = v2Var2;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        d0.l0 MusicSelectorExpand = (d0.l0) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(MusicSelectorExpand, "$this$MusicSelectorExpand");
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar).e(MusicSelectorExpand) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj4 = n0.e1.f415025a;
        if (this.f395195d) {
            wy0.o.a(MusicSelectorExpand, new kz0.a1(this.f395196e, this.f395197f, this.f395198g, this.f395199h, this.f395200i), oVar, intValue & 14);
        }
        return jz5.f0.f384359a;
    }
}
