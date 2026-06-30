package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3113xb14c9900;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::extensions")
/* renamed from: com.tencent.trtc.hardwareearmonitor.oneplus.HardwareEarMonitorOnePlus */
/* loaded from: classes15.dex */
public class C26818x49751a34 {

    /* renamed from: mAudioManager */
    private android.media.AudioManager f57502x6ad04804 = (android.media.AudioManager) com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035().getSystemService("audio");

    /* renamed from: mContext */
    private android.content.Context f57503xd6cfe882 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();

    /* renamed from: mNativeHardwareEarMonitorHandle */
    private long f57504x211c7978;

    public C26818x49751a34(long j17) {
        this.f57504x211c7978 = j17;
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3113xb14c9900.C26818x49751a34 m105884xaf65a0fc(long j17) {
        return new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3113xb14c9900.C26818x49751a34(j17);
    }

    /* renamed from: getParameters */
    public java.lang.String m105885x99879e0(java.lang.String str) {
        try {
            return this.f57502x6ad04804.getParameters(str);
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    /* renamed from: getUidFromPackage */
    public int m105886x34fe7fc2() {
        try {
            return this.f57503xd6cfe882.getPackageManager().getPackageUid(this.f57503xd6cfe882.getPackageName(), 0);
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    /* renamed from: setAudioParams */
    public boolean m105887x846e833a(java.lang.String str) {
        try {
            this.f57502x6ad04804.setParameters(str);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    /* renamed from: systemFeatureSupported */
    public boolean m105888xfa49e6a7(java.lang.String str) {
        try {
            return this.f57503xd6cfe882.getPackageManager().hasSystemFeature(str);
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
