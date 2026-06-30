package df2;

/* loaded from: classes15.dex */
public final class ho extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f311878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.jo f311879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.g10 f311880f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(so2.j5 j5Var, df2.jo joVar, bw5.g10 g10Var) {
        super(0);
        this.f311878d = j5Var;
        this.f311879e = joVar;
        this.f311880f = g10Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        so2.j5 j5Var = this.f311878d;
        cm2.m0 m0Var = j5Var instanceof cm2.m0 ? (cm2.m0) j5Var : null;
        if (m0Var == null) {
            return null;
        }
        r45.y23 y23Var = m0Var.f124901v;
        r45.bd5 bd5Var = new r45.bd5();
        bw5.g10 g10Var = this.f311880f;
        bw5.v00 b17 = g10Var.b();
        byte[] mo14344x5f01b1f6 = b17 != null ? b17.mo14344x5f01b1f6() : null;
        if (mo14344x5f01b1f6 != null) {
            try {
                bd5Var.mo11468x92b714fd(mo14344x5f01b1f6);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        y23Var.set(70, bd5Var);
        df2.jo joVar = this.f311879e;
        android.view.View S6 = joVar.S6(com.p314xaae8f345.mm.R.id.flh);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = S6 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) S6 : null;
        java.lang.Object mo7946xf939df19 = c1163xf1deaba4 != null ? c1163xf1deaba4.mo7946xf939df19() : null;
        tt2.e1 e1Var = mo7946xf939df19 instanceof tt2.e1 ? (tt2.e1) mo7946xf939df19 : null;
        if (e1Var != null) {
            e1Var.T(g10Var.f109146d, 10);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(joVar.f312024m, "NotifyShopShelfUpdateType_ProductButton productId: " + g10Var.f109146d);
        return m0Var;
    }
}
