package org.p3343x72743996.net;

/* renamed from: org.chromium.net.ConnectionMigrationOptions */
/* loaded from: classes16.dex */
public class C29497x80dc8a0e {

    /* renamed from: mAllowNonDefaultNetworkUsage */
    private final java.lang.Boolean f73704xa00b86e3;

    /* renamed from: mAllowServerMigration */
    private final java.lang.Boolean f73705x7f90554f;

    /* renamed from: mEnableDefaultNetworkMigration */
    private final java.lang.Boolean f73706xf6feb731;

    /* renamed from: mEnablePathDegradationMigration */
    private final java.lang.Boolean f73707xc025e89d;

    /* renamed from: mIdleMigrationPeriodSeconds */
    private final java.lang.Long f73708xe9510f91;

    /* renamed from: mMaxPathDegradingEagerMigrationsCount */
    private final java.lang.Integer f73709x957d6809;

    /* renamed from: mMaxTimeOnNonDefaultNetworkSeconds */
    private final java.lang.Long f73710x73e09588;

    /* renamed from: mMaxWriteErrorEagerMigrationsCount */
    private final java.lang.Integer f73711x7682b3f2;

    /* renamed from: mMigrateIdleConnections */
    private final java.lang.Boolean f73712x53a2bc83;

    /* renamed from: mRetryPreHandshakeErrorsOnAlternateNetwork */
    private final java.lang.Boolean f73713x8e5b08ad;

    /* renamed from: org.chromium.net.ConnectionMigrationOptions$Builder */
    /* loaded from: classes16.dex */
    public static class Builder {

        /* renamed from: mAllowNonDefaultNetworkUsage */
        private java.lang.Boolean f73714xa00b86e3;

        /* renamed from: mAllowServerMigration */
        private java.lang.Boolean f73715x7f90554f;

        /* renamed from: mEnableDefaultNetworkConnectionMigration */
        private java.lang.Boolean f73716x58739233;

        /* renamed from: mEnablePathDegradationMigration */
        private java.lang.Boolean f73717xc025e89d;

        /* renamed from: mIdleConnectionMigrationPeriodSeconds */
        private java.lang.Long f73718x39442cf;

        /* renamed from: mMaxPathDegradingEagerMigrationsCount */
        private java.lang.Integer f73719x957d6809;

        /* renamed from: mMaxTimeOnNonDefaultNetworkSeconds */
        private java.lang.Long f73720x73e09588;

        /* renamed from: mMaxWriteErrorEagerMigrationsCount */
        private java.lang.Integer f73721x7682b3f2;

        /* renamed from: mMigrateIdleConnections */
        private java.lang.Boolean f73722x53a2bc83;

        /* renamed from: mRetryPreHandshakeErrorsOnAlternateNetwork */
        private java.lang.Boolean f73723x8e5b08ad;

        /* renamed from: allowNonDefaultNetworkUsage */
        public org.p3343x72743996.net.C29497x80dc8a0e.Builder m153133x412d7b90(boolean z17) {
            this.f73714xa00b86e3 = java.lang.Boolean.valueOf(z17);
            return this;
        }

        /* renamed from: allowServerMigration */
        public org.p3343x72743996.net.C29497x80dc8a0e.Builder m153134x16aa9942(boolean z17) {
            this.f73715x7f90554f = java.lang.Boolean.valueOf(z17);
            return this;
        }

        /* renamed from: build */
        public org.p3343x72743996.net.C29497x80dc8a0e m153135x59bc66e() {
            return new org.p3343x72743996.net.C29497x80dc8a0e(this);
        }

        /* renamed from: enableDefaultNetworkMigration */
        public org.p3343x72743996.net.C29497x80dc8a0e.Builder m153136xd776349e(boolean z17) {
            this.f73716x58739233 = java.lang.Boolean.valueOf(z17);
            return this;
        }

        /* renamed from: enablePathDegradationMigration */
        public org.p3343x72743996.net.C29497x80dc8a0e.Builder m153137xee9e18d0(boolean z17) {
            this.f73717xc025e89d = java.lang.Boolean.valueOf(z17);
            return this;
        }

        /* renamed from: migrateIdleConnections */
        public org.p3343x72743996.net.C29497x80dc8a0e.Builder m153138x8d3bcfb6(boolean z17) {
            this.f73722x53a2bc83 = java.lang.Boolean.valueOf(z17);
            return this;
        }

        /* renamed from: retryPreHandshakeErrorsOnNonDefaultNetwork */
        public org.p3343x72743996.net.C29497x80dc8a0e.Builder m153139x4a5cdf54(boolean z17) {
            this.f73723x8e5b08ad = java.lang.Boolean.valueOf(z17);
            return this;
        }

        /* renamed from: setIdleConnectionMigrationPeriodSeconds */
        public org.p3343x72743996.net.C29497x80dc8a0e.Builder m153140x3e31e844(long j17) {
            this.f73718x39442cf = java.lang.Long.valueOf(j17);
            return this;
        }

        /* renamed from: setMaxPathDegradingNonDefaultNetworkMigrationsCount */
        public org.p3343x72743996.net.C29497x80dc8a0e.Builder m153141x7324d39c(int i17) {
            this.f73719x957d6809 = java.lang.Integer.valueOf(i17);
            return this;
        }

        /* renamed from: setMaxTimeOnNonDefaultNetworkSeconds */
        public org.p3343x72743996.net.C29497x80dc8a0e.Builder m153142xeba8ec33(long j17) {
            this.f73720x73e09588 = java.lang.Long.valueOf(j17);
            return this;
        }

        /* renamed from: setMaxWriteErrorNonDefaultNetworkMigrationsCount */
        public org.p3343x72743996.net.C29497x80dc8a0e.Builder m153143x221f1a3b(int i17) {
            this.f73721x7682b3f2 = java.lang.Integer.valueOf(i17);
            return this;
        }
    }

    /* renamed from: org.chromium.net.ConnectionMigrationOptions$Experimental */
    /* loaded from: classes16.dex */
    public @interface Experimental {
    }

    public C29497x80dc8a0e(org.p3343x72743996.net.C29497x80dc8a0e.Builder builder) {
        this.f73706xf6feb731 = builder.f73716x58739233;
        this.f73707xc025e89d = builder.f73717xc025e89d;
        this.f73705x7f90554f = builder.f73715x7f90554f;
        this.f73712x53a2bc83 = builder.f73722x53a2bc83;
        this.f73708xe9510f91 = builder.f73718x39442cf;
        this.f73713x8e5b08ad = builder.f73723x8e5b08ad;
        this.f73704xa00b86e3 = builder.f73714xa00b86e3;
        this.f73710x73e09588 = builder.f73720x73e09588;
        this.f73711x7682b3f2 = builder.f73721x7682b3f2;
        this.f73709x957d6809 = builder.f73719x957d6809;
    }

    /* renamed from: builder */
    public static org.p3343x72743996.net.C29497x80dc8a0e.Builder m153122xdc3ef9b() {
        return new org.p3343x72743996.net.C29497x80dc8a0e.Builder();
    }

    /* renamed from: getAllowNonDefaultNetworkUsage */
    public java.lang.Boolean m153123xc7c0ee5a() {
        return this.f73704xa00b86e3;
    }

    /* renamed from: getAllowServerMigration */
    public java.lang.Boolean m153124xc47655b8() {
        return this.f73705x7f90554f;
    }

    /* renamed from: getEnableDefaultNetworkMigration */
    public java.lang.Boolean m153125x6f81ce8() {
        return this.f73706xf6feb731;
    }

    /* renamed from: getEnablePathDegradationMigration */
    public java.lang.Boolean m153126xaf5939c6() {
        return this.f73707xc025e89d;
    }

    /* renamed from: getIdleMigrationPeriodSeconds */
    public java.lang.Long m153127x1c255d3a() {
        return this.f73708xe9510f91;
    }

    /* renamed from: getMaxPathDegradingEagerMigrationsCount */
    public java.lang.Integer m153128x640f7672() {
        return this.f73709x957d6809;
    }

    /* renamed from: getMaxTimeOnNonDefaultNetworkSeconds */
    public java.lang.Long m153129x78b247bf() {
        return this.f73710x73e09588;
    }

    /* renamed from: getMaxWriteErrorEagerMigrationsCount */
    public java.lang.Integer m153130x7b546629() {
        return this.f73711x7682b3f2;
    }

    /* renamed from: getMigrateIdleConnections */
    public java.lang.Boolean m153131xf70a46ac() {
        return this.f73712x53a2bc83;
    }

    /* renamed from: getRetryPreHandshakeErrorsOnAlternateNetwork */
    public java.lang.Boolean m153132xa20e93e4() {
        return this.f73713x8e5b08ad;
    }
}
