package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f290437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21357x5e7365bb f290438e;

    public i5(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb, android.content.Intent intent) {
        this.f290438e = c21357x5e7365bb;
        this.f290437d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        j45.l.j(this.f290438e.mo7438x76847179(), "webview", ".ui.tools.WebViewUI", this.f290437d, null);
    }
}
