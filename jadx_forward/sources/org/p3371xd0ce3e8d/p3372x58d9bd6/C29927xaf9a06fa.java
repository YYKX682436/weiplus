package org.p3371xd0ce3e8d.p3372x58d9bd6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.webrtc.audio.WebRtcAudioRecord */
/* loaded from: classes15.dex */
public class C29927xaf9a06fa {

    /* renamed from: AUDIO_RECORD_START */
    private static final int f76228xb4d14cbd = 0;

    /* renamed from: AUDIO_RECORD_STOP */
    private static final int f76229xed0f0427 = 1;

    /* renamed from: AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS */
    private static final long f76230x6462c49 = 2000;

    /* renamed from: BUFFERS_PER_SECOND */
    private static final int f76231x829ef5a2 = 100;

    /* renamed from: BUFFER_SIZE_FACTOR */
    private static final int f76232x2fec5ce = 2;

    /* renamed from: CALLBACK_BUFFER_SIZE_MS */
    private static final int f76233x565724df = 10;

    /* renamed from: CHECK_REC_STATUS_DELAY_MS */
    private static final int f76234x5db57409 = 100;

    /* renamed from: DEFAULT_AUDIO_FORMAT */
    public static final int f76235x1dd611fe = 2;

    /* renamed from: DEFAULT_AUDIO_SOURCE */
    public static final int f76236x34068222 = 7;
    private static final java.lang.String TAG = "WebRtcAudioRecordExternal";

    /* renamed from: nextSchedulerId */
    private static final java.util.concurrent.atomic.AtomicInteger f76237x709a5e43 = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: audioFormat */
    private final int f76238x3e7c76d;

    /* renamed from: audioManager */
    private final android.media.AudioManager f76239xd33b2ef7;

    /* renamed from: audioRecord */
    private android.media.AudioRecord f76240x17ce3bc7;

    /* renamed from: audioSamplesReadyCallback */
    private final org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.SamplesReadyCallback f76241x4d169a75;

    /* renamed from: audioSource */
    private final int f76242x1a183791;

    /* renamed from: audioSourceMatchesRecordingSessionRef */
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> f76243xd0e9f32c;

    /* renamed from: audioThread */
    private org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.AudioRecordThread f76244x1b68dd80;

    /* renamed from: byteBuffer */
    private java.nio.ByteBuffer f76245x93fb68;

    /* renamed from: context */
    private final android.content.Context f76246x38b735af;

    /* renamed from: effects */
    private final org.p3371xd0ce3e8d.p3372x58d9bd6.C29925x95d03379 f76247x92b07902;

    /* renamed from: emptyBytes */
    private byte[] f76248xbf48931e;

    /* renamed from: errorCallback */
    private final org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioRecordErrorCallback f76249xc08cce6d;

    /* renamed from: executor */
    private final java.util.concurrent.ScheduledExecutorService f76250x79c5f8d3;

    /* renamed from: future */
    private java.util.concurrent.ScheduledFuture<java.lang.String> f76251xb4b58dc3;

    /* renamed from: isAcousticEchoCancelerSupported */
    private final boolean f76252xd8ff8615;

    /* renamed from: isNoiseSuppressorSupported */
    private final boolean f76253x57473606;

    /* renamed from: microphoneMute */
    private volatile boolean f76254xf536ba63;

    /* renamed from: nativeAudioRecord */
    private long f76255xf1596f30;

    /* renamed from: preferredDevice */
    private android.media.AudioDeviceInfo f76256xbc39f237;

    /* renamed from: stateCallback */
    private final org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioRecordStateCallback f76257x35e027f6;

    /* renamed from: org.webrtc.audio.WebRtcAudioRecord$AudioRecordThread */
    /* loaded from: classes15.dex */
    public class AudioRecordThread extends java.lang.Thread {

        /* renamed from: keepAlive */
        private volatile boolean f76259x962be848;

        public AudioRecordThread(java.lang.String str) {
            super(str);
            this.f76259x962be848 = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            android.os.Process.setThreadPriority(-19);
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.TAG, "AudioRecordThread" + org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156784xa79a89ce());
            org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.m156699x7ca149f4(org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76240x17ce3bc7.getRecordingState() == 3);
            org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.m156705x26f4b71a(0);
            java.lang.System.nanoTime();
            while (this.f76259x962be848) {
                int read = org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76240x17ce3bc7.read(org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76245x93fb68, org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76245x93fb68.capacity());
                if (read == org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76245x93fb68.capacity()) {
                    if (org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76254xf536ba63) {
                        org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76245x93fb68.clear();
                        org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76245x93fb68.put(org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76248xbf48931e);
                    }
                    if (this.f76259x962be848) {
                        org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa c29927xaf9a06fa = org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this;
                        c29927xaf9a06fa.m156716x6748b73b(c29927xaf9a06fa.f76255xf1596f30, read);
                    }
                    if (org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76241x4d169a75 != null) {
                        org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76241x4d169a75.m156661xb7108db5(new org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioSamples(org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76240x17ce3bc7.getAudioFormat(), org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76240x17ce3bc7.getChannelCount(), org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76240x17ce3bc7.getSampleRate(), java.util.Arrays.copyOfRange(org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76245x93fb68.array(), org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76245x93fb68.arrayOffset(), org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76245x93fb68.capacity() + org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76245x93fb68.arrayOffset())));
                    }
                } else {
                    java.lang.String str = "AudioRecord.read failed: " + read;
                    org.p3371xd0ce3e8d.C29806x779f633f.e(org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.TAG, str);
                    if (read == -3) {
                        this.f76259x962be848 = false;
                        org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.m156719xbd98dd62(str);
                    }
                }
            }
            try {
                if (org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76240x17ce3bc7 != null) {
                    org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.f76240x17ce3bc7.stop();
                    org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.m156705x26f4b71a(1);
                }
            } catch (java.lang.IllegalStateException e17) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.TAG, "AudioRecord.stop failed: " + e17.getMessage());
            }
        }

        /* renamed from: stopThread */
        public void m156733xb0a278ac() {
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.TAG, "stopThread");
            this.f76259x962be848 = false;
        }
    }

    public C29927xaf9a06fa(android.content.Context context, android.media.AudioManager audioManager) {
        this(context, m156717x9bdf313a(), audioManager, 7, 2, null, null, null, org.p3371xd0ce3e8d.p3372x58d9bd6.C29925x95d03379.m156670xd8ff8615(), org.p3371xd0ce3e8d.p3372x58d9bd6.C29925x95d03379.m156672x57473606());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: assertTrue */
    public static void m156699x7ca149f4(boolean z17) {
        if (!z17) {
            throw new java.lang.AssertionError("Expected condition to be true");
        }
    }

    /* renamed from: audioStateToString */
    private static java.lang.String m156700x45e659e7(int i17) {
        return i17 != 0 ? i17 != 1 ? "INVALID" : "STOP" : "START";
    }

    /* renamed from: channelCountToConfiguration */
    private int m156701x1e2f8ecf(int i17) {
        return i17 == 1 ? 16 : 12;
    }

    /* renamed from: checkDeviceMatch */
    private static boolean m156702x53651ee7(android.media.AudioDeviceInfo audioDeviceInfo, android.media.AudioDeviceInfo audioDeviceInfo2) {
        return audioDeviceInfo.getId() == audioDeviceInfo2.getId() && audioDeviceInfo.getType() == audioDeviceInfo2.getType();
    }

    /* renamed from: createAudioRecordOnLowerThanM */
    private static android.media.AudioRecord m156703x1a2e5c55(int i17, int i18, int i19, int i27, int i28) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "createAudioRecordOnLowerThanM");
        return new android.media.AudioRecord(i17, i18, i19, i27, i28);
    }

    /* renamed from: createAudioRecordOnMOrHigher */
    private static android.media.AudioRecord m156704x45bef3d5(int i17, int i18, int i19, int i27, int i28) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "createAudioRecordOnMOrHigher");
        return new android.media.AudioRecord.Builder().setAudioSource(i17).setAudioFormat(new android.media.AudioFormat.Builder().setEncoding(i27).setSampleRate(i18).setChannelMask(i19).build()).setBufferSizeInBytes(i28).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doAudioRecordStateCallback */
    public void m156705x26f4b71a(int i17) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "doAudioRecordStateCallback: " + m156700x45e659e7(i17));
        org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioRecordStateCallback audioRecordStateCallback = this.f76257x35e027f6;
        if (audioRecordStateCallback != null) {
            if (i17 == 0) {
                audioRecordStateCallback.m156629x1319e627();
            } else if (i17 == 1) {
                audioRecordStateCallback.m156630xae09199d();
            } else {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Invalid audio state");
            }
        }
    }

    /* renamed from: enableBuiltInAEC */
    private boolean m156706xf00e835f(boolean z17) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "enableBuiltInAEC(" + z17 + ")");
        return this.f76247x92b07902.m156675xca024cfd(z17);
    }

    /* renamed from: enableBuiltInNS */
    private boolean m156707x28c6ab05(boolean z17) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "enableBuiltInNS(" + z17 + ")");
        return this.f76247x92b07902.m156676x68435a7(z17);
    }

    /* renamed from: getBytesPerSample */
    private static int m156708x8c107df2(int i17) {
        int i18 = 1;
        if (i17 != 1 && i17 != 2) {
            if (i17 != 3) {
                i18 = 4;
                if (i17 != 4) {
                    if (i17 != 13) {
                        throw new java.lang.IllegalArgumentException("Bad audio format " + i17);
                    }
                }
            }
            return i18;
        }
        return 2;
    }

    /* renamed from: initRecording */
    private int m156709x97d1eac1(int i17, int i18) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "initRecording(sampleRate=" + i17 + ", channels=" + i18 + ")");
        if (this.f76240x17ce3bc7 != null) {
            m156720x3cfff532("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i19 = i17 / 100;
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(m156708x8c107df2(this.f76238x3e7c76d) * i18 * i19);
        this.f76245x93fb68 = allocateDirect;
        if (!allocateDirect.hasArray()) {
            m156720x3cfff532("ByteBuffer does not have backing array.");
            return -1;
        }
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "byteBuffer.capacity: " + this.f76245x93fb68.capacity());
        this.f76248xbf48931e = new byte[this.f76245x93fb68.capacity()];
        m156715xf9a44280(this.f76255xf1596f30, this.f76245x93fb68);
        int m156701x1e2f8ecf = m156701x1e2f8ecf(i18);
        int minBufferSize = android.media.AudioRecord.getMinBufferSize(i17, m156701x1e2f8ecf, this.f76238x3e7c76d);
        if (minBufferSize == -1 || minBufferSize == -2) {
            m156720x3cfff532("AudioRecord.getMinBufferSize failed: " + minBufferSize);
            return -1;
        }
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
        int max = java.lang.Math.max(minBufferSize * 2, this.f76245x93fb68.capacity());
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "bufferSizeInBytes: " + max);
        try {
            this.f76240x17ce3bc7 = m156704x45bef3d5(this.f76242x1a183791, i17, m156701x1e2f8ecf, this.f76238x3e7c76d, max);
            this.f76243xd0e9f32c.set(null);
            android.media.AudioDeviceInfo audioDeviceInfo = this.f76256xbc39f237;
            if (audioDeviceInfo != null) {
                m156732xd7725d75(audioDeviceInfo);
            }
            android.media.AudioRecord audioRecord = this.f76240x17ce3bc7;
            if (audioRecord == null || audioRecord.getState() != 1) {
                m156720x3cfff532("Creation or initialization of audio recorder failed.");
                m156718x4560ed6();
                return -1;
            }
            this.f76247x92b07902.m156673xb2952583(this.f76240x17ce3bc7.getAudioSessionId());
            m156712xd6f8e7();
            m156713x7770f340();
            int m156714xe23882aa = m156714xe23882aa(this.f76240x17ce3bc7, false);
            if (m156714xe23882aa != 0) {
                org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Potential microphone conflict. Active sessions: " + m156714xe23882aa);
            }
            return i19;
        } catch (java.lang.IllegalArgumentException | java.lang.UnsupportedOperationException e17) {
            m156720x3cfff532(e17.getMessage());
            m156718x4560ed6();
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$scheduleLogRecordingConfigurationsTask$0 */
    public /* synthetic */ java.lang.String m156710x6023130f(android.media.AudioRecord audioRecord) {
        if (this.f76240x17ce3bc7 == audioRecord) {
            m156714xe23882aa(audioRecord, true);
            return "Scheduled task is done";
        }
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "audio record has changed");
        return "Scheduled task is done";
    }

    /* renamed from: logActiveRecordingConfigs */
    private static boolean m156711x5f159ca(int i17, java.util.List<android.media.AudioRecordingConfiguration> list) {
        m156699x7ca149f4(!list.isEmpty());
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "AudioRecordingConfigurations: ");
        for (android.media.AudioRecordingConfiguration audioRecordingConfiguration : list) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("  client audio source=");
            sb6.append(org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156781xcaa4cd1d(audioRecordingConfiguration.getClientAudioSource()));
            sb6.append(", client session id=");
            sb6.append(audioRecordingConfiguration.getClientAudioSessionId());
            sb6.append(" (");
            sb6.append(i17);
            sb6.append(")\n  Device AudioFormat: channel count=");
            android.media.AudioFormat format = audioRecordingConfiguration.getFormat();
            sb6.append(format.getChannelCount());
            sb6.append(", channel index mask=");
            sb6.append(format.getChannelIndexMask());
            sb6.append(", channel mask=");
            sb6.append(org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156782x43e0761b(format.getChannelMask()));
            sb6.append(", encoding=");
            sb6.append(org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156780xb5e54d5(format.getEncoding()));
            sb6.append(", sample rate=");
            sb6.append(format.getSampleRate());
            sb6.append("\n  Client AudioFormat: channel count=");
            android.media.AudioFormat clientFormat = audioRecordingConfiguration.getClientFormat();
            sb6.append(clientFormat.getChannelCount());
            sb6.append(", channel index mask=");
            sb6.append(clientFormat.getChannelIndexMask());
            sb6.append(", channel mask=");
            sb6.append(org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156782x43e0761b(clientFormat.getChannelMask()));
            sb6.append(", encoding=");
            sb6.append(org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156780xb5e54d5(clientFormat.getEncoding()));
            sb6.append(", sample rate=");
            sb6.append(clientFormat.getSampleRate());
            sb6.append("\n");
            android.media.AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null) {
                m156699x7ca149f4(audioDevice.isSource());
                sb6.append("  AudioDevice: type=");
                sb6.append(org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156783xc2270d3c(audioDevice.getType()));
                sb6.append(", id=");
                sb6.append(audioDevice.getId());
            }
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, sb6.toString());
        }
        return true;
    }

    /* renamed from: logMainParameters */
    private void m156712xd6f8e7() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "AudioRecord: session ID: " + this.f76240x17ce3bc7.getAudioSessionId() + ", channels: " + this.f76240x17ce3bc7.getChannelCount() + ", sample rate: " + this.f76240x17ce3bc7.getSampleRate());
    }

    /* renamed from: logMainParametersExtended */
    private void m156713x7770f340() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "AudioRecord: buffer size in frames: " + this.f76240x17ce3bc7.getBufferSizeInFrames());
    }

    /* renamed from: logRecordingConfigurations */
    private int m156714xe23882aa(android.media.AudioRecord audioRecord, boolean z17) {
        if (audioRecord == null) {
            return 0;
        }
        java.util.List<android.media.AudioRecordingConfiguration> activeRecordingConfigurations = this.f76239xd33b2ef7.getActiveRecordingConfigurations();
        int size = activeRecordingConfigurations.size();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Number of active recording sessions: " + size);
        if (size > 0) {
            m156711x5f159ca(audioRecord.getAudioSessionId(), activeRecordingConfigurations);
            if (z17) {
                this.f76243xd0e9f32c.set(java.lang.Boolean.valueOf(m156725xe1e29c7f(audioRecord.getAudioSource(), audioRecord.getAudioSessionId(), audioRecord.getFormat(), audioRecord.getRoutedDevice(), activeRecordingConfigurations)));
            }
        }
        return size;
    }

    /* renamed from: nativeCacheDirectBufferAddress */
    private native void m156715xf9a44280(long j17, java.nio.ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeDataIsRecorded */
    public native void m156716x6748b73b(long j17, int i17);

    /* renamed from: newDefaultScheduler */
    public static java.util.concurrent.ScheduledExecutorService m156717x9bdf313a() {
        final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        return java.util.concurrent.Executors.newScheduledThreadPool(0, new java.util.concurrent.ThreadFactory() { // from class: org.webrtc.audio.WebRtcAudioRecord.1
            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(java.lang.Runnable runnable) {
                java.lang.Thread newThread = java.util.concurrent.Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName(java.lang.String.format("WebRtcAudioRecordScheduler-%s-%s", java.lang.Integer.valueOf(org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.f76237x709a5e43.getAndIncrement()), java.lang.Integer.valueOf(atomicInteger.getAndIncrement())));
                return newThread;
            }
        });
    }

    /* renamed from: releaseAudioResources */
    private void m156718x4560ed6() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "releaseAudioResources");
        android.media.AudioRecord audioRecord = this.f76240x17ce3bc7;
        if (audioRecord != null) {
            audioRecord.release();
            this.f76240x17ce3bc7 = null;
        }
        this.f76243xd0e9f32c.set(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reportWebRtcAudioRecordError */
    public void m156719xbd98dd62(java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Run-time recording error: " + str);
        org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156788xafd368bf(TAG, this.f76246x38b735af, this.f76239xd33b2ef7);
        org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioRecordErrorCallback audioRecordErrorCallback = this.f76249xc08cce6d;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.m156623x1253f3cd(str);
        }
    }

    /* renamed from: reportWebRtcAudioRecordInitError */
    private void m156720x3cfff532(java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Init recording error: " + str);
        org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156788xafd368bf(TAG, this.f76246x38b735af, this.f76239xd33b2ef7);
        m156714xe23882aa(this.f76240x17ce3bc7, false);
        org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioRecordErrorCallback audioRecordErrorCallback = this.f76249xc08cce6d;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.m156624xf823de1d(str);
        }
    }

    /* renamed from: reportWebRtcAudioRecordStartError */
    private void m156721xc5b87ac(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioRecordStartErrorCode audioRecordStartErrorCode, java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156788xafd368bf(TAG, this.f76246x38b735af, this.f76239xd33b2ef7);
        m156714xe23882aa(this.f76240x17ce3bc7, false);
        org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioRecordErrorCallback audioRecordErrorCallback = this.f76249xc08cce6d;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.m156625xb5b4bc21(audioRecordStartErrorCode, str);
        }
    }

    /* renamed from: scheduleLogRecordingConfigurationsTask */
    private void m156722x597e83c6(final android.media.AudioRecord audioRecord) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "scheduleLogRecordingConfigurationsTask");
        java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: org.webrtc.audio.WebRtcAudioRecord$$a
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                java.lang.String m156710x6023130f;
                m156710x6023130f = org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.this.m156710x6023130f(audioRecord);
                return m156710x6023130f;
            }
        };
        java.util.concurrent.ScheduledFuture<java.lang.String> scheduledFuture = this.f76251xb4b58dc3;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f76251xb4b58dc3.cancel(true);
        }
        this.f76251xb4b58dc3 = this.f76250x79c5f8d3.schedule(callable, 100L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    /* renamed from: startRecording */
    private boolean m156723x2619a7af() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "startRecording");
        m156699x7ca149f4(this.f76240x17ce3bc7 != null);
        m156699x7ca149f4(this.f76244x1b68dd80 == null);
        try {
            yj0.a.j(this.f76240x17ce3bc7, "org/webrtc/audio/WebRtcAudioRecord", "startRecording", "()Z", "android/media/AudioRecord", "startRecording", "()V");
            if (this.f76240x17ce3bc7.getRecordingState() != 3) {
                m156721xc5b87ac(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state: " + this.f76240x17ce3bc7.getRecordingState());
                return false;
            }
            org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.AudioRecordThread audioRecordThread = new org.p3371xd0ce3e8d.p3372x58d9bd6.C29927xaf9a06fa.AudioRecordThread("AudioRecordJavaThread");
            this.f76244x1b68dd80 = audioRecordThread;
            audioRecordThread.start();
            m156722x597e83c6(this.f76240x17ce3bc7);
            return true;
        } catch (java.lang.IllegalStateException e17) {
            m156721xc5b87ac(org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e17.getMessage());
            return false;
        }
    }

    /* renamed from: stopRecording */
    private boolean m156724xc350780f() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "stopRecording");
        m156699x7ca149f4(this.f76244x1b68dd80 != null);
        java.util.concurrent.ScheduledFuture<java.lang.String> scheduledFuture = this.f76251xb4b58dc3;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isDone()) {
                this.f76251xb4b58dc3.cancel(true);
            }
            this.f76251xb4b58dc3 = null;
        }
        this.f76244x1b68dd80.m156733xb0a278ac();
        if (!org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156479x7fa650c6(this.f76244x1b68dd80, 2000L)) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Join of AudioRecordJavaThread timed out");
            org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156788xafd368bf(TAG, this.f76246x38b735af, this.f76239xd33b2ef7);
        }
        this.f76244x1b68dd80 = null;
        this.f76247x92b07902.m156674x41012807();
        m156718x4560ed6();
        return true;
    }

    /* renamed from: verifyAudioConfig */
    private static boolean m156725xe1e29c7f(int i17, int i18, android.media.AudioFormat audioFormat, android.media.AudioDeviceInfo audioDeviceInfo, java.util.List<android.media.AudioRecordingConfiguration> list) {
        m156699x7ca149f4(!list.isEmpty());
        for (android.media.AudioRecordingConfiguration audioRecordingConfiguration : list) {
            android.media.AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null && audioRecordingConfiguration.getClientAudioSource() == i17 && audioRecordingConfiguration.getClientAudioSessionId() == i18 && audioRecordingConfiguration.getClientFormat().getEncoding() == audioFormat.getEncoding() && audioRecordingConfiguration.getClientFormat().getSampleRate() == audioFormat.getSampleRate() && audioRecordingConfiguration.getClientFormat().getChannelMask() == audioFormat.getChannelMask() && audioRecordingConfiguration.getClientFormat().getChannelIndexMask() == audioFormat.getChannelIndexMask() && audioRecordingConfiguration.getFormat().getEncoding() != 0 && audioRecordingConfiguration.getFormat().getSampleRate() > 0 && (audioRecordingConfiguration.getFormat().getChannelMask() != 0 || audioRecordingConfiguration.getFormat().getChannelIndexMask() != 0)) {
                if (m156702x53651ee7(audioDevice, audioDeviceInfo)) {
                    org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "verifyAudioConfig: PASS");
                    return true;
                }
            }
        }
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "verifyAudioConfig: FAILED");
        return false;
    }

    /* renamed from: isAcousticEchoCancelerSupported */
    public boolean m156726xd8ff8615() {
        return this.f76252xd8ff8615;
    }

    /* renamed from: isAudioConfigVerified */
    public boolean m156727xd4a36416() {
        return this.f76243xd0e9f32c.get() != null;
    }

    /* renamed from: isAudioSourceMatchingRecordingSession */
    public boolean m156728xb6c7a4a9() {
        java.lang.Boolean bool = this.f76243xd0e9f32c.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Audio configuration has not yet been verified");
        return false;
    }

    /* renamed from: isNoiseSuppressorSupported */
    public boolean m156729x57473606() {
        return this.f76253x57473606;
    }

    /* renamed from: setMicrophoneMute */
    public void m156730xabc4ef65(boolean z17) {
        org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "setMicrophoneMute(" + z17 + ")");
        this.f76254xf536ba63 = z17;
    }

    /* renamed from: setNativeAudioRecord */
    public void m156731x202402ee(long j17) {
        this.f76255xf1596f30 = j17;
    }

    /* renamed from: setPreferredDevice */
    public void m156732xd7725d75(android.media.AudioDeviceInfo audioDeviceInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setPreferredDevice ");
        sb6.append(audioDeviceInfo != null ? java.lang.Integer.valueOf(audioDeviceInfo.getId()) : null);
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, sb6.toString());
        this.f76256xbc39f237 = audioDeviceInfo;
        android.media.AudioRecord audioRecord = this.f76240x17ce3bc7;
        if (audioRecord == null || audioRecord.setPreferredDevice(audioDeviceInfo)) {
            return;
        }
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "setPreferredDevice failed");
    }

    public C29927xaf9a06fa(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, android.media.AudioManager audioManager, int i17, int i18, org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioRecordErrorCallback audioRecordErrorCallback, org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.AudioRecordStateCallback audioRecordStateCallback, org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.SamplesReadyCallback samplesReadyCallback, boolean z17, boolean z18) {
        this.f76247x92b07902 = new org.p3371xd0ce3e8d.p3372x58d9bd6.C29925x95d03379();
        this.f76243xd0e9f32c = new java.util.concurrent.atomic.AtomicReference<>();
        if (z17 && !org.p3371xd0ce3e8d.p3372x58d9bd6.C29925x95d03379.m156670xd8ff8615()) {
            throw new java.lang.IllegalArgumentException("HW AEC not supported");
        }
        if (z18 && !org.p3371xd0ce3e8d.p3372x58d9bd6.C29925x95d03379.m156672x57473606()) {
            throw new java.lang.IllegalArgumentException("HW NS not supported");
        }
        this.f76246x38b735af = context;
        this.f76250x79c5f8d3 = scheduledExecutorService;
        this.f76239xd33b2ef7 = audioManager;
        this.f76242x1a183791 = i17;
        this.f76238x3e7c76d = i18;
        this.f76249xc08cce6d = audioRecordErrorCallback;
        this.f76257x35e027f6 = audioRecordStateCallback;
        this.f76241x4d169a75 = samplesReadyCallback;
        this.f76252xd8ff8615 = z17;
        this.f76253x57473606 = z18;
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "ctor" + org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156784xa79a89ce());
    }
}
