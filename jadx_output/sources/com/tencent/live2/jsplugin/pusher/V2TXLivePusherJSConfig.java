package com.tencent.live2.jsplugin.pusher;

/* loaded from: classes16.dex */
public class V2TXLivePusherJSConfig {
    private static final com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType[] REVERB_TYPES = {com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0, com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_1, com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_2, com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_3, com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_4, com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_5, com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_6, com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_7};
    private static final com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType[] VOICE_CHANGER_TYPES = {com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0, com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_1, com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_2, com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_3, com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_4, com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_5, com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_6, com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_7, com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_8, com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_9, com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_10, com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_11};
    public int aspect;
    public com.tencent.live2.V2TXLiveDef.V2TXLiveAudioQuality audioQuality;
    public java.lang.String backgroundImagePath;
    public int beautyLevel;
    public int beautyStyle;
    public boolean enableAGC;
    public boolean enableANS;
    public boolean enableAutoFocus;
    public boolean enableBGMEventCallback;
    public boolean enableCamera;
    public boolean enableDebugView;
    public boolean enableEarMonitor;
    public boolean enableMicrophone;
    public boolean enableRemoteMirror;
    public boolean enableZoom;
    public java.lang.String filterImagePath;
    public int fps;
    public int height;
    public boolean isAutoPush;
    public boolean isFrontCamera;
    public boolean isMuteAudio;
    public boolean isVOIP;
    public boolean isVerticalOrientation;
    public int maxBitrate;
    public int minBitrate;
    public com.tencent.live2.V2TXLiveDef.V2TXLiveMirrorType mirrorType;
    public int mode;
    public com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType reverbType;
    public java.lang.String url;
    public com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType voiceChangerType;
    public int volumeNotifyIntervals;
    public com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType volumeType;
    public java.lang.String watermarkImagePath;
    public float watermarkLeft;
    public float watermarkTop;
    public float watermarkWidth;
    public int whitenessLevel;
    public int width;

    public V2TXLivePusherJSConfig() {
        this.url = "";
        this.mode = 1;
        this.isAutoPush = false;
        this.enableBGMEventCallback = false;
        this.enableDebugView = false;
        this.isVOIP = false;
        this.enableCamera = true;
        this.isFrontCamera = true;
        this.isVerticalOrientation = true;
        this.enableAutoFocus = true;
        this.enableZoom = false;
        this.enableRemoteMirror = false;
        this.aspect = 2;
        this.width = 368;
        this.height = 640;
        this.minBitrate = 0;
        this.maxBitrate = 0;
        this.fps = 15;
        this.mirrorType = com.tencent.live2.V2TXLiveDef.V2TXLiveMirrorType.V2TXLiveMirrorTypeAuto;
        this.enableMicrophone = true;
        this.isMuteAudio = false;
        this.enableAGC = false;
        this.enableANS = false;
        this.enableEarMonitor = false;
        this.volumeNotifyIntervals = 0;
        this.volumeType = com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto;
        this.reverbType = com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0;
        this.voiceChangerType = com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0;
        this.audioQuality = com.tencent.live2.V2TXLiveDef.V2TXLiveAudioQuality.V2TXLiveAudioQualityDefault;
        this.beautyStyle = 0;
        this.beautyLevel = 5;
        this.whitenessLevel = 3;
        this.watermarkImagePath = "";
        this.watermarkTop = 0.0f;
        this.watermarkLeft = 0.0f;
        this.watermarkWidth = 0.1f;
        this.backgroundImagePath = "";
    }

    public java.lang.String diffConfig(com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig v2TXLivePusherJSConfig) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (this.url != v2TXLivePusherJSConfig.url) {
            sb6.append("[url:" + com.tencent.live2.impl.V2TXLiveUtils.removeURLSensitiveInfo(this.url) + "]");
        }
        if (this.mode != v2TXLivePusherJSConfig.mode) {
            sb6.append("[mode:" + this.mode + "]");
        }
        if (this.isVOIP != v2TXLivePusherJSConfig.isVOIP) {
            sb6.append("[isVOIP:" + this.isVOIP + "]");
        }
        if (this.enableCamera != v2TXLivePusherJSConfig.enableCamera) {
            sb6.append("[enableCamera:" + this.enableCamera + "]");
        }
        if (this.isFrontCamera != v2TXLivePusherJSConfig.isFrontCamera) {
            sb6.append("[isFrontCamera:" + this.isFrontCamera + "]");
        }
        if (this.isVerticalOrientation != v2TXLivePusherJSConfig.isVerticalOrientation) {
            sb6.append("[isVerticalOrientation:" + this.isVerticalOrientation + "]");
        }
        if (this.aspect != v2TXLivePusherJSConfig.aspect) {
            sb6.append("[aspect:" + this.aspect + "]");
        }
        if (this.width != v2TXLivePusherJSConfig.width) {
            sb6.append("[width:" + this.width + "]");
        }
        if (this.height != v2TXLivePusherJSConfig.height) {
            sb6.append("[height:" + this.height + "]");
        }
        if (this.minBitrate != v2TXLivePusherJSConfig.minBitrate) {
            sb6.append("[minBitrate:" + this.minBitrate + "]");
        }
        if (this.maxBitrate != v2TXLivePusherJSConfig.maxBitrate) {
            sb6.append("[maxBitrate:" + this.maxBitrate + "]");
        }
        if (this.fps != v2TXLivePusherJSConfig.fps) {
            sb6.append("[fps:" + this.fps + "]");
        }
        if (this.enableMicrophone != v2TXLivePusherJSConfig.enableMicrophone) {
            sb6.append("[enableMicrophone:" + this.enableMicrophone + "]");
        }
        if (this.isMuteAudio != v2TXLivePusherJSConfig.isMuteAudio) {
            sb6.append("[isMuteAudio:" + this.isMuteAudio + "]");
        }
        if (this.enableAGC != v2TXLivePusherJSConfig.enableAGC) {
            sb6.append("[enableAGC:" + this.enableAGC + "]");
        }
        if (this.enableANS != v2TXLivePusherJSConfig.enableANS) {
            sb6.append("[enableANS:" + this.enableANS + "]");
        }
        if (this.enableEarMonitor != v2TXLivePusherJSConfig.enableEarMonitor) {
            sb6.append("[enableEarMonitor:" + this.enableEarMonitor + "]");
        }
        if (this.volumeType != v2TXLivePusherJSConfig.volumeType) {
            sb6.append("[volumeType:" + this.volumeType + "]");
        }
        if (this.reverbType != v2TXLivePusherJSConfig.reverbType) {
            sb6.append("[reverbType:" + this.reverbType + "]");
        }
        if (this.voiceChangerType != v2TXLivePusherJSConfig.voiceChangerType) {
            sb6.append("[voiceChangerType:" + this.voiceChangerType + "]");
        }
        if (this.audioQuality != v2TXLivePusherJSConfig.audioQuality) {
            sb6.append("[audioQuality:" + this.audioQuality + "]");
        }
        return sb6.toString();
    }

    public void parseAudioParam(android.os.Bundle bundle) {
        int i17;
        int i18;
        if (bundle.containsKey("muted")) {
            this.isMuteAudio = bundle.getBoolean("muted");
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_MIC)) {
            this.enableMicrophone = bundle.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_MIC);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_QUALITY)) {
            java.lang.String string = bundle.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_QUALITY, "");
            string.getClass();
            if (string.equals("low")) {
                this.audioQuality = com.tencent.live2.V2TXLiveDef.V2TXLiveAudioQuality.V2TXLiveAudioQualitySpeech;
            } else {
                this.audioQuality = com.tencent.live2.V2TXLiveDef.V2TXLiveAudioQuality.V2TXLiveAudioQualityDefault;
            }
        }
        if (bundle.containsKey("enableAGC")) {
            this.enableAGC = bundle.getBoolean("enableAGC");
        }
        if (bundle.containsKey("enableANS")) {
            this.enableANS = bundle.getBoolean("enableANS");
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_EAR_MONITOR)) {
            this.enableEarMonitor = bundle.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_EAR_MONITOR);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_VOLUME_TYPE)) {
            java.lang.String string2 = bundle.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_VOLUME_TYPE, "");
            string2.getClass();
            if (string2.equals("voicecall")) {
                this.volumeType = com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeVOIP;
            } else if (string2.equals("media")) {
                this.volumeType = com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeMedia;
            } else {
                this.volumeType = com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto;
            }
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_REVERB_TYPE) && (i18 = bundle.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_REVERB_TYPE)) >= 0) {
            com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType[] tXVoiceReverbTypeArr = REVERB_TYPES;
            if (i18 < tXVoiceReverbTypeArr.length) {
                this.reverbType = tXVoiceReverbTypeArr[i18];
            }
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_VOICE_CHANGER_TYPE) && (i17 = bundle.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_VOICE_CHANGER_TYPE)) >= 0) {
            com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType[] tXVoiceChangerTypeArr = VOICE_CHANGER_TYPES;
            if (i17 < tXVoiceChangerTypeArr.length) {
                this.voiceChangerType = tXVoiceChangerTypeArr[i17];
            }
        }
        if (bundle.containsKey("needAudioVolume")) {
            this.volumeNotifyIntervals = bundle.getBoolean("needAudioVolume") ? 300 : 0;
        }
    }

    public void parseBasicParam(android.os.Bundle bundle) {
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_PUSH_URL)) {
            this.url = bundle.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_PUSH_URL, "");
        }
        if (bundle.containsKey("mode")) {
            this.mode = bundle.getInt("mode");
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUTO_PUSH)) {
            this.isAutoPush = bundle.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUTO_PUSH);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_NEED_BGM_EVENT)) {
            this.enableBGMEventCallback = bundle.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_NEED_BGM_EVENT);
        }
        if (bundle.containsKey("debug")) {
            this.enableDebugView = bundle.getBoolean("debug");
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.IS_VOIP)) {
            this.isVOIP = bundle.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.IS_VOIP);
        }
    }

    public void parseBeautyParam(android.os.Bundle bundle) {
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY_STYLE)) {
            java.lang.String string = bundle.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY_STYLE, "");
            string.getClass();
            if (string.equals("nature")) {
                this.beautyStyle = 1;
            } else {
                this.beautyStyle = 0;
            }
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY)) {
            this.beautyLevel = bundle.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WHITENESS)) {
            this.whitenessLevel = bundle.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WHITENESS);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE)) {
            this.filterImagePath = bundle.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, "");
        }
    }

    public void parseGasketParam(android.os.Bundle bundle) {
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE)) {
            this.backgroundImagePath = bundle.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE, "");
        }
    }

    public void parseVideoParam(android.os.Bundle bundle) {
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA)) {
            this.enableCamera = bundle.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION)) {
            this.isFrontCamera = !"back".equals(bundle.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION, ""));
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FOCUS_MODE)) {
            this.enableAutoFocus = bundle.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FOCUS_MODE) == 0;
        }
        if (bundle.containsKey("orientation")) {
            this.isVerticalOrientation = !"horizontal".equals(bundle.getString("orientation", ""));
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ZOOM)) {
            this.enableZoom = bundle.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ZOOM);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MIRROR)) {
            this.enableRemoteMirror = bundle.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MIRROR);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_REMOTE_MIRROR)) {
            this.enableRemoteMirror = bundle.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_REMOTE_MIRROR);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ASPECT)) {
            this.aspect = bundle.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ASPECT);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH)) {
            this.width = bundle.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT)) {
            this.height = bundle.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MIN_BITRATE)) {
            this.minBitrate = bundle.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MIN_BITRATE);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MAX_BITRATE)) {
            this.maxBitrate = bundle.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MAX_BITRATE);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS)) {
            this.fps = java.lang.Math.min(30, bundle.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS) > 0 ? bundle.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS) : 15);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_LOCAL_MIRROR)) {
            java.lang.String string = bundle.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_LOCAL_MIRROR, "");
            string.getClass();
            if (string.equals("enable")) {
                this.mirrorType = com.tencent.live2.V2TXLiveDef.V2TXLiveMirrorType.V2TXLiveMirrorTypeEnable;
            } else if (string.equals("disable")) {
                this.mirrorType = com.tencent.live2.V2TXLiveDef.V2TXLiveMirrorType.V2TXLiveMirrorTypeDisable;
            } else {
                this.mirrorType = com.tencent.live2.V2TXLiveDef.V2TXLiveMirrorType.V2TXLiveMirrorTypeAuto;
            }
        }
    }

    public void parseWatermarkParam(android.os.Bundle bundle) {
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_IMAGE)) {
            this.watermarkImagePath = bundle.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_IMAGE, "");
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_LEFT)) {
            this.watermarkLeft = bundle.getFloat(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_LEFT);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_TOP)) {
            this.watermarkTop = bundle.getFloat(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_TOP);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_WIDTH)) {
            this.watermarkWidth = bundle.getFloat(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_WIDTH);
        }
    }

    public java.lang.String toString() {
        return "[url:" + com.tencent.live2.impl.V2TXLiveUtils.removeURLSensitiveInfo(this.url) + "][mode:" + this.mode + "][isVOIP:" + this.isVOIP + "][isAutoPush:" + this.isAutoPush + "][enableCamera:" + this.enableCamera + "][isVerticalOrientation:" + this.isVerticalOrientation + "][aspect:" + this.aspect + "][width:" + this.width + "][height:" + this.height + "][minBitrate:" + this.minBitrate + "][maxBitrate:" + this.maxBitrate + "][fps:" + this.fps + "][enableMicrophone:" + this.enableMicrophone + "][isMuteAudio:" + this.isMuteAudio + "][enableAGC:" + this.enableAGC + "][enableANS:" + this.enableANS + "][enableEarMonitor:" + this.enableEarMonitor + "][volumeType:" + this.volumeType + "][audioQuality:" + this.audioQuality + ']';
    }

    public void updateFromBundle(android.os.Bundle bundle) {
        parseBasicParam(bundle);
        parseVideoParam(bundle);
        parseAudioParam(bundle);
        parseBeautyParam(bundle);
        parseWatermarkParam(bundle);
        parseGasketParam(bundle);
    }

    public V2TXLivePusherJSConfig(com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig v2TXLivePusherJSConfig) {
        this.url = "";
        this.mode = 1;
        this.isAutoPush = false;
        this.enableBGMEventCallback = false;
        this.enableDebugView = false;
        this.isVOIP = false;
        this.enableCamera = true;
        this.isFrontCamera = true;
        this.isVerticalOrientation = true;
        this.enableAutoFocus = true;
        this.enableZoom = false;
        this.enableRemoteMirror = false;
        this.aspect = 2;
        this.width = 368;
        this.height = 640;
        this.minBitrate = 0;
        this.maxBitrate = 0;
        this.fps = 15;
        this.mirrorType = com.tencent.live2.V2TXLiveDef.V2TXLiveMirrorType.V2TXLiveMirrorTypeAuto;
        this.enableMicrophone = true;
        this.isMuteAudio = false;
        this.enableAGC = false;
        this.enableANS = false;
        this.enableEarMonitor = false;
        this.volumeNotifyIntervals = 0;
        this.volumeType = com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto;
        this.reverbType = com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0;
        this.voiceChangerType = com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0;
        this.audioQuality = com.tencent.live2.V2TXLiveDef.V2TXLiveAudioQuality.V2TXLiveAudioQualityDefault;
        this.beautyStyle = 0;
        this.beautyLevel = 5;
        this.whitenessLevel = 3;
        this.watermarkImagePath = "";
        this.watermarkTop = 0.0f;
        this.watermarkLeft = 0.0f;
        this.watermarkWidth = 0.1f;
        this.backgroundImagePath = "";
        this.url = v2TXLivePusherJSConfig.url;
        this.mode = v2TXLivePusherJSConfig.mode;
        this.isAutoPush = v2TXLivePusherJSConfig.isAutoPush;
        this.enableBGMEventCallback = v2TXLivePusherJSConfig.enableBGMEventCallback;
        this.enableDebugView = v2TXLivePusherJSConfig.enableDebugView;
        this.isVOIP = v2TXLivePusherJSConfig.isVOIP;
        this.enableCamera = v2TXLivePusherJSConfig.enableCamera;
        this.isFrontCamera = v2TXLivePusherJSConfig.isFrontCamera;
        this.enableAutoFocus = v2TXLivePusherJSConfig.enableAutoFocus;
        this.isVerticalOrientation = v2TXLivePusherJSConfig.isVerticalOrientation;
        this.enableZoom = v2TXLivePusherJSConfig.enableZoom;
        this.enableRemoteMirror = v2TXLivePusherJSConfig.enableRemoteMirror;
        this.aspect = v2TXLivePusherJSConfig.aspect;
        this.width = v2TXLivePusherJSConfig.width;
        this.height = v2TXLivePusherJSConfig.height;
        this.minBitrate = v2TXLivePusherJSConfig.minBitrate;
        this.maxBitrate = v2TXLivePusherJSConfig.maxBitrate;
        this.fps = v2TXLivePusherJSConfig.fps;
        this.mirrorType = v2TXLivePusherJSConfig.mirrorType;
        this.enableMicrophone = v2TXLivePusherJSConfig.enableMicrophone;
        this.isMuteAudio = v2TXLivePusherJSConfig.isMuteAudio;
        this.enableAGC = v2TXLivePusherJSConfig.enableAGC;
        this.enableANS = v2TXLivePusherJSConfig.enableANS;
        this.enableEarMonitor = v2TXLivePusherJSConfig.enableEarMonitor;
        this.volumeNotifyIntervals = v2TXLivePusherJSConfig.volumeNotifyIntervals;
        this.volumeType = v2TXLivePusherJSConfig.volumeType;
        this.reverbType = v2TXLivePusherJSConfig.reverbType;
        this.voiceChangerType = v2TXLivePusherJSConfig.voiceChangerType;
        this.audioQuality = v2TXLivePusherJSConfig.audioQuality;
        this.beautyStyle = v2TXLivePusherJSConfig.beautyStyle;
        this.beautyLevel = v2TXLivePusherJSConfig.beautyLevel;
        this.whitenessLevel = v2TXLivePusherJSConfig.whitenessLevel;
        this.filterImagePath = v2TXLivePusherJSConfig.filterImagePath;
        this.watermarkImagePath = v2TXLivePusherJSConfig.watermarkImagePath;
        this.watermarkTop = v2TXLivePusherJSConfig.watermarkTop;
        this.watermarkLeft = v2TXLivePusherJSConfig.watermarkLeft;
        this.watermarkWidth = v2TXLivePusherJSConfig.watermarkWidth;
        this.backgroundImagePath = v2TXLivePusherJSConfig.backgroundImagePath;
    }
}
