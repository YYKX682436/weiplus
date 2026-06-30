package org.p3371xd0ce3e8d.p3373x1ad5adf4;

/* renamed from: org.webrtc.voiceengine.WebRtcAudioUtils */
/* loaded from: classes15.dex */
public final class C29936xdc90fce8 {

    /* renamed from: DEFAULT_SAMPLE_RATE_HZ */
    private static final int f76378x52b7a91a = 16000;
    private static final java.lang.String TAG = "WebRtcAudioUtils";

    /* renamed from: defaultSampleRateHz */
    private static int f76379xfc0c693d = 16000;

    /* renamed from: isDefaultSampleRateOverridden */
    private static boolean f76380x3b375355;

    /* renamed from: useWebRtcBasedAcousticEchoCanceler */
    private static boolean f76381xa2a5722e;

    /* renamed from: useWebRtcBasedNoiseSuppressor */
    private static boolean f76382x14c666d3;

    /* renamed from: BLACKLISTED_OPEN_SL_ES_MODELS */
    private static final java.lang.String[] f76377xb8465167 = new java.lang.String[0];

    /* renamed from: BLACKLISTED_AEC_MODELS */
    private static final java.lang.String[] f76375x15f2cbcd = new java.lang.String[0];

    /* renamed from: BLACKLISTED_NS_MODELS */
    private static final java.lang.String[] f76376xaf816801 = new java.lang.String[0];

    /* renamed from: deviceIsBlacklistedForOpenSLESUsage */
    public static boolean m156945x71c8a823() {
        return java.util.Arrays.asList(f76377xb8465167).contains(android.os.Build.MODEL);
    }

    /* renamed from: deviceTypeToString */
    private static java.lang.String m156946xc2270d3c(int i17) {
        switch (i17) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    /* renamed from: getBlackListedModelsForAecUsage */
    public static java.util.List<java.lang.String> m156947x80e3a67b() {
        return java.util.Arrays.asList(f76375x15f2cbcd);
    }

    /* renamed from: getBlackListedModelsForNsUsage */
    public static java.util.List<java.lang.String> m156948xba813163() {
        return java.util.Arrays.asList(f76376xaf816801);
    }

    /* renamed from: getDefaultSampleRateHz */
    public static synchronized int m156949x543c4607() {
        int i17;
        synchronized (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.class) {
            i17 = f76379xfc0c693d;
        }
        return i17;
    }

    /* renamed from: getThreadInfo */
    public static java.lang.String m156950xa79a89ce() {
        return "@[name=" + java.lang.Thread.currentThread().getName() + ", id=" + java.lang.Thread.currentThread().getId() + "]";
    }

    /* renamed from: hasMicrophone */
    private static boolean m156951x7acf0f64() {
        return org.p3371xd0ce3e8d.C29752x4bd17462.m155345x6e669035().getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    /* renamed from: isAcousticEchoCancelerSupported */
    public static boolean m156952xd8ff8615() {
        return org.p3371xd0ce3e8d.p3373x1ad5adf4.C29932x95d03379.m156807xa8b3c086();
    }

    /* renamed from: isAutomaticGainControlSupported */
    public static boolean m156953xb93a4731() {
        return false;
    }

    /* renamed from: isDefaultSampleRateOverridden */
    public static synchronized boolean m156954x3b375355() {
        boolean z17;
        synchronized (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.class) {
            z17 = f76380x3b375355;
        }
        return z17;
    }

    /* renamed from: isNoiseSuppressorSupported */
    public static boolean m156955x57473606() {
        return org.p3371xd0ce3e8d.p3373x1ad5adf4.C29932x95d03379.m156808x2f66817b();
    }

    /* renamed from: isVolumeFixed */
    private static boolean m156956x766c0cf0(android.media.AudioManager audioManager) {
        return audioManager.isVolumeFixed();
    }

    /* renamed from: logAudioDeviceInfo */
    private static void m156957x3b87a4b6(java.lang.String str, android.media.AudioManager audioManager) {
        android.media.AudioDeviceInfo[] devices = audioManager.getDevices(3);
        if (devices.length == 0) {
            return;
        }
        org.p3371xd0ce3e8d.C29806x779f633f.d(str, "Audio Devices: ");
        for (android.media.AudioDeviceInfo audioDeviceInfo : devices) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("  ");
            sb6.append(m156946xc2270d3c(audioDeviceInfo.getType()));
            sb6.append(audioDeviceInfo.isSource() ? "(in): " : "(out): ");
            if (audioDeviceInfo.getChannelCounts().length > 0) {
                sb6.append("channels=");
                sb6.append(java.util.Arrays.toString(audioDeviceInfo.getChannelCounts()));
                sb6.append(", ");
            }
            if (audioDeviceInfo.getEncodings().length > 0) {
                sb6.append("encodings=");
                sb6.append(java.util.Arrays.toString(audioDeviceInfo.getEncodings()));
                sb6.append(", ");
            }
            if (audioDeviceInfo.getSampleRates().length > 0) {
                sb6.append("sample rates=");
                sb6.append(java.util.Arrays.toString(audioDeviceInfo.getSampleRates()));
                sb6.append(", ");
            }
            sb6.append("id=");
            sb6.append(audioDeviceInfo.getId());
            org.p3371xd0ce3e8d.C29806x779f633f.d(str, sb6.toString());
        }
    }

    /* renamed from: logAudioState */
    public static void m156958xafd368bf(java.lang.String str) {
        m156961x82ae1688(str);
        android.media.AudioManager audioManager = (android.media.AudioManager) org.p3371xd0ce3e8d.C29752x4bd17462.m155345x6e669035().getSystemService("audio");
        m156959xfdcb1aaf(str, audioManager);
        m156960xde7b70b9(str, audioManager);
        m156957x3b87a4b6(str, audioManager);
    }

    /* renamed from: logAudioStateBasic */
    private static void m156959xfdcb1aaf(java.lang.String str, android.media.AudioManager audioManager) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(str, "Audio State: audio mode: " + m156963x5b6d9d2f(audioManager.getMode()) + ", has mic: " + m156951x7acf0f64() + ", mic muted: " + audioManager.isMicrophoneMute() + ", music active: " + audioManager.isMusicActive() + ", speakerphone: " + audioManager.isSpeakerphoneOn() + ", BT SCO: " + audioManager.isBluetoothScoOn());
    }

    /* renamed from: logAudioStateVolume */
    private static void m156960xde7b70b9(java.lang.String str, android.media.AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        org.p3371xd0ce3e8d.C29806x779f633f.d(str, "Audio State: ");
        boolean m156956x766c0cf0 = m156956x766c0cf0(audioManager);
        org.p3371xd0ce3e8d.C29806x779f633f.d(str, "  fixed volume=" + m156956x766c0cf0);
        if (m156956x766c0cf0) {
            return;
        }
        for (int i17 = 0; i17 < 6; i17++) {
            int i18 = iArr[i17];
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("  " + m156969xc34ecf66(i18) + ": ");
            sb6.append("volume=");
            sb6.append(audioManager.getStreamVolume(i18));
            sb6.append(", max=");
            sb6.append(audioManager.getStreamMaxVolume(i18));
            m156962x126f83e7(str, audioManager, i18, sb6);
            org.p3371xd0ce3e8d.C29806x779f633f.d(str, sb6.toString());
        }
    }

    /* renamed from: logDeviceInfo */
    public static void m156961x82ae1688(java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(str, "Android SDK: " + android.os.Build.VERSION.SDK_INT + ", Release: " + android.os.Build.VERSION.RELEASE + ", Brand: " + android.os.Build.BRAND + ", Device: " + android.os.Build.DEVICE + ", Id: " + android.os.Build.ID + ", Hardware: " + android.os.Build.HARDWARE + ", Manufacturer: " + android.os.Build.MANUFACTURER + ", Model: " + android.os.Build.MODEL + ", Product: " + android.os.Build.PRODUCT);
    }

    /* renamed from: logIsStreamMute */
    private static void m156962x126f83e7(java.lang.String str, android.media.AudioManager audioManager, int i17, java.lang.StringBuilder sb6) {
        sb6.append(", muted=");
        sb6.append(audioManager.isStreamMute(i17));
    }

    /* renamed from: modeToString */
    public static java.lang.String m156963x5b6d9d2f(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    /* renamed from: runningOnEmulator */
    public static boolean m156964x228ae533() {
        return android.os.Build.HARDWARE.equals("goldfish") && android.os.Build.BRAND.startsWith("generic_");
    }

    /* renamed from: setDefaultSampleRateHz */
    public static synchronized void m156965xa281057b(int i17) {
        synchronized (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.class) {
            f76380x3b375355 = true;
            f76379xfc0c693d = i17;
        }
    }

    /* renamed from: setWebRtcBasedAcousticEchoCanceler */
    public static synchronized void m156966x416d5ff3(boolean z17) {
        synchronized (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.class) {
            f76381xa2a5722e = z17;
        }
    }

    /* renamed from: setWebRtcBasedAutomaticGainControl */
    public static synchronized void m156967xb98baf57(boolean z17) {
        synchronized (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.class) {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "setWebRtcBasedAutomaticGainControl() is deprecated");
        }
    }

    /* renamed from: setWebRtcBasedNoiseSuppressor */
    public static synchronized void m156968xf27831ee(boolean z17) {
        synchronized (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.class) {
            f76382x14c666d3 = z17;
        }
    }

    /* renamed from: streamTypeToString */
    private static java.lang.String m156969xc34ecf66(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
    }

    /* renamed from: useWebRtcBasedAcousticEchoCanceler */
    public static synchronized boolean m156970xa2a5722e() {
        boolean z17;
        synchronized (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.class) {
            if (f76381xa2a5722e) {
                org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Overriding default behavior; now using WebRTC AEC!");
            }
            z17 = f76381xa2a5722e;
        }
        return z17;
    }

    /* renamed from: useWebRtcBasedAutomaticGainControl */
    public static synchronized boolean m156971x1ac3c192() {
        synchronized (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.class) {
        }
        return true;
    }

    /* renamed from: useWebRtcBasedNoiseSuppressor */
    public static synchronized boolean m156972x14c666d3() {
        boolean z17;
        synchronized (org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.class) {
            if (f76382x14c666d3) {
                org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Overriding default behavior; now using WebRTC NS!");
            }
            z17 = f76382x14c666d3;
        }
        return z17;
    }
}
