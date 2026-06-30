package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f182238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.p f182239e;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.p pVar, android.content.Intent intent) {
        this.f182239e = pVar;
        this.f182238d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.p pVar = this.f182239e;
        j45.l.j(pVar.f182308e, "webview", ".ui.tools.WebViewUI", this.f182238d, null);
        pVar.f182308e.finish();
    }
}
