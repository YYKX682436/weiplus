package en5;

/* loaded from: classes14.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f336999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f337000e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.util.ArrayList arrayList, yz5.l lVar) {
        super(4);
        this.f336999d = arrayList;
        this.f337000e = lVar;
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
        float f17 = 8;
        z0.t h17 = d0.a3.h(z0.p.f550454d, ((float) 7.5d) * f17);
        yz5.l lVar = this.f337000e;
        java.util.ArrayList arrayList = this.f336999d;
        en5.n0.c(b1.d.a(a0.d0.d(h17, false, null, null, new en5.m(lVar, arrayList, intValue), 7, null), i0.h.a(1 * f17)), ((aq.a) arrayList.get(intValue)).f94360b, null, null, oVar, 0, 12);
        return jz5.f0.f384359a;
    }
}
