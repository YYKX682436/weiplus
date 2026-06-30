package com.tencent.live2;

/* loaded from: classes16.dex */
public class V2TXLivePremier {

    /* loaded from: classes16.dex */
    public static abstract class V2TXLivePremierObserver {
        public void onCaptureAudioFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
        }

        public void onLicenceLoaded(int i17, java.lang.String str) {
        }

        public void onLog(int i17, java.lang.String str) {
        }

        public void onPlayoutAudioFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
        }

        public void onVoiceEarMonitorAudioFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
        }
    }

    public static int callExperimentalAPI(java.lang.String str) {
        return com.tencent.live2.impl.a.c(str);
    }

    public static void enableAudioCaptureObserver(boolean z17, com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        com.tencent.live2.impl.a.a(z17, v2TXLiveAudioFrameObserverFormat);
    }

    public static void enableAudioPlayoutObserver(boolean z17, com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        com.tencent.live2.impl.a.b(z17, v2TXLiveAudioFrameObserverFormat);
    }

    public static void enableVoiceEarMonitorObserver(boolean z17) {
        com.tencent.live2.impl.a.a(z17);
    }

    public static java.lang.String getSDKVersionStr() {
        return com.tencent.live2.impl.a.a();
    }

    public static void setEnvironment(java.lang.String str) {
        com.tencent.live2.impl.a.a(str);
    }

    public static void setLicence(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.tencent.live2.impl.a.a(context, str, str2);
    }

    public static void setLogConfig(com.tencent.live2.V2TXLiveDef.V2TXLiveLogConfig v2TXLiveLogConfig) {
        com.tencent.live2.impl.a.a(v2TXLiveLogConfig);
    }

    public static void setObserver(com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver) {
        com.tencent.live2.impl.a.a(v2TXLivePremierObserver);
    }

    public static void setSocks5Proxy(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, com.tencent.live2.V2TXLiveDef.V2TXLiveSocks5ProxyConfig v2TXLiveSocks5ProxyConfig) {
        com.tencent.live2.impl.a.a(str, i17, str2, str3, v2TXLiveSocks5ProxyConfig);
    }

    public static void setUserId(java.lang.String str) {
        com.tencent.live2.impl.a.b(str);
    }
}
