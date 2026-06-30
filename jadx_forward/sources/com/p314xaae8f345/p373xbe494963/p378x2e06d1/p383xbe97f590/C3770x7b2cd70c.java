package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p383xbe97f590;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.base.logger.OnlineLoggerAndroid */
/* loaded from: classes16.dex */
public class C3770x7b2cd70c {

    /* renamed from: INVALID_INSTANCE */
    private static final int f14680x19d0d9fd = -1;

    /* renamed from: mNativeOnlineLoggerAndroid */
    private long f14681x4b18da8;

    /* renamed from: com.tencent.liteav.base.logger.OnlineLoggerAndroid$a */
    /* loaded from: classes6.dex */
    public enum a {
        kTRTC(0),
        kLive(1),
        kVod(2);


        /* renamed from: value */
        int f14682x6ac9171;

        a(int i17) {
            this.f14682x6ac9171 = i17;
        }
    }

    /* renamed from: com.tencent.liteav.base.logger.OnlineLoggerAndroid$b */
    /* loaded from: classes6.dex */
    public enum b {
        kApi(1),
        kInfo(2),
        kWarning(3),
        kError(4);


        /* renamed from: level */
        int f14683x6219b84;

        b(int i17) {
            this.f14683x6219b84 = i17;
        }
    }

    public C3770x7b2cd70c(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p383xbe97f590.C3770x7b2cd70c.a aVar, int i17, java.lang.String str, java.lang.String str2) {
        this.f14681x4b18da8 = -1L;
        this.f14681x4b18da8 = m29397x73c02ff3(aVar.f14682x6ac9171, i17, str, str2);
    }

    /* renamed from: nativeCreate */
    private static native long m29397x73c02ff3(int i17, int i18, java.lang.String str, java.lang.String str2);

    /* renamed from: nativeDestroy */
    private static native void m29398x23caefe3(long j17);

    /* renamed from: nativeLog */
    private static native void m29399xc3e74fad(long j17, int i17, java.lang.String str);

    /* renamed from: destroy */
    public synchronized void m29400x5cd39ffa() {
        long j17 = this.f14681x4b18da8;
        if (j17 == -1) {
            return;
        }
        m29398x23caefe3(j17);
        this.f14681x4b18da8 = -1L;
    }

    /* renamed from: finalize */
    public void m29401xd764dc1e() {
        super.finalize();
        m29400x5cd39ffa();
    }

    public synchronized void log(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p383xbe97f590.C3770x7b2cd70c.b bVar, java.lang.String str) {
        long j17 = this.f14681x4b18da8;
        if (j17 == -1) {
            return;
        }
        m29399xc3e74fad(j17, bVar.f14683x6219b84, str);
    }
}
