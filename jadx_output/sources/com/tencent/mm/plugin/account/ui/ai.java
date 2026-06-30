package com.tencent.mm.plugin.account.ui;

/* loaded from: classes8.dex */
public class ai implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u1 f73729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI f73730b;

    public ai(com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI shareToFacebookRedirectUI, com.tencent.mm.ui.widget.dialog.u1 u1Var) {
        this.f73730b = shareToFacebookRedirectUI;
        this.f73729a = u1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI shareToFacebookRedirectUI = this.f73730b;
        shareToFacebookRedirectUI.hideVKB();
        this.f73729a.f211998c.dismiss();
        if (!z17) {
            shareToFacebookRedirectUI.finish();
            return;
        }
        r45.mz5 mz5Var = new r45.mz5();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = " ";
        }
        mz5Var.f380950d = str;
        mz5Var.f380953g = shareToFacebookRedirectUI.f73654d;
        mz5Var.f380954h = shareToFacebookRedirectUI.f73655e;
        mz5Var.f380952f = shareToFacebookRedirectUI.f73657g;
        mz5Var.f380951e = shareToFacebookRedirectUI.f73656f;
        gm0.j1.d().g(new v61.l0(mz5Var));
        com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI shareToFacebookRedirectUI2 = this.f73730b;
        shareToFacebookRedirectUI2.f73659i = db5.e1.Q(shareToFacebookRedirectUI2, "", "", false, false, new com.tencent.mm.plugin.account.ui.zh(this));
    }
}
