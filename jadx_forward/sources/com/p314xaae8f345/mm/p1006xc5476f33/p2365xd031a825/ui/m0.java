package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes7.dex */
public class m0 extends com.p314xaae8f345.p3210x3857dc.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f262017a;

    public m0(android.content.Context context) {
        this.f262017a = context;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public boolean B(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.getStringExtra("rawUrl");
        j45.l.j(this.f262017a, "webview", ".ui.tools.WebViewUI", intent, null);
        return true;
    }
}
