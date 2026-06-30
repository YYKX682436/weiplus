package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class s9 implements android.webkit.WebChromeClient.CustomViewCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.WebChromeClient.CustomViewCallback f168618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t9 f168619b;

    public s9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t9 t9Var, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        this.f168619b = t9Var;
        this.f168618a = customViewCallback;
    }

    @Override // android.webkit.WebChromeClient.CustomViewCallback
    public void onCustomViewHidden() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t9 t9Var = this.f168619b;
        if (t9Var.f168655a.s()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebView", "WebChromeClient leaveFullscreen");
            t9Var.f168655a.m();
        }
        android.webkit.WebChromeClient.CustomViewCallback customViewCallback = this.f168618a;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
    }
}
