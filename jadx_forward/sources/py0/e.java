package py0;

/* loaded from: classes5.dex */
public final /* synthetic */ class e extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public e(java.lang.Object obj) {
        super(1, obj, py0.y.class, "performSwitchMusic", "performSwitchMusic(Ljava/lang/String;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n0.e5 e5Var;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356;
        java.lang.String p07 = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        py0.y yVar = (py0.y) this.f72685xcfcbe9ef;
        yVar.getClass();
        ty0.b1 b1Var = yVar.f440566h;
        java.lang.String m33856x92013dca = (b1Var == null || (e5Var = b1Var.f504325b) == null || (c4116xf4b2c356 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) e5Var.mo128745x754a37bb()) == null) ? null : c4116xf4b2c356.m33856x92013dca();
        if (m33856x92013dca == null) {
            m33856x92013dca = "";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p07, m33856x92013dca)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasBaseUILogicUIC", "same music, no need to switch");
        } else {
            py0.f0 P6 = yVar.P6();
            P6.c(yVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.gvu));
            P6.e(false);
            p3325xe03a0797.p3326xc267989b.l.d(yVar.m158345xefc66565(), null, null, new py0.s(yVar, p07, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
