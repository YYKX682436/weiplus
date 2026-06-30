package kz0;

/* loaded from: classes14.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f395294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f395295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f395296f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f395297g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f395298h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 f395299i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(boolean z17, n0.v2 v2Var, yz5.a aVar, yz5.a aVar2, ty0.b1 b1Var, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var) {
        super(2);
        this.f395294d = z17;
        this.f395295e = v2Var;
        this.f395296f = aVar;
        this.f395297g = aVar2;
        this.f395298h = b1Var;
        this.f395299i = m7Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj3 = n0.e1.f415025a;
        y.q.c(!kz0.k1.c(this.f395295e) && this.f395294d, null, y.x0.b(null, 0.0f, 3, null), y.x0.c(null, 0.0f, 3, null), null, u0.j.b(oVar, 1738943129, true, new kz0.z(this.f395296f, this.f395297g, this.f395298h, this.f395299i)), oVar, 200064, 18);
        return jz5.f0.f384359a;
    }
}
