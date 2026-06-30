package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class y extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 984;
    private static final java.lang.String NAME = "openChannelsPostPage";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsPostPage", "invoke, env is null");
            return;
        }
        android.content.Context context = lVar.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsPostPage", "invoke, context is null");
            lVar.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        if (jSONObject == null || (str = jSONObject.toString()) == null) {
            str = "";
        }
        com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsPostPageRequest openChannelsPostPageRequest = new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsPostPageRequest(str);
        com.tencent.mm.plugin.appbrand.jsapi.channels.x xVar = com.tencent.mm.plugin.appbrand.jsapi.channels.x.f80279a;
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, openChannelsPostPageRequest, xVar, null);
        lVar.a(i17, o("ok"));
    }
}
