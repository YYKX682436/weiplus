package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::extensions")
/* renamed from: com.tencent.trtc.hardwareearmonitor.HardwareEarMonitorSilentTrack */
/* loaded from: classes15.dex */
public class C26791x80483d0a {

    /* renamed from: DEFAULT_SAMPLE_RATE */
    private static final int f57265x7de4a537 = 48000;
    private static final java.lang.String TAG = "HardwareEarMonitorSilentTrack";

    /* renamed from: mPlaybackThread */
    private com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.C26791x80483d0a.PlaybackThread f57269x510a99d2;

    /* renamed from: mChannelConfig */
    private int f57267x951ee6b8 = 12;

    /* renamed from: mAudioFormat */
    private int f57266xadf4d8c0 = 2;

    /* renamed from: mIsPlaying */
    private boolean f57268x3abd61b7 = false;

    /* renamed from: com.tencent.trtc.hardwareearmonitor.HardwareEarMonitorSilentTrack$PlaybackThread */
    /* loaded from: classes15.dex */
    public class PlaybackThread extends java.lang.Thread {

        /* renamed from: isStop */
        private boolean f57270xb9a8e44c = false;

        public PlaybackThread() {
        }

        /* renamed from: closeThread */
        public synchronized void m105642xb5b7e22() {
            this.f57270xb9a8e44c = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int minBufferSize = android.media.AudioTrack.getMinBufferSize(48000, com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.C26791x80483d0a.this.f57267x951ee6b8, com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.C26791x80483d0a.this.f57266xadf4d8c0);
            android.media.AudioTrack audioTrack = new android.media.AudioTrack(3, 48000, com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.C26791x80483d0a.this.f57267x951ee6b8, com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.C26791x80483d0a.this.f57266xadf4d8c0, minBufferSize, 1);
            if (audioTrack.getState() == 1) {
                audioTrack.play();
                byte[] bArr = new byte[minBufferSize];
                for (int i17 = 0; i17 < minBufferSize; i17++) {
                    bArr[i17] = 0;
                }
                while (!this.f57270xb9a8e44c && !isInterrupted()) {
                    try {
                        audioTrack.write(bArr, 0, minBufferSize);
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.C26791x80483d0a.TAG, "audioTrack write,Throwable ex : %s", th6.getMessage());
                    }
                }
                audioTrack.stop();
                audioTrack.flush();
            }
            audioTrack.release();
        }
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.C26791x80483d0a m105639xaf65a0fc() {
        return new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.C26791x80483d0a();
    }

    /* renamed from: StartAudioTrack */
    public void m105640x919420f7() {
        if (this.f57268x3abd61b7 || this.f57269x510a99d2 != null) {
            return;
        }
        this.f57268x3abd61b7 = true;
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.C26791x80483d0a.PlaybackThread playbackThread = new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.C26791x80483d0a.PlaybackThread();
        this.f57269x510a99d2 = playbackThread;
        playbackThread.start();
    }

    /* renamed from: StopAudioTrack */
    public void m105641x9aeb70d7() {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.C26791x80483d0a.PlaybackThread playbackThread = this.f57269x510a99d2;
        if (playbackThread != null) {
            this.f57268x3abd61b7 = false;
            playbackThread.m105642xb5b7e22();
            try {
                this.f57269x510a99d2.join();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "mPlaybackThread join,Throwable ex : %s", th6.getMessage());
            }
            this.f57269x510a99d2 = null;
        }
    }
}
