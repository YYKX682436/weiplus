package vx5;

/* loaded from: classes13.dex */
public class i0 implements tx5.f, com.p314xaae8f345.p3210x3857dc.c3 {
    public static volatile boolean C;
    public final android.os.Looper A;
    public final com.p314xaae8f345.p3210x3857dc.p3215x21ffc6bd.C27839xa92bc749 B;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 f522886d;

    /* renamed from: e, reason: collision with root package name */
    public final vx5.j0 f522887e;

    /* renamed from: f, reason: collision with root package name */
    public final vx5.h0 f522888f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.AbsoluteLayout f522889g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.h1 f522890h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.s0 f522891i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.g1 f522892m;

    /* renamed from: n, reason: collision with root package name */
    public final int f522893n;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.h3 f522899t;

    /* renamed from: u, reason: collision with root package name */
    public sx5.a f522900u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.d3 f522901v;

    /* renamed from: o, reason: collision with root package name */
    public long f522894o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f522895p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f522896q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f522897r = 0;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.p3215x21ffc6bd.C27839xa92bc749 f522898s = new com.p314xaae8f345.p3210x3857dc.p3215x21ffc6bd.C27839xa92bc749();

    /* renamed from: w, reason: collision with root package name */
    public android.webkit.WebChromeClient.CustomViewCallback f522902w = null;

    /* renamed from: x, reason: collision with root package name */
    public boolean f522903x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f522904y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f522905z = false;

    public i0(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9) {
        vx5.b0 b0Var = new vx5.b0(this);
        vx5.d0 d0Var = new vx5.d0(this);
        vx5.e0 e0Var = new vx5.e0(this);
        this.B = e0Var;
        this.A = android.os.Looper.myLooper();
        C = c27816xac2547f9.getContext().getApplicationInfo().targetSdkVersion >= 18;
        int d17 = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d();
        this.f522893n = d17;
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27841xa2f288c7 c27841xa2f288c7 = new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27841xa2f288c7(c27816xac2547f9.getContext(), d17);
        vx5.h0 h0Var = new vx5.h0(this, c27841xa2f288c7);
        this.f522888f = h0Var;
        android.widget.AbsoluteLayout absoluteLayout = new android.widget.AbsoluteLayout(c27841xa2f288c7);
        this.f522889g = absoluteLayout;
        h0Var.mo120344xc2a54588().addView(absoluteLayout);
        h0Var.m120398xa9492c69(new vx5.y(this));
        h0Var.m120397x6e928cc6(new vx5.z(this));
        h0Var.mo120467x67f06213(0);
        this.f522886d = c27816xac2547f9;
        this.f522887e = new vx5.j0(h0Var);
        h0Var.mo120413x6fd49b97(b0Var);
        h0Var.mo120416x23d27c02(d0Var);
        this.f522899t = new com.p314xaae8f345.p3210x3857dc.h3(this);
        h0Var.mo120410x61f95da7(e0Var);
        this.f522901v = new com.p314xaae8f345.p3210x3857dc.d3(c27816xac2547f9, this);
        android.content.Context context = h0Var.getContext();
        by5.c4.f("PinusWebView", "initFullscreenVideo, kind:" + mo120146xc46191fe() + ", activity:" + context);
        this.f522900u = sx5.c1.a(c27816xac2547f9.m120143xc7aa84d5(), context, c27816xac2547f9, h0Var, sx5.g.a());
        if (mo120146xc46191fe() == com.p314xaae8f345.p3210x3857dc.c1.HOOK_EVALUTE_JS) {
            this.f522900u.j(h0Var);
        }
    }

    @Override // tx5.f
    public boolean F() {
        int scrollBarStyle = this.f522888f.getScrollBarStyle();
        return scrollBarStyle == 0 || scrollBarStyle == 33554432;
    }

    @Override // tx5.f
    public void S(boolean z17) {
        sx5.a aVar = this.f522900u;
        if (aVar != null) {
            aVar.i(z17);
        }
    }

    @Override // tx5.f
    public boolean T() {
        return u(1042);
    }

    @Override // tx5.f
    /* renamed from: addJavascriptInterface */
    public void mo120128x74041feb(java.lang.Object obj, java.lang.String str) {
        this.f522888f.mo120321x74041feb(obj, str);
    }

    @Override // tx5.f
    /* renamed from: canGoBack */
    public boolean mo120129xed1a21df() {
        if (this.f522895p) {
            return false;
        }
        return this.f522888f.mo120322xed1a21df();
    }

    @Override // tx5.f
    /* renamed from: canGoForward */
    public boolean mo120130xc062b2cd() {
        return this.f522888f.mo120324xc062b2cd();
    }

    @Override // tx5.f
    /* renamed from: captureLongScreenshot */
    public void mo120131x81469de8(android.graphics.Rect rect, android.webkit.ValueCallback valueCallback) {
        java.util.Objects.toString(rect);
        java.util.Objects.toString(valueCallback);
        if (rect == null || valueCallback == null) {
            java.util.Objects.toString(rect);
            java.util.Objects.toString(valueCallback);
        } else {
            this.f522888f.mo120325x81469de8(rect, new vx5.f0(this, valueCallback));
        }
    }

    @Override // tx5.f
    /* renamed from: clearHistory */
    public void mo120132x35d48587() {
        this.f522888f.mo120328x35d48587();
    }

    @Override // tx5.f
    /* renamed from: clearMatches */
    public void mo120133x30b32a26() {
        this.f522888f.mo120330x30b32a26();
    }

    @Override // tx5.f
    /* renamed from: clearSslPreferences */
    public void mo120134x3e28c0f9() {
        this.f522888f.mo120331x3e28c0f9();
    }

    @Override // tx5.f
    /* renamed from: clearView */
    public void mo120135xb4407692() {
        this.f522888f.mo120332xb4407692();
    }

    @Override // tx5.f
    /* renamed from: destroy */
    public void mo52095x5cd39ffa() {
        this.f522888f.mo120335x5cd39ffa();
    }

    @Override // tx5.f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0
    /* renamed from: evaluateJavascript */
    public void mo14660x738236e6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f522888f.mo120337x738236e6(str, valueCallback);
    }

    @Override // tx5.f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public android.graphics.Bitmap f() {
        by5.c4.f("PinusWebView", "captureBitmap, start");
        android.view.View childAt = ((android.view.ViewGroup) ((android.view.ViewGroup) this.f522888f.getChildAt(0)).getChildAt(0)).getChildAt(0);
        if (!(childAt instanceof android.view.TextureView)) {
            return null;
        }
        android.graphics.Bitmap bitmap = ((android.view.TextureView) childAt).getBitmap();
        by5.c4.f("PinusWebView", "captureBitmap, bitmap:" + bitmap);
        return bitmap;
    }

    @Override // tx5.f
    /* renamed from: findAllAsync */
    public void mo120136x72420634(java.lang.String str) {
        this.f522888f.mo120338x72420634(str);
    }

    @Override // tx5.f
    /* renamed from: findNext */
    public void mo120137xd781704c(boolean z17) {
        this.f522888f.mo120339xd781704c(z17);
    }

    @Override // tx5.f
    /* renamed from: getAbstractInfo */
    public java.lang.String mo120138x33c67a66() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pinus, sdk ver = 20260502\napk ver = ");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d());
        sb6.append("\ndetail = ");
        by5.u3 u3Var = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429504d;
        sb6.append(u3Var != null ? u3Var.f118139b : "");
        return sb6.toString();
    }

    @Override // tx5.f
    /* renamed from: getCertificate */
    public android.net.http.SslCertificate mo120140x4e358861() {
        return this.f522888f.mo120342x4e358861();
    }

    @Override // tx5.f
    /* renamed from: getContentHeight */
    public int mo120141x964f6f4a() {
        return this.f522888f.mo120343x964f6f4a();
    }

    @Override // tx5.f
    /* renamed from: getFavicon */
    public android.graphics.Bitmap mo120145xfdbefdde() {
        return this.f522888f.mo120345xfdbefdde();
    }

    @Override // tx5.f
    /* renamed from: getFullscreenVideoKind */
    public com.p314xaae8f345.p3210x3857dc.c1 mo120146xc46191fe() {
        return com.p314xaae8f345.p3210x3857dc.b.m().l(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120126xba60370d());
    }

    @Override // tx5.f
    /* renamed from: getHitTestResult */
    public com.p314xaae8f345.p3210x3857dc.d1 mo120147x1d5dd38c() {
        int i17;
        java.lang.String str;
        by5.i0 i0Var;
        by5.i0 i0Var2;
        com.p314xaae8f345.p3210x3857dc.d1 d1Var = new com.p314xaae8f345.p3210x3857dc.d1();
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.e m120346x1d5dd38c = this.f522888f.m120346x1d5dd38c();
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.f fVar = (com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.f) m120346x1d5dd38c;
        fVar.getClass();
        try {
            synchronized (fVar) {
                i0Var2 = fVar.f301975c;
                if (i0Var2 == null) {
                    i0Var2 = new by5.i0(fVar.f301973a, "getType", new java.lang.Class[0]);
                    fVar.f301975c = i0Var2;
                }
            }
            i17 = ((java.lang.Integer) i0Var2.b(new java.lang.Object[0])).intValue();
        } catch (java.lang.UnsupportedOperationException unused) {
            i17 = 0;
        }
        d1Var.f301772a = i17;
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.f fVar2 = (com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.f) m120346x1d5dd38c;
        try {
            synchronized (fVar2) {
                i0Var = fVar2.f301974b;
                if (i0Var == null) {
                    i0Var = new by5.i0(fVar2.f301973a, "getExtra", new java.lang.Class[0]);
                    fVar2.f301974b = i0Var;
                }
            }
            str = (java.lang.String) i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused2) {
            str = null;
        }
        d1Var.f301773b = str;
        return d1Var;
    }

    @Override // tx5.f
    /* renamed from: getImageFromDiskCache */
    public void mo120148x7a5ae7b6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (valueCallback == null) {
            return;
        }
        this.f522888f.mo120349x7a5ae7b6(str, new vx5.g0(this, valueCallback));
    }

    @Override // tx5.f
    /* renamed from: getOriginalUrl */
    public java.lang.String mo120149x410b6ca8() {
        return this.f522888f.mo120350x410b6ca8();
    }

    @Override // tx5.f
    /* renamed from: getProgress */
    public int mo120150x402effa3() {
        return this.f522888f.mo120351x402effa3();
    }

    @Override // tx5.f
    /* renamed from: getScale */
    public float mo120151x7520af94() {
        return this.f522888f.mo120352x7520af94();
    }

    @Override // tx5.f
    /* renamed from: getScrollHeight */
    public int mo120152x214ee8ca() {
        return this.f522888f.computeVerticalScrollRange();
    }

    @Override // tx5.f
    /* renamed from: getSettings */
    public com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf999() {
        com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
        if (by5.d4.e().getBoolean("bEnableCheckThread", false) && this.A != null && android.os.Looper.myLooper() != this.A) {
            java.lang.Throwable th6 = new java.lang.Throwable("A WebView method was called on thread '" + java.lang.Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + this.A + " called on " + android.os.Looper.myLooper() + ", FYI main Looper is " + android.os.Looper.getMainLooper() + ")");
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(th6);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkThread error:");
            sb6.append(stackTraceString);
            by5.c4.g("PinusWebView", sb6.toString());
            xx5.g.a(3, stackTraceString, 4, "");
            if (C) {
                throw new java.lang.RuntimeException(th6);
            }
        }
        return this.f522887e;
    }

    @Override // tx5.f
    /* renamed from: getTextClassifier */
    public android.view.textclassifier.TextClassifier mo120154xd9ba3424() {
        return null;
    }

    @Override // tx5.f
    /* renamed from: getTitle */
    public java.lang.String mo64579x7531c8a2() {
        return this.f522888f.mo120356x7531c8a2();
    }

    @Override // tx5.f
    /* renamed from: getTopView */
    public android.view.ViewGroup mo120155xf9dcf964() {
        return this.f522889g;
    }

    @Override // tx5.f
    /* renamed from: getUrl */
    public java.lang.String mo120156xb5887639() {
        return this.f522888f.mo120358xb5887639();
    }

    @Override // tx5.f
    /* renamed from: getVersionInfo */
    public java.lang.String mo120157x2e41070() {
        return "pinus, sdkver:20260502, apkver:" + this.f522893n;
    }

    @Override // tx5.f
    /* renamed from: getView */
    public android.view.View mo120158xfb86a31b() {
        return this.f522888f;
    }

    @Override // tx5.f
    /* renamed from: getVisibleTitleHeight */
    public int mo120159x81ae3bc3() {
        return 0;
    }

    @Override // tx5.f
    /* renamed from: getWebChromeClient */
    public com.p314xaae8f345.p3210x3857dc.s0 mo120160x38fe0223() {
        return this.f522891i;
    }

    @Override // tx5.f
    /* renamed from: getWebScrollX */
    public int mo120161x95a6d12d() {
        vx5.h0 h0Var = this.f522888f;
        return h0Var instanceof com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 ? h0Var.computeHorizontalScrollOffset() : h0Var.getScrollX();
    }

    @Override // tx5.f
    /* renamed from: getWebScrollY */
    public int mo120162x95a6d12e() {
        return this.f522888f.computeVerticalScrollOffset();
    }

    @Override // tx5.f
    /* renamed from: getWebViewCallbackClient */
    public com.p314xaae8f345.p3210x3857dc.g1 mo120163xe602a733() {
        return this.f522892m;
    }

    @Override // tx5.f
    /* renamed from: getWebViewClient */
    public com.p314xaae8f345.p3210x3857dc.h1 mo120164x90fc158e() {
        return this.f522890h;
    }

    @Override // tx5.f
    /* renamed from: getWebViewLooper */
    public android.os.Looper mo120165xa084dc14() {
        return this.A;
    }

    @Override // tx5.f
    /* renamed from: getWebViewRenderProcessClient */
    public com.p314xaae8f345.p3210x3857dc.m1 mo120166x3808f441() {
        return null;
    }

    @Override // tx5.f
    /* renamed from: getWebViewUI */
    public android.view.View mo120167xbfee89b7() {
        return this.f522888f;
    }

    @Override // tx5.f
    /* renamed from: goBack */
    public void mo120168xb5fed1ef() {
        this.f522888f.mo120360xb5fed1ef();
    }

    @Override // tx5.f
    /* renamed from: goForward */
    public void mo120169xed0748bd() {
        this.f522888f.mo120362xed0748bd();
    }

    @Override // tx5.f
    /* renamed from: loadData */
    public void mo74798x6dfa45b0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f522888f.mo120365x6dfa45b0(str, str2, str3);
    }

    @Override // tx5.f
    /* renamed from: loadDataWithBaseURL */
    public void mo64581x9b341568(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f522888f.mo120366x9b341568(str, str2, str3, str4, str5);
    }

    @Override // tx5.f, pf.b
    /* renamed from: loadUrl */
    public void mo32265x141096a9(java.lang.String str) {
        vx5.h0 h0Var = this.f522888f;
        if (str != null && str.trim().startsWith("javascript:")) {
            h0Var.mo120337x738236e6(str, null);
        } else {
            this.f522895p = false;
            h0Var.mo120367x141096a9(str);
        }
    }

    @Override // tx5.f
    public void m() {
        android.webkit.WebChromeClient.CustomViewCallback customViewCallback = this.f522902w;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
    }

    @Override // tx5.f
    public com.p314xaae8f345.p3210x3857dc.o0 m0(com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 interfaceC27815xc8aac369) {
        sx5.a aVar = this.f522900u;
        if (aVar != null && aVar.f(interfaceC27815xc8aac369)) {
            return new vx5.a0(this);
        }
        by5.c4.f("PinusWebView", "setVideoJsCallback not support");
        return null;
    }

    @Override // tx5.f
    public boolean n0(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p3210x3857dc.InterfaceC27814x36feca02 interfaceC27814x36feca02) {
        return this.f522888f.mo120348x70b214eb(str, str2, str3, interfaceC27814x36feca02);
    }

    @Override // tx5.f
    /* renamed from: onHide */
    public void mo81405xc39a57c1() {
        this.f522888f.mo120371xc39a57c1();
    }

    @Override // tx5.f
    /* renamed from: onPause */
    public void mo74095xb01dfb57() {
        this.f522888f.mo120374xb01dfb57();
    }

    @Override // tx5.f
    /* renamed from: onResume */
    public void mo74096x57429eec() {
        this.f522888f.mo120375x57429eec();
    }

    @Override // tx5.f
    /* renamed from: onShow */
    public void mo81406xc39f557c() {
        this.f522888f.mo120377xc39f557c();
    }

    @Override // tx5.f
    /* renamed from: reload */
    public void mo120172xc84a8199() {
        this.f522888f.mo120383xc84a8199();
    }

    @Override // tx5.f
    /* renamed from: removeJavascriptInterface */
    public void mo120173x7af55728(java.lang.String str) {
        this.f522888f.mo120385x7af55728(str);
    }

    @Override // tx5.f
    public boolean s() {
        return this.f522903x;
    }

    @Override // tx5.f
    /* renamed from: savePage */
    public boolean mo120174x847491ac(java.lang.String str, java.lang.String str2, int i17) {
        return this.f522888f.mo120391x847491ac(str, str2, i17);
    }

    @Override // tx5.f
    /* renamed from: setAudioMuted */
    public void mo120175x77c16137(boolean z17) {
        this.f522888f.mo120395x77c16137(z17);
    }

    @Override // tx5.f
    /* renamed from: setBottomHeight */
    public void mo120176x9f718b4(int i17) {
        this.f522888f.mo120396x9f718b4(i17);
    }

    @Override // tx5.f
    /* renamed from: setDownloadListener */
    public void mo120177x7619e5de(android.webkit.DownloadListener downloadListener) {
        this.f522888f.mo120399x7619e5de(downloadListener);
    }

    @Override // tx5.f
    /* renamed from: setFindListener */
    public void mo120178xf031e30f(android.webkit.WebView.FindListener findListener) {
        this.f522888f.mo120403xf031e30f(findListener);
    }

    @Override // tx5.f
    /* renamed from: setHorizontalScrollBarEnabled */
    public void mo120519x347eaca1(boolean z17) {
        this.f522888f.mo120404x6d0c5823(z17);
    }

    @Override // tx5.f
    /* renamed from: setHorizontalScrollbarOverlay */
    public void mo120179xdc918990(boolean z17) {
    }

    @Override // tx5.f
    /* renamed from: setInitialScale */
    public void mo120180x7e2239e8(int i17) {
        this.f522888f.mo120405x7e2239e8(i17);
    }

    @Override // tx5.f
    /* renamed from: setInputOutOfKeyboardEnable */
    public void mo120181x5e593bc7(boolean z17) {
        this.f522888f.mo120406x5e593bc7(z17);
    }

    @Override // tx5.f
    /* renamed from: setJSExceptionListener */
    public void mo120182xbdc6e038(com.p314xaae8f345.p3210x3857dc.l1 l1Var) {
    }

    @Override // tx5.f
    /* renamed from: setNativeDownloadClient */
    public void mo120183xbeb5ec(com.p314xaae8f345.p3210x3857dc.p2 p2Var) {
        this.f522888f.mo120407xbeb5ec(new com.p314xaae8f345.p3210x3857dc.p3215x21ffc6bd.C27840x3692b14d(p2Var));
    }

    @Override // tx5.f
    /* renamed from: setNetworkAvailable */
    public void mo120184xedbee0bd(boolean z17) {
        this.f522888f.mo120408xedbee0bd(z17);
    }

    @Override // tx5.f
    /* renamed from: setPictureListener */
    public void mo120185x70aa1310(android.webkit.WebView.PictureListener pictureListener) {
    }

    @Override // tx5.f
    /* renamed from: setTextClassifier */
    public void mo120186xa1b09c30(android.view.textclassifier.TextClassifier textClassifier) {
    }

    @Override // tx5.f
    /* renamed from: setVerticalScrollBarEnabled */
    public void mo120520x57c53c73(boolean z17) {
        this.f522888f.mo120412x5dab8611(z17);
    }

    @Override // tx5.f
    /* renamed from: setVerticalScrollbarOverlay */
    public void mo120187xffd81962(boolean z17) {
    }

    @Override // tx5.f
    /* renamed from: setWebChromeClient */
    public void mo81410x6fd49b97(com.p314xaae8f345.p3210x3857dc.s0 s0Var) {
        this.f522891i = s0Var;
    }

    @Override // tx5.f
    /* renamed from: setWebContentsSize */
    public void mo120188x874abeed(int i17, int i18) {
        this.f522888f.mo120415x874abeed(i17, i18);
    }

    @Override // tx5.f
    /* renamed from: setWebViewCallbackClient */
    public void mo120189xb61559a7(com.p314xaae8f345.p3210x3857dc.g1 g1Var) {
        this.f522892m = g1Var;
    }

    @Override // tx5.f
    /* renamed from: setWebViewClient */
    public void mo74800x23d27c02(com.p314xaae8f345.p3210x3857dc.h1 h1Var) {
        this.f522890h = h1Var;
    }

    @Override // tx5.f
    /* renamed from: setWebViewClientExtension */
    public void mo120190xd6bb225d(com.p314xaae8f345.p3210x3857dc.p3215x21ffc6bd.C27839xa92bc749 c27839xa92bc749) {
        this.f522898s = c27839xa92bc749;
        this.f522888f.mo120410x61f95da7(this.B);
    }

    @Override // tx5.f
    /* renamed from: setXWebKeyEventHandler */
    public void mo120192x9db21c31(com.p314xaae8f345.p3210x3857dc.InterfaceC27824x41f147d3 interfaceC27824x41f147d3) {
        java.lang.Object m120341x12c9c67f;
        vx5.h0 h0Var = this.f522888f;
        if (h0Var == null) {
            by5.c4.c("PinusWebView", "getPinusBridge, mWebview is null");
            m120341x12c9c67f = null;
        } else {
            m120341x12c9c67f = h0Var.m120341x12c9c67f();
        }
        vx5.k.f522907a.g(80015, new java.lang.Object[]{m120341x12c9c67f, interfaceC27824x41f147d3});
    }

    @Override // tx5.f
    /* renamed from: smoothScroll */
    public void mo120193x328cce1b(int i17, int i18, long j17) {
        this.f522888f.mo120419x328cce1b(i17, i18, j17);
    }

    @Override // tx5.f
    /* renamed from: stopLoading */
    public void mo120194xc77ccada() {
        this.f522888f.mo120420xc77ccada();
    }

    @Override // tx5.f
    public void t(java.util.concurrent.Executor executor, com.p314xaae8f345.p3210x3857dc.m1 m1Var) {
    }

    @Override // tx5.f
    public boolean u(int i17) {
        return com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1.m120281x9cf0d20b().mo120203x3ec63efc(i17);
    }

    @Override // tx5.f
    public boolean y() {
        boolean z17 = this.f522896q;
        vx5.h0 h0Var = this.f522888f;
        return (h0Var instanceof com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 ? h0Var.computeVerticalScrollOffset() : h0Var.getScrollY()) == 0 && z17;
    }

    @Override // tx5.f
    /* renamed from: zoomIn */
    public boolean mo120195xd67f8458() {
        return this.f522888f.mo120430xd67f8458();
    }

    @Override // tx5.f
    /* renamed from: zoomOut */
    public boolean mo120196xf9711e7b() {
        return this.f522888f.mo120431xf9711e7b();
    }

    @Override // tx5.f, pf.b
    /* renamed from: loadUrl */
    public void mo32266x141096a9(java.lang.String str, java.util.Map map) {
        this.f522888f.mo120368x141096a9(str, map);
    }
}
