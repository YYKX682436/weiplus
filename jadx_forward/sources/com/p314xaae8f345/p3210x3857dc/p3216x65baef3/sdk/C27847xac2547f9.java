package com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk;

/* renamed from: com.tencent.xweb.pinus.sdk.WebView */
/* loaded from: classes13.dex */
public class C27847xac2547f9 extends android.widget.FrameLayout implements com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40, com.p314xaae8f345.p3210x3857dc.i2 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f61139x7118e671 = false;
    private static final java.lang.String TAG = "Pinus.WebView";

    /* renamed from: constructorParams */
    private final java.util.ArrayList<java.lang.Object> f61140x6e7b5a20;

    /* renamed from: constructorTypes */
    private final java.util.ArrayList<java.lang.Object> f61141xf34f7c9f;

    /* renamed from: coreWrapper */
    private com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1 f61142x44eb6bf4;

    /* renamed from: inner */
    private java.lang.Object f61143x5fb4e56;

    /* renamed from: mOverScrolledListener */
    private com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.a0 f61144xaebfc601;

    /* renamed from: mScrollChangedListener */
    private com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.b0 f61145x6ec31a8e;

    /* renamed from: reflectInterface */
    private com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40 f61146x6860fafc;

    /* renamed from: webSettings */
    private com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.u f61147xb2d85797;

    public C27847xac2547f9(android.content.Context context) {
        super(context, null);
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        this.f61141xf34f7c9f = arrayList;
        arrayList.add(android.content.Context.class);
        java.util.ArrayList<java.lang.Object> arrayList2 = new java.util.ArrayList<>();
        this.f61140x6e7b5a20 = arrayList2;
        arrayList2.add(context);
        m120318x316510();
    }

    /* renamed from: init */
    private void m120318x316510() {
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1 m120281x9cf0d20b = com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1.m120281x9cf0d20b();
        this.f61142x44eb6bf4 = m120281x9cf0d20b;
        if (m120281x9cf0d20b == null) {
            return;
        }
        int size = this.f61141xf34f7c9f.size();
        java.lang.Class[] clsArr = new java.lang.Class[size + 1];
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.Object obj = this.f61141xf34f7c9f.get(i17);
            if (obj instanceof java.lang.String) {
                clsArr[i17] = this.f61142x44eb6bf4.m120198xfefc2a39((java.lang.String) obj);
                java.util.ArrayList<java.lang.Object> arrayList = this.f61140x6e7b5a20;
                arrayList.set(i17, this.f61142x44eb6bf4.m120199xf47a3a9e(arrayList.get(i17)));
            } else if (obj instanceof java.lang.Class) {
                clsArr[i17] = (java.lang.Class) obj;
            }
        }
        clsArr[size] = java.lang.Object.class;
        this.f61140x6e7b5a20.add(this);
        try {
            java.lang.Object a17 = new by5.h0(this.f61142x44eb6bf4.m120198xfefc2a39("PSWebview"), clsArr).a(this.f61140x6e7b5a20.toArray());
            this.f61143x5fb4e56 = a17;
            addView((android.widget.FrameLayout) a17, new android.widget.FrameLayout.LayoutParams(-1, -1));
            com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.d0 d0Var = new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.d0(this.f61143x5fb4e56);
            this.f61146x6860fafc = d0Var;
            this.f61147xb2d85797 = new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.v(d0Var.mo120354x98247c3d());
        } catch (java.lang.Throwable th6) {
            by5.c4.d(TAG, "init, error", th6);
        }
    }

    /* renamed from: performLongClickDelegate */
    private boolean m120319xc9d3b8b0() {
        return performLongClick();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: addDocumentStartJavaScript */
    public int mo120320x94c83b13(java.lang.String str, java.lang.String[] strArr) {
        return this.f61146x6860fafc.mo120320x94c83b13(str, strArr);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: addJavascriptInterface */
    public void mo120321x74041feb(java.lang.Object obj, java.lang.String str) {
        this.f61146x6860fafc.mo120321x74041feb(obj, str);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: canGoBack */
    public boolean mo120322xed1a21df() {
        return this.f61146x6860fafc.mo120322xed1a21df();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: canGoBackOrForward */
    public boolean mo120323xb1f4f043(int i17) {
        return this.f61146x6860fafc.mo120323xb1f4f043(i17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: canGoForward */
    public boolean mo120324xc062b2cd() {
        return this.f61146x6860fafc.mo120324xc062b2cd();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: captureLongScreenshot */
    public void mo120325x81469de8(android.graphics.Rect rect, android.webkit.ValueCallback<java.lang.Object> valueCallback) {
        this.f61146x6860fafc.mo120325x81469de8(rect, valueCallback);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: clearCache */
    public void mo120326xd2bef135(boolean z17) {
        this.f61146x6860fafc.mo120326xd2bef135(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: clearFormData */
    public void mo120327xf033ebfb() {
        this.f61146x6860fafc.mo120327xf033ebfb();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: clearHistory */
    public void mo120328x35d48587() {
        this.f61146x6860fafc.mo120328x35d48587();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: clearMatches */
    public void mo120330x30b32a26() {
        this.f61146x6860fafc.mo120330x30b32a26();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: clearSslPreferences */
    public void mo120331x3e28c0f9() {
        this.f61146x6860fafc.mo120331x3e28c0f9();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: clearView */
    public void mo120332xb4407692() {
        this.f61146x6860fafc.mo120332xb4407692();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return mo120422x1b8b9101();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return mo120423x19d1c70f();
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return mo120424xcf9a772a();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return mo120425xdfa71c93();
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        return mo120426x412d813d();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: copyBackForwardList */
    public android.webkit.WebBackForwardList mo120333xa5deb967() {
        return this.f61146x6860fafc.mo120333xa5deb967();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: createPrintDocumentAdapter */
    public android.print.PrintDocumentAdapter mo120334xbd033a63(java.lang.String str) {
        return this.f61146x6860fafc.mo120334xbd033a63(str);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: destroy */
    public void mo120335x5cd39ffa() {
        this.f61146x6860fafc.mo120335x5cd39ffa();
    }

    @Override // android.view.ViewGroup, android.view.View, com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.f61146x6860fafc.dispatchKeyEvent(keyEvent);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: documentHasImages */
    public void mo120336xe2fa82d7(android.os.Message message) {
        this.f61146x6860fafc.mo120336xe2fa82d7(message);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: evaluateJavascript */
    public void mo120337x738236e6(java.lang.String str, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        this.f61146x6860fafc.mo120337x738236e6(str, valueCallback);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: findAllAsync */
    public void mo120338x72420634(java.lang.String str) {
        this.f61146x6860fafc.mo120338x72420634(str);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: findNext */
    public void mo120339xd781704c(boolean z17) {
        this.f61146x6860fafc.mo120339xd781704c(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: flingScroll */
    public void mo120340xb0da6b49(int i17, int i18) {
        this.f61146x6860fafc.mo120340xb0da6b49(i17, i18);
    }

    @Override // android.view.View, com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: getAccessibilityNodeProvider */
    public android.view.accessibility.AccessibilityNodeProvider mo120464x3c1c23cb() {
        return this.f61146x6860fafc.mo120464x3c1c23cb();
    }

    /* renamed from: getBridge */
    public java.lang.Object m120341x12c9c67f() {
        return this.f61143x5fb4e56;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: getCertificate */
    public android.net.http.SslCertificate mo120342x4e358861() {
        return this.f61146x6860fafc.mo120342x4e358861();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: getContentHeight */
    public int mo120343x964f6f4a() {
        return this.f61146x6860fafc.mo120343x964f6f4a();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: getContentView */
    public android.view.ViewGroup mo120344xc2a54588() {
        return this.f61146x6860fafc.mo120344xc2a54588();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: getFavicon */
    public android.graphics.Bitmap mo120345xfdbefdde() {
        return this.f61146x6860fafc.mo120345xfdbefdde();
    }

    /* renamed from: getHitTestResult */
    public com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.e m120346x1d5dd38c() {
        return new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.f(this.f61146x6860fafc.mo120347xb66ce22a());
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: getHitTestResultInner */
    public java.lang.Object mo120347xb66ce22a() {
        return this.f61146x6860fafc.mo120347xb66ce22a();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: getImageBitmapToFile */
    public boolean mo120348x70b214eb(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj) {
        return this.f61146x6860fafc.mo120348x70b214eb(str, str2, str3, obj);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: getImageFromDiskCache */
    public void mo120349x7a5ae7b6(java.lang.String str, android.webkit.ValueCallback<java.lang.Object> valueCallback) {
        this.f61146x6860fafc.mo120349x7a5ae7b6(str, valueCallback);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: getOriginalUrl */
    public java.lang.String mo120350x410b6ca8() {
        return this.f61146x6860fafc.mo120350x410b6ca8();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: getProgress */
    public int mo120351x402effa3() {
        return this.f61146x6860fafc.mo120351x402effa3();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: getScale */
    public float mo120352x7520af94() {
        return this.f61146x6860fafc.mo120352x7520af94();
    }

    /* renamed from: getSettings */
    public com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.u m120353xd15cf999() {
        return this.f61147xb2d85797;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: getSettingsInner */
    public java.lang.Object mo120354x98247c3d() {
        return this.f61146x6860fafc.mo120354x98247c3d();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: getSnapshotFromBrowser */
    public boolean mo120355xe991c484(android.webkit.ValueCallback<android.graphics.Bitmap> valueCallback) {
        return this.f61146x6860fafc.mo120355xe991c484(valueCallback);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: getTitle */
    public java.lang.String mo120356x7531c8a2() {
        return this.f61146x6860fafc.mo120356x7531c8a2();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: getTranslateSampleString */
    public void mo120357x3ffbed13(int i17) {
        this.f61146x6860fafc.mo120357x3ffbed13(i17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: getUrl */
    public java.lang.String mo120358xb5887639() {
        return this.f61146x6860fafc.mo120358xb5887639();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: goBack */
    public void mo120360xb5fed1ef() {
        this.f61146x6860fafc.mo120360xb5fed1ef();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: goBackOrForward */
    public void mo120361x6bed5233(int i17) {
        this.f61146x6860fafc.mo120361x6bed5233(i17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: goForward */
    public void mo120362xed0748bd() {
        this.f61146x6860fafc.mo120362xed0748bd();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: invokeZoomPicker */
    public void mo120363xe84298d9() {
        this.f61146x6860fafc.mo120363xe84298d9();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: isPrivateBrowsingEnabled */
    public boolean mo120364x82665641() {
        return this.f61146x6860fafc.mo120364x82665641();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: loadData */
    public void mo120365x6dfa45b0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f61146x6860fafc.mo120365x6dfa45b0(str, str2, str3);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: loadDataWithBaseURL */
    public void mo120366x9b341568(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f61146x6860fafc.mo120366x9b341568(str, str2, str3, str4, str5);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: loadUrl */
    public void mo120367x141096a9(java.lang.String str) {
        this.f61146x6860fafc.mo120367x141096a9(str);
    }

    @Override // android.view.View, com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: onCheckIsTextEditor */
    public boolean mo120465xc12eb2cd() {
        return this.f61146x6860fafc.mo120465xc12eb2cd();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: onExtendInputKeyboardHeightChanged */
    public void mo120369x8f3469f5(boolean z17, int i17, boolean z18) {
        this.f61146x6860fafc.mo120369x8f3469f5(z17, i17, z18);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: onExtendTextAreaKeyboardHeightChanged */
    public void mo120370xb48ec053(boolean z17, int i17, boolean z18) {
        this.f61146x6860fafc.mo120370xb48ec053(z17, i17, z18);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: onHide */
    public void mo120371xc39a57c1() {
        this.f61146x6860fafc.mo120371xc39a57c1();
    }

    /* renamed from: onOverScrolledDelegate */
    public void m120372xefedbf44(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
        com.p314xaae8f345.p3210x3857dc.g1 g1Var;
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.a0 a0Var = this.f61144xaebfc601;
        if (a0Var == null || (g1Var = ((vx5.z) a0Var).f522931a.f522892m) == null) {
            return;
        }
        g1Var.e(i17, i18, z17, z18, view);
    }

    /* renamed from: onOverscrollRefresh */
    public void m120373xe5937adb(boolean z17) {
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.a0 a0Var = this.f61144xaebfc601;
        if (a0Var != null) {
            ((vx5.z) a0Var).f522931a.f522896q = z17;
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: onPause */
    public void mo120374xb01dfb57() {
        this.f61146x6860fafc.mo120374xb01dfb57();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: onResume */
    public void mo120375x57429eec() {
        this.f61146x6860fafc.mo120375x57429eec();
    }

    /* renamed from: onScrollChangedDelegate */
    public void m120376x163612d(int i17, int i18, int i19, int i27) {
        onScrollChanged(i17, i18, i19, i27);
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.b0 b0Var = this.f61145x6ec31a8e;
        if (b0Var != null) {
            vx5.i0 i0Var = ((vx5.y) b0Var).f522930a;
            i0Var.f522889g.scrollTo(i17, i18);
            com.p314xaae8f345.p3210x3857dc.g1 g1Var = i0Var.f522892m;
            if (g1Var != null) {
                g1Var.d(i17, i18, i19, i27, i0Var.f522888f);
            }
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: onShow */
    public void mo120377xc39f557c() {
        this.f61146x6860fafc.mo120377xc39f557c();
    }

    @Override // android.view.View, com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: onTouchEvent */
    public boolean mo120466x667eb1da(android.view.MotionEvent motionEvent) {
        return this.f61146x6860fafc.mo120466x667eb1da(motionEvent);
    }

    /* renamed from: overScrollByDelegate */
    public boolean m120378xea05c69d(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, android.view.View view) {
        com.p314xaae8f345.p3210x3857dc.g1 g1Var;
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.a0 a0Var = this.f61144xaebfc601;
        if (a0Var == null || (g1Var = ((vx5.z) a0Var).f522931a.f522892m) == null) {
            return false;
        }
        return g1Var.a(i17, i18, i19, i27, i28, i29, i37, i38, z17, view);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: pageDown */
    public boolean mo120379x33331bd1(boolean z17) {
        return this.f61146x6860fafc.mo120379x33331bd1(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: pageUp */
    public boolean mo120380xc4a6058a(boolean z17) {
        return this.f61146x6860fafc.mo120380xc4a6058a(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: pauseTimers */
    public void mo120381x95772364() {
        this.f61146x6860fafc.mo120381x95772364();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: postUrl */
    public void mo120382xe8ae70af(java.lang.String str, byte[] bArr) {
        this.f61146x6860fafc.mo120382xe8ae70af(str, bArr);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: reload */
    public void mo120383xc84a8199() {
        this.f61146x6860fafc.mo120383xc84a8199();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: removeDocumentStartJavaScript */
    public void mo120384xc5a18bd0(int i17) {
        this.f61146x6860fafc.mo120384xc5a18bd0(i17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: removeJavascriptInterface */
    public void mo120385x7af55728(java.lang.String str) {
        this.f61146x6860fafc.mo120385x7af55728(str);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: replaceTranslatedString */
    public void mo120386x74101b5b(java.util.Map<java.lang.String, java.lang.String> map) {
        this.f61146x6860fafc.mo120386x74101b5b(map);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: requestFocusNodeHref */
    public void mo120387x4a4dcef6(android.os.Message message) {
        this.f61146x6860fafc.mo120387x4a4dcef6(message);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: requestImageRef */
    public void mo120388x6714ace7(android.os.Message message) {
        this.f61146x6860fafc.mo120388x6714ace7(message);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40, com.p314xaae8f345.p3210x3857dc.i2
    /* renamed from: requestXWebSafeAreaUpdate */
    public void mo120261x31f622ee() {
        by5.c4.f(TAG, "requestXWebSafeAreaUpdate called");
        this.f61146x6860fafc.mo120261x31f622ee();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: restoreState */
    public android.webkit.WebBackForwardList mo120389x61a06aa3(android.os.Bundle bundle) {
        return this.f61146x6860fafc.mo120389x61a06aa3(bundle);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: resumeTimers */
    public void mo120390x5aa2005b() {
        this.f61146x6860fafc.mo120390x5aa2005b();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: savePage */
    public boolean mo120391x847491ac(java.lang.String str, java.lang.String str2, int i17) {
        return this.f61146x6860fafc.mo120391x847491ac(str, str2, i17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: saveState */
    public android.webkit.WebBackForwardList mo120392xa507914(android.os.Bundle bundle) {
        return this.f61146x6860fafc.mo120392xa507914(bundle);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: saveWebArchive */
    public void mo120393x9f2dac2b(java.lang.String str) {
        this.f61146x6860fafc.mo120393x9f2dac2b(str);
    }

    @Override // android.view.View
    public void scrollBy(int i17, int i18) {
        mo120427x520c905e(i17, i18);
    }

    @Override // android.view.View
    public void scrollTo(int i17, int i18) {
        mo120428x520c9282(i17, i18);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setAudioMuted */
    public void mo120395x77c16137(boolean z17) {
        this.f61146x6860fafc.mo120395x77c16137(z17);
    }

    @Override // android.view.View, com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setBackgroundColor */
    public void mo120467x67f06213(int i17) {
        this.f61146x6860fafc.mo120467x67f06213(i17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setBottomHeight */
    public void mo120396x9f718b4(int i17) {
        this.f61146x6860fafc.mo120396x9f718b4(i17);
    }

    /* renamed from: setCustomOnOverScrolledListener */
    public void m120397x6e928cc6(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.a0 a0Var) {
        this.f61144xaebfc601 = a0Var;
    }

    /* renamed from: setCustomOnScrollChangedListener */
    public void m120398xa9492c69(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.b0 b0Var) {
        this.f61145x6ec31a8e = b0Var;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setDownloadListener */
    public void mo120399x7619e5de(android.webkit.DownloadListener downloadListener) {
        this.f61146x6860fafc.mo120399x7619e5de(downloadListener);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setExtendInputClient */
    public void mo120400x4537a079(java.lang.Object obj) {
        this.f61146x6860fafc.mo120400x4537a079(obj);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setExtendPluginClient */
    public void mo120401x3db3fd1a(java.lang.Object obj) {
        this.f61146x6860fafc.mo120401x3db3fd1a(obj);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setExtendTextAreaClient */
    public void mo120402xb460a101(java.lang.Object obj) {
        this.f61146x6860fafc.mo120402xb460a101(obj);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setFindListener */
    public void mo120403xf031e30f(android.webkit.WebView.FindListener findListener) {
        this.f61146x6860fafc.mo120403xf031e30f(findListener);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setHorizontalScrollBarEnable */
    public void mo120404x6d0c5823(boolean z17) {
        this.f61146x6860fafc.mo120404x6d0c5823(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setInitialScale */
    public void mo120405x7e2239e8(int i17) {
        this.f61146x6860fafc.mo120405x7e2239e8(i17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setInputOutOfKeyboardEnable */
    public void mo120406x5e593bc7(boolean z17) {
        this.f61146x6860fafc.mo120406x5e593bc7(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setNativeDownloadClient */
    public void mo120407xbeb5ec(java.lang.Object obj) {
        this.f61146x6860fafc.mo120407xbeb5ec(obj);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setNetworkAvailable */
    public void mo120408xedbee0bd(boolean z17) {
        this.f61146x6860fafc.mo120408xedbee0bd(z17);
    }

    @Override // android.view.View, com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setOnTouchListener */
    public void mo120468xcc7da8b2(android.view.View.OnTouchListener onTouchListener) {
        this.f61146x6860fafc.mo120468xcc7da8b2(onTouchListener);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setPluginTextureScale */
    public void mo120409xc0b8afc4(java.lang.String str, int i17, float f17, float f18) {
        this.f61146x6860fafc.mo120409xc0b8afc4(str, i17, f17, f18);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setProxyWebViewClientExtension */
    public void mo120410x61f95da7(java.lang.Object obj) {
        this.f61146x6860fafc.mo120410x61f95da7(obj);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setTranslateMode */
    public void mo120411x77866acf(boolean z17) {
        this.f61146x6860fafc.mo120411x77866acf(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setVerticalScrollBarEnable */
    public void mo120412x5dab8611(boolean z17) {
        this.f61146x6860fafc.mo120412x5dab8611(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setWebChromeClient */
    public void mo120413x6fd49b97(java.lang.Object obj) {
        this.f61146x6860fafc.mo120413x6fd49b97(obj);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setWebContentsDebuggingEnabled */
    public void mo120414xc9bc595f(boolean z17) {
        this.f61146x6860fafc.mo120414xc9bc595f(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setWebContentsSize */
    public void mo120415x874abeed(int i17, int i18) {
        this.f61146x6860fafc.mo120415x874abeed(i17, i18);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setWebViewClient */
    public void mo120416x23d27c02(java.lang.Object obj) {
        this.f61146x6860fafc.mo120416x23d27c02(obj);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setWithoutViewMode */
    public void mo120417x6693960e(boolean z17) {
        this.f61146x6860fafc.mo120417x6693960e(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: setXWebSafeAreaProvider */
    public void mo120418xefce9d29(java.lang.Object obj) {
        by5.c4.f(TAG, "setXWebSafeAreaProvider(Object): provider=" + obj);
        this.f61146x6860fafc.mo120418xefce9d29(obj);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: smoothScroll */
    public void mo120419x328cce1b(int i17, int i18, long j17) {
        this.f61146x6860fafc.mo120419x328cce1b(i17, i18, j17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: stopLoading */
    public void mo120420xc77ccada() {
        this.f61146x6860fafc.mo120420xc77ccada();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: takePluginScreenshot */
    public void mo120421xf63e37a0(java.lang.String str, int i17) {
        this.f61146x6860fafc.mo120421xf63e37a0(str, i17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: view_computeHorizontalScrollOffset */
    public int mo120422x1b8b9101() {
        return this.f61146x6860fafc.mo120422x1b8b9101();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: view_computeHorizontalScrollRange */
    public int mo120423x19d1c70f() {
        return this.f61146x6860fafc.mo120423x19d1c70f();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: view_computeVerticalScrollExtent */
    public int mo120424xcf9a772a() {
        return this.f61146x6860fafc.mo120424xcf9a772a();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: view_computeVerticalScrollOffset */
    public int mo120425xdfa71c93() {
        return this.f61146x6860fafc.mo120425xdfa71c93();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: view_computeVerticalScrollRange */
    public int mo120426x412d813d() {
        return this.f61146x6860fafc.mo120426x412d813d();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: view_scrollBy */
    public void mo120427x520c905e(int i17, int i18) {
        this.f61146x6860fafc.mo120427x520c905e(i17, i18);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: view_scrollTo */
    public void mo120428x520c9282(int i17, int i18) {
        this.f61146x6860fafc.mo120428x520c9282(i17, i18);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: zoomBy */
    public void mo120429xd67f838a(float f17) {
        this.f61146x6860fafc.mo120429xd67f838a(f17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: zoomIn */
    public boolean mo120430xd67f8458() {
        return this.f61146x6860fafc.mo120430xd67f8458();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: zoomOut */
    public boolean mo120431xf9711e7b() {
        return this.f61146x6860fafc.mo120431xf9711e7b();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: clearHistory */
    public void mo120329x35d48587(int i17, int i18) {
        this.f61146x6860fafc.mo120329x35d48587(i17, i18);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: getXWebVirtualTextureContentView */
    public com.p314xaae8f345.p3210x3857dc.e3 mo120359x5087c4fc() {
        return new com.p314xaae8f345.p3210x3857dc.f3(this.f61146x6860fafc.mo120359x5087c4fc());
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: loadUrl */
    public void mo120368x141096a9(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.f61146x6860fafc.mo120368x141096a9(str, map);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27850xbcb12d40
    /* renamed from: saveWebArchive */
    public void mo120394x9f2dac2b(java.lang.String str, boolean z17, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        this.f61146x6860fafc.mo120394x9f2dac2b(str, z17, valueCallback);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.i2
    /* renamed from: setExtendInputClient */
    public void mo120262x4537a079(com.p314xaae8f345.p3210x3857dc.C27820x71d6ac3f c27820x71d6ac3f) {
        mo120400x4537a079((java.lang.Object) c27820x71d6ac3f);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.i2
    /* renamed from: setExtendPluginClient */
    public void mo120263x3db3fd1a(com.p314xaae8f345.p3210x3857dc.C27821xa4f66a14 c27821xa4f66a14) {
        mo120401x3db3fd1a((java.lang.Object) c27821xa4f66a14);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.i2
    /* renamed from: setExtendTextAreaClient */
    public void mo120264xb460a101(com.p314xaae8f345.p3210x3857dc.C27823x54bbb77b c27823x54bbb77b) {
        mo120402xb460a101((java.lang.Object) c27823x54bbb77b);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.i2
    /* renamed from: setXWebSafeAreaProvider */
    public void mo120265xefce9d29(com.p314xaae8f345.p3210x3857dc.InterfaceC27825xd374e5c7 interfaceC27825xd374e5c7) {
        by5.c4.f(TAG, "setXWebSafeAreaProvider(XWebSafeAreaProvider): provider=" + interfaceC27825xd374e5c7);
        mo120418xefce9d29((java.lang.Object) interfaceC27825xd374e5c7);
    }

    public C27847xac2547f9(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, null);
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        this.f61141xf34f7c9f = arrayList;
        arrayList.add(android.content.Context.class);
        arrayList.add(android.util.AttributeSet.class);
        java.util.ArrayList<java.lang.Object> arrayList2 = new java.util.ArrayList<>();
        this.f61140x6e7b5a20 = arrayList2;
        arrayList2.add(context);
        arrayList2.add(attributeSet);
        m120318x316510();
    }
}
