package com.tencent.liteav.audio2;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::audio")
/* loaded from: classes13.dex */
public class LiteavAudioTrack2 {
    private static final java.lang.String TAG = "LiteavAudioTrack2";
    private android.media.AudioTrack mAudioTrack;
    private byte[] mPlayBuffer;
    private int mBufferSize = 0;
    private int mSystemOSVersion = 0;

    private static android.media.AudioTrack createStartedAudioTrack(int i17, int i18, int i19, int i27) {
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
            com.tencent.liteav.base.Log.i(TAG, "create AudioTrack success. sampleRate: %d, channelConfig: %d, bufferSize: %d, streamType: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), streamTypeToString(i27));
            return audioTrack;
        } catch (java.lang.Throwable unused2) {
            com.tencent.liteav.base.Log.w(TAG, "create AudioTrack failed. sampleRate: %d, channelConfig: %d, bufferSize: %d, streamType: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), streamTypeToString(i27));
            destroyAudioTrack(audioTrack);
            return null;
        }
    }

    private static void destroyAudioTrack(android.media.AudioTrack audioTrack) {
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
            com.tencent.liteav.base.Log.e(TAG, "stop AudioTrack failed.", th6);
        }
    }

    private static java.lang.String streamTypeToString(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
    }

    public int getBufferSize() {
        return this.mBufferSize;
    }

    public int startPlayout(int i17, int i18, int i19, int i27) {
        int[] iArr = {i17, 0, 3, 1};
        int i28 = i19 == 1 ? 4 : 12;
        int minBufferSize = android.media.AudioTrack.getMinBufferSize(i18, i28, 2);
        if (minBufferSize <= 0) {
            com.tencent.liteav.base.Log.e(TAG, "AudioTrack.getMinBufferSize return error: ".concat(java.lang.String.valueOf(minBufferSize)), new java.lang.Object[0]);
            return -2;
        }
        for (int i29 = 0; i29 < 4 && this.mAudioTrack == null; i29++) {
            int i37 = iArr[i29];
            for (int i38 = 1; i38 <= 2 && this.mAudioTrack == null; i38++) {
                int i39 = minBufferSize * i38;
                this.mBufferSize = i39;
                if (i39 >= i27 * 4 || i38 >= 2) {
                    this.mAudioTrack = createStartedAudioTrack(i18, i28, i39, i37);
                }
            }
        }
        if (this.mAudioTrack == null) {
            return -1;
        }
        this.mSystemOSVersion = com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt();
        android.os.Process.setThreadPriority(-19);
        return 0;
    }

    public void stopPlayout() {
        destroyAudioTrack(this.mAudioTrack);
        this.mAudioTrack = null;
    }

    public int write(java.nio.ByteBuffer byteBuffer, int i17, int i18, boolean z17) {
        int write;
        if (this.mAudioTrack == null) {
            return -1;
        }
        byteBuffer.position(i17);
        if (this.mSystemOSVersion >= 21) {
            write = this.mAudioTrack.write(byteBuffer, i18, z17 ? 1 : 0);
        } else {
            byte[] bArr = this.mPlayBuffer;
            if (bArr == null || bArr.length < i18) {
                this.mPlayBuffer = new byte[i18];
            }
            byteBuffer.get(this.mPlayBuffer, 0, i18);
            write = this.mAudioTrack.write(this.mPlayBuffer, 0, i18);
        }
        if (write >= 0) {
            return write;
        }
        com.tencent.liteav.base.Log.e(TAG, "write audio data to AudioTrack failed. ".concat(java.lang.String.valueOf(write)), new java.lang.Object[0]);
        return -1;
    }
}
