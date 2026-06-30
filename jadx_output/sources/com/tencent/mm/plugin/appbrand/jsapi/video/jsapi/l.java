package com.tencent.mm.plugin.appbrand.jsapi.video.jsapi;

/* loaded from: classes7.dex */
public class l extends gb1.f {
    private static final int CTRL_INDEX = 7;
    public static final java.lang.String NAME = "removeVideoPlayer";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("videoPlayerId", 0);
    }

    @Override // gb1.f
    public boolean J(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        oe1.s1 s1Var = new oe1.s1(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRemoveVideoPlayer", "%s onRemoveView, data: %s", s1Var, jSONObject);
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiRemoveVideoPlayer", "%s view is not a instance of CoverViewContainer", s1Var);
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = (com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.class);
        if (appBrandVideoView == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiRemoveVideoPlayer", "%s view not AppBrandVideoView", s1Var);
            return false;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.k(this, appBrandVideoView));
        return true;
    }
}
