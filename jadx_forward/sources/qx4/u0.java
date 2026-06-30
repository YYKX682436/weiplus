package qx4;

/* loaded from: classes8.dex */
public final class u0 extends aw4.u {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx4.m0 f448988e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qx4.z0 f448989f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qx4.x0 f448990g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(int i17, qx4.m0 m0Var, qx4.z0 z0Var, qx4.x0 x0Var) {
        super(i17);
        this.f448988e = m0Var;
        this.f448989f = z0Var;
        this.f448990g = x0Var;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public boolean B(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 view, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
        if (!nf.z.d(str, "weixin://private/setresult/")) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "handleUrl %s ,view %s", str, view.toString());
        this.f448990g.mo14660x738236e6("javascript:WeixinJSBridge._continueSetResult()", qx4.t0.f448982a);
        return true;
    }

    @Override // aw4.u, com.p314xaae8f345.p3210x3857dc.h1
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        java.lang.String str2;
        super.n(c27816xac2547f9, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "onPageFinished " + str);
        qx4.m0 m0Var = this.f448988e;
        if (m0Var.f448959b == 2) {
            m0Var.f448964g.set(true);
            return;
        }
        qx4.z0 z0Var = this.f448989f;
        z0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "loadJavaScript");
        try {
            str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("jsapi/wxjs.js"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchPreloadLogic", e17, "", new java.lang.Object[0]);
            str2 = null;
        }
        qx4.p0 p0Var = new qx4.p0(z0Var);
        qx4.x0 x0Var = this.f448990g;
        x0Var.mo14660x738236e6("javascript:" + str2, p0Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("javascript:WeixinJSBridge._handleMessageFromWeixin(");
        qx4.n0 n0Var = qx4.o0.f448967a;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("webview_type", "1");
        hashMap.put("init_url", z0Var.f449009a);
        hashMap.put("init_font_size", "1");
        sb6.append(n0Var.a("sys:init", hashMap));
        sb6.append(')');
        x0Var.mo14660x738236e6(sb6.toString(), new qx4.q0(z0Var));
        x0Var.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + n0Var.a("sys:bridged", null) + ')', new qx4.r0(z0Var));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("javascript:WeixinJSBridge._handleMessageFromWeixin(");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("menu:share:timeline");
        linkedList.add("menu:share:appmessage");
        linkedList.add("menu:share:weiboApp");
        linkedList.add("menu:share:QZone");
        linkedList.add("menu:share:qq");
        linkedList.add("onVoiceRecordEnd");
        linkedList.add("onVoicePlayBegin");
        linkedList.add("onVoicePlayEnd");
        linkedList.add("onLocalImageUploadProgress");
        linkedList.add("onImageDownloadProgress");
        linkedList.add("onVoiceUploadProgress");
        linkedList.add("onVoiceDownloadProgress");
        linkedList.add("onVideoUploadProgress");
        linkedList.add("onMediaFileUploadProgress");
        linkedList.add("menu:setfont");
        linkedList.add("menu:share:weibo");
        linkedList.add("menu:share:email");
        linkedList.add("wxdownload:state_change");
        linkedList.add("wxdownload:progress_change");
        linkedList.add("hdOnDeviceStateChanged");
        linkedList.add("activity:state_change");
        linkedList.add("onWXDeviceBluetoothStateChange");
        linkedList.add("onWXDeviceLanStateChange");
        linkedList.add("onWXDeviceBindStateChange");
        linkedList.add("onReceiveDataFromWXDevice");
        linkedList.add("onScanWXDeviceResult");
        linkedList.add("onWXDeviceStateChange");
        linkedList.add("onNfcTouch");
        linkedList.add("onBeaconMonitoring");
        linkedList.add("onBeaconsInRange");
        linkedList.add("menu:custom");
        linkedList.add("onSearchWAWidgetOpenApp");
        linkedList.add("onSearchDataReady");
        linkedList.add("onClientNavAction");
        linkedList.add("onNavBarShadowManuallyHidden");
        linkedList.add("onGetVertSearchEntriesData");
        linkedList.add("onChatSearchDataReady");
        linkedList.add("onSearchHistoryReady");
        linkedList.add("onSearchWAWidgetOnTapCallback");
        linkedList.add("onSearchImageListReady");
        linkedList.add("onTeachSearchDataReady");
        linkedList.add("onSearchGuideDataReady");
        linkedList.add("onSearchInputChange");
        linkedList.add("onSearchInputConfirm");
        linkedList.add("onSearchSuggestionDataReady");
        linkedList.add("onMusicStatusChanged");
        linkedList.add("onStreamVoiceInputStatus");
        linkedList.add("switchToTabSearch");
        linkedList.add("onVideoPlayerCallback");
        linkedList.add("onDeviceMotionFired");
        linkedList.add("onCurrentLocationReady");
        linkedList.add("onSelectContact");
        linkedList.add("onSearchWAWidgetAttrChanged");
        linkedList.add("onSearchWAWidgetReloadData");
        linkedList.add("onSearchWAWidgetReloadDataFinish");
        linkedList.add("onSearchWAWidgetStateChange");
        linkedList.add("onSearchWAWidgetDataPush");
        linkedList.add("emoticonIsChosen");
        linkedList.add("onSimilarEmoticonReady");
        linkedList.add("onSearchWebQueryReady");
        linkedList.add("onPullDownRefresh");
        linkedList.add(pf1.r.f76415x24728b);
        linkedList.add("onGetKeyboardHeight");
        linkedList.add(hc1.d.f69825x24728b);
        linkedList.add("onAddShortcutStatus");
        linkedList.add("onFocusSearchInput");
        linkedList.add("onGetA8KeyUrl");
        linkedList.add("deleteAccountSuccess");
        linkedList.add("onGetMsgProofItems");
        linkedList.add("WNJSHandlerInsert");
        linkedList.add("WNJSHandlerMultiInsert");
        linkedList.add("WNJSHandlerExportData");
        linkedList.add("WNJSHandlerHeaderAndFooterChange");
        linkedList.add("WNJSHandlerEditableChange");
        linkedList.add("WNJSHandlerEditingChange");
        linkedList.add("WNJSHandlerSaveSelectionRange");
        linkedList.add("WNJSHandlerLoadSelectionRange");
        linkedList.add("onCustomGameMenuClicked");
        linkedList.add("onNewlifeFeedStatusChanged");
        linkedList.add("onTingAudioStateChanged");
        linkedList.add("onFinderViewEvent");
        linkedList.add("onShareResult");
        linkedList.add("onShareButtonClick");
        linkedList.addAll(kz5.c0.i("onBrightnessChange", "onExitFullscreen", "onEnterFullscreen", "onFinderFeedInfoUpdated", "onEnterFinderFullscreen", "onExitFinderFullscreen", "onOrientationsChange", "onPlayerProcessStateChanged", "onVideoDownStreamChange", "onVideoEnded", "onVideoError", "onVideoLoadedMetaData", "onVideoPause", "onVideoPlay", "onVideoPreLoadedMetaData", "onVideoBufferUpdate", "onVideoSeekEnd", "onVideoSizeChange", "onVideoTimeUpdate", "onVideoWaiting", "onVolumeChange", "onXWebLivePlayerEvent", "onXWebLivePlayerNetStatus"));
        linkedList.add("showLoading");
        linkedList.add("getSearchEmotionDataCallBack");
        linkedList.add("onNavigationBarRightButtonClick");
        linkedList.add("onSearchActionSheetClick");
        linkedList.add("onGetMatchContactList");
        linkedList.add("onUiInit");
        linkedList.add("onUserToggleFullScreen");
        linkedList.add("onHalfScreenHeightWillChange");
        linkedList.add("onHalfScreenHeightIsChanging");
        linkedList.add("onHalfScreenHeightDidChange");
        linkedList.add("onCircleToSearchEvent");
        linkedList.add("onScreenShotJump");
        linkedList.add("onNetWorkChange");
        linkedList.add("onBackgroundAudioStateChange");
        hashMap2.put("__runOn3rd_apis", new org.json.JSONArray((java.util.Collection) linkedList));
        sb7.append(n0Var.a("sys:attach_runOn3rd_apis", hashMap2));
        sb7.append(')');
        x0Var.mo14660x738236e6(sb7.toString(), new qx4.s0(z0Var));
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 view, java.lang.String str, android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "onPageStarted " + str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
        qx4.x0 x0Var = this.f448990g;
        if (x0Var == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w8(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v8(x0Var)));
    }
}
