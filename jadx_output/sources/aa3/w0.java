package aa3;

/* loaded from: classes9.dex */
public final class w0 implements com.tenpay.android.wechat.TenpaySecureEditText.I993EnvListener {

    /* renamed from: a, reason: collision with root package name */
    public static final aa3.w0 f2608a = new aa3.w0();

    @Override // com.tenpay.android.wechat.TenpaySecureEditText.I993EnvListener
    public final boolean is993Env() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_sm2_993_abtest, false);
        boolean z17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Pay_993TEST_Int, 0) == 1;
        boolean a17 = z65.c.a();
        boolean z18 = com.tencent.mm.sdk.platformtools.s9.f192976d;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "[is993Env] isSvrOpen: " + fj6 + ", isLocalOpen: " + z17 + " , hasDebugger: " + a17 + ", is993WXPayUsed: " + z18);
        if (a17 && z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "[is993Env] true：hasDebugger && is993WXPayUsed");
        } else {
            if (!a17 || !z17) {
                return fj6;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "[is993Env] true：hasDebugger && isLocalOpen");
        }
        return true;
    }
}
