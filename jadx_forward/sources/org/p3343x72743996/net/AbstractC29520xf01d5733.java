package org.p3343x72743996.net;

/* renamed from: org.chromium.net.ICronetEngineBuilder */
/* loaded from: classes16.dex */
public abstract class AbstractC29520xf01d5733 {

    /* renamed from: CONNECTION_MIGRATION_OPTIONS */
    public static final int f73871x194c07cc = 1;

    /* renamed from: DNS_OPTIONS */
    public static final int f73872x7a31a948 = 2;

    /* renamed from: QUIC_OPTIONS */
    public static final int f73873xc2e0b57d = 3;

    /* renamed from: addPublicKeyPins */
    public abstract org.p3343x72743996.net.AbstractC29520xf01d5733 mo153244x1709deb3(java.lang.String str, java.util.Set<byte[]> set, boolean z17, java.util.Date date);

    /* renamed from: addQuicHint */
    public abstract org.p3343x72743996.net.AbstractC29520xf01d5733 mo153245x864dd1a6(java.lang.String str, int i17, int i18);

    /* renamed from: build */
    public abstract org.p3343x72743996.net.AbstractC29507xc7c0f987 mo153246x59bc66e();

    /* renamed from: enableBrotli */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153247x7e503dd5(boolean z17) {
        return this;
    }

    /* renamed from: enableHttp2 */
    public abstract org.p3343x72743996.net.AbstractC29520xf01d5733 mo153248xa991ece7(boolean z17);

    /* renamed from: enableHttpCache */
    public abstract org.p3343x72743996.net.AbstractC29520xf01d5733 mo153249x84904997(int i17, long j17);

    /* renamed from: enableNetworkQualityEstimator */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153250xedb7408c(boolean z17) {
        return this;
    }

    /* renamed from: enablePublicKeyPinningBypassForLocalTrustAnchors */
    public abstract org.p3343x72743996.net.AbstractC29520xf01d5733 mo153251xa4501926(boolean z17);

    /* renamed from: enableQuic */
    public abstract org.p3343x72743996.net.AbstractC29520xf01d5733 mo153252x70d74261(boolean z17);

    /* renamed from: enableSdch */
    public abstract org.p3343x72743996.net.AbstractC29520xf01d5733 mo153253x70d7ea99(boolean z17);

    /* renamed from: getDefaultUserAgent */
    public abstract java.lang.String mo153254x265d382f();

    /* renamed from: getSupportedConfigOptions */
    public java.util.Set<java.lang.Integer> mo153256xbc9729e4() {
        return java.util.Collections.emptySet();
    }

    /* renamed from: setConnectionMigrationOptions */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153257xaf3aff0(org.p3343x72743996.net.C29497x80dc8a0e c29497x80dc8a0e) {
        return this;
    }

    /* renamed from: setDnsOptions */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153258x1632f37(org.p3343x72743996.net.C29503x5bd00555 c29503x5bd00555) {
        return this;
    }

    /* renamed from: setExperimentalOptions */
    public abstract org.p3343x72743996.net.AbstractC29520xf01d5733 mo153259x3bb208d4(java.lang.String str);

    /* renamed from: setLibraryLoader */
    public abstract org.p3343x72743996.net.AbstractC29520xf01d5733 mo153260xd89aab6c(org.p3343x72743996.net.AbstractC29500x62bc147f.Builder.LibraryLoader libraryLoader);

    /* renamed from: setQuicOptions */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153261xe3a454be(org.p3343x72743996.net.C29548xd6d24260 c29548xd6d24260) {
        return this;
    }

    /* renamed from: setStoragePath */
    public abstract org.p3343x72743996.net.AbstractC29520xf01d5733 mo153262x50e61f7e(java.lang.String str);

    /* renamed from: setThreadPriority */
    public org.p3343x72743996.net.AbstractC29520xf01d5733 mo153263x589076d0(int i17) {
        return this;
    }

    /* renamed from: setUserAgent */
    public abstract org.p3343x72743996.net.AbstractC29520xf01d5733 mo153264x6e513fb8(java.lang.String str);
}
