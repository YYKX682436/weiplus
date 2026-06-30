package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.CronetLogger */
/* loaded from: classes16.dex */
public abstract class AbstractC29603x6ebc0fcd {

    /* renamed from: org.chromium.net.impl.CronetLogger$CronetEngineBuilderInfo */
    /* loaded from: classes16.dex */
    public static class CronetEngineBuilderInfo {

        /* renamed from: mBrotiEnabled */
        private final boolean f74565x90ebe4da;

        /* renamed from: mExperimentalOptions */
        private final java.lang.String f74566x7fd97ae9;

        /* renamed from: mHttp2Enabled */
        private final boolean f74567xbdc0044;

        /* renamed from: mHttpCacheMode */
        private final int f74568x6afa0530;

        /* renamed from: mNetworkQualityEstimatorEnabled */
        private final boolean f74569x7345d27f;

        /* renamed from: mPublicKeyPinningBypassForLocalTrustAnchorsEnabled */
        private final boolean f74570xc624d191;

        /* renamed from: mQuicEnabled */
        private final boolean f74571x7feb076;

        /* renamed from: mStoragePath */
        private final java.lang.String f74572x8ab77693;

        /* renamed from: mThreadPriority */
        private final int f74573xa8b54b9b;

        /* renamed from: mUserAgent */
        private final java.lang.String f74574x8d47580d;

        public CronetEngineBuilderInfo(org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c abstractC29599x8a199e5c) {
            this.f74570xc624d191 = abstractC29599x8a199e5c.m154057xd21c567e();
            this.f74574x8d47580d = abstractC29599x8a199e5c.m154049x11fd7f44();
            this.f74572x8ab77693 = abstractC29599x8a199e5c.m154062xe0aa6540();
            this.f74571x7feb076 = abstractC29599x8a199e5c.m154059x5df19f23();
            this.f74567xbdc0044 = abstractC29599x8a199e5c.m154050x7446e737();
            this.f74565x90ebe4da = abstractC29599x8a199e5c.m154044x2737446f();
            this.f74568x6afa0530 = abstractC29599x8a199e5c.m154056xcd9f48cb();
            this.f74566x7fd97ae9 = abstractC29599x8a199e5c.m154046x953d6c96();
            this.f74569x7345d27f = abstractC29599x8a199e5c.m154055xa1be02b2();
            this.f74573xa8b54b9b = abstractC29599x8a199e5c.m154063xa20241ce(10);
        }

        /* renamed from: getExperimentalOptions */
        public java.lang.String m154093xed6d4960() {
            return this.f74566x7fd97ae9;
        }

        /* renamed from: getHttpCacheMode */
        public int m154094xcd4bb8e7() {
            return this.f74568x6afa0530;
        }

        /* renamed from: getStoragePath */
        public java.lang.String m154095xba80ac0a() {
            return this.f74572x8ab77693;
        }

        /* renamed from: getThreadPriority */
        public int m154096x909a0ec4() {
            return this.f74573xa8b54b9b;
        }

        /* renamed from: getUserAgent */
        public java.lang.String m154097x11fd7f44() {
            return this.f74574x8d47580d;
        }

        /* renamed from: isBrotliEnabled */
        public boolean m154098xa8769b65() {
            return this.f74565x90ebe4da;
        }

        /* renamed from: isHttp2Enabled */
        public boolean m154099x46e5d981() {
            return this.f74567xbdc0044;
        }

        /* renamed from: isNetworkQualityEstimatorEnabled */
        public boolean m154100xcc84b67c() {
            return this.f74569x7345d27f;
        }

        /* renamed from: isPublicKeyPinningBypassForLocalTrustAnchorsEnabled */
        public boolean m154101x242dea74() {
            return this.f74570xc624d191;
        }

        /* renamed from: isQuicEnabled */
        public boolean m154102x9e63b99() {
            return this.f74571x7feb076;
        }
    }

    /* renamed from: org.chromium.net.impl.CronetLogger$CronetSource */
    /* loaded from: classes13.dex */
    public enum CronetSource {
        CRONET_SOURCE_UNSPECIFIED,
        CRONET_SOURCE_STATICALLY_LINKED,
        CRONET_SOURCE_PLAY_SERVICES,
        CRONET_SOURCE_FALLBACK,
        CRONET_SOURCE_PLATFORM
    }

    /* renamed from: org.chromium.net.impl.CronetLogger$CronetTrafficInfo */
    /* loaded from: classes16.dex */
    public static class CronetTrafficInfo {

        /* renamed from: mDidConnectionMigrationSucceed */
        private final boolean f74581xc82f9804;

        /* renamed from: mHeadersLatency */
        private final java.time.Duration f74582x68301c65;

        /* renamed from: mNegotiatedProtocol */
        private final java.lang.String f74583xa39e11ab;

        /* renamed from: mRequestBodySizeInBytes */
        private final long f74584xbd61ee41;

        /* renamed from: mRequestHeaderSizeInBytes */
        private final long f74585xafe57cf6;

        /* renamed from: mResponseBodySizeInBytes */
        private final long f74586xdb0fb255;

        /* renamed from: mResponseHeaderSizeInBytes */
        private final long f74587x19328c0a;

        /* renamed from: mResponseStatusCode */
        private final int f74588x23e1576d;

        /* renamed from: mTotalLatency */
        private final java.time.Duration f74589xb5e3ae27;

        /* renamed from: mWasConnectionMigrationAttempted */
        private final boolean f74590x20b234d8;

        public CronetTrafficInfo(long j17, long j18, long j19, long j27, int i17, java.time.Duration duration, java.time.Duration duration2, java.lang.String str, boolean z17, boolean z18) {
            this.f74585xafe57cf6 = j17;
            this.f74584xbd61ee41 = j18;
            this.f74587x19328c0a = j19;
            this.f74586xdb0fb255 = j27;
            this.f74588x23e1576d = i17;
            this.f74582x68301c65 = duration;
            this.f74589xb5e3ae27 = duration2;
            this.f74583xa39e11ab = str;
            this.f74590x20b234d8 = z17;
            this.f74581xc82f9804 = z18;
        }

        /* renamed from: didConnectionMigrationSucceed */
        public boolean m154107xa8a71571() {
            return this.f74581xc82f9804;
        }

        /* renamed from: getHeadersLatency */
        public java.time.Duration m154108x5014df8e() {
            return this.f74582x68301c65;
        }

        /* renamed from: getNegotiatedProtocol */
        public java.lang.String m154109xb7ab1854() {
            return this.f74583xa39e11ab;
        }

        /* renamed from: getRequestBodySizeInBytes */
        public long m154110x60c9786a() {
            return this.f74584xbd61ee41;
        }

        /* renamed from: getRequestHeaderSizeInBytes */
        public long m154111x179320df() {
            return this.f74585xafe57cf6;
        }

        /* renamed from: getResponseBodySizeInBytes */
        public long m154112xa4996d4c() {
            return this.f74586xdb0fb255;
        }

        /* renamed from: getResponseHeaderSizeInBytes */
        public long m154113xa7396541() {
            return this.f74587x19328c0a;
        }

        /* renamed from: getResponseStatusCode */
        public int m154114x37ee5e16() {
            return this.f74588x23e1576d;
        }

        /* renamed from: getTotalLatency */
        public java.time.Duration m154115x7f412790() {
            return this.f74589xb5e3ae27;
        }

        /* renamed from: wasConnectionMigrationAttempted */
        public boolean m154116xc1400b05() {
            return this.f74590x20b234d8;
        }
    }

    /* renamed from: org.chromium.net.impl.CronetLogger$CronetVersion */
    /* loaded from: classes4.dex */
    public static class CronetVersion {

        /* renamed from: mBuildVersion */
        private final int f74591x613d8f97;

        /* renamed from: mMajorVersion */
        private final int f74592x7368e5ec;

        /* renamed from: mMinorVersion */
        private final int f74593xebb44070;

        /* renamed from: mPatchVersion */
        private final int f74594x135b4c7d;

        public CronetVersion(java.lang.String str) {
            java.lang.String[] split = str.split("\\.");
            this.f74592x7368e5ec = java.lang.Integer.parseInt(split[0]);
            this.f74593xebb44070 = java.lang.Integer.parseInt(split[1]);
            this.f74591x613d8f97 = java.lang.Integer.parseInt(split[2]);
            this.f74594x135b4c7d = java.lang.Integer.parseInt(split[3]);
        }

        /* renamed from: getBuildVersion */
        public int m154117x2a9b0900() {
            return this.f74591x613d8f97;
        }

        /* renamed from: getMajorVersion */
        public int m154118x3cc65f55() {
            return this.f74592x7368e5ec;
        }

        /* renamed from: getMinorVersion */
        public int m154119xb511b9d9() {
            return this.f74593xebb44070;
        }

        /* renamed from: getPatchVersion */
        public int m154120xdcb8c5e6() {
            return this.f74594x135b4c7d;
        }

        /* renamed from: toString */
        public java.lang.String m154121x9616526c() {
            return this.f74592x7368e5ec + "." + this.f74593xebb44070 + "." + this.f74591x613d8f97 + "." + this.f74594x135b4c7d;
        }
    }

    /* renamed from: logCronetEngineCreation */
    public abstract void mo154091xf02a51c2(int i17, org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd.CronetEngineBuilderInfo cronetEngineBuilderInfo, org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd.CronetVersion cronetVersion, org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd.CronetSource cronetSource);

    /* renamed from: logCronetTrafficInfo */
    public abstract void mo154092x26c6456a(int i17, org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd.CronetTrafficInfo cronetTrafficInfo);
}
