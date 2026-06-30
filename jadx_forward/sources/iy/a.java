package iy;

/* loaded from: classes14.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jy.m f377210d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(jy.m mVar) {
        super(2);
        this.f377210d = mVar;
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
        ky.l0.a(ky.h0.f394900e, oVar, 6, 0);
        iy.n.a(this.f377210d, null, oVar, 8, 2);
        return jz5.f0.f384359a;
    }
}
