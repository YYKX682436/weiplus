package com.p314xaae8f345.p373xbe494963.p396x36756d;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::trtc")
/* renamed from: com.tencent.liteav.trtc.AudioVodTrackJni */
/* loaded from: classes10.dex */
public class C3804xe6b38aaf {

    /* renamed from: mNativeAudioVodTrackJni */
    private long f14860xfeffb993;

    /* renamed from: com.tencent.liteav.trtc.AudioVodTrackJni$AudioFrame */
    /* loaded from: classes10.dex */
    public static class AudioFrame {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame f128099a;

        public AudioFrame(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
            this.f128099a = tRTCAudioFrame;
        }

        /* renamed from: getChannel */
        public int m30252x69d8b8cd() {
            return this.f128099a.f57040x2c0b7d03;
        }

        /* renamed from: getData */
        public byte[] m30253xfb7e5820() {
            return this.f128099a.f57041x2eefaa;
        }

        /* renamed from: getSampleRate */
        public int m30254xf6c809a0() {
            return this.f128099a.f57043x88751aa;
        }

        /* renamed from: getTimestamp */
        public long m30255x2b69a60() {
            return this.f128099a.f57044x3492916;
        }
    }

    public C3804xe6b38aaf() {
        this.f14860xfeffb993 = 0L;
        this.f14860xfeffb993 = m30238x9b7374a2(this);
    }

    /* renamed from: nativeClean */
    private static native void m30237x66d1ec72(long j17);

    /* renamed from: nativeCreateAudioVodTrackJni */
    private static native long m30238x9b7374a2(com.p314xaae8f345.p373xbe494963.p396x36756d.C3804xe6b38aaf c3804xe6b38aaf);

    /* renamed from: nativeEnablePlayout */
    private static native void m30239xc8daadc0(long j17, boolean z17);

    /* renamed from: nativePause */
    private static native void m30240x67845c1f(long j17);

    /* renamed from: nativeResume */
    private static native void m30241x8ca85724(long j17);

    /* renamed from: nativeSeek */
    private static native void m30242xb905af2f(long j17);

    /* renamed from: nativeSetPlayoutVolume */
    private static native void m30243x3e7ac849(long j17, int i17);

    /* renamed from: nativeWriteData */
    private static native int m30244x9288add2(long j17, com.p314xaae8f345.p373xbe494963.p396x36756d.C3804xe6b38aaf.AudioFrame audioFrame);

    /* renamed from: clean */
    public synchronized void m30245x5a5b649() {
        long j17 = this.f14860xfeffb993;
        if (j17 != 0) {
            m30237x66d1ec72(j17);
        }
    }

    /* renamed from: enablePlayout */
    public synchronized void m30246x254eb097(boolean z17) {
        long j17 = this.f14860xfeffb993;
        if (j17 != 0) {
            m30239xc8daadc0(j17, z17);
        }
    }

    /* renamed from: pause */
    public synchronized void m30247x65825f6() {
        long j17 = this.f14860xfeffb993;
        if (j17 != 0) {
            m30240x67845c1f(j17);
        }
    }

    /* renamed from: resume */
    public synchronized void m30248xc84dc82d() {
        long j17 = this.f14860xfeffb993;
        if (j17 != 0) {
            m30241x8ca85724(j17);
        }
    }

    /* renamed from: seek */
    public synchronized void m30249x35ce78() {
        long j17 = this.f14860xfeffb993;
        if (j17 != 0) {
            m30242xb905af2f(j17);
        }
    }

    /* renamed from: setPlayoutVolume */
    public synchronized void m30250x1ed14212(int i17) {
        long j17 = this.f14860xfeffb993;
        if (j17 != 0) {
            m30243x3e7ac849(j17, i17);
        }
    }

    /* renamed from: writeData */
    public synchronized int m30251xac25b429(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
        long j17 = this.f14860xfeffb993;
        if (j17 == 0) {
            return -1;
        }
        return m30244x9288add2(j17, new com.p314xaae8f345.p373xbe494963.p396x36756d.C3804xe6b38aaf.AudioFrame(tRTCAudioFrame));
    }
}
