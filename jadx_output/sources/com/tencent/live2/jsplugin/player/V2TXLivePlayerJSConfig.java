package com.tencent.live2.jsplugin.player;

/* loaded from: classes16.dex */
public class V2TXLivePlayerJSConfig {
    public static int sAudioRoute = com.tencent.liteav.device.TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone.ordinal();
    public int audioRoute;
    public boolean enableDebugView;
    public boolean enableRecvSEIMessage;
    public com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode fillMode;
    public boolean isAutoPlay;
    public boolean isCanAutoPlay;
    public boolean isMuteAudio;
    public boolean isMuteVideo;
    public float maxCache;
    public float minCache;
    public int mode;
    public com.tencent.live2.V2TXLiveDef.V2TXLiveRotation renderRotation;
    public java.lang.String url;
    public int volumeNotifyIntervals;

    public V2TXLivePlayerJSConfig() {
        this.url = "";
        this.mode = 1;
        this.isCanAutoPlay = true;
        this.minCache = 1.0f;
        this.maxCache = 3.0f;
        this.audioRoute = com.tencent.liteav.device.TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone.ordinal();
        this.fillMode = com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFill;
        this.renderRotation = com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation0;
    }

    public java.lang.String diffConfig(com.tencent.live2.jsplugin.player.V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.url;
        if (str != null && !str.equals(v2TXLivePlayerJSConfig.url)) {
            sb6.append("[url:");
            sb6.append(com.tencent.live2.impl.V2TXLiveUtils.removeURLSensitiveInfo(this.url));
            sb6.append("]");
        }
        if (this.mode != v2TXLivePlayerJSConfig.mode) {
            sb6.append("[mode:");
            sb6.append(this.mode);
            sb6.append("]");
        }
        if (this.isCanAutoPlay != v2TXLivePlayerJSConfig.isCanAutoPlay) {
            sb6.append("[isCanAutoPlay:");
            sb6.append(this.isCanAutoPlay);
            sb6.append("]");
        }
        if (this.isAutoPlay != v2TXLivePlayerJSConfig.isAutoPlay) {
            sb6.append("[isAutoPlay:");
            sb6.append(this.isAutoPlay);
            sb6.append("]");
        }
        if (this.isMuteVideo != v2TXLivePlayerJSConfig.isMuteVideo) {
            sb6.append("[isMuteVideo:");
            sb6.append(this.isMuteVideo);
            sb6.append("]");
        }
        if (this.isMuteAudio != v2TXLivePlayerJSConfig.isMuteAudio) {
            sb6.append("[isMuteAudio:");
            sb6.append(this.isMuteAudio);
            sb6.append("]");
        }
        if (this.enableRecvSEIMessage != v2TXLivePlayerJSConfig.enableRecvSEIMessage) {
            sb6.append("[enableRecvSEIMessage:");
            sb6.append(this.enableRecvSEIMessage);
            sb6.append("]");
        }
        if (this.minCache != v2TXLivePlayerJSConfig.minCache) {
            sb6.append("[minCache:");
            sb6.append(this.minCache);
            sb6.append("]");
        }
        if (this.maxCache != v2TXLivePlayerJSConfig.maxCache) {
            sb6.append("[macCache:");
            sb6.append(this.maxCache);
            sb6.append("]");
        }
        if (this.audioRoute != v2TXLivePlayerJSConfig.audioRoute) {
            sb6.append("[audioRoute:");
            sb6.append(this.audioRoute == com.tencent.liteav.device.TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone.ordinal() ? "speaker" : "ear");
            sb6.append("]");
        }
        if (this.volumeNotifyIntervals != v2TXLivePlayerJSConfig.volumeNotifyIntervals) {
            sb6.append("[volumeNotifyIntervals:");
            sb6.append(this.volumeNotifyIntervals);
            sb6.append("]");
        }
        if (this.fillMode != v2TXLivePlayerJSConfig.fillMode) {
            sb6.append("[fillMode:");
            sb6.append(this.fillMode);
            sb6.append("]");
        }
        if (this.renderRotation != v2TXLivePlayerJSConfig.renderRotation) {
            sb6.append("[renderRotation:");
            sb6.append(this.renderRotation);
            sb6.append("]");
        }
        return sb6.toString();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[url:");
        sb6.append(com.tencent.live2.impl.V2TXLiveUtils.removeURLSensitiveInfo(this.url));
        sb6.append("][mode:");
        sb6.append(this.mode);
        sb6.append("][isAutoPlay:");
        sb6.append(this.isAutoPlay);
        sb6.append("][isCanAutoPlay:");
        sb6.append(this.isCanAutoPlay);
        sb6.append("][isMuteVideo:");
        sb6.append(this.isMuteVideo);
        sb6.append("][isMuteAudio:");
        sb6.append(this.isMuteAudio);
        sb6.append("][enableDebugView:");
        sb6.append(this.enableDebugView);
        sb6.append("][enableRecvSEIMessage:");
        sb6.append(this.enableRecvSEIMessage);
        sb6.append("][minCache:");
        sb6.append(this.minCache);
        sb6.append("][maxCache:");
        sb6.append(this.maxCache);
        sb6.append("][volumeNotifyIntervals:");
        sb6.append(this.volumeNotifyIntervals);
        sb6.append("][audioRoute:");
        sb6.append(this.audioRoute == com.tencent.liteav.device.TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone.ordinal() ? "speaker" : "ear");
        sb6.append("][fillMode:");
        sb6.append(this.fillMode);
        sb6.append("][renderRotation:");
        sb6.append(this.renderRotation);
        sb6.append(']');
        return sb6.toString();
    }

    public void updateFromBundle(android.os.Bundle bundle) {
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_PLAY_URL)) {
            this.url = bundle.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_PLAY_URL, "");
        }
        if (bundle.containsKey("mode")) {
            this.mode = bundle.getInt("mode");
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY)) {
            this.isAutoPlay = bundle.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_CAN_AUTO_PLAY)) {
            this.isCanAutoPlay = bundle.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_CAN_AUTO_PLAY);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MUTE_VIDEO)) {
            this.isMuteVideo = bundle.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MUTE_VIDEO);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MUTE_AUDIO)) {
            this.isMuteAudio = bundle.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MUTE_AUDIO);
        }
        if (bundle.containsKey("muted")) {
            this.isMuteAudio = bundle.getBoolean("muted");
        }
        if (bundle.containsKey("orientation")) {
            this.renderRotation = bundle.getString("orientation", "").equalsIgnoreCase("horizontal") ? com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation90 : com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation0;
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT)) {
            this.fillMode = bundle.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT, "").equalsIgnoreCase("fillCrop") ? com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFill : com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFit;
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MIN_CACHE)) {
            this.minCache = bundle.getFloat(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MIN_CACHE);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MAX_CACHE)) {
            this.maxCache = bundle.getFloat(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MAX_CACHE);
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_ENABLE_RECV_MESSAGE)) {
            this.enableRecvSEIMessage = bundle.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_ENABLE_RECV_MESSAGE);
        }
        if (bundle.containsKey("needAudioVolume")) {
            this.volumeNotifyIntervals = bundle.getBoolean("needAudioVolume") ? 300 : 0;
        }
        if (bundle.containsKey("debug")) {
            this.enableDebugView = bundle.getBoolean("debug");
        }
        if (bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_SOUND_MODE)) {
            int ordinal = bundle.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_SOUND_MODE, "").equalsIgnoreCase("speaker") ? com.tencent.liteav.device.TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone.ordinal() : com.tencent.liteav.device.TXDeviceManager.TXAudioRoute.TXAudioRouteEarpiece.ordinal();
            this.audioRoute = ordinal;
            sAudioRoute = ordinal;
        }
    }

    public V2TXLivePlayerJSConfig(com.tencent.live2.jsplugin.player.V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig) {
        this.url = "";
        this.mode = 1;
        this.isCanAutoPlay = true;
        this.minCache = 1.0f;
        this.maxCache = 3.0f;
        this.audioRoute = com.tencent.liteav.device.TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone.ordinal();
        this.fillMode = com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFill;
        this.renderRotation = com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation0;
        this.url = v2TXLivePlayerJSConfig.url;
        this.mode = v2TXLivePlayerJSConfig.mode;
        this.isAutoPlay = v2TXLivePlayerJSConfig.isAutoPlay;
        this.isCanAutoPlay = v2TXLivePlayerJSConfig.isCanAutoPlay;
        this.isMuteAudio = v2TXLivePlayerJSConfig.isMuteAudio;
        this.isMuteVideo = v2TXLivePlayerJSConfig.isMuteVideo;
        this.enableDebugView = v2TXLivePlayerJSConfig.enableDebugView;
        this.enableRecvSEIMessage = v2TXLivePlayerJSConfig.enableRecvSEIMessage;
        this.minCache = v2TXLivePlayerJSConfig.minCache;
        this.maxCache = v2TXLivePlayerJSConfig.maxCache;
        this.volumeNotifyIntervals = v2TXLivePlayerJSConfig.volumeNotifyIntervals;
        this.audioRoute = v2TXLivePlayerJSConfig.audioRoute;
        this.fillMode = v2TXLivePlayerJSConfig.fillMode;
        this.renderRotation = v2TXLivePlayerJSConfig.renderRotation;
    }
}
