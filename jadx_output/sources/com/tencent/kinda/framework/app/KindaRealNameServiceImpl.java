package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class KindaRealNameServiceImpl implements com.tencent.kinda.gen.KRealNameService {
    private static final java.lang.String TAG = "MicroMsg.KindaRealNameServiceImpl";

    @Override // com.tencent.kinda.gen.KRealNameService
    public void checkRealnameLicenseImpl(int i17, final com.tencent.kinda.gen.VoidCallback voidCallback, final com.tencent.kinda.gen.VoidCallback voidCallback2, final com.tencent.kinda.gen.VoidCallback voidCallback3, final com.tencent.kinda.gen.VoidCallback voidCallback4) {
        np5.b0 b0Var = new np5.b0(com.tencent.kinda.framework.widget.tools.KindaContext.get(), null);
        zs4.p pVar = new zs4.p() { // from class: com.tencent.kinda.framework.app.KindaRealNameServiceImpl.1
            public void onRequesting() {
                voidCallback3.call();
            }

            public void onResponsed() {
                voidCallback4.call();
            }

            @Override // zs4.p
            public boolean run(int i18, int i19, java.lang.String str, boolean z17) {
                if (i18 != 0) {
                    com.tencent.mars.xlog.Log.e(com.tencent.kinda.framework.app.KindaRealNameServiceImpl.TAG, "WalletGetDisclaimerCallback resultCode=%d,errMsg=%s,errcode=%d", java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(i19));
                    voidCallback.call();
                    return true;
                }
                if (z17) {
                    voidCallback.call();
                    return true;
                }
                voidCallback2.call();
                return true;
            }
        };
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        ((pg0.a3) i95.n0.c(pg0.a3.class)).f353966t.f(context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null, i17, b0Var, pVar, false, 1, false);
    }
}
