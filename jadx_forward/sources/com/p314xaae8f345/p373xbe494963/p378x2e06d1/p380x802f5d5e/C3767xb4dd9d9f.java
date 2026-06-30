package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p380x802f5d5e;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.base.datareport.Event4XReporter */
/* loaded from: classes7.dex */
public class C3767xb4dd9d9f {

    /* renamed from: INVALID_INSTANCE */
    private static final int f14648x19d0d9fd = 0;

    /* renamed from: REPORT_EVENT */
    public static final int f14649xf8596faf = 1;

    /* renamed from: REPORT_STATUS */
    public static final int f14650x2a9a755d = 2;
    private static final java.lang.String TAG = "Event4XReporter";

    /* renamed from: mNativeEvent4XReporterAndroid */
    private long f14651x80c1e3b4;

    public C3767xb4dd9d9f(int i17, int i18, java.lang.String str, boolean z17, int i19) {
        this.f14651x80c1e3b4 = 0L;
        this.f14651x80c1e3b4 = m29318x73c02ff3(i17, i18, str, z17, i19);
    }

    /* renamed from: nativeCreate */
    private static native long m29318x73c02ff3(int i17, int i18, java.lang.String str, boolean z17, int i19);

    /* renamed from: nativeDestroy */
    private static native void m29319x23caefe3(long j17);

    /* renamed from: nativeGetColdDownTime */
    private static native int m29320x2cf1a2f2(long j17);

    /* renamed from: nativeSendReport */
    private static native void m29321x5b8653(long j17);

    /* renamed from: nativeSetCommonIntValue */
    private static native void m29322xc1ec8f78(long j17, java.lang.String str, long j18);

    /* renamed from: nativeSetCommonStringValue */
    private static native void m29323xe514776a(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: nativeSetEventIntValue */
    private static native void m29324x1f3dec71(long j17, java.lang.String str, long j18);

    /* renamed from: nativeSetEventStringValue */
    private static native void m29325x6466cbd1(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: destroy */
    public synchronized void m29326x5cd39ffa() {
        long j17 = this.f14651x80c1e3b4;
        if (j17 == 0) {
            return;
        }
        m29319x23caefe3(j17);
        this.f14651x80c1e3b4 = 0L;
    }

    /* renamed from: finalize */
    public void m29327xd764dc1e() {
        super.finalize();
        m29326x5cd39ffa();
    }

    /* renamed from: getColdDownTime */
    public int m29328x3c704c09() {
        long j17 = this.f14651x80c1e3b4;
        if (j17 == 0) {
            return 10000;
        }
        return m29320x2cf1a2f2(j17);
    }

    /* renamed from: reportDau */
    public synchronized void m29329xeaf039c4(int i17, int i18, java.lang.String str) {
        long j17 = this.f14651x80c1e3b4;
        if (j17 == 0) {
            return;
        }
        m29325x6466cbd1(j17, "event_id", java.lang.String.valueOf(i17));
        m29325x6466cbd1(this.f14651x80c1e3b4, "err_code", java.lang.String.valueOf(i18));
        m29325x6466cbd1(this.f14651x80c1e3b4, "err_info", str);
        m29321x5b8653(this.f14651x80c1e3b4);
    }

    /* renamed from: sendReport */
    public synchronized void m29330x1a5f4adc() {
        long j17 = this.f14651x80c1e3b4;
        if (j17 == 0) {
            return;
        }
        m29321x5b8653(j17);
    }

    /* renamed from: setCommonIntValue */
    public synchronized void m29331xec654ecf(java.lang.String str, long j17) {
        long j18 = this.f14651x80c1e3b4;
        if (j18 != 0 && str != null) {
            m29322xc1ec8f78(j18, str, j17);
        }
    }

    /* renamed from: setCommonStringValue */
    public synchronized void m29332x5e96e4b3(java.lang.String str, java.lang.String str2) {
        long j17 = this.f14651x80c1e3b4;
        if (j17 != 0 && str != null && str2 != null) {
            m29323xe514776a(j17, str, str2);
        }
    }

    /* renamed from: setEventIntValue */
    public synchronized void m29333xff94663a(java.lang.String str, long j17) {
        long j18 = this.f14651x80c1e3b4;
        if (j18 != 0 && str != null) {
            m29324x1f3dec71(j18, str, j17);
        }
    }

    /* renamed from: setEventStringValue */
    public synchronized void m29334xd3ad1168(java.lang.String str, java.lang.String str2) {
        long j17 = this.f14651x80c1e3b4;
        if (j17 != 0 && str != null && str2 != null) {
            m29325x6466cbd1(j17, str, str2);
        }
    }
}
