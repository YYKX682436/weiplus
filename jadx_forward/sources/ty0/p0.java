package ty0;

/* loaded from: classes14.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f504473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f504474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f504475f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(yz5.q qVar, yz5.a aVar, ty0.b1 b1Var) {
        super(2);
        this.f504473d = qVar;
        this.f504474e = aVar;
        this.f504475f = b1Var;
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
        ty0.z0.i(this.f504473d, this.f504474e, this.f504475f, oVar, 512);
        return jz5.f0.f384359a;
    }
}
