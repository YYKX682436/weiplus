package bl2;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f21711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bl2.k f21712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.d22 f21713f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(bw5.lp0 lp0Var, bl2.k kVar, r45.d22 d22Var) {
        super(3);
        this.f21711d = lp0Var;
        this.f21712e = kVar;
        this.f21713f = d22Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        bw5.v70 v70Var = (bw5.v70) obj3;
        bl2.k kVar = this.f21712e;
        if (booleanValue) {
            bw5.lp0 lp0Var = this.f21711d;
            lp0Var.j(v70Var);
            pm0.v.X(new bl2.g(lp0Var, kVar, this.f21713f));
        } else {
            com.tencent.mars.xlog.Log.e(kVar.f21719m, "cannot get ting item for " + kVar.f21717h + ", failed to open Ting Activity");
        }
        return jz5.f0.f302826a;
    }
}
