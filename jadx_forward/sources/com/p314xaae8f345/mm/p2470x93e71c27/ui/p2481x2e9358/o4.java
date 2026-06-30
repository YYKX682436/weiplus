package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class o4 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272064a;

    public o4(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272064a = c19666xfd6e2f33;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (message.what != 4097) {
            return;
        }
        hv4.l lVar = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.f271483x6;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272064a;
        c19666xfd6e2f33.getClass();
        android.view.ViewGroup.LayoutParams layoutParams = c19666xfd6e2f33.f271622x.getLayoutParams();
        int bottom = c19666xfd6e2f33.f271622x.getBottom() - c19666xfd6e2f33.f271622x.getTop();
        if (c19666xfd6e2f33.K0()) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = c19666xfd6e2f33.f271514f;
            if (abstractC19636xc6b37291 != null) {
                abstractC19636xc6b37291.setVisibility(8);
            }
            c19666xfd6e2f33.m75481xec7a01cd(8);
            c19666xfd6e2f33.f271622x.setVisibility(4);
        }
        if (bottom <= 3) {
            c19666xfd6e2f33.getClass();
            c19666xfd6e2f33.f271622x.setVisibility(4);
            c19666xfd6e2f33.X0(c19666xfd6e2f33.m75453x591f0b97());
            return;
        }
        layoutParams.height = java.lang.Math.max(bottom - 60, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatFooter", "mBottomPanelAnim:bottomPanel height:" + layoutParams.height);
        c19666xfd6e2f33.f271622x.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = c19666xfd6e2f33.K5;
        n3Var.mo50303x856b99f0(4097);
        n3Var.mo50307xb9e94560(4097, 1);
    }
}
