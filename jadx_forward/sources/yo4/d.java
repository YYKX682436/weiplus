package yo4;

/* loaded from: classes5.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f545723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yo4.p f545724e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ju3.d0 d0Var, yo4.p pVar) {
        super(1);
        this.f545723d = d0Var;
        this.f545724e = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yo4.p pVar = this.f545724e;
        ju3.d0 d0Var = this.f545723d;
        if (booleanValue) {
            ju3.d0.k(d0Var, ju3.c0.S, null, 2, null);
            pVar.f545825w = -1L;
        } else {
            ju3.d0.k(d0Var, ju3.c0.W, null, 2, null);
            ju3.c0 c0Var = ju3.c0.T;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("PARAM_1_LONG", pVar.f545825w);
            d0Var.w(c0Var, bundle);
        }
        return jz5.f0.f384359a;
    }
}
