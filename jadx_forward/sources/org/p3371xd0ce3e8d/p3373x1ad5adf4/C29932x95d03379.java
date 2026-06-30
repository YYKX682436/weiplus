package org.p3371xd0ce3e8d.p3373x1ad5adf4;

/* renamed from: org.webrtc.voiceengine.WebRtcAudioEffects */
/* loaded from: classes15.dex */
public class C29932x95d03379 {

    /* renamed from: AOSP_ACOUSTIC_ECHO_CANCELER */
    private static final java.util.UUID f76286x148e8eb9 = java.util.UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");

    /* renamed from: AOSP_NOISE_SUPPRESSOR */
    private static final java.util.UUID f76287x3affe871 = java.util.UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");

    /* renamed from: DEBUG */
    private static final boolean f76288x3de9e33 = false;
    private static final java.lang.String TAG = "WebRtcAudioEffects";

    /* renamed from: cachedEffects */
    private static android.media.audiofx.AudioEffect.Descriptor[] f76289x220a580;
    private android.media.audiofx.AcousticEchoCanceler aec;

    /* renamed from: ns, reason: collision with root package name */
    private android.media.audiofx.NoiseSuppressor f429500ns;

    /* renamed from: shouldEnableAec */
    private boolean f76290x9da20bc9;

    /* renamed from: shouldEnableNs */
    private boolean f76291x1ddbf17b;

    private C29932x95d03379() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "ctor" + org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156950xa79a89ce());
    }

    /* renamed from: assertTrue */
    private static void m156806x7ca149f4(boolean z17) {
        if (!z17) {
            throw new java.lang.AssertionError("Expected condition to be true");
        }
    }

    /* renamed from: canUseAcousticEchoCanceler */
    public static boolean m156807xa8b3c086() {
        boolean z17 = (!m156815xd8ff8615() || org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156970xa2a5722e() || m156812x48955623() || m156814x9518d5f5()) ? false : true;
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "canUseAcousticEchoCanceler: " + z17);
        return z17;
    }

    /* renamed from: canUseNoiseSuppressor */
    public static boolean m156808x2f66817b() {
        boolean z17 = (!m156820x57473606() || org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156972x14c666d3() || m156817x53b0cdd4() || m156819x268674a4()) ? false : true;
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "canUseNoiseSuppressor: " + z17);
        return z17;
    }

    /* renamed from: create */
    public static org.p3371xd0ce3e8d.p3373x1ad5adf4.C29932x95d03379 m156809xaf65a0fc() {
        return new org.p3371xd0ce3e8d.p3373x1ad5adf4.C29932x95d03379();
    }

    /* renamed from: effectTypeIsVoIP */
    private boolean m156810x66366635(java.util.UUID uuid) {
        return (android.media.audiofx.AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && m156815xd8ff8615()) || (android.media.audiofx.AudioEffect.EFFECT_TYPE_NS.equals(uuid) && m156820x57473606());
    }

    /* renamed from: getAvailableEffects */
    private static android.media.audiofx.AudioEffect.Descriptor[] m156811xa05ce96f() {
        android.media.audiofx.AudioEffect.Descriptor[] descriptorArr = f76289x220a580;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        android.media.audiofx.AudioEffect.Descriptor[] queryEffects = android.media.audiofx.AudioEffect.queryEffects();
        f76289x220a580 = queryEffects;
        return queryEffects;
    }

    /* renamed from: isAcousticEchoCancelerBlacklisted */
    public static boolean m156812x48955623() {
        java.util.List<java.lang.String> m156947x80e3a67b = org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156947x80e3a67b();
        java.lang.String str = android.os.Build.MODEL;
        boolean contains = m156947x80e3a67b.contains(str);
        if (contains) {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, str + " is blacklisted for HW AEC usage!");
        }
        return contains;
    }

    /* renamed from: isAcousticEchoCancelerEffectAvailable */
    private static boolean m156813x50acec5f() {
        return m156816xeac1ad14(android.media.audiofx.AudioEffect.EFFECT_TYPE_AEC);
    }

    /* renamed from: isAcousticEchoCancelerExcludedByUUID */
    private static boolean m156814x9518d5f5() {
        for (android.media.audiofx.AudioEffect.Descriptor descriptor : m156811xa05ce96f()) {
            if (descriptor.type.equals(android.media.audiofx.AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(f76286x148e8eb9)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isAcousticEchoCancelerSupported */
    public static boolean m156815xd8ff8615() {
        return m156813x50acec5f();
    }

    /* renamed from: isEffectTypeAvailable */
    private static boolean m156816xeac1ad14(java.util.UUID uuid) {
        android.media.audiofx.AudioEffect.Descriptor[] m156811xa05ce96f = m156811xa05ce96f();
        if (m156811xa05ce96f == null) {
            return false;
        }
        for (android.media.audiofx.AudioEffect.Descriptor descriptor : m156811xa05ce96f) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isNoiseSuppressorBlacklisted */
    public static boolean m156817x53b0cdd4() {
        java.util.List<java.lang.String> m156948xba813163 = org.p3371xd0ce3e8d.p3373x1ad5adf4.C29936xdc90fce8.m156948xba813163();
        java.lang.String str = android.os.Build.MODEL;
        boolean contains = m156948xba813163.contains(str);
        if (contains) {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, str + " is blacklisted for HW NS usage!");
        }
        return contains;
    }

    /* renamed from: isNoiseSuppressorEffectAvailable */
    private static boolean m156818xecf32390() {
        return m156816xeac1ad14(android.media.audiofx.AudioEffect.EFFECT_TYPE_NS);
    }

    /* renamed from: isNoiseSuppressorExcludedByUUID */
    private static boolean m156819x268674a4() {
        for (android.media.audiofx.AudioEffect.Descriptor descriptor : m156811xa05ce96f()) {
            if (descriptor.type.equals(android.media.audiofx.AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(f76287x3affe871)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isNoiseSuppressorSupported */
    public static boolean m156820x57473606() {
        return m156818xecf32390();
    }

    /* renamed from: enable */
    public void m156821xb2952583(int i17) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "enable(audioSession=" + i17 + ")");
        m156806x7ca149f4(this.aec == null);
        m156806x7ca149f4(this.f429500ns == null);
        if (m156815xd8ff8615()) {
            android.media.audiofx.AcousticEchoCanceler create = android.media.audiofx.AcousticEchoCanceler.create(i17);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                boolean z17 = this.f76290x9da20bc9 && m156807xa8b3c086();
                if (this.aec.setEnabled(z17) != 0) {
                    org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Failed to set the AcousticEchoCanceler state");
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AcousticEchoCanceler: was ");
                sb6.append(enabled ? "enabled" : "disabled");
                sb6.append(", enable: ");
                sb6.append(z17);
                sb6.append(", is now: ");
                sb6.append(this.aec.getEnabled() ? "enabled" : "disabled");
                org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, sb6.toString());
            } else {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (m156820x57473606()) {
            android.media.audiofx.NoiseSuppressor create2 = android.media.audiofx.NoiseSuppressor.create(i17);
            this.f429500ns = create2;
            if (create2 == null) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Failed to create the NoiseSuppressor instance");
                return;
            }
            boolean enabled2 = create2.getEnabled();
            boolean z18 = this.f76291x1ddbf17b && m156808x2f66817b();
            if (this.f429500ns.setEnabled(z18) != 0) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Failed to set the NoiseSuppressor state");
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("NoiseSuppressor: was ");
            sb7.append(enabled2 ? "enabled" : "disabled");
            sb7.append(", enable: ");
            sb7.append(z18);
            sb7.append(", is now: ");
            sb7.append(this.f429500ns.getEnabled() ? "enabled" : "disabled");
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, sb7.toString());
        }
    }

    /* renamed from: release */
    public void m156822x41012807() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "release");
        android.media.audiofx.AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        android.media.audiofx.NoiseSuppressor noiseSuppressor = this.f429500ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.f429500ns = null;
        }
    }

    /* renamed from: setAEC */
    public boolean m156823xca024cfd(boolean z17) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "setAEC(" + z17 + ")");
        if (!m156807xa8b3c086()) {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Platform AEC is not supported");
            this.f76290x9da20bc9 = false;
            return false;
        }
        if (this.aec == null || z17 == this.f76290x9da20bc9) {
            this.f76290x9da20bc9 = z17;
            return true;
        }
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Platform AEC state can't be modified while recording");
        return false;
    }

    /* renamed from: setNS */
    public boolean m156824x68435a7(boolean z17) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "setNS(" + z17 + ")");
        if (!m156808x2f66817b()) {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Platform NS is not supported");
            this.f76291x1ddbf17b = false;
            return false;
        }
        if (this.f429500ns == null || z17 == this.f76291x1ddbf17b) {
            this.f76291x1ddbf17b = z17;
            return true;
        }
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Platform NS state can't be modified while recording");
        return false;
    }
}
