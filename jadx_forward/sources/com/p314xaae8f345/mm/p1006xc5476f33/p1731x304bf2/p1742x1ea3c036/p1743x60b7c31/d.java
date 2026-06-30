package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public final class d extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "addWebViewReportExtInfo";
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
        if (bVar == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("addWebViewReportExtInfo", "invoke");
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("addWebViewReportExtInfo", "data is null");
            bVar.c("null_data", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("webviewReportExtInfoDict");
        if (optString == null || optString.length() == 0) {
            bVar.c("webviewReportExtInfoDict is null", null);
            return;
        }
        sd.a aVar = (sd.a) bVar.f488129a;
        if (!(aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0)) {
            bVar.c("page is not LuggageMMWebPage", null);
            return;
        }
        java.lang.String u17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) aVar).u();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "getUrl(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        e53.e eVar = e53.e.f331165a;
        e53.e.f331168d.put(u17, optString);
        bVar.a();
    }
}
