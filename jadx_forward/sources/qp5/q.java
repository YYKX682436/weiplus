package qp5;

/* loaded from: classes9.dex */
public class q implements com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.I993EnvListener {
    public q(com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd14) {
    }

    @Override // com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.I993EnvListener
    /* renamed from: is993Env */
    public boolean mo917xc347bc84() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_sm2_993_abtest, false);
        boolean z17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Pay_993TEST_Int, 0) == 1;
        boolean a17 = z65.c.a();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274509d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditHintPasswdView", "[is993Env] isSvrOpen: %s, isLocalOpen: %s , hasDebugger: %s ，is993WXPayUsed：%s", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(a17), java.lang.Boolean.valueOf(z18));
        if (a17 && z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditHintPasswdView", "[is993Env] true：hasDebugger && is993WXPayUsed");
            return true;
        }
        if (a17 && z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditHintPasswdView", "[is993Env] true：hasDebugger && isLocalOpen");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditHintPasswdView", "[is993Env] use normal mode：%s", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }
}
