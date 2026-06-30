package um2;

/* loaded from: classes3.dex */
public final class s5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(um2.x5 x5Var) {
        super(1);
        this.f510492d = x5Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        um2.x5 x5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar;
        km2.r rVar;
        km2.r rVar2;
        if (((java.lang.Boolean) obj).booleanValue() && (etVar = (x5Var = this.f510492d).f510619x) != null) {
            int S6 = ((mm2.j2) x5Var.c(mm2.j2.class)).S6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "resend comment:" + etVar.V + ",floatType:" + S6);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(etVar.V)) {
                r45.xn1 xn1Var = etVar.W;
                if (xn1Var != null) {
                    r45.qt2 qt2Var = new r45.qt2();
                    km2.n nVar = dk2.ef.H;
                    int i17 = 0;
                    qt2Var.set(7, java.lang.Integer.valueOf((nVar == null || (rVar2 = nVar.f390684c) == null) ? 0 : rVar2.f390739k));
                    km2.n nVar2 = dk2.ef.H;
                    if (nVar2 != null && (rVar = nVar2.f390684c) != null) {
                        i17 = rVar.f390739k;
                    }
                    qt2Var.set(5, java.lang.Integer.valueOf(i17));
                    ke2.p0 p0Var = ke2.q0.f388514w;
                    gk2.e S0 = etVar.S0();
                    long j17 = etVar.X;
                    int i18 = etVar.Y;
                    java.lang.String str = etVar.V;
                    kn0.e a17 = hn0.v.f363973a.a();
                    new ke2.q0(p0Var.c(S0, xn1Var, j17, i18, str, a17 != null ? a17.B : null, S6), etVar.S0(), qt2Var, null).l();
                } else {
                    dk2.q4.f315471a.e(etVar.R, etVar.S0(), ek2.r0.f335052y.a(etVar.V, 1, S6), zl2.q4.f555466a.m(), null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
