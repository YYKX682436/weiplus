package bl2;

/* loaded from: classes3.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f103244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bl2.k f103245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.d22 f103246f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(bw5.lp0 lp0Var, bl2.k kVar, r45.d22 d22Var) {
        super(3);
        this.f103244d = lp0Var;
        this.f103245e = kVar;
        this.f103246f = d22Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        bw5.v70 v70Var = (bw5.v70) obj3;
        bl2.k kVar = this.f103245e;
        if (booleanValue) {
            bw5.lp0 lp0Var = this.f103244d;
            lp0Var.j(v70Var);
            pm0.v.X(new bl2.g(lp0Var, kVar, this.f103246f));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(kVar.f103252m, "cannot get ting item for " + kVar.f103250h + ", failed to open Ting Activity");
        }
        return jz5.f0.f384359a;
    }
}
