package com.tencent.liteav.audio2;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::audio")
/* loaded from: classes13.dex */
public class SystemLoopbackRecorder2 {
    private static final java.lang.String TAG = "SystemLoopbackRecorder2";

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f46248a = 0;
    private static final java.lang.Object mLock = new java.lang.Object();
    private static android.media.projection.MediaProjection mMediaProjection;
    private static volatile long mNativeSystemLoopbackRecorder;

    public SystemLoopbackRecorder2(long j17) {
        mNativeSystemLoopbackRecorder = j17;
    }

    private static native void nativeSetMediaProjectionSession(long j17, android.media.projection.MediaProjection mediaProjection);

    public static void notifyMediaProjectionState(android.media.projection.MediaProjection mediaProjection) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Received MediaProjection state ");
        sb6.append(mediaProjection != null);
        com.tencent.liteav.base.Log.i(TAG, sb6.toString(), new java.lang.Object[0]);
        synchronized (mLock) {
            mMediaProjection = mediaProjection;
            setMediaProjectionSession();
        }
    }

    public static void setMediaProjectionSession() {
        if (mMediaProjection == null) {
            com.tencent.liteav.base.Log.i(TAG, "MediaProjection is null.", new java.lang.Object[0]);
        } else if (mNativeSystemLoopbackRecorder != 0) {
            nativeSetMediaProjectionSession(mNativeSystemLoopbackRecorder, mMediaProjection);
        }
    }

    public android.media.projection.MediaProjection getMediaProjection() {
        return mMediaProjection;
    }

    public void releaseNativeSystemLoopbackRecorder() {
        mNativeSystemLoopbackRecorder = 0L;
    }

    /* loaded from: classes14.dex */
    public static class Recorder {

        /* renamed from: a, reason: collision with root package name */
        private android.media.AudioRecord f46249a;

        /* renamed from: b, reason: collision with root package name */
        private android.media.AudioManager f46250b;

        public Recorder() {
            android.content.Context applicationContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();
            com.tencent.liteav.base.ContextUtils.getApplicationContext();
            this.f46250b = (android.media.AudioManager) applicationContext.getSystemService("audio");
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
                        com.tencent.liteav.base.Log.w(com.tencent.liteav.audio2.SystemLoopbackRecorder2.TAG, "Create record error " + th6.getMessage(), new java.lang.Object[0]);
                        a(audioRecord);
                    }
                    if (audioRecord.getState() != 1) {
                        com.tencent.liteav.base.Log.e(com.tencent.liteav.audio2.SystemLoopbackRecorder2.TAG, "Audio record state error", new java.lang.Object[0]);
                        a(audioRecord);
                        audioRecord = null;
                    } else {
                        yj0.a.j(audioRecord, "com/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder", "a", "(Landroid/media/projection/MediaProjection;III)Landroid/media/AudioRecord;", "android/media/AudioRecord", "startRecording", "()V");
                        com.tencent.liteav.base.Log.i(com.tencent.liteav.audio2.SystemLoopbackRecorder2.TAG, "Create audio record success", new java.lang.Object[0]);
                    }
                }
            }
            return audioRecord;
        }

        public int read(java.nio.ByteBuffer byteBuffer, int i17) {
            if (this.f46249a == null) {
                return -1;
            }
            byteBuffer.position(0);
            int read = this.f46249a.read(byteBuffer, i17);
            if (read > 0) {
                return read;
            }
            com.tencent.liteav.base.Log.e(com.tencent.liteav.audio2.SystemLoopbackRecorder2.TAG, "Read failed ".concat(java.lang.String.valueOf(read)), new java.lang.Object[0]);
            return -1;
        }

        public int startRecording(android.media.projection.MediaProjection mediaProjection, int i17, int i18, int i19) {
            try {
                android.media.AudioManager audioManager = this.f46250b;
                if (audioManager != null) {
                    audioManager.setAllowedCapturePolicy(3);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.liteav.base.Log.e(com.tencent.liteav.audio2.SystemLoopbackRecorder2.TAG, "ForbidCaptureAudioFromCurrentApp error " + th6.getMessage(), new java.lang.Object[0]);
            }
            android.media.AudioManager audioManager2 = this.f46250b;
            int mode = audioManager2 != null ? audioManager2.getMode() : 0;
            a(0);
            this.f46249a = a(mediaProjection, i17, i18, i19);
            a(mode);
            if (this.f46249a == null) {
                return -1;
            }
            android.os.Process.setThreadPriority(-19);
            return 0;
        }

        public void stopRecording() {
            a(this.f46249a);
            this.f46249a = null;
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
                com.tencent.liteav.base.Log.e(com.tencent.liteav.audio2.SystemLoopbackRecorder2.TAG, "Destroy AudioRecord failed." + th6.getMessage(), new java.lang.Object[0]);
            }
        }

        private void a(int i17) {
            try {
                android.media.AudioManager audioManager = this.f46250b;
                if (audioManager != null) {
                    audioManager.setMode(i17);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.liteav.base.Log.e(com.tencent.liteav.audio2.SystemLoopbackRecorder2.TAG, "Set audio mode exception " + th6.getMessage(), new java.lang.Object[0]);
            }
        }
    }
}
