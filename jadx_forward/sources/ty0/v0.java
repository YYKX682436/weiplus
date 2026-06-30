package ty0;

/* loaded from: classes14.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 f504541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f504542e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356, yz5.a aVar) {
        super(2);
        this.f504541d = c4116xf4b2c356;
        this.f504542e = aVar;
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
        ty0.z0.j(this.f504541d, this.f504542e, oVar, 8);
        return jz5.f0.f384359a;
    }
}
