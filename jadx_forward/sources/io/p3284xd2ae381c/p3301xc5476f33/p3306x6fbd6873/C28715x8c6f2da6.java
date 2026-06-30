package io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873;

/* renamed from: io.flutter.plugin.platform.PlatformPlugin */
/* loaded from: classes15.dex */
public class C28715x8c6f2da6 {

    /* renamed from: DEFAULT_SYSTEM_UI */
    public static final int f71781xaae8e06 = 1280;
    private static final java.lang.String TAG = "PlatformPlugin";

    /* renamed from: _hellAccFlag_ */
    private byte f71782x7f11beae;

    /* renamed from: activity */
    private final android.app.Activity f71783x9d4bf30f;

    /* renamed from: currentTheme */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemChromeStyle f71784x56ed4bd0;

    /* renamed from: mEnabledOverlays */
    private int f71785xe1d19457;

    /* renamed from: mPlatformMessageHandler */
    final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler f71786x8c70563;

    /* renamed from: platformChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0 f71787x8548d510;

    /* renamed from: platformPluginDelegate */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.PlatformPluginDelegate f71788xdeb9bd2b;

    /* renamed from: io.flutter.plugin.platform.PlatformPlugin$2, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class AnonymousClass2 implements android.view.View.OnSystemUiVisibilityChangeListener {

        /* renamed from: val$decorView */
        final /* synthetic */ android.view.View f71791x24f807e7;

        public AnonymousClass2(android.view.View view) {
            this.f71791x24f807e7 = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onSystemUiVisibilityChange$0 */
        public /* synthetic */ void m138693x2e4720ed(int i17) {
            if ((i17 & 4) == 0) {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.this.f71787x8548d510.m138207xd0484ceb(true);
            } else {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.this.f71787x8548d510.m138207xd0484ceb(false);
            }
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(final int i17) {
            this.f71791x24f807e7.post(new java.lang.Runnable() { // from class: io.flutter.plugin.platform.PlatformPlugin$2$$a
                @Override // java.lang.Runnable
                public final void run() {
                    io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.AnonymousClass2.this.m138693x2e4720ed(i17);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugin.platform.PlatformPlugin$3, reason: invalid class name */
    /* loaded from: classes15.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness */
        static final /* synthetic */ int[] f71792xfa6fb21b;

        /* renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType */
        static final /* synthetic */ int[] f71793x98e77c60;

        /* renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay */
        static final /* synthetic */ int[] f71794x4c113a23;

        static {
            int[] iArr = new int[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.Brightness.m138213xcee59d22().length];
            f71792xfa6fb21b = iArr;
            try {
                iArr[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.Brightness.DARK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f71792xfa6fb21b[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.Brightness.LIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiOverlay.m138243xcee59d22().length];
            f71794x4c113a23 = iArr2;
            try {
                iArr2[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiOverlay.TOP_OVERLAYS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f71794x4c113a23[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiOverlay.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.HapticFeedbackType.m138228xcee59d22().length];
            f71793x98e77c60 = iArr3;
            try {
                iArr3[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.HapticFeedbackType.STANDARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f71793x98e77c60[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.HapticFeedbackType.LIGHT_IMPACT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f71793x98e77c60[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.HapticFeedbackType.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f71793x98e77c60[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.HapticFeedbackType.HEAVY_IMPACT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f71793x98e77c60[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.HapticFeedbackType.SELECTION_CLICK.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: io.flutter.plugin.platform.PlatformPlugin$PlatformPluginDelegate */
    /* loaded from: classes15.dex */
    public interface PlatformPluginDelegate {
        /* renamed from: popSystemNavigator */
        boolean mo137017x946ed657();

        /* renamed from: setFrameworkHandlesBack */
        default void mo137024xb9d44976(boolean z17) {
        }
    }

    public C28715x8c6f2da6(android.app.Activity activity, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0 c28662x49db8cf0) {
        this(activity, c28662x49db8cf0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clipboardHasStrings */
    public boolean m138676x6f89cbe() {
        android.content.ClipDescription primaryClipDescription;
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) this.f71783x9d4bf30f.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getClipboardData */
    public java.lang.CharSequence m138677xcb2742aa(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.ClipboardContentFormat clipboardContentFormat) {
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) this.f71783x9d4bf30f.getSystemService("clipboard");
        java.lang.CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                android.content.ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (clipboardContentFormat != null && clipboardContentFormat != io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.ClipboardContentFormat.PLAIN_TEXT) {
                    return null;
                }
                android.content.ClipData.Item itemAt = primaryClip.getItemAt(0);
                java.lang.CharSequence text = itemAt.getText();
                if (text == null) {
                    try {
                        android.net.Uri uri = itemAt.getUri();
                        if (uri == null) {
                            io.p3284xd2ae381c.Log.w(TAG, "Clipboard item contained no textual content nor a URI to retrieve it from.");
                            return null;
                        }
                        java.lang.String scheme = uri.getScheme();
                        if (!scheme.equals("content")) {
                            io.p3284xd2ae381c.Log.w(TAG, "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                            return null;
                        }
                        android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor = this.f71783x9d4bf30f.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                        text = itemAt.coerceToText(this.f71783x9d4bf30f);
                        if (openTypedAssetFileDescriptor != null) {
                            openTypedAssetFileDescriptor.close();
                        }
                    } catch (java.io.IOException e17) {
                        e = e17;
                        charSequence = text;
                        io.p3284xd2ae381c.Log.w(TAG, "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                        return charSequence;
                    }
                }
                return text;
            } catch (java.io.IOException e18) {
                e = e18;
            }
        } catch (java.io.FileNotFoundException unused) {
            io.p3284xd2ae381c.Log.w(TAG, "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (java.lang.SecurityException e19) {
            io.p3284xd2ae381c.Log.w(TAG, "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e19);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: playSystemSound */
    public void m138678xa36a404c(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SoundType soundType) {
        if (soundType == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SoundType.CLICK) {
            this.f71783x9d4bf30f.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: popSystemNavigator */
    public void m138679x946ed657() {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.PlatformPluginDelegate platformPluginDelegate = this.f71788xdeb9bd2b;
        if (platformPluginDelegate == null || !platformPluginDelegate.mo137017x946ed657()) {
            android.app.Activity activity = this.f71783x9d4bf30f;
            if (!(activity instanceof p012xc85e97e9.p013x9d4bf30f.k)) {
                activity.finish();
            } else {
                try {
                    ((p012xc85e97e9.p013x9d4bf30f.k) activity).mo2510x96a7816d().c();
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: restoreSystemChromeSystemUIOverlays */
    public void m138680x184ed9d() {
        m138691xef494f4f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setClipboardData */
    public void m138681x5dfda91e(java.lang.String str) {
        ((android.content.ClipboardManager) this.f71783x9d4bf30f.getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText("text label?", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setFrameworkHandlesBack */
    public void m138682xb9d44976(boolean z17) {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.PlatformPluginDelegate platformPluginDelegate = this.f71788xdeb9bd2b;
        if (platformPluginDelegate != null) {
            platformPluginDelegate.mo137024xb9d44976(z17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setSystemChromeApplicationSwitcherDescription */
    public void m138683x9f7fa4d6(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.AppSwitcherDescription appSwitcherDescription) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            this.f71783x9d4bf30f.setTaskDescription(new android.app.ActivityManager.TaskDescription(appSwitcherDescription.f71334x61f7ef4, (android.graphics.Bitmap) null, appSwitcherDescription.f71333x5a72f63));
        } else {
            this.f71783x9d4bf30f.setTaskDescription(new android.app.ActivityManager.TaskDescription(appSwitcherDescription.f71334x61f7ef4, 0, appSwitcherDescription.f71333x5a72f63));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setSystemChromeChangeListener */
    public void m138684x12ccc86f() {
        android.view.View decorView = this.f71783x9d4bf30f.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.AnonymousClass2(decorView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setSystemChromeEnabledSystemUIMode */
    public void m138685xf79aa61c(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode systemUiMode) {
        int i17;
        if (systemUiMode == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode.LEAN_BACK) {
            i17 = 1798;
        } else if (systemUiMode == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode.IMMERSIVE) {
            i17 = 3846;
        } else if (systemUiMode == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode.IMMERSIVE_STICKY) {
            i17 = 5894;
        } else if (systemUiMode != io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode.EDGE_TO_EDGE || android.os.Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            i17 = 1792;
        }
        this.f71785xe1d19457 = i17;
        m138691xef494f4f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setSystemChromeEnabledSystemUIOverlays */
    public void m138686x40ece1c(java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiOverlay> list) {
        int i17 = list.size() == 0 ? 5894 : 1798;
        for (int i18 = 0; i18 < list.size(); i18++) {
            int i19 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.AnonymousClass3.f71794x4c113a23[list.get(i18).ordinal()];
            if (i19 == 1) {
                i17 &= -5;
            } else if (i19 == 2) {
                i17 = i17 & (-513) & (-3);
            }
        }
        this.f71785xe1d19457 = i17;
        m138691xef494f4f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setSystemChromePreferredOrientations */
    public void m138687x82810179(int i17) {
        this.f71783x9d4bf30f.setRequestedOrientation(i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @java.lang.Deprecated
    /* renamed from: setSystemChromeSystemUIOverlayStyle */
    public void m138688x29b90f8f(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemChromeStyle systemChromeStyle) {
        android.view.Window window = this.f71783x9d4bf30f.getWindow();
        n3.m3 m3Var = new n3.m3(window, window.getDecorView());
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.Brightness brightness = systemChromeStyle.f71361x2b00fecb;
        if (brightness != null) {
            int i18 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.AnonymousClass3.f71792xfa6fb21b[brightness.ordinal()];
            if (i18 == 1) {
                m3Var.c(true);
            } else if (i18 == 2) {
                m3Var.c(false);
            }
        }
        java.lang.Integer num = systemChromeStyle.f71360xc5f67922;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        java.lang.Boolean bool = systemChromeStyle.f71366x77413b56;
        if (bool != null && i17 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i17 >= 26) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.Brightness brightness2 = systemChromeStyle.f71365xeb4e9d3a;
            if (brightness2 != null) {
                int i19 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.AnonymousClass3.f71792xfa6fb21b[brightness2.ordinal()];
                if (i19 == 1) {
                    m3Var.b(true);
                } else if (i19 == 2) {
                    m3Var.b(false);
                }
            }
            java.lang.Integer num2 = systemChromeStyle.f71362xb01b11d3;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        java.lang.Integer num3 = systemChromeStyle.f71364x30a2b35a;
        if (num3 != null && i17 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        java.lang.Boolean bool2 = systemChromeStyle.f71363x165c8974;
        if (bool2 != null && i17 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f71784x56ed4bd0 = systemChromeStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: share */
    public void m138689x6854fdf(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        android.app.Activity activity = this.f71783x9d4bf30f;
        android.content.Intent createChooser = android.content.Intent.createChooser(intent, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(createChooser);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "io/flutter/plugin/platform/PlatformPlugin", ya.a.f77453x4b357bf, "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "io/flutter/plugin/platform/PlatformPlugin", ya.a.f77453x4b357bf, "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: destroy */
    public void m138690x5cd39ffa() {
        this.f71787x8548d510.m138206xde722b98(null);
    }

    /* renamed from: updateSystemUiOverlays */
    public void m138691xef494f4f() {
        this.f71783x9d4bf30f.getWindow().getDecorView().setSystemUiVisibility(this.f71785xe1d19457);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemChromeStyle systemChromeStyle = this.f71784x56ed4bd0;
        if (systemChromeStyle != null) {
            m138688x29b90f8f(systemChromeStyle);
        }
    }

    /* renamed from: vibrateHapticFeedback */
    public void m138692x8a7eee8b(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.HapticFeedbackType hapticFeedbackType) {
        android.view.View decorView = this.f71783x9d4bf30f.getWindow().getDecorView();
        int i17 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.AnonymousClass3.f71793x98e77c60[hapticFeedbackType.ordinal()];
        if (i17 == 1) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (i17 == 2) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (i17 == 3) {
            decorView.performHapticFeedback(3);
        } else if (i17 == 4) {
            decorView.performHapticFeedback(6);
        } else {
            if (i17 != 5) {
                return;
            }
            decorView.performHapticFeedback(4);
        }
    }

    public C28715x8c6f2da6(android.app.Activity activity, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0 c28662x49db8cf0, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.PlatformPluginDelegate platformPluginDelegate) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler platformMessageHandler = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler() { // from class: io.flutter.plugin.platform.PlatformPlugin.1
            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
            /* renamed from: clipboardHasStrings */
            public boolean mo129461x6f89cbe() {
                return io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.this.m138676x6f89cbe();
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
            /* renamed from: getClipboardData */
            public java.lang.CharSequence mo129462xcb2742aa(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.ClipboardContentFormat clipboardContentFormat) {
                return io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.this.m138677xcb2742aa(clipboardContentFormat);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
            /* renamed from: playSystemSound */
            public void mo129463xa36a404c(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SoundType soundType) {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.this.m138678xa36a404c(soundType);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
            /* renamed from: popSystemNavigator */
            public void mo129464x946ed657() {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.this.m138679x946ed657();
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
            /* renamed from: restoreSystemUiOverlays */
            public void mo129465xe719bf14() {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.this.m138680x184ed9d();
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
            /* renamed from: setApplicationSwitcherDescription */
            public void mo129466xaa98fed(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.AppSwitcherDescription appSwitcherDescription) {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.this.m138683x9f7fa4d6(appSwitcherDescription);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
            /* renamed from: setClipboardData */
            public void mo129467x5dfda91e(java.lang.String str) {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.this.m138681x5dfda91e(str);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
            /* renamed from: setFrameworkHandlesBack */
            public void mo129468xb9d44976(boolean z17) {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.this.m138682xb9d44976(z17);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
            /* renamed from: setPreferredOrientations */
            public void mo129469x3268f082(int i17) {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.this.m138687x82810179(i17);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
            /* renamed from: setSystemUiChangeListener */
            public void mo129470xe725df89() {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.this.m138684x12ccc86f();
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
            /* renamed from: setSystemUiOverlayStyle */
            public void mo129471x73636b86(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemChromeStyle systemChromeStyle) {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.this.m138688x29b90f8f(systemChromeStyle);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
            /* renamed from: share */
            public void mo129472x6854fdf(java.lang.String str) {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.this.m138689x6854fdf(str);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
            /* renamed from: showSystemOverlays */
            public void mo129473x2e98a5cf(java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiOverlay> list) {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.this.m138686x40ece1c(list);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
            /* renamed from: showSystemUiMode */
            public void mo129474x8743ad03(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode systemUiMode) {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.this.m138685xf79aa61c(systemUiMode);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
            /* renamed from: vibrateHapticFeedback */
            public void mo129475x8a7eee8b(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.HapticFeedbackType hapticFeedbackType) {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.this.m138692x8a7eee8b(hapticFeedbackType);
            }
        };
        this.f71786x8c70563 = platformMessageHandler;
        this.f71783x9d4bf30f = activity;
        this.f71787x8548d510 = c28662x49db8cf0;
        c28662x49db8cf0.m138206xde722b98(platformMessageHandler);
        this.f71788xdeb9bd2b = platformPluginDelegate;
        this.f71785xe1d19457 = 1280;
    }
}
