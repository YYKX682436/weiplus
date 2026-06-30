package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KindaRealNameServiceImpl */
/* loaded from: classes9.dex */
public class C3141x6594f0ff implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3513x7d147961 {
    private static final java.lang.String TAG = "MicroMsg.KindaRealNameServiceImpl";

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3513x7d147961
    /* renamed from: checkRealnameLicenseImpl */
    public void mo25353x88b6f6f0(int i17, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856193, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856194) {
        np5.b0 b0Var = new np5.b0(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), null);
        zs4.p pVar = new zs4.p() { // from class: com.tencent.kinda.framework.app.KindaRealNameServiceImpl.1
            /* renamed from: onRequesting */
            public void m25354xc953c632() {
                abstractC3623x3b4856193.mo25801x2e7a5e();
            }

            /* renamed from: onResponsed */
            public void m25355x8955b124() {
                abstractC3623x3b4856194.mo25801x2e7a5e();
            }

            @Override // zs4.p
            public boolean run(int i18, int i19, java.lang.String str, boolean z17) {
                if (i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3141x6594f0ff.TAG, "WalletGetDisclaimerCallback resultCode=%d,errMsg=%s,errcode=%d", java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(i19));
                    abstractC3623x3b485619.mo25801x2e7a5e();
                    return true;
                }
                if (z17) {
                    abstractC3623x3b485619.mo25801x2e7a5e();
                    return true;
                }
                abstractC3623x3b4856192.mo25801x2e7a5e();
                return true;
            }
        };
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        ((pg0.a3) i95.n0.c(pg0.a3.class)).f435499t.f(context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null, i17, b0Var, pVar, false, 1, false);
    }
}
