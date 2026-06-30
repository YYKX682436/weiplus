package en5;

/* loaded from: classes14.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f337037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f337038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f337039f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, long j17, long j18) {
        super(4);
        this.f337037d = f0Var;
        this.f337038e = j17;
        this.f337039f = j18;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        e0.g items = (e0.g) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        n0.o oVar = (n0.o) obj3;
        int intValue2 = ((java.lang.Number) obj4).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "$this$items");
        if ((intValue2 & 112) == 0) {
            intValue2 |= ((n0.y0) oVar).c(intValue) ? 32 : 16;
        }
        if ((intValue2 & 721) == 144) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj5 = n0.e1.f415025a;
        int i17 = z0.t.f550455q1;
        a0.m.a(d0.a3.h(z0.p.f550454d, 1 * 8), new en5.s(intValue, this.f337037d, this.f337038e, this.f337039f), oVar, 6);
        return jz5.f0.f384359a;
    }
}
