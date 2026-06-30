package com.tencent.live2.jsplugin.pusher;

/* loaded from: classes16.dex */
public class V2TXLivePusherJSAdapter extends com.tencent.live2.impl.a.b implements com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver {
    private static final int ANDROID_DISPLAY_OBTAIN_METHOD_MODE = 1;
    private static final int BGM_ID = 1234567;
    private static final int FRAMEWORK_TYPE_LIVEV2_WXAPPLET = 9;
    private static final int FRAMEWORK_TYPE_WXROOM_WXAPPLET = 3;
    public static final int PUSH_MODE_HIGH_QUALITY = 2;
    public static final int PUSH_MODE_HVGA_QUALITY = 9;
    public static final int PUSH_MODE_LINKMIC_MAIN = 4;
    public static final int PUSH_MODE_LINKMIC_SUB = 5;
    public static final int PUSH_MODE_QVGA_QUALITY = 8;
    public static final int PUSH_MODE_REALTIME = 6;
    public static final int PUSH_MODE_STANDARD_QUALITY = 1;
    public static final int PUSH_MODE_SUPER_QUALITY = 3;
    public static final int PUSH_MODE_ULTRA_QUALITY = 7;
    private static final int ROOM_PUSHER_MODE = 102;
    private static final int RTMP_PUSHER_MODE = 0;
    private static final java.lang.String TAG = "applet-pusher-api";
    private static final int TRTC_PUSHER_MODE = 1;
    private static final int VIDEO_ASPECT_3X4 = 1;
    private static final int VIDEO_ASPECT_9X16 = 2;
    private static java.lang.reflect.Constructor<?> mConstructor;
    private byte _hellAccFlag_;
    private com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener mAudioVolumeListener;
    private com.tencent.rtmp.TXLivePusher.OnBGMNotify mBGMNotifyListener;
    private com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig mConfig;
    private android.content.Context mContext;
    private boolean mEnableCustomVideoCapture;
    private boolean mIsBGMPlaying;
    private boolean mIsBGMPlayingWhenPausePusher;
    private boolean mIsCameraOpened;
    private boolean mIsFlashLightOpened;
    private boolean mIsInit;
    private boolean mIsMicrophoneOpened;
    private com.tencent.rtmp.ITXLivePushListener mLivePushListener;
    private final java.util.List<java.lang.String> mMainStreamUserIdList;
    private android.os.Handler mMainThreadHandler;
    private boolean mNeedCompressSnapshot;
    private int mNetworkQuality;
    private com.tencent.live2.V2TXLivePusher mPusher;
    private com.tencent.live2.V2TXLiveDef.V2TXLiveMode mPusherMode;
    private com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter.V2TXLiveProtocolType mRTCProtocolType;
    private com.tencent.rtmp.TXLivePusher.ITXSnapshotListener mSnapshotListener;
    private final java.util.List<java.lang.String> mSubStreamUserIdList;
    private android.view.Surface mSurface;
    private int mSurfaceHeight;
    private int mSurfaceWidth;
    private com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener mVideoCustomProcessListener;
    private com.tencent.rtmp.ui.TXCloudVideoView mVideoView;
    private boolean mEnableCamera = true;
    private int mBGMVolume = -1;
    private int mMicVolume = -1;
    private int mLastAngle = 0;
    private java.lang.String mTraceId = "";

    /* loaded from: classes6.dex */
    public enum V2TXLiveProtocolType {
        V2TXLiveProtocolTypeROOM,
        V2TXLiveProtocolTypeTRTC,
        V2TXLiveProtocolTypeRTMP,
        V2TXLiveProtocolTypeWEBRTC
    }

    static {
        com.tencent.liteav.base.util.q.a();
        try {
            int i17 = com.tencent.live2.impl.V2TXLivePusherImpl.f47190a;
            java.lang.reflect.Constructor<?> declaredConstructor = com.tencent.live2.impl.V2TXLivePusherImpl.class.getDeclaredConstructor(android.content.Context.class, java.lang.Integer.TYPE);
            mConstructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
        } catch (java.lang.Exception e17) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "Constructor pusher failed, exception:".concat(java.lang.String.valueOf(e17)));
        }
    }

    public V2TXLivePusherJSAdapter(android.content.Context context) {
        com.tencent.liteav.base.ContextUtils.initApplicationContext(context.getApplicationContext());
        com.tencent.liteav.base.ContextUtils.setDataDirectorySuffix("liteav");
        this.mContext = context.getApplicationContext();
        this.mMainThreadHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.mConfig = new com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig();
        this.mMainStreamUserIdList = new java.util.ArrayList();
        this.mSubStreamUserIdList = new java.util.ArrayList();
        this.mNetworkQuality = 2;
        if (context instanceof android.app.Activity) {
            com.tencent.liteav.base.util.i.a().a((android.app.Activity) context);
        }
    }

    private void apiOnlineError(java.lang.String str, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(this.mTraceId)) {
            this.mTraceId = java.lang.String.valueOf(hashCode()).substring(java.lang.String.valueOf(hashCode()).length() - 4);
        }
        if (!z17) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "[" + this.mTraceId + "]: " + str);
            return;
        }
        com.tencent.live2.jsplugin.JSAdapterOnlineLog.getInstance().log("[applet-pusher-api][" + this.mTraceId + "]: " + str, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void apiOnlineLog(java.lang.String str, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(this.mTraceId)) {
            this.mTraceId = java.lang.String.valueOf(hashCode()).substring(java.lang.String.valueOf(hashCode()).length() - 4);
        }
        if (!z17) {
            com.tencent.liteav.base.util.LiteavLog.i(TAG, "[" + this.mTraceId + "]: " + str);
            return;
        }
        com.tencent.live2.jsplugin.JSAdapterOnlineLog.getInstance().log("[applet-pusher-api][" + this.mTraceId + "]: " + str, true);
    }

    private void callbackSDKVersion() {
        if (this.mLivePushListener != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.tencent.rtmp.TXLiveConstants.EVT_DESCRIPTION, com.tencent.rtmp.TXLiveBase.getSDKVersionStr());
            bundle.putLong("EVT_TIME", java.lang.System.currentTimeMillis());
            apiOnlineLog("OnPushEvent: event[-9999999], msg[" + bundle.toString() + "]", false);
            this.mLivePushListener.onPushEvent(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.EVT_ID_SDK_VERSION, bundle);
        }
    }

    private void createPusherInstance(int i17) {
        com.tencent.live2.V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher != null) {
            v2TXLivePusher.release();
        }
        try {
            com.tencent.live2.V2TXLivePusher v2TXLivePusher2 = (com.tencent.live2.V2TXLivePusher) mConstructor.newInstance(this.mContext, java.lang.Integer.valueOf(i17));
            this.mPusher = v2TXLivePusher2;
            if (i17 == 0) {
                this.mPusherMode = com.tencent.live2.V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTMP;
            } else {
                this.mPusherMode = com.tencent.live2.V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTC;
                this.mRTCProtocolType = i17 == 102 ? com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter.V2TXLiveProtocolType.V2TXLiveProtocolTypeROOM : com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter.V2TXLiveProtocolType.V2TXLiveProtocolTypeTRTC;
            }
            v2TXLivePusher2.setObserver(this);
            this.mPusher.enableCustomVideoCapture(this.mEnableCustomVideoCapture);
            this.mPusher.enableCustomVideoProcess(this.mVideoCustomProcessListener != null, com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D, com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture);
            this.mPusher.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetDisplayRotationObtainMethod, 1);
        } catch (java.lang.Exception e17) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "Init pusher failed, exception:" + e17 + ", mode:" + i17);
        }
    }

    private void doSetVideoEncParam(int i17, int i18, int i19, int i27, int i28, int i29, boolean z17) {
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
            jSONObject.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH, i17);
            jSONObject.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT, i18);
            jSONObject.put("videoFps", i28);
            jSONObject.put("videoBitrate", i19);
            jSONObject.put("minVideoBitrate", i27);
            jSONObject.put("videoGop", i29);
            jSONObject.put("resolutionMode", z17 ? 0 : 1);
        } catch (org.json.JSONException unused) {
        }
        this.mPusher.setProperty(com.tencent.live2.impl.V2TXLiveProperty.kV2SetVideoQualityEx, jSONObject.toString());
    }

    private java.lang.String generateURL(java.lang.String str, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.live2.impl.V2TXLiveUtils.TRTC_ADDRESS1);
        sb6.append("?userid=");
        sb6.append(str);
        sb6.append("&streamtype=");
        sb6.append(i17 == 2 ? "aux" : com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
        return sb6.toString();
    }

    private org.json.JSONObject getAudioAvailableJSONObject(java.lang.String str, java.lang.String str2, boolean z17) {
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

    private org.json.JSONObject getUserJSONObject(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("userid", str);
            return jSONObject;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private org.json.JSONObject getVideoAvailableJSONObject(java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("userid", str);
            jSONObject.put("playurl", str2);
            jSONObject.put("streamtype", i17 == 2 ? "aux" : com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
            jSONObject.put("hasvideo", z17);
            return jSONObject;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private com.tencent.live2.jsplugin.V2TXJSAdapterError initLivePusherInner(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, android.os.Bundle bundle) {
        com.tencent.live2.jsplugin.JSAdapterOnlineLog.getInstance().updateUrl("");
        if (bundle == null) {
            apiOnlineError("Init pusher failed, params is null", false);
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-1, "Init pusher failed, params is null");
        }
        if (this.mIsInit) {
            apiOnlineError("Init pusher failed, pusher has been initialized", false);
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-1, "Init pusher failed, pusher has been initialized");
        }
        this.mIsInit = true;
        this.mVideoView = tXCloudVideoView;
        this.mConfig.updateFromBundle(bundle);
        if (android.text.TextUtils.isEmpty(this.mConfig.url)) {
            apiOnlineLog("Init default rtmp pusher instance, url is empty", false);
            createPusherInstance(0);
        } else {
            createPusherInstance(this.mConfig.url);
        }
        apiOnlineLog("Init pusher success, params:" + bundle.toString(), true);
        setFullParam(this.mConfig);
        if (this.mConfig.isAutoPush) {
            apiOnlineLog("Init pusher, [auto push is true, url is not empty, pusher is not pushing], need to start auto push", false);
            startPushInner(this.mConfig.url);
        }
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    private boolean isRTCProtocolType() {
        return this.mPusherMode == com.tencent.live2.V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTC;
    }

    private boolean isRTCRoomProtocolType() {
        return this.mPusherMode == com.tencent.live2.V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTC && this.mRTCProtocolType == com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter.V2TXLiveProtocolType.V2TXLiveProtocolTypeROOM;
    }

    private void notifyFullUserList() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONObject.put("userlist", jSONArray);
            synchronized (this) {
                for (java.lang.String str : this.mMainStreamUserIdList) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("userid", str);
                    jSONObject2.put("playurl", generateURL(str, 0));
                    jSONArray.put(jSONObject2);
                }
            }
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            jSONObject.put("userlist_aux", jSONArray2);
            synchronized (this) {
                for (java.lang.String str2 : this.mSubStreamUserIdList) {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("userid", str2);
                    jSONObject3.put("playurl", generateURL(str2, 2));
                    jSONArray2.put(jSONObject3);
                }
            }
            sendEventNotify(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST, jSONObject, false);
        } catch (java.lang.Exception e17) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "Notify full user list failed", e17);
        }
    }

    private com.tencent.live2.jsplugin.V2TXJSAdapterError pause(org.json.JSONObject jSONObject) {
        apiOnlineLog("Pause push, camera enable:" + this.mIsCameraOpened + ", microphone enable:" + this.mIsMicrophoneOpened, true);
        if (android.text.TextUtils.isEmpty(this.mConfig.backgroundImagePath)) {
            this.mPusher.pauseVideo();
        } else {
            com.tencent.live2.V2TXLivePusher v2TXLivePusher = this.mPusher;
            java.lang.String str = this.mConfig.backgroundImagePath;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "pause", "(Lorg/json/JSONObject;)Lcom/tencent/live2/jsplugin/V2TXJSAdapterError;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
            yj0.a.e(obj, decodeFile, "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "pause", "(Lorg/json/JSONObject;)Lcom/tencent/live2/jsplugin/V2TXJSAdapterError;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            v2TXLivePusher.startVirtualCamera(decodeFile);
        }
        if (!this.mConfig.isVOIP) {
            this.mPusher.pauseAudio();
        }
        boolean z17 = this.mIsBGMPlaying;
        this.mIsBGMPlayingWhenPausePusher = z17;
        if (z17) {
            operateLivePusher("pauseBGM", null);
        }
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    private com.tencent.live2.jsplugin.V2TXJSAdapterError playBGM(org.json.JSONObject jSONObject) {
        java.lang.String str = "";
        long j17 = 0;
        long j18 = -1;
        if (jSONObject != null) {
            str = jSONObject.optString("BGMFilePath", "");
            j17 = jSONObject.optLong("startTimeMs", 0L);
            j18 = jSONObject.optLong("endTimeMs", -1L);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            apiOnlineError("Play BGM failed, bgm url is empty", false);
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-2, "Play BGM failed, bgm url is empty");
        }
        this.mIsBGMPlaying = true;
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam = new com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam(BGM_ID, str);
        audioMusicParam.publish = true;
        audioMusicParam.startTimeMS = j17;
        audioMusicParam.endTimeMS = j18;
        this.mPusher.getAudioEffectManager().setMusicObserver(BGM_ID, this);
        this.mPusher.getAudioEffectManager().startPlayMusic(audioMusicParam);
        if (this.mBGMVolume != -1) {
            this.mPusher.getAudioEffectManager().setAllMusicVolume(this.mBGMVolume);
        }
        if (this.mMicVolume != -1) {
            this.mPusher.getAudioEffectManager().setVoiceCaptureVolume(this.mMicVolume);
        }
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    private void processAudioConfig(com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig v2TXLivePusherJSConfig, com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig v2TXLivePusherJSConfig2) {
        boolean z17 = v2TXLivePusherJSConfig.isMuteAudio;
        boolean z18 = v2TXLivePusherJSConfig2.isMuteAudio;
        if (z17 != z18) {
            if (z18) {
                this.mPusher.pauseAudio();
            } else {
                this.mPusher.resumeAudio();
            }
        }
        boolean z19 = v2TXLivePusherJSConfig.enableANS;
        boolean z27 = v2TXLivePusherJSConfig2.enableANS;
        if (z19 != z27) {
            this.mPusher.setProperty("enableANS", java.lang.String.format("{\"enable\": %b, \"level\":%d}", java.lang.Boolean.valueOf(z27), 100));
        }
        if (v2TXLivePusherJSConfig.enableEarMonitor != v2TXLivePusherJSConfig2.enableEarMonitor) {
            this.mPusher.getAudioEffectManager().enableVoiceEarMonitor(v2TXLivePusherJSConfig2.enableEarMonitor);
        }
        int i17 = v2TXLivePusherJSConfig.volumeNotifyIntervals;
        int i18 = v2TXLivePusherJSConfig2.volumeNotifyIntervals;
        if (i17 != i18) {
            this.mPusher.enableVolumeEvaluation(i18);
        }
        if (v2TXLivePusherJSConfig.volumeType != v2TXLivePusherJSConfig2.volumeType) {
            this.mPusher.getDeviceManager().setSystemVolumeType(v2TXLivePusherJSConfig2.volumeType);
        }
        if (v2TXLivePusherJSConfig.reverbType != v2TXLivePusherJSConfig2.reverbType) {
            this.mPusher.getAudioEffectManager().setVoiceReverbType(v2TXLivePusherJSConfig2.reverbType);
        }
        if (v2TXLivePusherJSConfig.voiceChangerType != v2TXLivePusherJSConfig2.voiceChangerType) {
            this.mPusher.getAudioEffectManager().setVoiceChangerType(v2TXLivePusherJSConfig2.voiceChangerType);
        }
        com.tencent.live2.V2TXLiveDef.V2TXLiveAudioQuality v2TXLiveAudioQuality = v2TXLivePusherJSConfig.audioQuality;
        com.tencent.live2.V2TXLiveDef.V2TXLiveAudioQuality v2TXLiveAudioQuality2 = v2TXLivePusherJSConfig2.audioQuality;
        if (v2TXLiveAudioQuality != v2TXLiveAudioQuality2) {
            this.mPusher.setAudioQuality(v2TXLiveAudioQuality2);
        }
        boolean z28 = v2TXLivePusherJSConfig.enableMicrophone;
        boolean z29 = v2TXLivePusherJSConfig2.enableMicrophone;
        if (z28 != z29) {
            if (z29) {
                startMicrophoneInner();
                return;
            } else {
                stopMicrophoneInner();
                return;
            }
        }
        if (!z29 || this.mIsMicrophoneOpened) {
            return;
        }
        startMicrophoneInner();
    }

    private void processBeautyConfig(com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig v2TXLivePusherJSConfig, com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig v2TXLivePusherJSConfig2) {
        if (v2TXLivePusherJSConfig.beautyStyle != v2TXLivePusherJSConfig2.beautyStyle) {
            this.mPusher.getBeautyManager().setBeautyStyle(v2TXLivePusherJSConfig2.beautyStyle);
        }
        if (v2TXLivePusherJSConfig.beautyLevel != v2TXLivePusherJSConfig2.beautyLevel) {
            this.mPusher.getBeautyManager().setBeautyLevel(v2TXLivePusherJSConfig2.beautyLevel);
        }
        if (v2TXLivePusherJSConfig.whitenessLevel != v2TXLivePusherJSConfig2.whitenessLevel) {
            this.mPusher.getBeautyManager().setWhitenessLevel(v2TXLivePusherJSConfig2.whitenessLevel);
        }
        java.lang.String str = v2TXLivePusherJSConfig2.filterImagePath;
        if (str == null || str.equals(v2TXLivePusherJSConfig.filterImagePath)) {
            return;
        }
        if (android.text.TextUtils.isEmpty(v2TXLivePusherJSConfig2.filterImagePath)) {
            this.mPusher.getBeautyManager().setFilter(null);
            return;
        }
        java.lang.String str2 = v2TXLivePusherJSConfig2.filterImagePath;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str2);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "processBeautyConfig", "(Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
        yj0.a.e(obj, decodeFile, "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "processBeautyConfig", "(Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        this.mPusher.getBeautyManager().setFilter(decodeFile);
    }

    private void processVideoConfig(com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig v2TXLivePusherJSConfig, com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig v2TXLivePusherJSConfig2) {
        if (v2TXLivePusherJSConfig.isFrontCamera != v2TXLivePusherJSConfig2.isFrontCamera) {
            this.mPusher.getDeviceManager().switchCamera(v2TXLivePusherJSConfig2.isFrontCamera);
        }
        if (v2TXLivePusherJSConfig.enableAutoFocus != v2TXLivePusherJSConfig2.enableAutoFocus) {
            this.mPusher.getDeviceManager().enableCameraAutoFocus(v2TXLivePusherJSConfig2.enableAutoFocus);
        }
        boolean z17 = v2TXLivePusherJSConfig.enableZoom;
        boolean z18 = v2TXLivePusherJSConfig2.enableZoom;
        if (z17 != z18) {
            this.mPusher.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2EnableCameraZoom, java.lang.Boolean.valueOf(z18));
        }
        boolean z19 = v2TXLivePusherJSConfig.enableRemoteMirror;
        boolean z27 = v2TXLivePusherJSConfig2.enableRemoteMirror;
        if (z19 != z27) {
            this.mPusher.setEncoderMirror(z27);
        }
        com.tencent.live2.V2TXLiveDef.V2TXLiveMirrorType v2TXLiveMirrorType = v2TXLivePusherJSConfig.mirrorType;
        com.tencent.live2.V2TXLiveDef.V2TXLiveMirrorType v2TXLiveMirrorType2 = v2TXLivePusherJSConfig2.mirrorType;
        if (v2TXLiveMirrorType != v2TXLiveMirrorType2) {
            this.mPusher.setRenderMirror(v2TXLiveMirrorType2);
        }
        boolean z28 = v2TXLivePusherJSConfig.isVerticalOrientation;
        boolean z29 = v2TXLivePusherJSConfig2.isVerticalOrientation;
        if (z28 != z29) {
            if (z29) {
                this.mPusher.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kEnableAdjustEncoderDirectionToUIOrientation, java.lang.Boolean.TRUE);
            } else {
                this.mPusher.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kEnableAdjustEncoderDirectionToUIOrientation, java.lang.Boolean.FALSE);
            }
        }
        if (v2TXLivePusherJSConfig.isVerticalOrientation != v2TXLivePusherJSConfig2.isVerticalOrientation || v2TXLivePusherJSConfig.aspect != v2TXLivePusherJSConfig2.aspect || v2TXLivePusherJSConfig.width != v2TXLivePusherJSConfig2.width || v2TXLivePusherJSConfig.height != v2TXLivePusherJSConfig2.height || v2TXLivePusherJSConfig.mode != v2TXLivePusherJSConfig2.mode || v2TXLivePusherJSConfig.minBitrate != v2TXLivePusherJSConfig2.minBitrate || v2TXLivePusherJSConfig.maxBitrate != v2TXLivePusherJSConfig2.maxBitrate || v2TXLivePusherJSConfig.fps != v2TXLivePusherJSConfig2.fps) {
            setVideoEncParam(v2TXLivePusherJSConfig2);
        }
        boolean z37 = v2TXLivePusherJSConfig2.enableCamera;
        this.mEnableCamera = z37;
        if (v2TXLivePusherJSConfig.enableCamera != z37) {
            if (z37) {
                startCameraInner(v2TXLivePusherJSConfig2.isFrontCamera);
                return;
            } else {
                stopCameraInner();
                return;
            }
        }
        if (!z37 || this.mIsCameraOpened) {
            return;
        }
        startCameraInner(v2TXLivePusherJSConfig2.isFrontCamera);
    }

    private void processWatermarkConfig(com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig v2TXLivePusherJSConfig, com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig v2TXLivePusherJSConfig2) {
        java.lang.String str = v2TXLivePusherJSConfig2.watermarkImagePath;
        if ((str == null || str.equals(v2TXLivePusherJSConfig.watermarkImagePath)) && v2TXLivePusherJSConfig.watermarkWidth == v2TXLivePusherJSConfig2.watermarkWidth && v2TXLivePusherJSConfig.watermarkLeft == v2TXLivePusherJSConfig2.watermarkLeft && v2TXLivePusherJSConfig.watermarkTop == v2TXLivePusherJSConfig2.watermarkTop) {
            return;
        }
        if (android.text.TextUtils.isEmpty(v2TXLivePusherJSConfig2.watermarkImagePath)) {
            this.mPusher.setWatermark(null, 0.0f, 0.0f, 0.0f);
            return;
        }
        java.lang.String str2 = v2TXLivePusherJSConfig2.watermarkImagePath;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str2);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "processWatermarkConfig", "(Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
        yj0.a.e(obj, decodeFile, "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "processWatermarkConfig", "(Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        this.mPusher.setWatermark(decodeFile, v2TXLivePusherJSConfig2.watermarkLeft, v2TXLivePusherJSConfig2.watermarkTop, v2TXLivePusherJSConfig2.watermarkWidth);
    }

    private com.tencent.live2.jsplugin.V2TXJSAdapterError resume(org.json.JSONObject jSONObject) {
        apiOnlineLog("Resume push", true);
        this.mPusher.stopVirtualCamera();
        if (this.mConfig.isMuteAudio) {
            this.mPusher.pauseAudio();
        } else {
            this.mPusher.resumeAudio();
        }
        this.mPusher.resumeVideo();
        if (this.mIsBGMPlayingWhenPausePusher) {
            operateLivePusher("resumeBGM", null);
        }
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    private void sendEventNotify(int i17, java.lang.String str) {
        com.tencent.rtmp.ITXLivePushListener iTXLivePushListener = this.mLivePushListener;
        if (iTXLivePushListener != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.tencent.rtmp.TXLiveConstants.EVT_DESCRIPTION, str);
            apiOnlineLog("OnPushEvent: event[" + i17 + "], msg[" + bundle.toString() + "]", false);
            iTXLivePushListener.onPushEvent(i17, bundle);
        }
    }

    private com.tencent.live2.jsplugin.V2TXJSAdapterError sendMessage(org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject != null ? jSONObject.optString("msg") : null;
        if (android.text.TextUtils.isEmpty(optString)) {
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-2, "Send SEI message failed, message is empty");
        }
        try {
            this.mPusher.sendSeiMessage(isRTCRoomProtocolType() ? 243 : 242, optString.getBytes(com.tencent.mapsdk.internal.rv.f51270c));
        } catch (java.lang.Exception e17) {
            apiOnlineLog("Send SEI message failed, error:" + e17.getMessage(), false);
        }
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError(0, "Success");
    }

    private com.tencent.live2.jsplugin.V2TXJSAdapterError setBGMVolume(org.json.JSONObject jSONObject) {
        this.mBGMVolume = (int) ((jSONObject != null ? jSONObject.optDouble("volume", 1.0d) : 1.0d) * 100.0d);
        this.mPusher.getAudioEffectManager().setAllMusicVolume(this.mBGMVolume);
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    private void setDiffParam(com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig v2TXLivePusherJSConfig, com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig v2TXLivePusherJSConfig2) {
        java.lang.String diffConfig = v2TXLivePusherJSConfig2.diffConfig(v2TXLivePusherJSConfig);
        if (!android.text.TextUtils.isEmpty(diffConfig)) {
            apiOnlineLog("Set diff config:".concat(java.lang.String.valueOf(diffConfig)), true);
        }
        boolean z17 = v2TXLivePusherJSConfig.enableDebugView;
        boolean z18 = v2TXLivePusherJSConfig2.enableDebugView;
        if (z17 != z18) {
            this.mPusher.showDebugView(z18);
        }
        processVideoConfig(v2TXLivePusherJSConfig, v2TXLivePusherJSConfig2);
        processAudioConfig(v2TXLivePusherJSConfig, v2TXLivePusherJSConfig2);
        processBeautyConfig(v2TXLivePusherJSConfig, v2TXLivePusherJSConfig2);
        processWatermarkConfig(v2TXLivePusherJSConfig, v2TXLivePusherJSConfig2);
        if (!v2TXLivePusherJSConfig2.isAutoPush || android.text.TextUtils.isEmpty(v2TXLivePusherJSConfig2.url) || this.mPusher.isPushing() == 1) {
            return;
        }
        com.tencent.live2.jsplugin.JSAdapterOnlineLog.getInstance().updateUrl(v2TXLivePusherJSConfig2.url);
        apiOnlineLog("Set diff config:[auto push is true, url is not empty, pusher is not pushing], need to start auto push", false);
        startPushInner(v2TXLivePusherJSConfig2.url);
    }

    private void setFullParam(com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig v2TXLivePusherJSConfig) {
        apiOnlineLog("Set full config:".concat(java.lang.String.valueOf(v2TXLivePusherJSConfig)), true);
        this.mPusher.showDebugView(v2TXLivePusherJSConfig.enableDebugView);
        this.mPusher.getDeviceManager().enableCameraAutoFocus(v2TXLivePusherJSConfig.enableAutoFocus);
        this.mPusher.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2EnableCameraZoom, java.lang.Boolean.valueOf(v2TXLivePusherJSConfig.enableZoom));
        this.mPusher.setEncoderMirror(v2TXLivePusherJSConfig.enableRemoteMirror);
        this.mPusher.setRenderMirror(v2TXLivePusherJSConfig.mirrorType);
        setVideoEncParam(v2TXLivePusherJSConfig);
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = this.mVideoView;
        if (tXCloudVideoView != null) {
            this.mPusher.setRenderView(tXCloudVideoView);
        }
        android.view.Surface surface = this.mSurface;
        if (surface != null) {
            this.mPusher.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurface, surface);
            this.mPusher.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurfaceSize, new com.tencent.live2.impl.V2TXLiveDefInner.SurfaceSize(this.mSurfaceWidth, this.mSurfaceHeight));
        }
        boolean z17 = v2TXLivePusherJSConfig.enableCamera;
        this.mEnableCamera = z17;
        if (z17) {
            startCameraInner(v2TXLivePusherJSConfig.isFrontCamera);
        } else {
            stopCameraInner();
        }
        if (v2TXLivePusherJSConfig.isMuteAudio) {
            this.mPusher.pauseAudio();
        } else {
            this.mPusher.resumeAudio();
        }
        this.mPusher.setProperty("enableANS", java.lang.String.format("{\"enable\": %b, \"level\":%d}", java.lang.Boolean.valueOf(v2TXLivePusherJSConfig.enableANS), 100));
        this.mPusher.getAudioEffectManager().enableVoiceEarMonitor(v2TXLivePusherJSConfig.enableEarMonitor);
        this.mPusher.enableVolumeEvaluation(v2TXLivePusherJSConfig.volumeNotifyIntervals);
        this.mPusher.getDeviceManager().setSystemVolumeType(v2TXLivePusherJSConfig.volumeType);
        this.mPusher.getAudioEffectManager().setVoiceReverbType(v2TXLivePusherJSConfig.reverbType);
        this.mPusher.getAudioEffectManager().setVoiceChangerType(v2TXLivePusherJSConfig.voiceChangerType);
        this.mPusher.setAudioQuality(v2TXLivePusherJSConfig.audioQuality);
        if (v2TXLivePusherJSConfig.enableMicrophone) {
            startMicrophoneInner();
        } else {
            stopMicrophoneInner();
        }
        if (v2TXLivePusherJSConfig.isVerticalOrientation) {
            this.mPusher.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kEnableAdjustEncoderDirectionToUIOrientation, java.lang.Boolean.TRUE);
        } else {
            this.mPusher.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kEnableAdjustEncoderDirectionToUIOrientation, java.lang.Boolean.FALSE);
        }
        this.mPusher.getBeautyManager().setBeautyStyle(v2TXLivePusherJSConfig.beautyStyle);
        this.mPusher.getBeautyManager().setBeautyLevel(v2TXLivePusherJSConfig.beautyLevel);
        this.mPusher.getBeautyManager().setWhitenessLevel(v2TXLivePusherJSConfig.whitenessLevel);
        if (android.text.TextUtils.isEmpty(v2TXLivePusherJSConfig.filterImagePath)) {
            this.mPusher.getBeautyManager().setFilter(null);
        } else {
            java.lang.String str = v2TXLivePusherJSConfig.filterImagePath;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "setFullParam", "(Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
            yj0.a.e(obj, decodeFile, "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "setFullParam", "(Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            this.mPusher.getBeautyManager().setFilter(decodeFile);
        }
        if (android.text.TextUtils.isEmpty(v2TXLivePusherJSConfig.watermarkImagePath)) {
            this.mPusher.setWatermark(null, 0.0f, 0.0f, 0.0f);
            return;
        }
        java.lang.String str2 = v2TXLivePusherJSConfig.watermarkImagePath;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(str2);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "setFullParam", "(Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile2 = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList2.get(0));
        yj0.a.e(obj2, decodeFile2, "com/tencent/live2/jsplugin/pusher/V2TXLivePusherJSAdapter", "setFullParam", "(Lcom/tencent/live2/jsplugin/pusher/V2TXLivePusherJSConfig;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        this.mPusher.setWatermark(decodeFile2, v2TXLivePusherJSConfig.watermarkLeft, v2TXLivePusherJSConfig.watermarkTop, v2TXLivePusherJSConfig.watermarkWidth);
    }

    private com.tencent.live2.jsplugin.V2TXJSAdapterError setMICVolume(org.json.JSONObject jSONObject) {
        this.mMicVolume = (int) ((jSONObject != null ? jSONObject.optDouble("volume", 1.0d) : 1.0d) * 100.0d);
        this.mPusher.getAudioEffectManager().setVoiceCaptureVolume(this.mMicVolume);
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setVideoEncParam(com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter.setVideoEncParam(com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig):void");
    }

    private com.tencent.live2.jsplugin.V2TXJSAdapterError snapshot(org.json.JSONObject jSONObject) {
        java.lang.String optString;
        this.mNeedCompressSnapshot = false;
        if (jSONObject != null && (optString = jSONObject.optString("quality")) != null && optString.equalsIgnoreCase("compressed")) {
            this.mNeedCompressSnapshot = true;
        }
        this.mPusher.snapshot();
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    private com.tencent.live2.jsplugin.V2TXJSAdapterError start(org.json.JSONObject jSONObject) {
        apiOnlineLog("Start push, url:" + this.mConfig.url + ", isPushing: " + this.mPusher.isPushing(), true);
        if (this.mPusher.isPushing() == 1 || android.text.TextUtils.isEmpty(this.mConfig.url)) {
            apiOnlineError("Start push failed", false);
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-2, "Start push failed");
        }
        startPushInner(this.mConfig.url);
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    private void startCameraInner(boolean z17) {
        com.tencent.live2.V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher == null) {
            apiOnlineError("Start camera failed, pusher is not initialized", false);
            return;
        }
        if (this.mIsCameraOpened) {
            apiOnlineError("Start camera failed, camera has been started", false);
        } else if (this.mEnableCamera) {
            this.mIsCameraOpened = true;
            v2TXLivePusher.startCamera(z17);
        }
    }

    private void startMicrophoneInner() {
        com.tencent.live2.V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher == null) {
            apiOnlineError("Start microphone failed, pusher is not initialized", false);
        } else {
            if (this.mIsMicrophoneOpened) {
                apiOnlineError("Start microphone failed, microphone has been started", false);
                return;
            }
            this.mIsMicrophoneOpened = true;
            v2TXLivePusher.startMicrophone();
            this.mPusher.getDeviceManager().setAudioRoute(com.tencent.live2.jsplugin.player.V2TXLivePlayerJSConfig.sAudioRoute == 0 ? com.tencent.liteav.device.TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone : com.tencent.liteav.device.TXDeviceManager.TXAudioRoute.TXAudioRouteEarpiece);
        }
    }

    private com.tencent.live2.jsplugin.V2TXJSAdapterError startPreview(org.json.JSONObject jSONObject) {
        apiOnlineLog("Start preview", true);
        if (this.mPusher.isPushing() == 1) {
            apiOnlineLog("Start preview failed, current is pushing", false);
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-2, "Start preview failed, current is pushing");
        }
        startCameraInner(this.mConfig.isFrontCamera);
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    private void startPushInner(java.lang.String str) {
        if (this.mPusher == null) {
            apiOnlineError("Start push failed, pusher is not initialized", false);
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            apiOnlineError("Start push failed, url is empty", false);
            return;
        }
        if (this.mConfig.enableMicrophone && !this.mIsMicrophoneOpened) {
            startMicrophoneInner();
        }
        com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig v2TXLivePusherJSConfig = this.mConfig;
        if (v2TXLivePusherJSConfig.enableCamera && !this.mIsCameraOpened) {
            startCameraInner(v2TXLivePusherJSConfig.isFrontCamera);
        }
        if (this.mPusherMode == com.tencent.live2.V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTC) {
            int i17 = isRTCRoomProtocolType() ? 3 : 9;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(com.tencent.shadow.core.common.HostConstants.FRAMEWORK_APPID, i17);
                jSONObject.put("component", 0);
            } catch (org.json.JSONException unused) {
            }
            this.mPusher.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetFramework, jSONObject.toString());
        }
        apiOnlineLog("Start push result:".concat(java.lang.String.valueOf(this.mPusher.startPush(str))), false);
    }

    private void stopCameraInner() {
        com.tencent.live2.V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher == null) {
            apiOnlineError("Stop camera failed, pusher is not initialized", false);
        } else if (!this.mIsCameraOpened) {
            apiOnlineError("Stop camera failed, camera has been stopped", false);
        } else {
            this.mIsCameraOpened = false;
            v2TXLivePusher.stopCamera();
        }
    }

    private void stopMicrophoneInner() {
        com.tencent.live2.V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher == null) {
            apiOnlineError("Stop microphone failed, pusher is not initialized", false);
        } else if (!this.mIsMicrophoneOpened) {
            apiOnlineError("Stop microphone failed, microphone has been stopped", false);
        } else {
            this.mIsMicrophoneOpened = false;
            v2TXLivePusher.stopMicrophone();
        }
    }

    private com.tencent.live2.jsplugin.V2TXJSAdapterError stopPreview(org.json.JSONObject jSONObject) {
        apiOnlineLog("Stop preview", true);
        if (this.mPusher.isPushing() == 1) {
            apiOnlineLog("Stop preview failed, current is pushing", false);
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-2, "Stop preview failed, current is pushing");
        }
        stopCameraInner();
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    private void stopPushInner(java.lang.String str) {
        apiOnlineLog(str, true);
        this.mIsBGMPlaying = false;
        this.mIsBGMPlayingWhenPausePusher = false;
        this.mIsFlashLightOpened = false;
        this.mIsMicrophoneOpened = false;
        this.mIsCameraOpened = false;
        this.mBGMVolume = -1;
        this.mMicVolume = -1;
        com.tencent.live2.V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher != null) {
            v2TXLivePusher.getAudioEffectManager().stopPlayMusic(BGM_ID);
            this.mPusher.getAudioEffectManager().setMusicObserver(BGM_ID, null);
            this.mPusher.stopPush();
        }
    }

    private boolean userLandscapeResolution(int i17, boolean z17) {
        return i17 == 1 ? z17 : i17 == 3 ? z17 : i17 == 0 ? !z17 : i17 == 2 && !z17;
    }

    public int enableCustomVideoCapture(boolean z17) {
        apiOnlineLog("Custom video capture, enable:".concat(java.lang.String.valueOf(z17)), false);
        this.mEnableCustomVideoCapture = z17;
        com.tencent.live2.V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher != null) {
            return v2TXLivePusher.enableCustomVideoCapture(z17);
        }
        return 0;
    }

    public int getMaxZoom() {
        com.tencent.live2.V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher == null) {
            return 0;
        }
        return (int) v2TXLivePusher.getDeviceManager().getCameraZoomMaxRatio();
    }

    public com.tencent.live2.jsplugin.V2TXJSAdapterError initLivePusher(android.os.Bundle bundle) {
        callbackSDKVersion();
        return initLivePusherInner(null, bundle);
    }

    public boolean isPushing() {
        com.tencent.live2.V2TXLivePusher v2TXLivePusher = this.mPusher;
        return v2TXLivePusher != null && v2TXLivePusher.isPushing() == 1;
    }

    public void notifyOrientationChanged(final int i17) {
        this.mMainThreadHandler.post(new java.lang.Runnable() { // from class: com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter.this.mLastAngle != i17) {
                    com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter.this.apiOnlineLog("Notify orientation changed, [angle:" + i17 + "]", false);
                    com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter.this.mLastAngle = i17;
                    com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter v2TXLivePusherJSAdapter = com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter.this;
                    v2TXLivePusherJSAdapter.setVideoEncParam(v2TXLivePusherJSAdapter.mConfig);
                }
            }
        });
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i17, int i18) {
        com.tencent.rtmp.TXLivePusher.OnBGMNotify onBGMNotify;
        com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig v2TXLivePusherJSConfig = this.mConfig;
        if (BGM_ID == i17 && v2TXLivePusherJSConfig.enableBGMEventCallback && (onBGMNotify = this.mBGMNotifyListener) != null) {
            onBGMNotify.onBGMComplete(i18);
        }
    }

    @Override // com.tencent.live2.impl.a.b
    public void onEnterRoom(long j17) {
        if (!isRTCRoomProtocolType()) {
            apiOnlineLog("onEnterRoom: isn't room protocol,ignore", false);
            return;
        }
        this.mMainStreamUserIdList.clear();
        this.mSubStreamUserIdList.clear();
        if (j17 > 0) {
            sendEventNotify(1018, "onEnterRoom success, time cost[" + j17 + "]");
            return;
        }
        sendEventNotify(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, "onEnterRoom failed, error code[" + j17 + "]");
        sendEventNotify(-3301, "onEnterRoom failed, error code[" + j17 + "]");
        if (j17 == -100018) {
            sendEventNotify(-100018, "onEnterRoom failed, user sign invalid.");
        }
    }

    @Override // com.tencent.live2.impl.a.b
    public void onExitRoom(int i17) {
        if (!isRTCRoomProtocolType()) {
            apiOnlineLog("OnExitRoom: isn't room protocol,ignore", false);
            return;
        }
        this.mMainStreamUserIdList.clear();
        this.mSubStreamUserIdList.clear();
        sendEventNotify(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_OUT, "onExitRoom reason[" + i17 + "]");
    }

    @Override // com.tencent.live2.V2TXLivePusherObserver
    public void onGLContextCreated() {
        super.onGLContextCreated();
    }

    @Override // com.tencent.live2.V2TXLivePusherObserver
    public void onGLContextDestroyed() {
        com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener videoCustomProcessListener = this.mVideoCustomProcessListener;
        if (videoCustomProcessListener != null) {
            videoCustomProcessListener.onTextureDestoryed();
        }
    }

    @Override // com.tencent.live2.V2TXLivePusherObserver
    public void onMicrophoneVolumeUpdate(int i17) {
        com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener = this.mAudioVolumeListener;
        if (iTXAudioVolumeEvaluationListener != null) {
            iTXAudioVolumeEvaluationListener.onAudioVolumeEvaluationNotify(i17);
        }
    }

    @Override // com.tencent.live2.impl.a.b
    public void onNetworkQuality(int i17) {
        this.mNetworkQuality = i17;
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i17, long j17, long j18) {
        com.tencent.rtmp.TXLivePusher.OnBGMNotify onBGMNotify;
        com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig v2TXLivePusherJSConfig = this.mConfig;
        if (BGM_ID == i17 && v2TXLivePusherJSConfig.enableBGMEventCallback && (onBGMNotify = this.mBGMNotifyListener) != null) {
            onBGMNotify.onBGMProgress(j17, j18);
        }
    }

    @Override // com.tencent.live2.V2TXLivePusherObserver
    public int onProcessVideoFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame, com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame2) {
        com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener videoCustomProcessListener = this.mVideoCustomProcessListener;
        if (videoCustomProcessListener == null) {
            return 0;
        }
        v2TXLiveVideoFrame2.texture.textureId = videoCustomProcessListener.onTextureCustomProcess(v2TXLiveVideoFrame.texture.textureId, v2TXLiveVideoFrame.width, v2TXLiveVideoFrame.height);
        return 0;
    }

    @Override // com.tencent.live2.impl.a.b
    public void onPushEvent(int i17, android.os.Bundle bundle) {
        com.tencent.rtmp.ITXLivePushListener iTXLivePushListener = this.mLivePushListener;
        if (iTXLivePushListener != null) {
            apiOnlineLog("OnPushEvent: event[" + i17 + "], msg[" + bundle.toString() + "]", false);
            iTXLivePushListener.onPushEvent(i17, bundle);
        }
        if (iTXLivePushListener == null || i17 != 1003) {
            return;
        }
        com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter.V2TXLiveProtocolType v2TXLiveProtocolType = this.mRTCProtocolType;
        if (v2TXLiveProtocolType == com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter.V2TXLiveProtocolType.V2TXLiveProtocolTypeROOM || v2TXLiveProtocolType == com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter.V2TXLiveProtocolType.V2TXLiveProtocolTypeTRTC) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString(com.tencent.rtmp.TXLiveConstants.EVT_DESCRIPTION, "Start encoder success.");
            apiOnlineLog("OnPushEvent: event[" + i17 + "], msg[" + bundle2.toString() + "]", false);
            iTXLivePushListener.onPushEvent(1008, bundle2);
        }
    }

    @Override // com.tencent.live2.impl.a.b
    public void onPushNetStatus(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.putInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_QUALITY_LEVEL, this.mNetworkQuality);
        }
        com.tencent.rtmp.ITXLivePushListener iTXLivePushListener = this.mLivePushListener;
        if (iTXLivePushListener != null) {
            iTXLivePushListener.onNetStatus(bundle);
        }
    }

    @Override // com.tencent.live2.impl.a.b
    public void onRemoteUserEnter(java.lang.String str) {
        if (isRTCRoomProtocolType()) {
            sendEventNotify(1031, getUserJSONObject(str), true);
        } else {
            apiOnlineLog("OnRemoteUserEnter: isn't room protocol,ignore", false);
        }
    }

    @Override // com.tencent.live2.impl.a.b
    public void onRemoteUserExit(java.lang.String str, int i17) {
        if (isRTCRoomProtocolType()) {
            sendEventNotify(1032, getUserJSONObject(str), true);
        } else {
            apiOnlineLog("OnRemoteUserExit: isn't room protocol,ignore", false);
        }
    }

    @Override // com.tencent.live2.V2TXLivePusherObserver
    public void onSnapshotComplete(android.graphics.Bitmap bitmap) {
        com.tencent.rtmp.TXLivePusher.ITXSnapshotListener iTXSnapshotListener = this.mSnapshotListener;
        if (iTXSnapshotListener == null) {
            return;
        }
        apiOnlineLog("OnSnapshotComplete image:".concat(java.lang.String.valueOf(bitmap)), false);
        if (bitmap == null) {
            iTXSnapshotListener.onSnapshot(bitmap);
            return;
        }
        if (!this.mNeedCompressSnapshot) {
            iTXSnapshotListener.onSnapshot(bitmap);
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(0.5f, 0.5f);
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
        iTXSnapshotListener.onSnapshot(createBitmap);
        if (createBitmap == null || createBitmap.isRecycled()) {
            return;
        }
        createBitmap.recycle();
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i17, int i18) {
        com.tencent.rtmp.TXLivePusher.OnBGMNotify onBGMNotify;
        com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig v2TXLivePusherJSConfig = this.mConfig;
        if (BGM_ID == i17 && v2TXLivePusherJSConfig.enableBGMEventCallback && (onBGMNotify = this.mBGMNotifyListener) != null) {
            onBGMNotify.onBGMStart();
        }
    }

    @Override // com.tencent.live2.impl.a.b
    public void onUserAudioAvailable(java.lang.String str, boolean z17) {
        if (isRTCRoomProtocolType()) {
            sendEventNotify(1034, getAudioAvailableJSONObject(str, generateURL(str, 0), z17), true);
        } else {
            apiOnlineLog("OnUserAudioAvailable: isn't room protocol,ignore", false);
        }
    }

    @Override // com.tencent.live2.impl.a.b
    public void onUserVideoAvailable(java.lang.String str, int i17, boolean z17) {
        if (!isRTCRoomProtocolType()) {
            apiOnlineLog("OnUserVideoAvailable: isn't room protocol,ignore", false);
            return;
        }
        sendEventNotify(1033, getVideoAvailableJSONObject(str, generateURL(str, i17), i17, z17), true);
        java.util.List<java.lang.String> list = i17 == 2 ? this.mSubStreamUserIdList : this.mMainStreamUserIdList;
        if (z17) {
            list.add(str);
        } else {
            list.remove(str);
        }
        notifyFullUserList();
    }

    public com.tencent.live2.jsplugin.V2TXJSAdapterError operateLivePusher(java.lang.String str, org.json.JSONObject jSONObject) {
        if (android.text.TextUtils.isEmpty(str)) {
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-1, "Call operate failed, operate name is null");
        }
        boolean z17 = str.equals("start") || str.equals("stop") || str.equals("resume") || str.equals("pause") || str.equals("startPreview") || str.equals("stopPreview");
        if (!this.mIsInit || this.mPusher == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Call operate failed, pusher is not initialized, [name:");
            sb6.append(str);
            sb6.append("][init:");
            sb6.append(this.mIsInit);
            sb6.append("][pusher:");
            sb6.append(this.mPusher != null);
            sb6.append("]");
            apiOnlineError(sb6.toString(), z17);
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-3, "Call operate failed, pusher is not initialized");
        }
        if (str.equalsIgnoreCase("start")) {
            return start(jSONObject);
        }
        if (str.equalsIgnoreCase("stop")) {
            stopPushInner("Stop push call by business, operate stop");
        } else {
            if (str.equalsIgnoreCase("pause")) {
                return pause(jSONObject);
            }
            if (str.equalsIgnoreCase("resume")) {
                return resume(jSONObject);
            }
            if (str.equalsIgnoreCase("startPreview")) {
                return startPreview(jSONObject);
            }
            if (str.equalsIgnoreCase("stopPreview")) {
                return stopPreview(jSONObject);
            }
            if (str.equalsIgnoreCase("switchCamera")) {
                this.mConfig.isFrontCamera = !r11.isFrontCamera;
                this.mPusher.getDeviceManager().switchCamera(this.mConfig.isFrontCamera);
            } else {
                if (str.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.j0.f78445f)) {
                    return snapshot(jSONObject);
                }
                if (str.equalsIgnoreCase("toggleTorch")) {
                    boolean z18 = !this.mIsFlashLightOpened;
                    boolean enableCameraTorch = this.mPusher.getDeviceManager().enableCameraTorch(z18);
                    if (!enableCameraTorch) {
                        z18 = this.mIsFlashLightOpened;
                    }
                    this.mIsFlashLightOpened = z18;
                    return new com.tencent.live2.jsplugin.V2TXJSAdapterError(enableCameraTorch ? 0 : -2, enableCameraTorch ? "Success" : "Failed");
                }
                if (str.equalsIgnoreCase("playBGM")) {
                    return playBGM(jSONObject);
                }
                if (str.equalsIgnoreCase("stopBGM")) {
                    this.mIsBGMPlaying = false;
                    this.mPusher.getAudioEffectManager().setMusicObserver(BGM_ID, null);
                    this.mPusher.getAudioEffectManager().stopPlayMusic(BGM_ID);
                } else if (str.equalsIgnoreCase("pauseBGM")) {
                    this.mIsBGMPlaying = false;
                    this.mPusher.getAudioEffectManager().pausePlayMusic(BGM_ID);
                } else {
                    if (!str.equalsIgnoreCase("resumeBGM")) {
                        return str.equalsIgnoreCase("setBGMVolume") ? setBGMVolume(jSONObject) : str.equalsIgnoreCase("setMICVolume") ? setMICVolume(jSONObject) : str.equalsIgnoreCase("sendMessage") ? sendMessage(jSONObject) : str.equalsIgnoreCase("setZoom") ? setZoom(jSONObject) : str.equalsIgnoreCase("getMaxZoom") ? getMaxZoom(jSONObject) : new com.tencent.live2.jsplugin.V2TXJSAdapterError(-4, "Call operate failed, invalid operate name:".concat(str));
                    }
                    this.mIsBGMPlaying = true;
                    this.mPusher.getAudioEffectManager().resumePlayMusic(BGM_ID);
                }
            }
        }
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    public int sendCustomVideoFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        com.tencent.live2.V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher != null) {
            return v2TXLivePusher.sendCustomVideoFrame(v2TXLiveVideoFrame);
        }
        return 0;
    }

    public void setAudioVolumeListener(com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.mAudioVolumeListener = iTXAudioVolumeEvaluationListener;
    }

    public void setBGMNotifyListener(com.tencent.rtmp.TXLivePusher.OnBGMNotify onBGMNotify) {
        this.mBGMNotifyListener = onBGMNotify;
    }

    public com.tencent.live2.jsplugin.V2TXJSAdapterError setFocusPosition(float f17, float f18) {
        com.tencent.live2.V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher == null) {
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-3, "Set focus position failed, pusher not initialized");
        }
        v2TXLivePusher.getDeviceManager().setCameraFocusPosition((int) f17, (int) f18);
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    public void setPushListener(com.tencent.rtmp.ITXLivePushListener iTXLivePushListener) {
        this.mLivePushListener = iTXLivePushListener;
    }

    public void setSnapshotListener(com.tencent.rtmp.TXLivePusher.ITXSnapshotListener iTXSnapshotListener) {
        this.mSnapshotListener = iTXSnapshotListener;
    }

    public com.tencent.live2.jsplugin.V2TXJSAdapterError setSurface(android.view.Surface surface) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Set surface:");
        sb6.append(surface != null ? java.lang.Integer.valueOf(surface.hashCode()) : "0");
        apiOnlineLog(sb6.toString(), false);
        this.mSurface = surface;
        com.tencent.live2.V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher != null) {
            v2TXLivePusher.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurface, surface);
        }
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    public com.tencent.live2.jsplugin.V2TXJSAdapterError setSurfaceSize(int i17, int i18) {
        apiOnlineLog("Set surface size [width:" + i17 + "][height:" + i18 + "]", false);
        this.mSurfaceWidth = i17;
        this.mSurfaceHeight = i18;
        com.tencent.live2.V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher != null) {
            v2TXLivePusher.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurfaceSize, new com.tencent.live2.impl.V2TXLiveDefInner.SurfaceSize(i17, i18));
        }
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    public void setVideoProcessListener(com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener videoCustomProcessListener) {
        this.mVideoCustomProcessListener = videoCustomProcessListener;
        com.tencent.live2.V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher != null) {
            v2TXLivePusher.enableCustomVideoProcess(videoCustomProcessListener != null, com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D, com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture);
        }
    }

    public com.tencent.live2.jsplugin.V2TXJSAdapterError setZoom(int i17) {
        com.tencent.live2.V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher == null) {
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-3, "Set zoom failed, pusher not initialized");
        }
        v2TXLivePusher.getDeviceManager().setCameraZoomRatio(i17);
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    public void takePhoto(boolean z17, com.tencent.rtmp.TXLivePusher.ITXSnapshotListener iTXSnapshotListener) {
        com.tencent.live2.V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher != null) {
            this.mNeedCompressSnapshot = z17;
            this.mSnapshotListener = iTXSnapshotListener;
            int snapshot = v2TXLivePusher.snapshot();
            if (this.mLivePushListener == null || snapshot == 0) {
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            apiOnlineLog("OnPushEvent: event[-3], msg[" + bundle.toString() + "]", false);
            this.mLivePushListener.onPushEvent(-3, bundle);
        }
    }

    public com.tencent.live2.jsplugin.V2TXJSAdapterError unInitLivePusher() {
        if (!this.mIsInit) {
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-3, "Uninit pusher failed, pusher is not initialized");
        }
        stopPushInner("Stop push call by inner, unInit pusher");
        this.mIsInit = false;
        this.mPusher.release();
        apiOnlineLog("Uninit pusher success", true);
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    public com.tencent.live2.jsplugin.V2TXJSAdapterError updateLivePusher(android.os.Bundle bundle) {
        if (bundle == null) {
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-1, "Update pusher params failed, params is null.");
        }
        if (!this.mIsInit) {
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-3, "Update pusher params failed, pusher is not initialized");
        }
        apiOnlineLog("Update pusher params:" + bundle.toString(), false);
        com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig v2TXLivePusherJSConfig = new com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig(this.mConfig);
        v2TXLivePusherJSConfig.updateFromBundle(bundle);
        if (android.text.TextUtils.isEmpty(v2TXLivePusherJSConfig.url) || v2TXLivePusherJSConfig.url.equals(this.mConfig.url)) {
            if (this.mPusher != null) {
                setDiffParam(this.mConfig, v2TXLivePusherJSConfig);
            } else {
                apiOnlineError("Pusher is not initialized, ignore set diff param", false);
            }
            this.mConfig = v2TXLivePusherJSConfig;
        } else {
            com.tencent.live2.jsplugin.JSAdapterOnlineLog.getInstance().updateUrl("");
            apiOnlineLog("Url has been updated，new url:" + v2TXLivePusherJSConfig.url, false);
            stopPushInner("Stop push call by inner, url is changed");
            createPusherInstance(v2TXLivePusherJSConfig.url);
            setFullParam(v2TXLivePusherJSConfig);
            this.mConfig = v2TXLivePusherJSConfig;
            if (v2TXLivePusherJSConfig.isAutoPush) {
                apiOnlineLog("Update pusher params:[auto push is true, url is changed], need to start auto push", false);
                startPushInner(v2TXLivePusherJSConfig.url);
            }
        }
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    private com.tencent.live2.jsplugin.V2TXJSAdapterError getMaxZoom(org.json.JSONObject jSONObject) {
        com.tencent.live2.V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher == null) {
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-3, "Get max zoom failed, pusher is not initialized");
        }
        float cameraZoomMaxRatio = v2TXLivePusher.getDeviceManager().getCameraZoomMaxRatio();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("maxZoom", java.lang.Float.valueOf(cameraZoomMaxRatio));
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError(0, hashMap);
    }

    public com.tencent.live2.jsplugin.V2TXJSAdapterError initLivePusher(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, android.os.Bundle bundle) {
        if (tXCloudVideoView == null) {
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-1, "Init pusher failed, view is null");
        }
        return initLivePusherInner(tXCloudVideoView, bundle);
    }

    private com.tencent.live2.jsplugin.V2TXJSAdapterError setZoom(org.json.JSONObject jSONObject) {
        this.mPusher.getDeviceManager().setCameraZoomRatio((float) (jSONObject != null ? jSONObject.optDouble(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ZOOM, 1.0d) : 1.0d));
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    private void sendEventNotify(int i17, org.json.JSONObject jSONObject, boolean z17) {
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
        apiOnlineLog(sb6.toString(), false);
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
            com.tencent.rtmp.ITXLivePushListener iTXLivePushListener = this.mLivePushListener;
            if (iTXLivePushListener != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString(com.tencent.rtmp.TXLiveConstants.EVT_DESCRIPTION, jSONObject2);
                apiOnlineLog("OnPushEvent: event[" + i17 + "], msg[" + bundle.toString() + "]", false);
                iTXLivePushListener.onPushEvent(i17, bundle);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    private void createPusherInstance(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        int ordinal = com.tencent.live2.impl.V2TXLiveUtils.parseLiveMode(str).ordinal();
        if (str.startsWith(com.tencent.live2.impl.V2TXLiveUtils.TRTC_ADDRESS1) || str.startsWith(com.tencent.live2.impl.V2TXLiveUtils.TRTC_ADDRESS2)) {
            ordinal = 102;
        }
        com.tencent.live2.jsplugin.JSAdapterOnlineLog.getInstance().updateUrl(str);
        createPusherInstance(ordinal);
    }
}
