package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class c4 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c01.l2 f267536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267537f;

    public c4(java.lang.String str, c01.l2 l2Var, nw4.k kVar) {
        this.f267535d = str;
        this.f267536e = l2Var;
        this.f267537f = kVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.f267838e) {
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("event", i18 != -1 ? i18 != 0 ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d : "canceled" : ya.b.f77504xbb80cbe3);
            java.lang.String str = this.f267535d;
            if (str != null) {
                ta4.w wVar = ta4.v.f498379a;
                if (wVar.f498380a != -1) {
                    jx3.f.INSTANCE.d(28358, 3, java.lang.Integer.valueOf(wVar.f498380a), java.net.URLEncoder.encode(str));
                }
                wVar.f498380a = -1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "shareExcerpts resultCode:" + i18 + " event:" + this.f267536e.b("event"));
            nw4.g gVar = this.f267537f.f422396d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
            ((nw4.n) gVar).o("onShareEmbedExcerptEvent", hashMap);
        }
    }
}
