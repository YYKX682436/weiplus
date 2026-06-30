package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3115x373cac;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::extensions")
/* renamed from: com.tencent.trtc.hardwareearmonitor.vivo.HardwareEarMonitorVivo */
/* loaded from: classes15.dex */
public class C26820x5dfd6818 {

    /* renamed from: mAudioManager */
    private android.media.AudioManager f57508x6ad04804 = (android.media.AudioManager) com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035().getSystemService("audio");

    /* renamed from: mNativeHardwareEarMonitorHandle */
    private long f57509x211c7978;

    public C26820x5dfd6818(long j17) {
        this.f57509x211c7978 = j17;
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3115x373cac.C26820x5dfd6818 m105894xaf65a0fc(long j17) {
        return new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3115x373cac.C26820x5dfd6818(j17);
    }

    /* renamed from: getParameters */
    public java.lang.String m105895x99879e0(java.lang.String str) {
        try {
            return this.f57508x6ad04804.getParameters(str);
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    /* renamed from: setAudioParams */
    public boolean m105896x846e833a(java.lang.String str) {
        try {
            this.f57508x6ad04804.setParameters(str);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
