package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes4.dex */
public class i6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.j6 f81308c;

    public i6(com.tencent.mm.plugin.appbrand.jsapi.j6 j6Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f81308c = j6Var;
        this.f81306a = lVar;
        this.f81307b = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.dc7 dc7Var = (r45.dc7) obj;
        com.tencent.mm.plugin.appbrand.jsapi.j6 j6Var = this.f81308c;
        int i17 = this.f81307b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81306a;
        if (dc7Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetSetting", "WxaAppGetAuthInfoReq cgi failed, null response");
            lVar.a(i17, j6Var.o("fail:cgi fail"));
            return null;
        }
        int i18 = dc7Var.BaseResponse.f376959d;
        if (i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetSetting", "WxaAppGetAuthInfoReq cgi failed, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), dc7Var.BaseResponse.f376960e);
            lVar.a(i17, j6Var.o("fail:cgi fail"));
            return null;
        }
        try {
            java.util.LinkedList linkedList = dc7Var.f372315e;
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.vb vbVar = (r45.vb) it.next();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("scope", vbVar.f388058d);
                    jSONObject.put("state", vbVar.f388060f);
                    jSONObject.put("desc", vbVar.f388059e);
                    jSONArray.put(jSONObject);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetSetting", "parse json failed : %s", e17.getMessage());
                }
            }
            java.lang.String jSONArray2 = jSONArray.toString();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errMsg", "getSetting:ok");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (jSONArray2 == null) {
                    jSONArray2 = "";
                }
                jSONObject2.put("authSetting", new org.json.JSONArray(jSONArray2));
                lVar.a(i17, jSONObject2.toString());
                return null;
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiGetSetting", e18, "set json error!", new java.lang.Object[0]);
                lVar.a(i17, j6Var.o("fail:resp invalid"));
                return null;
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
