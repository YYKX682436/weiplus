package pe3;

/* loaded from: classes5.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f435207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pe3.g0 f435208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.util.List list, pe3.g0 g0Var) {
        super(4);
        this.f435207d = list;
        this.f435208e = g0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i17;
        e0.g items = (e0.g) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        n0.o oVar = (n0.o) obj3;
        int intValue2 = ((java.lang.Number) obj4).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "$this$items");
        if ((intValue2 & 14) == 0) {
            i17 = (((n0.y0) oVar).e(items) ? 4 : 2) | intValue2;
        } else {
            i17 = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            i17 |= ((n0.y0) oVar).c(intValue) ? 32 : 16;
        }
        if ((i17 & 731) == 146) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        int i18 = (i17 & 112) | (i17 & 14);
        se3.d dVar = (se3.d) this.f435207d.get(intValue);
        boolean z17 = dVar instanceof se3.g;
        pe3.g0 g0Var = this.f435208e;
        if (z17) {
            n0.y0 y0Var2 = (n0.y0) oVar;
            y0Var2.U(2138979591);
            pe3.g0.Q6(g0Var, intValue, oVar, ((i18 >> 3) & 14) | 64);
            y0Var2.o(false);
        } else if (dVar instanceof se3.f) {
            n0.y0 y0Var3 = (n0.y0) oVar;
            y0Var3.U(2138979653);
            pe3.g0.P6(g0Var, (se3.f) dVar, oVar, 72);
            y0Var3.o(false);
        } else {
            n0.y0 y0Var4 = (n0.y0) oVar;
            y0Var4.U(2138979686);
            y0Var4.o(false);
        }
        return jz5.f0.f384359a;
    }
}
