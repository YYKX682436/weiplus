package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes8.dex */
public class v implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.w f241189a;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.w wVar) {
        this.f241189a = wVar;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        if (i18 != 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.w wVar = this.f241189a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wVar.f241194d.f240835h)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", wVar.f241194d.f240835h);
        j45.l.j(wVar.f241194d.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
