package com.p314xaae8f345.p373xbe494963.p376xac25df1c;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::audio")
/* renamed from: com.tencent.liteav.audio2.LiteavAudioRecord2 */
/* loaded from: classes14.dex */
class C3733x8bd79a6e {
    private static final java.lang.String TAG = "LiteavAudioRecord";

    /* renamed from: mAudioRecord */
    private android.media.AudioRecord f14580xc1db4d1a;

    /* renamed from: mBufferSize */
    private int f14581x4dd0c0ae = 0;

    /* renamed from: audioSourceToString */
    private static java.lang.String m29172xcaa4cd1d(int i17) {
        switch (i17) {
            case 0:
                return com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p240x4e139522.C2426x7e760204.f7429x859b4284;
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

    /* renamed from: createStartedAudioRecord */
    private static android.media.AudioRecord m29173x24028ea2(int i17, int i18, int i19, int i27) {
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
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "create AudioRecord success. sampleRate: %d, channelConfig: %d, bufferSize: %d, audio source: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), m29172xcaa4cd1d(i17));
            return audioRecord;
        } catch (java.lang.Throwable unused2) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.w(TAG, "create AudioRecord failed. source: %s, sampleRate: %d, channelConfig: %d, bufferSize: %d", m29172xcaa4cd1d(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
            m29174xc5b6636d(audioRecord);
            return null;
        }
    }

    /* renamed from: destroyAudioRecord */
    private static void m29174xc5b6636d(android.media.AudioRecord audioRecord) {
        if (audioRecord == null) {
            return;
        }
        try {
            if (audioRecord.getRecordingState() == 3) {
                audioRecord.stop();
            }
            audioRecord.release();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "stop AudioRecord failed.", th6);
        }
    }

    /* renamed from: getSessionId */
    public int m29175x23a7af9b() {
        android.media.AudioRecord audioRecord = this.f14580xc1db4d1a;
        if (audioRecord == null) {
            return -1;
        }
        return audioRecord.getAudioSessionId();
    }

    /* renamed from: read */
    public int m29176x355996(java.nio.ByteBuffer byteBuffer, int i17) {
        if (this.f14580xc1db4d1a == null) {
            return -1;
        }
        byteBuffer.position(0);
        int read = this.f14580xc1db4d1a.read(byteBuffer, i17);
        if (read >= 0) {
            return read;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "read failed, %d", java.lang.Integer.valueOf(read));
        return -1;
    }

    /* renamed from: startRecording */
    public int m29177x2619a7af(int i17, int i18, int i19, int i27) {
        int[] iArr = {i17, 1, 5, 0};
        int i28 = i19 == 1 ? 16 : 12;
        int minBufferSize = android.media.AudioRecord.getMinBufferSize(i18, i28, 2);
        if (minBufferSize <= 0) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "AudioRecord.getMinBufferSize return error: ".concat(java.lang.String.valueOf(minBufferSize)), new java.lang.Object[0]);
            return -2;
        }
        for (int i29 = 0; i29 < 4 && this.f14580xc1db4d1a == null; i29++) {
            int i37 = iArr[i29];
            for (int i38 = 1; i38 <= 2 && this.f14580xc1db4d1a == null; i38++) {
                int i39 = minBufferSize * i38;
                this.f14581x4dd0c0ae = i39;
                if (i39 >= i27 * 4 || i38 >= 2) {
                    this.f14580xc1db4d1a = m29173x24028ea2(i37, i18, i28, i39);
                }
            }
        }
        if (this.f14580xc1db4d1a == null) {
            return -1;
        }
        android.os.Process.setThreadPriority(-19);
        return 0;
    }

    /* renamed from: stopRecording */
    public void m29178xc350780f() {
        m29174xc5b6636d(this.f14580xc1db4d1a);
        this.f14580xc1db4d1a = null;
    }
}
