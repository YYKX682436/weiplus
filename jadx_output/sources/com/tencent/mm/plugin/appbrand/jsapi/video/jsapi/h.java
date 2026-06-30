package com.tencent.mm.plugin.appbrand.jsapi.video.jsapi;

/* loaded from: classes15.dex */
public class h extends gb1.h {
    private static final int CTRL_INDEX = 114;
    public static final java.lang.String NAME = "operateVideoPlayer";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("videoPlayerId");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // gb1.h
    public boolean K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        char c17;
        oe1.s1 s1Var = new oe1.s1(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateVideoPlayer", "%s onOperateView, data: %s", s1Var, jSONObject);
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateVideoPlayer", "%s view is not a instance of CoverViewContainer", s1Var);
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = (com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.class);
        if (appBrandVideoView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateVideoPlayer", "%s view not AppBrandVideoView", s1Var);
            return false;
        }
        java.lang.String optString = jSONObject.optString("type");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateVideoPlayer", "%s onOperateView operateType=%s", s1Var, optString);
        optString.getClass();
        int i18 = -1;
        switch (optString.hashCode()) {
            case -802181223:
                if (optString.equals("exitFullScreen")) {
                    c17 = 0;
                    break;
                }
                c17 = 65535;
                break;
            case 1222225:
                if (optString.equals("sendDanmu")) {
                    c17 = 1;
                    break;
                }
                c17 = 65535;
                break;
            case 3443508:
                if (optString.equals(com.tencent.tav.core.AssetExtension.SCENE_PLAY)) {
                    c17 = 2;
                    break;
                }
                c17 = 65535;
                break;
            case 3526264:
                if (optString.equals("seek")) {
                    c17 = 3;
                    break;
                }
                c17 = 65535;
                break;
            case 3540994:
                if (optString.equals("stop")) {
                    c17 = 4;
                    break;
                }
                c17 = 65535;
                break;
            case 106440182:
                if (optString.equals("pause")) {
                    c17 = 5;
                    break;
                }
                c17 = 65535;
                break;
            case 458133450:
                if (optString.equals("requestFullScreen")) {
                    c17 = 6;
                    break;
                }
                c17 = 65535;
                break;
            case 1355420059:
                if (optString.equals("playbackRate")) {
                    c17 = 7;
                    break;
                }
                c17 = 65535;
                break;
            default:
                c17 = 65535;
                break;
        }
        switch (c17) {
            case 0:
                appBrandVideoView.s(false, -1);
                return true;
            case 1:
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                if (optJSONArray == null || optJSONArray.length() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateVideoPlayer", "%s onOperateView dataArr nil", s1Var);
                    return false;
                }
                if (optJSONArray.length() == 1) {
                    appBrandVideoView.b(optJSONArray.optString(0, ""), "");
                } else {
                    appBrandVideoView.b(optJSONArray.optString(0, ""), optJSONArray.optString(1, ""));
                }
                return true;
            case 2:
                appBrandVideoView.x();
                return true;
            case 3:
                org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                if (optJSONArray2 == null || optJSONArray2.length() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateVideoPlayer", "%s onOperateView dataArr nil", s1Var);
                    return false;
                }
                double optDouble = optJSONArray2.optDouble(0, -1.0d);
                if (optDouble < 0.0d) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateVideoPlayer", "%s pos invalid %s", s1Var, java.lang.Double.valueOf(optDouble));
                    return false;
                }
                appBrandVideoView.u(optDouble, false);
                return true;
            case 4:
                appBrandVideoView.y();
                return true;
            case 5:
                appBrandVideoView.t();
                return true;
            case 6:
                org.json.JSONArray optJSONArray3 = jSONObject.optJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                if (optJSONArray3 == null || optJSONArray3.length() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateVideoPlayer", "%s onOperateView directionArr nil", s1Var);
                } else {
                    i18 = optJSONArray3.optInt(0, -1);
                }
                appBrandVideoView.s(true, i18);
                return true;
            case 7:
                org.json.JSONArray optJSONArray4 = jSONObject.optJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                if (optJSONArray4 == null || optJSONArray4.length() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateVideoPlayer", "%s onOperateView dataArr nil", s1Var);
                    return false;
                }
                double optDouble2 = optJSONArray4.optDouble(0, -1.0d);
                if (optDouble2 < 0.0d) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateVideoPlayer", "%s rate invalid %f", s1Var, java.lang.Double.valueOf(optDouble2));
                    return false;
                }
                float f17 = (float) optDouble2;
                appBrandVideoView.o("setPlaybackRate %s", java.lang.Float.valueOf(f17));
                appBrandVideoView.f83529f.c(f17);
                return true;
            default:
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateVideoPlayer", "%s onOperateView operateType not supported: %s", s1Var, optString);
                return false;
        }
    }
}
