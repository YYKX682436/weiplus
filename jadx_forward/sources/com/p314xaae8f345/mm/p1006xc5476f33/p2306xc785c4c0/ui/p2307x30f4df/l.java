package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f256563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j f256564f;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar, java.lang.String str, android.content.Intent intent) {
        this.f256564f = jVar;
        this.f256562d = str;
        this.f256563e = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f256562d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = this.f256564f;
        jVar.Q = com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j.a(jVar, str);
        j45.l.n(jVar.f256519d, "webview", ".ui.tools.WebViewUI", this.f256563e, 16);
    }
}
