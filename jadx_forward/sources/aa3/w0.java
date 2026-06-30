package aa3;

/* loaded from: classes9.dex */
public final class w0 implements com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.I993EnvListener {

    /* renamed from: a, reason: collision with root package name */
    public static final aa3.w0 f84141a = new aa3.w0();

    @Override // com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.I993EnvListener
    /* renamed from: is993Env */
    public final boolean mo917xc347bc84() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_sm2_993_abtest, false);
        boolean z17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Pay_993TEST_Int, 0) == 1;
        boolean a17 = z65.c.a();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274509d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "[is993Env] isSvrOpen: " + fj6 + ", isLocalOpen: " + z17 + " , hasDebugger: " + a17 + ", is993WXPayUsed: " + z18);
        if (a17 && z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "[is993Env] true：hasDebugger && is993WXPayUsed");
        } else {
            if (!a17 || !z17) {
                return fj6;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "[is993Env] true：hasDebugger && isLocalOpen");
        }
        return true;
    }
}
