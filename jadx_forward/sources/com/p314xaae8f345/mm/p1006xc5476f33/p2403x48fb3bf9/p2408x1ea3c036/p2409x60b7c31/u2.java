package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class u2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openUrlWithExtraWebview";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenUrlWithExtraWebview", "invokeInOwn");
        java.lang.String optString = bVar.f488130b.f426039c.optString("url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenUrlWithExtraWebview", "url: %s", optString);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            bVar.c("fail", null);
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(optString);
        java.lang.String queryParameter = parse.getQueryParameter("not_in_game_luggage");
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (!queryParameter.equals("1") && (parse.getHost() == null || parse.getHost().equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxy)))) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.t2(this, optString, bVar));
            bVar.a();
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", optString);
            j45.l.j(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488143d, "webview", ".ui.tools.WebViewUI", intent, null);
            bVar.a();
        }
    }
}
