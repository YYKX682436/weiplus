package org.p3371xd0ce3e8d.p3372x58d9bd6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.webrtc.audio.WebRtcAudioTrack */
/* loaded from: classes15.dex */
public class C29929xdc81dd82 {

    /* renamed from: AUDIO_TRACK_START */
    private static final int f76261x329a7d25 = 0;

    /* renamed from: AUDIO_TRACK_STOP */
    private static final int f76262x22aa26bf = 1;

    /* renamed from: AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS */
    private static final long f76263xe946d8e1 = 2000;

    /* renamed from: BITS_PER_SAMPLE */
    private static final int f76264x5b950405 = 16;

    /* renamed from: BUFFERS_PER_SECOND */
    private static final int f76265x829ef5a2 = 100;

    /* renamed from: CALLBACK_BUFFER_SIZE_MS */
    private static final int f76266x565724df = 10;

    /* renamed from: DEFAULT_USAGE */
    private static final int f76267x3eec6de3 = m156755x550e00e6();
    private static final java.lang.String TAG = "WebRtcAudioTrackExternal";

    /* renamed from: audioAttributes */
    private final android.media.AudioAttributes f76268xb7b4cdcd;

    /* renamed from: audioManager */
    private final android.media.AudioManager f76269xd33b2ef7;

    /* renamed from: audioThread */
    private org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.AudioTrackThread f76270x1b68dd80;

    /* renamed from: audioTrack */
    private android.media.AudioTrack f76271x5bbd5b15;

    /* renamed from: byteBuffer */
    private java.nio.ByteBuffer f76272x93fb68;

    /* renamed from: context */
    private final android.content.Context f76273x38b735af;

    /* renamed from: emptyBytes */
    private byte[] f76274xbf48931e;

    /* renamed from: errorCallback */
    private final org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioTrackErrorCallback f76275xc08cce6d;

    /* renamed from: initialBufferSizeInFrames */
    private int f76276x746ed410;

    /* renamed from: nativeAudioTrack */
    private long f76277x41b9968c;

    /* renamed from: speakerMute */
    private volatile boolean f76278x6d2f0eb8;

    /* renamed from: stateCallback */
    private final org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioTrackStateCallback f76279x35e027f6;

    /* renamed from: threadChecker */
    private final org.p3371xd0ce3e8d.C29882xd5f5f0a7.ThreadChecker f76280x33b65a4b;

    /* renamed from: useLowLatency */
    private boolean f76281xae813ff1;

    /* renamed from: volumeLogger */
    private final org.p3371xd0ce3e8d.p3372x58d9bd6.C29924x98cbe16a f76282x8f008d4a;

    /* renamed from: org.webrtc.audio.WebRtcAudioTrack$AudioTrackThread */
    /* loaded from: classes15.dex */
    public class AudioTrackThread extends java.lang.Thread {

        /* renamed from: bufferManager */
        private org.p3371xd0ce3e8d.p3372x58d9bd6.C29923x81ae47e1 f76283xd102cb4d;

        /* renamed from: keepAlive */
        private volatile boolean f76284x962be848;

        public AudioTrackThread(java.lang.String str) {
            super(str);
            this.f76284x962be848 = true;
            this.f76283xd102cb4d = new org.p3371xd0ce3e8d.p3372x58d9bd6.C29923x81ae47e1();
        }

        /* renamed from: writeBytes */
        private int m156778xd87f8bcc(android.media.AudioTrack audioTrack, java.nio.ByteBuffer byteBuffer, int i17) {
            return audioTrack.write(byteBuffer, i17, 0);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            android.os.Process.setThreadPriority(-19);
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.TAG, "AudioTrackThread" + org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156784xa79a89ce());
            org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.m156747x7ca149f4(org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.this.f76271x5bbd5b15.getPlayState() == 3);
            org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.this.m156752xc41745d6(0);
            int capacity = org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.this.f76272x93fb68.capacity();
            while (this.f76284x962be848) {
                org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.m156768xe02ddd25(org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.this.f76277x41b9968c, capacity);
                org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.m156747x7ca149f4(capacity <= org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.this.f76272x93fb68.remaining());
                if (org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.this.f76278x6d2f0eb8) {
                    org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.this.f76272x93fb68.clear();
                    org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.this.f76272x93fb68.put(org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.this.f76274xbf48931e);
                    org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.this.f76272x93fb68.position(0);
                }
                int m156778xd87f8bcc = m156778xd87f8bcc(org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.this.f76271x5bbd5b15, org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.this.f76272x93fb68, capacity);
                if (m156778xd87f8bcc != capacity) {
                    org.p3371xd0ce3e8d.C29806x779f633f.e(org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.TAG, "AudioTrack.write played invalid number of bytes: " + m156778xd87f8bcc);
                    if (m156778xd87f8bcc < 0) {
                        this.f76284x962be848 = false;
                        org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.this.m156770x264cd8f2("AudioTrack.write failed: " + m156778xd87f8bcc);
                    }
                }
                if (org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.this.f76281xae813ff1) {
                    this.f76283xd102cb4d.m156662x262d55d8(org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.this.f76271x5bbd5b15);
                }
                org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.this.f76272x93fb68.rewind();
            }
        }

        /* renamed from: stopThread */
        public void m156779xb0a278ac() {
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.TAG, "stopThread");
            this.f76284x962be848 = false;
        }
    }

    public C29929xdc81dd82(android.content.Context context, android.media.AudioManager audioManager) {
        this(context, audioManager, null, null, null, false);
    }

    /* renamed from: GetPlayoutUnderrunCount */
    private int m156735x9595f6f8() {
        android.media.AudioTrack audioTrack = this.f76271x5bbd5b15;
        if (audioTrack != null) {
            return audioTrack.getUnderrunCount();
        }
        return -1;
    }

    /* renamed from: applyAttributesOnQOrHigher */
    private static android.media.AudioAttributes.Builder m156746xe70add5f(android.media.AudioAttributes.Builder builder, android.media.AudioAttributes audioAttributes) {
        return builder.setAllowedCapturePolicy(audioAttributes.getAllowedCapturePolicy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: assertTrue */
    public static void m156747x7ca149f4(boolean z17) {
        if (!z17) {
            throw new java.lang.AssertionError("Expected condition to be true");
        }
    }

    /* renamed from: channelCountToConfiguration */
    private int m156748x1e2f8ecf(int i17) {
        return i17 == 1 ? 4 : 12;
    }

    /* renamed from: createAudioTrackOnLollipopOrHigher */
    private static android.media.AudioTrack m156749x674703cd(int i17, int i18, int i19, android.media.AudioAttributes audioAttributes) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "createAudioTrackOnLollipopOrHigher");
        m156765x3e780426(i17);
        return new android.media.AudioTrack(m156753x9c169f97(audioAttributes), new android.media.AudioFormat.Builder().setEncoding(2).setSampleRate(i17).setChannelMask(i18).build(), i19, 1, 0);
    }

    /* renamed from: createAudioTrackOnLowerThanLollipop */
    private static android.media.AudioTrack m156750xf6ea8f5d(int i17, int i18, int i19) {
        return new android.media.AudioTrack(0, i17, i18, 2, i19, 1);
    }

    /* renamed from: createAudioTrackOnOreoOrHigher */
    private static android.media.AudioTrack m156751x7086fd8f(int i17, int i18, int i19, android.media.AudioAttributes audioAttributes) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "createAudioTrackOnOreoOrHigher");
        m156765x3e780426(i17);
        return new android.media.AudioTrack.Builder().setAudioAttributes(m156753x9c169f97(audioAttributes)).setAudioFormat(new android.media.AudioFormat.Builder().setEncoding(2).setSampleRate(i17).setChannelMask(i18).build()).setBufferSizeInBytes(i19).setPerformanceMode(1).setTransferMode(1).setSessionId(0).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doAudioTrackStateCallback */
    public void m156752xc41745d6(int i17) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "doAudioTrackStateCallback: " + i17);
        org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioTrackStateCallback audioTrackStateCallback = this.f76279x35e027f6;
        if (audioTrackStateCallback != null) {
            if (i17 == 0) {
                audioTrackStateCallback.m156641xc6b5bb81();
            } else if (i17 == 1) {
                audioTrackStateCallback.m156642xa3503103();
            } else {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Invalid audio state");
            }
        }
    }

    /* renamed from: getAudioAttributes */
    private static android.media.AudioAttributes m156753x9c169f97(android.media.AudioAttributes audioAttributes) {
        android.media.AudioAttributes.Builder contentType = new android.media.AudioAttributes.Builder().setUsage(f76267x3eec6de3).setContentType(1);
        if (audioAttributes != null) {
            if (audioAttributes.getUsage() != 0) {
                contentType.setUsage(audioAttributes.getUsage());
            }
            if (audioAttributes.getContentType() != 0) {
                contentType.setContentType(audioAttributes.getContentType());
            }
            contentType.setFlags(audioAttributes.getFlags());
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                contentType = m156746xe70add5f(contentType, audioAttributes);
            }
        }
        return contentType.build();
    }

    /* renamed from: getBufferSizeInFrames */
    private int m156754x83abeba2() {
        return this.f76271x5bbd5b15.getBufferSizeInFrames();
    }

    /* renamed from: getDefaultUsageAttribute */
    private static int m156755x550e00e6() {
        return 2;
    }

    /* renamed from: getInitialBufferSizeInFrames */
    private int m156756x45f4715a() {
        return this.f76276x746ed410;
    }

    /* renamed from: getStreamMaxVolume */
    private int m156757xa1b0efc8() {
        this.f76280x33b65a4b.m156480x23129e95();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "getStreamMaxVolume");
        return this.f76269xd33b2ef7.getStreamMaxVolume(0);
    }

    /* renamed from: getStreamVolume */
    private int m156758x107e1530() {
        this.f76280x33b65a4b.m156480x23129e95();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "getStreamVolume");
        return this.f76269xd33b2ef7.getStreamVolume(0);
    }

    /* renamed from: initPlayout */
    private int m156759x3143486a(int i17, int i18, double d17) {
        this.f76280x33b65a4b.m156480x23129e95();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "initPlayout(sampleRate=" + i17 + ", channels=" + i18 + ", bufferSizeFactor=" + d17 + ")");
        this.f76272x93fb68 = java.nio.ByteBuffer.allocateDirect(i18 * 2 * (i17 / 100));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("byteBuffer.capacity: ");
        sb6.append(this.f76272x93fb68.capacity());
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, sb6.toString());
        this.f76274xbf48931e = new byte[this.f76272x93fb68.capacity()];
        m156767xf9a44280(this.f76277x41b9968c, this.f76272x93fb68);
        int m156748x1e2f8ecf = m156748x1e2f8ecf(i18);
        int minBufferSize = (int) (android.media.AudioTrack.getMinBufferSize(i17, m156748x1e2f8ecf, 2) * d17);
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "minBufferSizeInBytes: " + minBufferSize);
        if (minBufferSize < this.f76272x93fb68.capacity()) {
            m156771xed2ba8c2("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        }
        if (d17 > 1.0d) {
            this.f76281xae813ff1 = false;
        }
        if (this.f76271x5bbd5b15 != null) {
            m156771xed2ba8c2("Conflict with existing AudioTrack.");
            return -1;
        }
        try {
            if (!this.f76281xae813ff1 || android.os.Build.VERSION.SDK_INT < 26) {
                this.f76271x5bbd5b15 = m156749x674703cd(i17, m156748x1e2f8ecf, minBufferSize, this.f76268xb7b4cdcd);
            } else {
                this.f76271x5bbd5b15 = m156751x7086fd8f(i17, m156748x1e2f8ecf, minBufferSize, this.f76268xb7b4cdcd);
            }
            android.media.AudioTrack audioTrack = this.f76271x5bbd5b15;
            if (audioTrack == null || audioTrack.getState() != 1) {
                m156771xed2ba8c2("Initialization of audio track failed.");
                m156769x4560ed6();
                return -1;
            }
            this.f76276x746ed410 = this.f76271x5bbd5b15.getBufferSizeInFrames();
            m156763xd6f8e7();
            m156764x7770f340();
            return minBufferSize;
        } catch (java.lang.IllegalArgumentException e17) {
            m156771xed2ba8c2(e17.getMessage());
            m156769x4560ed6();
            return -1;
        }
    }

    /* renamed from: isVolumeFixed */
    private boolean m156760x766c0cf0() {
        return this.f76269xd33b2ef7.isVolumeFixed();
    }

    /* renamed from: logBufferCapacityInFrames */
    private void m156761xf81e89c9() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "AudioTrack: buffer capacity in frames: " + this.f76271x5bbd5b15.getBufferCapacityInFrames());
    }

    /* renamed from: logBufferSizeInFrames */
    private void m156762x5d542010() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "AudioTrack: buffer size in frames: " + this.f76271x5bbd5b15.getBufferSizeInFrames());
    }

    /* renamed from: logMainParameters */
    private void m156763xd6f8e7() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "AudioTrack: session ID: " + this.f76271x5bbd5b15.getAudioSessionId() + ", channels: " + this.f76271x5bbd5b15.getChannelCount() + ", sample rate: " + this.f76271x5bbd5b15.getSampleRate() + ", max gain: " + android.media.AudioTrack.getMaxVolume());
    }

    /* renamed from: logMainParametersExtended */
    private void m156764x7770f340() {
        m156762x5d542010();
        m156761xf81e89c9();
    }

    /* renamed from: logNativeOutputSampleRate */
    private static void m156765x3e780426(int i17) {
        int nativeOutputSampleRate = android.media.AudioTrack.getNativeOutputSampleRate(0);
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i17 != nativeOutputSampleRate) {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
    }

    /* renamed from: logUnderrunCount */
    private void m156766x3fa06b38() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "underrun count: " + this.f76271x5bbd5b15.getUnderrunCount());
    }

    /* renamed from: nativeCacheDirectBufferAddress */
    private static native void m156767xf9a44280(long j17, java.nio.ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeGetPlayoutData */
    public static native void m156768xe02ddd25(long j17, int i17);

    /* renamed from: releaseAudioResources */
    private void m156769x4560ed6() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "releaseAudioResources");
        android.media.AudioTrack audioTrack = this.f76271x5bbd5b15;
        if (audioTrack != null) {
            audioTrack.release();
            this.f76271x5bbd5b15 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reportWebRtcAudioTrackError */
    public void m156770x264cd8f2(java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Run-time playback error: " + str);
        org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156788xafd368bf(TAG, this.f76273x38b735af, this.f76269xd33b2ef7);
        org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioTrackErrorCallback audioTrackErrorCallback = this.f76275xc08cce6d;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.m156635xc5efc927(str);
        }
    }

    /* renamed from: reportWebRtcAudioTrackInitError */
    private void m156771xed2ba8c2(java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Init playout error: " + str);
        org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156788xafd368bf(TAG, this.f76273x38b735af, this.f76269xd33b2ef7);
        org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioTrackErrorCallback audioTrackErrorCallback = this.f76275xc08cce6d;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.m156636x24c17677(str);
        }
    }

    /* renamed from: reportWebRtcAudioTrackStartError */
    private void m156772x61a6461c(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioTrackStartErrorCode audioTrackStartErrorCode, java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156788xafd368bf(TAG, this.f76273x38b735af, this.f76269xd33b2ef7);
        org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioTrackErrorCallback audioTrackErrorCallback = this.f76275xc08cce6d;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.m156637x1cca2f07(audioTrackStartErrorCode, str);
        }
    }

    /* renamed from: setStreamVolume */
    private boolean m156773x46c7103c(int i17) {
        this.f76280x33b65a4b.m156480x23129e95();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "setStreamVolume(" + i17 + ")");
        if (m156760x766c0cf0()) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.f76269xd33b2ef7.setStreamVolume(0, i17, 0);
        return true;
    }

    /* renamed from: startPlayout */
    private boolean m156774xda9168d8() {
        this.f76280x33b65a4b.m156480x23129e95();
        this.f76282x8f008d4a.m156664x68ac462();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "startPlayout");
        m156747x7ca149f4(this.f76271x5bbd5b15 != null);
        m156747x7ca149f4(this.f76270x1b68dd80 == null);
        try {
            this.f76271x5bbd5b15.play();
            if (this.f76271x5bbd5b15.getPlayState() == 3) {
                org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.AudioTrackThread audioTrackThread = new org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82.AudioTrackThread("AudioTrackJavaThread");
                this.f76270x1b68dd80 = audioTrackThread;
                audioTrackThread.start();
                return true;
            }
            m156772x61a6461c(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, "AudioTrack.play failed - incorrect state :" + this.f76271x5bbd5b15.getPlayState());
            m156769x4560ed6();
            return false;
        } catch (java.lang.IllegalStateException e17) {
            m156772x61a6461c(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, "AudioTrack.play failed: " + e17.getMessage());
            m156769x4560ed6();
            return false;
        }
    }

    /* renamed from: stopPlayout */
    private boolean m156775x9600d138() {
        this.f76280x33b65a4b.m156480x23129e95();
        this.f76282x8f008d4a.m156665x360802();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "stopPlayout");
        m156747x7ca149f4(this.f76270x1b68dd80 != null);
        m156766x3fa06b38();
        this.f76270x1b68dd80.m156779xb0a278ac();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Stopping the AudioTrackThread...");
        this.f76270x1b68dd80.interrupt();
        if (!org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156479x7fa650c6(this.f76270x1b68dd80, 2000L)) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Join of AudioTrackThread timed out.");
            org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156788xafd368bf(TAG, this.f76273x38b735af, this.f76269xd33b2ef7);
        }
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "AudioTrackThread has now been stopped.");
        this.f76270x1b68dd80 = null;
        if (this.f76271x5bbd5b15 != null) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Calling AudioTrack.stop...");
            try {
                this.f76271x5bbd5b15.stop();
                org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "AudioTrack.stop is done.");
                m156752xc41745d6(1);
            } catch (java.lang.IllegalStateException e17) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "AudioTrack.stop failed: " + e17.getMessage());
            }
        }
        m156769x4560ed6();
        return true;
    }

    /* renamed from: setNativeAudioTrack */
    public void m156776x8d8e930e(long j17) {
        this.f76277x41b9968c = j17;
    }

    /* renamed from: setSpeakerMute */
    public void m156777xdd6ac8f6(boolean z17) {
        org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "setSpeakerMute(" + z17 + ")");
        this.f76278x6d2f0eb8 = z17;
    }

    public C29929xdc81dd82(android.content.Context context, android.media.AudioManager audioManager, android.media.AudioAttributes audioAttributes, org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioTrackErrorCallback audioTrackErrorCallback, org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioTrackStateCallback audioTrackStateCallback, boolean z17) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.ThreadChecker threadChecker = new org.p3371xd0ce3e8d.C29882xd5f5f0a7.ThreadChecker();
        this.f76280x33b65a4b = threadChecker;
        threadChecker.m156481xddb6d77d();
        this.f76273x38b735af = context;
        this.f76269xd33b2ef7 = audioManager;
        this.f76268xb7b4cdcd = audioAttributes;
        this.f76275xc08cce6d = audioTrackErrorCallback;
        this.f76279x35e027f6 = audioTrackStateCallback;
        this.f76282x8f008d4a = new org.p3371xd0ce3e8d.p3372x58d9bd6.C29924x98cbe16a(audioManager);
        this.f76281xae813ff1 = z17;
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "ctor" + org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156784xa79a89ce());
    }
}
