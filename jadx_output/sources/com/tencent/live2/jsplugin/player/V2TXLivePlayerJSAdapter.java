package com.tencent.live2.jsplugin.player;

/* loaded from: classes16.dex */
public class V2TXLivePlayerJSAdapter extends com.tencent.live2.impl.a.a {
    private static final int FRAMEWORK_TYPE_LIVEV2_WXAPPLET = 9;
    private static final int FRAMEWORK_TYPE_WXROOM_WXAPPLET = 3;
    private static final java.lang.String ROOM_PROTOCOL_PREFIX = "room";
    private static final java.lang.String TAG = "applet-player-api";
    private byte _hellAccFlag_;
    private com.tencent.rtmp.TXLivePlayer.ITXAudioVolumeEvaluationListener mAudioVolumeListener;
    private com.tencent.live2.jsplugin.player.V2TXLivePlayerJSConfig mConfig;
    private boolean mIsInit;
    private boolean mNeedCompressSnapshot;
    private int mNetworkQuality;
    private com.tencent.rtmp.ITXLivePlayListener mPlayListener;
    private com.tencent.live2.V2TXLiveDef.V2TXLiveMode mPlayMode;
    private com.tencent.live2.V2TXLivePlayer mPlayer;
    private com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener mSnapshotListener;
    private java.lang.String mPlayerId = "";
    private java.lang.String mTraceId = "";

    static {
        com.tencent.liteav.base.util.q.a();
    }

    public V2TXLivePlayerJSAdapter(android.content.Context context) {
        com.tencent.liteav.base.ContextUtils.initApplicationContext(context.getApplicationContext());
        com.tencent.liteav.base.ContextUtils.setDataDirectorySuffix("liteav");
        com.tencent.live2.impl.V2TXLivePlayerImpl v2TXLivePlayerImpl = new com.tencent.live2.impl.V2TXLivePlayerImpl(context);
        this.mPlayer = v2TXLivePlayerImpl;
        v2TXLivePlayerImpl.setObserver(this);
        this.mNetworkQuality = 2;
        this.mConfig = new com.tencent.live2.jsplugin.player.V2TXLivePlayerJSConfig();
    }

    private void apiOnlineError(java.lang.String str, boolean z17) {
        if (str == null) {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(this.mTraceId)) {
            this.mTraceId = java.lang.String.valueOf(hashCode()).substring(java.lang.String.valueOf(hashCode()).length() - 4);
        }
        if (!z17 || !checkIsRoomProtocolByUrl(this.mConfig.url)) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "[" + this.mTraceId + "][" + this.mPlayerId + "] " + str);
            return;
        }
        com.tencent.live2.jsplugin.JSAdapterOnlineLog.getInstance().log("[applet-player-api][" + this.mTraceId + "][" + this.mPlayerId + "] " + str, true);
    }

    private void apiOnlineLog(java.lang.String str, boolean z17) {
        if (str == null) {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(this.mTraceId)) {
            this.mTraceId = java.lang.String.valueOf(hashCode()).substring(java.lang.String.valueOf(hashCode()).length() - 4);
        }
        if (!z17 || !checkIsRoomProtocolByUrl(this.mConfig.url)) {
            com.tencent.liteav.base.util.LiteavLog.i(TAG, "[" + this.mTraceId + "][" + this.mPlayerId + "] " + str);
            return;
        }
        com.tencent.live2.jsplugin.JSAdapterOnlineLog.getInstance().log("[applet-player-api][" + this.mTraceId + "][" + this.mPlayerId + "] " + str, true);
    }

    private void callbackSDKVersion() {
        com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener = this.mPlayListener;
        if (iTXLivePlayListener != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.tencent.rtmp.TXLiveConstants.EVT_DESCRIPTION, com.tencent.rtmp.TXLiveBase.getSDKVersionStr());
            bundle.putLong("EVT_TIME", java.lang.System.currentTimeMillis());
            apiOnlineLog("OnPlayEvent: event[-9999999], msg[" + bundle.toString() + "]", false);
            iTXLivePlayListener.onPlayEvent(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.EVT_ID_SDK_VERSION, bundle);
        }
    }

    private boolean checkIsRoomProtocolByUrl(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && str.startsWith(ROOM_PROTOCOL_PREFIX);
    }

    private java.lang.String getPlayerIdByURL(java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return "";
            }
            if (!str.startsWith(com.tencent.live2.impl.V2TXLiveUtils.TRTC_ADDRESS1) && !str.startsWith(com.tencent.live2.impl.V2TXLiveUtils.TRTC_ADDRESS2)) {
                return com.tencent.live2.jsplugin.LiveURLParser.getStreamId(str);
            }
            return com.tencent.live2.jsplugin.LiveURLParser.getURLParams(str, "userid");
        } catch (java.lang.Exception unused) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "Get streamId failed, url:".concat(java.lang.String.valueOf(str)));
            return "";
        }
    }

    private com.tencent.live2.jsplugin.V2TXJSAdapterError initLivePlayerInner(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, android.os.Bundle bundle) {
        if (bundle == null) {
            apiOnlineError("Init player failed, params is null", false);
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-1, "Init player failed, params is null");
        }
        if (this.mIsInit) {
            apiOnlineError("Init player failed, player has been initialized", false);
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-1, "Init player failed, player has been initialized");
        }
        if (tXCloudVideoView != null) {
            this.mPlayer.setRenderView(tXCloudVideoView);
        }
        apiOnlineLog("Init player success", false);
        this.mIsInit = true;
        this.mConfig.updateFromBundle(bundle);
        this.mPlayerId = getPlayerIdByURL(this.mConfig.url);
        setFullParams(this.mConfig);
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    private void setDiffParams(com.tencent.live2.jsplugin.player.V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig, com.tencent.live2.jsplugin.player.V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig2) {
        java.lang.String diffConfig = v2TXLivePlayerJSConfig2.diffConfig(v2TXLivePlayerJSConfig);
        if (!android.text.TextUtils.isEmpty(diffConfig)) {
            apiOnlineLog("Set diff config:".concat(java.lang.String.valueOf(diffConfig)), true);
        }
        boolean z17 = v2TXLivePlayerJSConfig.isMuteVideo;
        boolean z18 = v2TXLivePlayerJSConfig2.isMuteVideo;
        if (z17 != z18) {
            if (z18) {
                this.mPlayer.pauseVideo();
            } else {
                this.mPlayer.resumeVideo();
            }
        }
        boolean z19 = v2TXLivePlayerJSConfig.isMuteAudio;
        boolean z27 = v2TXLivePlayerJSConfig2.isMuteAudio;
        if (z19 != z27) {
            if (z27) {
                this.mPlayer.pauseAudio();
            } else {
                this.mPlayer.resumeAudio();
            }
        }
        boolean z28 = v2TXLivePlayerJSConfig.enableRecvSEIMessage;
        boolean z29 = v2TXLivePlayerJSConfig2.enableRecvSEIMessage;
        if (z28 != z29) {
            this.mPlayer.enableReceiveSeiMessage(z29, 5);
            this.mPlayer.enableReceiveSeiMessage(v2TXLivePlayerJSConfig2.enableRecvSEIMessage, 100);
            this.mPlayer.enableReceiveSeiMessage(v2TXLivePlayerJSConfig2.enableRecvSEIMessage, 242);
            this.mPlayer.enableReceiveSeiMessage(v2TXLivePlayerJSConfig2.enableRecvSEIMessage, 243);
        }
        boolean z37 = v2TXLivePlayerJSConfig.enableDebugView;
        boolean z38 = v2TXLivePlayerJSConfig2.enableDebugView;
        if (z37 != z38) {
            this.mPlayer.showDebugView(z38);
        }
        float f17 = v2TXLivePlayerJSConfig.minCache;
        float f18 = v2TXLivePlayerJSConfig2.minCache;
        if (f17 != f18 || v2TXLivePlayerJSConfig.maxCache != v2TXLivePlayerJSConfig2.maxCache) {
            this.mPlayer.setCacheParams(java.lang.Math.min(f18, v2TXLivePlayerJSConfig2.maxCache), java.lang.Math.max(v2TXLivePlayerJSConfig2.minCache, v2TXLivePlayerJSConfig2.maxCache));
        }
        int i17 = v2TXLivePlayerJSConfig.volumeNotifyIntervals;
        int i18 = v2TXLivePlayerJSConfig2.volumeNotifyIntervals;
        if (i17 != i18) {
            this.mPlayer.enableVolumeEvaluation(i18);
        }
        com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode = v2TXLivePlayerJSConfig.fillMode;
        com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode2 = v2TXLivePlayerJSConfig2.fillMode;
        if (v2TXLiveFillMode != v2TXLiveFillMode2) {
            this.mPlayer.setRenderFillMode(v2TXLiveFillMode2);
        }
        com.tencent.live2.V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation = v2TXLivePlayerJSConfig.renderRotation;
        com.tencent.live2.V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation2 = v2TXLivePlayerJSConfig2.renderRotation;
        if (v2TXLiveRotation != v2TXLiveRotation2) {
            this.mPlayer.setRenderRotation(v2TXLiveRotation2);
        }
        int i19 = v2TXLivePlayerJSConfig.audioRoute;
        int i27 = v2TXLivePlayerJSConfig2.audioRoute;
        if (i19 != i27) {
            this.mPlayer.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetAudioRoute, java.lang.Integer.valueOf(i27));
        }
        if (!android.text.TextUtils.isEmpty(v2TXLivePlayerJSConfig2.url) && !v2TXLivePlayerJSConfig2.url.equals(v2TXLivePlayerJSConfig.url) && v2TXLivePlayerJSConfig2.isCanAutoPlay && v2TXLivePlayerJSConfig2.isAutoPlay) {
            if (this.mPlayer.isPlaying() == 1) {
                apiOnlineLog("Set diff config:[auto play is true, url is changed, player is playing], need to stop play", false);
                this.mPlayer.stopPlay();
            }
            apiOnlineLog("Set diff config:[auto play is true, url is changed, player is not playing], need to start auto play", false);
            startPlayInner(v2TXLivePlayerJSConfig2.url, v2TXLivePlayerJSConfig2.mode);
        }
        if (!v2TXLivePlayerJSConfig2.isAutoPlay || !v2TXLivePlayerJSConfig2.isCanAutoPlay || android.text.TextUtils.isEmpty(v2TXLivePlayerJSConfig2.url) || this.mPlayer.isPlaying() == 1) {
            return;
        }
        apiOnlineLog("Set diff config:[auto play is true, url is not empty, player is not playing], need to start auto play", false);
        startPlayInner(v2TXLivePlayerJSConfig2.url, v2TXLivePlayerJSConfig2.mode);
    }

    private void setFullParams(com.tencent.live2.jsplugin.player.V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig) {
        apiOnlineLog("Set full config:".concat(java.lang.String.valueOf(v2TXLivePlayerJSConfig)), true);
        if (v2TXLivePlayerJSConfig.isMuteVideo) {
            this.mPlayer.pauseVideo();
        } else {
            this.mPlayer.resumeVideo();
        }
        if (v2TXLivePlayerJSConfig.isMuteAudio) {
            this.mPlayer.pauseAudio();
        } else {
            this.mPlayer.resumeAudio();
        }
        this.mPlayer.enableReceiveSeiMessage(v2TXLivePlayerJSConfig.enableRecvSEIMessage, 5);
        this.mPlayer.enableReceiveSeiMessage(v2TXLivePlayerJSConfig.enableRecvSEIMessage, 100);
        this.mPlayer.enableReceiveSeiMessage(v2TXLivePlayerJSConfig.enableRecvSEIMessage, 242);
        this.mPlayer.enableReceiveSeiMessage(v2TXLivePlayerJSConfig.enableRecvSEIMessage, 243);
        this.mPlayer.showDebugView(v2TXLivePlayerJSConfig.enableDebugView);
        this.mPlayer.setCacheParams(java.lang.Math.min(v2TXLivePlayerJSConfig.minCache, v2TXLivePlayerJSConfig.maxCache), java.lang.Math.max(v2TXLivePlayerJSConfig.minCache, v2TXLivePlayerJSConfig.maxCache));
        this.mPlayer.enableVolumeEvaluation(v2TXLivePlayerJSConfig.volumeNotifyIntervals);
        this.mPlayer.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetAudioRoute, java.lang.Integer.valueOf(v2TXLivePlayerJSConfig.audioRoute));
        this.mPlayer.setRenderFillMode(v2TXLivePlayerJSConfig.fillMode);
        this.mPlayer.setRenderRotation(v2TXLivePlayerJSConfig.renderRotation);
        com.tencent.live2.jsplugin.player.V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig2 = this.mConfig;
        if (v2TXLivePlayerJSConfig2.isCanAutoPlay && v2TXLivePlayerJSConfig2.isAutoPlay && !android.text.TextUtils.isEmpty(v2TXLivePlayerJSConfig2.url)) {
            if (this.mPlayer.isPlaying() == 1) {
                this.mPlayer.stopPlay();
                apiOnlineError("Set full config:[auto play is true, player is playing], need to stop play", false);
            }
            apiOnlineLog("Set full config:[auto play is true, url is not empty, player is not playing], need to start auto play", false);
            com.tencent.live2.jsplugin.player.V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig3 = this.mConfig;
            startPlayInner(v2TXLivePlayerJSConfig3.url, v2TXLivePlayerJSConfig3.mode);
        }
    }

    private void startPlayInner(java.lang.String str, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            apiOnlineError("Start play failed, url is empty", false);
            return;
        }
        int i18 = i17 == 1 ? ((str.startsWith("http://") || str.startsWith("https://")) && str.contains(".flv")) ? 1 : 0 : 5;
        apiOnlineLog("Start play,[url:" + str + "][type:" + i18 + "]", false);
        this.mPlayMode = com.tencent.live2.impl.V2TXLiveUtils.parseLiveMode(str);
        this.mPlayer.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2EnableRTMPAcc, java.lang.Boolean.valueOf(i18 == 5));
        int i19 = (str.startsWith(com.tencent.live2.impl.V2TXLiveUtils.TRTC_ADDRESS1) || str.startsWith(com.tencent.live2.impl.V2TXLiveUtils.TRTC_ADDRESS2)) ? 3 : str.startsWith("trtc://") ? 9 : 0;
        if (i19 > 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(com.tencent.shadow.core.common.HostConstants.FRAMEWORK_APPID, i19);
                jSONObject.put("component", 0);
            } catch (org.json.JSONException unused) {
            }
            this.mPlayer.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetFramework, jSONObject.toString());
        }
        this.mPlayer.startLivePlay(str);
    }

    public com.tencent.live2.jsplugin.V2TXJSAdapterError initLivePlayer(android.os.Bundle bundle) {
        callbackSDKVersion();
        return initLivePlayerInner(null, bundle);
    }

    public boolean isMuted() {
        return this.mConfig.isMuteAudio;
    }

    public boolean isPlaying() {
        return this.mPlayer.isPlaying() == 1;
    }

    @Override // com.tencent.live2.impl.a.a
    public void onNetworkQuality(int i17) {
        this.mNetworkQuality = i17;
    }

    @Override // com.tencent.live2.impl.a.a
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener = this.mPlayListener;
        if (iTXLivePlayListener != null) {
            apiOnlineLog("OnPlayEvent: event[" + i17 + "], msg[" + bundle.toString() + "]", false);
            iTXLivePlayListener.onPlayEvent(i17, bundle);
        }
    }

    @Override // com.tencent.live2.impl.a.a
    public void onPlayNetStatus(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.putInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_QUALITY_LEVEL, this.mNetworkQuality);
        }
        com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener = this.mPlayListener;
        if (iTXLivePlayListener != null) {
            iTXLivePlayListener.onNetStatus(bundle);
        }
    }

    @Override // com.tencent.live2.V2TXLivePlayerObserver
    public void onPlayoutVolumeUpdate(com.tencent.live2.V2TXLivePlayer v2TXLivePlayer, int i17) {
        com.tencent.rtmp.TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener = this.mAudioVolumeListener;
        if (iTXAudioVolumeEvaluationListener != null) {
            iTXAudioVolumeEvaluationListener.onAudioVolumeEvaluationNotify(i17);
        }
    }

    @Override // com.tencent.live2.V2TXLivePlayerObserver
    public void onReceiveSeiMessage(com.tencent.live2.V2TXLivePlayer v2TXLivePlayer, int i17, byte[] bArr) {
        com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener = this.mPlayListener;
        if (iTXLivePlayListener == null || !this.mConfig.enableRecvSEIMessage || bArr.length <= 0) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            bundle.putString(com.tencent.rtmp.TXLiveConstants.EVT_DESCRIPTION, new java.lang.String(bArr, com.tencent.mapsdk.internal.rv.f51270c));
        } catch (java.io.UnsupportedEncodingException unused) {
        }
        iTXLivePlayListener.onPlayEvent(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_MESSAGE, bundle);
    }

    @Override // com.tencent.live2.V2TXLivePlayerObserver
    public void onSnapshotComplete(com.tencent.live2.V2TXLivePlayer v2TXLivePlayer, android.graphics.Bitmap bitmap) {
        com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener iTXSnapshotListener = this.mSnapshotListener;
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
        yj0.a.d(obj, aVar.b(), "com/tencent/live2/jsplugin/player/V2TXLivePlayerJSAdapter", "onSnapshotComplete", "(Lcom/tencent/live2/V2TXLivePlayer;Landroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/live2/jsplugin/player/V2TXLivePlayerJSAdapter", "onSnapshotComplete", "(Lcom/tencent/live2/V2TXLivePlayer;Landroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        iTXSnapshotListener.onSnapshot(createBitmap);
        if (createBitmap == null || createBitmap.isRecycled()) {
            return;
        }
        createBitmap.recycle();
    }

    public com.tencent.live2.jsplugin.V2TXJSAdapterError operateLivePlayer(java.lang.String str, org.json.JSONObject jSONObject) {
        java.lang.String optString;
        boolean z17 = false;
        if (android.text.TextUtils.isEmpty(str)) {
            apiOnlineError("Call operate failed, operate name is null", false);
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-1, "Call operate failed, operate name is null");
        }
        boolean z18 = str.equals("start") || str.equals("stop") || str.equals("resume") || str.equals("pause") || str.equals("mute");
        if (!this.mIsInit) {
            apiOnlineError("Call operate failed, player is not initialized, operate name:".concat(str), z18);
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-3, "Call operate failed, player is not initialized");
        }
        if (z18) {
            apiOnlineLog("Call operate [name:" + str + "]", true);
        }
        if (str.equalsIgnoreCase(com.tencent.tav.core.AssetExtension.SCENE_PLAY)) {
            com.tencent.live2.jsplugin.player.V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig = this.mConfig;
            startPlayInner(v2TXLivePlayerJSConfig.url, v2TXLivePlayerJSConfig.mode);
        } else if (str.equalsIgnoreCase("stop")) {
            this.mPlayer.stopPlay();
        } else if (str.equalsIgnoreCase("pause")) {
            this.mPlayer.pauseAudio();
            this.mPlayer.pauseVideo();
        } else if (str.equalsIgnoreCase("resume")) {
            if (!this.mConfig.isMuteAudio) {
                this.mPlayer.resumeAudio();
            }
            this.mPlayer.resumeVideo();
        } else if (str.equalsIgnoreCase("mute")) {
            com.tencent.live2.jsplugin.player.V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig2 = this.mConfig;
            boolean z19 = !v2TXLivePlayerJSConfig2.isMuteAudio;
            v2TXLivePlayerJSConfig2.isMuteAudio = z19;
            if (z19) {
                this.mPlayer.pauseAudio();
            } else {
                this.mPlayer.resumeAudio();
            }
        } else {
            if (!str.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.j0.f78445f)) {
                return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-4, "Call operate failed, invalid operate name:".concat(str));
            }
            if (jSONObject != null && (optString = jSONObject.optString("quality")) != null && optString.equalsIgnoreCase("compressed")) {
                z17 = true;
            }
            takePhoto(z17, this.mSnapshotListener);
        }
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    public void setAudioVolumeListener(com.tencent.rtmp.TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.mAudioVolumeListener = iTXAudioVolumeEvaluationListener;
    }

    public void setPlayListener(com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener) {
        this.mPlayListener = iTXLivePlayListener;
    }

    public void setSnapshotListener(com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        this.mSnapshotListener = iTXSnapshotListener;
    }

    public com.tencent.live2.jsplugin.V2TXJSAdapterError setSurface(android.view.Surface surface) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Set surface:");
        sb6.append(surface != null ? java.lang.Integer.valueOf(surface.hashCode()) : "0");
        apiOnlineLog(sb6.toString(), false);
        this.mPlayer.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurface, surface);
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    public com.tencent.live2.jsplugin.V2TXJSAdapterError setSurfaceSize(int i17, int i18) {
        apiOnlineLog("Set surface size [width:" + i17 + "][height:" + i18 + "]", false);
        this.mPlayer.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurfaceSize, new com.tencent.live2.impl.V2TXLiveDefInner.SurfaceSize(i17, i18));
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    public void takePhoto(boolean z17, com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        this.mNeedCompressSnapshot = z17;
        this.mSnapshotListener = iTXSnapshotListener;
        int snapshot = this.mPlayer.snapshot();
        apiOnlineLog("Snapshot, image compress:".concat(java.lang.String.valueOf(z17)), false);
        com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener = this.mPlayListener;
        if (iTXLivePlayListener == null || snapshot == 0) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        apiOnlineLog("OnPlayEvent: event[-3], msg[" + bundle.toString() + "]", false);
        iTXLivePlayListener.onPlayEvent(-3, bundle);
    }

    public com.tencent.live2.jsplugin.V2TXJSAdapterError uninitLivePlayer() {
        if (!this.mIsInit) {
            apiOnlineError("Uninit player failed, player is not initialized", false);
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-3, "Uninit player failed, player is not initialized");
        }
        apiOnlineLog("Uninit player success", false);
        this.mIsInit = false;
        this.mPlayer.stopPlay();
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    public com.tencent.live2.jsplugin.V2TXJSAdapterError updateLivePlayer(android.os.Bundle bundle) {
        if (bundle == null) {
            apiOnlineError("Update player params failed, params is null", false);
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-1, "Update player params failed, params is null");
        }
        if (!this.mIsInit) {
            apiOnlineError("Update player params failed, player not initialized", false);
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-3, "Update player params failed, player not initialized");
        }
        com.tencent.live2.jsplugin.player.V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig = new com.tencent.live2.jsplugin.player.V2TXLivePlayerJSConfig(this.mConfig);
        v2TXLivePlayerJSConfig.updateFromBundle(bundle);
        setDiffParams(this.mConfig, v2TXLivePlayerJSConfig);
        if (!android.text.TextUtils.isEmpty(v2TXLivePlayerJSConfig.url) && !v2TXLivePlayerJSConfig.url.equals(this.mConfig.url)) {
            this.mPlayerId = getPlayerIdByURL(v2TXLivePlayerJSConfig.url);
        }
        this.mConfig = v2TXLivePlayerJSConfig;
        return new com.tencent.live2.jsplugin.V2TXJSAdapterError();
    }

    public com.tencent.live2.jsplugin.V2TXJSAdapterError initLivePlayer(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, android.os.Bundle bundle) {
        if (tXCloudVideoView == null) {
            return new com.tencent.live2.jsplugin.V2TXJSAdapterError(-1, "Init player failed, view is null");
        }
        return initLivePlayerInner(tXCloudVideoView, bundle);
    }
}
