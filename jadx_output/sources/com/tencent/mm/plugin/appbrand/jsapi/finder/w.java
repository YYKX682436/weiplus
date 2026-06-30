package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public final class w extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1291;
    public static final java.lang.String NAME = "insertFinderWidget";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (jSONObject == null || c0Var == null) {
            return;
        }
        try {
            ((vd2.i5) i95.n0.c(vd2.i5.class)).getClass();
            com.tencent.mm.plugin.appbrand.widget.d0 d0Var = (com.tencent.mm.plugin.appbrand.widget.d0) com.tencent.mm.plugin.finder.view.ck.class.newInstance();
            com.tencent.mm.plugin.appbrand.widget.h hVar = c0Var.t3().I2;
            kotlin.jvm.internal.o.d(d0Var);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            hVar.getClass();
            com.tencent.mm.plugin.appbrand.o6 o6Var = hVar.f91137a;
            if (o6Var.r0() != null) {
                android.app.Activity r07 = o6Var.r0();
                kotlin.jvm.internal.o.d(r07);
                d0Var.b(r07, jSONObject2, new com.tencent.mm.plugin.appbrand.widget.e(d0Var, hVar));
            }
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str, jSONObject3));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertFinderWidget", "insertFinderWidget error, " + e18);
            c0Var.a(i17, o("fail:" + e18));
        }
    }
}
