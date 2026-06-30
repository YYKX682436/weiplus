package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class i4 extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 410;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "batchGetContact";

    static {
        new com.tencent.mm.plugin.appbrand.jsapi.u3(null);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (yVar == null) {
            return;
        }
        if (jSONObject == null) {
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("appIds");
        if (optJSONArray != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int length = optJSONArray.length();
            int i18 = 0;
            while (true) {
                java.lang.String str = null;
                if (i18 >= length) {
                    break;
                }
                java.lang.Object opt = optJSONArray.opt(i18);
                if (opt != null && !kotlin.jvm.internal.o.b(org.json.JSONObject.NULL, opt)) {
                    str = opt.toString();
                }
                if (!(str == null || str.length() == 0)) {
                    linkedList.add(str);
                }
                i18++;
            }
            if (linkedList.isEmpty()) {
                linkedList = null;
            }
            if (linkedList != null) {
                java.lang.String uuid = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.o.f(uuid, "toString(...)");
                com.tencent.mm.plugin.appbrand.networking.c0 c0Var = (com.tencent.mm.plugin.appbrand.networking.c0) yVar.q(com.tencent.mm.plugin.appbrand.networking.c0.class);
                if (c0Var == null) {
                    yVar.a(i17, o("fail:internal error"));
                    return;
                }
                java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(yVar);
                com.tencent.mm.plugin.appbrand.jsapi.g4 g4Var = new com.tencent.mm.plugin.appbrand.jsapi.g4(weakReference, i17, this, uuid);
                com.tencent.mars.xlog.Log.i("Luggage.FULL.JsApiBatchGetContact", "Loader(" + i17 + ").load(), hostWxaAppId[" + yVar.getAppId() + "], eventCallbackId[" + uuid + "] appIds[" + u46.l.i(linkedList.iterator(), ",") + ']');
                java.lang.String appId = yVar.getAppId();
                kotlin.jvm.internal.o.f(appId, "getAppId(...)");
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.jsapi.y3(new com.tencent.mm.plugin.appbrand.jsapi.b4(appId, i17, linkedList, c0Var), new com.tencent.mm.plugin.appbrand.jsapi.f4(i17, weakReference, this), new com.tencent.mm.plugin.appbrand.jsapi.c4(i17, g4Var), new com.tencent.mm.plugin.appbrand.jsapi.e4(i17, weakReference, uuid), new com.tencent.mm.plugin.appbrand.jsapi.d4(i17, g4Var, weakReference, uuid)));
                return;
            }
        }
        yVar.a(i17, o("fail:appIds is empty"));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
