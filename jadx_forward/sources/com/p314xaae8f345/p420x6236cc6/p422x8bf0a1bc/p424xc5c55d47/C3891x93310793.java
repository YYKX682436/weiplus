package com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47;

/* renamed from: com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter */
/* loaded from: classes16.dex */
public class C3891x93310793 extends com.p314xaae8f345.p420x6236cc6.p421x316220.a.b implements com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver {

    /* renamed from: ANDROID_DISPLAY_OBTAIN_METHOD_MODE */
    private static final int f15570x88aef454 = 1;

    /* renamed from: BGM_ID */
    private static final int f15571x74accc12 = 1234567;

    /* renamed from: FRAMEWORK_TYPE_LIVEV2_WXAPPLET */
    private static final int f15572x3262550e = 9;

    /* renamed from: FRAMEWORK_TYPE_WXROOM_WXAPPLET */
    private static final int f15573x8f311cda = 3;

    /* renamed from: PUSH_MODE_HIGH_QUALITY */
    public static final int f15574x2ddbfe79 = 2;

    /* renamed from: PUSH_MODE_HVGA_QUALITY */
    public static final int f15575xaf9a093f = 9;

    /* renamed from: PUSH_MODE_LINKMIC_MAIN */
    public static final int f15576xa55ad202 = 4;

    /* renamed from: PUSH_MODE_LINKMIC_SUB */
    public static final int f15577x57ea40b7 = 5;

    /* renamed from: PUSH_MODE_QVGA_QUALITY */
    public static final int f15578xf4d8d996 = 8;

    /* renamed from: PUSH_MODE_REALTIME */
    public static final int f15579xf1e6c822 = 6;

    /* renamed from: PUSH_MODE_STANDARD_QUALITY */
    public static final int f15580xc33f7914 = 1;

    /* renamed from: PUSH_MODE_SUPER_QUALITY */
    public static final int f15581xfd8bcfa4 = 3;

    /* renamed from: PUSH_MODE_ULTRA_QUALITY */
    public static final int f15582x781536d5 = 7;

    /* renamed from: ROOM_PUSHER_MODE */
    private static final int f15583x7eeb437 = 102;

    /* renamed from: RTMP_PUSHER_MODE */
    private static final int f15584xd10547c1 = 0;
    private static final java.lang.String TAG = "applet-pusher-api";

    /* renamed from: TRTC_PUSHER_MODE */
    private static final int f15585xf0db5dc9 = 1;

    /* renamed from: VIDEO_ASPECT_3X4 */
    private static final int f15586x97de984c = 1;

    /* renamed from: VIDEO_ASPECT_9X16 */
    private static final int f15587x63f72b47 = 2;

    /* renamed from: mConstructor */
    private static java.lang.reflect.Constructor<?> f15588x4b5fe94d;

    /* renamed from: _hellAccFlag_ */
    private byte f15589x7f11beae;

    /* renamed from: mAudioVolumeListener */
    private com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXAudioVolumeEvaluationListener f15590x194e5db7;

    /* renamed from: mBGMNotifyListener */
    private com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify f15591x9cbe3518;

    /* renamed from: mConfig */
    private com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e f15593xfeabaa0f;

    /* renamed from: mContext */
    private android.content.Context f15594xd6cfe882;

    /* renamed from: mEnableCustomVideoCapture */
    private boolean f15596xb8b22ccc;

    /* renamed from: mIsBGMPlaying */
    private boolean f15597x40a0141d;

    /* renamed from: mIsBGMPlayingWhenPausePusher */
    private boolean f15598x4a67966;

    /* renamed from: mIsCameraOpened */
    private boolean f15599x9a9cc405;

    /* renamed from: mIsFlashLightOpened */
    private boolean f15600x127abba6;

    /* renamed from: mIsInit */
    private boolean f15601x9106827;

    /* renamed from: mIsMicrophoneOpened */
    private boolean f15602x2ec65eca;

    /* renamed from: mLivePushListener */
    private com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7 f15604x2177eb87;

    /* renamed from: mMainStreamUserIdList */
    private final java.util.List<java.lang.String> f15605xdac0ff8a;

    /* renamed from: mMainThreadHandler */
    private android.os.Handler f15606xb62767ba;

    /* renamed from: mNeedCompressSnapshot */
    private boolean f15608x408a4009;

    /* renamed from: mNetworkQuality */
    private int f15609xc7f7d8be;

    /* renamed from: mPusher */
    private com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 f15610x15318414;

    /* renamed from: mPusherMode */
    private com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMode f15611x5a0e07d7;

    /* renamed from: mRTCProtocolType */
    private com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3891x93310793.V2TXLiveProtocolType f15612x6fd936c6;

    /* renamed from: mSnapshotListener */
    private com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXSnapshotListener f15613x65e9c525;

    /* renamed from: mSubStreamUserIdList */
    private final java.util.List<java.lang.String> f15614xa16a1c57;

    /* renamed from: mSurface */
    private android.view.Surface f15615x2fa29f80;

    /* renamed from: mSurfaceHeight */
    private int f15616x60aa7cc7;

    /* renamed from: mSurfaceWidth */
    private int f15617x77904e26;

    /* renamed from: mVideoCustomProcessListener */
    private com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener f15619x63ca4924;

    /* renamed from: mVideoView */
    private com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf f15620xca2b57d3;

    /* renamed from: mEnableCamera */
    private boolean f15595x16a97f95 = true;

    /* renamed from: mBGMVolume */
    private int f15592x8eace015 = -1;

    /* renamed from: mMicVolume */
    private int f15607x454eb254 = -1;

    /* renamed from: mLastAngle */
    private int f15603xf10e6df0 = 0;

    /* renamed from: mTraceId */
    private java.lang.String f15618x5e797013 = "";

    /* renamed from: com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter$V2TXLiveProtocolType */
    /* loaded from: classes6.dex */
    public enum V2TXLiveProtocolType {
        V2TXLiveProtocolTypeROOM,
        V2TXLiveProtocolTypeTRTC,
        V2TXLiveProtocolTypeRTMP,
        V2TXLiveProtocolTypeWEBRTC
    }

    static {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.q.a();
        try {
            int i17 = com.p314xaae8f345.p420x6236cc6.p421x316220.C3883xd1d70053.f128723a;
            java.lang.reflect.Constructor<?> declaredConstructor = com.p314xaae8f345.p420x6236cc6.p421x316220.C3883xd1d70053.class.getDeclaredConstructor(android.content.Context.class, java.lang.Integer.TYPE);
            f15588x4b5fe94d = declaredConstructor;
            declaredConstructor.setAccessible(true);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "Constructor pusher failed, exception:".concat(java.lang.String.valueOf(e17)));
        }
    }

    public C3891x93310793(android.content.Context context) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29241x91f62b6f(context.getApplicationContext());
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29246xa5f59752("liteav");
        this.f15594xd6cfe882 = context.getApplicationContext();
        this.f15606xb62767ba = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f15593xfeabaa0f = new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e();
        this.f15605xdac0ff8a = new java.util.ArrayList();
        this.f15614xa16a1c57 = new java.util.ArrayList();
        this.f15609xc7f7d8be = 2;
        if (context instanceof android.app.Activity) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.i.a().a((android.app.Activity) context);
        }
    }

    /* renamed from: apiOnlineError */
    private void m31978x93dde0fb(java.lang.String str, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(this.f15618x5e797013)) {
            this.f15618x5e797013 = java.lang.String.valueOf(hashCode()).substring(java.lang.String.valueOf(hashCode()).length() - 4);
        }
        if (!z17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "[" + this.f15618x5e797013 + "]: " + str);
            return;
        }
        com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3885xb931d0cb.m31939x9cf0d20b().log("[applet-pusher-api][" + this.f15618x5e797013 + "]: " + str, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: apiOnlineLog */
    public void m31979xaee7d2f7(java.lang.String str, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(this.f15618x5e797013)) {
            this.f15618x5e797013 = java.lang.String.valueOf(hashCode()).substring(java.lang.String.valueOf(hashCode()).length() - 4);
        }
        if (!z17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "[" + this.f15618x5e797013 + "]: " + str);
            return;
        }
        com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3885xb931d0cb.m31939x9cf0d20b().log("[applet-pusher-api][" + this.f15618x5e797013 + "]: " + str, true);
    }

    /* renamed from: callbackSDKVersion */
    private void m31980x2fdb5163() {
        if (this.f15604x2177eb87 != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46285x5018f760, com.p314xaae8f345.p2926x359365.C25481x77f18081.m94461xdb46aa5d());
            bundle.putLong("EVT_TIME", java.lang.System.currentTimeMillis());
            m31979xaee7d2f7("OnPushEvent: event[-9999999], msg[" + bundle.toString() + "]", false);
            this.f15604x2177eb87.mo29886xceec7081(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15482x74a92e6b, bundle);
        }
    }

    /* renamed from: createPusherInstance */
    private void m31981x6552318(int i17) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b93 = this.f15610x15318414;
        if (abstractC3878xd0aa2b93 != null) {
            abstractC3878xd0aa2b93.mo30146x41012807();
        }
        try {
            com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b932 = (com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93) f15588x4b5fe94d.newInstance(this.f15594xd6cfe882, java.lang.Integer.valueOf(i17));
            this.f15610x15318414 = abstractC3878xd0aa2b932;
            if (i17 == 0) {
                this.f15611x5a0e07d7 = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMode.TXLiveMode_RTMP;
            } else {
                this.f15611x5a0e07d7 = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMode.TXLiveMode_RTC;
                this.f15612x6fd936c6 = i17 == 102 ? com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3891x93310793.V2TXLiveProtocolType.V2TXLiveProtocolTypeROOM : com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3891x93310793.V2TXLiveProtocolType.V2TXLiveProtocolTypeTRTC;
            }
            abstractC3878xd0aa2b932.mo30155x8b59f158(this);
            this.f15610x15318414.mo30098xf0533f3f(this.f15596xb8b22ccc);
            this.f15610x15318414.mo30099xbcf09668(this.f15619x63ca4924 != null, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeTexture);
            this.f15610x15318414.mo30156x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15451x85c5accb, 1);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "Init pusher failed, exception:" + e17 + ", mode:" + i17);
        }
    }

    /* renamed from: doSetVideoEncParam */
    private void m31983x34fee2d7(int i17, int i18, int i19, int i27, int i28, int i29, boolean z17) {
        if (i19 == 0) {
            i19 = 900;
        }
        if (i27 == 0) {
            i27 = 500;
        }
        if (i27 > i19) {
            int i37 = i27;
            i27 = i19;
            i19 = i37;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15530xe0ce1e4b, i17);
            jSONObject.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15529x1f26b122, i18);
            jSONObject.put("videoFps", i28);
            jSONObject.put("videoBitrate", i19);
            jSONObject.put("minVideoBitrate", i27);
            jSONObject.put("videoGop", i29);
            jSONObject.put("resolutionMode", z17 ? 0 : 1);
        } catch (org.json.JSONException unused) {
        }
        this.f15610x15318414.mo30156x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3882xa9b84921.f15468xb6387b52, jSONObject.toString());
    }

    /* renamed from: generateURL */
    private java.lang.String m31984x34da43ba(java.lang.String str, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.p420x6236cc6.p421x316220.C3884x280948e5.f15470x6f8f616f);
        sb6.append("?userid=");
        sb6.append(str);
        sb6.append("&streamtype=");
        sb6.append(i17 == 2 ? "aux" : com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
        return sb6.toString();
    }

    /* renamed from: getAudioAvailableJSONObject */
    private org.json.JSONObject m31985xd5889b90(java.lang.String str, java.lang.String str2, boolean z17) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("userid", str);
            jSONObject.put("playurl", str2);
            jSONObject.put("hasaudio", z17);
            return jSONObject;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: getUserJSONObject */
    private org.json.JSONObject m31987xd31dd48(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("userid", str);
            return jSONObject;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: getVideoAvailableJSONObject */
    private org.json.JSONObject m31988xd4f24ecb(java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("userid", str);
            jSONObject.put("playurl", str2);
            jSONObject.put("streamtype", i17 == 2 ? "aux" : com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
            jSONObject.put("hasvideo", z17);
            return jSONObject;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: initLivePusherInner */
    private com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m31989x8c33193(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, android.os.Bundle bundle) {
        com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3885xb931d0cb.m31939x9cf0d20b().m31942x8bd173e6("");
        if (bundle == null) {
            m31978x93dde0fb("Init pusher failed, params is null", false);
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-1, "Init pusher failed, params is null");
        }
        if (this.f15601x9106827) {
            m31978x93dde0fb("Init pusher failed, pusher has been initialized", false);
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-1, "Init pusher failed, pusher has been initialized");
        }
        this.f15601x9106827 = true;
        this.f15620xca2b57d3 = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf;
        this.f15593xfeabaa0f.m32052x1726ba75(bundle);
        if (android.text.TextUtils.isEmpty(this.f15593xfeabaa0f.url)) {
            m31979xaee7d2f7("Init default rtmp pusher instance, url is empty", false);
            m31981x6552318(0);
        } else {
            m31982x6552318(this.f15593xfeabaa0f.url);
        }
        m31979xaee7d2f7("Init pusher success, params:" + bundle.toString(), true);
        m32005xf6f078fc(this.f15593xfeabaa0f);
        if (this.f15593xfeabaa0f.f15647x267738b3) {
            m31979xaee7d2f7("Init pusher, [auto push is true, url is not empty, pusher is not pushing], need to start auto push", false);
            m32014xbbd8391a(this.f15593xfeabaa0f.url);
        }
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: isRTCProtocolType */
    private boolean m31990xcef07869() {
        return this.f15611x5a0e07d7 == com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMode.TXLiveMode_RTC;
    }

    /* renamed from: isRTCRoomProtocolType */
    private boolean m31991x7c8bc964() {
        return this.f15611x5a0e07d7 == com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMode.TXLiveMode_RTC && this.f15612x6fd936c6 == com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3891x93310793.V2TXLiveProtocolType.V2TXLiveProtocolTypeROOM;
    }

    /* renamed from: notifyFullUserList */
    private void m31992xf2a200a1() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONObject.put("userlist", jSONArray);
            synchronized (this) {
                for (java.lang.String str : this.f15605xdac0ff8a) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("userid", str);
                    jSONObject2.put("playurl", m31984x34da43ba(str, 0));
                    jSONArray.put(jSONObject2);
                }
            }
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            jSONObject.put("userlist_aux", jSONArray2);
            synchronized (this) {
                for (java.lang.String str2 : this.f15614xa16a1c57) {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("userid", str2);
                    jSONObject3.put("playurl", m31984x34da43ba(str2, 2));
                    jSONArray2.put(jSONObject3);
                }
            }
            m32001x58c16ddb(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46407x44d8fa6c, jSONObject, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "Notify full user list failed", e17);
        }
    }

    /* renamed from: pause */
    private com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m31993x65825f6(org.json.JSONObject jSONObject) {
        m31979xaee7d2f7("Pause push, camera enable:" + this.f15599x9a9cc405 + ", microphone enable:" + this.f15602x2ec65eca, true);
        if (android.text.TextUtils.isEmpty(this.f15593xfeabaa0f.f15632x5421a92)) {
            this.f15610x15318414.mo30145xfcac4825();
        } else {
            com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b93 = this.f15610x15318414;
            java.lang.String str = this.f15593xfeabaa0f.f15632x5421a92;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "pause", "(Lorg/json/JSONObject;)Lcom/tencent/live2/jsplugin/V2TXJSAdapterError;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
            yj0.a.e(obj, decodeFile, "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "pause", "(Lorg/json/JSONObject;)Lcom/tencent/live2/jsplugin/V2TXJSAdapterError;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            abstractC3878xd0aa2b93.mo30173xde9334ce(decodeFile);
        }
        if (!this.f15593xfeabaa0f.f15650xb9a9b1ca) {
            this.f15610x15318414.mo30144xfb89cf80();
        }
        boolean z17 = this.f15597x40a0141d;
        this.f15598x4a67966 = z17;
        if (z17) {
            m32026xf1d569f7("pauseBGM", null);
        }
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: playBGM */
    private com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m31994xe29438f4(org.json.JSONObject jSONObject) {
        java.lang.String str = "";
        long j17 = 0;
        long j18 = -1;
        if (jSONObject != null) {
            str = jSONObject.optString("BGMFilePath", "");
            j17 = jSONObject.optLong("startTimeMs", 0L);
            j18 = jSONObject.optLong("endTimeMs", -1L);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            m31978x93dde0fb("Play BGM failed, bgm url is empty", false);
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-2, "Play BGM failed, bgm url is empty");
        }
        this.f15597x40a0141d = true;
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam = new com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam(f15571x74accc12, str);
        audioMusicParam.f14522xf1f89d0f = true;
        audioMusicParam.f14523x91dc3c35 = j17;
        audioMusicParam.f14518x610201ee = j18;
        this.f15610x15318414.mo30103x5f1b9a9c().mo29055xe624d2d9(f15571x74accc12, this);
        this.f15610x15318414.mo30103x5f1b9a9c().mo29068x79fb7d0f(audioMusicParam);
        if (this.f15592x8eace015 != -1) {
            this.f15610x15318414.mo30103x5f1b9a9c().mo29054xdc5c9640(this.f15592x8eace015);
        }
        if (this.f15607x454eb254 != -1) {
            this.f15610x15318414.mo30103x5f1b9a9c().mo29063x49fdc1f0(this.f15607x454eb254);
        }
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: processAudioConfig */
    private void m31995x91ebd0c9(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e c3892xcefb867e, com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e c3892xcefb867e2) {
        boolean z17 = c3892xcefb867e.f15649x89c10333;
        boolean z18 = c3892xcefb867e2.f15649x89c10333;
        if (z17 != z18) {
            if (z18) {
                this.f15610x15318414.mo30144xfb89cf80();
            } else {
                this.f15610x15318414.mo30147xf9a3f7a9();
            }
        }
        boolean z19 = c3892xcefb867e.f15636xda594563;
        boolean z27 = c3892xcefb867e2.f15636xda594563;
        if (z19 != z27) {
            this.f15610x15318414.mo30156x3b607c57("enableANS", java.lang.String.format("{\"enable\": %b, \"level\":%d}", java.lang.Boolean.valueOf(z27), 100));
        }
        if (c3892xcefb867e.f15641x701b3b07 != c3892xcefb867e2.f15641x701b3b07) {
            this.f15610x15318414.mo30103x5f1b9a9c().mo29046x52f4e3f3(c3892xcefb867e2.f15641x701b3b07);
        }
        int i17 = c3892xcefb867e.f15658x199fd88b;
        int i18 = c3892xcefb867e2.f15658x199fd88b;
        if (i17 != i18) {
            this.f15610x15318414.mo30101x740a3599(i18);
        }
        if (c3892xcefb867e.f15659xa375cd74 != c3892xcefb867e2.f15659xa375cd74) {
            this.f15610x15318414.mo30105xac7d98c1().mo29665x2bcf6985(c3892xcefb867e2.f15659xa375cd74);
        }
        if (c3892xcefb867e.f15656xd069b42c != c3892xcefb867e2.f15656xd069b42c) {
            this.f15610x15318414.mo30103x5f1b9a9c().mo29067x486c863c(c3892xcefb867e2.f15656xd069b42c);
        }
        if (c3892xcefb867e.f15657xdae2a88a != c3892xcefb867e2.f15657xdae2a88a) {
            this.f15610x15318414.mo30103x5f1b9a9c().mo29064x26b7a50c(c3892xcefb867e2.f15657xdae2a88a);
        }
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioQuality v2TXLiveAudioQuality = c3892xcefb867e.f15631xc842e049;
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioQuality v2TXLiveAudioQuality2 = c3892xcefb867e2.f15631xc842e049;
        if (v2TXLiveAudioQuality != v2TXLiveAudioQuality2) {
            this.f15610x15318414.mo30152x5f7e6dcb(v2TXLiveAudioQuality2);
        }
        boolean z28 = c3892xcefb867e.f15642x43bad30d;
        boolean z29 = c3892xcefb867e2.f15642x43bad30d;
        if (z28 != z29) {
            if (z29) {
                m32012x51e3528a();
                return;
            } else {
                m32016x95145aea();
                return;
            }
        }
        if (!z29 || this.f15602x2ec65eca) {
            return;
        }
        m32012x51e3528a();
    }

    /* renamed from: processBeautyConfig */
    private void m31996x604076ed(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e c3892xcefb867e, com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e c3892xcefb867e2) {
        if (c3892xcefb867e.f15634xd3f30a95 != c3892xcefb867e2.f15634xd3f30a95) {
            this.f15610x15318414.mo30104x2490fdb().mo29594x442ec4d3(c3892xcefb867e2.f15634xd3f30a95);
        }
        if (c3892xcefb867e.f15633xd3898868 != c3892xcefb867e2.f15633xd3898868) {
            this.f15610x15318414.mo30104x2490fdb().mo29593x43c542a6(c3892xcefb867e2.f15633xd3898868);
        }
        if (c3892xcefb867e.f15664x2111d164 != c3892xcefb867e2.f15664x2111d164) {
            this.f15610x15318414.mo30104x2490fdb().mo29620xd7a00666(c3892xcefb867e2.f15664x2111d164);
        }
        java.lang.String str = c3892xcefb867e2.f15645x57311788;
        if (str == null || str.equals(c3892xcefb867e.f15645x57311788)) {
            return;
        }
        if (android.text.TextUtils.isEmpty(c3892xcefb867e2.f15645x57311788)) {
            this.f15610x15318414.mo30104x2490fdb().mo29605xc55227a(null);
            return;
        }
        java.lang.String str2 = c3892xcefb867e2.f15645x57311788;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str2);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "processBeautyConfig", "(Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
        yj0.a.e(obj, decodeFile, "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "processBeautyConfig", "(Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        this.f15610x15318414.mo30104x2490fdb().mo29605xc55227a(decodeFile);
    }

    /* renamed from: processVideoConfig */
    private void m31997xb5b879ae(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e c3892xcefb867e, com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e c3892xcefb867e2) {
        if (c3892xcefb867e.f15648x24672724 != c3892xcefb867e2.f15648x24672724) {
            this.f15610x15318414.mo30105xac7d98c1().mo29666x2db92f79(c3892xcefb867e2.f15648x24672724);
        }
        if (c3892xcefb867e.f15637xdd0e3a26 != c3892xcefb867e2.f15637xdd0e3a26) {
            this.f15610x15318414.mo30105xac7d98c1().mo29655x1a974ec1(c3892xcefb867e2.f15637xdd0e3a26);
        }
        boolean z17 = c3892xcefb867e.f15644x70db43f6;
        boolean z18 = c3892xcefb867e2.f15644x70db43f6;
        if (z17 != z18) {
            this.f15610x15318414.mo30156x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15444x842ece2, java.lang.Boolean.valueOf(z18));
        }
        boolean z19 = c3892xcefb867e.f15643x7464d0c8;
        boolean z27 = c3892xcefb867e2.f15643x7464d0c8;
        if (z19 != z27) {
            this.f15610x15318414.mo30153x3700bab9(z27);
        }
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMirrorType v2TXLiveMirrorType = c3892xcefb867e.f15654x67fb7799;
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMirrorType v2TXLiveMirrorType2 = c3892xcefb867e2.f15654x67fb7799;
        if (v2TXLiveMirrorType != v2TXLiveMirrorType2) {
            this.f15610x15318414.mo30158xb89b1e77(v2TXLiveMirrorType2);
        }
        boolean z28 = c3892xcefb867e.f15651xdeefd6f0;
        boolean z29 = c3892xcefb867e2.f15651xdeefd6f0;
        if (z28 != z29) {
            if (z29) {
                this.f15610x15318414.mo30156x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15441x215ce901, java.lang.Boolean.TRUE);
            } else {
                this.f15610x15318414.mo30156x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15441x215ce901, java.lang.Boolean.FALSE);
            }
        }
        if (c3892xcefb867e.f15651xdeefd6f0 != c3892xcefb867e2.f15651xdeefd6f0 || c3892xcefb867e.f15630xac0f1458 != c3892xcefb867e2.f15630xac0f1458 || c3892xcefb867e.f15665x6be2dc6 != c3892xcefb867e2.f15665x6be2dc6 || c3892xcefb867e.f15646xb7389127 != c3892xcefb867e2.f15646xb7389127 || c3892xcefb867e.f15655x3339a3 != c3892xcefb867e2.f15655x3339a3 || c3892xcefb867e.f15653xd3380cbb != c3892xcefb867e2.f15653xd3380cbb || c3892xcefb867e.f15652x3fe05569 != c3892xcefb867e2.f15652x3fe05569 || c3892xcefb867e.fps != c3892xcefb867e2.fps) {
            m32007xa497082c(c3892xcefb867e2);
        }
        boolean z37 = c3892xcefb867e2.f15639x7f146688;
        this.f15595x16a97f95 = z37;
        if (c3892xcefb867e.f15639x7f146688 != z37) {
            if (z37) {
                m32011x30c17c6f(c3892xcefb867e2.f15648x24672724);
                return;
            } else {
                m32015x5b85b4cf();
                return;
            }
        }
        if (!z37 || this.f15599x9a9cc405) {
            return;
        }
        m32011x30c17c6f(c3892xcefb867e2.f15648x24672724);
    }

    /* renamed from: processWatermarkConfig */
    private void m31998x1e520a57(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e c3892xcefb867e, com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e c3892xcefb867e2) {
        java.lang.String str = c3892xcefb867e2.f15660x5256441c;
        if ((str == null || str.equals(c3892xcefb867e.f15660x5256441c)) && c3892xcefb867e.f15663x28b973c2 == c3892xcefb867e2.f15663x28b973c2 && c3892xcefb867e.f15661xb6f8aa8b == c3892xcefb867e2.f15661xb6f8aa8b && c3892xcefb867e.f15662xa2ce5651 == c3892xcefb867e2.f15662xa2ce5651) {
            return;
        }
        if (android.text.TextUtils.isEmpty(c3892xcefb867e2.f15660x5256441c)) {
            this.f15610x15318414.mo30164x4f089a22(null, 0.0f, 0.0f, 0.0f);
            return;
        }
        java.lang.String str2 = c3892xcefb867e2.f15660x5256441c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str2);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "processWatermarkConfig", "(Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
        yj0.a.e(obj, decodeFile, "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "processWatermarkConfig", "(Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        this.f15610x15318414.mo30164x4f089a22(decodeFile, c3892xcefb867e2.f15661xb6f8aa8b, c3892xcefb867e2.f15662xa2ce5651, c3892xcefb867e2.f15663x28b973c2);
    }

    /* renamed from: resume */
    private com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m31999xc84dc82d(org.json.JSONObject jSONObject) {
        m31979xaee7d2f7("Resume push", true);
        this.f15610x15318414.mo30180x692ad52e();
        if (this.f15593xfeabaa0f.f15649x89c10333) {
            this.f15610x15318414.mo30144xfb89cf80();
        } else {
            this.f15610x15318414.mo30147xf9a3f7a9();
        }
        this.f15610x15318414.mo30148xfac6704e();
        if (this.f15598x4a67966) {
            m32026xf1d569f7("resumeBGM", null);
        }
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: sendEventNotify */
    private void m32000x58c16ddb(int i17, java.lang.String str) {
        com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7 interfaceC25480xa8fcc7a7 = this.f15604x2177eb87;
        if (interfaceC25480xa8fcc7a7 != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46285x5018f760, str);
            m31979xaee7d2f7("OnPushEvent: event[" + i17 + "], msg[" + bundle.toString() + "]", false);
            interfaceC25480xa8fcc7a7.mo29886xceec7081(i17, bundle);
        }
    }

    /* renamed from: sendMessage */
    private com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m32002x2936bf5f(org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject != null ? jSONObject.optString("msg") : null;
        if (android.text.TextUtils.isEmpty(optString)) {
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-2, "Send SEI message failed, message is empty");
        }
        try {
            this.f15610x15318414.mo30151xf24c7d58(m31991x7c8bc964() ? 243 : 242, optString.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        } catch (java.lang.Exception e17) {
            m31979xaee7d2f7("Send SEI message failed, error:" + e17.getMessage(), false);
        }
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(0, "Success");
    }

    /* renamed from: setBGMVolume */
    private com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m32003x6fb6c7c0(org.json.JSONObject jSONObject) {
        this.f15592x8eace015 = (int) ((jSONObject != null ? jSONObject.optDouble("volume", 1.0d) : 1.0d) * 100.0d);
        this.f15610x15318414.mo30103x5f1b9a9c().mo29054xdc5c9640(this.f15592x8eace015);
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: setDiffParam */
    private void m32004xa8370946(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e c3892xcefb867e, com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e c3892xcefb867e2) {
        java.lang.String m32044x2cd9a3a7 = c3892xcefb867e2.m32044x2cd9a3a7(c3892xcefb867e);
        if (!android.text.TextUtils.isEmpty(m32044x2cd9a3a7)) {
            m31979xaee7d2f7("Set diff config:".concat(java.lang.String.valueOf(m32044x2cd9a3a7)), true);
        }
        boolean z17 = c3892xcefb867e.f15640x6f9b6155;
        boolean z18 = c3892xcefb867e2.f15640x6f9b6155;
        if (z17 != z18) {
            this.f15610x15318414.mo30165xcdf6351b(z18);
        }
        m31997xb5b879ae(c3892xcefb867e, c3892xcefb867e2);
        m31995x91ebd0c9(c3892xcefb867e, c3892xcefb867e2);
        m31996x604076ed(c3892xcefb867e, c3892xcefb867e2);
        m31998x1e520a57(c3892xcefb867e, c3892xcefb867e2);
        if (!c3892xcefb867e2.f15647x267738b3 || android.text.TextUtils.isEmpty(c3892xcefb867e2.url) || this.f15610x15318414.mo30115xd057a1fe() == 1) {
            return;
        }
        com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3885xb931d0cb.m31939x9cf0d20b().m31942x8bd173e6(c3892xcefb867e2.url);
        m31979xaee7d2f7("Set diff config:[auto push is true, url is not empty, pusher is not pushing], need to start auto push", false);
        m32014xbbd8391a(c3892xcefb867e2.url);
    }

    /* renamed from: setFullParam */
    private void m32005xf6f078fc(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e c3892xcefb867e) {
        m31979xaee7d2f7("Set full config:".concat(java.lang.String.valueOf(c3892xcefb867e)), true);
        this.f15610x15318414.mo30165xcdf6351b(c3892xcefb867e.f15640x6f9b6155);
        this.f15610x15318414.mo30105xac7d98c1().mo29655x1a974ec1(c3892xcefb867e.f15637xdd0e3a26);
        this.f15610x15318414.mo30156x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15444x842ece2, java.lang.Boolean.valueOf(c3892xcefb867e.f15644x70db43f6));
        this.f15610x15318414.mo30153x3700bab9(c3892xcefb867e.f15643x7464d0c8);
        this.f15610x15318414.mo30158xb89b1e77(c3892xcefb867e.f15654x67fb7799);
        m32007xa497082c(c3892xcefb867e);
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = this.f15620xca2b57d3;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) {
            this.f15610x15318414.mo30162x63923b5d(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
        }
        android.view.Surface surface = this.f15615x2fa29f80;
        if (surface != null) {
            this.f15610x15318414.mo30156x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15457x14b68192, surface);
            this.f15610x15318414.mo30156x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15458xebbebcb3, new com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.SurfaceSize(this.f15617x77904e26, this.f15616x60aa7cc7));
        }
        boolean z17 = c3892xcefb867e.f15639x7f146688;
        this.f15595x16a97f95 = z17;
        if (z17) {
            m32011x30c17c6f(c3892xcefb867e.f15648x24672724);
        } else {
            m32015x5b85b4cf();
        }
        if (c3892xcefb867e.f15649x89c10333) {
            this.f15610x15318414.mo30144xfb89cf80();
        } else {
            this.f15610x15318414.mo30147xf9a3f7a9();
        }
        this.f15610x15318414.mo30156x3b607c57("enableANS", java.lang.String.format("{\"enable\": %b, \"level\":%d}", java.lang.Boolean.valueOf(c3892xcefb867e.f15636xda594563), 100));
        this.f15610x15318414.mo30103x5f1b9a9c().mo29046x52f4e3f3(c3892xcefb867e.f15641x701b3b07);
        this.f15610x15318414.mo30101x740a3599(c3892xcefb867e.f15658x199fd88b);
        this.f15610x15318414.mo30105xac7d98c1().mo29665x2bcf6985(c3892xcefb867e.f15659xa375cd74);
        this.f15610x15318414.mo30103x5f1b9a9c().mo29067x486c863c(c3892xcefb867e.f15656xd069b42c);
        this.f15610x15318414.mo30103x5f1b9a9c().mo29064x26b7a50c(c3892xcefb867e.f15657xdae2a88a);
        this.f15610x15318414.mo30152x5f7e6dcb(c3892xcefb867e.f15631xc842e049);
        if (c3892xcefb867e.f15642x43bad30d) {
            m32012x51e3528a();
        } else {
            m32016x95145aea();
        }
        if (c3892xcefb867e.f15651xdeefd6f0) {
            this.f15610x15318414.mo30156x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15441x215ce901, java.lang.Boolean.TRUE);
        } else {
            this.f15610x15318414.mo30156x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15441x215ce901, java.lang.Boolean.FALSE);
        }
        this.f15610x15318414.mo30104x2490fdb().mo29594x442ec4d3(c3892xcefb867e.f15634xd3f30a95);
        this.f15610x15318414.mo30104x2490fdb().mo29593x43c542a6(c3892xcefb867e.f15633xd3898868);
        this.f15610x15318414.mo30104x2490fdb().mo29620xd7a00666(c3892xcefb867e.f15664x2111d164);
        if (android.text.TextUtils.isEmpty(c3892xcefb867e.f15645x57311788)) {
            this.f15610x15318414.mo30104x2490fdb().mo29605xc55227a(null);
        } else {
            java.lang.String str = c3892xcefb867e.f15645x57311788;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "setFullParam", "(Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
            yj0.a.e(obj, decodeFile, "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "setFullParam", "(Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            this.f15610x15318414.mo30104x2490fdb().mo29605xc55227a(decodeFile);
        }
        if (android.text.TextUtils.isEmpty(c3892xcefb867e.f15660x5256441c)) {
            this.f15610x15318414.mo30164x4f089a22(null, 0.0f, 0.0f, 0.0f);
            return;
        }
        java.lang.String str2 = c3892xcefb867e.f15660x5256441c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(str2);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "setFullParam", "(Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile2 = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList2.get(0));
        yj0.a.e(obj2, decodeFile2, "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "setFullParam", "(Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        this.f15610x15318414.mo30164x4f089a22(decodeFile2, c3892xcefb867e.f15661xb6f8aa8b, c3892xcefb867e.f15662xa2ce5651, c3892xcefb867e.f15663x28b973c2);
    }

    /* renamed from: setMICVolume */
    private com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m32006x8d6b95ff(org.json.JSONObject jSONObject) {
        this.f15607x454eb254 = (int) ((jSONObject != null ? jSONObject.optDouble("volume", 1.0d) : 1.0d) * 100.0d);
        this.f15610x15318414.mo30103x5f1b9a9c().mo29063x49fdc1f0(this.f15607x454eb254);
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    /* renamed from: setVideoEncParam */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m32007xa497082c(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3891x93310793.m32007xa497082c(com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig):void");
    }

    /* renamed from: snapshot */
    private com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m32009x10fad5c4(org.json.JSONObject jSONObject) {
        java.lang.String optString;
        this.f15608x408a4009 = false;
        if (jSONObject != null && (optString = jSONObject.optString("quality")) != null && optString.equalsIgnoreCase("compressed")) {
            this.f15608x408a4009 = true;
        }
        this.f15610x15318414.mo30166x10fad5c4();
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: start */
    private com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m32010x68ac462(org.json.JSONObject jSONObject) {
        m31979xaee7d2f7("Start push, url:" + this.f15593xfeabaa0f.url + ", isPushing: " + this.f15610x15318414.mo30115xd057a1fe(), true);
        if (this.f15610x15318414.mo30115xd057a1fe() == 1 || android.text.TextUtils.isEmpty(this.f15593xfeabaa0f.url)) {
            m31978x93dde0fb("Start push failed", false);
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-2, "Start push failed");
        }
        m32014xbbd8391a(this.f15593xfeabaa0f.url);
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: startCameraInner */
    private void m32011x30c17c6f(boolean z17) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b93 = this.f15610x15318414;
        if (abstractC3878xd0aa2b93 == null) {
            m31978x93dde0fb("Start camera failed, pusher is not initialized", false);
            return;
        }
        if (this.f15599x9a9cc405) {
            m31978x93dde0fb("Start camera failed, camera has been started", false);
        } else if (this.f15595x16a97f95) {
            this.f15599x9a9cc405 = true;
            abstractC3878xd0aa2b93.mo30167x74692227(z17);
        }
    }

    /* renamed from: startMicrophoneInner */
    private void m32012x51e3528a() {
        com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b93 = this.f15610x15318414;
        if (abstractC3878xd0aa2b93 == null) {
            m31978x93dde0fb("Start microphone failed, pusher is not initialized", false);
        } else {
            if (this.f15602x2ec65eca) {
                m31978x93dde0fb("Start microphone failed, microphone has been started", false);
                return;
            }
            this.f15602x2ec65eca = true;
            abstractC3878xd0aa2b93.mo30169xc2faa72c();
            this.f15610x15318414.mo30105xac7d98c1().mo29660x78052215(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p423xc53e9ae1.C3890xc5128a18.f15556xb52e44e6 == 0 ? com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXAudioRoute.TXAudioRouteSpeakerphone : com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853.TXAudioRoute.TXAudioRouteEarpiece);
        }
    }

    /* renamed from: startPreview */
    private com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m32013xe5056506(org.json.JSONObject jSONObject) {
        m31979xaee7d2f7("Start preview", true);
        if (this.f15610x15318414.mo30115xd057a1fe() == 1) {
            m31979xaee7d2f7("Start preview failed, current is pushing", false);
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-2, "Start preview failed, current is pushing");
        }
        m32011x30c17c6f(this.f15593xfeabaa0f.f15648x24672724);
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: startPushInner */
    private void m32014xbbd8391a(java.lang.String str) {
        if (this.f15610x15318414 == null) {
            m31978x93dde0fb("Start push failed, pusher is not initialized", false);
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            m31978x93dde0fb("Start push failed, url is empty", false);
            return;
        }
        if (this.f15593xfeabaa0f.f15642x43bad30d && !this.f15602x2ec65eca) {
            m32012x51e3528a();
        }
        com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e c3892xcefb867e = this.f15593xfeabaa0f;
        if (c3892xcefb867e.f15639x7f146688 && !this.f15599x9a9cc405) {
            m32011x30c17c6f(c3892xcefb867e.f15648x24672724);
        }
        if (this.f15611x5a0e07d7 == com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMode.TXLiveMode_RTC) {
            int i17 = m31991x7c8bc964() ? 3 : 9;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46634x1dde913b, i17);
                jSONObject.put("component", 0);
            } catch (org.json.JSONException unused) {
            }
            this.f15610x15318414.mo30156x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15452x8ae8e1a3, jSONObject.toString());
        }
        m31979xaee7d2f7("Start push result:".concat(java.lang.String.valueOf(this.f15610x15318414.mo30170x8113e69c(str))), false);
    }

    /* renamed from: stopCameraInner */
    private void m32015x5b85b4cf() {
        com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b93 = this.f15610x15318414;
        if (abstractC3878xd0aa2b93 == null) {
            m31978x93dde0fb("Stop camera failed, pusher is not initialized", false);
        } else if (!this.f15599x9a9cc405) {
            m31978x93dde0fb("Stop camera failed, camera has been stopped", false);
        } else {
            this.f15599x9a9cc405 = false;
            abstractC3878xd0aa2b93.mo30174x933b2dc7();
        }
    }

    /* renamed from: stopMicrophoneInner */
    private void m32016x95145aea() {
        com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b93 = this.f15610x15318414;
        if (abstractC3878xd0aa2b93 == null) {
            m31978x93dde0fb("Stop microphone failed, pusher is not initialized", false);
        } else if (!this.f15602x2ec65eca) {
            m31978x93dde0fb("Stop microphone failed, microphone has been stopped", false);
        } else {
            this.f15602x2ec65eca = false;
            abstractC3878xd0aa2b93.mo30176xcc9de2cc();
        }
    }

    /* renamed from: stopPreview */
    private com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m32017xa074cd66(org.json.JSONObject jSONObject) {
        m31979xaee7d2f7("Stop preview", true);
        if (this.f15610x15318414.mo30115xd057a1fe() == 1) {
            m31979xaee7d2f7("Stop preview failed, current is pushing", false);
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-2, "Stop preview failed, current is pushing");
        }
        m32015x5b85b4cf();
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: stopPushInner */
    private void m32018x590f097a(java.lang.String str) {
        m31979xaee7d2f7(str, true);
        this.f15597x40a0141d = false;
        this.f15598x4a67966 = false;
        this.f15600x127abba6 = false;
        this.f15602x2ec65eca = false;
        this.f15599x9a9cc405 = false;
        this.f15592x8eace015 = -1;
        this.f15607x454eb254 = -1;
        com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b93 = this.f15610x15318414;
        if (abstractC3878xd0aa2b93 != null) {
            abstractC3878xd0aa2b93.mo30103x5f1b9a9c().mo29069x17324d6f(f15571x74accc12);
            this.f15610x15318414.mo30103x5f1b9a9c().mo29055xe624d2d9(f15571x74accc12, null);
            this.f15610x15318414.mo30177x66345a3c();
        }
    }

    /* renamed from: userLandscapeResolution */
    private boolean m32019xe5d53fc(int i17, boolean z17) {
        return i17 == 1 ? z17 : i17 == 3 ? z17 : i17 == 0 ? !z17 : i17 == 2 && !z17;
    }

    /* renamed from: enableCustomVideoCapture */
    public int m32020xf0533f3f(boolean z17) {
        m31979xaee7d2f7("Custom video capture, enable:".concat(java.lang.String.valueOf(z17)), false);
        this.f15596xb8b22ccc = z17;
        com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b93 = this.f15610x15318414;
        if (abstractC3878xd0aa2b93 != null) {
            return abstractC3878xd0aa2b93.mo30098xf0533f3f(z17);
        }
        return 0;
    }

    /* renamed from: getMaxZoom */
    public int m32021x70202721() {
        com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b93 = this.f15610x15318414;
        if (abstractC3878xd0aa2b93 == null) {
            return 0;
        }
        return (int) abstractC3878xd0aa2b93.mo30105xac7d98c1().mo29657x874067b5();
    }

    /* renamed from: initLivePusher */
    public com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m32022x656bc683(android.os.Bundle bundle) {
        m31980x2fdb5163();
        return m31989x8c33193(null, bundle);
    }

    /* renamed from: isPushing */
    public boolean m32024xd057a1fe() {
        com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b93 = this.f15610x15318414;
        return abstractC3878xd0aa2b93 != null && abstractC3878xd0aa2b93.mo30115xd057a1fe() == 1;
    }

    /* renamed from: notifyOrientationChanged */
    public void m32025xd1014ded(final int i17) {
        this.f15606xb62767ba.post(new java.lang.Runnable() { // from class: com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3891x93310793.this.f15603xf10e6df0 != i17) {
                    com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3891x93310793.this.m31979xaee7d2f7("Notify orientation changed, [angle:" + i17 + "]", false);
                    com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3891x93310793.this.f15603xf10e6df0 = i17;
                    com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3891x93310793 c3891x93310793 = com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3891x93310793.this;
                    c3891x93310793.m32007xa497082c(c3891x93310793.f15593xfeabaa0f);
                }
            }
        });
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
    /* renamed from: onComplete */
    public void mo10551x815f5438(int i17, int i18) {
        com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify onBGMNotify;
        com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e c3892xcefb867e = this.f15593xfeabaa0f;
        if (f15571x74accc12 == i17 && c3892xcefb867e.f15638x7357fcba && (onBGMNotify = this.f15591x9cbe3518) != null) {
            onBGMNotify.mo29877x552e4ec2(i18);
        }
    }

    @Override // com.p314xaae8f345.p420x6236cc6.p421x316220.a.b
    /* renamed from: onEnterRoom */
    public void mo31929xcb050cb4(long j17) {
        if (!m31991x7c8bc964()) {
            m31979xaee7d2f7("onEnterRoom: isn't room protocol,ignore", false);
            return;
        }
        this.f15605xdac0ff8a.clear();
        this.f15614xa16a1c57.clear();
        if (j17 > 0) {
            m32000x58c16ddb(1018, "onEnterRoom success, time cost[" + j17 + "]");
            return;
        }
        m32000x58c16ddb(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46404xa5f7fd74, "onEnterRoom failed, error code[" + j17 + "]");
        m32000x58c16ddb(-3301, "onEnterRoom failed, error code[" + j17 + "]");
        if (j17 == -100018) {
            m32000x58c16ddb(-100018, "onEnterRoom failed, user sign invalid.");
        }
    }

    @Override // com.p314xaae8f345.p420x6236cc6.p421x316220.a.b
    /* renamed from: onExitRoom */
    public void mo31930x26931218(int i17) {
        if (!m31991x7c8bc964()) {
            m31979xaee7d2f7("OnExitRoom: isn't room protocol,ignore", false);
            return;
        }
        this.f15605xdac0ff8a.clear();
        this.f15614xa16a1c57.clear();
        m32000x58c16ddb(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46406xaf4081cb, "onExitRoom reason[" + i17 + "]");
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89
    /* renamed from: onGLContextCreated */
    public void mo31812x2453e5d() {
        super.mo31812x2453e5d();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89
    /* renamed from: onGLContextDestroyed */
    public void mo31813xd8b04c4e() {
        com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener videoCustomProcessListener = this.f15619x63ca4924;
        if (videoCustomProcessListener != null) {
            videoCustomProcessListener.mo29894x6fb839d7();
        }
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89
    /* renamed from: onMicrophoneVolumeUpdate */
    public void mo31814xde91c78c(int i17) {
        com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener = this.f15590x194e5db7;
        if (iTXAudioVolumeEvaluationListener != null) {
            iTXAudioVolumeEvaluationListener.mo29876x4d82ef6(i17);
        }
    }

    @Override // com.p314xaae8f345.p420x6236cc6.p421x316220.a.b
    /* renamed from: onNetworkQuality */
    public void mo31931xf01276b0(int i17) {
        this.f15609xc7f7d8be = i17;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
    /* renamed from: onPlayProgress */
    public void mo10552xfd1c900(int i17, long j17, long j18) {
        com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify onBGMNotify;
        com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e c3892xcefb867e = this.f15593xfeabaa0f;
        if (f15571x74accc12 == i17 && c3892xcefb867e.f15638x7357fcba && (onBGMNotify = this.f15591x9cbe3518) != null) {
            onBGMNotify.mo29878x3d3ddfb6(j17, j18);
        }
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89
    /* renamed from: onProcessVideoFrame */
    public int mo31815x20bf0162(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame2) {
        com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener videoCustomProcessListener = this.f15619x63ca4924;
        if (videoCustomProcessListener == null) {
            return 0;
        }
        v2TXLiveVideoFrame2.f15421xab7dd51b.f15397xc35d0396 = videoCustomProcessListener.mo29893x2613f4e2(v2TXLiveVideoFrame.f15421xab7dd51b.f15397xc35d0396, v2TXLiveVideoFrame.f15422x6be2dc6, v2TXLiveVideoFrame.f15418xb7389127);
        return 0;
    }

    @Override // com.p314xaae8f345.p420x6236cc6.p421x316220.a.b
    /* renamed from: onPushEvent */
    public void mo31932xceec7081(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7 interfaceC25480xa8fcc7a7 = this.f15604x2177eb87;
        if (interfaceC25480xa8fcc7a7 != null) {
            m31979xaee7d2f7("OnPushEvent: event[" + i17 + "], msg[" + bundle.toString() + "]", false);
            interfaceC25480xa8fcc7a7.mo29886xceec7081(i17, bundle);
        }
        if (interfaceC25480xa8fcc7a7 == null || i17 != 1003) {
            return;
        }
        com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3891x93310793.V2TXLiveProtocolType v2TXLiveProtocolType = this.f15612x6fd936c6;
        if (v2TXLiveProtocolType == com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3891x93310793.V2TXLiveProtocolType.V2TXLiveProtocolTypeROOM || v2TXLiveProtocolType == com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3891x93310793.V2TXLiveProtocolType.V2TXLiveProtocolTypeTRTC) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46285x5018f760, "Start encoder success.");
            m31979xaee7d2f7("OnPushEvent: event[" + i17 + "], msg[" + bundle2.toString() + "]", false);
            interfaceC25480xa8fcc7a7.mo29886xceec7081(1008, bundle2);
        }
    }

    @Override // com.p314xaae8f345.p420x6236cc6.p421x316220.a.b
    /* renamed from: onPushNetStatus */
    public void mo31933xe65aae56(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.putInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46323x28b0e3f9, this.f15609xc7f7d8be);
        }
        com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7 interfaceC25480xa8fcc7a7 = this.f15604x2177eb87;
        if (interfaceC25480xa8fcc7a7 != null) {
            interfaceC25480xa8fcc7a7.mo29885x3bee38d0(bundle);
        }
    }

    @Override // com.p314xaae8f345.p420x6236cc6.p421x316220.a.b
    /* renamed from: onRemoteUserEnter */
    public void mo31934x11c63848(java.lang.String str) {
        if (m31991x7c8bc964()) {
            m32001x58c16ddb(1031, m31987xd31dd48(str), true);
        } else {
            m31979xaee7d2f7("OnRemoteUserEnter: isn't room protocol,ignore", false);
        }
    }

    @Override // com.p314xaae8f345.p420x6236cc6.p421x316220.a.b
    /* renamed from: onRemoteUserExit */
    public void mo31935xd74899ae(java.lang.String str, int i17) {
        if (m31991x7c8bc964()) {
            m32001x58c16ddb(1032, m31987xd31dd48(str), true);
        } else {
            m31979xaee7d2f7("OnRemoteUserExit: isn't room protocol,ignore", false);
        }
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89
    /* renamed from: onSnapshotComplete */
    public void mo31820x7ddd1b1c(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXSnapshotListener iTXSnapshotListener = this.f15613x65e9c525;
        if (iTXSnapshotListener == null) {
            return;
        }
        m31979xaee7d2f7("OnSnapshotComplete image:".concat(java.lang.String.valueOf(bitmap)), false);
        if (bitmap == null) {
            iTXSnapshotListener.mo29892xb614f8c3(bitmap);
            return;
        }
        if (!this.f15608x408a4009) {
            iTXSnapshotListener.mo29892xb614f8c3(bitmap);
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(0.5f, 0.5f);
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        aVar.c(java.lang.Boolean.FALSE);
        aVar.c(matrix);
        aVar.c(java.lang.Integer.valueOf(height));
        aVar.c(java.lang.Integer.valueOf(width));
        aVar.c(0);
        aVar.c(0);
        aVar.c(bitmap);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "onSnapshotComplete", "(Landroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "onSnapshotComplete", "(Landroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        iTXSnapshotListener.mo29892xb614f8c3(createBitmap);
        if (createBitmap == null || createBitmap.isRecycled()) {
            return;
        }
        createBitmap.recycle();
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
    /* renamed from: onStart */
    public void mo10553xb05099c3(int i17, int i18) {
        com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify onBGMNotify;
        com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e c3892xcefb867e = this.f15593xfeabaa0f;
        if (f15571x74accc12 == i17 && c3892xcefb867e.f15638x7357fcba && (onBGMNotify = this.f15591x9cbe3518) != null) {
            onBGMNotify.mo29879x9d54bb79();
        }
    }

    @Override // com.p314xaae8f345.p420x6236cc6.p421x316220.a.b
    /* renamed from: onUserAudioAvailable */
    public void mo31936xf752687d(java.lang.String str, boolean z17) {
        if (m31991x7c8bc964()) {
            m32001x58c16ddb(1034, m31985xd5889b90(str, m31984x34da43ba(str, 0), z17), true);
        } else {
            m31979xaee7d2f7("OnUserAudioAvailable: isn't room protocol,ignore", false);
        }
    }

    @Override // com.p314xaae8f345.p420x6236cc6.p421x316220.a.b
    /* renamed from: onUserVideoAvailable */
    public void mo31937xfcccd978(java.lang.String str, int i17, boolean z17) {
        if (!m31991x7c8bc964()) {
            m31979xaee7d2f7("OnUserVideoAvailable: isn't room protocol,ignore", false);
            return;
        }
        m32001x58c16ddb(1033, m31988xd4f24ecb(str, m31984x34da43ba(str, i17), i17, z17), true);
        java.util.List<java.lang.String> list = i17 == 2 ? this.f15614xa16a1c57 : this.f15605xdac0ff8a;
        if (z17) {
            list.add(str);
        } else {
            list.remove(str);
        }
        m31992xf2a200a1();
    }

    /* renamed from: operateLivePusher */
    public com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m32026xf1d569f7(java.lang.String str, org.json.JSONObject jSONObject) {
        if (android.text.TextUtils.isEmpty(str)) {
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-1, "Call operate failed, operate name is null");
        }
        boolean z17 = str.equals("start") || str.equals("stop") || str.equals("resume") || str.equals("pause") || str.equals("startPreview") || str.equals("stopPreview");
        if (!this.f15601x9106827 || this.f15610x15318414 == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Call operate failed, pusher is not initialized, [name:");
            sb6.append(str);
            sb6.append("][init:");
            sb6.append(this.f15601x9106827);
            sb6.append("][pusher:");
            sb6.append(this.f15610x15318414 != null);
            sb6.append("]");
            m31978x93dde0fb(sb6.toString(), z17);
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-3, "Call operate failed, pusher is not initialized");
        }
        if (str.equalsIgnoreCase("start")) {
            return m32010x68ac462(jSONObject);
        }
        if (str.equalsIgnoreCase("stop")) {
            m32018x590f097a("Stop push call by business, operate stop");
        } else {
            if (str.equalsIgnoreCase("pause")) {
                return m31993x65825f6(jSONObject);
            }
            if (str.equalsIgnoreCase("resume")) {
                return m31999xc84dc82d(jSONObject);
            }
            if (str.equalsIgnoreCase("startPreview")) {
                return m32013xe5056506(jSONObject);
            }
            if (str.equalsIgnoreCase("stopPreview")) {
                return m32017xa074cd66(jSONObject);
            }
            if (str.equalsIgnoreCase("switchCamera")) {
                this.f15593xfeabaa0f.f15648x24672724 = !r11.f15648x24672724;
                this.f15610x15318414.mo30105xac7d98c1().mo29666x2db92f79(this.f15593xfeabaa0f.f15648x24672724);
            } else {
                if (str.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.f159978f)) {
                    return m32009x10fad5c4(jSONObject);
                }
                if (str.equalsIgnoreCase("toggleTorch")) {
                    boolean z18 = !this.f15600x127abba6;
                    boolean mo29656xc8a25254 = this.f15610x15318414.mo30105xac7d98c1().mo29656xc8a25254(z18);
                    if (!mo29656xc8a25254) {
                        z18 = this.f15600x127abba6;
                    }
                    this.f15600x127abba6 = z18;
                    return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(mo29656xc8a25254 ? 0 : -2, mo29656xc8a25254 ? "Success" : "Failed");
                }
                if (str.equalsIgnoreCase("playBGM")) {
                    return m31994xe29438f4(jSONObject);
                }
                if (str.equalsIgnoreCase("stopBGM")) {
                    this.f15597x40a0141d = false;
                    this.f15610x15318414.mo30103x5f1b9a9c().mo29055xe624d2d9(f15571x74accc12, null);
                    this.f15610x15318414.mo30103x5f1b9a9c().mo29069x17324d6f(f15571x74accc12);
                } else if (str.equalsIgnoreCase("pauseBGM")) {
                    this.f15597x40a0141d = false;
                    this.f15610x15318414.mo30103x5f1b9a9c().mo29050xff20a1fb(f15571x74accc12);
                } else {
                    if (!str.equalsIgnoreCase("resumeBGM")) {
                        return str.equalsIgnoreCase("setBGMVolume") ? m32003x6fb6c7c0(jSONObject) : str.equalsIgnoreCase("setMICVolume") ? m32006x8d6b95ff(jSONObject) : str.equalsIgnoreCase("sendMessage") ? m32002x2936bf5f(jSONObject) : str.equalsIgnoreCase("setZoom") ? m32008x76535355(jSONObject) : str.equalsIgnoreCase("getMaxZoom") ? m31986x70202721(jSONObject) : new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-4, "Call operate failed, invalid operate name:".concat(str));
                    }
                    this.f15597x40a0141d = true;
                    this.f15610x15318414.mo30103x5f1b9a9c().mo29052x96288da4(f15571x74accc12);
                }
            }
        }
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: sendCustomVideoFrame */
    public int m32027x9fd3cbab(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b93 = this.f15610x15318414;
        if (abstractC3878xd0aa2b93 != null) {
            return abstractC3878xd0aa2b93.mo30150x9fd3cbab(v2TXLiveVideoFrame);
        }
        return 0;
    }

    /* renamed from: setAudioVolumeListener */
    public void m32028xd526eba2(com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f15590x194e5db7 = iTXAudioVolumeEvaluationListener;
    }

    /* renamed from: setBGMNotifyListener */
    public void m32029x2ea741c3(com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify onBGMNotify) {
        this.f15591x9cbe3518 = onBGMNotify;
    }

    /* renamed from: setFocusPosition */
    public com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m32030xb39e1cdf(float f17, float f18) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b93 = this.f15610x15318414;
        if (abstractC3878xd0aa2b93 == null) {
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-3, "Set focus position failed, pusher not initialized");
        }
        abstractC3878xd0aa2b93.mo30105xac7d98c1().mo29662x2d45073a((int) f17, (int) f18);
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: setPushListener */
    public void m32031x4e5bab70(com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7 interfaceC25480xa8fcc7a7) {
        this.f15604x2177eb87 = interfaceC25480xa8fcc7a7;
    }

    /* renamed from: setSnapshotListener */
    public void m32032x8ba6f71a(com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXSnapshotListener iTXSnapshotListener) {
        this.f15613x65e9c525 = iTXSnapshotListener;
    }

    /* renamed from: setSurface */
    public com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m32033x42c875eb(android.view.Surface surface) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Set surface:");
        sb6.append(surface != null ? java.lang.Integer.valueOf(surface.hashCode()) : "0");
        m31979xaee7d2f7(sb6.toString(), false);
        this.f15615x2fa29f80 = surface;
        com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b93 = this.f15610x15318414;
        if (abstractC3878xd0aa2b93 != null) {
            abstractC3878xd0aa2b93.mo30156x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15457x14b68192, surface);
        }
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: setSurfaceSize */
    public com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m32034x1c9cdc8c(int i17, int i18) {
        m31979xaee7d2f7("Set surface size [width:" + i17 + "][height:" + i18 + "]", false);
        this.f15617x77904e26 = i17;
        this.f15616x60aa7cc7 = i18;
        com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b93 = this.f15610x15318414;
        if (abstractC3878xd0aa2b93 != null) {
            abstractC3878xd0aa2b93.mo30156x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15458xebbebcb3, new com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.SurfaceSize(i17, i18));
        }
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: setVideoProcessListener */
    public void m32035x29bf11ca(com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener videoCustomProcessListener) {
        this.f15619x63ca4924 = videoCustomProcessListener;
        com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b93 = this.f15610x15318414;
        if (abstractC3878xd0aa2b93 != null) {
            abstractC3878xd0aa2b93.mo30099xbcf09668(videoCustomProcessListener != null, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeTexture);
        }
    }

    /* renamed from: setZoom */
    public com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m32036x76535355(int i17) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b93 = this.f15610x15318414;
        if (abstractC3878xd0aa2b93 == null) {
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-3, "Set zoom failed, pusher not initialized");
        }
        abstractC3878xd0aa2b93.mo30105xac7d98c1().mo29663xbdde2991(i17);
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: takePhoto */
    public void m32037x5880d5eb(boolean z17, com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXSnapshotListener iTXSnapshotListener) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b93 = this.f15610x15318414;
        if (abstractC3878xd0aa2b93 != null) {
            this.f15608x408a4009 = z17;
            this.f15613x65e9c525 = iTXSnapshotListener;
            int mo30166x10fad5c4 = abstractC3878xd0aa2b93.mo30166x10fad5c4();
            if (this.f15604x2177eb87 == null || mo30166x10fad5c4 == 0) {
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            m31979xaee7d2f7("OnPushEvent: event[-3], msg[" + bundle.toString() + "]", false);
            this.f15604x2177eb87.mo29886xceec7081(-3, bundle);
        }
    }

    /* renamed from: unInitLivePusher */
    public com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m32038xdda4a17c() {
        if (!this.f15601x9106827) {
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-3, "Uninit pusher failed, pusher is not initialized");
        }
        m32018x590f097a("Stop push call by inner, unInit pusher");
        this.f15601x9106827 = false;
        this.f15610x15318414.mo30146x41012807();
        m31979xaee7d2f7("Uninit pusher success", true);
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: updateLivePusher */
    public com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m32039xe25406fc(android.os.Bundle bundle) {
        if (bundle == null) {
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-1, "Update pusher params failed, params is null.");
        }
        if (!this.f15601x9106827) {
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-3, "Update pusher params failed, pusher is not initialized");
        }
        m31979xaee7d2f7("Update pusher params:" + bundle.toString(), false);
        com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e c3892xcefb867e = new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3892xcefb867e(this.f15593xfeabaa0f);
        c3892xcefb867e.m32052x1726ba75(bundle);
        if (android.text.TextUtils.isEmpty(c3892xcefb867e.url) || c3892xcefb867e.url.equals(this.f15593xfeabaa0f.url)) {
            if (this.f15610x15318414 != null) {
                m32004xa8370946(this.f15593xfeabaa0f, c3892xcefb867e);
            } else {
                m31978x93dde0fb("Pusher is not initialized, ignore set diff param", false);
            }
            this.f15593xfeabaa0f = c3892xcefb867e;
        } else {
            com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3885xb931d0cb.m31939x9cf0d20b().m31942x8bd173e6("");
            m31979xaee7d2f7("Url has been updated，new url:" + c3892xcefb867e.url, false);
            m32018x590f097a("Stop push call by inner, url is changed");
            m31982x6552318(c3892xcefb867e.url);
            m32005xf6f078fc(c3892xcefb867e);
            this.f15593xfeabaa0f = c3892xcefb867e;
            if (c3892xcefb867e.f15647x267738b3) {
                m31979xaee7d2f7("Update pusher params:[auto push is true, url is changed], need to start auto push", false);
                m32014xbbd8391a(c3892xcefb867e.url);
            }
        }
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: getMaxZoom */
    private com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m31986x70202721(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b93 = this.f15610x15318414;
        if (abstractC3878xd0aa2b93 == null) {
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-3, "Get max zoom failed, pusher is not initialized");
        }
        float mo29657x874067b5 = abstractC3878xd0aa2b93.mo30105xac7d98c1().mo29657x874067b5();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("maxZoom", java.lang.Float.valueOf(mo29657x874067b5));
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(0, hashMap);
    }

    /* renamed from: initLivePusher */
    public com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m32023x656bc683(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, android.os.Bundle bundle) {
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf == null) {
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-1, "Init pusher failed, view is null");
        }
        return m31989x8c33193(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, bundle);
    }

    /* renamed from: setZoom */
    private com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m32008x76535355(org.json.JSONObject jSONObject) {
        this.f15610x15318414.mo30105xac7d98c1().mo29663xbdde2991((float) (jSONObject != null ? jSONObject.optDouble(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15537x4680a1cb, 1.0d) : 1.0d));
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: sendEventNotify */
    private void m32001x58c16ddb(int i17, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String jSONObject2;
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        if (i17 != 1020) {
            switch (i17) {
                case 1031:
                    valueOf = "UserEnter";
                    break;
                case 1032:
                    valueOf = "UserExit";
                    break;
                case 1033:
                    valueOf = "VideoStateUpdate";
                    break;
                case 1034:
                    valueOf = "AudioStateUpdate";
                    break;
            }
        } else {
            valueOf = "UserList";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SendEventNotify [eventName:");
        sb6.append(valueOf);
        sb6.append("][params:");
        sb6.append(jSONObject != null ? jSONObject.toString() : "");
        sb6.append("]");
        m31979xaee7d2f7(sb6.toString(), false);
        if (jSONObject == null) {
            return;
        }
        try {
            if (z17) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                jSONArray.put(jSONObject);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("userlist", jSONArray);
                jSONObject2 = jSONObject3.toString();
            } else {
                jSONObject2 = jSONObject.toString();
            }
            com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7 interfaceC25480xa8fcc7a7 = this.f15604x2177eb87;
            if (interfaceC25480xa8fcc7a7 != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46285x5018f760, jSONObject2);
                m31979xaee7d2f7("OnPushEvent: event[" + i17 + "], msg[" + bundle.toString() + "]", false);
                interfaceC25480xa8fcc7a7.mo29886xceec7081(i17, bundle);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: createPusherInstance */
    private void m31982x6552318(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        int ordinal = com.p314xaae8f345.p420x6236cc6.p421x316220.C3884x280948e5.m31922x25cf2482(str).ordinal();
        if (str.startsWith(com.p314xaae8f345.p420x6236cc6.p421x316220.C3884x280948e5.f15470x6f8f616f) || str.startsWith(com.p314xaae8f345.p420x6236cc6.p421x316220.C3884x280948e5.f15471x6f8f6170)) {
            ordinal = 102;
        }
        com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3885xb931d0cb.m31939x9cf0d20b().m31942x8bd173e6(str);
        m31981x6552318(ordinal);
    }
}
