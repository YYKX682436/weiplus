package com.p314xaae8f345.p373xbe494963.p393x32b0ec;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.live.V2TXLivePremierJni */
/* loaded from: classes16.dex */
public class C3799x7566b7e5 {
    private static final java.lang.String TAG = "V2TXLivePremierJni";

    /* renamed from: mNativeV2TXLivePremierJni */
    private static long f14836xab62bdc9;

    /* renamed from: sObserver */
    private static com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.V2TXLivePremierObserver f14837xb35f9469;

    static {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.q.a();
        f14836xab62bdc9 = 0L;
    }

    /* renamed from: callExperimentalAPI */
    public static int m30033xd33a8dd4(java.lang.String str) {
        m30034x584cacc0();
        return m30038x63f4483d(f14836xab62bdc9, str);
    }

    /* renamed from: createNativeV2TXLivePremierIfNeed */
    private static void m30034x584cacc0() {
        synchronized (com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3799x7566b7e5.class) {
            if (f14836xab62bdc9 == 0) {
                f14836xab62bdc9 = m30039x73c02ff3();
            }
        }
    }

    /* renamed from: enableAudioCaptureObserver */
    public static int m30035xfbd787a9(boolean z17, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        if (v2TXLiveAudioFrameObserverFormat == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "Enable audio capture observer failed, format is null.");
            return -2;
        }
        m30034x584cacc0();
        return m30040xef3f520(f14836xab62bdc9, z17, v2TXLiveAudioFrameObserverFormat.f15301x88751aa, v2TXLiveAudioFrameObserverFormat.f15299x2c0b7d03, v2TXLiveAudioFrameObserverFormat.f15302xb3cdb4d2, v2TXLiveAudioFrameObserverFormat.f15300x3339a3.ordinal());
    }

    /* renamed from: enableAudioPlayoutObserver */
    public static int m30036x7cd113fd(boolean z17, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        if (v2TXLiveAudioFrameObserverFormat == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "Enable audio playout observer failed, format is null.");
            return -2;
        }
        m30034x584cacc0();
        return m30041x8fed8174(f14836xab62bdc9, z17, v2TXLiveAudioFrameObserverFormat.f15301x88751aa, v2TXLiveAudioFrameObserverFormat.f15299x2c0b7d03, v2TXLiveAudioFrameObserverFormat.f15302xb3cdb4d2, v2TXLiveAudioFrameObserverFormat.f15300x3339a3.ordinal());
    }

    /* renamed from: enableVoiceEarMonitorObserver */
    public static int m30037xa2f8f7e9(boolean z17) {
        m30034x584cacc0();
        return m30042x9c1f8312(f14836xab62bdc9, z17);
    }

    /* renamed from: nativeCallExperimentalAPI */
    private static native int m30038x63f4483d(long j17, java.lang.String str);

    /* renamed from: nativeCreate */
    private static native long m30039x73c02ff3();

    /* renamed from: nativeEnableAudioCaptureObserver */
    private static native int m30040xef3f520(long j17, boolean z17, int i17, int i18, int i19, int i27);

    /* renamed from: nativeEnableAudioPlayoutObserver */
    private static native int m30041x8fed8174(long j17, boolean z17, int i17, int i18, int i19, int i27);

    /* renamed from: nativeEnableVoiceEarMonitorObserver */
    private static native int m30042x9c1f8312(long j17, boolean z17);

    /* renamed from: onAudioCaptureData */
    public static void m30043xd0f3659(byte[] bArr, long j17, int i17, int i18) {
        com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.V2TXLivePremierObserver v2TXLivePremierObserver = f14837xb35f9469;
        if (v2TXLivePremierObserver == null) {
            return;
        }
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrame v2TXLiveAudioFrame = new com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.f15296x2eefaa = bArr;
        v2TXLiveAudioFrame.f15297x88751aa = i17;
        v2TXLiveAudioFrame.f15295x2c0b7d03 = i18;
        v2TXLiveAudioFrame.f15298x3492916 = j17;
        v2TXLivePremierObserver.m31909xdfc9a2fe(v2TXLiveAudioFrame);
    }

    /* renamed from: onAudioPlayoutData */
    public static void m30044x3bc40cad(byte[] bArr, long j17, int i17, int i18) {
        com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.V2TXLivePremierObserver v2TXLivePremierObserver = f14837xb35f9469;
        if (v2TXLivePremierObserver == null) {
            return;
        }
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrame v2TXLiveAudioFrame = new com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.f15296x2eefaa = bArr;
        v2TXLiveAudioFrame.f15297x88751aa = i17;
        v2TXLiveAudioFrame.f15295x2c0b7d03 = i18;
        v2TXLiveAudioFrame.f15298x3492916 = j17;
        v2TXLivePremierObserver.m31910x8916a52(v2TXLiveAudioFrame);
    }

    /* renamed from: onEarMonitoringData */
    public static void m30045x492334e9(byte[] bArr, int i17, int i18) {
        com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.V2TXLivePremierObserver v2TXLivePremierObserver = f14837xb35f9469;
        if (v2TXLivePremierObserver == null) {
            return;
        }
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrame v2TXLiveAudioFrame = new com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.f15296x2eefaa = bArr;
        v2TXLiveAudioFrame.f15297x88751aa = i17;
        v2TXLiveAudioFrame.f15295x2c0b7d03 = i18;
        v2TXLivePremierObserver.m31911x7e98b6ae(v2TXLiveAudioFrame);
    }

    /* renamed from: setObserver */
    public static void m30046x8b59f158(com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.V2TXLivePremierObserver v2TXLivePremierObserver) {
        f14837xb35f9469 = v2TXLivePremierObserver;
    }
}
