package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes4.dex */
public final class ze implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f83960b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f83961c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.af f83962d;

    public ze(java.lang.String str, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.af afVar) {
        this.f83959a = str;
        this.f83960b = e9Var;
        this.f83961c = i17;
        this.f83962d = afVar;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        r45.tx6 tx6Var = (r45.tx6) obj;
        com.tencent.mm.plugin.appbrand.jsapi.af afVar = this.f83962d;
        int i17 = this.f83961c;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f83960b;
        java.lang.String str = this.f83959a;
        if (tx6Var == null) {
            com.tencent.mars.xlog.Log.e("Luggage.WXA.FULLSDK.JsApiVerifyPlugin", str + " null response");
            e9Var.a(i17, afVar.o("fail:internal error"));
            return;
        }
        if (tx6Var.BaseResponse.f376959d != 0) {
            com.tencent.mars.xlog.Log.e("Luggage.WXA.FULLSDK.JsApiVerifyPlugin", str + " cgi failed, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(tx6Var.BaseResponse.f376959d), tx6Var.BaseResponse.f376960e);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail cgi fail Ret=");
            sb6.append(tx6Var.BaseResponse.f376959d);
            e9Var.a(i17, afVar.o(sb6.toString()));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            com.tencent.mars.xlog.Log.i("Luggage.WXA.FULLSDK.JsApiVerifyPlugin", str + " cgi ok, dataSize[" + tx6Var.f386858d.length() + ']');
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, new org.json.JSONObject(tx6Var.f386858d));
            e9Var.a(i17, afVar.p("ok", hashMap));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Luggage.WXA.FULLSDK.JsApiVerifyPlugin", str + " cgi ok but get exception[" + e17 + ']');
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("fail:internal error ");
            sb7.append(e17);
            e9Var.a(i17, afVar.o(sb7.toString()));
        }
    }
}
