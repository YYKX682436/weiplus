package mz0;

/* loaded from: classes5.dex */
public final /* synthetic */ class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.p {
    public l0(java.lang.Object obj) {
        super(2, obj, mz0.b2.class, "performSwitchMusicV2", "performSwitchMusicV2(Ljava/lang/String;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/component/IMaasSnsMusicPickerBizNotify;)V", 0);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.e5 e5Var;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356;
        java.lang.String p07 = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.c) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        mz0.b2 b2Var = (mz0.b2) this.f72685xcfcbe9ef;
        ty0.b1 b1Var = b2Var.f414422m;
        java.lang.String m33856x92013dca = (b1Var == null || (e5Var = b1Var.f504325b) == null || (c4116xf4b2c356 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) e5Var.mo128745x754a37bb()) == null) ? null : c4116xf4b2c356.m33856x92013dca();
        if (m33856x92013dca == null) {
            m33856x92013dca = "";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p07, m33856x92013dca)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Template.TemplateControlUIC", "same music, no need to switch");
            if (cVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.k1) cVar).a(new cw3.h(null, 1, null), p07);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Template.TemplateControlUIC", "performSwitchMusicV2: musicId " + p07 + " ready");
            p3325xe03a0797.p3326xc267989b.l.d(b2Var.m158345xefc66565(), null, null, new mz0.s1(p07, b2Var, cVar, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
