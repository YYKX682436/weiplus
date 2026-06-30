package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "kotlin.jvm.PlatformType", "it", "Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiAddVideoToFavorites$DoFavoriteParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class i3<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.i3 f81304a = new com.tencent.mm.plugin.appbrand.jsapi.i3();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        com.tencent.mm.plugin.appbrand.jsapi.JsApiAddVideoToFavorites$DoFavoriteParams jsApiAddVideoToFavorites$DoFavoriteParams = (com.tencent.mm.plugin.appbrand.jsapi.JsApiAddVideoToFavorites$DoFavoriteParams) obj;
        try {
            i17 = com.tencent.mm.plugin.appbrand.jsapi.p3.a(jsApiAddVideoToFavorites$DoFavoriteParams.f78512d, jsApiAddVideoToFavorites$DoFavoriteParams.f78513e);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "doFavoriteMainProcess, fail since " + e17);
            i17 = Integer.MIN_VALUE;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "doFavoriteMainProcess, result: " + i17);
        return new com.tencent.mm.ipcinvoker.type.IPCInteger(i17);
    }
}
