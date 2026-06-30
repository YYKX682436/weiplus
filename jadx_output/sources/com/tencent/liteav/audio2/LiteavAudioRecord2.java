package com.tencent.liteav.audio2;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::audio")
/* loaded from: classes14.dex */
class LiteavAudioRecord2 {
    private static final java.lang.String TAG = "LiteavAudioRecord";
    private android.media.AudioRecord mAudioRecord;
    private int mBufferSize = 0;

    private static java.lang.String audioSourceToString(int i17) {
        switch (i17) {
            case 0:
                return com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN;
            case 1:
                return "MIC";
            case 2:
                return "VOICE_UPLINK";
            case 3:
                return "VOICE_DOWNLINK";
            case 4:
                return "VOICE_CALL";
            case 5:
                return "CAMCORDER";
            case 6:
                return "VOICE_RECOGNITION";
            case 7:
                return "VOICE_COMMUNICATION";
            case 8:
            default:
                return "INVALID";
            case 9:
                return "UNPROCESSED";
            case 10:
                return "VOICE_PERFORMANCE";
        }
    }

    private static android.media.AudioRecord createStartedAudioRecord(int i17, int i18, int i19, int i27) {
        android.media.AudioRecord audioRecord;
        try {
            audioRecord = new android.media.AudioRecord(i17, i18, i19, 2, i27);
        } catch (java.lang.Throwable unused) {
            audioRecord = null;
        }
        try {
            if (audioRecord.getState() != 1) {
                throw new java.lang.RuntimeException("AudioRecord is not initialized.");
            }
            yj0.a.j(audioRecord, "com/tencent/liteav/audio2/LiteavAudioRecord2", "createStartedAudioRecord", "(IIII)Landroid/media/AudioRecord;", "android/media/AudioRecord", "startRecording", "()V");
            com.tencent.liteav.base.Log.i(TAG, "create AudioRecord success. sampleRate: %d, channelConfig: %d, bufferSize: %d, audio source: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), audioSourceToString(i17));
            return audioRecord;
        } catch (java.lang.Throwable unused2) {
            com.tencent.liteav.base.Log.w(TAG, "create AudioRecord failed. source: %s, sampleRate: %d, channelConfig: %d, bufferSize: %d", audioSourceToString(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
            destroyAudioRecord(audioRecord);
            return null;
        }
    }

    private static void destroyAudioRecord(android.media.AudioRecord audioRecord) {
        if (audioRecord == null) {
            return;
        }
        try {
            if (audioRecord.getRecordingState() == 3) {
                audioRecord.stop();
            }
            audioRecord.release();
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.e(TAG, "stop AudioRecord failed.", th6);
        }
    }

    public int getSessionId() {
        android.media.AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -1;
        }
        return audioRecord.getAudioSessionId();
    }

    public int read(java.nio.ByteBuffer byteBuffer, int i17) {
        if (this.mAudioRecord == null) {
            return -1;
        }
        byteBuffer.position(0);
        int read = this.mAudioRecord.read(byteBuffer, i17);
        if (read >= 0) {
            return read;
        }
        com.tencent.liteav.base.Log.e(TAG, "read failed, %d", java.lang.Integer.valueOf(read));
        return -1;
    }

    public int startRecording(int i17, int i18, int i19, int i27) {
        int[] iArr = {i17, 1, 5, 0};
        int i28 = i19 == 1 ? 16 : 12;
        int minBufferSize = android.media.AudioRecord.getMinBufferSize(i18, i28, 2);
        if (minBufferSize <= 0) {
            com.tencent.liteav.base.Log.e(TAG, "AudioRecord.getMinBufferSize return error: ".concat(java.lang.String.valueOf(minBufferSize)), new java.lang.Object[0]);
            return -2;
        }
        for (int i29 = 0; i29 < 4 && this.mAudioRecord == null; i29++) {
            int i37 = iArr[i29];
            for (int i38 = 1; i38 <= 2 && this.mAudioRecord == null; i38++) {
                int i39 = minBufferSize * i38;
                this.mBufferSize = i39;
                if (i39 >= i27 * 4 || i38 >= 2) {
                    this.mAudioRecord = createStartedAudioRecord(i37, i18, i28, i39);
                }
            }
        }
        if (this.mAudioRecord == null) {
            return -1;
        }
        android.os.Process.setThreadPriority(-19);
        return 0;
    }

    public void stopRecording() {
        destroyAudioRecord(this.mAudioRecord);
        this.mAudioRecord = null;
    }
}
