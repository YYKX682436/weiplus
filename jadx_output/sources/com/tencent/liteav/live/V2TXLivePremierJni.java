package com.tencent.liteav.live;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes16.dex */
public class V2TXLivePremierJni {
    private static final java.lang.String TAG = "V2TXLivePremierJni";
    private static long mNativeV2TXLivePremierJni;
    private static com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver sObserver;

    static {
        com.tencent.liteav.base.util.q.a();
        mNativeV2TXLivePremierJni = 0L;
    }

    public static int callExperimentalAPI(java.lang.String str) {
        createNativeV2TXLivePremierIfNeed();
        return nativeCallExperimentalAPI(mNativeV2TXLivePremierJni, str);
    }

    private static void createNativeV2TXLivePremierIfNeed() {
        synchronized (com.tencent.liteav.live.V2TXLivePremierJni.class) {
            if (mNativeV2TXLivePremierJni == 0) {
                mNativeV2TXLivePremierJni = nativeCreate();
            }
        }
    }

    public static int enableAudioCaptureObserver(boolean z17, com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        if (v2TXLiveAudioFrameObserverFormat == null) {
            com.tencent.liteav.base.util.LiteavLog.w(TAG, "Enable audio capture observer failed, format is null.");
            return -2;
        }
        createNativeV2TXLivePremierIfNeed();
        return nativeEnableAudioCaptureObserver(mNativeV2TXLivePremierJni, z17, v2TXLiveAudioFrameObserverFormat.sampleRate, v2TXLiveAudioFrameObserverFormat.channel, v2TXLiveAudioFrameObserverFormat.samplesPerCall, v2TXLiveAudioFrameObserverFormat.mode.ordinal());
    }

    public static int enableAudioPlayoutObserver(boolean z17, com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        if (v2TXLiveAudioFrameObserverFormat == null) {
            com.tencent.liteav.base.util.LiteavLog.w(TAG, "Enable audio playout observer failed, format is null.");
            return -2;
        }
        createNativeV2TXLivePremierIfNeed();
        return nativeEnableAudioPlayoutObserver(mNativeV2TXLivePremierJni, z17, v2TXLiveAudioFrameObserverFormat.sampleRate, v2TXLiveAudioFrameObserverFormat.channel, v2TXLiveAudioFrameObserverFormat.samplesPerCall, v2TXLiveAudioFrameObserverFormat.mode.ordinal());
    }

    public static int enableVoiceEarMonitorObserver(boolean z17) {
        createNativeV2TXLivePremierIfNeed();
        return nativeEnableVoiceEarMonitorObserver(mNativeV2TXLivePremierJni, z17);
    }

    private static native int nativeCallExperimentalAPI(long j17, java.lang.String str);

    private static native long nativeCreate();

    private static native int nativeEnableAudioCaptureObserver(long j17, boolean z17, int i17, int i18, int i19, int i27);

    private static native int nativeEnableAudioPlayoutObserver(long j17, boolean z17, int i17, int i18, int i19, int i27);

    private static native int nativeEnableVoiceEarMonitorObserver(long j17, boolean z17);

    public static void onAudioCaptureData(byte[] bArr, long j17, int i17, int i18) {
        com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = sObserver;
        if (v2TXLivePremierObserver == null) {
            return;
        }
        com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.sampleRate = i17;
        v2TXLiveAudioFrame.channel = i18;
        v2TXLiveAudioFrame.timestamp = j17;
        v2TXLivePremierObserver.onCaptureAudioFrame(v2TXLiveAudioFrame);
    }

    public static void onAudioPlayoutData(byte[] bArr, long j17, int i17, int i18) {
        com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = sObserver;
        if (v2TXLivePremierObserver == null) {
            return;
        }
        com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.sampleRate = i17;
        v2TXLiveAudioFrame.channel = i18;
        v2TXLiveAudioFrame.timestamp = j17;
        v2TXLivePremierObserver.onPlayoutAudioFrame(v2TXLiveAudioFrame);
    }

    public static void onEarMonitoringData(byte[] bArr, int i17, int i18) {
        com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = sObserver;
        if (v2TXLivePremierObserver == null) {
            return;
        }
        com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.sampleRate = i17;
        v2TXLiveAudioFrame.channel = i18;
        v2TXLivePremierObserver.onVoiceEarMonitorAudioFrame(v2TXLiveAudioFrame);
    }

    public static void setObserver(com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver) {
        sObserver = v2TXLivePremierObserver;
    }
}
