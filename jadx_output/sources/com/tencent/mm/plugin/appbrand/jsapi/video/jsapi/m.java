package com.tencent.mm.plugin.appbrand.jsapi.video.jsapi;

/* loaded from: classes15.dex */
public class m extends gb1.h {
    private static final int CTRL_INDEX = 87;
    public static final java.lang.String NAME = "updateVideoPlayer";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("videoPlayerId");
    }

    @Override // gb1.h
    public boolean K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        oe1.s1 s1Var = new oe1.s1(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "%s onUpdateView, data: %s", s1Var, jSONObject);
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiUpdateVideoPlayer", "%s view is not a instance of CoverViewContainer", s1Var);
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = (com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.class);
        if (appBrandVideoView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUpdateVideoPlayer", "%s view not AppBrandVideoView", s1Var);
            return false;
        }
        try {
            if (jSONObject.has("showDanmuBtn")) {
                appBrandVideoView.setShowDanmakuBtn(jSONObject.getBoolean("showDanmuBtn"));
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showDanmuBtn", e17.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("danmuList")) {
                appBrandVideoView.setDanmakuItemList(jSONObject.getJSONArray("danmuList"));
            }
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "danmuList", e18.getLocalizedMessage());
        }
        java.lang.String str = null;
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT)) {
                str = jSONObject.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT);
                appBrandVideoView.setObjectFit(str);
            }
        } catch (org.json.JSONException e19) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT, e19.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY)) {
                appBrandVideoView.setAutoPlay(jSONObject.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY));
            }
        } catch (org.json.JSONException e27) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY, e27.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("showBasicControls")) {
                appBrandVideoView.setIsShowBasicControls(jSONObject.getBoolean("showBasicControls"));
            }
        } catch (org.json.JSONException e28) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showBasicControls", e28.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("poster")) {
                appBrandVideoView.v(jSONObject.getString("poster"), str);
            }
        } catch (org.json.JSONException e29) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "poster", e29.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION)) {
                appBrandVideoView.setFullScreenDirection(jSONObject.getInt(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION));
            }
        } catch (java.lang.Exception e37) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION, e37.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("muted")) {
                appBrandVideoView.setMute(jSONObject.getBoolean("muted"));
            }
        } catch (org.json.JSONException e38) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "muted", e38.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("loop")) {
                appBrandVideoView.setLoop(jSONObject.getBoolean("loop"));
            }
        } catch (org.json.JSONException e39) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "loop", e39.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA)) {
                appBrandVideoView.setCookieData(jSONObject.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
            }
        } catch (org.json.JSONException e47) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, e47.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("pageGesture")) {
                appBrandVideoView.setPageGesture(jSONObject.getBoolean("pageGesture"));
            }
        } catch (org.json.JSONException e48) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "pageGesture", e48.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("pageGestureInFullscreen")) {
                appBrandVideoView.setPageGestureInFullscreen(jSONObject.getBoolean("pageGestureInFullscreen"));
            }
        } catch (org.json.JSONException e49) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "pageGestureInFullscreen", e49.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("showControlProgress")) {
                appBrandVideoView.setShowControlProgress(jSONObject.getBoolean("showControlProgress"));
            }
        } catch (org.json.JSONException e57) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showControlProgress", e57.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("showProgress")) {
                appBrandVideoView.setShowProgress(jSONObject.getBoolean("showProgress"));
            }
        } catch (org.json.JSONException e58) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showProgress", e58.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("showProgressInControlMode")) {
                appBrandVideoView.setShowProgressBarInControlMode(jSONObject.getBoolean("showProgressInControlMode"));
            }
        } catch (org.json.JSONException e59) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showProgressInControlMode", e59.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("showFullScreenBtn")) {
                appBrandVideoView.setShowFullScreenBtn(jSONObject.getBoolean("showFullScreenBtn"));
            }
        } catch (org.json.JSONException e66) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showFullScreenBtn", e66.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("showPlayBtn")) {
                appBrandVideoView.setShowPlayBtn(jSONObject.getBoolean("showPlayBtn"));
            }
        } catch (org.json.JSONException e67) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showPlayBtn", e67.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("showCenterPlayBtn")) {
                appBrandVideoView.setShowCenterPlayBtn(jSONObject.getBoolean("showCenterPlayBtn"));
            }
        } catch (org.json.JSONException e68) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showCenterPlayBtn", e68.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("showPoster")) {
                appBrandVideoView.setShowPoster(jSONObject.getBoolean("showPoster"));
            }
        } catch (org.json.JSONException e69) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showPoster", e69.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("enableProgressGesture")) {
                appBrandVideoView.g(jSONObject.getBoolean("enableProgressGesture"));
            }
        } catch (org.json.JSONException e76) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "enableProgressGesture", e76.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("duration")) {
                appBrandVideoView.setDuration(jSONObject.getInt("duration"));
            }
        } catch (org.json.JSONException e77) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "disableScroll", e77.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("hide") && jSONObject.getBoolean("hide")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "%s onUpdateView hide stop", s1Var);
                appBrandVideoView.y();
            }
        } catch (org.json.JSONException e78) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "hide", e78.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("initialTime")) {
                appBrandVideoView.setInitialTime(jSONObject.getInt("initialTime"));
            }
        } catch (org.json.JSONException e79) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "initialTime", e79.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("needEvent")) {
                if (jSONObject.getBoolean("needEvent")) {
                    if (!(appBrandVideoView.C != null)) {
                        appBrandVideoView.setCallback(new xe1.p(appBrandVideoView, tVar));
                    }
                } else {
                    appBrandVideoView.setCallback(null);
                }
            }
        } catch (org.json.JSONException e86) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "needEvent", e86.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("showMuteBtn")) {
                appBrandVideoView.setShowMuteBtn(jSONObject.getBoolean("showMuteBtn"));
            }
        } catch (org.json.JSONException e87) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showMuteBtn", e87.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                appBrandVideoView.setTitle(jSONObject.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE));
            }
        } catch (org.json.JSONException e88) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, e88.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("playBtnPosition")) {
                appBrandVideoView.setPlayBtnPosition(jSONObject.getString("playBtnPosition"));
            }
        } catch (org.json.JSONException e89) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "playBtnPosition", e89.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("enablePlayGesture")) {
                appBrandVideoView.setEnablePlayGesture(jSONObject.getBoolean("enablePlayGesture"));
            }
        } catch (org.json.JSONException e96) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "enablePlayGesture", e96.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("autoPauseIfOpenNative")) {
                appBrandVideoView.setAutoPauseIfOpenNative(jSONObject.getBoolean("autoPauseIfOpenNative"));
            }
        } catch (org.json.JSONException e97) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "autoPauseIfOpenNative", e97.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("autoPauseIfNavigate")) {
                appBrandVideoView.setAutoPauseIfNavigate(jSONObject.getBoolean("autoPauseIfNavigate"));
            }
        } catch (org.json.JSONException e98) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "autoPauseIfNavigate", e98.getLocalizedMessage());
        }
        try {
            if (!jSONObject.has(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH)) {
                return true;
            }
            appBrandVideoView.w(jSONObject.getString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH), jSONObject.optBoolean("live"), jSONObject.optInt("duration"));
            return true;
        } catch (org.json.JSONException e99) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, e99.getLocalizedMessage());
            return true;
        }
    }
}
