package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public class n implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiGetFinderAccount$GetFinderAccountTask f81215a;

    public n(com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiGetFinderAccount$GetFinderAccountTask jsApiGetFinderAccount$GetFinderAccountTask) {
        this.f81215a = jsApiGetFinderAccount$GetFinderAccountTask;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        java.lang.String str = fVar.f70617c;
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiGetFinderAccount", "[JsApiGetFinderAccount] errType=%s errCode=%s errMsg=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiGetFinderAccount$GetFinderAccountTask jsApiGetFinderAccount$GetFinderAccountTask = this.f81215a;
        if (i17 == 0 && i18 == 0) {
            try {
                r45.xb1 xb1Var = (r45.xb1) fVar.f70618d;
                if (xb1Var.getList(1).isEmpty()) {
                    jsApiGetFinderAccount$GetFinderAccountTask.f81160h = com.tencent.mm.plugin.appbrand.jsapi.finder.a.a("not contact", -1, jSONObject);
                } else {
                    jSONObject = pm0.b0.b((com.tencent.mm.protocal.protobuf.FinderContact) xb1Var.getList(1).get(0));
                    jsApiGetFinderAccount$GetFinderAccountTask.f81160h = com.tencent.mm.plugin.appbrand.jsapi.finder.a.a("", 0, jSONObject);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Finder.JsApiGetFinderAccount", e17, "GetFinderAccountTask runInMainProcess", new java.lang.Object[0]);
                jsApiGetFinderAccount$GetFinderAccountTask.f81160h = com.tencent.mm.plugin.appbrand.jsapi.finder.a.a(e17.getMessage(), -1, jSONObject);
            }
        } else if (i17 == 4) {
            jsApiGetFinderAccount$GetFinderAccountTask.f81160h = com.tencent.mm.plugin.appbrand.jsapi.finder.a.a(str, i18, jSONObject);
        } else {
            jsApiGetFinderAccount$GetFinderAccountTask.f81160h = com.tencent.mm.plugin.appbrand.jsapi.finder.a.a(str, -1, jSONObject);
        }
        jsApiGetFinderAccount$GetFinderAccountTask.c();
        return null;
    }
}
