package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class t9 extends com.p314xaae8f345.p3210x3857dc.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9 f168655a;

    public t9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9 w9Var) {
        this.f168655a = w9Var;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x9 x9Var;
        if (consoleMessage == null || (x9Var = this.f168655a.f168738v) == null || x9Var.f168786a == null) {
            return false;
        }
        cf.o.a(consoleMessage, "Luggage.AppBrandWebViewClient" + java.lang.String.format(java.util.Locale.ENGLISH, ":page[%s %s]", x9Var.f168786a.mo48798x74292566(), x9Var.f168786a.X1()), true);
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean c(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWebView", "WebChromeClient onEnterFullscreen");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9 w9Var = this.f168655a;
        if (!w9Var.m120171x1f05d274()) {
            return false;
        }
        xi1.m mVar = w9Var.f168739w;
        if (mVar == null) {
            return true;
        }
        mVar.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.s9(this, customViewCallback));
        return true;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWebView", "WebChromeClient onExitFullscreen");
        return this.f168655a.m120171x1f05d274();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void h() {
        try {
            xi1.m mVar = this.f168655a.f168739w;
            if (mVar != null) {
                mVar.g();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandWebView", "onHideCustomView error " + e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void p(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9 w9Var = this.f168655a;
        try {
            xi1.m mVar = w9Var.f168739w;
            if (mVar != null) {
                mVar.e(view, 90);
                w9Var.f168739w.b(customViewCallback);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandWebView", "onShowCustomView error " + e17.getMessage());
        }
    }
}
