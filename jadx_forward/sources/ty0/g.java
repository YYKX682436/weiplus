package ty0;

/* loaded from: classes14.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f504370d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yz5.q qVar) {
        super(2);
        this.f504370d = qVar;
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
        int i17 = z0.t.f550455q1;
        this.f504370d.mo147xb9724478(d0.a3.f(z0.p.f550454d, 0.0f, 1, null), oVar, 54);
        return jz5.f0.f384359a;
    }
}
