package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class ec implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI f109978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f109979e;

    public ec(com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI, java.lang.String str) {
        this.f109978d = finderLivePrecheckLicenseUI;
        this.f109979e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f109978d.f109403v;
        if (mMWebView != null) {
            mMWebView.loadUrl(this.f109979e);
        }
    }
}
