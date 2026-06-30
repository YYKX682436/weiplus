package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3114x3427a0;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::extensions")
/* renamed from: com.tencent.trtc.hardwareearmonitor.oppo.HardwareEarMonitorOppo */
/* loaded from: classes15.dex */
public class C26819x5dfa530c {

    /* renamed from: mAudioManager */
    private android.media.AudioManager f57505x6ad04804 = (android.media.AudioManager) com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035().getSystemService("audio");

    /* renamed from: mContext */
    private android.content.Context f57506xd6cfe882 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();

    /* renamed from: mNativeHardwareEarMonitorHandle */
    private long f57507x211c7978;

    public C26819x5dfa530c(long j17) {
        this.f57507x211c7978 = j17;
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3114x3427a0.C26819x5dfa530c m105889xaf65a0fc(long j17) {
        return new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3114x3427a0.C26819x5dfa530c(j17);
    }

    /* renamed from: getParameters */
    public java.lang.String m105890x99879e0(java.lang.String str) {
        try {
            return this.f57505x6ad04804.getParameters(str);
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    /* renamed from: getUidFromPackage */
    public int m105891x34fe7fc2() {
        try {
            return this.f57506xd6cfe882.getPackageManager().getPackageUid(this.f57506xd6cfe882.getPackageName(), 0);
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    /* renamed from: setAudioParams */
    public boolean m105892x846e833a(java.lang.String str) {
        try {
            this.f57505x6ad04804.setParameters(str);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    /* renamed from: systemFeatureSupported */
    public boolean m105893xfa49e6a7(java.lang.String str) {
        try {
            return this.f57506xd6cfe882.getPackageManager().hasSystemFeature(str);
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
