package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.CronetEngineBuilderImpl */
/* loaded from: classes16.dex */
public abstract class AbstractC29599x8a199e5c extends org.p3343x72743996.net.AbstractC29520xf01d5733 {

    /* renamed from: INVALID_PKP_HOST_NAME */
    private static final java.util.regex.Pattern f74519x959ea450 = java.util.regex.Pattern.compile("^[0-9\\.]*$");

    /* renamed from: INVALID_THREAD_PRIORITY */
    private static final int f74520x8a2c89d1 = 20;

    /* renamed from: mApplicationContext */
    private final android.content.Context f74521x5a59898c;

    /* renamed from: mBrotiEnabled */
    private boolean f74522x90ebe4da;

    /* renamed from: mDisableCache */
    private boolean f74523x5b3e4687;

    /* renamed from: mExperimentalOptions */
    private java.lang.String f74524x7fd97ae9;

    /* renamed from: mHttp2Enabled */
    private boolean f74525xbdc0044;

    /* renamed from: mHttpCacheMaxSize */
    private long f74526xe65114d8;

    /* renamed from: mHttpCacheMode */
    private org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c.HttpCacheMode f74527x6afa0530;

    /* renamed from: mMockCertVerifier */
    protected long f74528x77490251;

    /* renamed from: mNetworkQualityEstimatorEnabled */
    private boolean f74529x7345d27f;

    /* renamed from: mPublicKeyPinningBypassForLocalTrustAnchorsEnabled */
    private boolean f74531xc624d191;

    /* renamed from: mQuicEnabled */
    private boolean f74532x7feb076;

    /* renamed from: mStoragePath */
    private java.lang.String f74534x8ab77693;

    /* renamed from: mUserAgent */
    private java.lang.String f74536x8d47580d;

    /* renamed from: mQuicHints */
    private final java.util.List<org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c.QuicHint> f74533xc65be141 = new java.util.LinkedList();

    /* renamed from: mPkps */
    private final java.util.List<org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c.Pkp> f74530x625ff4b = new java.util.LinkedList();

    /* renamed from: mThreadPriority */
    private int f74535xa8b54b9b = 20;

    /* renamed from: org.chromium.net.impl.CronetEngineBuilderImpl$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$org$chromium$net$impl$CronetEngineBuilderImpl$HttpCacheMode */
        static final /* synthetic */ int[] f74537xd05c8646;

        static {
            int[] iArr = new int[org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c.HttpCacheMode.m154069xcee59d22().length];
            f74537xd05c8646 = iArr;
            try {
                iArr[org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c.HttpCacheMode.DISABLED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f74537xd05c8646[org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c.HttpCacheMode.DISK_NO_HTTP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f74537xd05c8646[org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c.HttpCacheMode.DISK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f74537xd05c8646[org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c.HttpCacheMode.MEMORY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: org.chromium.net.impl.CronetEngineBuilderImpl$HttpCacheMode */
    /* loaded from: classes16.dex */
    public enum HttpCacheMode {
        DISABLED(0, false),
        DISK(1, true),
        DISK_NO_HTTP(1, false),
        MEMORY(2, true);


        /* renamed from: mContentCacheEnabled */
        private final boolean f74543x438c06cb;

        /* renamed from: mType */
        private final int f74544x6280547;

        HttpCacheMode(int i17, boolean z17) {
            this.f74543x438c06cb = z17;
            this.f74544x6280547 = i17;
        }

        /* renamed from: fromPublicBuilderCacheMode */
        public static org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c.HttpCacheMode m154067xddd7a7bd(int i17) {
            if (i17 == 0) {
                return DISABLED;
            }
            if (i17 == 1) {
                return MEMORY;
            }
            if (i17 == 2) {
                return DISK_NO_HTTP;
            }
            if (i17 == 3) {
                return DISK;
            }
            throw new java.lang.IllegalArgumentException("Unknown public builder cache mode");
        }

        /* renamed from: getType */
        public int m154070xfb85f7b0() {
            return this.f74544x6280547;
        }

        /* renamed from: isContentCacheEnabled */
        public boolean m154071xdc13beee() {
            return this.f74543x438c06cb;
        }

        /* renamed from: toPublicBuilderCacheMode */
        public int m154072xc4293bce() {
            int i17 = org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c.AnonymousClass1.f74537xd05c8646[ordinal()];
            if (i17 == 1) {
                return 0;
            }
            int i18 = 2;
            if (i17 != 2) {
                i18 = 3;
                if (i17 != 3) {
                    if (i17 == 4) {
                        return 1;
                    }
                    throw new java.lang.IllegalArgumentException("Unknown internal builder cache mode");
                }
            }
            return i18;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: org.chromium.net.impl.CronetEngineBuilderImpl$HttpCacheSetting */
    /* loaded from: classes6.dex */
    public @interface HttpCacheSetting {
    }

    /* renamed from: org.chromium.net.impl.CronetEngineBuilderImpl$Pkp */
    /* loaded from: classes16.dex */
    public static class Pkp {

        /* renamed from: mExpirationDate */
        final java.util.Date f74545xded5c8ca;

        /* renamed from: mHashes */
        final byte[][] f74546x670e909;

        /* renamed from: mHost */
        final java.lang.String f74547x6226bb5;

        /* renamed from: mIncludeSubdomains */
        final boolean f74548x92f783ca;

        public Pkp(java.lang.String str, byte[][] bArr, boolean z17, java.util.Date date) {
            this.f74547x6226bb5 = str;
            this.f74546x670e909 = bArr;
            this.f74548x92f783ca = z17;
            this.f74545xded5c8ca = date;
        }
    }

    /* renamed from: org.chromium.net.impl.CronetEngineBuilderImpl$QuicHint */
    /* loaded from: classes16.dex */
    public static class QuicHint {

        /* renamed from: mAlternatePort */
        final int f74549x525e88ae;

        /* renamed from: mHost */
        final java.lang.String f74550x6226bb5;

        /* renamed from: mPort */
        final int f74551x6260e8e;

        public QuicHint(java.lang.String str, int i17, int i18) {
            this.f74550x6226bb5 = str;
            this.f74551x6260e8e = i17;
            this.f74549x525e88ae = i18;
        }
    }

    public AbstractC29599x8a199e5c(android.content.Context context) {
        this.f74521x5a59898c = context.getApplicationContext();
        mo153252x70d74261(true);
        mo153248xa991ece7(true);
        mo153247x7e503dd5(false);
        mo153249x84904997(0, 0L);
        mo153250xedb7408c(false);
        mo153251xa4501926(true);
    }

    /* renamed from: validateHostNameForPinningAndConvert */
    private static java.lang.String m154043x879863e5(java.lang.String str) {
        if (f74519x959ea450.matcher(str).matches()) {
            throw new java.lang.IllegalArgumentException("Hostname " + str + " is illegal. A hostname should not consist of digits and/or dots only.");
        }
        if (str.length() > 255) {
            throw new java.lang.IllegalArgumentException("Hostname " + str + " is too long. The name of the host does not comply with RFC 1122 and RFC 1123.");
        }
        try {
            return java.net.IDN.toASCII(str, 2);
        } catch (java.lang.IllegalArgumentException unused) {
            throw new java.lang.IllegalArgumentException("Hostname " + str + " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123.");
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: addPublicKeyPins */
    public /* bridge */ /* synthetic */ org.p3343x72743996.net.AbstractC29520xf01d5733 mo153244x1709deb3(java.lang.String str, java.util.Set set, boolean z17, java.util.Date date) {
        return mo153244x1709deb3(str, (java.util.Set<byte[]>) set, z17, date);
    }

    /* renamed from: brotliEnabled */
    public boolean m154044x2737446f() {
        return this.f74522x90ebe4da;
    }

    /* renamed from: cacheDisabled */
    public boolean m154045x8c42ac1e() {
        return !this.f74527x6afa0530.m154071xdc13beee();
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: enableSdch */
    public org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c mo153253x70d7ea99(boolean z17) {
        return this;
    }

    /* renamed from: experimentalOptions */
    public java.lang.String m154046x953d6c96() {
        return this.f74524x7fd97ae9;
    }

    /* renamed from: getContext */
    public android.content.Context m154047x76847179() {
        return this.f74521x5a59898c;
    }

    /* renamed from: getDefaultQuicUserAgentId */
    public java.lang.String m154048xc345c20c() {
        return this.f74532x7feb076 ? org.p3343x72743996.net.p3358x316220.C29633x8a022dda.m154268xcf5598ab(this.f74521x5a59898c) : "";
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: getDefaultUserAgent */
    public java.lang.String mo153254x265d382f() {
        return org.p3343x72743996.net.p3358x316220.C29633x8a022dda.m154267x3017aa(this.f74521x5a59898c);
    }

    /* renamed from: getUserAgent */
    public java.lang.String m154049x11fd7f44() {
        return this.f74536x8d47580d;
    }

    /* renamed from: http2Enabled */
    public boolean m154050x7446e737() {
        return this.f74525xbdc0044;
    }

    /* renamed from: httpCacheMaxSize */
    public long m154051xc0394a4b() {
        return this.f74526xe65114d8;
    }

    /* renamed from: httpCacheMode */
    public int m154052xfebfc9d() {
        return this.f74527x6afa0530.m154070xfb85f7b0();
    }

    /* renamed from: libraryLoader */
    public org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.LibraryLoader mo154053x886488ae() {
        return null;
    }

    /* renamed from: mockCertVerifier */
    public long m154054x513137c4() {
        return this.f74528x77490251;
    }

    /* renamed from: networkQualityEstimatorEnabled */
    public boolean m154055xa1be02b2() {
        return this.f74529x7345d27f;
    }

    /* renamed from: publicBuilderHttpCacheMode */
    public int m154056xcd9f48cb() {
        return this.f74527x6afa0530.m154072xc4293bce();
    }

    /* renamed from: publicKeyPinningBypassForLocalTrustAnchorsEnabled */
    public boolean m154057xd21c567e() {
        return this.f74531xc624d191;
    }

    /* renamed from: publicKeyPins */
    public java.util.List<org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c.Pkp> m154058x1acd59d4() {
        return this.f74530x625ff4b;
    }

    /* renamed from: quicEnabled */
    public boolean m154059x5df19f23() {
        return this.f74532x7feb076;
    }

    /* renamed from: quicHints */
    public java.util.List<org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c.QuicHint> m154060x4ba4972e() {
        return this.f74533xc65be141;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: setLibraryLoader */
    public org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c mo153260xd89aab6c(org.p3343x72743996.net.AbstractC29500x62bc147f.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    /* renamed from: setMockCertVerifierForTesting */
    public org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c m154061x1ed4e9ed(long j17) {
        this.f74528x77490251 = j17;
        return this;
    }

    /* renamed from: storagePath */
    public java.lang.String m154062xe0aa6540() {
        return this.f74534x8ab77693;
    }

    /* renamed from: threadPriority */
    public int m154063xa20241ce(int i17) {
        int i18 = this.f74535xa8b54b9b;
        return i18 == 20 ? i17 : i18;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: addPublicKeyPins */
    public org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c mo153244x1709deb3(java.lang.String str, java.util.Set<byte[]> set, boolean z17, java.util.Date date) {
        if (str == null) {
            throw new java.lang.NullPointerException("The hostname cannot be null");
        }
        if (set == null) {
            throw new java.lang.NullPointerException("The set of SHA256 pins cannot be null");
        }
        if (date != null) {
            java.lang.String m154043x879863e5 = m154043x879863e5(str);
            java.util.HashMap hashMap = new java.util.HashMap();
            for (byte[] bArr : set) {
                if (bArr != null && bArr.length == 32) {
                    hashMap.put(android.util.Base64.encodeToString(bArr, 0), bArr);
                } else {
                    throw new java.lang.IllegalArgumentException("Public key pin is invalid");
                }
            }
            this.f74530x625ff4b.add(new org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c.Pkp(m154043x879863e5, (byte[][]) hashMap.values().toArray(new byte[hashMap.size()]), z17, date));
            return this;
        }
        throw new java.lang.NullPointerException("The pin expiration date cannot be null");
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: addQuicHint */
    public org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c mo153245x864dd1a6(java.lang.String str, int i17, int i18) {
        if (!str.contains("/")) {
            this.f74533xc65be141.add(new org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c.QuicHint(str, i17, i18));
            return this;
        }
        throw new java.lang.IllegalArgumentException("Illegal QUIC Hint Host: ".concat(str));
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: enableBrotli */
    public org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c mo153247x7e503dd5(boolean z17) {
        this.f74522x90ebe4da = z17;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: enableHttp2 */
    public org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c mo153248xa991ece7(boolean z17) {
        this.f74525xbdc0044 = z17;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: enableHttpCache */
    public org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c mo153249x84904997(int i17, long j17) {
        org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c.HttpCacheMode m154067xddd7a7bd = org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c.HttpCacheMode.m154067xddd7a7bd(i17);
        if (m154067xddd7a7bd.m154070xfb85f7b0() == 1 && m154062xe0aa6540() == null) {
            throw new java.lang.IllegalArgumentException("Storage path must be set");
        }
        this.f74527x6afa0530 = m154067xddd7a7bd;
        this.f74526xe65114d8 = j17;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: enableNetworkQualityEstimator */
    public org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c mo153250xedb7408c(boolean z17) {
        this.f74529x7345d27f = z17;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: enablePublicKeyPinningBypassForLocalTrustAnchors */
    public org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c mo153251xa4501926(boolean z17) {
        this.f74531xc624d191 = z17;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: enableQuic */
    public org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c mo153252x70d74261(boolean z17) {
        this.f74532x7feb076 = z17;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: setExperimentalOptions */
    public org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c mo153259x3bb208d4(java.lang.String str) {
        this.f74524x7fd97ae9 = str;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: setStoragePath */
    public org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c mo153262x50e61f7e(java.lang.String str) {
        if (new java.io.File(str).isDirectory()) {
            this.f74534x8ab77693 = str;
            return this;
        }
        throw new java.lang.IllegalArgumentException("Storage path must be set to existing directory");
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: setThreadPriority */
    public org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c mo153263x589076d0(int i17) {
        if (i17 <= 19 && i17 >= -20) {
            this.f74535xa8b54b9b = i17;
            return this;
        }
        throw new java.lang.IllegalArgumentException("Thread priority invalid");
    }

    @Override // org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: setUserAgent */
    public org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c mo153264x6e513fb8(java.lang.String str) {
        this.f74536x8d47580d = str;
        return this;
    }
}
