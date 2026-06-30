package com.tencent.live;

/* loaded from: classes16.dex */
public class TXLivePluginDef {

    /* loaded from: classes16.dex */
    public interface ErrorCode {
        public static final int CODE_OK = 0;
        public static final int CODE_PARAMNOTFOUND = -1001;
        public static final int CODE_PARAMTYPEERROR = -1002;
        public static final int CODE_PLATFORMVIEWNOTFOUND = -1003;
        public static final int CODE_UNKNOWN = -1;
        public static final int CODE_VALUEISNULL = -1004;
    }

    /* loaded from: classes16.dex */
    public interface ParamKey {
        public static final java.lang.String CALL_MANAGER_ID_KEY = "identifier";
    }

    /* loaded from: classes16.dex */
    public enum V2TXLivePlayerObserverType {
        onError("onError"),
        onWarning("onWarning"),
        onVideoResolutionChanged("onVideoResolutionChanged"),
        onConnected("onConnected"),
        onVideoPlaying("onVideoPlaying"),
        onAudioPlaying("onAudioPlaying"),
        onVideoLoading("onVideoLoading"),
        onAudioLoading("onAudioLoading"),
        onPlayoutVolumeUpdate("onPlayoutVolumeUpdate"),
        onStatisticsUpdate("onStatisticsUpdate"),
        onSnapshotComplete("onSnapshotComplete"),
        onRenderVideoFrame("onRenderVideoFrame"),
        onReceiveSeiMessage("onReceiveSeiMessage");

        private java.lang.String name;

        V2TXLivePlayerObserverType(java.lang.String str) {
            this.name = str;
        }

        public static com.tencent.live.TXLivePluginDef.V2TXLivePlayerObserverType getByName(java.lang.String str) {
            for (com.tencent.live.TXLivePluginDef.V2TXLivePlayerObserverType v2TXLivePlayerObserverType : values()) {
                if (v2TXLivePlayerObserverType.name.equals(str)) {
                    return v2TXLivePlayerObserverType;
                }
            }
            return null;
        }

        public java.lang.String getName() {
            return this.name;
        }
    }

    /* loaded from: classes16.dex */
    public enum V2TXLivePremierObserverType {
        onLog("onLog"),
        onLicenceLoaded("onLicenceLoaded");

        private java.lang.String name;

        V2TXLivePremierObserverType(java.lang.String str) {
            this.name = str;
        }

        public static com.tencent.live.TXLivePluginDef.V2TXLivePremierObserverType getByName(java.lang.String str) {
            for (com.tencent.live.TXLivePluginDef.V2TXLivePremierObserverType v2TXLivePremierObserverType : values()) {
                if (v2TXLivePremierObserverType.name.equals(str)) {
                    return v2TXLivePremierObserverType;
                }
            }
            return null;
        }

        public java.lang.String getName() {
            return this.name;
        }
    }

    /* loaded from: classes16.dex */
    public enum V2TXLivePusherObserverType {
        onError("onError"),
        onWarning("onWarning"),
        onCaptureFirstAudioFrame("onCaptureFirstAudioFrame"),
        onCaptureFirstVideoFrame("onCaptureFirstVideoFrame"),
        onMicrophoneVolumeUpdate("onMicrophoneVolumeUpdate"),
        onPushStatusUpdate("onPushStatusUpdate"),
        onStatisticsUpdate("onStatisticsUpdate"),
        onSnapshotComplete("onSnapshotComplete"),
        onGLContextCreated("onGLContextCreated"),
        onProcessVideoFrame("onProcessVideoFrame"),
        onGLContextDestroyed("onGLContextDestroyed"),
        onSetMixTranscodingConfig("onSetMixTranscodingConfig"),
        onScreenCaptureStarted("onScreenCaptureStarted"),
        onScreenCaptureStopped("onScreenCaptureStopped"),
        onMusicObserverStart("onMusicObserverStart"),
        onMusicObserverPlayProgress("onMusicObserverPlayProgress"),
        onMusicObserverComplete("onMusicObserverComplete");

        private java.lang.String name;

        V2TXLivePusherObserverType(java.lang.String str) {
            this.name = str;
        }

        public static com.tencent.live.TXLivePluginDef.V2TXLivePusherObserverType getByName(java.lang.String str) {
            for (com.tencent.live.TXLivePluginDef.V2TXLivePusherObserverType v2TXLivePusherObserverType : values()) {
                if (v2TXLivePusherObserverType.name.equals(str)) {
                    return v2TXLivePusherObserverType;
                }
            }
            return null;
        }

        public java.lang.String getName() {
            return this.name;
        }
    }
}
