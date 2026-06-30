package org.p3371xd0ce3e8d.p3372x58d9bd6;

/* renamed from: org.webrtc.audio.WebRtcAudioUtils */
/* loaded from: classes15.dex */
final class C29930xdc90fce8 {
    private static final java.lang.String TAG = "WebRtcAudioUtilsExternal";

    /* renamed from: audioEncodingToString */
    public static java.lang.String m156780xb5e54d5(int i17) {
        if (i17 == 0) {
            return "INVALID";
        }
        switch (i17) {
            case 2:
                return "PCM_16BIT";
            case 3:
                return "PCM_8BIT";
            case 4:
                return "PCM_FLOAT";
            case 5:
            case 6:
                return "AC3";
            case 7:
                return "DTS";
            case 8:
                return "DTS_HD";
            case 9:
                return "MP3";
            default:
                return "Invalid encoding: " + i17;
        }
    }

    /* renamed from: audioSourceToString */
    public static java.lang.String m156781xcaa4cd1d(int i17) {
        switch (i17) {
            case 0:
                return com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p240x4e139522.C2426x7e760204.f7429x859b4284;
            case 1:
                return "MIC";
            case 2:
                return "VOICE_UPLINK";
            case 3:
                return "VOICE_DOWNLINK";
            case 4:
                return "VOICE_CALL";
            case 5:
                return "CAMCORDER";
            case 6:
                return "VOICE_RECOGNITION";
            case 7:
                return "VOICE_COMMUNICATION";
            case 8:
            default:
                return "INVALID";
            case 9:
                return "UNPROCESSED";
            case 10:
                return "VOICE_PERFORMANCE";
        }
    }

    /* renamed from: channelMaskToString */
    public static java.lang.String m156782x43e0761b(int i17) {
        return i17 != 12 ? i17 != 16 ? "INVALID" : "IN_MONO" : "IN_STEREO";
    }

    /* renamed from: deviceTypeToString */
    public static java.lang.String m156783xc2270d3c(int i17) {
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

    /* renamed from: getThreadInfo */
    public static java.lang.String m156784xa79a89ce() {
        return "@[name=" + java.lang.Thread.currentThread().getName() + ", id=" + java.lang.Thread.currentThread().getId() + "]";
    }

    /* renamed from: hasMicrophone */
    private static boolean m156785x7acf0f64(android.content.Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    /* renamed from: isVolumeFixed */
    private static boolean m156786x766c0cf0(android.media.AudioManager audioManager) {
        return audioManager.isVolumeFixed();
    }

    /* renamed from: logAudioDeviceInfo */
    private static void m156787x3b87a4b6(java.lang.String str, android.media.AudioManager audioManager) {
        android.media.AudioDeviceInfo[] devices = audioManager.getDevices(3);
        if (devices.length == 0) {
            return;
        }
        org.p3371xd0ce3e8d.C29806x779f633f.d(str, "Audio Devices: ");
        for (android.media.AudioDeviceInfo audioDeviceInfo : devices) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("  ");
            sb6.append(m156783xc2270d3c(audioDeviceInfo.getType()));
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
    public static void m156788xafd368bf(java.lang.String str, android.content.Context context, android.media.AudioManager audioManager) {
        m156791x82ae1688(str);
        m156789xfdcb1aaf(str, context, audioManager);
        m156790xde7b70b9(str, audioManager);
        m156787x3b87a4b6(str, audioManager);
    }

    /* renamed from: logAudioStateBasic */
    private static void m156789xfdcb1aaf(java.lang.String str, android.content.Context context, android.media.AudioManager audioManager) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(str, "Audio State: audio mode: " + m156793x5b6d9d2f(audioManager.getMode()) + ", has mic: " + m156785x7acf0f64(context) + ", mic muted: " + audioManager.isMicrophoneMute() + ", music active: " + audioManager.isMusicActive() + ", speakerphone: " + audioManager.isSpeakerphoneOn() + ", BT SCO: " + audioManager.isBluetoothScoOn());
    }

    /* renamed from: logAudioStateVolume */
    private static void m156790xde7b70b9(java.lang.String str, android.media.AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        org.p3371xd0ce3e8d.C29806x779f633f.d(str, "Audio State: ");
        boolean m156786x766c0cf0 = m156786x766c0cf0(audioManager);
        org.p3371xd0ce3e8d.C29806x779f633f.d(str, "  fixed volume=" + m156786x766c0cf0);
        if (m156786x766c0cf0) {
            return;
        }
        for (int i17 = 0; i17 < 6; i17++) {
            int i18 = iArr[i17];
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("  " + m156795xc34ecf66(i18) + ": ");
            sb6.append("volume=");
            sb6.append(audioManager.getStreamVolume(i18));
            sb6.append(", max=");
            sb6.append(audioManager.getStreamMaxVolume(i18));
            m156792x126f83e7(str, audioManager, i18, sb6);
            org.p3371xd0ce3e8d.C29806x779f633f.d(str, sb6.toString());
        }
    }

    /* renamed from: logDeviceInfo */
    public static void m156791x82ae1688(java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(str, "Android SDK: " + android.os.Build.VERSION.SDK_INT + ", Release: " + android.os.Build.VERSION.RELEASE + ", Brand: " + android.os.Build.BRAND + ", Device: " + android.os.Build.DEVICE + ", Id: " + android.os.Build.ID + ", Hardware: " + android.os.Build.HARDWARE + ", Manufacturer: " + android.os.Build.MANUFACTURER + ", Model: " + android.os.Build.MODEL + ", Product: " + android.os.Build.PRODUCT);
    }

    /* renamed from: logIsStreamMute */
    private static void m156792x126f83e7(java.lang.String str, android.media.AudioManager audioManager, int i17, java.lang.StringBuilder sb6) {
        sb6.append(", muted=");
        sb6.append(audioManager.isStreamMute(i17));
    }

    /* renamed from: modeToString */
    public static java.lang.String m156793x5b6d9d2f(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    /* renamed from: runningOnEmulator */
    public static boolean m156794x228ae533() {
        return android.os.Build.HARDWARE.equals("goldfish") && android.os.Build.BRAND.startsWith("generic_");
    }

    /* renamed from: streamTypeToString */
    private static java.lang.String m156795xc34ecf66(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
    }
}
