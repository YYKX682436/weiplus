package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel */
/* loaded from: classes15.dex */
public class C28662x49db8cf0 {
    private static final java.lang.String TAG = "PlatformChannel";

    /* renamed from: channel */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f71326x2c0b7d03;

    /* renamed from: parsingMethodCallHandler */
    final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler f71327x74fe9b;

    /* renamed from: platformMessageHandler */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler f71328x42601896;

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$2, reason: invalid class name */
    /* loaded from: classes15.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation */
        static final /* synthetic */ int[] f71330x92f09090;

        /* renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode */
        static final /* synthetic */ int[] f71331xf03f4cb0;

        /* renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay */
        static final /* synthetic */ int[] f71332x4c113a23;

        static {
            int[] iArr = new int[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode.m138238xcee59d22().length];
            f71331xf03f4cb0 = iArr;
            try {
                iArr[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode.LEAN_BACK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f71331xf03f4cb0[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode.IMMERSIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f71331xf03f4cb0[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode.IMMERSIVE_STICKY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f71331xf03f4cb0[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode.EDGE_TO_EDGE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiOverlay.m138243xcee59d22().length];
            f71332x4c113a23 = iArr2;
            try {
                iArr2[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiOverlay.TOP_OVERLAYS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f71332x4c113a23[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiOverlay.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.DeviceOrientation.m138223xcee59d22().length];
            f71330x92f09090 = iArr3;
            try {
                iArr3[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.DeviceOrientation.PORTRAIT_UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f71330x92f09090[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.DeviceOrientation.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f71330x92f09090[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.DeviceOrientation.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                f71330x92f09090[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.DeviceOrientation.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$AppSwitcherDescription */
    /* loaded from: classes15.dex */
    public static class AppSwitcherDescription {

        /* renamed from: color */
        public final int f71333x5a72f63;

        /* renamed from: label */
        public final java.lang.String f71334x61f7ef4;

        public AppSwitcherDescription(int i17, java.lang.String str) {
            this.f71333x5a72f63 = i17;
            this.f71334x61f7ef4 = str;
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$Brightness */
    /* loaded from: classes15.dex */
    public enum Brightness {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");


        /* renamed from: encodedName */
        private java.lang.String f71338x72d13cb9;

        Brightness(java.lang.String str) {
            this.f71338x72d13cb9 = str;
        }

        /* renamed from: fromValue */
        public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.Brightness m138211x447c3e7(java.lang.String str) {
            for (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.Brightness brightness : m138213xcee59d22()) {
                if (brightness.f71338x72d13cb9.equals(str)) {
                    return brightness;
                }
            }
            throw new java.lang.NoSuchFieldException("No such Brightness: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$ClipboardContentFormat */
    /* loaded from: classes15.dex */
    public enum ClipboardContentFormat {
        PLAIN_TEXT("text/plain");


        /* renamed from: encodedName */
        private java.lang.String f71341x72d13cb9;

        ClipboardContentFormat(java.lang.String str) {
            this.f71341x72d13cb9 = str;
        }

        /* renamed from: fromValue */
        public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.ClipboardContentFormat m138216x447c3e7(java.lang.String str) {
            for (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.ClipboardContentFormat clipboardContentFormat : m138218xcee59d22()) {
                if (clipboardContentFormat.f71341x72d13cb9.equals(str)) {
                    return clipboardContentFormat;
                }
            }
            throw new java.lang.NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation */
    /* loaded from: classes15.dex */
    public enum DeviceOrientation {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");


        /* renamed from: encodedName */
        private java.lang.String f71347x72d13cb9;

        DeviceOrientation(java.lang.String str) {
            this.f71347x72d13cb9 = str;
        }

        /* renamed from: fromValue */
        public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.DeviceOrientation m138221x447c3e7(java.lang.String str) {
            for (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.DeviceOrientation deviceOrientation : m138223xcee59d22()) {
                if (deviceOrientation.f71347x72d13cb9.equals(str)) {
                    return deviceOrientation;
                }
            }
            throw new java.lang.NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType */
    /* loaded from: classes15.dex */
    public enum HapticFeedbackType {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");


        /* renamed from: encodedName */
        private final java.lang.String f71354x72d13cb9;

        HapticFeedbackType(java.lang.String str) {
            this.f71354x72d13cb9 = str;
        }

        /* renamed from: fromValue */
        public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.HapticFeedbackType m138226x447c3e7(java.lang.String str) {
            for (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.HapticFeedbackType hapticFeedbackType : m138228xcee59d22()) {
                java.lang.String str2 = hapticFeedbackType.f71354x72d13cb9;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return hapticFeedbackType;
                }
            }
            throw new java.lang.NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$PlatformMessageHandler */
    /* loaded from: classes15.dex */
    public interface PlatformMessageHandler {
        /* renamed from: clipboardHasStrings */
        boolean mo129461x6f89cbe();

        /* renamed from: getClipboardData */
        java.lang.CharSequence mo129462xcb2742aa(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.ClipboardContentFormat clipboardContentFormat);

        /* renamed from: playSystemSound */
        void mo129463xa36a404c(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SoundType soundType);

        /* renamed from: popSystemNavigator */
        void mo129464x946ed657();

        /* renamed from: restoreSystemUiOverlays */
        void mo129465xe719bf14();

        /* renamed from: setApplicationSwitcherDescription */
        void mo129466xaa98fed(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.AppSwitcherDescription appSwitcherDescription);

        /* renamed from: setClipboardData */
        void mo129467x5dfda91e(java.lang.String str);

        /* renamed from: setFrameworkHandlesBack */
        default void mo129468xb9d44976(boolean z17) {
        }

        /* renamed from: setPreferredOrientations */
        void mo129469x3268f082(int i17);

        /* renamed from: setSystemUiChangeListener */
        void mo129470xe725df89();

        /* renamed from: setSystemUiOverlayStyle */
        void mo129471x73636b86(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemChromeStyle systemChromeStyle);

        /* renamed from: share */
        void mo129472x6854fdf(java.lang.String str);

        /* renamed from: showSystemOverlays */
        void mo129473x2e98a5cf(java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiOverlay> list);

        /* renamed from: showSystemUiMode */
        void mo129474x8743ad03(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode systemUiMode);

        /* renamed from: vibrateHapticFeedback */
        void mo129475x8a7eee8b(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.HapticFeedbackType hapticFeedbackType);
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$SoundType */
    /* loaded from: classes15.dex */
    public enum SoundType {
        CLICK("SystemSoundType.click"),
        TICK("SystemSoundType.tick"),
        ALERT("SystemSoundType.alert");


        /* renamed from: encodedName */
        private final java.lang.String f71359x72d13cb9;

        SoundType(java.lang.String str) {
            this.f71359x72d13cb9 = str;
        }

        /* renamed from: fromValue */
        public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SoundType m138231x447c3e7(java.lang.String str) {
            for (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SoundType soundType : m138233xcee59d22()) {
                if (soundType.f71359x72d13cb9.equals(str)) {
                    return soundType;
                }
            }
            throw new java.lang.NoSuchFieldException("No such SoundType: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemChromeStyle */
    /* loaded from: classes15.dex */
    public static class SystemChromeStyle {

        /* renamed from: statusBarColor */
        public final java.lang.Integer f71360xc5f67922;

        /* renamed from: statusBarIconBrightness */
        public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.Brightness f71361x2b00fecb;

        /* renamed from: systemNavigationBarColor */
        public final java.lang.Integer f71362xb01b11d3;

        /* renamed from: systemNavigationBarContrastEnforced */
        public final java.lang.Boolean f71363x165c8974;

        /* renamed from: systemNavigationBarDividerColor */
        public final java.lang.Integer f71364x30a2b35a;

        /* renamed from: systemNavigationBarIconBrightness */
        public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.Brightness f71365xeb4e9d3a;

        /* renamed from: systemStatusBarContrastEnforced */
        public final java.lang.Boolean f71366x77413b56;

        public SystemChromeStyle(java.lang.Integer num, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.Brightness brightness, java.lang.Boolean bool, java.lang.Integer num2, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.Brightness brightness2, java.lang.Integer num3, java.lang.Boolean bool2) {
            this.f71360xc5f67922 = num;
            this.f71361x2b00fecb = brightness;
            this.f71366x77413b56 = bool;
            this.f71362xb01b11d3 = num2;
            this.f71365xeb4e9d3a = brightness2;
            this.f71364x30a2b35a = num3;
            this.f71363x165c8974 = bool2;
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiMode */
    /* loaded from: classes15.dex */
    public enum SystemUiMode {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");


        /* renamed from: encodedName */
        private java.lang.String f71372x72d13cb9;

        SystemUiMode(java.lang.String str) {
            this.f71372x72d13cb9 = str;
        }

        /* renamed from: fromValue */
        public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode m138236x447c3e7(java.lang.String str) {
            for (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode systemUiMode : m138238xcee59d22()) {
                if (systemUiMode.f71372x72d13cb9.equals(str)) {
                    return systemUiMode;
                }
            }
            throw new java.lang.NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay */
    /* loaded from: classes15.dex */
    public enum SystemUiOverlay {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");


        /* renamed from: encodedName */
        private java.lang.String f71376x72d13cb9;

        SystemUiOverlay(java.lang.String str) {
            this.f71376x72d13cb9 = str;
        }

        /* renamed from: fromValue */
        public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiOverlay m138241x447c3e7(java.lang.String str) {
            for (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiOverlay systemUiOverlay : m138243xcee59d22()) {
                if (systemUiOverlay.f71376x72d13cb9.equals(str)) {
                    return systemUiOverlay;
                }
            }
            throw new java.lang.NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public C28662x49db8cf0(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler methodCallHandler = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.PlatformChannel.1
            /* JADX WARN: Removed duplicated region for block: B:26:0x013a A[Catch: JSONException -> 0x0267, TryCatch #5 {JSONException -> 0x0267, blocks: (B:7:0x002a, B:8:0x002e, B:13:0x00db, B:15:0x00e0, B:17:0x00f0, B:19:0x0109, B:21:0x011d, B:31:0x0121, B:24:0x012e, B:26:0x013a, B:28:0x0147, B:33:0x0126, B:34:0x014c, B:36:0x015a, B:38:0x0190, B:40:0x019e, B:50:0x022f, B:57:0x024b, B:89:0x0187, B:68:0x01c5, B:82:0x01e7, B:47:0x0207, B:75:0x0227, B:54:0x0243, B:61:0x025f, B:91:0x0033, B:94:0x003e, B:97:0x0049, B:100:0x0055, B:103:0x0061, B:106:0x006c, B:109:0x0077, B:112:0x0081, B:115:0x008b, B:118:0x0095, B:121:0x009f, B:124:0x00a9, B:127:0x00b4, B:130:0x00bf, B:133:0x00ca, B:43:0x01f0), top: B:6:0x002a, inners: #2, #6, #8, #12 }] */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0147 A[Catch: JSONException -> 0x0267, TryCatch #5 {JSONException -> 0x0267, blocks: (B:7:0x002a, B:8:0x002e, B:13:0x00db, B:15:0x00e0, B:17:0x00f0, B:19:0x0109, B:21:0x011d, B:31:0x0121, B:24:0x012e, B:26:0x013a, B:28:0x0147, B:33:0x0126, B:34:0x014c, B:36:0x015a, B:38:0x0190, B:40:0x019e, B:50:0x022f, B:57:0x024b, B:89:0x0187, B:68:0x01c5, B:82:0x01e7, B:47:0x0207, B:75:0x0227, B:54:0x0243, B:61:0x025f, B:91:0x0033, B:94:0x003e, B:97:0x0049, B:100:0x0055, B:103:0x0061, B:106:0x006c, B:109:0x0077, B:112:0x0081, B:115:0x008b, B:118:0x0095, B:121:0x009f, B:124:0x00a9, B:127:0x00b4, B:130:0x00bf, B:133:0x00ca, B:43:0x01f0), top: B:6:0x002a, inners: #2, #6, #8, #12 }] */
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
            /* renamed from: onMethodCall */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff r6, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result r7) {
                /*
                    Method dump skipped, instructions count: 734
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.AnonymousClass1.mo294x9bfdc61e(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
            }
        };
        this.f71327x74fe9b = methodCallHandler;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(c28604xeb2eb192, "flutter/platform", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28684x5180d5ad.f71608x4fbc8495);
        this.f71326x2c0b7d03 = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(methodCallHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: decodeAppSwitcherDescription */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.AppSwitcherDescription m138201xcdaca608(org.json.JSONObject jSONObject) {
        int i17 = jSONObject.getInt("primaryColor");
        if (i17 != 0) {
            i17 |= -16777216;
        }
        return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.AppSwitcherDescription(i17, jSONObject.getString("label"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x003e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0053 A[RETURN] */
    /* renamed from: decodeOrientations */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m138202xc7d835b1(org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L38
            java.lang.String r4 = r10.getString(r1)
            io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation r4 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.DeviceOrientation.m138221x447c3e7(r4)
            int[] r8 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.AnonymousClass2.f71330x92f09090
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L30
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L2a
            if (r4 == r5) goto L27
            goto L32
        L27:
            r2 = r2 | 8
            goto L32
        L2a:
            r2 = r2 | 2
            goto L32
        L2d:
            r2 = r2 | 4
            goto L32
        L30:
            r2 = r2 | 1
        L32:
            if (r3 != 0) goto L35
            r3 = r2
        L35:
            int r1 = r1 + 1
            goto L4
        L38:
            if (r2 == 0) goto L57
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L56;
                case 3: goto L4d;
                case 4: goto L4c;
                case 5: goto L4a;
                case 6: goto L4d;
                case 7: goto L4d;
                case 8: goto L49;
                case 9: goto L4d;
                case 10: goto L46;
                case 11: goto L45;
                case 12: goto L4d;
                case 13: goto L4d;
                case 14: goto L4d;
                case 15: goto L42;
                default: goto L41;
            }
        L41:
            goto L53
        L42:
            r10 = 13
            return r10
        L45:
            return r6
        L46:
            r10 = 11
            return r10
        L49:
            return r1
        L4a:
            r10 = 12
        L4c:
            return r10
        L4d:
            if (r3 == r6) goto L56
            if (r3 == r5) goto L55
            if (r3 == r1) goto L54
        L53:
            return r7
        L54:
            return r1
        L55:
            return r10
        L56:
            return r0
        L57:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.m138202xc7d835b1(org.json.JSONArray):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: decodeSystemChromeStyle */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemChromeStyle m138203x99f1315a(org.json.JSONObject jSONObject) {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemChromeStyle(!jSONObject.isNull("statusBarColor") ? java.lang.Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.Brightness.m138211x447c3e7(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? java.lang.Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? java.lang.Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.Brightness.m138211x447c3e7(jSONObject.getString("systemNavigationBarIconBrightness")) : null, !jSONObject.isNull("systemNavigationBarDividerColor") ? java.lang.Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : java.lang.Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: decodeSystemUiMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode m138204x5688274(java.lang.String str) {
        int i17 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.AnonymousClass2.f71331xf03f4cb0[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode.m138236x447c3e7(str).ordinal()];
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode.EDGE_TO_EDGE : io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode.EDGE_TO_EDGE : io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode.IMMERSIVE_STICKY : io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode.IMMERSIVE : io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode.LEAN_BACK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: decodeSystemUiOverlays */
    public java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiOverlay> m138205x8466be74(org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            int i18 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.AnonymousClass2.f71332x4c113a23[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiOverlay.m138241x447c3e7(jSONArray.getString(i17)).ordinal()];
            if (i18 == 1) {
                arrayList.add(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiOverlay.TOP_OVERLAYS);
            } else if (i18 == 2) {
                arrayList.add(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiOverlay.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    /* renamed from: setPlatformMessageHandler */
    public void m138206xde722b98(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler platformMessageHandler) {
        this.f71328x42601896 = platformMessageHandler;
    }

    /* renamed from: systemChromeChanged */
    public void m138207xd0484ceb(boolean z17) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending 'systemUIChange' message.");
        this.f71326x2c0b7d03.m138438xd8c5c779("SystemChrome.systemUIChange", java.util.Arrays.asList(java.lang.Boolean.valueOf(z17)));
    }
}
