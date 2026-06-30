package e22;

/* loaded from: classes10.dex */
public final class l1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13340xd9e4c60a f328214d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13340xd9e4c60a c13340xd9e4c60a) {
        super(2);
        this.f328214d = c13340xd9e4c60a;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13340xd9e4c60a c13340xd9e4c60a = this.f328214d;
        e22.d1 d1Var = c13340xd9e4c60a.f179693i;
        if (d1Var != null) {
            e22.a1.d(d1Var, new e22.i1(c13340xd9e4c60a), new e22.j1(c13340xd9e4c60a), new e22.k1(c13340xd9e4c60a), oVar, 8, 0);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("findersFeedViewModel");
        throw null;
    }
}
