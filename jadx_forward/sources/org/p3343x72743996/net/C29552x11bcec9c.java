package org.p3343x72743996.net;

/* renamed from: org.chromium.net.RequestContextConfigOptions */
/* loaded from: classes16.dex */
public final class C29552x11bcec9c extends com.p176xb6135e39.p283xc50a8b8b.n5 implements org.p3343x72743996.net.InterfaceC29553x272e46fc {

    /* renamed from: BROTLI_ENABLED_FIELD_NUMBER */
    public static final int f74269x96f77259 = 6;

    /* renamed from: BYPASS_PUBLIC_KEY_PINNING_FOR_LOCAL_TRUST_ANCHORS_FIELD_NUMBER */
    public static final int f74270x2d2db835 = 13;

    /* renamed from: DEFAULT_INSTANCE */
    private static final org.p3343x72743996.net.C29552x11bcec9c f74271xb3e828f3;

    /* renamed from: DISABLE_CACHE_FIELD_NUMBER */
    public static final int f74272xb600eee2 = 7;

    /* renamed from: ENABLE_NETWORK_QUALITY_ESTIMATOR_FIELD_NUMBER */
    public static final int f74273x66fde8ba = 12;

    /* renamed from: EXPERIMENTAL_OPTIONS_FIELD_NUMBER */
    public static final int f74274xab6b2566 = 10;

    /* renamed from: HTTP2_ENABLED_FIELD_NUMBER */
    public static final int f74275x65480321 = 5;

    /* renamed from: HTTP_CACHE_MAX_SIZE_FIELD_NUMBER */
    public static final int f74276x67b3033d = 9;

    /* renamed from: HTTP_CACHE_MODE_FIELD_NUMBER */
    public static final int f74277xadc6cd16 = 8;

    /* renamed from: MOCK_CERT_VERIFIER_FIELD_NUMBER */
    public static final int f74278x76ed3111 = 11;

    /* renamed from: NETWORK_THREAD_PRIORITY_FIELD_NUMBER */
    public static final int f74279x7d5ded25 = 14;

    /* renamed from: PARSER */
    private static volatile com.p176xb6135e39.p283xc50a8b8b.e9 f74280x8c3e301f = null;

    /* renamed from: QUIC_DEFAULT_USER_AGENT_ID_FIELD_NUMBER */
    public static final int f74281xec103ea3 = 4;

    /* renamed from: QUIC_ENABLED_FIELD_NUMBER */
    public static final int f74282x371f7e0d = 3;

    /* renamed from: STORAGE_PATH_FIELD_NUMBER */
    public static final int f74283x89480344 = 2;

    /* renamed from: USER_AGENT_FIELD_NUMBER */
    public static final int f74284x6ce8965c = 1;

    /* renamed from: bitField0_ */
    private int f74285x961a12dc;

    /* renamed from: brotliEnabled_ */
    private boolean f74286xbfb149d0;

    /* renamed from: bypassPublicKeyPinningForLocalTrustAnchors_ */
    private boolean f74287xf7c9cb3c;

    /* renamed from: disableCache_ */
    private boolean f74288xb17c8225;

    /* renamed from: enableNetworkQualityEstimator_ */
    private boolean f74289xc930d153;

    /* renamed from: http2Enabled_ */
    private boolean f74291x14960008;

    /* renamed from: httpCacheMaxSize_ */
    private long f74292x46efff74;

    /* renamed from: httpCacheMode_ */
    private int f74293xed939762;

    /* renamed from: mockCertVerifier_ */
    private long f74294xd4f5c11b;

    /* renamed from: networkThreadPriority_ */
    private int f74295x270df443;

    /* renamed from: quicEnabled_ */
    private boolean f74297x6042459c;

    /* renamed from: userAgent_ */
    private java.lang.String f74299x3f71b1a5 = "";

    /* renamed from: storagePath_ */
    private java.lang.String f74298x34a2431f = "";

    /* renamed from: quicDefaultUserAgentId_ */
    private java.lang.String f74296x65e7b80d = "";

    /* renamed from: experimentalOptions_ */
    private java.lang.String f74290x12702689 = "";

    /* renamed from: org.chromium.net.RequestContextConfigOptions$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f74300xa1df5c61;

        static {
            int[] iArr = new int[com.p176xb6135e39.p283xc50a8b8b.l5.m20737xcee59d22().length];
            f74300xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f74300xa1df5c61[4] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f74300xa1df5c61[2] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f74300xa1df5c61[5] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f74300xa1df5c61[6] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f74300xa1df5c61[0] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f74300xa1df5c61[1] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: org.chromium.net.RequestContextConfigOptions$Builder */
    /* loaded from: classes16.dex */
    public static final class Builder extends com.p176xb6135e39.p283xc50a8b8b.h5 implements org.p3343x72743996.net.InterfaceC29553x272e46fc {
        /* renamed from: clearBrotliEnabled */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153594x25e2322() {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153513x25e2322();
            return this;
        }

        /* renamed from: clearBypassPublicKeyPinningForLocalTrustAnchors */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153595xebcc7b0() {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153514xebcc7b0();
            return this;
        }

        /* renamed from: clearDisableCache */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153596x67a22c67() {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153515x67a22c67();
            return this;
        }

        /* renamed from: clearEnableNetworkQualityEstimator */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153597x7228593f() {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153516x7228593f();
            return this;
        }

        /* renamed from: clearExperimentalOptions */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153598xa0413909() {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153517xa0413909();
            return this;
        }

        /* renamed from: clearHttp2Enabled */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153599x183fe624() {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153518x183fe624();
            return this;
        }

        /* renamed from: clearHttpCacheMaxSize */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153600xb08f0ab8() {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153519xb08f0ab8();
            return this;
        }

        /* renamed from: clearHttpCacheMode */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153601xeb12db50() {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153520xeb12db50();
            return this;
        }

        /* renamed from: clearMockCertVerifier */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153602x4186f831() {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153521x4186f831();
            return this;
        }

        /* renamed from: clearNetworkThreadPriority */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153603x18747b4f() {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153522x18747b4f();
            return this;
        }

        /* renamed from: clearQuicDefaultUserAgentId */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153604xda98953f() {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153523xda98953f();
            return this;
        }

        /* renamed from: clearQuicEnabled */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153605xce968e96() {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153524xce968e96();
            return this;
        }

        /* renamed from: clearStoragePath */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153606x514f54b3() {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153525x514f54b3();
            return this;
        }

        /* renamed from: clearUserAgent */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153607xbe803e2d() {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153526xbe803e2d();
            return this;
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: getBrotliEnabled */
        public boolean mo153561xe49700b9() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153561xe49700b9();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: getBypassPublicKeyPinningForLocalTrustAnchors */
        public boolean mo153562x6d864579() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153562x6d864579();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: getDisableCache */
        public boolean mo153563x249bbff0() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153563x249bbff0();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: getEnableNetworkQualityEstimator */
        public boolean mo153564x1d3928d6() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153564x1d3928d6();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: getExperimentalOptions */
        public java.lang.String mo153565xed6d4960() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153565xed6d4960();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: getExperimentalOptionsBytes */
        public com.p176xb6135e39.p283xc50a8b8b.y mo153566xa82462eb() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153566xa82462eb();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: getHttp2Enabled */
        public boolean mo153567xd53979ad() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153567xd53979ad();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: getHttpCacheMaxSize */
        public long mo153568x6811b1c1() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153568x6811b1c1();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: getHttpCacheMode */
        public int mo153569xcd4bb8e7() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153569xcd4bb8e7();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: getMockCertVerifier */
        public long mo153570xf9099f3a() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153570xf9099f3a();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: getNetworkThreadPriority */
        public int mo153571xcaddd1e6() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153571xcaddd1e6();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: getQuicDefaultUserAgentId */
        public java.lang.String mo153572x755a1188() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153572x755a1188();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: getQuicDefaultUserAgentIdBytes */
        public com.p176xb6135e39.p283xc50a8b8b.y mo153573xc13673c3() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153573xc13673c3();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: getQuicEnabled */
        public boolean mo153574x37c7e5ed() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153574x37c7e5ed();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: getStoragePath */
        public java.lang.String mo153575xba80ac0a() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153575xba80ac0a();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: getStoragePathBytes */
        public com.p176xb6135e39.p283xc50a8b8b.y mo153576x6bf61a81() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153576x6bf61a81();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: getUserAgent */
        public java.lang.String mo153577x11fd7f44() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153577x11fd7f44();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: getUserAgentBytes */
        public com.p176xb6135e39.p283xc50a8b8b.y mo153578xd37e3b87() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153578xd37e3b87();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: hasBrotliEnabled */
        public boolean mo153579x7cdd6bf5() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153579x7cdd6bf5();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: hasBypassPublicKeyPinningForLocalTrustAnchors */
        public boolean mo153580x1733f3bd() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153580x1733f3bd();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: hasDisableCache */
        public boolean mo153581x87cfd34() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153581x87cfd34();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: hasEnableNetworkQualityEstimator */
        public boolean mo153582x51199c12() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153582x51199c12();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: hasExperimentalOptions */
        public boolean mo153583x59ed579c() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153583x59ed579c();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: hasHttp2Enabled */
        public boolean mo153584xb91ab6f1() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153584xb91ab6f1();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: hasHttpCacheMaxSize */
        public boolean mo153585xd2caad05() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153585xd2caad05();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: hasHttpCacheMode */
        public boolean mo153586x65922423() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153586x65922423();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: hasMockCertVerifier */
        public boolean mo153587x63c29a7e() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153587x63c29a7e();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: hasNetworkThreadPriority */
        public boolean mo153588x17934122() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153588x17934122();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: hasQuicDefaultUserAgentId */
        public boolean mo153589xbf5289cc() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153589xbf5289cc();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: hasQuicEnabled */
        public boolean mo153590x57e7f029() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153590x57e7f029();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: hasStoragePath */
        public boolean mo153591xdaa0b646() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153591xdaa0b646();
        }

        @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
        /* renamed from: hasUserAgent */
        public boolean mo153592xd1d2e880() {
            return ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).mo153592xd1d2e880();
        }

        /* renamed from: setBrotliEnabled */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153608x776d672d(boolean z17) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153543x776d672d(z17);
            return this;
        }

        /* renamed from: setBypassPublicKeyPinningForLocalTrustAnchors */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153609xad0f6385(boolean z17) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153544xad0f6385(z17);
            return this;
        }

        /* renamed from: setDisableCache */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153610x5ae4bafc(boolean z17) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153545x5ae4bafc(z17);
            return this;
        }

        /* renamed from: setEnableNetworkQualityEstimator */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153611x7f7c274a(boolean z17) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153546x7f7c274a(z17);
            return this;
        }

        /* renamed from: setExperimentalOptions */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153612x3bb208d4(java.lang.String str) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153547x3bb208d4(str);
            return this;
        }

        /* renamed from: setExperimentalOptionsBytes */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153613x57f12bf7(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153548x57f12bf7(yVar);
            return this;
        }

        /* renamed from: setHttp2Enabled */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153614xb8274b9(boolean z17) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153549xb8274b9(z17);
            return this;
        }

        /* renamed from: setHttpCacheMaxSize */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153615xc0e46cd(long j17) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153550xc0e46cd(j17);
            return this;
        }

        /* renamed from: setHttpCacheMode */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153616x60221f5b(int i17) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153551x60221f5b(i17);
            return this;
        }

        /* renamed from: setMockCertVerifier */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153617x9d063446(long j17) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153552x9d063446(j17);
            return this;
        }

        /* renamed from: setNetworkThreadPriority */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153618x9af0845a(int i17) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153553x9af0845a(i17);
            return this;
        }

        /* renamed from: setQuicDefaultUserAgentId */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153619xa79dad94(java.lang.String str) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153554xa79dad94(str);
            return this;
        }

        /* renamed from: setQuicDefaultUserAgentIdBytes */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153620xc94e7f37(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153555xc94e7f37(yVar);
            return this;
        }

        /* renamed from: setQuicEnabled */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153621xce2d5961(boolean z17) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153556xce2d5961(z17);
            return this;
        }

        /* renamed from: setStoragePath */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153622x50e61f7e(java.lang.String str) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153557x50e61f7e(str);
            return this;
        }

        /* renamed from: setStoragePathBytes */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153623xff2af8d(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153558xff2af8d(yVar);
            return this;
        }

        /* renamed from: setUserAgent */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153624x6e513fb8(java.lang.String str) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153559x6e513fb8(str);
            return this;
        }

        /* renamed from: setUserAgentBytes */
        public org.p3343x72743996.net.C29552x11bcec9c.Builder m153625x9b74a393(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
            m20700x8b68b80b();
            ((org.p3343x72743996.net.C29552x11bcec9c) this.f7870x21169495).m153560x9b74a393(yVar);
            return this;
        }

        private Builder() {
            super(org.p3343x72743996.net.C29552x11bcec9c.f74271xb3e828f3);
        }
    }

    static {
        org.p3343x72743996.net.C29552x11bcec9c c29552x11bcec9c = new org.p3343x72743996.net.C29552x11bcec9c();
        f74271xb3e828f3 = c29552x11bcec9c;
        com.p176xb6135e39.p283xc50a8b8b.n5.m20830x48240cd3(org.p3343x72743996.net.C29552x11bcec9c.class, c29552x11bcec9c);
    }

    private C29552x11bcec9c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearBrotliEnabled */
    public void m153513x25e2322() {
        this.f74285x961a12dc &= -33;
        this.f74286xbfb149d0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearBypassPublicKeyPinningForLocalTrustAnchors */
    public void m153514xebcc7b0() {
        this.f74285x961a12dc &= -4097;
        this.f74287xf7c9cb3c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearDisableCache */
    public void m153515x67a22c67() {
        this.f74285x961a12dc &= -65;
        this.f74288xb17c8225 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearEnableNetworkQualityEstimator */
    public void m153516x7228593f() {
        this.f74285x961a12dc &= -2049;
        this.f74289xc930d153 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearExperimentalOptions */
    public void m153517xa0413909() {
        this.f74285x961a12dc &= -513;
        this.f74290x12702689 = m153527x7c90cfc0().mo153565xed6d4960();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearHttp2Enabled */
    public void m153518x183fe624() {
        this.f74285x961a12dc &= -17;
        this.f74291x14960008 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearHttpCacheMaxSize */
    public void m153519xb08f0ab8() {
        this.f74285x961a12dc &= -257;
        this.f74292x46efff74 = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearHttpCacheMode */
    public void m153520xeb12db50() {
        this.f74285x961a12dc &= -129;
        this.f74293xed939762 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearMockCertVerifier */
    public void m153521x4186f831() {
        this.f74285x961a12dc &= -1025;
        this.f74294xd4f5c11b = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearNetworkThreadPriority */
    public void m153522x18747b4f() {
        this.f74285x961a12dc &= -8193;
        this.f74295x270df443 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearQuicDefaultUserAgentId */
    public void m153523xda98953f() {
        this.f74285x961a12dc &= -9;
        this.f74296x65e7b80d = m153527x7c90cfc0().mo153572x755a1188();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearQuicEnabled */
    public void m153524xce968e96() {
        this.f74285x961a12dc &= -5;
        this.f74297x6042459c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearStoragePath */
    public void m153525x514f54b3() {
        this.f74285x961a12dc &= -3;
        this.f74298x34a2431f = m153527x7c90cfc0().mo153575xba80ac0a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearUserAgent */
    public void m153526xbe803e2d() {
        this.f74285x961a12dc &= -2;
        this.f74299x3f71b1a5 = m153527x7c90cfc0().mo153577x11fd7f44();
    }

    /* renamed from: getDefaultInstance */
    public static org.p3343x72743996.net.C29552x11bcec9c m153527x7c90cfc0() {
        return f74271xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static org.p3343x72743996.net.C29552x11bcec9c.Builder m153528x3136c9db() {
        return (org.p3343x72743996.net.C29552x11bcec9c.Builder) f74271xb3e828f3.m20832x93ab12ff();
    }

    /* renamed from: parseDelimitedFrom */
    public static org.p3343x72743996.net.C29552x11bcec9c m153530x4a829d50(java.io.InputStream inputStream) {
        return (org.p3343x72743996.net.C29552x11bcec9c) com.p176xb6135e39.p283xc50a8b8b.n5.m20815x4a829d50(f74271xb3e828f3, inputStream);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.C29552x11bcec9c m153538x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (org.p3343x72743996.net.C29552x11bcec9c) com.p176xb6135e39.p283xc50a8b8b.n5.m20823x92b714fd(f74271xb3e828f3, byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m153542xc4ab3c1f() {
        return f74271xb3e828f3.m20838x7ea0ace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setBrotliEnabled */
    public void m153543x776d672d(boolean z17) {
        this.f74285x961a12dc |= 32;
        this.f74286xbfb149d0 = z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setBypassPublicKeyPinningForLocalTrustAnchors */
    public void m153544xad0f6385(boolean z17) {
        this.f74285x961a12dc |= 4096;
        this.f74287xf7c9cb3c = z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDisableCache */
    public void m153545x5ae4bafc(boolean z17) {
        this.f74285x961a12dc |= 64;
        this.f74288xb17c8225 = z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setEnableNetworkQualityEstimator */
    public void m153546x7f7c274a(boolean z17) {
        this.f74285x961a12dc |= 2048;
        this.f74289xc930d153 = z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setExperimentalOptions */
    public void m153547x3bb208d4(java.lang.String str) {
        str.getClass();
        this.f74285x961a12dc |= 512;
        this.f74290x12702689 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setExperimentalOptionsBytes */
    public void m153548x57f12bf7(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        this.f74290x12702689 = yVar.r();
        this.f74285x961a12dc |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setHttp2Enabled */
    public void m153549xb8274b9(boolean z17) {
        this.f74285x961a12dc |= 16;
        this.f74291x14960008 = z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setHttpCacheMaxSize */
    public void m153550xc0e46cd(long j17) {
        this.f74285x961a12dc |= 256;
        this.f74292x46efff74 = j17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setHttpCacheMode */
    public void m153551x60221f5b(int i17) {
        this.f74285x961a12dc |= 128;
        this.f74293xed939762 = i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setMockCertVerifier */
    public void m153552x9d063446(long j17) {
        this.f74285x961a12dc |= 1024;
        this.f74294xd4f5c11b = j17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setNetworkThreadPriority */
    public void m153553x9af0845a(int i17) {
        this.f74285x961a12dc |= 8192;
        this.f74295x270df443 = i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setQuicDefaultUserAgentId */
    public void m153554xa79dad94(java.lang.String str) {
        str.getClass();
        this.f74285x961a12dc |= 8;
        this.f74296x65e7b80d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setQuicDefaultUserAgentIdBytes */
    public void m153555xc94e7f37(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        this.f74296x65e7b80d = yVar.r();
        this.f74285x961a12dc |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setQuicEnabled */
    public void m153556xce2d5961(boolean z17) {
        this.f74285x961a12dc |= 4;
        this.f74297x6042459c = z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setStoragePath */
    public void m153557x50e61f7e(java.lang.String str) {
        str.getClass();
        this.f74285x961a12dc |= 2;
        this.f74298x34a2431f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setStoragePathBytes */
    public void m153558xff2af8d(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        this.f74298x34a2431f = yVar.r();
        this.f74285x961a12dc |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setUserAgent */
    public void m153559x6e513fb8(java.lang.String str) {
        str.getClass();
        this.f74285x961a12dc |= 1;
        this.f74299x3f71b1a5 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setUserAgentBytes */
    public void m153560x9b74a393(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        this.f74299x3f71b1a5 = yVar.r();
        this.f74285x961a12dc |= 1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n5
    /* renamed from: dynamicMethod */
    public final java.lang.Object mo20836x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5 l5Var, java.lang.Object obj, java.lang.Object obj2) {
        switch (l5Var) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return com.p176xb6135e39.p283xc50a8b8b.n5.m20812xe9ec3795(f74271xb3e828f3, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\tဂ\b\nဈ\t\u000bဂ\n\fဇ\u000b\rဇ\f\u000eင\r", new java.lang.Object[]{"bitField0_", "userAgent_", "storagePath_", "quicEnabled_", "quicDefaultUserAgentId_", "http2Enabled_", "brotliEnabled_", "disableCache_", "httpCacheMode_", "httpCacheMaxSize_", "experimentalOptions_", "mockCertVerifier_", "enableNetworkQualityEstimator_", "bypassPublicKeyPinningForLocalTrustAnchors_", "networkThreadPriority_"});
            case NEW_MUTABLE_INSTANCE:
                return new org.p3343x72743996.net.C29552x11bcec9c();
            case NEW_BUILDER:
                return new org.p3343x72743996.net.C29552x11bcec9c.Builder();
            case GET_DEFAULT_INSTANCE:
                return f74271xb3e828f3;
            case GET_PARSER:
                com.p176xb6135e39.p283xc50a8b8b.e9 e9Var = f74280x8c3e301f;
                if (e9Var == null) {
                    synchronized (org.p3343x72743996.net.C29552x11bcec9c.class) {
                        e9Var = f74280x8c3e301f;
                        if (e9Var == null) {
                            e9Var = new com.p176xb6135e39.p283xc50a8b8b.i5(f74271xb3e828f3);
                            f74280x8c3e301f = e9Var;
                        }
                    }
                }
                return e9Var;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: getBrotliEnabled */
    public boolean mo153561xe49700b9() {
        return this.f74286xbfb149d0;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: getBypassPublicKeyPinningForLocalTrustAnchors */
    public boolean mo153562x6d864579() {
        return this.f74287xf7c9cb3c;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: getDisableCache */
    public boolean mo153563x249bbff0() {
        return this.f74288xb17c8225;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: getEnableNetworkQualityEstimator */
    public boolean mo153564x1d3928d6() {
        return this.f74289xc930d153;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: getExperimentalOptions */
    public java.lang.String mo153565xed6d4960() {
        return this.f74290x12702689;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: getExperimentalOptionsBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo153566xa82462eb() {
        return com.p176xb6135e39.p283xc50a8b8b.y.h(this.f74290x12702689);
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: getHttp2Enabled */
    public boolean mo153567xd53979ad() {
        return this.f74291x14960008;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: getHttpCacheMaxSize */
    public long mo153568x6811b1c1() {
        return this.f74292x46efff74;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: getHttpCacheMode */
    public int mo153569xcd4bb8e7() {
        return this.f74293xed939762;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: getMockCertVerifier */
    public long mo153570xf9099f3a() {
        return this.f74294xd4f5c11b;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: getNetworkThreadPriority */
    public int mo153571xcaddd1e6() {
        return this.f74295x270df443;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: getQuicDefaultUserAgentId */
    public java.lang.String mo153572x755a1188() {
        return this.f74296x65e7b80d;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: getQuicDefaultUserAgentIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo153573xc13673c3() {
        return com.p176xb6135e39.p283xc50a8b8b.y.h(this.f74296x65e7b80d);
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: getQuicEnabled */
    public boolean mo153574x37c7e5ed() {
        return this.f74297x6042459c;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: getStoragePath */
    public java.lang.String mo153575xba80ac0a() {
        return this.f74298x34a2431f;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: getStoragePathBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo153576x6bf61a81() {
        return com.p176xb6135e39.p283xc50a8b8b.y.h(this.f74298x34a2431f);
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: getUserAgent */
    public java.lang.String mo153577x11fd7f44() {
        return this.f74299x3f71b1a5;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: getUserAgentBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo153578xd37e3b87() {
        return com.p176xb6135e39.p283xc50a8b8b.y.h(this.f74299x3f71b1a5);
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: hasBrotliEnabled */
    public boolean mo153579x7cdd6bf5() {
        return (this.f74285x961a12dc & 32) != 0;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: hasBypassPublicKeyPinningForLocalTrustAnchors */
    public boolean mo153580x1733f3bd() {
        return (this.f74285x961a12dc & 4096) != 0;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: hasDisableCache */
    public boolean mo153581x87cfd34() {
        return (this.f74285x961a12dc & 64) != 0;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: hasEnableNetworkQualityEstimator */
    public boolean mo153582x51199c12() {
        return (this.f74285x961a12dc & 2048) != 0;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: hasExperimentalOptions */
    public boolean mo153583x59ed579c() {
        return (this.f74285x961a12dc & 512) != 0;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: hasHttp2Enabled */
    public boolean mo153584xb91ab6f1() {
        return (this.f74285x961a12dc & 16) != 0;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: hasHttpCacheMaxSize */
    public boolean mo153585xd2caad05() {
        return (this.f74285x961a12dc & 256) != 0;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: hasHttpCacheMode */
    public boolean mo153586x65922423() {
        return (this.f74285x961a12dc & 128) != 0;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: hasMockCertVerifier */
    public boolean mo153587x63c29a7e() {
        return (this.f74285x961a12dc & 1024) != 0;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: hasNetworkThreadPriority */
    public boolean mo153588x17934122() {
        return (this.f74285x961a12dc & 8192) != 0;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: hasQuicDefaultUserAgentId */
    public boolean mo153589xbf5289cc() {
        return (this.f74285x961a12dc & 8) != 0;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: hasQuicEnabled */
    public boolean mo153590x57e7f029() {
        return (this.f74285x961a12dc & 4) != 0;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: hasStoragePath */
    public boolean mo153591xdaa0b646() {
        return (this.f74285x961a12dc & 2) != 0;
    }

    @Override // org.p3343x72743996.net.InterfaceC29553x272e46fc
    /* renamed from: hasUserAgent */
    public boolean mo153592xd1d2e880() {
        return (this.f74285x961a12dc & 1) != 0;
    }

    /* renamed from: newBuilder */
    public static org.p3343x72743996.net.C29552x11bcec9c.Builder m153529x3136c9db(org.p3343x72743996.net.C29552x11bcec9c c29552x11bcec9c) {
        return (org.p3343x72743996.net.C29552x11bcec9c.Builder) f74271xb3e828f3.m20833x93ab12ff(c29552x11bcec9c);
    }

    /* renamed from: parseDelimitedFrom */
    public static org.p3343x72743996.net.C29552x11bcec9c m153531x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (org.p3343x72743996.net.C29552x11bcec9c) com.p176xb6135e39.p283xc50a8b8b.n5.m20816x4a829d50(f74271xb3e828f3, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.C29552x11bcec9c m153539x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (org.p3343x72743996.net.C29552x11bcec9c) com.p176xb6135e39.p283xc50a8b8b.n5.m20824x92b714fd(f74271xb3e828f3, byteBuffer, t4Var);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.C29552x11bcec9c m153534x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (org.p3343x72743996.net.C29552x11bcec9c) com.p176xb6135e39.p283xc50a8b8b.n5.m20819x92b714fd(f74271xb3e828f3, yVar);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.C29552x11bcec9c m153535x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (org.p3343x72743996.net.C29552x11bcec9c) com.p176xb6135e39.p283xc50a8b8b.n5.m20820x92b714fd(f74271xb3e828f3, yVar, t4Var);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.C29552x11bcec9c m153540x92b714fd(byte[] bArr) {
        return (org.p3343x72743996.net.C29552x11bcec9c) com.p176xb6135e39.p283xc50a8b8b.n5.m20825x92b714fd(f74271xb3e828f3, bArr);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.C29552x11bcec9c m153541x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (org.p3343x72743996.net.C29552x11bcec9c) com.p176xb6135e39.p283xc50a8b8b.n5.m20826x92b714fd(f74271xb3e828f3, bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.C29552x11bcec9c m153536x92b714fd(java.io.InputStream inputStream) {
        return (org.p3343x72743996.net.C29552x11bcec9c) com.p176xb6135e39.p283xc50a8b8b.n5.m20821x92b714fd(f74271xb3e828f3, inputStream);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.C29552x11bcec9c m153537x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (org.p3343x72743996.net.C29552x11bcec9c) com.p176xb6135e39.p283xc50a8b8b.n5.m20822x92b714fd(f74271xb3e828f3, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.C29552x11bcec9c m153532x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (org.p3343x72743996.net.C29552x11bcec9c) com.p176xb6135e39.p283xc50a8b8b.n5.m20817x92b714fd(f74271xb3e828f3, d0Var);
    }

    /* renamed from: parseFrom */
    public static org.p3343x72743996.net.C29552x11bcec9c m153533x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (org.p3343x72743996.net.C29552x11bcec9c) com.p176xb6135e39.p283xc50a8b8b.n5.m20818x92b714fd(f74271xb3e828f3, d0Var, t4Var);
    }
}
