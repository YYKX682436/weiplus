package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::extensions")
/* renamed from: com.tencent.trtc.hardwareearmonitor.honor.HardwareEarMonitorHonor */
/* loaded from: classes16.dex */
public class C26802x60ecee7e implements com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26816x4a2b96a5 {

    /* renamed from: mHnAudioClient */
    private com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97 f57347xf0a226ee;

    /* renamed from: mHnEarReturnClient */
    private com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7 f57348x7171c8be;

    /* renamed from: mNativeHardwareEarMonitorHandle */
    private long f57350x211c7978;

    /* renamed from: mLock */
    private java.lang.Object f57349x6243b38 = new java.lang.Object();

    /* renamed from: mAudioManager */
    private android.media.AudioManager f57345x6ad04804 = (android.media.AudioManager) com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035().getSystemService("audio");

    /* renamed from: mContext */
    private android.content.Context f57346xd6cfe882 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();

    public C26802x60ecee7e(long j17) {
        this.f57350x211c7978 = j17;
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97 c26804xae65fc97 = new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97(this.f57346xd6cfe882, this);
        this.f57347xf0a226ee = c26804xae65fc97;
        c26804xae65fc97.m105789x33ebcb90();
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26802x60ecee7e m105725xaf65a0fc(long j17) {
        return new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26802x60ecee7e(j17);
    }

    /* renamed from: isAudioKitSupport */
    public static boolean m105726xbfc3d205() {
        return com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.m105783xe8ec086e(com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035());
    }

    /* renamed from: nativeHandleResult */
    private static native void m105727x87f1e1c(long j17, int i17);

    /* renamed from: createKaraokeService */
    public void m105728xe32a44d() {
        this.f57348x7171c8be = (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7) this.f57347xf0a226ee.m105786xfc2aea19(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.ServiceType.HNAUDIO_SERVICE_EARRETURN);
    }

    /* renamed from: destroy */
    public void m105729x5cd39ffa() {
        synchronized (this.f57349x6243b38) {
            this.f57350x211c7978 = 0L;
        }
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97 c26804xae65fc97 = this.f57347xf0a226ee;
        if (c26804xae65fc97 != null) {
            c26804xae65fc97.m105787x5cd39ffa();
            this.f57347xf0a226ee = null;
        }
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7 c26808x5890a1e7 = this.f57348x7171c8be;
        if (c26808x5890a1e7 != null) {
            c26808x5890a1e7.mo105752x5cd39ffa();
            this.f57348x7171c8be = null;
        }
    }

    /* renamed from: enableKaraoke */
    public int m105730xaeedee1(boolean z17) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7 c26808x5890a1e7 = this.f57348x7171c8be;
        if (c26808x5890a1e7 == null) {
            return 1806;
        }
        return c26808x5890a1e7.m105824x76f6d5e3(z17);
    }

    /* renamed from: getKaraokeSupportedServices */
    public int[] m105731x93067b1e() {
        java.util.List<java.lang.Integer> m105788xb9854276 = this.f57347xf0a226ee.m105788xb9854276();
        if (m105788xb9854276 == null) {
            return null;
        }
        int[] iArr = new int[m105788xb9854276.size()];
        for (int i17 = 0; i17 < m105788xb9854276.size(); i17++) {
            iArr[i17] = m105788xb9854276.get(i17).intValue();
        }
        return iArr;
    }

    /* renamed from: isHardwareEarMonitorSupported */
    public boolean m105732x8524f558() {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7 c26808x5890a1e7 = this.f57348x7171c8be;
        if (c26808x5890a1e7 == null) {
            return false;
        }
        return c26808x5890a1e7.mo105757x8ab4a6c3();
    }

    /* renamed from: isKaraokeServiceSupport */
    public boolean m105733xf41b0f54() {
        return this.f57347xf0a226ee.m105790x8ab4a6c3(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.ServiceType.HNAUDIO_SERVICE_EARRETURN);
    }

    @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26816x4a2b96a5
    /* renamed from: onResult */
    public void mo105734x57429edc(int i17) {
        synchronized (this.f57349x6243b38) {
            m105727x87f1e1c(this.f57350x211c7978, i17);
        }
    }

    /* renamed from: setAudioParams */
    public boolean m105735x846e833a(java.lang.String str) {
        try {
            this.f57345x6ad04804.setParameters(str);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    /* renamed from: setEqualizer */
    public int m105736x8e087090(int i17) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7 c26808x5890a1e7 = this.f57348x7171c8be;
        if (c26808x5890a1e7 == null) {
            return 1806;
        }
        return c26808x5890a1e7.m105826xd03fe567(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.ParameName.CMD_SET_VOCAL_EQUALIZER_MODE, i17);
    }

    /* renamed from: setReverberation */
    public int m105737x3a0fb14(int i17) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7 c26808x5890a1e7 = this.f57348x7171c8be;
        if (c26808x5890a1e7 == null) {
            return 1806;
        }
        return c26808x5890a1e7.m105826xd03fe567(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.ParameName.CMD_SET_AUDIO_EFFECT_MODE_BASE, i17);
    }

    /* renamed from: setVolume */
    public int m105738x27f73e1c(int i17) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7 c26808x5890a1e7 = this.f57348x7171c8be;
        if (c26808x5890a1e7 == null) {
            return 1806;
        }
        return c26808x5890a1e7.m105826xd03fe567(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.ParameName.CMD_SET_VOCAL_VOLUME_BASE, i17);
    }
}
