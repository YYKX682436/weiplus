package org.p3343x72743996.net;

@java.lang.Deprecated
/* renamed from: org.chromium.net.ExperimentalCronetEngine */
/* loaded from: classes16.dex */
public abstract class AbstractC29507xc7c0f987 extends org.p3343x72743996.net.AbstractC29500x62bc147f {

    /* renamed from: CONNECTION_METRIC_UNKNOWN */
    public static final int f73821x828441c = -1;

    /* renamed from: EFFECTIVE_CONNECTION_TYPE_2G */
    public static final int f73822x2a7eaed1 = 3;

    /* renamed from: EFFECTIVE_CONNECTION_TYPE_3G */
    public static final int f73823x2a7eaef0 = 4;

    /* renamed from: EFFECTIVE_CONNECTION_TYPE_4G */
    public static final int f73824x2a7eaf0f = 5;

    /* renamed from: EFFECTIVE_CONNECTION_TYPE_OFFLINE */
    public static final int f73825x480dec7 = 1;

    /* renamed from: EFFECTIVE_CONNECTION_TYPE_SLOW_2G */
    public static final int f73826xe2db0257 = 2;

    /* renamed from: EFFECTIVE_CONNECTION_TYPE_UNKNOWN */
    public static final int f73827x4fd47d2e = 0;

    /* renamed from: UNBIND_NETWORK_HANDLE */
    public static final long f73828x5706b282 = -1;

    /* renamed from: org.chromium.net.ExperimentalCronetEngine$Builder */
    /* loaded from: classes16.dex */
    public static class Builder extends org.p3343x72743996.net.AbstractC29500x62bc147f.Builder {
        public Builder(android.content.Context context) {
            super(context);
        }

        @Override // org.p3343x72743996.net.AbstractC29500x62bc147f.Builder
        /* renamed from: addPublicKeyPins */
        public /* bridge */ /* synthetic */ org.p3343x72743996.net.AbstractC29500x62bc147f.Builder mo153172x1709deb3(java.lang.String str, java.util.Set set, boolean z17, java.util.Date date) {
            return mo153172x1709deb3(str, (java.util.Set<byte[]>) set, z17, date);
        }

        @Override // org.p3343x72743996.net.AbstractC29500x62bc147f.Builder
        /* renamed from: enableSdch */
        public org.p3343x72743996.net.AbstractC29507xc7c0f987.Builder mo153181x70d7ea99(boolean z17) {
            return this;
        }

        /* renamed from: getBuilderDelegate */
        public org.p3343x72743996.net.AbstractC29520xf01d5733 m153236x5ce6380a() {
            return this.f73781x48329613;
        }

        /* renamed from: setExperimentalOptions */
        public org.p3343x72743996.net.AbstractC29507xc7c0f987.Builder m153237x3bb208d4(java.lang.String str) {
            this.f73781x48329613.mo153259x3bb208d4(str);
            return this;
        }

        public Builder(org.p3343x72743996.net.AbstractC29520xf01d5733 abstractC29520xf01d5733) {
            super(abstractC29520xf01d5733);
        }

        @Override // org.p3343x72743996.net.AbstractC29500x62bc147f.Builder
        /* renamed from: addPublicKeyPins */
        public org.p3343x72743996.net.AbstractC29507xc7c0f987.Builder mo153172x1709deb3(java.lang.String str, java.util.Set<byte[]> set, boolean z17, java.util.Date date) {
            super.mo153172x1709deb3(str, set, z17, date);
            return this;
        }

        @Override // org.p3343x72743996.net.AbstractC29500x62bc147f.Builder
        /* renamed from: addQuicHint */
        public org.p3343x72743996.net.AbstractC29507xc7c0f987.Builder mo153173x864dd1a6(java.lang.String str, int i17, int i18) {
            super.mo153173x864dd1a6(str, i17, i18);
            return this;
        }

        @Override // org.p3343x72743996.net.AbstractC29500x62bc147f.Builder
        /* renamed from: build */
        public org.p3343x72743996.net.AbstractC29507xc7c0f987 mo153174x59bc66e() {
            return this.f73781x48329613.mo153246x59bc66e();
        }

        @Override // org.p3343x72743996.net.AbstractC29500x62bc147f.Builder
        /* renamed from: enableHttp2 */
        public org.p3343x72743996.net.AbstractC29507xc7c0f987.Builder mo153176xa991ece7(boolean z17) {
            super.mo153176xa991ece7(z17);
            return this;
        }

        @Override // org.p3343x72743996.net.AbstractC29500x62bc147f.Builder
        /* renamed from: enableHttpCache */
        public org.p3343x72743996.net.AbstractC29507xc7c0f987.Builder mo153177x84904997(int i17, long j17) {
            super.mo153177x84904997(i17, j17);
            return this;
        }

        @Override // org.p3343x72743996.net.AbstractC29500x62bc147f.Builder
        /* renamed from: enableNetworkQualityEstimator */
        public org.p3343x72743996.net.AbstractC29507xc7c0f987.Builder mo153178xedb7408c(boolean z17) {
            super.mo153178xedb7408c(z17);
            return this;
        }

        @Override // org.p3343x72743996.net.AbstractC29500x62bc147f.Builder
        /* renamed from: enablePublicKeyPinningBypassForLocalTrustAnchors */
        public org.p3343x72743996.net.AbstractC29507xc7c0f987.Builder mo153179xa4501926(boolean z17) {
            super.mo153179xa4501926(z17);
            return this;
        }

        @Override // org.p3343x72743996.net.AbstractC29500x62bc147f.Builder
        /* renamed from: enableQuic */
        public org.p3343x72743996.net.AbstractC29507xc7c0f987.Builder mo153180x70d74261(boolean z17) {
            super.mo153180x70d74261(z17);
            return this;
        }

        @Override // org.p3343x72743996.net.AbstractC29500x62bc147f.Builder
        /* renamed from: setConnectionMigrationOptions */
        public org.p3343x72743996.net.AbstractC29507xc7c0f987.Builder mo153184xaf3aff0(org.p3343x72743996.net.C29497x80dc8a0e c29497x80dc8a0e) {
            super.mo153184xaf3aff0(c29497x80dc8a0e);
            return this;
        }

        @Override // org.p3343x72743996.net.AbstractC29500x62bc147f.Builder
        /* renamed from: setDnsOptions */
        public org.p3343x72743996.net.AbstractC29507xc7c0f987.Builder mo153186x1632f37(org.p3343x72743996.net.C29503x5bd00555 c29503x5bd00555) {
            super.mo153186x1632f37(c29503x5bd00555);
            return this;
        }

        @Override // org.p3343x72743996.net.AbstractC29500x62bc147f.Builder
        /* renamed from: setLibraryLoader */
        public org.p3343x72743996.net.AbstractC29507xc7c0f987.Builder mo153187xd89aab6c(org.p3343x72743996.net.AbstractC29500x62bc147f.Builder.LibraryLoader libraryLoader) {
            super.mo153187xd89aab6c(libraryLoader);
            return this;
        }

        @Override // org.p3343x72743996.net.AbstractC29500x62bc147f.Builder
        /* renamed from: setQuicOptions */
        public org.p3343x72743996.net.AbstractC29507xc7c0f987.Builder mo153189xe3a454be(org.p3343x72743996.net.C29548xd6d24260 c29548xd6d24260) {
            super.mo153189xe3a454be(c29548xd6d24260);
            return this;
        }

        @Override // org.p3343x72743996.net.AbstractC29500x62bc147f.Builder
        /* renamed from: setStoragePath */
        public org.p3343x72743996.net.AbstractC29507xc7c0f987.Builder mo153190x50e61f7e(java.lang.String str) {
            super.mo153190x50e61f7e(str);
            return this;
        }

        @Override // org.p3343x72743996.net.AbstractC29500x62bc147f.Builder
        /* renamed from: setThreadPriority */
        public org.p3343x72743996.net.AbstractC29507xc7c0f987.Builder mo153191x589076d0(int i17) {
            super.mo153191x589076d0(i17);
            return this;
        }

        @Override // org.p3343x72743996.net.AbstractC29500x62bc147f.Builder
        /* renamed from: setUserAgent */
        public org.p3343x72743996.net.AbstractC29507xc7c0f987.Builder mo153192x6e513fb8(java.lang.String str) {
            super.mo153192x6e513fb8(str);
            return this;
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: newBidirectionalStreamBuilder */
    public abstract org.p3343x72743996.net.AbstractC29506xd5b5287b.Builder mo153157xd26a5938(java.lang.String str, org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback callback, java.util.concurrent.Executor executor);

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: newUrlRequestBuilder */
    public abstract org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder mo153158x92e7539b(java.lang.String str, org.p3343x72743996.net.AbstractC29563x9a627640.Callback callback, java.util.concurrent.Executor executor);

    /* renamed from: openConnection */
    public java.net.URLConnection mo153235x946eacc8(java.net.URL url, java.net.Proxy proxy) {
        return url.openConnection(proxy);
    }
}
