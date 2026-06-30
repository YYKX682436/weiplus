package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class q extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 985;
    private static final java.lang.String NAME = "openChannelsCreateContact";

    public q() {
        si1.e.a(NAME);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsCreateContact", "invoke, env is null");
            return;
        }
        android.content.Context context = lVar.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsCreateContact", "invoke, context is null");
            lVar.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        if (jSONObject == null || (str = jSONObject.toString()) == null) {
            str = "";
        }
        com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsCreateContactRequest openChannelsCreateContactRequest = new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsCreateContactRequest(str);
        com.tencent.mm.plugin.appbrand.jsapi.channels.p pVar = com.tencent.mm.plugin.appbrand.jsapi.channels.p.f80261a;
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, openChannelsCreateContactRequest, pVar, null);
        lVar.a(i17, o("ok"));
    }
}
