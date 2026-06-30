package kz0;

/* loaded from: classes5.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f395358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 f395359e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ty0.b1 b1Var, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var) {
        super(2);
        this.f395358d = b1Var;
        this.f395359e = m7Var;
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
        ty0.z0.f((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) this.f395358d.f504325b.mo128745x754a37bb(), ty0.a1.f504307j, new kz0.x(this.f395359e), oVar, 56);
        return jz5.f0.f384359a;
    }
}
