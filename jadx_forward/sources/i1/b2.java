package i1;

/* loaded from: classes14.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i1.e f368368d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(i1.e eVar) {
        super(4);
        this.f368368d = eVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        ((java.lang.Number) obj).floatValue();
        ((java.lang.Number) obj2).floatValue();
        n0.o oVar = (n0.o) obj3;
        if ((((java.lang.Number) obj4).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        i1.c2.a(this.f368368d.f368417f, null, oVar, 0, 2);
        return jz5.f0.f384359a;
    }
}
