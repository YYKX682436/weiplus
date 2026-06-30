package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes7.dex */
public class g0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1452;
    private static final java.lang.String NAME = "notifyGroupMembers";

    /* renamed from: g, reason: collision with root package name */
    public final int f80394g = cf.b.a(this);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(com.tencent.mm.plugin.appbrand.jsapi.chattool.g0 r17, android.content.Context r18, java.lang.String r19, java.lang.String r20, java.util.LinkedList r21, java.lang.String r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.chattool.g0.C(com.tencent.mm.plugin.appbrand.jsapi.chattool.g0, android.content.Context, java.lang.String, java.lang.String, java.util.LinkedList, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("Luggage.JsApiNotifyGroupMembers", "notifyGroupMembers data: " + jSONObject);
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiNotifyGroupMembers", "notifyGroupMembers fail, env is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiNotifyGroupMembers", "notifyGroupMembers fail, data is null");
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str, jSONObject2));
            return;
        }
        android.content.Context context = e9Var.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiNotifyGroupMembers", "notifyGroupMembers fail, context is null");
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
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.String optString = jSONObject.optString("content", "");
        h0Var.f310123d = optString;
        if (optString == null || optString.length() == 0) {
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 101);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            e9Var.a(i17, u(str, jSONObject4));
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("atUserList");
        if (optJSONArray != null) {
            java.util.Iterator it = e06.p.m(0, optJSONArray.length()).iterator();
            while (((e06.j) it).hasNext()) {
                linkedList.add(optJSONArray.optString(((kz5.x0) it).b(), ""));
            }
        }
        j91.d dVar = (j91.d) e9Var.t3().K1(j91.d.class);
        java.lang.String optString2 = jSONObject.optString("chatToolMode", "");
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        h0Var2.f310123d = "";
        kotlin.jvm.internal.h0 h0Var3 = new kotlin.jvm.internal.h0();
        h0Var3.f310123d = "";
        if (dVar != null) {
            if (kotlin.jvm.internal.o.b(optString2, "allPage") && !((com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar).o(jSONObject)) {
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
            h0Var2.f310123d = tVar.d();
            h0Var3.f310123d = tVar.c();
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.appbrand.jsapi.chattool.d0(jSONObject.optString("userNameType", com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW), linkedList, e9Var, h0Var, this, context, h0Var2, h0Var3, i17, null), 3, null);
    }
}
