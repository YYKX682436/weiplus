package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.FlutterView */
/* loaded from: classes15.dex */
public class C28553x45ef20c1 extends android.widget.FrameLayout implements io.p3284xd2ae381c.p3301xc5476f33.p3305x6343ca5.C28704x4e3d174e.MouseCursorViewDelegate, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.ViewDelegate {

    /* renamed from: GBOARD_PACKAGE_NAME */
    private static final java.lang.String f70630x4821d464 = "com.google.android.inputmethod.latin";
    private static final java.lang.String TAG = "FlutterView";

    /* renamed from: accessibilityBridge */
    private io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657 f70631x36f49e77;

    /* renamed from: androidTouchProcessor */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28537x46552842 f70632xd973d862;

    /* renamed from: delegate */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28555x71171166 f70633x30d5dd85;

    /* renamed from: enableSwitchSurface */
    private boolean f70634xb4046216;

    /* renamed from: flutterEngine */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e f70635x3a4f997e;

    /* renamed from: flutterEngineAttachmentListeners */
    private final java.util.Set<io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.FlutterEngineAttachmentListener> f70636xaae041fe;

    /* renamed from: flutterImageView */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04 f70637x5cf479e4;

    /* renamed from: flutterSurfaceView */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56 f70638x17f90336;

    /* renamed from: flutterTextureView */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 f70639xcbc704a4;

    /* renamed from: flutterUiDisplayListener */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6 f70640xa34b51a6;

    /* renamed from: flutterUiDisplayListeners */
    private final java.util.Set<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6> f70641xc61ee38d;

    /* renamed from: fontScaleDelegate */
    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.FontScaleDelegate f70642x62363ce0;

    /* renamed from: insetsByNative */
    private boolean f70643xf2d83c64;

    /* renamed from: isFlutterUiDisplayed */
    private boolean f70644x31e4dbb;

    /* renamed from: isInSwapSurface */
    private boolean f70645xccfd02b;

    /* renamed from: keyboardManager */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6 f70646xa79351c6;

    /* renamed from: localizationPlugin */
    private io.p3284xd2ae381c.p3301xc5476f33.p3304xcf99c699.C28703xa4b6c74c f70647x36f30b2c;

    /* renamed from: mFlutterDrawInfoView */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28543x2b4423f3 f70648xcb2c6a66;

    /* renamed from: mWxKeyboardAction */
    private io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.InterfaceC28702x2a2b165e f70649x827e9ccb;

    /* renamed from: mouseCursorPlugin */
    private io.p3284xd2ae381c.p3301xc5476f33.p3305x6343ca5.C28704x4e3d174e f70650x6378d76e;

    /* renamed from: onAccessibilityChangeListener */
    private final io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.OnAccessibilityChangeListener f70651xdcd1e013;

    /* renamed from: previousRenderSurface */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 f70652x6053ac80;

    /* renamed from: renderSurface */
    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 f70653x5c6c6e37;

    /* renamed from: scribePlugin */
    private io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28698xdd848efd f70654xd3b93add;

    /* renamed from: spellCheckPlugin */
    private io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.SpellCheckerSessionSpellCheckerSessionListenerC28699xf8ae7c33 f70655x2aea3813;

    /* renamed from: swapRenderSurface */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344 f70656x8053f364;

    /* renamed from: systemSettingsObserver */
    private final android.database.ContentObserver f70657xa7f01868;

    /* renamed from: textInputPlugin */
    private io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010 f70658x69758830;

    /* renamed from: textServicesManager */
    private android.view.textservice.TextServicesManager f70659xdb6e482;

    /* renamed from: viewportMetrics */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics f70660x80f9793d;

    /* renamed from: windowInfoListener */
    private m3.a f70661x68e4c792;

    /* renamed from: windowInfoRepo */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28579xcbe13ad1 f70662x2f9d7d50;

    /* renamed from: io.flutter.embedding.android.FlutterView$FlutterEngineAttachmentListener */
    /* loaded from: classes15.dex */
    public interface FlutterEngineAttachmentListener {
        /* renamed from: onFlutterEngineAttachedToFlutterView */
        void m137288xeac04783(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e);

        /* renamed from: onFlutterEngineDetachedFromFlutterView */
        void m137289x64dd4426();
    }

    /* renamed from: io.flutter.embedding.android.FlutterView$FontScaleDelegate */
    /* loaded from: classes11.dex */
    public interface FontScaleDelegate {
        /* renamed from: getFontScale */
        float mo10648xa2f3d785();
    }

    /* renamed from: io.flutter.embedding.android.FlutterView$ZeroSides */
    /* loaded from: classes15.dex */
    public enum ZeroSides {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public C28553x45ef20c1(android.content.Context context) {
        this(context, (android.util.AttributeSet) null, new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56(context));
    }

    /* renamed from: findViewByAccessibilityIdRootedAtCurrentView */
    private android.view.View m137246x493b416(int i17, android.view.View view) {
        int i18;
        java.lang.reflect.Method declaredMethod;
        try {
            i18 = 0;
            declaredMethod = android.view.View.class.getDeclaredMethod("getAccessibilityViewId", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
        }
        if (declaredMethod.invoke(view, new java.lang.Object[0]).equals(java.lang.Integer.valueOf(i17))) {
            return view;
        }
        if (view instanceof android.view.ViewGroup) {
            while (true) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                if (i18 >= viewGroup.getChildCount()) {
                    break;
                }
                android.view.View m137246x493b416 = m137246x493b416(i17, viewGroup.getChildAt(i18));
                if (m137246x493b416 != null) {
                    return m137246x493b416;
                }
                i18++;
            }
        }
        return null;
    }

    /* renamed from: guessBottomKeyboardInset */
    private int m137247xed598db4(android.view.WindowInsets windowInsets) {
        int height = getRootView().getHeight();
        if (height == 0 || windowInsets.getSystemWindowInsetBottom() < height * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    /* renamed from: init */
    private void m137248x316510() {
        io.p3284xd2ae381c.Log.v(TAG, "Initializing FlutterView");
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28543x2b4423f3 c28543x2b4423f3 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28543x2b4423f3(getContext());
        this.f70648xcb2c6a66 = c28543x2b4423f3;
        addView(c28543x2b4423f3);
        if (this.f70638x17f90336 != null) {
            io.p3284xd2ae381c.Log.v(TAG, "Internally using a FlutterSurfaceView.");
            addView(this.f70638x17f90336);
        } else if (this.f70639xcbc704a4 != null) {
            io.p3284xd2ae381c.Log.v(TAG, "Internally using a FlutterTextureView.");
            addView(this.f70639xcbc704a4);
        } else {
            io.p3284xd2ae381c.Log.v(TAG, "Internally using a FlutterImageView.");
            addView(this.f70637x5cf479e4);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: releaseImageView */
    public void m137249xbae94259() {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04 c28548x2ab8be04 = this.f70637x5cf479e4;
        if (c28548x2ab8be04 != null) {
            c28548x2ab8be04.m137190x23991ce6();
            removeView(this.f70637x5cf479e4);
            this.f70637x5cf479e4 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: resetWillNotDraw */
    public void m137250x120f5b6(boolean z17, boolean z18) {
        boolean z19 = false;
        if (this.f70635x3a4f997e.m137441x5e5b7e39().m138029x42505226()) {
            setWillNotDraw(false);
            return;
        }
        if (!z17 && !z18) {
            z19 = true;
        }
        setWillNotDraw(z19);
    }

    /* renamed from: sendViewportMetricsToFlutter */
    private void m137251x130c280c() {
        if (!m137270xda93b3f5()) {
            io.p3284xd2ae381c.Log.w(TAG, "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.f70660x80f9793d.f71246xacd5b81b = getResources().getDisplayMetrics().density;
        this.f70660x80f9793d.f71250xb11ec6c2 = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f70635x3a4f997e.m137441x5e5b7e39().m138047x9c31e47b(this.f70660x80f9793d);
    }

    /* renamed from: updateViewInsets */
    private final void m137252x331a07a4(android.graphics.Insets insets) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics viewportMetrics = this.f70660x80f9793d;
        int i17 = viewportMetrics.f71258xe9ea0bd;
        int i18 = insets.top;
        if (i17 < i18) {
            viewportMetrics.f71258xe9ea0bd = i18;
        }
        int i19 = viewportMetrics.f71256xc531ad9f;
        int i27 = insets.left;
        if (i19 < i27) {
            viewportMetrics.f71256xc531ad9f = i27;
        }
        int i28 = viewportMetrics.f71255x2effa1c3;
        int i29 = insets.bottom;
        if (i28 < i29) {
            viewportMetrics.f71255x2effa1c3 = i29;
        }
        int i37 = viewportMetrics.f71257xe15a6784;
        int i38 = insets.right;
        if (i37 < i38) {
            viewportMetrics.f71257xe15a6784 = i38;
        }
    }

    /* renamed from: acquireLatestImageViewFrame */
    public boolean m137253x27591c0a() {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04 c28548x2ab8be04 = this.f70637x5cf479e4;
        if (c28548x2ab8be04 != null) {
            return c28548x2ab8be04.m137188xaf314b5e();
        }
        return false;
    }

    /* renamed from: addFlutterEngineAttachmentListener */
    public void m137254x4faa8c34(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.FlutterEngineAttachmentListener flutterEngineAttachmentListener) {
        this.f70636xaae041fe.add(flutterEngineAttachmentListener);
    }

    /* renamed from: addOnFirstFrameRenderedListener */
    public void m137255x6d15a5c6(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6 interfaceC28647x231975c6) {
        this.f70641xc61ee38d.add(interfaceC28647x231975c6);
    }

    /* renamed from: attachOverlaySurfaceToRender */
    public void m137256xc0e639f3(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04 c28548x2ab8be04) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = this.f70635x3a4f997e;
        if (c28580x69eec95e != null) {
            c28548x2ab8be04.mo137189xb6928083(c28580x69eec95e.m137441x5e5b7e39());
        }
    }

    /* renamed from: attachToFlutterEngine */
    public void mo124142x11d031be(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        io.p3284xd2ae381c.Log.i(TAG, "Attaching to a FlutterEngine: " + c28580x69eec95e);
        if (m137270xda93b3f5()) {
            if (c28580x69eec95e == this.f70635x3a4f997e) {
                io.p3284xd2ae381c.Log.i(TAG, "Already attached to this engine. Doing nothing.");
                return;
            } else {
                io.p3284xd2ae381c.Log.v(TAG, "Currently attached to a different engine. Detaching and then attaching to new engine.");
                m137259xf8d3d6a1();
            }
        }
        this.f70635x3a4f997e = c28580x69eec95e;
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28543x2b4423f3 c28543x2b4423f3 = this.f70648xcb2c6a66;
        if (c28543x2b4423f3 != null) {
            c28543x2b4423f3.m137095xa6b43041(c28580x69eec95e);
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137441x5e5b7e39 = this.f70635x3a4f997e.m137441x5e5b7e39();
        this.f70644x31e4dbb = m137441x5e5b7e39.m138028x6250be46();
        this.f70653x5c6c6e37.mo137189xb6928083(m137441x5e5b7e39);
        m137441x5e5b7e39.m138017x9a2d27f9(this.f70640xa34b51a6);
        this.f70650x6378d76e = new io.p3284xd2ae381c.p3301xc5476f33.p3305x6343ca5.C28704x4e3d174e(this, this.f70635x3a4f997e.m137434x67637e1e());
        io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010 c28701x2e084010 = new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010(this, this.f70635x3a4f997e.m137451xb578eb1c(), this.f70635x3a4f997e.m137443xa932e2e3(), this.f70635x3a4f997e.m137437xe5cc0b81(), this.f70635x3a4f997e.m137438xd3b564d1());
        this.f70658x69758830 = c28701x2e084010;
        c28701x2e084010.m138560xa83bcec0(new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.InterfaceC28702x2a2b165e() { // from class: io.flutter.embedding.android.FlutterView.4
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.InterfaceC28702x2a2b165e
            /* renamed from: hideKeyboard */
            public boolean mo65918x3f895349() {
                if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70649x827e9ccb != null) {
                    return io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70649x827e9ccb.mo65918x3f895349();
                }
                return false;
            }

            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.InterfaceC28702x2a2b165e
            /* renamed from: showKeyboard */
            public boolean mo65919xeb3e6604(android.view.View view, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.WxInputConfiguration wxInputConfiguration) {
                if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70649x827e9ccb != null) {
                    return io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70649x827e9ccb.mo65919xeb3e6604(view, wxInputConfiguration);
                }
                return false;
            }
        });
        try {
            android.view.textservice.TextServicesManager textServicesManager = (android.view.textservice.TextServicesManager) getContext().getSystemService("textservices");
            this.f70659xdb6e482 = textServicesManager;
            this.f70655x2aea3813 = new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.SpellCheckerSessionSpellCheckerSessionListenerC28699xf8ae7c33(textServicesManager, this.f70635x3a4f997e.m137448xcdf6576d());
        } catch (java.lang.Exception unused) {
            io.p3284xd2ae381c.Log.e(TAG, "TextServicesManager not supported by device, spell check disabled.");
        }
        this.f70654xd3b93add = new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28698xdd848efd(this, this.f70658x69758830.m138552x6460f9d8(), this.f70635x3a4f997e.m137443xa932e2e3());
        this.f70647x36f30b2c = this.f70635x3a4f997e.m137433x4a4f6d22();
        this.f70658x69758830.m138560xa83bcec0(new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.InterfaceC28702x2a2b165e() { // from class: io.flutter.embedding.android.FlutterView.5
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.InterfaceC28702x2a2b165e
            /* renamed from: hideKeyboard */
            public boolean mo65918x3f895349() {
                if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70649x827e9ccb != null) {
                    return io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70649x827e9ccb.mo65918x3f895349();
                }
                return false;
            }

            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.InterfaceC28702x2a2b165e
            /* renamed from: showKeyboard */
            public boolean mo65919xeb3e6604(android.view.View view, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.WxInputConfiguration wxInputConfiguration) {
                if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70649x827e9ccb != null) {
                    return io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70649x827e9ccb.mo65919xeb3e6604(view, wxInputConfiguration);
                }
                return false;
            }
        });
        this.f70646xa79351c6 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6(this);
        this.f70632xd973d862 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28537x46552842(this.f70635x3a4f997e.m137441x5e5b7e39(), false);
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657 c28974x81a86657 = new io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657(this, c28580x69eec95e.m137422x78d49c4b(), (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28732xfd6b92ec(this.f70635x3a4f997e.m137437xe5cc0b81(), this.f70635x3a4f997e.m137438xd3b564d1()));
        this.f70631x36f49e77 = c28974x81a86657;
        c28974x81a86657.m139488x6e96c6d1(this.f70651xdcd1e013);
        m137250x120f5b6(this.f70631x36f49e77.m139478x2061f65d(), this.f70631x36f49e77.m139479x8179cb3());
        this.f70635x3a4f997e.m137437xe5cc0b81().mo138623x58b57ff2(this.f70631x36f49e77);
        this.f70635x3a4f997e.m137437xe5cc0b81().mo138625x5489893f(this.f70635x3a4f997e.m137441x5e5b7e39());
        this.f70635x3a4f997e.m137438xd3b564d1().mo138623x58b57ff2(this.f70631x36f49e77);
        this.f70635x3a4f997e.m137438xd3b564d1().m138781x5489893f(this.f70635x3a4f997e.m137441x5e5b7e39());
        this.f70658x69758830.m138552x6460f9d8().restartInput(this);
        m137276x925f50b();
        getContext().getContentResolver().registerContentObserver(android.provider.Settings.System.getUriFor("show_password"), false, this.f70657xa7f01868);
        m137251x130c280c();
        c28580x69eec95e.m137437xe5cc0b81().mo138626x805e5a65(this);
        c28580x69eec95e.m137438xd3b564d1().m138782x805e5a65(this);
        java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.FlutterEngineAttachmentListener> it = this.f70636xaae041fe.iterator();
        while (it.hasNext()) {
            it.next().m137288xeac04783(c28580x69eec95e);
        }
        if (this.f70644x31e4dbb) {
            this.f70640xa34b51a6.mo2121x6c956b30();
        }
    }

    @Override // android.view.View
    public void autofill(android.util.SparseArray<android.view.autofill.AutofillValue> sparseArray) {
        this.f70658x69758830.m138545x55c963b2(sparseArray);
    }

    /* renamed from: calculateShouldZeroSides */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.ZeroSides m137257x559d477b() {
        android.content.Context context = getContext();
        if (context.getResources().getConfiguration().orientation == 2) {
            int rotation = ((android.hardware.display.DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
            if (rotation == 1) {
                return io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.ZeroSides.RIGHT;
            }
            if (rotation == 3) {
                return io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.ZeroSides.LEFT;
            }
            if (rotation == 0 || rotation == 2) {
                return io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.ZeroSides.BOTH;
            }
        }
        return io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.ZeroSides.NONE;
    }

    /* renamed from: convertToImageView */
    public void mo124143x2f386ab2() {
        this.f70653x5c6c6e37.mo137199x65825f6();
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04 c28548x2ab8be04 = this.f70637x5cf479e4;
        if (c28548x2ab8be04 == null) {
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04 mo124144x74550d04 = mo124144x74550d04();
            this.f70637x5cf479e4 = mo124144x74550d04;
            addView(mo124144x74550d04);
        } else {
            c28548x2ab8be04.m137200x5cd9c406(getWidth(), getHeight());
        }
        this.f70652x6053ac80 = this.f70653x5c6c6e37;
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04 c28548x2ab8be042 = this.f70637x5cf479e4;
        this.f70653x5c6c6e37 = c28548x2ab8be042;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = this.f70635x3a4f997e;
        if (c28580x69eec95e != null) {
            c28548x2ab8be042.mo137189xb6928083(c28580x69eec95e.m137441x5e5b7e39());
        }
    }

    /* renamed from: createImageView */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04 mo124144x74550d04() {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04(getContext(), getWidth(), getHeight(), io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04.SurfaceKind.background);
    }

    /* renamed from: createWindowInfoRepo */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28579xcbe13ad1 m137258xe4ee816c() {
        try {
            return new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28579xcbe13ad1(new p012xc85e97e9.p117xd10bdbf0.p120x31aa22.p121xbddafb2a.C1224x23e26770(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1244x7222407a.INSTANCE.m8625x8dcda235(getContext())));
        } catch (java.lang.NoClassDefFoundError unused) {
            return null;
        }
    }

    /* renamed from: detachFromFlutterEngine */
    public void m137259xf8d3d6a1() {
        io.p3284xd2ae381c.Log.i(TAG, "Detaching from a FlutterEngine: " + this.f70635x3a4f997e);
        if (!m137270xda93b3f5()) {
            io.p3284xd2ae381c.Log.v(TAG, "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.FlutterEngineAttachmentListener> it = this.f70636xaae041fe.iterator();
        while (it.hasNext()) {
            it.next().m137289x64dd4426();
        }
        getContext().getContentResolver().unregisterContentObserver(this.f70657xa7f01868);
        this.f70635x3a4f997e.m137437xe5cc0b81().mo138635xa95a1a22();
        this.f70635x3a4f997e.m137438xd3b564d1().m138788xa95a1a22();
        this.f70635x3a4f997e.m137437xe5cc0b81().mo138634x212f07e4();
        this.f70635x3a4f997e.m137438xd3b564d1().mo138634x212f07e4();
        this.f70631x36f49e77.m139485x41012807();
        this.f70631x36f49e77 = null;
        io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28698xdd848efd c28698xdd848efd = this.f70654xd3b93add;
        if (c28698xdd848efd != null) {
            c28698xdd848efd.m138508x5cd39ffa();
            this.f70654xd3b93add = null;
        }
        this.f70658x69758830.m138552x6460f9d8().restartInput(this);
        this.f70658x69758830.m138549x5cd39ffa();
        this.f70646xa79351c6.m137332x5cd39ffa();
        io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.SpellCheckerSessionSpellCheckerSessionListenerC28699xf8ae7c33 spellCheckerSessionSpellCheckerSessionListenerC28699xf8ae7c33 = this.f70655x2aea3813;
        if (spellCheckerSessionSpellCheckerSessionListenerC28699xf8ae7c33 != null) {
            spellCheckerSessionSpellCheckerSessionListenerC28699xf8ae7c33.m138510x5cd39ffa();
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3305x6343ca5.C28704x4e3d174e c28704x4e3d174e = this.f70650x6378d76e;
        if (c28704x4e3d174e != null) {
            c28704x4e3d174e.m138575x5cd39ffa();
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137441x5e5b7e39 = this.f70635x3a4f997e.m137441x5e5b7e39();
        this.f70644x31e4dbb = false;
        m137441x5e5b7e39.m138037x4c436f6(this.f70640xa34b51a6);
        m137441x5e5b7e39.m138050xc19ba428(this.f70653x5c6c6e37.mo137194x19cc2a81());
        m137441x5e5b7e39.m138045x9afc8f96(false);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e17 = this.f70652x6053ac80;
        if (interfaceC28648x8c0b9e17 != null && this.f70653x5c6c6e37 == this.f70637x5cf479e4) {
            this.f70653x5c6c6e37 = interfaceC28648x8c0b9e17;
        }
        this.f70653x5c6c6e37.mo137191x77fe19c0();
        m137249xbae94259();
        this.f70652x6053ac80 = null;
        this.f70635x3a4f997e = null;
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28543x2b4423f3 c28543x2b4423f3 = this.f70648xcb2c6a66;
        if (c28543x2b4423f3 != null) {
            c28543x2b4423f3.m137095xa6b43041(null);
        }
        this.f70646xa79351c6 = null;
    }

    /* renamed from: detachPlatformBridges */
    public void m137260xf6794e04() {
        io.p3284xd2ae381c.Log.i(TAG, "Detaching all platform bridges from FlutterEngine: " + this.f70635x3a4f997e);
        java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.FlutterEngineAttachmentListener> it = this.f70636xaae041fe.iterator();
        while (it.hasNext()) {
            it.next().m137289x64dd4426();
        }
        this.f70635x3a4f997e.m137437xe5cc0b81().mo138635xa95a1a22();
        this.f70635x3a4f997e.m137437xe5cc0b81().mo138634x212f07e4();
        this.f70631x36f49e77.m139485x41012807();
        this.f70631x36f49e77 = null;
        this.f70658x69758830.m138552x6460f9d8().restartInput(this);
        this.f70658x69758830.m138549x5cd39ffa();
        this.f70646xa79351c6.m137332x5cd39ffa();
        io.p3284xd2ae381c.p3301xc5476f33.p3305x6343ca5.C28704x4e3d174e c28704x4e3d174e = this.f70650x6378d76e;
        if (c28704x4e3d174e != null) {
            c28704x4e3d174e.m138575x5cd39ffa();
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137441x5e5b7e39 = this.f70635x3a4f997e.m137441x5e5b7e39();
        this.f70644x31e4dbb = false;
        m137441x5e5b7e39.m138037x4c436f6(this.f70640xa34b51a6);
        m137441x5e5b7e39.m138045x9afc8f96(false);
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04 c28548x2ab8be04 = this.f70637x5cf479e4;
        if (c28548x2ab8be04 != null) {
            c28548x2ab8be04.m137190x23991ce6();
            removeView(this.f70637x5cf479e4);
            this.f70637x5cf479e4 = null;
        }
        this.f70652x6053ac80 = null;
        this.f70635x3a4f997e = null;
        this.f70646xa79351c6 = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (m137270xda93b3f5() && this.f70646xa79351c6.mo44271x5797ad52(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: findViewByAccessibilityIdTraversal */
    public android.view.View m137261x7a05a9ca(int i17) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return m137246x493b416(i17, this);
        }
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", java.lang.Integer.TYPE);
            declaredMethod.setAccessible(true);
            return (android.view.View) declaredMethod.invoke(this, java.lang.Integer.valueOf(i17));
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    @Override // android.view.View
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657 c28974x81a86657 = this.f70631x36f49e77;
        if (c28974x81a86657 == null || !c28974x81a86657.m139478x2061f65d()) {
            return null;
        }
        return this.f70631x36f49e77;
    }

    /* renamed from: getAttachedFlutterEngine */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137262x60866884() {
        return this.f70635x3a4f997e;
    }

    /* renamed from: getAttachedRenderSurface */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 m137263x82a33d3d() {
        return this.f70653x5c6c6e37;
    }

    /* renamed from: getAttachedRenderer */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137264x385aa5fd() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e17 = this.f70653x5c6c6e37;
        if (interfaceC28648x8c0b9e17 != null) {
            return interfaceC28648x8c0b9e17.mo137192x385aa5fd();
        }
        return null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.ViewDelegate
    /* renamed from: getBinaryMessenger */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 mo137265x3b5b91dc() {
        return this.f70635x3a4f997e.m137427x4255efe8();
    }

    /* renamed from: getCurrentImageSurface */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04 m137266x69942fb5() {
        return this.f70637x5cf479e4;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3305x6343ca5.C28704x4e3d174e.MouseCursorViewDelegate
    /* renamed from: getSystemPointerIcon */
    public android.view.PointerIcon mo137267xd51261f1(int i17) {
        return android.view.PointerIcon.getSystemIcon(getContext(), i17);
    }

    /* renamed from: getViewportMetrics */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics m137268x655b4b07() {
        return this.f70660x80f9793d;
    }

    /* renamed from: hasRenderedFirstFrame */
    public boolean m137269x7422f6c() {
        return this.f70644x31e4dbb;
    }

    /* renamed from: isAttachedToFlutterEngine */
    public boolean m137270xda93b3f5() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = this.f70635x3a4f997e;
        return c28580x69eec95e != null && c28580x69eec95e.m137441x5e5b7e39() == this.f70653x5c6c6e37.mo137192x385aa5fd();
    }

    /* renamed from: isInSwapSurface */
    public boolean m137271xccfd02b() {
        return this.f70645xccfd02b;
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        android.view.DisplayCutout displayCutout;
        android.view.WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 == 29) {
            android.graphics.Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics viewportMetrics = this.f70660x80f9793d;
            viewportMetrics.f71254x9a0ea132 = systemGestureInsets.top;
            viewportMetrics.f71253x50cc1eb9 = systemGestureInsets.right;
            viewportMetrics.f71251xadc4d12e = systemGestureInsets.bottom;
            viewportMetrics.f71252xa7c1bbca = systemGestureInsets.left;
        }
        boolean z17 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z18 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i17 >= 30) {
            android.graphics.Insets insets = windowInsets.getInsets(android.view.WindowInsets.Type.systemBars());
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics viewportMetrics2 = this.f70660x80f9793d;
            viewportMetrics2.f71262xab8f1409 = insets.top;
            viewportMetrics2.f71261x3fb37d0 = insets.right;
            viewportMetrics2.f71259x6078daf7 = insets.bottom;
            viewportMetrics2.f71260xc64fa3d3 = insets.left;
            android.graphics.Insets insets2 = windowInsets.getInsets(android.view.WindowInsets.Type.ime());
            if (this.f70643xf2d83c64) {
                m137252x331a07a4(insets2);
            } else {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics viewportMetrics3 = this.f70660x80f9793d;
                viewportMetrics3.f71258xe9ea0bd = insets2.top;
                viewportMetrics3.f71257xe15a6784 = insets2.right;
                viewportMetrics3.f71255x2effa1c3 = insets2.bottom;
                viewportMetrics3.f71256xc531ad9f = insets2.left;
            }
            android.graphics.Insets insets3 = windowInsets.getInsets(android.view.WindowInsets.Type.systemGestures());
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics viewportMetrics4 = this.f70660x80f9793d;
            viewportMetrics4.f71254x9a0ea132 = insets3.top;
            viewportMetrics4.f71253x50cc1eb9 = insets3.right;
            viewportMetrics4.f71251xadc4d12e = insets3.bottom;
            viewportMetrics4.f71252xa7c1bbca = insets3.left;
            android.view.DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                android.graphics.Insets waterfallInsets = displayCutout2.getWaterfallInsets();
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics viewportMetrics5 = this.f70660x80f9793d;
                viewportMetrics5.f71262xab8f1409 = java.lang.Math.max(java.lang.Math.max(viewportMetrics5.f71262xab8f1409, waterfallInsets.top), displayCutout2.getSafeInsetTop());
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics viewportMetrics6 = this.f70660x80f9793d;
                viewportMetrics6.f71261x3fb37d0 = java.lang.Math.max(java.lang.Math.max(viewportMetrics6.f71261x3fb37d0, waterfallInsets.right), displayCutout2.getSafeInsetRight());
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics viewportMetrics7 = this.f70660x80f9793d;
                viewportMetrics7.f71259x6078daf7 = java.lang.Math.max(java.lang.Math.max(viewportMetrics7.f71259x6078daf7, waterfallInsets.bottom), displayCutout2.getSafeInsetBottom());
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics viewportMetrics8 = this.f70660x80f9793d;
                viewportMetrics8.f71260xc64fa3d3 = java.lang.Math.max(java.lang.Math.max(viewportMetrics8.f71260xc64fa3d3, waterfallInsets.left), displayCutout2.getSafeInsetLeft());
            }
        } else {
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.ZeroSides zeroSides = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.ZeroSides.NONE;
            if (!z18) {
                zeroSides = m137257x559d477b();
            }
            this.f70660x80f9793d.f71262xab8f1409 = z17 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.f70660x80f9793d.f71261x3fb37d0 = (zeroSides == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.ZeroSides.RIGHT || zeroSides == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.f70660x80f9793d.f71259x6078daf7 = (z18 && m137247xed598db4(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.f70660x80f9793d.f71260xc64fa3d3 = (zeroSides == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.ZeroSides.LEFT || zeroSides == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            if (this.f70643xf2d83c64) {
                m137252x331a07a4(android.graphics.Insets.of(0, 0, 0, m137247xed598db4(windowInsets)));
            } else {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics viewportMetrics9 = this.f70660x80f9793d;
                viewportMetrics9.f71258xe9ea0bd = 0;
                viewportMetrics9.f71257xe15a6784 = 0;
                viewportMetrics9.f71255x2effa1c3 = m137247xed598db4(windowInsets);
                this.f70660x80f9793d.f71256xc531ad9f = 0;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i17 >= 28 && (displayCutout = windowInsets.getDisplayCutout()) != null) {
            for (android.graphics.Rect rect : displayCutout.getBoundingRects()) {
                io.p3284xd2ae381c.Log.v(TAG, "DisplayCutout area reported with bounds = " + rect.toString());
                arrayList.add(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeature(rect, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeatureType.CUTOUT, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeatureState.UNKNOWN));
            }
        }
        this.f70660x80f9793d.m138123x5aa18207(arrayList);
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            this.f70633x30d5dd85.m137296x54eae6f2(getContext(), this.f70660x80f9793d);
        }
        io.p3284xd2ae381c.Log.v(TAG, "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.f70660x80f9793d.f71262xab8f1409 + ", Left: " + this.f70660x80f9793d.f71260xc64fa3d3 + ", Right: " + this.f70660x80f9793d.f71261x3fb37d0 + "\nKeyboard insets: Bottom: " + this.f70660x80f9793d.f71255x2effa1c3 + ", Left: " + this.f70660x80f9793d.f71256xc531ad9f + ", Right: " + this.f70660x80f9793d.f71257xe15a6784 + "System Gesture Insets - Left: " + this.f70660x80f9793d.f71252xa7c1bbca + ", Top: " + this.f70660x80f9793d.f71254x9a0ea132 + ", Right: " + this.f70660x80f9793d.f71253x50cc1eb9 + ", Bottom: " + this.f70660x80f9793d.f71255x2effa1c3);
        m137251x130c280c();
        return onApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f70662x2f9d7d50 = m137258xe4ee816c();
        android.app.Activity m139426x19263085 = io.p3284xd2ae381c.p3319x36f002.C28973x1922e4ec.m139426x19263085(getContext());
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28579xcbe13ad1 c28579xcbe13ad1 = this.f70662x2f9d7d50;
        if (c28579xcbe13ad1 == null || m139426x19263085 == null) {
            return;
        }
        this.f70661x68e4c792 = new m3.a() { // from class: io.flutter.embedding.android.FlutterView$$a
            @Override // m3.a
            /* renamed from: accept */
            public final void mo3938xab27b508(java.lang.Object obj) {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.m137282x6a9f70eb((p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28) obj);
            }
        };
        c28579xcbe13ad1.m137403xd55f659d(m139426x19263085, b3.l.m9710x77652c22(getContext()), this.f70661x68e4c792);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f70635x3a4f997e != null) {
            io.p3284xd2ae381c.Log.v(TAG, "Configuration changed. Sending locales and user settings to Flutter.");
            this.f70647x36f30b2c.m138571x71f8eb70(configuration);
            m137276x925f50b();
            io.p3284xd2ae381c.p3319x36f002.C28973x1922e4ec.m139424x1d99141b(getContext(), this.f70635x3a4f997e);
        }
    }

    @Override // android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        return !m137270xda93b3f5() ? super.onCreateInputConnection(editorInfo) : this.f70658x69758830.m138548x7ad57dac(this, this.f70646xa79351c6, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m3.a aVar;
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28579xcbe13ad1 c28579xcbe13ad1 = this.f70662x2f9d7d50;
        if (c28579xcbe13ad1 != null && (aVar = this.f70661x68e4c792) != null) {
            c28579xcbe13ad1.m137404xbfb02c80(aVar);
        }
        this.f70661x68e4c792 = null;
        this.f70662x2f9d7d50 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        if (m137270xda93b3f5() && this.f70632xd973d862.m136974x16dab66c(motionEvent, getContext())) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        return !m137270xda93b3f5() ? super.onHoverEvent(motionEvent) : this.f70631x36f49e77.m139483x32e691cd(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(android.view.ViewStructure viewStructure, int i17) {
        super.onProvideAutofillVirtualStructure(viewStructure, i17);
        this.f70658x69758830.m138556xe9ac3c5c(viewStructure, i17);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        io.p3284xd2ae381c.Log.v(TAG, "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i19 + " x " + i27 + ", it is now " + i17 + " x " + i18);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics viewportMetrics = this.f70660x80f9793d;
        viewportMetrics.f71263x6be2dc6 = i17;
        viewportMetrics.f71249xb7389127 = i18;
        m137251x130c280c();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.ViewDelegate
    /* renamed from: onTextInputKeyEvent */
    public boolean mo137272xfbd0a119(android.view.KeyEvent keyEvent) {
        return this.f70658x69758830.m138554x47b131c3(keyEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!m137270xda93b3f5()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        return this.f70632xd973d862.m136975x667eb1da(motionEvent);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.ViewDelegate
    /* renamed from: redispatch */
    public void mo137273x58ad6fad(android.view.KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    /* renamed from: removeFlutterEngineAttachmentListener */
    public void m137274x70b9cff1(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.FlutterEngineAttachmentListener flutterEngineAttachmentListener) {
        this.f70636xaae041fe.remove(flutterEngineAttachmentListener);
    }

    /* renamed from: removeOnFirstFrameRenderedListener */
    public void m137275xa2124329(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6 interfaceC28647x231975c6) {
        this.f70641xc61ee38d.remove(interfaceC28647x231975c6);
    }

    /* renamed from: revertImageView */
    public void mo124149x5beb491c(final java.lang.Runnable runnable) {
        if (this.f70637x5cf479e4 == null) {
            io.p3284xd2ae381c.Log.v(TAG, "Tried to revert the image view, but no image view is used.");
            return;
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e17 = this.f70652x6053ac80;
        if (interfaceC28648x8c0b9e17 == null) {
            io.p3284xd2ae381c.Log.v(TAG, "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f70653x5c6c6e37 = interfaceC28648x8c0b9e17;
        this.f70652x6053ac80 = null;
        final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137441x5e5b7e39 = this.f70635x3a4f997e.m137441x5e5b7e39();
        if (this.f70635x3a4f997e == null || m137441x5e5b7e39 == null) {
            this.f70637x5cf479e4.mo137191x77fe19c0();
            m137249xbae94259();
            runnable.run();
        } else {
            this.f70653x5c6c6e37.mo137201xc84dc82d();
            final boolean m138028x6250be46 = m137441x5e5b7e39.m138028x6250be46();
            m137441x5e5b7e39.m138017x9a2d27f9(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6() { // from class: io.flutter.embedding.android.FlutterView.6

                /* renamed from: isFirstCallDisplayed */
                private boolean f70668x1fc53a1d = true;

                @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
                /* renamed from: onFlutterUiDisplayed */
                public void mo2121x6c956b30() {
                    if (m138028x6250be46 && this.f70668x1fc53a1d) {
                        this.f70668x1fc53a1d = false;
                        return;
                    }
                    m137441x5e5b7e39.m138037x4c436f6(this);
                    runnable.run();
                    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this;
                    if ((c28553x45ef20c1.f70653x5c6c6e37 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04) || c28553x45ef20c1.f70637x5cf479e4 == null) {
                        return;
                    }
                    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70637x5cf479e4.mo137191x77fe19c0();
                    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.m137249xbae94259();
                }

                @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
                /* renamed from: onFlutterUiNoLongerDisplayed */
                public void mo2122xb9179606() {
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r1 != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* renamed from: sendUserSettingsToFlutter */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m137276x925f50b() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L14
            r0 = r3
            goto L15
        L14:
            r0 = r2
        L15:
            if (r0 == 0) goto L1a
            io.flutter.embedding.engine.systemchannels.SettingsChannel$PlatformBrightness r0 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.PlatformBrightness.dark
            goto L1c
        L1a:
            io.flutter.embedding.engine.systemchannels.SettingsChannel$PlatformBrightness r0 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.PlatformBrightness.light
        L1c:
            android.view.textservice.TextServicesManager r1 = r6.f70659xdb6e482
            if (r1 == 0) goto L55
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L53
            java.util.List r1 = r1.getEnabledSpellCheckerInfos()
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r1.next()
            android.view.textservice.SpellCheckerInfo r4 = (android.view.textservice.SpellCheckerInfo) r4
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r5 = "com.google.android.inputmethod.latin"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L2e
            r1 = r3
            goto L49
        L48:
            r1 = r2
        L49:
            android.view.textservice.TextServicesManager r4 = r6.f70659xdb6e482
            boolean r4 = r4.isSpellCheckerEnabled()
            if (r4 == 0) goto L55
            if (r1 == 0) goto L55
        L53:
            r1 = r3
            goto L56
        L55:
            r1 = r2
        L56:
            io.flutter.embedding.android.FlutterView$FontScaleDelegate r4 = r6.f70642x62363ce0
            if (r4 == 0) goto L5f
            float r4 = r4.mo10648xa2f3d785()
            goto L69
        L5f:
            android.content.res.Resources r4 = r6.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            float r4 = r4.fontScale
        L69:
            io.flutter.embedding.engine.FlutterEngine r5 = r6.f70635x3a4f997e
            io.flutter.embedding.engine.systemchannels.SettingsChannel r5 = r5.m137446xd8a0cd2a()
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r5 = r5.m138331x30e78145()
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r4 = r5.m138341x54570f0a(r4)
            android.content.res.Resources r5 = r6.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r4 = r4.m138338x505376a3(r5)
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r1 = r4.m138339x732162ad(r1)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r3)
            if (r4 != r3) goto L98
            r2 = r3
        L98:
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r1 = r1.m138337xf155ca1d(r2)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r1 = r1.m138342x827522(r2)
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r0 = r1.m138340xbad3a126(r0)
            r0.m138336x35cf88()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.m137276x925f50b():void");
    }

    /* renamed from: setDelegate */
    public void m137277xa7687c07(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28555x71171166 c28555x71171166) {
        this.f70633x30d5dd85 = c28555x71171166;
    }

    /* renamed from: setEnableSwitchSurface */
    public void m137278x5a78fe54(boolean z17) {
        this.f70634xb4046216 = z17;
        if (this.f70656x8053f364 == null) {
            if (this.f70638x17f90336 != null) {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.TextureViewSurfaceTextureListenerC28577x96fffc8a textureViewSurfaceTextureListenerC28577x96fffc8a = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.TextureViewSurfaceTextureListenerC28577x96fffc8a(getContext());
                this.f70656x8053f364 = textureViewSurfaceTextureListenerC28577x96fffc8a;
                textureViewSurfaceTextureListenerC28577x96fffc8a.mo137395x65cf2121(this);
            } else if (this.f70639xcbc704a4 != null || this.f70637x5cf479e4 != null) {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallbackC28575x40f7bb38 surfaceHolderCallbackC28575x40f7bb38 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallbackC28575x40f7bb38(getContext());
                this.f70656x8053f364 = surfaceHolderCallbackC28575x40f7bb38;
                surfaceHolderCallbackC28575x40f7bb38.mo137395x65cf2121(this);
            }
            this.f70645xccfd02b = false;
        }
    }

    /* renamed from: setFontScaleDelegate */
    public void m137279x9100d09e(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.FontScaleDelegate fontScaleDelegate) {
        this.f70642x62363ce0 = fontScaleDelegate;
    }

    /* renamed from: setInMultiWindowMode */
    public void m137280x85e5ffa5(boolean z17) {
        this.f70660x80f9793d.f71264xbd85e402 = z17 ? io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.WindowStatus.SPLIT_SCREEN : io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.WindowStatus.NORMAL;
        m137251x130c280c();
    }

    /* renamed from: setInsetsToFlutterDirect */
    public final void m137281x33be6b52(android.graphics.Rect rect) {
        this.f70643xf2d83c64 = true;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics viewportMetrics = this.f70660x80f9793d;
        viewportMetrics.f71258xe9ea0bd = rect.top;
        viewportMetrics.f71256xc531ad9f = rect.left;
        int i17 = rect.bottom;
        int i18 = viewportMetrics.f71249xb7389127;
        viewportMetrics.f71255x2effa1c3 = i17 > i18 ? 0 : i18 - i17;
        int i19 = rect.right;
        int i27 = viewportMetrics.f71263x6be2dc6;
        viewportMetrics.f71257xe15a6784 = i19 <= i27 ? i27 - i19 : 0;
        m137251x130c280c();
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e17 = this.f70653x5c6c6e37;
        if (interfaceC28648x8c0b9e17 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56) {
            ((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56) interfaceC28648x8c0b9e17).setVisibility(i17);
        }
    }

    /* renamed from: setWindowInfoListenerDisplayFeatures */
    public void m137282x6a9f70eb(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28 c1249xd38bff28) {
        java.util.List<p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1231xeab5c7f4> m8634x8bd250e9 = c1249xd38bff28.m8634x8bd250e9();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1231xeab5c7f4 interfaceC1231xeab5c7f4 : m8634x8bd250e9) {
            io.p3284xd2ae381c.Log.v(TAG, "WindowInfoTracker Display Feature reported with bounds = " + interfaceC1231xeab5c7f4.mo8532x12a519ab().toString() + " and type = " + interfaceC1231xeab5c7f4.getClass().getSimpleName());
            if (interfaceC1231xeab5c7f4 instanceof p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1236x71b7c395) {
                p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1236x71b7c395 interfaceC1236x71b7c395 = (p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1236x71b7c395) interfaceC1231xeab5c7f4;
                arrayList.add(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeature(interfaceC1231xeab5c7f4.mo8532x12a519ab(), interfaceC1236x71b7c395.mo8549xa8cb96b1() == p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1236x71b7c395.OcclusionType.f3873x211a8f ? io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeatureType.HINGE : io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeatureType.FOLD, interfaceC1236x71b7c395.getState() == p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1236x71b7c395.State.f3881x20f779 ? io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeatureState.POSTURE_FLAT : interfaceC1236x71b7c395.getState() == p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1236x71b7c395.State.f3882x7fa1f1f5 ? io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeatureState.POSTURE_HALF_OPENED : io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeatureState.UNKNOWN));
            } else {
                arrayList.add(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeature(interfaceC1231xeab5c7f4.mo8532x12a519ab(), io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeatureType.UNKNOWN, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeatureState.UNKNOWN));
            }
        }
        this.f70660x80f9793d.m138124xc2a8ea5d(arrayList);
        m137251x130c280c();
    }

    /* renamed from: setWxKeyboardAction */
    public void m137283xa83bcec0(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.InterfaceC28702x2a2b165e interfaceC28702x2a2b165e) {
        this.f70649x827e9ccb = interfaceC28702x2a2b165e;
    }

    /* renamed from: switchSurface */
    public void m137284xfa380ad9(boolean z17) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344 interfaceC28651x6b183344;
        boolean z18;
        if (!this.f70634xb4046216 || (interfaceC28651x6b183344 = this.f70656x8053f364) == null || (z18 = this.f70645xccfd02b) == z17) {
            return;
        }
        if (z18) {
            interfaceC28651x6b183344.mo137397xd9789fc0();
        } else {
            interfaceC28651x6b183344.mo137398x614179a();
        }
        this.f70645xccfd02b = !this.f70645xccfd02b;
    }

    /* renamed from: toggleHideCurrentRenderSurface */
    public void m137285x7fe94d14(boolean z17) {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04 c28548x2ab8be04;
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 c28552x398ac0c4;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e17 = this.f70653x5c6c6e37;
        if (interfaceC28648x8c0b9e17 == null) {
            return;
        }
        int i17 = z17 ? 4 : 0;
        if ((interfaceC28648x8c0b9e17 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56) && this.f70638x17f90336 != null) {
            io.p3284xd2ae381c.Log.i(TAG, "not change surfaceView visibility");
        } else if (!(interfaceC28648x8c0b9e17 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4) || (c28552x398ac0c4 = this.f70639xcbc704a4) == null) {
            if ((interfaceC28648x8c0b9e17 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04) && (c28548x2ab8be04 = this.f70637x5cf479e4) != null) {
                c28548x2ab8be04.setVisibility(i17);
            }
        } else if (z17) {
            c28552x398ac0c4.setAlpha(0.0f);
        } else {
            c28552x398ac0c4.setAlpha(1.0f);
        }
        if (z17) {
            return;
        }
        ((android.view.View) this.f70653x5c6c6e37).bringToFront();
    }

    /* renamed from: tryRefreshViewportMetrics */
    public void m137286xd23acc7d() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        m137251x130c280c();
    }

    @java.lang.Deprecated
    public C28553x45ef20c1(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079) {
        super(context, null);
        this.f70641xc61ee38d = new java.util.HashSet();
        this.f70636xaae041fe = new java.util.HashSet();
        this.f70643xf2d83c64 = false;
        this.f70634xb4046216 = false;
        this.f70656x8053f364 = null;
        this.f70645xccfd02b = false;
        this.f70660x80f9793d = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics();
        this.f70651xdcd1e013 = new io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.OnAccessibilityChangeListener
            /* renamed from: onAccessibilityChanged */
            public void mo137287x94836205(boolean z17, boolean z18) {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.m137250x120f5b6(z17, z18);
            }
        };
        this.f70657xa7f01868 = new android.database.ContentObserver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z17) {
                super.onChange(z17);
                if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70635x3a4f997e == null) {
                    return;
                }
                io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.TAG, "System settings changed. Sending user settings to Flutter.");
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.m137276x925f50b();
            }
        };
        this.f70640xa34b51a6 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
            /* renamed from: onFlutterUiDisplayed */
            public void mo2121x6c956b30() {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70644x31e4dbb = true;
                java.util.Iterator it = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70641xc61ee38d.iterator();
                while (it.hasNext()) {
                    ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6) it.next()).mo2121x6c956b30();
                }
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
            /* renamed from: onFlutterUiNoLongerDisplayed */
            public void mo2122xb9179606() {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70644x31e4dbb = false;
                java.util.Iterator it = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70641xc61ee38d.iterator();
                while (it.hasNext()) {
                    ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6) it.next()).mo2122xb9179606();
                }
            }
        };
        this.f70633x30d5dd85 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28555x71171166();
        if (enumC28568xbdfb1079 == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface) {
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56 c28550x85bcbf56 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56(context);
            this.f70638x17f90336 = c28550x85bcbf56;
            this.f70653x5c6c6e37 = c28550x85bcbf56;
        } else if (enumC28568xbdfb1079 == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture) {
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 c28552x398ac0c4 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4(context);
            this.f70639xcbc704a4 = c28552x398ac0c4;
            this.f70653x5c6c6e37 = c28552x398ac0c4;
        } else {
            throw new java.lang.IllegalArgumentException("RenderMode not supported with this constructor: " + enumC28568xbdfb1079);
        }
        m137248x316510();
    }

    @java.lang.Deprecated
    public C28553x45ef20c1(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b enumC28578xae92d13b) {
        this(context, (android.util.AttributeSet) null, new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56(context, enumC28578xae92d13b == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent));
    }

    public C28553x45ef20c1(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56 c28550x85bcbf56) {
        this(context, (android.util.AttributeSet) null, c28550x85bcbf56);
    }

    public C28553x45ef20c1(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 c28552x398ac0c4) {
        this(context, (android.util.AttributeSet) null, c28552x398ac0c4);
    }

    public C28553x45ef20c1(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04 c28548x2ab8be04) {
        this(context, (android.util.AttributeSet) null, c28548x2ab8be04);
    }

    public C28553x45ef20c1(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56(context));
    }

    @java.lang.Deprecated
    public C28553x45ef20c1(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b enumC28578xae92d13b) {
        super(context, null);
        this.f70641xc61ee38d = new java.util.HashSet();
        this.f70636xaae041fe = new java.util.HashSet();
        this.f70643xf2d83c64 = false;
        this.f70634xb4046216 = false;
        this.f70656x8053f364 = null;
        this.f70645xccfd02b = false;
        this.f70660x80f9793d = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics();
        this.f70651xdcd1e013 = new io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.OnAccessibilityChangeListener
            /* renamed from: onAccessibilityChanged */
            public void mo137287x94836205(boolean z17, boolean z18) {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.m137250x120f5b6(z17, z18);
            }
        };
        this.f70657xa7f01868 = new android.database.ContentObserver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z17) {
                super.onChange(z17);
                if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70635x3a4f997e == null) {
                    return;
                }
                io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.TAG, "System settings changed. Sending user settings to Flutter.");
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.m137276x925f50b();
            }
        };
        this.f70640xa34b51a6 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
            /* renamed from: onFlutterUiDisplayed */
            public void mo2121x6c956b30() {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70644x31e4dbb = true;
                java.util.Iterator it = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70641xc61ee38d.iterator();
                while (it.hasNext()) {
                    ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6) it.next()).mo2121x6c956b30();
                }
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
            /* renamed from: onFlutterUiNoLongerDisplayed */
            public void mo2122xb9179606() {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70644x31e4dbb = false;
                java.util.Iterator it = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70641xc61ee38d.iterator();
                while (it.hasNext()) {
                    ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6) it.next()).mo2122xb9179606();
                }
            }
        };
        this.f70633x30d5dd85 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28555x71171166();
        if (enumC28568xbdfb1079 == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface) {
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56 c28550x85bcbf56 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56(context, enumC28578xae92d13b == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent);
            this.f70638x17f90336 = c28550x85bcbf56;
            this.f70653x5c6c6e37 = c28550x85bcbf56;
        } else if (enumC28568xbdfb1079 == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture) {
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 c28552x398ac0c4 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4(context);
            this.f70639xcbc704a4 = c28552x398ac0c4;
            this.f70653x5c6c6e37 = c28552x398ac0c4;
        } else {
            throw new java.lang.IllegalArgumentException("RenderMode not supported with this constructor: " + enumC28568xbdfb1079);
        }
        m137248x316510();
    }

    private C28553x45ef20c1(android.content.Context context, android.util.AttributeSet attributeSet, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56 c28550x85bcbf56) {
        super(context, attributeSet);
        this.f70641xc61ee38d = new java.util.HashSet();
        this.f70636xaae041fe = new java.util.HashSet();
        this.f70643xf2d83c64 = false;
        this.f70634xb4046216 = false;
        this.f70656x8053f364 = null;
        this.f70645xccfd02b = false;
        this.f70660x80f9793d = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics();
        this.f70651xdcd1e013 = new io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.OnAccessibilityChangeListener
            /* renamed from: onAccessibilityChanged */
            public void mo137287x94836205(boolean z17, boolean z18) {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.m137250x120f5b6(z17, z18);
            }
        };
        this.f70657xa7f01868 = new android.database.ContentObserver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z17) {
                super.onChange(z17);
                if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70635x3a4f997e == null) {
                    return;
                }
                io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.TAG, "System settings changed. Sending user settings to Flutter.");
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.m137276x925f50b();
            }
        };
        this.f70640xa34b51a6 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
            /* renamed from: onFlutterUiDisplayed */
            public void mo2121x6c956b30() {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70644x31e4dbb = true;
                java.util.Iterator it = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70641xc61ee38d.iterator();
                while (it.hasNext()) {
                    ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6) it.next()).mo2121x6c956b30();
                }
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
            /* renamed from: onFlutterUiNoLongerDisplayed */
            public void mo2122xb9179606() {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70644x31e4dbb = false;
                java.util.Iterator it = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70641xc61ee38d.iterator();
                while (it.hasNext()) {
                    ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6) it.next()).mo2122xb9179606();
                }
            }
        };
        this.f70633x30d5dd85 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28555x71171166();
        this.f70638x17f90336 = c28550x85bcbf56;
        this.f70653x5c6c6e37 = c28550x85bcbf56;
        m137248x316510();
    }

    private C28553x45ef20c1(android.content.Context context, android.util.AttributeSet attributeSet, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 c28552x398ac0c4) {
        super(context, attributeSet);
        this.f70641xc61ee38d = new java.util.HashSet();
        this.f70636xaae041fe = new java.util.HashSet();
        this.f70643xf2d83c64 = false;
        this.f70634xb4046216 = false;
        this.f70656x8053f364 = null;
        this.f70645xccfd02b = false;
        this.f70660x80f9793d = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics();
        this.f70651xdcd1e013 = new io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.OnAccessibilityChangeListener
            /* renamed from: onAccessibilityChanged */
            public void mo137287x94836205(boolean z17, boolean z18) {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.m137250x120f5b6(z17, z18);
            }
        };
        this.f70657xa7f01868 = new android.database.ContentObserver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z17) {
                super.onChange(z17);
                if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70635x3a4f997e == null) {
                    return;
                }
                io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.TAG, "System settings changed. Sending user settings to Flutter.");
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.m137276x925f50b();
            }
        };
        this.f70640xa34b51a6 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
            /* renamed from: onFlutterUiDisplayed */
            public void mo2121x6c956b30() {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70644x31e4dbb = true;
                java.util.Iterator it = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70641xc61ee38d.iterator();
                while (it.hasNext()) {
                    ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6) it.next()).mo2121x6c956b30();
                }
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
            /* renamed from: onFlutterUiNoLongerDisplayed */
            public void mo2122xb9179606() {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70644x31e4dbb = false;
                java.util.Iterator it = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70641xc61ee38d.iterator();
                while (it.hasNext()) {
                    ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6) it.next()).mo2122xb9179606();
                }
            }
        };
        this.f70633x30d5dd85 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28555x71171166();
        this.f70639xcbc704a4 = c28552x398ac0c4;
        this.f70653x5c6c6e37 = c28552x398ac0c4;
        m137248x316510();
    }

    private C28553x45ef20c1(android.content.Context context, android.util.AttributeSet attributeSet, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04 c28548x2ab8be04) {
        super(context, attributeSet);
        this.f70641xc61ee38d = new java.util.HashSet();
        this.f70636xaae041fe = new java.util.HashSet();
        this.f70643xf2d83c64 = false;
        this.f70634xb4046216 = false;
        this.f70656x8053f364 = null;
        this.f70645xccfd02b = false;
        this.f70660x80f9793d = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics();
        this.f70651xdcd1e013 = new io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.OnAccessibilityChangeListener
            /* renamed from: onAccessibilityChanged */
            public void mo137287x94836205(boolean z17, boolean z18) {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.m137250x120f5b6(z17, z18);
            }
        };
        this.f70657xa7f01868 = new android.database.ContentObserver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z17) {
                super.onChange(z17);
                if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70635x3a4f997e == null) {
                    return;
                }
                io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.TAG, "System settings changed. Sending user settings to Flutter.");
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.m137276x925f50b();
            }
        };
        this.f70640xa34b51a6 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
            /* renamed from: onFlutterUiDisplayed */
            public void mo2121x6c956b30() {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70644x31e4dbb = true;
                java.util.Iterator it = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70641xc61ee38d.iterator();
                while (it.hasNext()) {
                    ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6) it.next()).mo2121x6c956b30();
                }
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
            /* renamed from: onFlutterUiNoLongerDisplayed */
            public void mo2122xb9179606() {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70644x31e4dbb = false;
                java.util.Iterator it = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.this.f70641xc61ee38d.iterator();
                while (it.hasNext()) {
                    ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6) it.next()).mo2122xb9179606();
                }
            }
        };
        this.f70633x30d5dd85 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28555x71171166();
        this.f70637x5cf479e4 = c28548x2ab8be04;
        this.f70653x5c6c6e37 = c28548x2ab8be04;
        m137248x316510();
    }
}
