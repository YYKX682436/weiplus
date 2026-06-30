package qy0;

/* loaded from: classes5.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f449127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f449128e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ty0.b1 b1Var, yz5.a aVar) {
        super(3);
        this.f449127d = b1Var;
        this.f449128e = aVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar).f(booleanValue) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj4 = n0.e1.f415025a;
        if (booleanValue) {
            ty0.z0.f((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) this.f449127d.f504325b.mo128745x754a37bb(), ty0.a1.f504307j, this.f449128e, oVar, 56);
        }
        return jz5.f0.f384359a;
    }
}
