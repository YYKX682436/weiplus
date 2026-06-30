package ee5;

/* loaded from: classes10.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.z f333603d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ee5.z zVar) {
        super(2);
        this.f333603d = zVar;
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
        ee5.z zVar = this.f333603d;
        fn5.n0 Q6 = zVar.Q6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q6, "access$getImageDataQueryModel(...)");
        ee5.t tVar = new ee5.t(zVar);
        ee5.u uVar = new ee5.u(zVar);
        java.util.List list = fn5.n0.E;
        fn5.p.a(Q6, tVar, uVar, oVar, 8);
        return jz5.f0.f384359a;
    }
}
