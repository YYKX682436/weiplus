package org.p3371xd0ce3e8d.p3372x58d9bd6;

/* renamed from: org.webrtc.audio.WebRtcAudioEffects */
/* loaded from: classes15.dex */
class C29925x95d03379 {

    /* renamed from: AOSP_ACOUSTIC_ECHO_CANCELER */
    private static final java.util.UUID f76219x148e8eb9 = java.util.UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");

    /* renamed from: AOSP_NOISE_SUPPRESSOR */
    private static final java.util.UUID f76220x3affe871 = java.util.UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");

    /* renamed from: DEBUG */
    private static final boolean f76221x3de9e33 = false;
    private static final java.lang.String TAG = "WebRtcAudioEffectsExternal";

    /* renamed from: cachedEffects */
    private static android.media.audiofx.AudioEffect.Descriptor[] f76222x220a580;
    private android.media.audiofx.AcousticEchoCanceler aec;

    /* renamed from: ns, reason: collision with root package name */
    private android.media.audiofx.NoiseSuppressor f429497ns;

    /* renamed from: shouldEnableAec */
    private boolean f76223x9da20bc9;

    /* renamed from: shouldEnableNs */
    private boolean f76224x1ddbf17b;

    public C29925x95d03379() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "ctor" + org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156784xa79a89ce());
    }

    /* renamed from: assertTrue */
    private static void m156667x7ca149f4(boolean z17) {
        if (!z17) {
            throw new java.lang.AssertionError("Expected condition to be true");
        }
    }

    /* renamed from: effectTypeIsVoIP */
    private boolean m156668x66366635(java.util.UUID uuid) {
        return (android.media.audiofx.AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && m156670xd8ff8615()) || (android.media.audiofx.AudioEffect.EFFECT_TYPE_NS.equals(uuid) && m156672x57473606());
    }

    /* renamed from: getAvailableEffects */
    private static android.media.audiofx.AudioEffect.Descriptor[] m156669xa05ce96f() {
        android.media.audiofx.AudioEffect.Descriptor[] descriptorArr = f76222x220a580;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        android.media.audiofx.AudioEffect.Descriptor[] queryEffects = android.media.audiofx.AudioEffect.queryEffects();
        f76222x220a580 = queryEffects;
        return queryEffects;
    }

    /* renamed from: isAcousticEchoCancelerSupported */
    public static boolean m156670xd8ff8615() {
        return m156671xeac1ad14(android.media.audiofx.AudioEffect.EFFECT_TYPE_AEC, f76219x148e8eb9);
    }

    /* renamed from: isEffectTypeAvailable */
    private static boolean m156671xeac1ad14(java.util.UUID uuid, java.util.UUID uuid2) {
        android.media.audiofx.AudioEffect.Descriptor[] m156669xa05ce96f = m156669xa05ce96f();
        if (m156669xa05ce96f == null) {
            return false;
        }
        for (android.media.audiofx.AudioEffect.Descriptor descriptor : m156669xa05ce96f) {
            if (descriptor.type.equals(uuid)) {
                return !r4.uuid.equals(uuid2);
            }
        }
        return false;
    }

    /* renamed from: isNoiseSuppressorSupported */
    public static boolean m156672x57473606() {
        return m156671xeac1ad14(android.media.audiofx.AudioEffect.EFFECT_TYPE_NS, f76220x3affe871);
    }

    /* renamed from: enable */
    public void m156673xb2952583(int i17) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "enable(audioSession=" + i17 + ")");
        m156667x7ca149f4(this.aec == null);
        m156667x7ca149f4(this.f429497ns == null);
        if (m156670xd8ff8615()) {
            android.media.audiofx.AcousticEchoCanceler create = android.media.audiofx.AcousticEchoCanceler.create(i17);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                boolean z17 = this.f76223x9da20bc9 && m156670xd8ff8615();
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
        if (m156672x57473606()) {
            android.media.audiofx.NoiseSuppressor create2 = android.media.audiofx.NoiseSuppressor.create(i17);
            this.f429497ns = create2;
            if (create2 == null) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Failed to create the NoiseSuppressor instance");
                return;
            }
            boolean enabled2 = create2.getEnabled();
            boolean z18 = this.f76224x1ddbf17b && m156672x57473606();
            if (this.f429497ns.setEnabled(z18) != 0) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Failed to set the NoiseSuppressor state");
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("NoiseSuppressor: was ");
            sb7.append(enabled2 ? "enabled" : "disabled");
            sb7.append(", enable: ");
            sb7.append(z18);
            sb7.append(", is now: ");
            sb7.append(this.f429497ns.getEnabled() ? "enabled" : "disabled");
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, sb7.toString());
        }
    }

    /* renamed from: release */
    public void m156674x41012807() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "release");
        android.media.audiofx.AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        android.media.audiofx.NoiseSuppressor noiseSuppressor = this.f429497ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.f429497ns = null;
        }
    }

    /* renamed from: setAEC */
    public boolean m156675xca024cfd(boolean z17) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "setAEC(" + z17 + ")");
        if (!m156670xd8ff8615()) {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Platform AEC is not supported");
            this.f76223x9da20bc9 = false;
            return false;
        }
        if (this.aec == null || z17 == this.f76223x9da20bc9) {
            this.f76223x9da20bc9 = z17;
            return true;
        }
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Platform AEC state can't be modified while recording");
        return false;
    }

    /* renamed from: setNS */
    public boolean m156676x68435a7(boolean z17) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "setNS(" + z17 + ")");
        if (!m156672x57473606()) {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Platform NS is not supported");
            this.f76224x1ddbf17b = false;
            return false;
        }
        if (this.f429497ns == null || z17 == this.f76224x1ddbf17b) {
            this.f76224x1ddbf17b = z17;
            return true;
        }
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Platform NS state can't be modified while recording");
        return false;
    }
}
