package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class k0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.e5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21609x9a93ea89.AppBrandServiceChattingFmUI f283410a;

    public k0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21609x9a93ea89.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI) {
        this.f283410a = appBrandServiceChattingFmUI;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.e5
    public boolean a(boolean z17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21609x9a93ea89.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI = this.f283410a;
        k91.l5 l5Var = appBrandServiceChattingFmUI.f279679y0;
        if (l5Var != null) {
            k91.k5 k5Var = (k91.k5) l5Var.f387203a.get(0);
            if (appBrandServiceChattingFmUI.N == 2 && appBrandServiceChattingFmUI.P.f159014g.equals(k5Var.f387197a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandServiceChattingUI", "[bizmenu]onBackFromContact username:%s path:%s", k5Var.f387197a, k5Var.f387198b);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21609x9a93ea89.AppBrandServiceChattingFmUI.n1(appBrandServiceChattingFmUI, k5Var.f387198b);
                return true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
            c12559xbdae8559.f169323f = 1080;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Vi(appBrandServiceChattingFmUI.mo7438x76847179(), k5Var.f387197a, "", 0, k5Var.f387199c, k5Var.f387198b, c12559xbdae8559, appBrandServiceChattingFmUI.p1());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandServiceChattingUI", "[mOnOpenMiniProgramBtnClickListener]wxaBizMenu or wxaBizMenu.ButtonList is empty, error");
        }
        return true;
    }
}
