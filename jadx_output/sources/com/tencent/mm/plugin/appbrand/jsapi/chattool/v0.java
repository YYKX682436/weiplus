package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes.dex */
public class v0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1451;
    private static final java.lang.String NAME = "selectGroupMembers";

    /* renamed from: g, reason: collision with root package name */
    public final int f80474g = cf.b.a(this);

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(com.tencent.mm.plugin.appbrand.jsapi.chattool.v0 r20, androidx.appcompat.app.AppCompatActivity r21, int r22, java.lang.String r23, java.lang.String r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.chattool.v0.C(com.tencent.mm.plugin.appbrand.jsapi.chattool.v0, androidx.appcompat.app.AppCompatActivity, int, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("Luggage.JsApiSelectGroupMembers", "selectGroupMembers data: " + jSONObject);
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiSelectGroupMembers", "selectGroupMembers fail, env is null");
            return;
        }
        android.content.Context context = e9Var.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiSelectGroupMembers", "selectGroupMembers fail, context is null");
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str, jSONObject2));
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiSelectGroupMembers", "selectGroupMembers fail, data is null");
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i17, u(str, jSONObject3));
            return;
        }
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiSelectGroupMembers", "selectGroupMembers fail, context isn't AppCompatActivity");
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            e9Var.a(i17, u(str, jSONObject4));
            return;
        }
        int optInt = jSONObject.optInt("maxSelectCount", -1);
        j91.d dVar = (j91.d) e9Var.t3().K1(j91.d.class);
        java.lang.String optString = jSONObject.optString("chatToolMode", "");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        if (dVar != null) {
            if (kotlin.jvm.internal.o.b(optString, "allPage") && !((com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar).o(jSONObject)) {
                java.lang.String str6 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                str = str6 != null ? str6 : "";
                java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                try {
                    jSONObject5.put("errno", 101);
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                }
                e9Var.a(i17, u(str, jSONObject5));
                return;
            }
            com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar = (com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar;
            h0Var.f310123d = tVar.d();
            c0Var.f310112d = tVar.g();
        }
        java.lang.String string = context.getString(com.tencent.mm.R.string.mjr);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.appbrand.jsapi.chattool.u0(c0Var, this, context, optInt, h0Var, string, e9Var, i17, null), 3, null);
    }
}
