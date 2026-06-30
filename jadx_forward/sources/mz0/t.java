package mz0;

/* loaded from: classes5.dex */
public final /* synthetic */ class t extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public t(java.lang.Object obj) {
        super(1, obj, mz0.b2.class, "performSwitchMusic", "performSwitchMusic(Ljava/lang/String;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n0.e5 e5Var;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356;
        java.lang.String p07 = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        mz0.b2 b2Var = (mz0.b2) this.f72685xcfcbe9ef;
        ty0.b1 b1Var = b2Var.f414422m;
        java.lang.String m33856x92013dca = (b1Var == null || (e5Var = b1Var.f504325b) == null || (c4116xf4b2c356 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) e5Var.mo128745x754a37bb()) == null) ? null : c4116xf4b2c356.m33856x92013dca();
        if (m33856x92013dca == null) {
            m33856x92013dca = "";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p07, m33856x92013dca)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Template.TemplateControlUIC", "same music, no need to switch");
        } else {
            py0.f0 f76 = b2Var.f7();
            f76.c(b2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.gvu));
            f76.e(false);
            p3325xe03a0797.p3326xc267989b.l.d(b2Var.m158345xefc66565(), null, null, new mz0.n1(b2Var, p07, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
