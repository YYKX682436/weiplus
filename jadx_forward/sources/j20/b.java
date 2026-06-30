package j20;

/* loaded from: classes9.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f378751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j20.e f378752e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yz5.l lVar, j20.e eVar) {
        super(1);
        this.f378751d = lVar;
        this.f378752e = eVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yz5.l lVar = this.f378751d;
        if (booleanValue) {
            d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
            d85.g0 g0Var = d85.g0.LOCAION;
            d85.f0 f0Var = d85.f0.G;
            if (((d85.d1) m0Var).Ri(g0Var, f0Var)) {
                lVar.mo146xb9724478(0);
            } else {
                j20.a aVar = new j20.a(lVar);
                this.f378752e.getClass();
                ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(g0Var, f0Var, new j20.d(aVar));
            }
        } else {
            lVar.mo146xb9724478(108);
        }
        return jz5.f0.f384359a;
    }
}
