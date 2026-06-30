package com.p314xaae8f345.p373xbe494963.p376xac25df1c;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::audio")
/* renamed from: com.tencent.liteav.audio2.SystemLoopbackRecorder2 */
/* loaded from: classes13.dex */
public class C3735x39c9ab5a {
    private static final java.lang.String TAG = "SystemLoopbackRecorder2";

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f127781a = 0;

    /* renamed from: mLock */
    private static final java.lang.Object f14586x6243b38 = new java.lang.Object();

    /* renamed from: mMediaProjection */
    private static android.media.projection.MediaProjection f14587xedb4b926;

    /* renamed from: mNativeSystemLoopbackRecorder */
    private static volatile long f14588xb93ec3bc;

    public C3735x39c9ab5a(long j17) {
        f14588xb93ec3bc = j17;
    }

    /* renamed from: nativeSetMediaProjectionSession */
    private static native void m29187x2f4e986e(long j17, android.media.projection.MediaProjection mediaProjection);

    /* renamed from: notifyMediaProjectionState */
    public static void m29188x64ca73e7(android.media.projection.MediaProjection mediaProjection) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Received MediaProjection state ");
        sb6.append(mediaProjection != null);
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, sb6.toString(), new java.lang.Object[0]);
        synchronized (f14586x6243b38) {
            f14587xedb4b926 = mediaProjection;
            m29189xd3da10c5();
        }
    }

    /* renamed from: setMediaProjectionSession */
    public static void m29189xd3da10c5() {
        if (f14587xedb4b926 == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "MediaProjection is null.", new java.lang.Object[0]);
        } else if (f14588xb93ec3bc != 0) {
            m29187x2f4e986e(f14588xb93ec3bc, f14587xedb4b926);
        }
    }

    /* renamed from: getMediaProjection */
    public android.media.projection.MediaProjection m29190x2685b1d() {
        return f14587xedb4b926;
    }

    /* renamed from: releaseNativeSystemLoopbackRecorder */
    public void m29191x649ee056() {
        f14588xb93ec3bc = 0L;
    }

    /* renamed from: com.tencent.liteav.audio2.SystemLoopbackRecorder2$Recorder */
    /* loaded from: classes14.dex */
    public static class Recorder {

        /* renamed from: a, reason: collision with root package name */
        private android.media.AudioRecord f127782a;

        /* renamed from: b, reason: collision with root package name */
        private android.media.AudioManager f127783b;

        public Recorder() {
            android.content.Context m29240x6e669035 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();
            this.f127783b = (android.media.AudioManager) m29240x6e669035.getSystemService("audio");
        }

        private static android.media.AudioRecord a(android.media.projection.MediaProjection mediaProjection, int i17, int i18, int i19) {
            android.media.AudioPlaybackCaptureConfiguration.Builder builder = new android.media.AudioPlaybackCaptureConfiguration.Builder(mediaProjection);
            builder.addMatchingUsage(1);
            builder.addMatchingUsage(14);
            android.media.AudioPlaybackCaptureConfiguration build = builder.build();
            if (build == null) {
                return null;
            }
            int i27 = i18 == 1 ? 16 : 12;
            android.media.AudioFormat build2 = new android.media.AudioFormat.Builder().setEncoding(2).setSampleRate(i17).setChannelMask(i27).build();
            int minBufferSize = android.media.AudioRecord.getMinBufferSize(i17, i27, 2);
            android.media.AudioRecord audioRecord = null;
            for (int i28 = 1; i28 <= 2 && audioRecord == null; i28++) {
                int i29 = minBufferSize * i28;
                if (i29 >= i19 * 4 || i28 >= 2) {
                    try {
                        audioRecord = new android.media.AudioRecord.Builder().setAudioFormat(build2).setBufferSizeInBytes(i29).setAudioPlaybackCaptureConfig(build).build();
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.w(com.p314xaae8f345.p373xbe494963.p376xac25df1c.C3735x39c9ab5a.TAG, "Create record error " + th6.getMessage(), new java.lang.Object[0]);
                        a(audioRecord);
                    }
                    if (audioRecord.getState() != 1) {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(com.p314xaae8f345.p373xbe494963.p376xac25df1c.C3735x39c9ab5a.TAG, "Audio record state error", new java.lang.Object[0]);
                        a(audioRecord);
                        audioRecord = null;
                    } else {
                        yj0.a.j(audioRecord, "com/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder", "a", "(Landroid/media/projection/MediaProjection;III)Landroid/media/AudioRecord;", "android/media/AudioRecord", "startRecording", "()V");
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(com.p314xaae8f345.p373xbe494963.p376xac25df1c.C3735x39c9ab5a.TAG, "Create audio record success", new java.lang.Object[0]);
                    }
                }
            }
            return audioRecord;
        }

        /* renamed from: read */
        public int m29192x355996(java.nio.ByteBuffer byteBuffer, int i17) {
            if (this.f127782a == null) {
                return -1;
            }
            byteBuffer.position(0);
            int read = this.f127782a.read(byteBuffer, i17);
            if (read > 0) {
                return read;
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(com.p314xaae8f345.p373xbe494963.p376xac25df1c.C3735x39c9ab5a.TAG, "Read failed ".concat(java.lang.String.valueOf(read)), new java.lang.Object[0]);
            return -1;
        }

        /* renamed from: startRecording */
        public int m29193x2619a7af(android.media.projection.MediaProjection mediaProjection, int i17, int i18, int i19) {
            try {
                android.media.AudioManager audioManager = this.f127783b;
                if (audioManager != null) {
                    audioManager.setAllowedCapturePolicy(3);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(com.p314xaae8f345.p373xbe494963.p376xac25df1c.C3735x39c9ab5a.TAG, "ForbidCaptureAudioFromCurrentApp error " + th6.getMessage(), new java.lang.Object[0]);
            }
            android.media.AudioManager audioManager2 = this.f127783b;
            int mode = audioManager2 != null ? audioManager2.getMode() : 0;
            a(0);
            this.f127782a = a(mediaProjection, i17, i18, i19);
            a(mode);
            if (this.f127782a == null) {
                return -1;
            }
            android.os.Process.setThreadPriority(-19);
            return 0;
        }

        /* renamed from: stopRecording */
        public void m29194xc350780f() {
            a(this.f127782a);
            this.f127782a = null;
        }

        private static void a(android.media.AudioRecord audioRecord) {
            if (audioRecord == null) {
                return;
            }
            try {
                if (audioRecord.getRecordingState() == 3) {
                    audioRecord.stop();
                }
                audioRecord.release();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(com.p314xaae8f345.p373xbe494963.p376xac25df1c.C3735x39c9ab5a.TAG, "Destroy AudioRecord failed." + th6.getMessage(), new java.lang.Object[0]);
            }
        }

        private void a(int i17) {
            try {
                android.media.AudioManager audioManager = this.f127783b;
                if (audioManager != null) {
                    audioManager.setMode(i17);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(com.p314xaae8f345.p373xbe494963.p376xac25df1c.C3735x39c9ab5a.TAG, "Set audio mode exception " + th6.getMessage(), new java.lang.Object[0]);
            }
        }
    }
}
