package j0;

/* loaded from: classes14.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f377738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0.t f377739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f377740f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz5.p pVar, z0.t tVar, int i17) {
        super(2);
        this.f377738d = pVar;
        this.f377739e = tVar;
        this.f377740f = i17;
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
        int i17 = this.f377740f;
        yz5.p pVar = this.f377738d;
        if (pVar == null) {
            n0.y0 y0Var2 = (n0.y0) oVar;
            y0Var2.U(1275643833);
            j0.g.b(this.f377739e, oVar, (i17 >> 3) & 14);
            y0Var2.o(false);
        } else {
            n0.y0 y0Var3 = (n0.y0) oVar;
            y0Var3.U(1275643903);
            pVar.mo149xb9724478(oVar, java.lang.Integer.valueOf((i17 >> 6) & 14));
            y0Var3.o(false);
        }
        return jz5.f0.f384359a;
    }
}
