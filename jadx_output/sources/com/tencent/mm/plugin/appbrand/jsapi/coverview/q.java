package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public class q implements com.tencent.mm.plugin.appbrand.jsapi.coverview.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c01.l2 f80707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f80708b;

    public q(com.tencent.mm.plugin.appbrand.jsapi.coverview.u uVar, c01.l2 l2Var, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f80707a = l2Var;
        this.f80708b = tVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.coverview.c
    public void a(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        com.tencent.mm.plugin.appbrand.jsapi.n5 d0Var = new com.tencent.mm.plugin.appbrand.jsapi.coverview.d0();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str2);
        hashMap.put("stage", str);
        hashMap.put("drag", jSONObject);
        hashMap.put("target", jSONObject2);
        d0Var.t(hashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertImageView", "callback stage:%s, drag:%s, data:%s, target:%s", str, jSONObject, str2, jSONObject2);
        boolean equals = "webview".equals(this.f80707a.f("sendTo", null));
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = this.f80708b;
        if (equals) {
            tVar.p(d0Var);
        } else {
            tVar.i(d0Var, null);
        }
    }
}
