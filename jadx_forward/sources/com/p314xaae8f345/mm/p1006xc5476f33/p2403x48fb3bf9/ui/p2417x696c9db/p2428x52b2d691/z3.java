package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class z3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f268235b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268236c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268238e;

    public z3(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, java.lang.String str2, java.lang.String str3, nw4.k kVar) {
        this.f268234a = str;
        this.f268235b = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f268236c = str2;
        this.f268237d = str3;
        this.f268238e = kVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap(1);
        if (z17) {
            java.lang.String str2 = this.f268234a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                hashMap.put("event", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
            } else {
                hashMap.put("event", ya.b.f77504xbb80cbe3);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5 k5Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.f267837d;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268235b;
                java.lang.String str3 = this.f268236c;
                java.lang.String wi6 = ((qv.a) ((rv.h2) i95.n0.c(rv.h2.class))).wi(this.f268237d);
                g45.b.f350379a.a(str2, str, 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "bobkw shareSendImg: " + wi6);
                ((dk5.s5) tg3.t1.a()).bj(viewOnCreateContextMenuListenerC19337x37f3384d, str2, str3, 1, wi6, "", "", null);
                if (!com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2532xd7a392c5.C20193x3d8621e2.f273747a.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "EnterChattingAfterTrans done config disabled");
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(viewOnCreateContextMenuListenerC19337x37f3384d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), null, viewOnCreateContextMenuListenerC19337x37f3384d, null, null);
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class)).Ai().g(str2);
            }
        } else {
            hashMap.put("event", "canceled");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "initRecentForward-> showShareSnsConfirmDialog for recent forward event:" + hashMap.get("event"));
        nw4.g gVar = this.f268238e.f422396d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        ((nw4.n) gVar).o("onShareEmbedExcerptEvent", hashMap);
    }
}
