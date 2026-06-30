package com.p314xaae8f345.p414x32b0ec;

/* renamed from: com.tencent.live.TXLivePluginDef */
/* loaded from: classes16.dex */
public class C3856x24bb8022 {

    /* renamed from: com.tencent.live.TXLivePluginDef$ErrorCode */
    /* loaded from: classes16.dex */
    public interface ErrorCode {

        /* renamed from: CODE_OK */
        public static final int f15115x62ef656e = 0;

        /* renamed from: CODE_PARAMNOTFOUND */
        public static final int f15116xa552212a = -1001;

        /* renamed from: CODE_PARAMTYPEERROR */
        public static final int f15117xb77c61b3 = -1002;

        /* renamed from: CODE_PLATFORMVIEWNOTFOUND */
        public static final int f15118x25060539 = -1003;

        /* renamed from: CODE_UNKNOWN */
        public static final int f15119x766647d8 = -1;

        /* renamed from: CODE_VALUEISNULL */
        public static final int f15120x37ee42f0 = -1004;
    }

    /* renamed from: com.tencent.live.TXLivePluginDef$ParamKey */
    /* loaded from: classes16.dex */
    public interface ParamKey {

        /* renamed from: CALL_MANAGER_ID_KEY */
        public static final java.lang.String f15121xc2d3420e = "identifier";
    }

    /* renamed from: com.tencent.live.TXLivePluginDef$V2TXLivePlayerObserverType */
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


        /* renamed from: name */
        private java.lang.String f15136x337a8b;

        V2TXLivePlayerObserverType(java.lang.String str) {
            this.f15136x337a8b = str;
        }

        /* renamed from: getByName */
        public static com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePlayerObserverType m31607x13201a78(java.lang.String str) {
            for (com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePlayerObserverType v2TXLivePlayerObserverType : m31609xcee59d22()) {
                if (v2TXLivePlayerObserverType.f15136x337a8b.equals(str)) {
                    return v2TXLivePlayerObserverType;
                }
            }
            return null;
        }

        /* renamed from: getName */
        public java.lang.String m31610xfb82e301() {
            return this.f15136x337a8b;
        }
    }

    /* renamed from: com.tencent.live.TXLivePluginDef$V2TXLivePremierObserverType */
    /* loaded from: classes16.dex */
    public enum V2TXLivePremierObserverType {
        onLog("onLog"),
        onLicenceLoaded("onLicenceLoaded");


        /* renamed from: name */
        private java.lang.String f15140x337a8b;

        V2TXLivePremierObserverType(java.lang.String str) {
            this.f15140x337a8b = str;
        }

        /* renamed from: getByName */
        public static com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePremierObserverType m31613x13201a78(java.lang.String str) {
            for (com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePremierObserverType v2TXLivePremierObserverType : m31615xcee59d22()) {
                if (v2TXLivePremierObserverType.f15140x337a8b.equals(str)) {
                    return v2TXLivePremierObserverType;
                }
            }
            return null;
        }

        /* renamed from: getName */
        public java.lang.String m31616xfb82e301() {
            return this.f15140x337a8b;
        }
    }

    /* renamed from: com.tencent.live.TXLivePluginDef$V2TXLivePusherObserverType */
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


        /* renamed from: name */
        private java.lang.String f15159x337a8b;

        V2TXLivePusherObserverType(java.lang.String str) {
            this.f15159x337a8b = str;
        }

        /* renamed from: getByName */
        public static com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePusherObserverType m31619x13201a78(java.lang.String str) {
            for (com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePusherObserverType v2TXLivePusherObserverType : m31621xcee59d22()) {
                if (v2TXLivePusherObserverType.f15159x337a8b.equals(str)) {
                    return v2TXLivePusherObserverType;
                }
            }
            return null;
        }

        /* renamed from: getName */
        public java.lang.String m31622xfb82e301() {
            return this.f15159x337a8b;
        }
    }
}
