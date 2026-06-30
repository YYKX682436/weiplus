package org.p3343x72743996.net;

/* renamed from: org.chromium.net.DnsOptions */
/* loaded from: classes16.dex */
public final class C29503x5bd00555 {

    /* renamed from: mEnableStaleDns */
    private final java.lang.Boolean f73790x69535740;

    /* renamed from: mPersistHostCache */
    private final java.lang.Boolean f73791xa1811d3;

    /* renamed from: mPersistHostCachePeriodMillis */
    private final java.lang.Long f73792xebfa28da;

    /* renamed from: mPreestablishConnectionsToStaleDnsResults */
    private final java.lang.Boolean f73793xe0102ed9;

    /* renamed from: mStaleDnsOptions */
    private final org.p3343x72743996.net.C29503x5bd00555.StaleDnsOptions f73794x3e600d81;

    /* renamed from: mUseBuiltInDnsResolver */
    private final java.lang.Boolean f73795x5908c786;

    /* renamed from: org.chromium.net.DnsOptions$Builder */
    /* loaded from: classes16.dex */
    public static final class Builder {

        /* renamed from: mEnableStaleDns */
        private java.lang.Boolean f73796x69535740;

        /* renamed from: mPersistHostCache */
        private java.lang.Boolean f73797xa1811d3;

        /* renamed from: mPersistHostCachePeriodMillis */
        private java.lang.Long f73798xebfa28da;

        /* renamed from: mPreestablishConnectionsToStaleDnsResults */
        private java.lang.Boolean f73799xe0102ed9;

        /* renamed from: mStaleDnsOptions */
        private org.p3343x72743996.net.C29503x5bd00555.StaleDnsOptions f73800x3e600d81;

        /* renamed from: mUseBuiltInDnsResolver */
        private java.lang.Boolean f73801x5908c786;

        /* renamed from: build */
        public org.p3343x72743996.net.C29503x5bd00555 m153210x59bc66e() {
            return new org.p3343x72743996.net.C29503x5bd00555(this);
        }

        /* renamed from: enableStaleDns */
        public org.p3343x72743996.net.C29503x5bd00555.Builder m153211x62a04d73(boolean z17) {
            this.f73796x69535740 = java.lang.Boolean.valueOf(z17);
            return this;
        }

        /* renamed from: persistHostCache */
        public org.p3343x72743996.net.C29503x5bd00555.Builder m153212xe4004746(boolean z17) {
            this.f73797xa1811d3 = java.lang.Boolean.valueOf(z17);
            return this;
        }

        /* renamed from: preestablishConnectionsToStaleDnsResults */
        public org.p3343x72743996.net.C29503x5bd00555.Builder m153213xe39bfb4c(boolean z17) {
            this.f73799xe0102ed9 = java.lang.Boolean.valueOf(z17);
            return this;
        }

        /* renamed from: setPersistDelay */
        public org.p3343x72743996.net.C29503x5bd00555.Builder m153214x3f48a191(java.time.Duration duration) {
            return m153215xb5db134f(duration.toMillis());
        }

        /* renamed from: setPersistHostCachePeriodMillis */
        public org.p3343x72743996.net.C29503x5bd00555.Builder m153215xb5db134f(long j17) {
            this.f73798xebfa28da = java.lang.Long.valueOf(j17);
            return this;
        }

        /* renamed from: setStaleDnsOptions */
        public org.p3343x72743996.net.C29503x5bd00555.Builder m153217x89ea48ec(org.p3343x72743996.net.C29503x5bd00555.StaleDnsOptions staleDnsOptions) {
            this.f73800x3e600d81 = staleDnsOptions;
            return this;
        }

        /* renamed from: useBuiltInDnsResolver */
        public org.p3343x72743996.net.C29503x5bd00555.Builder m153218xa53701f3(boolean z17) {
            this.f73801x5908c786 = java.lang.Boolean.valueOf(z17);
            return this;
        }

        /* renamed from: setStaleDnsOptions */
        public org.p3343x72743996.net.C29503x5bd00555.Builder m153216x89ea48ec(org.p3343x72743996.net.C29503x5bd00555.StaleDnsOptions.Builder builder) {
            return m153217x89ea48ec(builder.m153225x59bc66e());
        }
    }

    /* renamed from: org.chromium.net.DnsOptions$Experimental */
    /* loaded from: classes16.dex */
    public @interface Experimental {
    }

    /* renamed from: org.chromium.net.DnsOptions$StaleDnsOptions */
    /* loaded from: classes16.dex */
    public static class StaleDnsOptions {

        /* renamed from: mAllowCrossNetworkUsage */
        private final java.lang.Boolean f73802x7db050f7;

        /* renamed from: mFreshLookupTimeoutMillis */
        private final java.lang.Long f73803xf48da52c;

        /* renamed from: mMaxExpiredDelayMillis */
        private final java.lang.Long f73804xa3d96f5b;

        /* renamed from: mUseStaleOnNameNotResolved */
        private final java.lang.Boolean f73805x562a9862;

        /* renamed from: org.chromium.net.DnsOptions$StaleDnsOptions$Builder */
        /* loaded from: classes16.dex */
        public static final class Builder {

            /* renamed from: mAllowCrossNetworkUsage */
            private java.lang.Boolean f73806x7db050f7;

            /* renamed from: mFreshLookupTimeoutMillis */
            private java.lang.Long f73807xf48da52c;

            /* renamed from: mMaxExpiredDelayMillis */
            private java.lang.Long f73808xa3d96f5b;

            /* renamed from: mUseStaleOnNameNotResolved */
            private java.lang.Boolean f73809x562a9862;

            /* renamed from: allowCrossNetworkUsage */
            public org.p3343x72743996.net.C29503x5bd00555.StaleDnsOptions.Builder m153224xb749642a(boolean z17) {
                this.f73806x7db050f7 = java.lang.Boolean.valueOf(z17);
                return this;
            }

            /* renamed from: build */
            public org.p3343x72743996.net.C29503x5bd00555.StaleDnsOptions m153225x59bc66e() {
                return new org.p3343x72743996.net.C29503x5bd00555.StaleDnsOptions(this);
            }

            /* renamed from: setFreshLookupTimeout */
            public org.p3343x72743996.net.C29503x5bd00555.StaleDnsOptions.Builder m153226x1ffeb3fb(java.time.Duration duration) {
                return m153227xc081221(duration.toMillis());
            }

            /* renamed from: setFreshLookupTimeoutMillis */
            public org.p3343x72743996.net.C29503x5bd00555.StaleDnsOptions.Builder m153227xc081221(long j17) {
                this.f73807xf48da52c = java.lang.Long.valueOf(j17);
                return this;
            }

            /* renamed from: setMaxExpiredDelayMillis */
            public org.p3343x72743996.net.C29503x5bd00555.StaleDnsOptions.Builder m153228xcbc62e86(long j17) {
                this.f73808xa3d96f5b = java.lang.Long.valueOf(j17);
                return this;
            }

            /* renamed from: useStaleOnNameNotResolved */
            public org.p3343x72743996.net.C29503x5bd00555.StaleDnsOptions.Builder m153230x12abd44f(boolean z17) {
                this.f73809x562a9862 = java.lang.Boolean.valueOf(z17);
                return this;
            }

            /* renamed from: setMaxExpiredDelayMillis */
            public org.p3343x72743996.net.C29503x5bd00555.StaleDnsOptions.Builder m153229xcbc62e86(java.time.Duration duration) {
                return m153228xcbc62e86(duration.toMillis());
            }
        }

        public StaleDnsOptions(org.p3343x72743996.net.C29503x5bd00555.StaleDnsOptions.Builder builder) {
            this.f73803xf48da52c = builder.f73807xf48da52c;
            this.f73804xa3d96f5b = builder.f73808xa3d96f5b;
            this.f73802x7db050f7 = builder.f73806x7db050f7;
            this.f73805x562a9862 = builder.f73809x562a9862;
        }

        /* renamed from: builder */
        public static org.p3343x72743996.net.C29503x5bd00555.StaleDnsOptions.Builder m153219xdc3ef9b() {
            return new org.p3343x72743996.net.C29503x5bd00555.StaleDnsOptions.Builder();
        }

        /* renamed from: getAllowCrossNetworkUsage */
        public java.lang.Boolean m153220x2117db20() {
            return this.f73802x7db050f7;
        }

        /* renamed from: getFreshLookupTimeoutMillis */
        public java.lang.Long m153221x5c3b4915() {
            return this.f73803xf48da52c;
        }

        /* renamed from: getMaxExpiredDelayMillis */
        public java.lang.Long m153222xfbb37c12() {
            return this.f73804xa3d96f5b;
        }

        /* renamed from: getUseStaleOnNameNotResolved */
        public java.lang.Boolean m153223xe4317199() {
            return this.f73805x562a9862;
        }
    }

    public C29503x5bd00555(org.p3343x72743996.net.C29503x5bd00555.Builder builder) {
        this.f73790x69535740 = builder.f73796x69535740;
        this.f73794x3e600d81 = builder.f73800x3e600d81;
        this.f73792xebfa28da = builder.f73798xebfa28da;
        this.f73793xe0102ed9 = builder.f73799xe0102ed9;
        this.f73795x5908c786 = builder.f73801x5908c786;
        this.f73791xa1811d3 = builder.f73797xa1811d3;
    }

    /* renamed from: builder */
    public static org.p3343x72743996.net.C29503x5bd00555.Builder m153203xdc3ef9b() {
        return new org.p3343x72743996.net.C29503x5bd00555.Builder();
    }

    /* renamed from: getEnableStaleDns */
    public java.lang.Boolean m153204x51381a69() {
        return this.f73790x69535740;
    }

    /* renamed from: getPersistHostCache */
    public java.lang.Boolean m153205x8bd8aebc() {
        return this.f73791xa1811d3;
    }

    /* renamed from: getPersistHostCachePeriodMillis */
    public java.lang.Long m153206xbaf1b043() {
        return this.f73792xebfa28da;
    }

    /* renamed from: getPreestablishConnectionsToStaleDnsResults */
    public java.lang.Boolean m153207xe0b2e0c2() {
        return this.f73793xe0102ed9;
    }

    /* renamed from: getStaleDnsOptions */
    public org.p3343x72743996.net.C29503x5bd00555.StaleDnsOptions m153208x5313af78() {
        return this.f73794x3e600d81;
    }

    /* renamed from: getUseBuiltInDnsResolver */
    public java.lang.Boolean m153209xb0e2d43d() {
        return this.f73795x5908c786;
    }
}
