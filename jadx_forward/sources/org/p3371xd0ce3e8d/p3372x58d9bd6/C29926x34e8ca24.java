package org.p3371xd0ce3e8d.p3372x58d9bd6;

/* renamed from: org.webrtc.audio.WebRtcAudioManager */
/* loaded from: classes14.dex */
class C29926x34e8ca24 {

    /* renamed from: BITS_PER_SAMPLE */
    private static final int f76225x5b950405 = 16;

    /* renamed from: DEFAULT_FRAME_PER_BUFFER */
    private static final int f76226xdc705252 = 256;

    /* renamed from: DEFAULT_SAMPLE_RATE_HZ */
    private static final int f76227x52b7a91a = 16000;
    private static final java.lang.String TAG = "WebRtcAudioManagerExternal";

    /* renamed from: getAudioManager */
    public static android.media.AudioManager m156677x342dc16d(android.content.Context context) {
        return (android.media.AudioManager) context.getSystemService("audio");
    }

    /* renamed from: getInputBufferSize */
    public static int m156678xa421995(android.content.Context context, android.media.AudioManager audioManager, int i17, int i18) {
        return m156685xbbe4e0f8(context) ? m156679xc6da297(audioManager) : m156680x64a3eca0(i17, i18);
    }

    /* renamed from: getLowLatencyFramesPerBuffer */
    private static int m156679xc6da297(android.media.AudioManager audioManager) {
        java.lang.String property = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            return 256;
        }
        return java.lang.Integer.parseInt(property);
    }

    /* renamed from: getMinInputFrameSize */
    private static int m156680x64a3eca0(int i17, int i18) {
        return android.media.AudioRecord.getMinBufferSize(i17, i18 == 1 ? 16 : 12, 2) / (i18 * 2);
    }

    /* renamed from: getMinOutputFrameSize */
    private static int m156681x83b9dc51(int i17, int i18) {
        return android.media.AudioTrack.getMinBufferSize(i17, i18 == 1 ? 4 : 12, 2) / (i18 * 2);
    }

    /* renamed from: getOutputBufferSize */
    public static int m156682x1d7397b8(android.content.Context context, android.media.AudioManager audioManager, int i17, int i18) {
        return m156686x6b56a39(context) ? m156679xc6da297(audioManager) : m156681x83b9dc51(i17, i18);
    }

    /* renamed from: getSampleRate */
    public static int m156683xf6c809a0(android.media.AudioManager audioManager) {
        if (org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156794x228ae533()) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        int m156684x6f5be3b3 = m156684x6f5be3b3(audioManager);
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Sample rate is set to " + m156684x6f5be3b3 + " Hz");
        return m156684x6f5be3b3;
    }

    /* renamed from: getSampleRateForApiLevel */
    private static int m156684x6f5be3b3(android.media.AudioManager audioManager) {
        java.lang.String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            return 16000;
        }
        return java.lang.Integer.parseInt(property);
    }

    /* renamed from: isLowLatencyInputSupported */
    private static boolean m156685xbbe4e0f8(android.content.Context context) {
        return m156686x6b56a39(context);
    }

    /* renamed from: isLowLatencyOutputSupported */
    private static boolean m156686x6b56a39(android.content.Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }
}
