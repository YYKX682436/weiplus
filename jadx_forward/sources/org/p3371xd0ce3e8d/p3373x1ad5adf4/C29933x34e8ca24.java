package org.p3371xd0ce3e8d.p3373x1ad5adf4;

/* renamed from: org.webrtc.voiceengine.WebRtcAudioManager */
/* loaded from: classes15.dex */
public class C29933x34e8ca24 {

    /* renamed from: BITS_PER_SAMPLE */
    private static final int f76292x5b950405 = 16;

    /* renamed from: DEBUG */
    private static final boolean f76293x3de9e33 = false;

    /* renamed from: DEFAULT_FRAME_PER_BUFFER */
    private static final int f76294xdc705252 = 256;
    private static final java.lang.String TAG = "WebRtcAudioManager";

    /* renamed from: blacklistDeviceForAAudioUsage */
    private static final boolean f76295x4072bad6 = true;

    /* renamed from: blacklistDeviceForOpenSLESUsage */
    private static boolean f76296x28bd37ba;

    /* renamed from: blacklistDeviceForOpenSLESUsageIsOverridden */
    private static boolean f76297x884b2358;

    /* renamed from: useStereoInput */
    private static boolean f76298xc17a02ab;

    /* renamed from: useStereoOutput */
    private static boolean f76299x7867ca40;

    /* renamed from: aAudio */
    private boolean f76300xa950bff5;

    /* renamed from: audioManager */
    private final android.media.AudioManager f76301xd33b2ef7;

    /* renamed from: hardwareAEC */
    private boolean f76302xea2c6db7;

    /* renamed from: hardwareAGC */
    private boolean f76303xea2c6df5;

    /* renamed from: hardwareNS */
    private boolean f76304x289615ad;

    /* renamed from: initialized */
    private boolean f76305x498da6d4;

    /* renamed from: inputBufferSize */
    private int f76306x25e047cb;

    /* renamed from: inputChannels */
    private int f76307x73f275ba;

    /* renamed from: lowLatencyInput */
    private boolean f76308x84cc22e0;

    /* renamed from: lowLatencyOutput */
    private boolean f76309x1f59b0ab;

    /* renamed from: nativeAudioManager */
    private final long f76310x2b1668ae;

    /* renamed from: nativeChannels */
    private int f76311x6d56d107;

    /* renamed from: nativeSampleRate */
    private int f76312xee838d21;

    /* renamed from: outputBufferSize */
    private int f76313x759b3042;

    /* renamed from: outputChannels */
    private int f76314xbf6b0ff1;

    /* renamed from: proAudio */
    private boolean f76315xc23e9d29;

    /* renamed from: sampleRate */
    private int f76316x88751aa;

    /* renamed from: volumeLogger */
    private final org.p3371xd0ce3e8d.p3373x1ad5adf4.C29933x34e8ca24.VolumeLogger f76317x8f008d4a;

    /* renamed from: org.webrtc.voiceengine.WebRtcAudioManager$VolumeLogger */
    /* loaded from: classes15.dex */
    public static class VolumeLogger {

        /* renamed from: THREAD_NAME */
        private static final java.lang.String f76318xf52cdfa0 = "WebRtcVolumeLevelLoggerThread";

        /* renamed from: TIMER_PERIOD_IN_SECONDS */
        private static final int f76319xdabce3e9 = 30;

        /* renamed from: audioManager */
        private final android.media.AudioManager f76320xd33b2ef7;

        /* renamed from: timer */
        private java.util.Timer f76321x6940745;

        /* renamed from: org.webrtc.voiceengine.WebRtcAudioManager$VolumeLogger$LogVolumeTask */
        /* loaded from: classes15.dex */
        public class LogVolumeTask extends java.util.TimerTask {

            /* renamed from: maxRingVolume */
            private final int f76322xd757edee;

            /* renamed from: maxVoiceCallVolume */
            private final int f76323x83bc13e6;

            public LogVolumeTask(int i17, int i18) {
                this.f76322xd757edee = i17;
                this.f76323x83bc13e6 = i18;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                int mode = org.p3371xd0ce3e8d.p3373x1ad5adf4.C29933x34e8ca24.VolumeLogger.this.f76320xd33b2ef7.getMode();
                if (mode == 1) {
                    org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29933x34e8ca24.TAG, "STREAM_RING stream volume: " + org.p3371xd0ce3e8d.p3373x1ad5adf4.C29933x34e8ca24.VolumeLogger.this.f76320xd33b2ef7.getStreamVolume(2) + " (max=" + this.f76322xd757edee + ")");
                    return;
                }
                if (mode == 3) {
                    org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3373x1ad5adf4.C29933x34e8ca24.TAG, "VOICE_CALL stream volume: " + org.p3371xd0ce3e8d.p3373x1ad5adf4.C29933x34e8ca24.VolumeLogger.this.f76320xd33b2ef7.getStreamVolume(0) + " (max=" + this.f76323x83bc13e6 + ")");
                }
            }
        }

        public VolumeLogger(android.media.AudioManager audioManager) {
            this.f76320xd33b2ef7 = audioManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: stop */
        public void m156852x360802() {
            java.util.Timer timer = this.f76321x6940745;
            if (timer != null) {
                timer.cancel();
                this.f76321x6940745 = null;
            }
        }

        /* renamed from: start */
        public void m156853x68ac462() {
            java.util.Timer timer = new java.util.Timer(f76318xf52cdfa0);
            this.f76321x6940745 = timer;
            timer.schedule(new org.p3371xd0ce3e8d.p3373x1ad5adf4.C29933x34e8ca24.VolumeLogger.LogVolumeTask(this.f76320xd33b2ef7.getStreamMaxVolume(2), this.f76320xd33b2ef7.getStreamMaxVolume(0)), 0L, 30000L);
        }
    }

    public C29933x34e8ca24(long j17) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "ctor" + org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156950xa79a89ce());
        this.f76310x2b1668ae = j17;
        android.media.AudioManager audioManager = (android.media.AudioManager) org.p3371xd0ce3e8d.C29752x4bd17462.m155345x6e669035().getSystemService("audio");
        this.f76301xd33b2ef7 = audioManager;
        this.f76317x8f008d4a = new org.p3371xd0ce3e8d.p3373x1ad5adf4.C29933x34e8ca24.VolumeLogger(audioManager);
        m156848xe3cba73f();
        m156844x4f0d4d35(this.f76316x88751aa, this.f76314xbf6b0ff1, this.f76307x73f275ba, this.f76302xea2c6db7, this.f76303xea2c6df5, this.f76304x289615ad, this.f76309x1f59b0ab, this.f76308x84cc22e0, this.f76315xc23e9d29, this.f76300xa950bff5, this.f76313x759b3042, this.f76306x25e047cb, j17);
        org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156958xafd368bf(TAG);
    }

    /* renamed from: assertTrue */
    private static void m156825x7ca149f4(boolean z17) {
        if (!z17) {
            throw new java.lang.AssertionError("Expected condition to be true");
        }
    }

    /* renamed from: dispose */
    private void m156826x63a5261f() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "dispose" + org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156950xa79a89ce());
        if (this.f76305x498da6d4) {
            this.f76317x8f008d4a.m156852x360802();
        }
    }

    /* renamed from: getLowLatencyInputFramesPerBuffer */
    private int m156827xe8cd37ad() {
        m156825x7ca149f4(m156849xbbe4e0f8());
        return m156828xe6cd756();
    }

    /* renamed from: getLowLatencyOutputFramesPerBuffer */
    private int m156828xe6cd756() {
        m156825x7ca149f4(m156841x6b56a39());
        java.lang.String property = this.f76301xd33b2ef7.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            return 256;
        }
        return java.lang.Integer.parseInt(property);
    }

    /* renamed from: getMinInputFrameSize */
    private static int m156829x64a3eca0(int i17, int i18) {
        return android.media.AudioRecord.getMinBufferSize(i17, i18 == 1 ? 16 : 12, 2) / (i18 * 2);
    }

    /* renamed from: getMinOutputFrameSize */
    private static int m156830x83b9dc51(int i17, int i18) {
        return android.media.AudioTrack.getMinBufferSize(i17, i18 == 1 ? 4 : 12, 2) / (i18 * 2);
    }

    /* renamed from: getNativeOutputSampleRate */
    private int m156831x95fbb6b8() {
        if (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156964x228ae533()) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        if (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156954x3b375355()) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Default sample rate is overriden to " + org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156949x543c4607() + " Hz");
            return org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156949x543c4607();
        }
        int m156832x6f5be3b3 = m156832x6f5be3b3();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Sample rate is set to " + m156832x6f5be3b3 + " Hz");
        return m156832x6f5be3b3;
    }

    /* renamed from: getSampleRateForApiLevel */
    private int m156832x6f5be3b3() {
        java.lang.String property = this.f76301xd33b2ef7.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        return property == null ? org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156949x543c4607() : java.lang.Integer.parseInt(property);
    }

    /* renamed from: getStereoInput */
    public static synchronized boolean m156833xcf97517c() {
        boolean z17;
        synchronized (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29933x34e8ca24.class) {
            z17 = f76298xc17a02ab;
        }
        return z17;
    }

    /* renamed from: getStereoOutput */
    public static synchronized boolean m156834x2df4558f() {
        boolean z17;
        synchronized (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29933x34e8ca24.class) {
            z17 = f76299x7867ca40;
        }
        return z17;
    }

    /* renamed from: hasEarpiece */
    private boolean m156835x7b4be612() {
        return org.p3371xd0ce3e8d.C29752x4bd17462.m155345x6e669035().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    /* renamed from: init */
    private boolean m156836x316510() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82 + org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156950xa79a89ce());
        if (this.f76305x498da6d4) {
            return true;
        }
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "audio mode is: " + org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156963x5b6d9d2f(this.f76301xd33b2ef7.getMode()));
        this.f76305x498da6d4 = true;
        this.f76317x8f008d4a.m156853x68ac462();
        return true;
    }

    /* renamed from: isAAudioSupported */
    private boolean m156837xb68c9af() {
        org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "AAudio support is currently disabled on all devices!");
        return false;
    }

    /* renamed from: isAcousticEchoCancelerSupported */
    private static boolean m156838xd8ff8615() {
        return org.p3371xd0ce3e8d.p3373x1ad5adf4.C29932x95d03379.m156807xa8b3c086();
    }

    /* renamed from: isCommunicationModeEnabled */
    private boolean m156839x20cde5b2() {
        return this.f76301xd33b2ef7.getMode() == 3;
    }

    /* renamed from: isDeviceBlacklistedForOpenSLESUsage */
    private boolean m156840xad85c223() {
        boolean m156945x71c8a823 = f76297x884b2358 ? f76296x28bd37ba : org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156945x71c8a823();
        if (m156945x71c8a823) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, android.os.Build.MODEL + " is blacklisted for OpenSL ES usage!");
        }
        return m156945x71c8a823;
    }

    /* renamed from: isLowLatencyOutputSupported */
    private boolean m156841x6b56a39() {
        return org.p3371xd0ce3e8d.C29752x4bd17462.m155345x6e669035().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    /* renamed from: isNoiseSuppressorSupported */
    private static boolean m156842x57473606() {
        return org.p3371xd0ce3e8d.p3373x1ad5adf4.C29932x95d03379.m156808x2f66817b();
    }

    /* renamed from: isProAudioSupported */
    private boolean m156843x1718017b() {
        return org.p3371xd0ce3e8d.C29752x4bd17462.m155345x6e669035().getPackageManager().hasSystemFeature("android.hardware.audio.pro");
    }

    /* renamed from: nativeCacheAudioParameters */
    private native void m156844x4f0d4d35(int i17, int i18, int i19, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, boolean z37, int i27, int i28, long j17);

    /* renamed from: setBlacklistDeviceForOpenSLESUsage */
    public static synchronized void m156845x5ce366f8(boolean z17) {
        synchronized (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29933x34e8ca24.class) {
            f76297x884b2358 = true;
            f76296x28bd37ba = z17;
        }
    }

    /* renamed from: setStereoInput */
    public static synchronized void m156846x65fcc4f0(boolean z17) {
        synchronized (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29933x34e8ca24.class) {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Overriding default input behavior: setStereoInput(" + z17 + ')');
            f76298xc17a02ab = z17;
        }
    }

    /* renamed from: setStereoOutput */
    public static synchronized void m156847x643d509b(boolean z17) {
        synchronized (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29933x34e8ca24.class) {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Overriding default output behavior: setStereoOutput(" + z17 + ')');
            f76299x7867ca40 = z17;
        }
    }

    /* renamed from: storeAudioParameters */
    private void m156848xe3cba73f() {
        this.f76314xbf6b0ff1 = m156834x2df4558f() ? 2 : 1;
        this.f76307x73f275ba = m156833xcf97517c() ? 2 : 1;
        this.f76316x88751aa = m156831x95fbb6b8();
        this.f76302xea2c6db7 = m156838xd8ff8615();
        this.f76303xea2c6df5 = false;
        this.f76304x289615ad = m156842x57473606();
        this.f76309x1f59b0ab = m156841x6b56a39();
        this.f76308x84cc22e0 = m156849xbbe4e0f8();
        this.f76315xc23e9d29 = m156843x1718017b();
        this.f76300xa950bff5 = m156837xb68c9af();
        this.f76313x759b3042 = this.f76309x1f59b0ab ? m156828xe6cd756() : m156830x83b9dc51(this.f76316x88751aa, this.f76314xbf6b0ff1);
        this.f76306x25e047cb = this.f76308x84cc22e0 ? m156827xe8cd37ad() : m156829x64a3eca0(this.f76316x88751aa, this.f76307x73f275ba);
    }

    /* renamed from: isLowLatencyInputSupported */
    public boolean m156849xbbe4e0f8() {
        return m156841x6b56a39();
    }
}
