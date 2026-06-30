package org.p3371xd0ce3e8d.p3373x1ad5adf4;

/* renamed from: org.webrtc.voiceengine.WebRtcAudioTrack */
/* loaded from: classes15.dex */
public class C29935xdc81dd82 {

    /* renamed from: AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS */
    private static final long f76351xe946d8e1 = 2000;

    /* renamed from: BITS_PER_SAMPLE */
    private static final int f76352x5b950405 = 16;

    /* renamed from: BUFFERS_PER_SECOND */
    private static final int f76353x829ef5a2 = 100;

    /* renamed from: CALLBACK_BUFFER_SIZE_MS */
    private static final int f76354x565724df = 10;

    /* renamed from: DEBUG */
    private static final boolean f76355x3de9e33 = false;

    /* renamed from: DEFAULT_CONTENT_TYPE */
    private static final int f76356x205d14be = 2;

    /* renamed from: DEFAULT_STREAM_TYPE */
    private static final int f76357xd5c4c37b = 3;

    /* renamed from: DEFAULT_USAGE */
    private static final int f76358x3eec6de3;
    private static final java.lang.String TAG = "WebRtcAudioTrack";

    /* renamed from: errorCallback */
    private static org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.ErrorCallback f76359xc08cce6d;

    /* renamed from: errorCallbackOld */
    private static org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.WebRtcAudioTrackErrorCallback f76360x41cb347a;

    /* renamed from: speakerMute */
    private static volatile boolean f76361x6d2f0eb8;

    /* renamed from: usageAttribute */
    private static int f76362xac011fb;

    /* renamed from: audioManager */
    private final android.media.AudioManager f76363xd33b2ef7;

    /* renamed from: audioThread */
    private org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.AudioTrackThread f76364x1b68dd80;

    /* renamed from: audioTrack */
    private android.media.AudioTrack f76365x5bbd5b15;

    /* renamed from: byteBuffer */
    private java.nio.ByteBuffer f76366x93fb68;

    /* renamed from: emptyBytes */
    private byte[] f76367xbf48931e;

    /* renamed from: nativeAudioTrack */
    private final long f76368x41b9968c;

    /* renamed from: threadChecker */
    private final org.p3371xd0ce3e8d.C29882xd5f5f0a7.ThreadChecker f76369x33b65a4b;

    /* renamed from: org.webrtc.voiceengine.WebRtcAudioTrack$AudioTrackStartErrorCode */
    /* loaded from: classes6.dex */
    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    /* renamed from: org.webrtc.voiceengine.WebRtcAudioTrack$AudioTrackThread */
    /* loaded from: classes15.dex */
    public class AudioTrackThread extends java.lang.Thread {

        /* renamed from: keepAlive */
        private volatile boolean f76373x962be848;

        public AudioTrackThread(java.lang.String str) {
            super(str);
            this.f76373x962be848 = true;
        }

        /* renamed from: writeBytes */
        private int m156936xd87f8bcc(android.media.AudioTrack audioTrack, java.nio.ByteBuffer byteBuffer, int i17) {
            return audioTrack.write(byteBuffer, i17, 0);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            android.os.Process.setThreadPriority(-19);
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.TAG, "AudioTrackThread" + org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156950xa79a89ce());
            org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.m156905x7ca149f4(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.this.f76365x5bbd5b15.getPlayState() == 3);
            int capacity = org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.this.f76366x93fb68.capacity();
            while (this.f76373x962be848) {
                org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82 c29935xdc81dd82 = org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.this;
                c29935xdc81dd82.m156921xe02ddd25(capacity, c29935xdc81dd82.f76368x41b9968c);
                org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.m156905x7ca149f4(capacity <= org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.this.f76366x93fb68.remaining());
                if (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.f76361x6d2f0eb8) {
                    org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.this.f76366x93fb68.clear();
                    org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.this.f76366x93fb68.put(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.this.f76367xbf48931e);
                    org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.this.f76366x93fb68.position(0);
                }
                int m156936xd87f8bcc = m156936xd87f8bcc(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.this.f76365x5bbd5b15, org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.this.f76366x93fb68, capacity);
                if (m156936xd87f8bcc != capacity) {
                    org.p3371xd0ce3e8d.C29806x779f633f.e(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.TAG, "AudioTrack.write played invalid number of bytes: " + m156936xd87f8bcc);
                    if (m156936xd87f8bcc < 0) {
                        this.f76373x962be848 = false;
                        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.this.m156923x264cd8f2("AudioTrack.write failed: " + m156936xd87f8bcc);
                    }
                }
                org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.this.f76366x93fb68.rewind();
            }
            if (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.this.f76365x5bbd5b15 != null) {
                org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.TAG, "Calling AudioTrack.stop...");
                try {
                    org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.this.f76365x5bbd5b15.stop();
                    org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.TAG, "AudioTrack.stop is done.");
                } catch (java.lang.IllegalStateException e17) {
                    org.p3371xd0ce3e8d.C29806x779f633f.e(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.TAG, "AudioTrack.stop failed: " + e17.getMessage());
                }
            }
        }

        /* renamed from: stopThread */
        public void m156937xb0a278ac() {
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.TAG, "stopThread");
            this.f76373x962be848 = false;
        }
    }

    /* renamed from: org.webrtc.voiceengine.WebRtcAudioTrack$ErrorCallback */
    /* loaded from: classes15.dex */
    public interface ErrorCallback {
        /* renamed from: onWebRtcAudioTrackError */
        void m156938xc5efc927(java.lang.String str);

        /* renamed from: onWebRtcAudioTrackInitError */
        void m156939x24c17677(java.lang.String str);

        /* renamed from: onWebRtcAudioTrackStartError */
        void m156940x1cca2f07(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.AudioTrackStartErrorCode audioTrackStartErrorCode, java.lang.String str);
    }

    @java.lang.Deprecated
    /* renamed from: org.webrtc.voiceengine.WebRtcAudioTrack$WebRtcAudioTrackErrorCallback */
    /* loaded from: classes15.dex */
    public interface WebRtcAudioTrackErrorCallback {
        /* renamed from: onWebRtcAudioTrackError */
        void m156941xc5efc927(java.lang.String str);

        /* renamed from: onWebRtcAudioTrackInitError */
        void m156942x24c17677(java.lang.String str);

        /* renamed from: onWebRtcAudioTrackStartError */
        void m156943x1cca2f07(java.lang.String str);
    }

    static {
        int m156910x550e00e6 = m156910x550e00e6();
        f76358x3eec6de3 = m156910x550e00e6;
        f76362xac011fb = m156910x550e00e6;
    }

    public C29935xdc81dd82(long j17) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.ThreadChecker threadChecker = new org.p3371xd0ce3e8d.C29882xd5f5f0a7.ThreadChecker();
        this.f76369x33b65a4b = threadChecker;
        threadChecker.m156480x23129e95();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "ctor" + org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156950xa79a89ce());
        this.f76368x41b9968c = j17;
        this.f76363xd33b2ef7 = (android.media.AudioManager) org.p3371xd0ce3e8d.C29752x4bd17462.m155345x6e669035().getSystemService("audio");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: assertTrue */
    public static void m156905x7ca149f4(boolean z17) {
        if (!z17) {
            throw new java.lang.AssertionError("Expected condition to be true");
        }
    }

    /* renamed from: channelCountToConfiguration */
    private int m156906x1e2f8ecf(int i17) {
        return i17 == 1 ? 4 : 12;
    }

    /* renamed from: createAudioTrackOnLollipopOrHigher */
    private static android.media.AudioTrack m156907x674703cd(int i17, int i18, int i19) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = android.media.AudioTrack.getNativeOutputSampleRate(3);
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i17 != nativeOutputSampleRate) {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        if (f76362xac011fb != f76358x3eec6de3) {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "A non default usage attribute is used: " + f76362xac011fb);
        }
        return new android.media.AudioTrack(new android.media.AudioAttributes.Builder().setUsage(f76362xac011fb).setContentType(2).build(), new android.media.AudioFormat.Builder().setEncoding(2).setSampleRate(i17).setChannelMask(i18).build(), i19, 1, 0);
    }

    /* renamed from: createAudioTrackOnLowerThanLollipop */
    private static android.media.AudioTrack m156908xf6ea8f5d(int i17, int i18, int i19) {
        return new android.media.AudioTrack(3, i17, i18, 2, i19, 1);
    }

    /* renamed from: getBufferSizeInFrames */
    private int m156909x83abeba2() {
        return this.f76365x5bbd5b15.getBufferSizeInFrames();
    }

    /* renamed from: getDefaultUsageAttribute */
    private static int m156910x550e00e6() {
        return 1;
    }

    /* renamed from: getStreamMaxVolume */
    private int m156911xa1b0efc8() {
        this.f76369x33b65a4b.m156480x23129e95();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "getStreamMaxVolume");
        m156905x7ca149f4(this.f76363xd33b2ef7 != null);
        return this.f76363xd33b2ef7.getStreamMaxVolume(3);
    }

    /* renamed from: getStreamVolume */
    private int m156912x107e1530() {
        this.f76369x33b65a4b.m156480x23129e95();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "getStreamVolume");
        m156905x7ca149f4(this.f76363xd33b2ef7 != null);
        return this.f76363xd33b2ef7.getStreamVolume(3);
    }

    /* renamed from: initPlayout */
    private int m156913x3143486a(int i17, int i18, double d17) {
        this.f76369x33b65a4b.m156480x23129e95();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "initPlayout(sampleRate=" + i17 + ", channels=" + i18 + ", bufferSizeFactor=" + d17 + ")");
        this.f76366x93fb68 = java.nio.ByteBuffer.allocateDirect(i18 * 2 * (i17 / 100));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("byteBuffer.capacity: ");
        sb6.append(this.f76366x93fb68.capacity());
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, sb6.toString());
        this.f76367xbf48931e = new byte[this.f76366x93fb68.capacity()];
        m156920xf9a44280(this.f76366x93fb68, this.f76368x41b9968c);
        int m156906x1e2f8ecf = m156906x1e2f8ecf(i18);
        int minBufferSize = (int) (android.media.AudioTrack.getMinBufferSize(i17, m156906x1e2f8ecf, 2) * d17);
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "minBufferSizeInBytes: " + minBufferSize);
        if (minBufferSize < this.f76366x93fb68.capacity()) {
            m156924xed2ba8c2("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        }
        if (this.f76365x5bbd5b15 != null) {
            m156924xed2ba8c2("Conflict with existing AudioTrack.");
            return -1;
        }
        try {
            android.media.AudioTrack m156907x674703cd = m156907x674703cd(i17, m156906x1e2f8ecf, minBufferSize);
            this.f76365x5bbd5b15 = m156907x674703cd;
            if (m156907x674703cd == null || m156907x674703cd.getState() != 1) {
                m156924xed2ba8c2("Initialization of audio track failed.");
                m156922x4560ed6();
                return -1;
            }
            m156917xd6f8e7();
            m156918x7770f340();
            return minBufferSize;
        } catch (java.lang.IllegalArgumentException e17) {
            m156924xed2ba8c2(e17.getMessage());
            m156922x4560ed6();
            return -1;
        }
    }

    /* renamed from: isVolumeFixed */
    private boolean m156914x766c0cf0() {
        return this.f76363xd33b2ef7.isVolumeFixed();
    }

    /* renamed from: logBufferCapacityInFrames */
    private void m156915xf81e89c9() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "AudioTrack: buffer capacity in frames: " + this.f76365x5bbd5b15.getBufferCapacityInFrames());
    }

    /* renamed from: logBufferSizeInFrames */
    private void m156916x5d542010() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "AudioTrack: buffer size in frames: " + this.f76365x5bbd5b15.getBufferSizeInFrames());
    }

    /* renamed from: logMainParameters */
    private void m156917xd6f8e7() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "AudioTrack: session ID: " + this.f76365x5bbd5b15.getAudioSessionId() + ", channels: " + this.f76365x5bbd5b15.getChannelCount() + ", sample rate: " + this.f76365x5bbd5b15.getSampleRate() + ", max gain: " + android.media.AudioTrack.getMaxVolume());
    }

    /* renamed from: logMainParametersExtended */
    private void m156918x7770f340() {
        m156916x5d542010();
        m156915xf81e89c9();
    }

    /* renamed from: logUnderrunCount */
    private void m156919x3fa06b38() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "underrun count: " + this.f76365x5bbd5b15.getUnderrunCount());
    }

    /* renamed from: nativeCacheDirectBufferAddress */
    private native void m156920xf9a44280(java.nio.ByteBuffer byteBuffer, long j17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeGetPlayoutData */
    public native void m156921xe02ddd25(int i17, long j17);

    /* renamed from: releaseAudioResources */
    private void m156922x4560ed6() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "releaseAudioResources");
        android.media.AudioTrack audioTrack = this.f76365x5bbd5b15;
        if (audioTrack != null) {
            audioTrack.release();
            this.f76365x5bbd5b15 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reportWebRtcAudioTrackError */
    public void m156923x264cd8f2(java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Run-time playback error: " + str);
        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156958xafd368bf(TAG);
        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = f76360x41cb347a;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.m156941xc5efc927(str);
        }
        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.ErrorCallback errorCallback = f76359xc08cce6d;
        if (errorCallback != null) {
            errorCallback.m156938xc5efc927(str);
        }
    }

    /* renamed from: reportWebRtcAudioTrackInitError */
    private void m156924xed2ba8c2(java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Init playout error: " + str);
        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156958xafd368bf(TAG);
        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = f76360x41cb347a;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.m156942x24c17677(str);
        }
        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.ErrorCallback errorCallback = f76359xc08cce6d;
        if (errorCallback != null) {
            errorCallback.m156939x24c17677(str);
        }
    }

    /* renamed from: reportWebRtcAudioTrackStartError */
    private void m156925x61a6461c(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.AudioTrackStartErrorCode audioTrackStartErrorCode, java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156958xafd368bf(TAG);
        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = f76360x41cb347a;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.m156943x1cca2f07(str);
        }
        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.ErrorCallback errorCallback = f76359xc08cce6d;
        if (errorCallback != null) {
            errorCallback.m156940x1cca2f07(audioTrackStartErrorCode, str);
        }
    }

    /* renamed from: setAudioTrackUsageAttribute */
    public static synchronized void m156926x99a20af2(int i17) {
        synchronized (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.class) {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Default usage attribute is changed from: " + f76358x3eec6de3 + " to " + i17);
            f76362xac011fb = i17;
        }
    }

    @java.lang.Deprecated
    /* renamed from: setErrorCallback */
    public static void m156928x10c2f12b(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Set error callback (deprecated");
        f76360x41cb347a = webRtcAudioTrackErrorCallback;
    }

    /* renamed from: setSpeakerMute */
    public static void m156929xdd6ac8f6(boolean z17) {
        org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "setSpeakerMute(" + z17 + ")");
        f76361x6d2f0eb8 = z17;
    }

    /* renamed from: setStreamVolume */
    private boolean m156930x46c7103c(int i17) {
        this.f76369x33b65a4b.m156480x23129e95();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "setStreamVolume(" + i17 + ")");
        m156905x7ca149f4(this.f76363xd33b2ef7 != null);
        if (m156914x766c0cf0()) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.f76363xd33b2ef7.setStreamVolume(3, i17, 0);
        return true;
    }

    /* renamed from: startPlayout */
    private boolean m156931xda9168d8() {
        this.f76369x33b65a4b.m156480x23129e95();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "startPlayout");
        m156905x7ca149f4(this.f76365x5bbd5b15 != null);
        m156905x7ca149f4(this.f76364x1b68dd80 == null);
        try {
            this.f76365x5bbd5b15.play();
            if (this.f76365x5bbd5b15.getPlayState() == 3) {
                org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.AudioTrackThread audioTrackThread = new org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.AudioTrackThread("AudioTrackJavaThread");
                this.f76364x1b68dd80 = audioTrackThread;
                audioTrackThread.start();
                return true;
            }
            m156925x61a6461c(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, "AudioTrack.play failed - incorrect state :" + this.f76365x5bbd5b15.getPlayState());
            m156922x4560ed6();
            return false;
        } catch (java.lang.IllegalStateException e17) {
            m156925x61a6461c(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, "AudioTrack.play failed: " + e17.getMessage());
            m156922x4560ed6();
            return false;
        }
    }

    /* renamed from: stopPlayout */
    private boolean m156932x9600d138() {
        this.f76369x33b65a4b.m156480x23129e95();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "stopPlayout");
        m156905x7ca149f4(this.f76364x1b68dd80 != null);
        m156919x3fa06b38();
        this.f76364x1b68dd80.m156937xb0a278ac();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Stopping the AudioTrackThread...");
        this.f76364x1b68dd80.interrupt();
        if (!org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156479x7fa650c6(this.f76364x1b68dd80, 2000L)) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Join of AudioTrackThread timed out.");
            org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156958xafd368bf(TAG);
        }
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "AudioTrackThread has now been stopped.");
        this.f76364x1b68dd80 = null;
        m156922x4560ed6();
        return true;
    }

    /* renamed from: setErrorCallback */
    public static void m156927x10c2f12b(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29935xdc81dd82.ErrorCallback errorCallback) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Set extended error callback");
        f76359xc08cce6d = errorCallback;
    }
}
