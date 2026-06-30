package com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk;

/* renamed from: com.tencent.xweb.pinus.sdk.WebViewInterface */
/* loaded from: classes13.dex */
public interface InterfaceC27850xbcb12d40 {
    /* renamed from: addDocumentStartJavaScript */
    int mo120320x94c83b13(java.lang.String str, java.lang.String[] strArr);

    /* renamed from: addJavascriptInterface */
    void mo120321x74041feb(java.lang.Object obj, java.lang.String str);

    /* renamed from: canGoBack */
    boolean mo120322xed1a21df();

    /* renamed from: canGoBackOrForward */
    boolean mo120323xb1f4f043(int i17);

    /* renamed from: canGoForward */
    boolean mo120324xc062b2cd();

    /* renamed from: captureLongScreenshot */
    void mo120325x81469de8(android.graphics.Rect rect, android.webkit.ValueCallback<java.lang.Object> valueCallback);

    /* renamed from: clearCache */
    void mo120326xd2bef135(boolean z17);

    /* renamed from: clearFormData */
    void mo120327xf033ebfb();

    /* renamed from: clearHistory */
    void mo120328x35d48587();

    /* renamed from: clearHistory */
    void mo120329x35d48587(int i17, int i18);

    /* renamed from: clearMatches */
    void mo120330x30b32a26();

    /* renamed from: clearSslPreferences */
    void mo120331x3e28c0f9();

    /* renamed from: clearView */
    void mo120332xb4407692();

    /* renamed from: copyBackForwardList */
    android.webkit.WebBackForwardList mo120333xa5deb967();

    /* renamed from: createPrintDocumentAdapter */
    android.print.PrintDocumentAdapter mo120334xbd033a63(java.lang.String str);

    /* renamed from: destroy */
    void mo120335x5cd39ffa();

    boolean dispatchKeyEvent(android.view.KeyEvent keyEvent);

    /* renamed from: documentHasImages */
    void mo120336xe2fa82d7(android.os.Message message);

    /* renamed from: evaluateJavascript */
    void mo120337x738236e6(java.lang.String str, android.webkit.ValueCallback<java.lang.String> valueCallback);

    /* renamed from: findAllAsync */
    void mo120338x72420634(java.lang.String str);

    /* renamed from: findNext */
    void mo120339xd781704c(boolean z17);

    /* renamed from: flingScroll */
    void mo120340xb0da6b49(int i17, int i18);

    /* renamed from: getAccessibilityNodeProvider */
    android.view.accessibility.AccessibilityNodeProvider mo120464x3c1c23cb();

    /* renamed from: getCertificate */
    android.net.http.SslCertificate mo120342x4e358861();

    /* renamed from: getContentHeight */
    int mo120343x964f6f4a();

    /* renamed from: getContentView */
    android.view.ViewGroup mo120344xc2a54588();

    /* renamed from: getFavicon */
    android.graphics.Bitmap mo120345xfdbefdde();

    /* renamed from: getHitTestResultInner */
    java.lang.Object mo120347xb66ce22a();

    /* renamed from: getImageBitmapToFile */
    boolean mo120348x70b214eb(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj);

    /* renamed from: getImageFromDiskCache */
    void mo120349x7a5ae7b6(java.lang.String str, android.webkit.ValueCallback<java.lang.Object> valueCallback);

    /* renamed from: getOriginalUrl */
    java.lang.String mo120350x410b6ca8();

    /* renamed from: getProgress */
    int mo120351x402effa3();

    /* renamed from: getScale */
    float mo120352x7520af94();

    /* renamed from: getSettingsInner */
    java.lang.Object mo120354x98247c3d();

    /* renamed from: getSnapshotFromBrowser */
    boolean mo120355xe991c484(android.webkit.ValueCallback<android.graphics.Bitmap> valueCallback);

    /* renamed from: getTitle */
    java.lang.String mo120356x7531c8a2();

    /* renamed from: getTranslateSampleString */
    void mo120357x3ffbed13(int i17);

    /* renamed from: getUrl */
    java.lang.String mo120358xb5887639();

    /* renamed from: getXWebVirtualTextureContentView */
    java.lang.Object mo120359x5087c4fc();

    /* renamed from: goBack */
    void mo120360xb5fed1ef();

    /* renamed from: goBackOrForward */
    void mo120361x6bed5233(int i17);

    /* renamed from: goForward */
    void mo120362xed0748bd();

    /* renamed from: invokeZoomPicker */
    void mo120363xe84298d9();

    /* renamed from: isPrivateBrowsingEnabled */
    boolean mo120364x82665641();

    /* renamed from: loadData */
    void mo120365x6dfa45b0(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: loadDataWithBaseURL */
    void mo120366x9b341568(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5);

    /* renamed from: loadUrl */
    void mo120367x141096a9(java.lang.String str);

    /* renamed from: loadUrl */
    void mo120368x141096a9(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map);

    /* renamed from: onCheckIsTextEditor */
    boolean mo120465xc12eb2cd();

    /* renamed from: onExtendInputKeyboardHeightChanged */
    void mo120369x8f3469f5(boolean z17, int i17, boolean z18);

    /* renamed from: onExtendTextAreaKeyboardHeightChanged */
    void mo120370xb48ec053(boolean z17, int i17, boolean z18);

    /* renamed from: onHide */
    void mo120371xc39a57c1();

    /* renamed from: onPause */
    void mo120374xb01dfb57();

    /* renamed from: onResume */
    void mo120375x57429eec();

    /* renamed from: onShow */
    void mo120377xc39f557c();

    /* renamed from: onTouchEvent */
    boolean mo120466x667eb1da(android.view.MotionEvent motionEvent);

    /* renamed from: pageDown */
    boolean mo120379x33331bd1(boolean z17);

    /* renamed from: pageUp */
    boolean mo120380xc4a6058a(boolean z17);

    /* renamed from: pauseTimers */
    void mo120381x95772364();

    /* renamed from: postUrl */
    void mo120382xe8ae70af(java.lang.String str, byte[] bArr);

    /* renamed from: reload */
    void mo120383xc84a8199();

    /* renamed from: removeDocumentStartJavaScript */
    void mo120384xc5a18bd0(int i17);

    /* renamed from: removeJavascriptInterface */
    void mo120385x7af55728(java.lang.String str);

    /* renamed from: replaceTranslatedString */
    void mo120386x74101b5b(java.util.Map<java.lang.String, java.lang.String> map);

    /* renamed from: requestFocusNodeHref */
    void mo120387x4a4dcef6(android.os.Message message);

    /* renamed from: requestImageRef */
    void mo120388x6714ace7(android.os.Message message);

    /* renamed from: requestXWebSafeAreaUpdate */
    void mo120261x31f622ee();

    /* renamed from: restoreState */
    android.webkit.WebBackForwardList mo120389x61a06aa3(android.os.Bundle bundle);

    /* renamed from: resumeTimers */
    void mo120390x5aa2005b();

    /* renamed from: savePage */
    boolean mo120391x847491ac(java.lang.String str, java.lang.String str2, int i17);

    /* renamed from: saveState */
    android.webkit.WebBackForwardList mo120392xa507914(android.os.Bundle bundle);

    /* renamed from: saveWebArchive */
    void mo120393x9f2dac2b(java.lang.String str);

    /* renamed from: saveWebArchive */
    void mo120394x9f2dac2b(java.lang.String str, boolean z17, android.webkit.ValueCallback<java.lang.String> valueCallback);

    /* renamed from: setAudioMuted */
    void mo120395x77c16137(boolean z17);

    /* renamed from: setBackgroundColor */
    void mo120467x67f06213(int i17);

    /* renamed from: setBottomHeight */
    void mo120396x9f718b4(int i17);

    /* renamed from: setDownloadListener */
    void mo120399x7619e5de(android.webkit.DownloadListener downloadListener);

    /* renamed from: setExtendInputClient */
    void mo120400x4537a079(java.lang.Object obj);

    /* renamed from: setExtendPluginClient */
    void mo120401x3db3fd1a(java.lang.Object obj);

    /* renamed from: setExtendTextAreaClient */
    void mo120402xb460a101(java.lang.Object obj);

    /* renamed from: setFindListener */
    void mo120403xf031e30f(android.webkit.WebView.FindListener findListener);

    /* renamed from: setHorizontalScrollBarEnable */
    void mo120404x6d0c5823(boolean z17);

    /* renamed from: setInitialScale */
    void mo120405x7e2239e8(int i17);

    /* renamed from: setInputOutOfKeyboardEnable */
    void mo120406x5e593bc7(boolean z17);

    /* renamed from: setNativeDownloadClient */
    void mo120407xbeb5ec(java.lang.Object obj);

    /* renamed from: setNetworkAvailable */
    void mo120408xedbee0bd(boolean z17);

    /* renamed from: setOnTouchListener */
    void mo120468xcc7da8b2(android.view.View.OnTouchListener onTouchListener);

    /* renamed from: setPluginTextureScale */
    void mo120409xc0b8afc4(java.lang.String str, int i17, float f17, float f18);

    /* renamed from: setProxyWebViewClientExtension */
    void mo120410x61f95da7(java.lang.Object obj);

    /* renamed from: setTranslateMode */
    void mo120411x77866acf(boolean z17);

    /* renamed from: setVerticalScrollBarEnable */
    void mo120412x5dab8611(boolean z17);

    /* renamed from: setWebChromeClient */
    void mo120413x6fd49b97(java.lang.Object obj);

    /* renamed from: setWebContentsDebuggingEnabled */
    void mo120414xc9bc595f(boolean z17);

    /* renamed from: setWebContentsSize */
    void mo120415x874abeed(int i17, int i18);

    /* renamed from: setWebViewClient */
    void mo120416x23d27c02(java.lang.Object obj);

    /* renamed from: setWithoutViewMode */
    void mo120417x6693960e(boolean z17);

    /* renamed from: setXWebSafeAreaProvider */
    void mo120418xefce9d29(java.lang.Object obj);

    /* renamed from: smoothScroll */
    void mo120419x328cce1b(int i17, int i18, long j17);

    /* renamed from: stopLoading */
    void mo120420xc77ccada();

    /* renamed from: takePluginScreenshot */
    void mo120421xf63e37a0(java.lang.String str, int i17);

    /* renamed from: view_computeHorizontalScrollOffset */
    int mo120422x1b8b9101();

    /* renamed from: view_computeHorizontalScrollRange */
    int mo120423x19d1c70f();

    /* renamed from: view_computeVerticalScrollExtent */
    int mo120424xcf9a772a();

    /* renamed from: view_computeVerticalScrollOffset */
    int mo120425xdfa71c93();

    /* renamed from: view_computeVerticalScrollRange */
    int mo120426x412d813d();

    /* renamed from: view_scrollBy */
    void mo120427x520c905e(int i17, int i18);

    /* renamed from: view_scrollTo */
    void mo120428x520c9282(int i17, int i18);

    /* renamed from: zoomBy */
    void mo120429xd67f838a(float f17);

    /* renamed from: zoomIn */
    boolean mo120430xd67f8458();

    /* renamed from: zoomOut */
    boolean mo120431xf9711e7b();
}
