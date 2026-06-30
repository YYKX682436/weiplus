package com.tencent.mm.plugin.appbrand.jsapi.video.jsapi;

/* loaded from: classes15.dex */
public class a extends gb1.d {
    public static final int CTRL_INDEX = 6;
    public static final java.lang.String NAME = "insertVideoPlayer";

    @Override // gb1.d, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar.q(com.tencent.mm.plugin.appbrand.wxassistant.q2.class) == null || !((com.tencent.mm.plugin.appbrand.wxassistant.q2) lVar.q(com.tencent.mm.plugin.appbrand.wxassistant.q2.class)).g4()) {
            B(lVar, jSONObject, i17, lVar.getJsRuntime());
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertVideoPlayer", "wx assistant is enabled, return");
        java.lang.String str = android.text.TextUtils.isEmpty("fail:wx assistant is enabled.") ? "fail:internal error" : "fail:wx assistant is enabled.";
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 4);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, u(str, jSONObject2));
    }

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("videoPlayerId");
    }

    @Override // gb1.d
    public android.view.View K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, org.json.JSONObject jSONObject) {
        android.content.Context a17 = com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(tVar.getContext());
        com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar appBrandVideoViewControlBar = new com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar(a17);
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper appBrandVideoWrapper = new com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper(a17, null);
        appBrandVideoWrapper.setVideoFooterView(appBrandVideoViewControlBar);
        java.lang.String optString = jSONObject.optString("playerHint");
        int i17 = 0;
        if (!android.text.TextUtils.isEmpty(optString)) {
            java.lang.String[] split = optString.split(",");
            int length = split.length;
            int i18 = 0;
            while (i17 < length) {
                java.lang.String str = split[i17];
                if ("supportSoftDecode".equals(str.trim())) {
                    i18 |= 1;
                } else if ("mp4Only".equals(str.trim())) {
                    i18 |= 2;
                }
                i17++;
            }
            i17 = i18;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertVideoPlayer", "convertPlayerHint, playerHintStr: %s, playerHint: %d", optString, java.lang.Integer.valueOf(i17));
        appBrandVideoWrapper.setPlayerHint(i17);
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = new com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView(a17, appBrandVideoWrapper);
        appBrandVideoView.k(appBrandVideoViewControlBar);
        return new com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer(a17, appBrandVideoView);
    }

    @Override // gb1.d
    public void N(final com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        int i18;
        oe1.s1 s1Var = new oe1.s1(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertVideoPlayer", "%s onInsertView, data: %s", s1Var, jSONObject);
        final com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = (com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.class);
        if (appBrandVideoView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertVideoPlayer", "%s onInsertView appBrandVideoView null", s1Var);
            return;
        }
        appBrandVideoView.setVideoContext(s1Var);
        boolean optBoolean = jSONObject.optBoolean("independent", false);
        final oe1.s1 s1Var2 = new oe1.s1(i17);
        final com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.c cVar = new com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.c(this);
        final com.tencent.mm.plugin.appbrand.jsapi.x xVar = new com.tencent.mm.plugin.appbrand.jsapi.x() { // from class: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a$$a
            @Override // com.tencent.mm.plugin.appbrand.jsapi.x
            public final void b() {
                com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.this.r();
            }
        };
        final com.tencent.mm.plugin.appbrand.jsapi.v vVar = new com.tencent.mm.plugin.appbrand.jsapi.v() { // from class: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a$$b
            @Override // com.tencent.mm.plugin.appbrand.jsapi.v
            public final void c() {
                com.tencent.mm.plugin.appbrand.w0 d17 = com.tencent.mm.plugin.appbrand.x0.d(com.tencent.mm.plugin.appbrand.jsapi.t.this.getAppId());
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertVideoPlayer", "%s VideoPlayer enter background, pause type:%s", s1Var2, d17.name());
                com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView2 = appBrandVideoView;
                appBrandVideoView2.o("onUIPause, type:%s", d17);
                com.tencent.mm.plugin.appbrand.jsapi.media.w1 U2 = com.tencent.mm.plugin.appbrand.jsapi.media.n.f81944e.U2(appBrandVideoView2.f83538p0, appBrandVideoView2.f83548x0);
                appBrandVideoView2.o("onUIPause, autoPauseStrategy: %s", U2);
                if (U2.a(appBrandVideoView2.f83553z, d17)) {
                    appBrandVideoView2.f83529f.e();
                } else {
                    appBrandVideoView2.o("onUIPause, should skip ui pause", new java.lang.Object[0]);
                    appBrandVideoView2.f83551y0 = true;
                }
            }
        };
        final com.tencent.mm.plugin.appbrand.jsapi.w wVar = new com.tencent.mm.plugin.appbrand.jsapi.w() { // from class: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a$$c
            @Override // com.tencent.mm.plugin.appbrand.jsapi.w
            public final void onDestroy() {
                com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView2 = com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.this;
                appBrandVideoView2.o("onUIDestroy", new java.lang.Object[0]);
                appBrandVideoView2.f();
                cVar.run();
            }
        };
        if (optBoolean) {
            final java.lang.String appId = tVar.getAppId();
            final com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.e eVar = new com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.e(this, vVar, xVar, wVar);
            cVar.f83609d = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a$$d
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.x0.e(appId, eVar);
                }
            };
            com.tencent.mm.plugin.appbrand.x0.a(appId, eVar);
        } else {
            cVar.f83609d = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a$$e
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.jsapi.t tVar2 = com.tencent.mm.plugin.appbrand.jsapi.t.this;
                    tVar2.I(xVar);
                    tVar2.O(vVar);
                    tVar2.K(wVar);
                }
            };
            tVar.U(xVar);
            tVar.R(vVar);
            tVar.w(wVar);
        }
        appBrandVideoView.setFullScreenDelegate(new com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.d(this, tVar, optBoolean, i17, new com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.b(this, appBrandVideoView)));
        appBrandVideoView.setContentDescription(view.getContext().getString(com.tencent.mm.R.string.f490023ir));
        appBrandVideoView.setMute(jSONObject.optBoolean("muted", false));
        boolean optBoolean2 = jSONObject.optBoolean("needEvent", false);
        boolean optBoolean3 = jSONObject.optBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertVideoPlayer", "%s onInsertView autoPlay=%b needEvent=%b", s1Var, java.lang.Boolean.valueOf(optBoolean3), java.lang.Boolean.valueOf(optBoolean2));
        boolean optBoolean4 = jSONObject.optBoolean("showDanmuBtn", false);
        boolean optBoolean5 = jSONObject.optBoolean("enableDanmu", false);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("danmuList");
        java.lang.String optString = jSONObject.optString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT);
        java.lang.String optString2 = jSONObject.optString("poster");
        boolean optBoolean6 = jSONObject.optBoolean("showBasicControls", true);
        java.lang.String optString3 = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        int optInt = jSONObject.optInt(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION, -1);
        boolean optBoolean7 = jSONObject.optBoolean("loop", false);
        boolean optBoolean8 = jSONObject.optBoolean("pageGesture", false);
        boolean optBoolean9 = jSONObject.optBoolean("pageGestureInFullscreen", true);
        double optDouble = jSONObject.optDouble("initialTime", 0.0d);
        boolean optBoolean10 = jSONObject.optBoolean("showProgress", true);
        boolean optBoolean11 = jSONObject.optBoolean("showProgressInControlMode", true);
        boolean optBoolean12 = jSONObject.optBoolean("showFullScreenBtn", true);
        boolean optBoolean13 = jSONObject.optBoolean("showPlayBtn", true);
        boolean optBoolean14 = jSONObject.optBoolean("showCenterPlayBtn", true);
        boolean optBoolean15 = jSONObject.optBoolean("showPoster", false);
        boolean optBoolean16 = jSONObject.optBoolean("enableProgressGesture", true);
        java.lang.String optString4 = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "default");
        boolean optBoolean17 = jSONObject.optBoolean("showMuteBtn", false);
        java.lang.String optString5 = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        boolean optBoolean18 = jSONObject.optBoolean("showControlProgress", true);
        java.lang.String optString6 = jSONObject.optString("playBtnPosition", "bottom");
        boolean optBoolean19 = jSONObject.optBoolean("enablePlayGesture", false);
        boolean optBoolean20 = jSONObject.optBoolean("autoPauseIfNavigate", true);
        boolean optBoolean21 = jSONObject.optBoolean("autoPauseIfOpenNative", true);
        long optLong = jSONObject.optLong("bufferDuration", 10L) * 1000;
        if (optLong <= 0) {
            optLong = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
        }
        java.lang.String optString7 = jSONObject.optString("backgroundColor");
        appBrandVideoView.setComponent(tVar);
        appBrandVideoView.setCookieData(optString3);
        appBrandVideoView.setIsShowBasicControls(optBoolean6);
        appBrandVideoView.v(optString2, optString);
        appBrandVideoView.setFullScreenDirection(optInt);
        appBrandVideoView.setObjectFit(optString);
        appBrandVideoView.setLoop(optBoolean7);
        appBrandVideoView.setPageGesture(optBoolean8);
        appBrandVideoView.setPageGestureInFullscreen(optBoolean9);
        try {
            appBrandVideoView.setVideoPlayerId(jSONObject.getInt("videoPlayerId"));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertVideoPlayer", "inflateView setVideoPlayerId exp=%s", e17);
        }
        appBrandVideoView.setAutoPlay(optBoolean3);
        appBrandVideoView.setShowDanmakuBtn(optBoolean4);
        appBrandVideoView.setDanmakuEnable(optBoolean5);
        appBrandVideoView.setDanmakuItemList(optJSONArray);
        appBrandVideoView.setInitialTime(optDouble);
        appBrandVideoView.setShowControlProgress(optBoolean18);
        appBrandVideoView.setShowProgress(optBoolean10);
        appBrandVideoView.setShowProgressBarInControlMode(optBoolean11);
        appBrandVideoView.setShowFullScreenBtn(optBoolean12);
        appBrandVideoView.setShowPlayBtn(optBoolean13);
        appBrandVideoView.setShowCenterPlayBtn(optBoolean14);
        appBrandVideoView.setShowPoster(optBoolean15);
        appBrandVideoView.g(optBoolean16);
        if (optString4.equalsIgnoreCase("default")) {
            appBrandVideoView.setVideoSource(0);
        } else {
            appBrandVideoView.setVideoSource(1);
        }
        appBrandVideoView.setShowMuteBtn(optBoolean17);
        appBrandVideoView.setTitle(optString5);
        appBrandVideoView.setPlayBtnPosition(optString6);
        appBrandVideoView.setEnablePlayGesture(optBoolean19);
        appBrandVideoView.setAutoPauseIfNavigate(optBoolean20);
        appBrandVideoView.setAutoPauseIfOpenNative(optBoolean21);
        appBrandVideoView.setMinBufferDuration(optLong);
        if (!android.text.TextUtils.isEmpty(optString7)) {
            if (com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT.equals(optString7)) {
                i18 = 0;
            } else {
                try {
                    i18 = android.graphics.Color.parseColor(optString7);
                } catch (java.lang.IllegalArgumentException unused) {
                    i18 = -16777216;
                }
            }
            appBrandVideoView.setBackgroundColor(i18);
        }
        if (optBoolean2) {
            appBrandVideoView.setCallback(new xe1.p(appBrandVideoView, tVar));
        }
        int optInt2 = jSONObject.optInt("duration", -1);
        java.lang.String optString8 = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        boolean optBoolean22 = jSONObject.optBoolean("live", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertVideoPlayer", "%s onInsertView filePath=%s live=%b", s1Var, optString8, java.lang.Boolean.valueOf(optBoolean22));
        appBrandVideoView.w(optString8, optBoolean22, optInt2);
    }
}
