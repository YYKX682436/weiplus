package org.p3371xd0ce3e8d.p3372x58d9bd6;

/* renamed from: org.webrtc.audio.JavaAudioDeviceModule */
/* loaded from: classes15.dex */
public class C29921x33922536 implements org.p3371xd0ce3e8d.p3372x58d9bd6.InterfaceC29920x83393738 {
    private static final java.lang.String TAG = "JavaAudioDeviceModule";

    /* renamed from: audioInput */
    private final org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa f76170x5b20c194;

    /* renamed from: audioManager */
    private final android.media.AudioManager f76171xd33b2ef7;

    /* renamed from: audioOutput */
    private final org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82 f76172x1398e877;

    /* renamed from: context */
    private final android.content.Context f76173x38b735af;

    /* renamed from: inputSampleRate */
    private final int f76174xbcc8d114;

    /* renamed from: nativeAudioDeviceModule */
    private long f76175x6dfc3801;

    /* renamed from: nativeLock */
    private final java.lang.Object f76176xb902a5e2;

    /* renamed from: outputSampleRate */
    private final int f76177xc83b98b;

    /* renamed from: useStereoInput */
    private final boolean f76178xc17a02ab;

    /* renamed from: useStereoOutput */
    private final boolean f76179x7867ca40;

    /* renamed from: org.webrtc.audio.JavaAudioDeviceModule$AudioRecordErrorCallback */
    /* loaded from: classes15.dex */
    public interface AudioRecordErrorCallback {
        /* renamed from: onWebRtcAudioRecordError */
        void m156623x1253f3cd(java.lang.String str);

        /* renamed from: onWebRtcAudioRecordInitError */
        void m156624xf823de1d(java.lang.String str);

        /* renamed from: onWebRtcAudioRecordStartError */
        void m156625xb5b4bc21(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioRecordStartErrorCode audioRecordStartErrorCode, java.lang.String str);
    }

    /* renamed from: org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStartErrorCode */
    /* loaded from: classes6.dex */
    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    /* renamed from: org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStateCallback */
    /* loaded from: classes15.dex */
    public interface AudioRecordStateCallback {
        /* renamed from: onWebRtcAudioRecordStart */
        void m156629x1319e627();

        /* renamed from: onWebRtcAudioRecordStop */
        void m156630xae09199d();
    }

    /* renamed from: org.webrtc.audio.JavaAudioDeviceModule$AudioSamples */
    /* loaded from: classes15.dex */
    public static class AudioSamples {

        /* renamed from: audioFormat */
        private final int f76183x3e7c76d;

        /* renamed from: channelCount */
        private final int f76184xf99d8dcc;

        /* renamed from: data */
        private final byte[] f76185x2eefaa;

        /* renamed from: sampleRate */
        private final int f76186x88751aa;

        public AudioSamples(int i17, int i18, int i19, byte[] bArr) {
            this.f76183x3e7c76d = i17;
            this.f76184xf99d8dcc = i18;
            this.f76186x88751aa = i19;
            this.f76185x2eefaa = bArr;
        }

        /* renamed from: getAudioFormat */
        public int m156631xddbe0e37() {
            return this.f76183x3e7c76d;
        }

        /* renamed from: getChannelCount */
        public int m156632x5a902042() {
            return this.f76184xf99d8dcc;
        }

        /* renamed from: getData */
        public byte[] m156633xfb7e5820() {
            return this.f76185x2eefaa;
        }

        /* renamed from: getSampleRate */
        public int m156634xf6c809a0() {
            return this.f76186x88751aa;
        }
    }

    /* renamed from: org.webrtc.audio.JavaAudioDeviceModule$AudioTrackErrorCallback */
    /* loaded from: classes15.dex */
    public interface AudioTrackErrorCallback {
        /* renamed from: onWebRtcAudioTrackError */
        void m156635xc5efc927(java.lang.String str);

        /* renamed from: onWebRtcAudioTrackInitError */
        void m156636x24c17677(java.lang.String str);

        /* renamed from: onWebRtcAudioTrackStartError */
        void m156637x1cca2f07(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioTrackStartErrorCode audioTrackStartErrorCode, java.lang.String str);
    }

    /* renamed from: org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStartErrorCode */
    /* loaded from: classes6.dex */
    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    /* renamed from: org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStateCallback */
    /* loaded from: classes15.dex */
    public interface AudioTrackStateCallback {
        /* renamed from: onWebRtcAudioTrackStart */
        void m156641xc6b5bb81();

        /* renamed from: onWebRtcAudioTrackStop */
        void m156642xa3503103();
    }

    /* renamed from: org.webrtc.audio.JavaAudioDeviceModule$Builder */
    /* loaded from: classes15.dex */
    public static class Builder {

        /* renamed from: audioAttributes */
        private android.media.AudioAttributes f76190xb7b4cdcd;

        /* renamed from: audioFormat */
        private int f76191x3e7c76d;

        /* renamed from: audioManager */
        private final android.media.AudioManager f76192xd33b2ef7;

        /* renamed from: audioRecordErrorCallback */
        private org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioRecordErrorCallback f76193x27fd5de6;

        /* renamed from: audioRecordStateCallback */
        private org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioRecordStateCallback f76194x9d50b76f;

        /* renamed from: audioSource */
        private int f76195x1a183791;

        /* renamed from: audioTrackErrorCallback */
        private org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioTrackErrorCallback f76196xad6c0d58;

        /* renamed from: audioTrackStateCallback */
        private org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioTrackStateCallback f76197x22bf66e1;

        /* renamed from: context */
        private final android.content.Context f76198x38b735af;

        /* renamed from: inputSampleRate */
        private int f76199xbcc8d114;

        /* renamed from: outputSampleRate */
        private int f76200xc83b98b;

        /* renamed from: samplesReadyCallback */
        private org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.SamplesReadyCallback f76201x5fc2117f;

        /* renamed from: scheduler */
        private java.util.concurrent.ScheduledExecutorService f76202xf66bc0bb;

        /* renamed from: useHardwareAcousticEchoCanceler */
        private boolean f76203xbbd7317e;

        /* renamed from: useHardwareNoiseSuppressor */
        private boolean f76204x41ae5583;

        /* renamed from: useLowLatency */
        private boolean f76205xae813ff1;

        /* renamed from: useStereoInput */
        private boolean f76206xc17a02ab;

        /* renamed from: useStereoOutput */
        private boolean f76207x7867ca40;

        /* renamed from: createAudioDeviceModule */
        public org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536 m156643x97622dbc() {
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.TAG, "createAudioDeviceModule");
            if (this.f76204x41ae5583) {
                org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.TAG, "HW NS will be used.");
            } else {
                if (org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.m156620x87f19b95()) {
                    org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.TAG, "Overriding default behavior; now using WebRTC NS!");
                }
                org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.TAG, "HW NS will not be used.");
            }
            if (this.f76203xbbd7317e) {
                org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.TAG, "HW AEC will be used.");
            } else {
                if (org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.m156619xd01141e6()) {
                    org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.TAG, "Overriding default behavior; now using WebRTC AEC!");
                }
                org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.TAG, "HW AEC will not be used.");
            }
            if (this.f76205xae813ff1 && android.os.Build.VERSION.SDK_INT >= 26) {
                org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.TAG, "Low latency mode will be used.");
            }
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.f76202xf66bc0bb;
            if (scheduledExecutorService == null) {
                scheduledExecutorService = org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.m156717x9bdf313a();
            }
            return new org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536(this.f76198x38b735af, this.f76192xd33b2ef7, new org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa(this.f76198x38b735af, scheduledExecutorService, this.f76192xd33b2ef7, this.f76195x1a183791, this.f76191x3e7c76d, this.f76193x27fd5de6, this.f76194x9d50b76f, this.f76201x5fc2117f, this.f76203xbbd7317e, this.f76204x41ae5583), new org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82(this.f76198x38b735af, this.f76192xd33b2ef7, this.f76190xb7b4cdcd, this.f76196xad6c0d58, this.f76197x22bf66e1, this.f76205xae813ff1), this.f76199xbcc8d114, this.f76200xc83b98b, this.f76206xc17a02ab, this.f76207x7867ca40);
        }

        /* renamed from: setAudioAttributes */
        public org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.Builder m156644xd2ed390b(android.media.AudioAttributes audioAttributes) {
            this.f76190xb7b4cdcd = audioAttributes;
            return this;
        }

        /* renamed from: setAudioFormat */
        public org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.Builder m156645x742381ab(int i17) {
            this.f76191x3e7c76d = i17;
            return this;
        }

        /* renamed from: setAudioRecordErrorCallback */
        public org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.Builder m156646x7d6b868(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioRecordErrorCallback audioRecordErrorCallback) {
            this.f76193x27fd5de6 = audioRecordErrorCallback;
            return this;
        }

        /* renamed from: setAudioRecordStateCallback */
        public org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.Builder m156647x7d2a11f1(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioRecordStateCallback audioRecordStateCallback) {
            this.f76194x9d50b76f = audioRecordStateCallback;
            return this;
        }

        /* renamed from: setAudioSource */
        public org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.Builder m156648x8a53f1cf(int i17) {
            this.f76195x1a183791 = i17;
            return this;
        }

        /* renamed from: setAudioTrackErrorCallback */
        public org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.Builder m156649x939c5a96(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioTrackErrorCallback audioTrackErrorCallback) {
            this.f76196xad6c0d58 = audioTrackErrorCallback;
            return this;
        }

        /* renamed from: setAudioTrackStateCallback */
        public org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.Builder m156650x8efb41f(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioTrackStateCallback audioTrackStateCallback) {
            this.f76197x22bf66e1 = audioTrackStateCallback;
            return this;
        }

        /* renamed from: setInputSampleRate */
        public org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.Builder m156651xd8013c52(int i17) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.TAG, "Input sample rate overridden to: " + i17);
            this.f76199xbcc8d114 = i17;
            return this;
        }

        /* renamed from: setOutputSampleRate */
        public org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.Builder m156652x5858b60d(int i17) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.TAG, "Output sample rate overridden to: " + i17);
            this.f76200xc83b98b = i17;
            return this;
        }

        /* renamed from: setSampleRate */
        public org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.Builder m156653x24ec57ac(int i17) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.TAG, "Input/Output sample rate overridden to: " + i17);
            this.f76199xbcc8d114 = i17;
            this.f76200xc83b98b = i17;
            return this;
        }

        /* renamed from: setSamplesReadyCallback */
        public org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.Builder m156654x87e0fd01(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.SamplesReadyCallback samplesReadyCallback) {
            this.f76201x5fc2117f = samplesReadyCallback;
            return this;
        }

        /* renamed from: setScheduler */
        public org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.Builder m156655x522cf279(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
            this.f76202xf66bc0bb = scheduledExecutorService;
            return this;
        }

        /* renamed from: setUseHardwareAcousticEchoCanceler */
        public org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.Builder m156656xeffd60bc(boolean z17) {
            if (z17 && !org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.m156619xd01141e6()) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.TAG, "HW AEC not supported");
                z17 = false;
            }
            this.f76203xbbd7317e = z17;
            return this;
        }

        /* renamed from: setUseHardwareNoiseSuppressor */
        public org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.Builder m156657x909b1785(boolean z17) {
            if (z17 && !org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.m156620x87f19b95()) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.TAG, "HW NS not supported");
                z17 = false;
            }
            this.f76204x41ae5583 = z17;
            return this;
        }

        /* renamed from: setUseLowLatency */
        public org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.Builder m156658xfeb762af(boolean z17) {
            this.f76205xae813ff1 = z17;
            return this;
        }

        /* renamed from: setUseStereoInput */
        public org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.Builder m156659x780837ad(boolean z17) {
            this.f76206xc17a02ab = z17;
            return this;
        }

        /* renamed from: setUseStereoOutput */
        public org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.Builder m156660x93a0357e(boolean z17) {
            this.f76207x7867ca40 = z17;
            return this;
        }

        private Builder(android.content.Context context) {
            this.f76195x1a183791 = 7;
            this.f76191x3e7c76d = 2;
            this.f76203xbbd7317e = org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.m156619xd01141e6();
            this.f76204x41ae5583 = org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.m156620x87f19b95();
            this.f76198x38b735af = context;
            android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
            this.f76192xd33b2ef7 = audioManager;
            this.f76199xbcc8d114 = org.p3371xd0ce3e8d.p3372x58d9bd6.C29926x34e8ca24.m156683xf6c809a0(audioManager);
            this.f76200xc83b98b = org.p3371xd0ce3e8d.p3372x58d9bd6.C29926x34e8ca24.m156683xf6c809a0(audioManager);
            this.f76205xae813ff1 = false;
        }
    }

    /* renamed from: org.webrtc.audio.JavaAudioDeviceModule$SamplesReadyCallback */
    /* loaded from: classes15.dex */
    public interface SamplesReadyCallback {
        /* renamed from: onWebRtcAudioRecordSamplesReady */
        void m156661xb7108db5(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioSamples audioSamples);
    }

    /* renamed from: builder */
    public static org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.Builder m156618xdc3ef9b(android.content.Context context) {
        return new org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.Builder(context);
    }

    /* renamed from: isBuiltInAcousticEchoCancelerSupported */
    public static boolean m156619xd01141e6() {
        return org.p3371xd0ce3e8d.p3372x58d9bd6.C29925x95d03379.m156670xd8ff8615();
    }

    /* renamed from: isBuiltInNoiseSuppressorSupported */
    public static boolean m156620x87f19b95() {
        return org.p3371xd0ce3e8d.p3372x58d9bd6.C29925x95d03379.m156672x57473606();
    }

    /* renamed from: nativeCreateAudioDeviceModule */
    private static native long m156621x66768ba5(android.content.Context context, android.media.AudioManager audioManager, org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa c29927xaf9a06fa, org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82 c29929xdc81dd82, int i17, int i18, boolean z17, boolean z18);

    @Override // org.p3371xd0ce3e8d.p3372x58d9bd6.InterfaceC29920x83393738
    /* renamed from: getNativeAudioDeviceModulePointer */
    public long mo156614xd448ebf2() {
        long j17;
        synchronized (this.f76176xb902a5e2) {
            if (this.f76175x6dfc3801 == 0) {
                this.f76175x6dfc3801 = m156621x66768ba5(this.f76173x38b735af, this.f76171xd33b2ef7, this.f76170x5b20c194, this.f76172x1398e877, this.f76174xbcc8d114, this.f76177xc83b98b, this.f76178xc17a02ab, this.f76179x7867ca40);
            }
            j17 = this.f76175x6dfc3801;
        }
        return j17;
    }

    @Override // org.p3371xd0ce3e8d.p3372x58d9bd6.InterfaceC29920x83393738
    /* renamed from: release */
    public void mo156615x41012807() {
        synchronized (this.f76176xb902a5e2) {
            long j17 = this.f76175x6dfc3801;
            if (j17 != 0) {
                org.p3371xd0ce3e8d.C29797xa99bc1d0.m155650x8b8e8283(j17);
                this.f76175x6dfc3801 = 0L;
            }
        }
    }

    @Override // org.p3371xd0ce3e8d.p3372x58d9bd6.InterfaceC29920x83393738
    /* renamed from: setMicrophoneMute */
    public void mo156616xabc4ef65(boolean z17) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "setMicrophoneMute: " + z17);
        this.f76170x5b20c194.m156730xabc4ef65(z17);
    }

    /* renamed from: setPreferredInputDevice */
    public void m156622xaee73f01(android.media.AudioDeviceInfo audioDeviceInfo) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "setPreferredInputDevice: " + audioDeviceInfo);
        this.f76170x5b20c194.m156732xd7725d75(audioDeviceInfo);
    }

    @Override // org.p3371xd0ce3e8d.p3372x58d9bd6.InterfaceC29920x83393738
    /* renamed from: setSpeakerMute */
    public void mo156617xdd6ac8f6(boolean z17) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "setSpeakerMute: " + z17);
        this.f76172x1398e877.m156777xdd6ac8f6(z17);
    }

    private C29921x33922536(android.content.Context context, android.media.AudioManager audioManager, org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa c29927xaf9a06fa, org.p3371xd0ce3e8d.p3372x58d9bd6.C29929xdc81dd82 c29929xdc81dd82, int i17, int i18, boolean z17, boolean z18) {
        this.f76176xb902a5e2 = new java.lang.Object();
        this.f76173x38b735af = context;
        this.f76171xd33b2ef7 = audioManager;
        this.f76170x5b20c194 = c29927xaf9a06fa;
        this.f76172x1398e877 = c29929xdc81dd82;
        this.f76174xbcc8d114 = i17;
        this.f76177xc83b98b = i18;
        this.f76178xc17a02ab = z17;
        this.f76179x7867ca40 = z18;
    }
}
