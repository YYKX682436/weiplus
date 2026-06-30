package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class l0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21609x9a93ea89.AppBrandServiceChattingFmUI f283449a;

    public l0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21609x9a93ea89.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI) {
        this.f283449a = appBrandServiceChattingFmUI;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z
    public java.lang.Object a(r35.m3 m3Var) {
        java.lang.String str;
        if (m3Var.f450728d != 45) {
            return null;
        }
        java.lang.String str2 = new java.lang.String(android.util.Base64.decode(m3Var.e(), 0));
        try {
            java.lang.String mo15082x48bce8a4 = new cl0.g((java.lang.String) m3Var.b(java.lang.String.class)).mo15082x48bce8a4(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (mo15082x48bce8a4 == null) {
                mo15082x48bce8a4 = "";
            }
            str = new java.lang.String(android.util.Base64.decode(mo15082x48bce8a4, 0));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandServiceChattingUI", "json parse fail: e = %s", e17);
            str = "";
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21609x9a93ea89.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI = this.f283449a;
        if (appBrandServiceChattingFmUI.N == 2 && appBrandServiceChattingFmUI.P.f159011d.equals(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandServiceChattingUI", "onBackFromContact appId:%s path:%s", str2, str);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21609x9a93ea89.AppBrandServiceChattingFmUI.n1(appBrandServiceChattingFmUI, str);
            return java.lang.Boolean.TRUE;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        c12559xbdae8559.f169323f = 1081;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).aj(appBrandServiceChattingFmUI.mo7438x76847179(), null, str2, 0, 0, str, c12559xbdae8559);
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z
    public java.lang.Object b(r35.m3 m3Var) {
        int i17 = m3Var.f450728d;
        if (i17 == 1 || i17 == 25 || i17 == 30 || i17 == 31) {
            return this.f283449a.f279685f.x();
        }
        return null;
    }
}
