package com.p314xaae8f345.p373xbe494963.p376xac25df1c;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::audio")
/* renamed from: com.tencent.liteav.audio2.LiteavAudioTrack2 */
/* loaded from: classes13.dex */
public class C3734xb60dfa3a {
    private static final java.lang.String TAG = "LiteavAudioTrack2";

    /* renamed from: mAudioTrack */
    private android.media.AudioTrack f14582x37ef5362;

    /* renamed from: mPlayBuffer */
    private byte[] f14584x1d96cce1;

    /* renamed from: mBufferSize */
    private int f14583x4dd0c0ae = 0;

    /* renamed from: mSystemOSVersion */
    private int f14585x393b44d8 = 0;

    /* renamed from: createStartedAudioTrack */
    private static android.media.AudioTrack m29179x2a95c0da(int i17, int i18, int i19, int i27) {
        android.media.AudioTrack audioTrack;
        try {
            audioTrack = new android.media.AudioTrack(i27, i17, i18, 2, i19, 1);
        } catch (java.lang.Throwable unused) {
            audioTrack = null;
        }
        try {
            if (audioTrack.getState() != 1) {
                throw new java.lang.RuntimeException("AudioTrack is not initialized.");
            }
            audioTrack.play();
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "create AudioTrack success. sampleRate: %d, channelConfig: %d, bufferSize: %d, streamType: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), m29181xc34ecf66(i27));
            return audioTrack;
        } catch (java.lang.Throwable unused2) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.w(TAG, "create AudioTrack failed. sampleRate: %d, channelConfig: %d, bufferSize: %d, streamType: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), m29181xc34ecf66(i27));
            m29180xf5fea6af(audioTrack);
            return null;
        }
    }

    /* renamed from: destroyAudioTrack */
    private static void m29180xf5fea6af(android.media.AudioTrack audioTrack) {
        if (audioTrack == null) {
            return;
        }
        try {
            if (audioTrack.getPlayState() == 3) {
                audioTrack.stop();
                audioTrack.flush();
            }
            audioTrack.release();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "stop AudioTrack failed.", th6);
        }
    }

    /* renamed from: streamTypeToString */
    private static java.lang.String m29181xc34ecf66(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
    }

    /* renamed from: getBufferSize */
    public int m29182x5fdf8057() {
        return this.f14583x4dd0c0ae;
    }

    /* renamed from: startPlayout */
    public int m29183xda9168d8(int i17, int i18, int i19, int i27) {
        int[] iArr = {i17, 0, 3, 1};
        int i28 = i19 == 1 ? 4 : 12;
        int minBufferSize = android.media.AudioTrack.getMinBufferSize(i18, i28, 2);
        if (minBufferSize <= 0) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "AudioTrack.getMinBufferSize return error: ".concat(java.lang.String.valueOf(minBufferSize)), new java.lang.Object[0]);
            return -2;
        }
        for (int i29 = 0; i29 < 4 && this.f14582x37ef5362 == null; i29++) {
            int i37 = iArr[i29];
            for (int i38 = 1; i38 <= 2 && this.f14582x37ef5362 == null; i38++) {
                int i39 = minBufferSize * i38;
                this.f14583x4dd0c0ae = i39;
                if (i39 >= i27 * 4 || i38 >= 2) {
                    this.f14582x37ef5362 = m29179x2a95c0da(i18, i28, i39, i37);
                }
            }
        }
        if (this.f14582x37ef5362 == null) {
            return -1;
        }
        this.f14585x393b44d8 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0();
        android.os.Process.setThreadPriority(-19);
        return 0;
    }

    /* renamed from: stopPlayout */
    public void m29184x9600d138() {
        m29180xf5fea6af(this.f14582x37ef5362);
        this.f14582x37ef5362 = null;
    }

    /* renamed from: write */
    public int m29185x6c257df(java.nio.ByteBuffer byteBuffer, int i17, int i18, boolean z17) {
        int write;
        if (this.f14582x37ef5362 == null) {
            return -1;
        }
        byteBuffer.position(i17);
        if (this.f14585x393b44d8 >= 21) {
            write = this.f14582x37ef5362.write(byteBuffer, i18, z17 ? 1 : 0);
        } else {
            byte[] bArr = this.f14584x1d96cce1;
            if (bArr == null || bArr.length < i18) {
                this.f14584x1d96cce1 = new byte[i18];
            }
            byteBuffer.get(this.f14584x1d96cce1, 0, i18);
            write = this.f14582x37ef5362.write(this.f14584x1d96cce1, 0, i18);
        }
        if (write >= 0) {
            return write;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "write audio data to AudioTrack failed. ".concat(java.lang.String.valueOf(write)), new java.lang.Object[0]);
        return -1;
    }
}
