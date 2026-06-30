package ag1;

/* loaded from: classes7.dex */
public final class g extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 817;
    public static final java.lang.String NAME = "operateXWebLivePlayerBackground";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.extendplugin.b bVar = new com.tencent.mm.plugin.appbrand.extendplugin.b(i17, jSONObject, lVar, this);
        tf1.f a17 = tf.k.a(bVar);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOperateXWebLivePlayerBackground", "audioOfVideoBackgroundPlayManager is null");
            lVar.a(i17, o("fail:audioOfVideoBackgroundPlayManager is null"));
            return;
        }
        tf.q g17 = a17.g();
        if (g17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOperateXWebLivePlayerBackground", "videoPlayer is null");
            lVar.a(i17, o("fail:videoPlayer is null"));
        } else if (g17 instanceof wf.b) {
            ((wf.b) g17).f(bVar);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOperateXWebLivePlayerBackground", "videoPlayer is not LivePlayerPluginHandler");
            lVar.a(i17, o("fail:videoPlayer is not for XWebLivePlayer"));
        }
    }
}
