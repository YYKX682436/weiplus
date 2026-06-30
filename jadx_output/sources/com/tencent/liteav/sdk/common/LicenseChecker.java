package com.tencent.liteav.sdk.common;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::license")
/* loaded from: classes16.dex */
public class LicenseChecker {
    private com.tencent.liteav.sdk.common.LicenseChecker.b mLicenceCheckListener;

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

        int value;

        a(int i17) {
            this.value = i17;
        }
    }

    /* loaded from: classes16.dex */
    public interface b {
        void a(int i17, java.lang.String str);
    }

    /* loaded from: classes5.dex */
    public enum c {
        LIVE,
        UGC
    }

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

        int value;

        d(int i17) {
            this.value = i17;
        }
    }

    /* loaded from: classes16.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static com.tencent.liteav.sdk.common.LicenseChecker f46524a = new com.tencent.liteav.sdk.common.LicenseChecker();
    }

    static {
        com.tencent.liteav.base.util.q.a();
    }

    public static com.tencent.liteav.sdk.common.LicenseChecker getInstance() {
        return com.tencent.liteav.sdk.common.LicenseChecker.e.f46524a;
    }

    private static native java.lang.String nativeGetAppId();

    private static native java.lang.String nativeGetKey(int i17);

    private static native java.lang.String nativeGetLicense(int i17);

    private static native void nativeSetClient(com.tencent.liteav.sdk.common.LicenseChecker licenseChecker);

    private static native boolean nativeSetLicense(int i17, java.lang.String str, java.lang.String str2);

    private static native int nativeValid(int i17);

    public void OnResult(int i17, java.lang.String str) {
        com.tencent.liteav.sdk.common.LicenseChecker.b bVar = this.mLicenceCheckListener;
        if (bVar != null) {
            bVar.a(i17, str);
        }
    }

    public java.lang.String getAppId() {
        return nativeGetAppId();
    }

    public java.lang.String getKey(com.tencent.liteav.sdk.common.LicenseChecker.c cVar) {
        return nativeGetKey(cVar.ordinal());
    }

    public java.lang.String getLicense(com.tencent.liteav.sdk.common.LicenseChecker.c cVar) {
        return nativeGetLicense(cVar.ordinal());
    }

    public boolean setLicense(com.tencent.liteav.sdk.common.LicenseChecker.c cVar, java.lang.String str, java.lang.String str2) {
        return nativeSetLicense(cVar.ordinal(), str, str2);
    }

    public void setListener(com.tencent.liteav.sdk.common.LicenseChecker.b bVar) {
        this.mLicenceCheckListener = bVar;
        if (bVar != null) {
            nativeSetClient(this);
        }
    }

    public com.tencent.liteav.sdk.common.LicenseChecker.d valid(com.tencent.liteav.sdk.common.LicenseChecker.a aVar) {
        int nativeValid = nativeValid(aVar.value);
        for (com.tencent.liteav.sdk.common.LicenseChecker.d dVar : com.tencent.liteav.sdk.common.LicenseChecker.d.values()) {
            if (dVar.value == nativeValid) {
                return dVar;
            }
        }
        return com.tencent.liteav.sdk.common.LicenseChecker.d.ERROR_UNKNOWN;
    }
}
