package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes11.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.d f235918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235919e;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.d dVar, java.lang.String str) {
        this.f235918d = dVar;
        this.f235919e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String url = this.f235919e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url, "$url");
        yr3.q qVar = (yr3.q) this.f235918d;
        qVar.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(url)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.putExtra("geta8key_scene", 3);
        intent.putExtra("geta8key_username", qVar.f546518a);
        r45.o5 o5Var = qVar.f546519b;
        intent.putExtra("webpageTitle", o5Var.f463446d);
        java.lang.String str = o5Var.f463454n;
        intent.putExtra("thumbUrl", str == null || r26.n0.N(str) ? o5Var.f463453m : o5Var.f463454n);
        intent.putExtra("prePublishId", "brand_profile");
        intent.putExtra("KPublisherId", "brand_profile");
        intent.putExtra("preChatTYPE", intent.getIntExtra("preChatTYPE", 0));
        intent.putExtra("key_enable_fts_quick", true);
        j45.l.j(qVar.f546520c, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
