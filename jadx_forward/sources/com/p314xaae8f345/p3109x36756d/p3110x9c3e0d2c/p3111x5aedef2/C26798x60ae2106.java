package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::extensions")
/* renamed from: com.tencent.trtc.hardwareearmonitor.daisy.HardwareEarMonitorDaisy */
/* loaded from: classes16.dex */
public class C26798x60ae2106 implements com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26801xf73addce {

    /* renamed from: mDaisyAudioKit */
    private com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412 f57331x91b52cc5;

    /* renamed from: mDaisyKaraokeKit */
    private com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140 f57332xf781fab7;

    /* renamed from: mNativeHardwareEarMonitorHandle */
    private long f57334x211c7978;

    /* renamed from: mLock */
    private java.lang.Object f57333x6243b38 = new java.lang.Object();

    /* renamed from: mAudioManager */
    private android.media.AudioManager f57329x6ad04804 = (android.media.AudioManager) com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035().getSystemService("audio");

    /* renamed from: mContext */
    private android.content.Context f57330xd6cfe882 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();

    public C26798x60ae2106(long j17) {
        this.f57334x211c7978 = j17;
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412 c26795x66465412 = new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412(com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035(), this);
        this.f57331x91b52cc5 = c26795x66465412;
        c26795x66465412.m105686x33ebcb90();
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26798x60ae2106 m105701xaf65a0fc(long j17) {
        return new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26798x60ae2106(j17);
    }

    /* renamed from: isAudioKitSupport */
    public static boolean m105702xbfc3d205() {
        return com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26796x76d2f6db.m105694xbfc3d205(com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035());
    }

    /* renamed from: nativeHandleResult */
    private static native void m105703x87f1e1c(long j17, int i17);

    /* renamed from: setEqualizer */
    private int m105704x8e087090(int i17) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140 c26794xe6f50140 = this.f57332xf781fab7;
        if (c26794xe6f50140 == null) {
            return 1806;
        }
        return c26794xe6f50140.m105664xd03fe567(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140.ParameName.CMD_SET_VOCAL_EQUALIZER_MODE, i17);
    }

    /* renamed from: setVolume */
    private int m105705x27f73e1c(int i17) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140 c26794xe6f50140 = this.f57332xf781fab7;
        if (c26794xe6f50140 == null) {
            return 1806;
        }
        return c26794xe6f50140.m105664xd03fe567(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140.ParameName.CMD_SET_VOCAL_VOLUME_BASE, i17);
    }

    /* renamed from: createKaraokeService */
    public void m105706xe32a44d() {
        this.f57332xf781fab7 = (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140) this.f57331x91b52cc5.m105683x4b899e5a(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412.FeatureType.HWAUDIO_FEATURE_KARAOKE);
    }

    /* renamed from: destroy */
    public void m105707x5cd39ffa() {
        synchronized (this.f57333x6243b38) {
            this.f57334x211c7978 = 0L;
        }
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412 c26795x66465412 = this.f57331x91b52cc5;
        if (c26795x66465412 != null) {
            c26795x66465412.m105684x5cd39ffa();
            this.f57331x91b52cc5 = null;
        }
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140 c26794xe6f50140 = this.f57332xf781fab7;
        if (c26794xe6f50140 != null) {
            c26794xe6f50140.m105659x5cd39ffa();
            this.f57332xf781fab7 = null;
        }
    }

    /* renamed from: enableKaraoke */
    public int m105708xaeedee1(boolean z17) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140 c26794xe6f50140 = this.f57332xf781fab7;
        if (c26794xe6f50140 == null) {
            return 1806;
        }
        return c26794xe6f50140.m105660x27fee4d5(z17);
    }

    /* renamed from: getKaraokeSupportedServices */
    public int[] m105709x93067b1e() {
        java.util.List<java.lang.Integer> m105685x55fd1655 = this.f57331x91b52cc5.m105685x55fd1655();
        if (m105685x55fd1655 == null) {
            return null;
        }
        int[] iArr = new int[m105685x55fd1655.size()];
        for (int i17 = 0; i17 < m105685x55fd1655.size(); i17++) {
            iArr[i17] = m105685x55fd1655.get(i17).intValue();
        }
        return iArr;
    }

    /* renamed from: isHardwareEarMonitorSupported */
    public boolean m105710x8524f558() {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412 c26795x66465412 = this.f57331x91b52cc5;
        if (c26795x66465412 == null) {
            return false;
        }
        return c26795x66465412.m105687x4f462ba2(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412.FeatureType.HWAUDIO_FEATURE_KARAOKE);
    }

    /* renamed from: isKaraokeServiceSupport */
    public boolean m105711xf41b0f54() {
        return this.f57331x91b52cc5.m105687x4f462ba2(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412.FeatureType.HWAUDIO_FEATURE_KARAOKE);
    }

    @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26801xf73addce
    /* renamed from: onResult */
    public void mo105712x57429edc(int i17) {
        synchronized (this.f57333x6243b38) {
            m105703x87f1e1c(this.f57334x211c7978, i17);
        }
    }

    /* renamed from: setAudioParams */
    public boolean m105713x846e833a(java.lang.String str) {
        try {
            this.f57329x6ad04804.setParameters(str);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    /* renamed from: setReverberation */
    public int m105714x3a0fb14(int i17) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140 c26794xe6f50140 = this.f57332xf781fab7;
        if (c26794xe6f50140 == null) {
            return 1806;
        }
        return c26794xe6f50140.m105664xd03fe567(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140.ParameName.CMD_SET_AUDIO_EFFECT_MODE_BASE, i17);
    }
}
