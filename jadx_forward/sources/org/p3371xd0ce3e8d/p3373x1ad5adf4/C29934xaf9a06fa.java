package org.p3371xd0ce3e8d.p3373x1ad5adf4;

/* renamed from: org.webrtc.voiceengine.WebRtcAudioRecord */
/* loaded from: classes15.dex */
public class C29934xaf9a06fa {

    /* renamed from: AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS */
    private static final long f76325x6462c49 = 2000;

    /* renamed from: BITS_PER_SAMPLE */
    private static final int f76326x5b950405 = 16;

    /* renamed from: BUFFERS_PER_SECOND */
    private static final int f76327x829ef5a2 = 100;

    /* renamed from: BUFFER_SIZE_FACTOR */
    private static final int f76328x2fec5ce = 2;

    /* renamed from: CALLBACK_BUFFER_SIZE_MS */
    private static final int f76329x565724df = 10;

    /* renamed from: DEBUG */
    private static final boolean f76330x3de9e33 = false;

    /* renamed from: DEFAULT_AUDIO_SOURCE */
    private static final int f76331x34068222;
    private static final java.lang.String TAG = "WebRtcAudioRecord";

    /* renamed from: audioSamplesReadyCallback */
    private static org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.WebRtcAudioRecordSamplesReadyCallback f76332x4d169a75;

    /* renamed from: audioSource */
    private static int f76333x1a183791;

    /* renamed from: errorCallback */
    private static org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.WebRtcAudioRecordErrorCallback f76334xc08cce6d;

    /* renamed from: microphoneMute */
    private static volatile boolean f76335xf536ba63;

    /* renamed from: audioRecord */
    private android.media.AudioRecord f76336x17ce3bc7;

    /* renamed from: audioThread */
    private org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.AudioRecordThread f76337x1b68dd80;

    /* renamed from: byteBuffer */
    private java.nio.ByteBuffer f76338x93fb68;

    /* renamed from: effects */
    private org.p3371xd0ce3e8d.p3373x1ad5adf4.C29932x95d03379 f76339x92b07902;

    /* renamed from: emptyBytes */
    private byte[] f76340xbf48931e;

    /* renamed from: nativeAudioRecord */
    private final long f76341xf1596f30;

    /* renamed from: org.webrtc.voiceengine.WebRtcAudioRecord$AudioRecordStartErrorCode */
    /* loaded from: classes6.dex */
    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    /* renamed from: org.webrtc.voiceengine.WebRtcAudioRecord$AudioRecordThread */
    /* loaded from: classes15.dex */
    public class AudioRecordThread extends java.lang.Thread {

        /* renamed from: keepAlive */
        private volatile boolean f76345x962be848;

        public AudioRecordThread(java.lang.String str) {
            super(str);
            this.f76345x962be848 = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            android.os.Process.setThreadPriority(-19);
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.TAG, "AudioRecordThread" + org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156950xa79a89ce());
            org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.m156864x7ca149f4(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.this.f76336x17ce3bc7.getRecordingState() == 3);
            java.lang.System.nanoTime();
            while (this.f76345x962be848) {
                int read = org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.this.f76336x17ce3bc7.read(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.this.f76338x93fb68, org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.this.f76338x93fb68.capacity());
                if (read == org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.this.f76338x93fb68.capacity()) {
                    if (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.f76335xf536ba63) {
                        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.this.f76338x93fb68.clear();
                        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.this.f76338x93fb68.put(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.this.f76340xbf48931e);
                    }
                    if (this.f76345x962be848) {
                        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa c29934xaf9a06fa = org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.this;
                        c29934xaf9a06fa.m156873x6748b73b(read, c29934xaf9a06fa.f76341xf1596f30);
                    }
                    if (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.f76332x4d169a75 != null) {
                        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.f76332x4d169a75.m156895xb7108db5(new org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.AudioSamples(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.this.f76336x17ce3bc7, java.util.Arrays.copyOf(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.this.f76338x93fb68.array(), org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.this.f76338x93fb68.capacity())));
                    }
                } else {
                    java.lang.String str = "AudioRecord.read failed: " + read;
                    org.p3371xd0ce3e8d.C29806x779f633f.e(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.TAG, str);
                    if (read == -3) {
                        this.f76345x962be848 = false;
                        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.this.m156875xbd98dd62(str);
                    }
                }
            }
            try {
                if (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.this.f76336x17ce3bc7 != null) {
                    org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.this.f76336x17ce3bc7.stop();
                }
            } catch (java.lang.IllegalStateException e17) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.TAG, "AudioRecord.stop failed: " + e17.getMessage());
            }
        }

        /* renamed from: stopThread */
        public void m156887xb0a278ac() {
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.TAG, "stopThread");
            this.f76345x962be848 = false;
        }
    }

    /* renamed from: org.webrtc.voiceengine.WebRtcAudioRecord$AudioSamples */
    /* loaded from: classes15.dex */
    public static class AudioSamples {

        /* renamed from: audioFormat */
        private final int f76347x3e7c76d;

        /* renamed from: channelCount */
        private final int f76348xf99d8dcc;

        /* renamed from: data */
        private final byte[] f76349x2eefaa;

        /* renamed from: sampleRate */
        private final int f76350x88751aa;

        /* renamed from: getAudioFormat */
        public int m156888xddbe0e37() {
            return this.f76347x3e7c76d;
        }

        /* renamed from: getChannelCount */
        public int m156889x5a902042() {
            return this.f76348xf99d8dcc;
        }

        /* renamed from: getData */
        public byte[] m156890xfb7e5820() {
            return this.f76349x2eefaa;
        }

        /* renamed from: getSampleRate */
        public int m156891xf6c809a0() {
            return this.f76350x88751aa;
        }

        private AudioSamples(android.media.AudioRecord audioRecord, byte[] bArr) {
            this.f76347x3e7c76d = audioRecord.getAudioFormat();
            this.f76348xf99d8dcc = audioRecord.getChannelCount();
            this.f76350x88751aa = audioRecord.getSampleRate();
            this.f76349x2eefaa = bArr;
        }
    }

    /* renamed from: org.webrtc.voiceengine.WebRtcAudioRecord$WebRtcAudioRecordErrorCallback */
    /* loaded from: classes15.dex */
    public interface WebRtcAudioRecordErrorCallback {
        /* renamed from: onWebRtcAudioRecordError */
        void m156892x1253f3cd(java.lang.String str);

        /* renamed from: onWebRtcAudioRecordInitError */
        void m156893xf823de1d(java.lang.String str);

        /* renamed from: onWebRtcAudioRecordStartError */
        void m156894xb5b4bc21(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.AudioRecordStartErrorCode audioRecordStartErrorCode, java.lang.String str);
    }

    /* renamed from: org.webrtc.voiceengine.WebRtcAudioRecord$WebRtcAudioRecordSamplesReadyCallback */
    /* loaded from: classes15.dex */
    public interface WebRtcAudioRecordSamplesReadyCallback {
        /* renamed from: onWebRtcAudioRecordSamplesReady */
        void m156895xb7108db5(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.AudioSamples audioSamples);
    }

    static {
        int m156868x6f43a886 = m156868x6f43a886();
        f76331x34068222 = m156868x6f43a886;
        f76333x1a183791 = m156868x6f43a886;
    }

    public C29934xaf9a06fa(long j17) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "ctor" + org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156950xa79a89ce());
        this.f76341xf1596f30 = j17;
        this.f76339x92b07902 = org.p3371xd0ce3e8d.p3373x1ad5adf4.C29932x95d03379.m156809xaf65a0fc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: assertTrue */
    public static void m156864x7ca149f4(boolean z17) {
        if (!z17) {
            throw new java.lang.AssertionError("Expected condition to be true");
        }
    }

    /* renamed from: channelCountToConfiguration */
    private int m156865x1e2f8ecf(int i17) {
        return i17 == 1 ? 16 : 12;
    }

    /* renamed from: enableBuiltInAEC */
    private boolean m156866xf00e835f(boolean z17) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "enableBuiltInAEC(" + z17 + ')');
        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29932x95d03379 c29932x95d03379 = this.f76339x92b07902;
        if (c29932x95d03379 != null) {
            return c29932x95d03379.m156823xca024cfd(z17);
        }
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Built-in AEC is not supported on this platform");
        return false;
    }

    /* renamed from: enableBuiltInNS */
    private boolean m156867x28c6ab05(boolean z17) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "enableBuiltInNS(" + z17 + ')');
        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29932x95d03379 c29932x95d03379 = this.f76339x92b07902;
        if (c29932x95d03379 != null) {
            return c29932x95d03379.m156824x68435a7(z17);
        }
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Built-in NS is not supported on this platform");
        return false;
    }

    /* renamed from: getDefaultAudioSource */
    private static int m156868x6f43a886() {
        return 7;
    }

    /* renamed from: initRecording */
    private int m156869x97d1eac1(int i17, int i18) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "initRecording(sampleRate=" + i17 + ", channels=" + i18 + ")");
        if (this.f76336x17ce3bc7 != null) {
            m156876x3cfff532("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i19 = i17 / 100;
        this.f76338x93fb68 = java.nio.ByteBuffer.allocateDirect(i18 * 2 * i19);
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "byteBuffer.capacity: " + this.f76338x93fb68.capacity());
        this.f76340xbf48931e = new byte[this.f76338x93fb68.capacity()];
        m156872xf9a44280(this.f76338x93fb68, this.f76341xf1596f30);
        int m156865x1e2f8ecf = m156865x1e2f8ecf(i18);
        int minBufferSize = android.media.AudioRecord.getMinBufferSize(i17, m156865x1e2f8ecf, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            m156876x3cfff532("AudioRecord.getMinBufferSize failed: " + minBufferSize);
            return -1;
        }
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
        int max = java.lang.Math.max(minBufferSize * 2, this.f76338x93fb68.capacity());
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "bufferSizeInBytes: " + max);
        try {
            android.media.AudioRecord audioRecord = new android.media.AudioRecord(f76333x1a183791, i17, m156865x1e2f8ecf, 2, max);
            this.f76336x17ce3bc7 = audioRecord;
            if (audioRecord.getState() != 1) {
                m156876x3cfff532("Failed to create a new AudioRecord instance");
                m156874x4560ed6();
                return -1;
            }
            org.p3371xd0ce3e8d.p3373x1ad5adf4.C29932x95d03379 c29932x95d03379 = this.f76339x92b07902;
            if (c29932x95d03379 != null) {
                c29932x95d03379.m156821xb2952583(this.f76336x17ce3bc7.getAudioSessionId());
            }
            m156870xd6f8e7();
            m156871x7770f340();
            return i19;
        } catch (java.lang.IllegalArgumentException e17) {
            m156876x3cfff532("AudioRecord ctor error: " + e17.getMessage());
            m156874x4560ed6();
            return -1;
        }
    }

    /* renamed from: logMainParameters */
    private void m156870xd6f8e7() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "AudioRecord: session ID: " + this.f76336x17ce3bc7.getAudioSessionId() + ", channels: " + this.f76336x17ce3bc7.getChannelCount() + ", sample rate: " + this.f76336x17ce3bc7.getSampleRate());
    }

    /* renamed from: logMainParametersExtended */
    private void m156871x7770f340() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "AudioRecord: buffer size in frames: " + this.f76336x17ce3bc7.getBufferSizeInFrames());
    }

    /* renamed from: nativeCacheDirectBufferAddress */
    private native void m156872xf9a44280(java.nio.ByteBuffer byteBuffer, long j17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeDataIsRecorded */
    public native void m156873x6748b73b(int i17, long j17);

    /* renamed from: releaseAudioResources */
    private void m156874x4560ed6() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "releaseAudioResources");
        android.media.AudioRecord audioRecord = this.f76336x17ce3bc7;
        if (audioRecord != null) {
            audioRecord.release();
            this.f76336x17ce3bc7 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reportWebRtcAudioRecordError */
    public void m156875xbd98dd62(java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Run-time recording error: " + str);
        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156958xafd368bf(TAG);
        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = f76334xc08cce6d;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.m156892x1253f3cd(str);
        }
    }

    /* renamed from: reportWebRtcAudioRecordInitError */
    private void m156876x3cfff532(java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Init recording error: " + str);
        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156958xafd368bf(TAG);
        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = f76334xc08cce6d;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.m156893xf823de1d(str);
        }
    }

    /* renamed from: reportWebRtcAudioRecordStartError */
    private void m156877xc5b87ac(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.AudioRecordStartErrorCode audioRecordStartErrorCode, java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156958xafd368bf(TAG);
        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = f76334xc08cce6d;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.m156894xb5b4bc21(audioRecordStartErrorCode, str);
        }
    }

    /* renamed from: setAudioSource */
    public static synchronized void m156878x8a53f1cf(int i17) {
        synchronized (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.class) {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Audio source is changed from: " + f76333x1a183791 + " to " + i17);
            f76333x1a183791 = i17;
        }
    }

    /* renamed from: setErrorCallback */
    public static void m156879x10c2f12b(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Set error callback");
        f76334xc08cce6d = webRtcAudioRecordErrorCallback;
    }

    /* renamed from: setMicrophoneMute */
    public static void m156880xabc4ef65(boolean z17) {
        org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "setMicrophoneMute(" + z17 + ")");
        f76335xf536ba63 = z17;
    }

    /* renamed from: setOnAudioSamplesReady */
    public static void m156881x4a878e2f(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        f76332x4d169a75 = webRtcAudioRecordSamplesReadyCallback;
    }

    /* renamed from: startRecording */
    private boolean m156882x2619a7af() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "startRecording");
        m156864x7ca149f4(this.f76336x17ce3bc7 != null);
        m156864x7ca149f4(this.f76337x1b68dd80 == null);
        try {
            yj0.a.j(this.f76336x17ce3bc7, "org/webrtc/voiceengine/WebRtcAudioRecord", "startRecording", "()Z", "android/media/AudioRecord", "startRecording", "()V");
            if (this.f76336x17ce3bc7.getRecordingState() == 3) {
                org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.AudioRecordThread audioRecordThread = new org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.AudioRecordThread("AudioRecordJavaThread");
                this.f76337x1b68dd80 = audioRecordThread;
                audioRecordThread.start();
                return true;
            }
            m156877xc5b87ac(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state :" + this.f76336x17ce3bc7.getRecordingState());
            return false;
        } catch (java.lang.IllegalStateException e17) {
            m156877xc5b87ac(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29934xaf9a06fa.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e17.getMessage());
            return false;
        }
    }

    /* renamed from: stopRecording */
    private boolean m156883xc350780f() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "stopRecording");
        m156864x7ca149f4(this.f76337x1b68dd80 != null);
        this.f76337x1b68dd80.m156887xb0a278ac();
        if (!org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156479x7fa650c6(this.f76337x1b68dd80, 2000L)) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Join of AudioRecordJavaThread timed out");
            org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156958xafd368bf(TAG);
        }
        this.f76337x1b68dd80 = null;
        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29932x95d03379 c29932x95d03379 = this.f76339x92b07902;
        if (c29932x95d03379 != null) {
            c29932x95d03379.m156822x41012807();
        }
        m156874x4560ed6();
        return true;
    }
}
