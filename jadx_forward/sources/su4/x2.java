package su4;

/* loaded from: classes8.dex */
public class x2 extends com.p314xaae8f345.p3210x3857dc.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f494669a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ su4.e3 f494670b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ su4.d3 f494671c;

    public x2(su4.d3 d3Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, su4.e3 e3Var) {
        this.f494671c = d3Var;
        this.f494669a = c22633x83752a59;
        this.f494670b = e3Var;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public boolean B(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        ((yg0.s4) ((zg0.q3) i95.n0.c(zg0.q3.class))).getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
        if (!nf.z.d(str, "weixin://private/setresult/")) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494671c.f494391a, "handleUrl %s ,view %s", str, c27816xac2547f9.toString());
        this.f494669a.mo14660x738236e6("javascript:WeixinJSBridge._continueSetResult()", null);
        return true;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        java.lang.String str2;
        su4.d3 d3Var = this.f494671c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d3Var.f494391a, "onPageFinished, view %s", c27816xac2547f9.toString());
        d3Var.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f494669a;
        java.lang.Object[] objArr = {c22633x83752a59.toString()};
        java.lang.String str3 = d3Var.f494391a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "begin jsapi init,wv %s", objArr);
        try {
            str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e(c22633x83752a59.getContext().getAssets().open("jsapi/wxjs.js"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str3, e17, "", new java.lang.Object[0]);
            str2 = null;
        }
        if (str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "loadJavaScript fail, jsContent is null");
            return;
        }
        c22633x83752a59.mo14660x738236e6("javascript:".concat(str2), new su4.y2(d3Var, c22633x83752a59));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("javascript:WeixinJSBridge._handleMessageFromWeixin(");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("webview_type", "1");
        hashMap.put("init_url", c22633x83752a59.mo120156xb5887639());
        hashMap.put("init_font_size", "1");
        sb6.append(su4.c3.b("sys:init", hashMap, false, c22633x83752a59.m81403xce19f7b8()));
        sb6.append(")");
        c22633x83752a59.mo14660x738236e6(sb6.toString(), new su4.z2(d3Var, c22633x83752a59));
        c22633x83752a59.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + su4.c3.b("sys:bridged", null, false, c22633x83752a59.m81403xce19f7b8()) + ")", new su4.a3(d3Var, c22633x83752a59));
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
        linkedList.add("onCurrentLocationReady");
        linkedList.add("onClientNavAction");
        linkedList.add("onNavBarShadowManuallyHidden");
        linkedList.add("onChatSearchDataReady");
        linkedList.add("onSearchHistoryReady");
        linkedList.add("onSearchWAWidgetOnTapCallback");
        linkedList.add("onSearchImageListReady");
        linkedList.add("onTeachSearchDataReady");
        linkedList.add("onSearchGuideDataReady");
        linkedList.add("onSearchInputChange");
        linkedList.add("onSearchInputConfirm");
        linkedList.add("onStreamVoiceInputStatus");
        linkedList.add("onSearchSuggestionDataReady");
        linkedList.add("onMusicStatusChanged");
        linkedList.add("switchToTabSearch");
        linkedList.add("onVideoPlayerCallback");
        linkedList.add("onSelectContact");
        linkedList.add("onSearchWAWidgetAttrChanged");
        linkedList.add("onSearchWAWidgetReloadData");
        linkedList.add("onSearchWAWidgetReloadDataFinish");
        linkedList.add("onSearchWAWidgetStateChange");
        linkedList.add("onSearchWAWidgetDataPush");
        linkedList.add("onGetVertSearchEntriesData");
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
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(null)) {
            linkedList.addAll(null);
        }
        hashMap2.put("__runOn3rd_apis", new org.json.JSONArray((java.util.Collection) linkedList));
        sb7.append(su4.c3.b("sys:attach_runOn3rd_apis", hashMap2, false, c22633x83752a59.m81403xce19f7b8()));
        sb7.append(")");
        c22633x83752a59.mo14660x738236e6(sb7.toString(), new su4.b3(d3Var, c22633x83752a59, this.f494670b));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "jsapi init done");
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494671c.f494391a, "onPageStarted, view %s", c27816xac2547f9.toString());
        ((yg0.s4) ((zg0.q3) i95.n0.c(zg0.q3.class))).getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f494669a;
        if (c22633x83752a59 == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w8(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v8(c22633x83752a59)));
    }
}
