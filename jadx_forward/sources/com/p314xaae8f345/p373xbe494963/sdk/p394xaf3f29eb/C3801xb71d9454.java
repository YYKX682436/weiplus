package com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::license")
/* renamed from: com.tencent.liteav.sdk.common.LicenseChecker */
/* loaded from: classes16.dex */
public class C3801xb71d9454 {

    /* renamed from: mLicenceCheckListener */
    private com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.b f14843x2c4dfb18;

    /* renamed from: com.tencent.liteav.sdk.common.LicenseChecker$a */
    /* loaded from: classes5.dex */
    public enum a {
        PUSHER(1),
        UGC_SIMPLE(2),
        UGC_STANDARD(4),
        PITU_SIMPLE(8),
        PITU(16),
        PLAYER_STANDARD(32),
        PLAYER_MONET(64),
        PLAYER_PREMIUM(128),
        PLAYER_ENTERPRISE(256),
        PLAYER_PROJECTION(512);


        /* renamed from: value */
        int f14844x6ac9171;

        a(int i17) {
            this.f14844x6ac9171 = i17;
        }
    }

    /* renamed from: com.tencent.liteav.sdk.common.LicenseChecker$b */
    /* loaded from: classes16.dex */
    public interface b {
        void a(int i17, java.lang.String str);
    }

    /* renamed from: com.tencent.liteav.sdk.common.LicenseChecker$c */
    /* loaded from: classes5.dex */
    public enum c {
        LIVE,
        UGC
    }

    /* renamed from: com.tencent.liteav.sdk.common.LicenseChecker$d */
    /* loaded from: classes16.dex */
    public enum d {
        OK(0),
        ERROR_JSON_FORMAT(-1),
        ERROR_SIGNATURE(-2),
        ERROR_DECODE(-3),
        ERROR_PACKAGE(-4),
        ERROR_FEATURE(-5),
        ERROR_INNER_NOT_EXIST(-6),
        ERROR_LOCAL_NOT_EXIST(-7),
        ERROR_CONTENT_EMPTY(-8),
        ERROR_WRITE_LICENSE(-9),
        ERROR_WRITE_PITU_LICENSE(-10),
        ERROR_EXPIRED(-11),
        ERROR_DOWNLOAD(-12),
        ERROR_NO_AUTHORIZATION(-13),
        ERROR_UNKNOWN(-14);


        /* renamed from: value */
        int f14845x6ac9171;

        d(int i17) {
            this.f14845x6ac9171 = i17;
        }
    }

    /* renamed from: com.tencent.liteav.sdk.common.LicenseChecker$e */
    /* loaded from: classes16.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454 f128057a = new com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454();
    }

    static {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.q.a();
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454 m30184x9cf0d20b() {
        return com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.e.f128057a;
    }

    /* renamed from: nativeGetAppId */
    private static native java.lang.String m30185x8c1bd29d();

    /* renamed from: nativeGetKey */
    private static native java.lang.String m30186x79e2de20(int i17);

    /* renamed from: nativeGetLicense */
    private static native java.lang.String m30187x2db9fb82(int i17);

    /* renamed from: nativeSetClient */
    private static native void m30188xedc24476(com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454 c3801xb71d9454);

    /* renamed from: nativeSetLicense */
    private static native boolean m30189xa12b48f6(int i17, java.lang.String str, java.lang.String str2);

    /* renamed from: nativeValid */
    private static native int m30190x67d8c625(int i17);

    /* renamed from: OnResult */
    public void m30191x5b1d02fc(int i17, java.lang.String str) {
        com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.b bVar = this.f14843x2c4dfb18;
        if (bVar != null) {
            bVar.a(i17, str);
        }
    }

    /* renamed from: getAppId */
    public java.lang.String m30192x74292566() {
        return m30185x8c1bd29d();
    }

    /* renamed from: getKey */
    public java.lang.String m30193xb5884f29(com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.c cVar) {
        return m30186x79e2de20(cVar.ordinal());
    }

    /* renamed from: getLicense */
    public java.lang.String m30194x47bdc00b(com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.c cVar) {
        return m30187x2db9fb82(cVar.ordinal());
    }

    /* renamed from: setLicense */
    public boolean m30195xbb2f0d7f(com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.c cVar, java.lang.String str, java.lang.String str2) {
        return m30189xa12b48f6(cVar.ordinal(), str, str2);
    }

    /* renamed from: setListener */
    public void m30196xc6cf6336(com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.b bVar) {
        this.f14843x2c4dfb18 = bVar;
        if (bVar != null) {
            m30188xedc24476(this);
        }
    }

    /* renamed from: valid */
    public com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.d m30197x6ac8ffc(com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.a aVar) {
        int m30190x67d8c625 = m30190x67d8c625(aVar.f14844x6ac9171);
        for (com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.d dVar : com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.d.m30206xcee59d22()) {
            if (dVar.f14845x6ac9171 == m30190x67d8c625) {
                return dVar;
            }
        }
        return com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb.C3801xb71d9454.d.ERROR_UNKNOWN;
    }
}
