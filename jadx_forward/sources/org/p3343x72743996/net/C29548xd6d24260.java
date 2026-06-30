package org.p3343x72743996.net;

/* renamed from: org.chromium.net.QuicOptions */
/* loaded from: classes16.dex */
public class C29548xd6d24260 {

    /* renamed from: mClientConnectionOptions */
    private final java.util.Set<java.lang.String> f74232xcd907228;

    /* renamed from: mCloseSessionsOnIpChange */
    private final java.lang.Boolean f74233xf4cc7c1e;

    /* renamed from: mConnectionOptions */
    private final java.util.Set<java.lang.String> f74234x8b750f3;

    /* renamed from: mCryptoHandshakeTimeoutSeconds */
    private final java.lang.Long f74235x3ceaa247;

    /* renamed from: mDelayJobsWithAvailableSpdySession */
    private final java.lang.Boolean f74236x2d30c8d;

    /* renamed from: mEnableTlsZeroRtt */
    private final java.lang.Boolean f74237x4c2dbd9f;

    /* renamed from: mEnabledQuicVersions */
    private final java.util.Set<java.lang.String> f74238x31d1fb2d;

    /* renamed from: mExtraQuicheFlags */
    private final java.util.Set<java.lang.String> f74239xa8a7b7e9;

    /* renamed from: mGoawaySessionsOnIpChange */
    private final java.lang.Boolean f74240xfa9f9f36;

    /* renamed from: mHandshakeUserAgent */
    private final java.lang.String f74241xde119310;

    /* renamed from: mIdleConnectionTimeoutSeconds */
    private final java.lang.Long f74242xf95a6b5d;

    /* renamed from: mInMemoryServerConfigsCacheSize */
    private final java.lang.Integer f74243x82ca8388;

    /* renamed from: mIncreaseBrokenServicePeriodExponentially */
    private final java.lang.Boolean f74244x447ada00;

    /* renamed from: mInitialBrokenServicePeriodSeconds */
    private final java.lang.Long f74245xe8816fb5;

    /* renamed from: mPreCryptoHandshakeIdleTimeoutSeconds */
    private final java.lang.Long f74246x2cbfd52;

    /* renamed from: mQuicHostAllowlist */
    private final java.util.Set<java.lang.String> f74247xfd83814;

    /* renamed from: mRetransmittableOnWireTimeoutMillis */
    private final java.lang.Long f74248x3ce225e5;

    /* renamed from: mRetryWithoutAltSvcOnQuicErrors */
    private final java.lang.Boolean f74249x98e2c50c;

    /* renamed from: org.chromium.net.QuicOptions$Builder */
    /* loaded from: classes16.dex */
    public static class Builder {

        /* renamed from: mCloseSessionsOnIpChange */
        private java.lang.Boolean f74251xf4cc7c1e;

        /* renamed from: mCryptoHandshakeTimeoutSeconds */
        private java.lang.Long f74253x3ceaa247;

        /* renamed from: mDelayJobsWithAvailableSpdySession */
        private java.lang.Boolean f74254x2d30c8d;

        /* renamed from: mEnableTlsZeroRtt */
        private java.lang.Boolean f74255x4c2dbd9f;

        /* renamed from: mGoawaySessionsOnIpChange */
        private java.lang.Boolean f74258xfa9f9f36;

        /* renamed from: mHandshakeUserAgent */
        private java.lang.String f74259xde119310;

        /* renamed from: mIdleConnectionTimeoutSeconds */
        private java.lang.Long f74260xf95a6b5d;

        /* renamed from: mInMemoryServerConfigsCacheSize */
        private java.lang.Integer f74261x82ca8388;

        /* renamed from: mIncreaseBrokenServicePeriodExponentially */
        private java.lang.Boolean f74262x447ada00;

        /* renamed from: mInitialBrokenServicePeriodSeconds */
        private java.lang.Long f74263xe8816fb5;

        /* renamed from: mPreCryptoHandshakeIdleTimeoutSeconds */
        private java.lang.Long f74264x2cbfd52;

        /* renamed from: mRetransmittableOnWireTimeoutMillis */
        private java.lang.Long f74266x3ce225e5;

        /* renamed from: mRetryWithoutAltSvcOnQuicErrors */
        private java.lang.Boolean f74267x98e2c50c;

        /* renamed from: mQuicHostAllowlist */
        private final java.util.Set<java.lang.String> f74265xfd83814 = new java.util.LinkedHashSet();

        /* renamed from: mEnabledQuicVersions */
        private final java.util.Set<java.lang.String> f74256x31d1fb2d = new java.util.LinkedHashSet();

        /* renamed from: mConnectionOptions */
        private final java.util.Set<java.lang.String> f74252x8b750f3 = new java.util.LinkedHashSet();

        /* renamed from: mClientConnectionOptions */
        private final java.util.Set<java.lang.String> f74250xcd907228 = new java.util.LinkedHashSet();

        /* renamed from: mExtraQuicheFlags */
        private final java.util.Set<java.lang.String> f74257xa8a7b7e9 = new java.util.LinkedHashSet();

        /* renamed from: addAllowedQuicHost */
        public org.p3343x72743996.net.C29548xd6d24260.Builder m153492x706f43ed(java.lang.String str) {
            this.f74265xfd83814.add(str);
            return this;
        }

        /* renamed from: addClientConnectionOption */
        public org.p3343x72743996.net.C29548xd6d24260.Builder m153493x2b9a9cdf(java.lang.String str) {
            this.f74250xcd907228.add(str);
            return this;
        }

        /* renamed from: addConnectionOption */
        public org.p3343x72743996.net.C29548xd6d24260.Builder m153494x336f2fb4(java.lang.String str) {
            this.f74252x8b750f3.add(str);
            return this;
        }

        /* renamed from: addEnabledQuicVersion */
        public org.p3343x72743996.net.C29548xd6d24260.Builder m153495xb536193a(java.lang.String str) {
            this.f74256x31d1fb2d.add(str);
            return this;
        }

        /* renamed from: addExtraQuicheFlag */
        public org.p3343x72743996.net.C29548xd6d24260.Builder m153496xf3e91b16(java.lang.String str) {
            this.f74257xa8a7b7e9.add(str);
            return this;
        }

        /* renamed from: build */
        public org.p3343x72743996.net.C29548xd6d24260 m153497x59bc66e() {
            return new org.p3343x72743996.net.C29548xd6d24260(this);
        }

        /* renamed from: closeSessionsOnIpChange */
        public org.p3343x72743996.net.C29548xd6d24260.Builder m153498xee55cf4b(boolean z17) {
            this.f74251xf4cc7c1e = java.lang.Boolean.valueOf(z17);
            return this;
        }

        /* renamed from: delayJobsWithAvailableSpdySession */
        public org.p3343x72743996.net.C29548xd6d24260.Builder m153499xb7440b7a(boolean z17) {
            this.f74254x2d30c8d = java.lang.Boolean.valueOf(z17);
            return this;
        }

        /* renamed from: enableTlsZeroRtt */
        public org.p3343x72743996.net.C29548xd6d24260.Builder m153500x2615f312(boolean z17) {
            this.f74255x4c2dbd9f = java.lang.Boolean.valueOf(z17);
            return this;
        }

        /* renamed from: goawaySessionsOnIpChange */
        public org.p3343x72743996.net.C29548xd6d24260.Builder m153501x3240b1a9(boolean z17) {
            this.f74258xfa9f9f36 = java.lang.Boolean.valueOf(z17);
            return this;
        }

        /* renamed from: increaseBrokenServicePeriodExponentially */
        public org.p3343x72743996.net.C29548xd6d24260.Builder m153502x4806a673(boolean z17) {
            this.f74262x447ada00 = java.lang.Boolean.valueOf(z17);
            return this;
        }

        /* renamed from: retryWithoutAltSvcOnQuicErrors */
        public org.p3343x72743996.net.C29548xd6d24260.Builder m153503xc75af53f(boolean z17) {
            this.f74267x98e2c50c = java.lang.Boolean.valueOf(z17);
            return this;
        }

        /* renamed from: setCryptoHandshakeTimeoutSeconds */
        public org.p3343x72743996.net.C29548xd6d24260.Builder m153504xaf270672(long j17) {
            this.f74253x3ceaa247 = java.lang.Long.valueOf(j17);
            return this;
        }

        /* renamed from: setHandshakeUserAgent */
        public org.p3343x72743996.net.C29548xd6d24260.Builder m153505x894a1bc5(java.lang.String str) {
            this.f74259xde119310 = str;
            return this;
        }

        /* renamed from: setIdleConnectionTimeoutSeconds */
        public org.p3343x72743996.net.C29548xd6d24260.Builder m153506xc33b55d2(long j17) {
            this.f74260xf95a6b5d = java.lang.Long.valueOf(j17);
            return this;
        }

        /* renamed from: setInMemoryServerConfigsCacheSize */
        public org.p3343x72743996.net.C29548xd6d24260.Builder m153507x581aa4bd(int i17) {
            this.f74261x82ca8388 = java.lang.Integer.valueOf(i17);
            return this;
        }

        /* renamed from: setInitialBrokenServicePeriodSeconds */
        public org.p3343x72743996.net.C29548xd6d24260.Builder m153508x6049c660(long j17) {
            this.f74263xe8816fb5 = java.lang.Long.valueOf(j17);
            return this;
        }

        /* renamed from: setPreCryptoHandshakeIdleTimeoutSeconds */
        public org.p3343x72743996.net.C29548xd6d24260.Builder m153509x3d69a2c7(long j17) {
            this.f74264x2cbfd52 = java.lang.Long.valueOf(j17);
            return this;
        }

        /* renamed from: setRetransmittableOnWireTimeoutMillis */
        public org.p3343x72743996.net.C29548xd6d24260.Builder m153510xbe24a49a(long j17) {
            this.f74266x3ce225e5 = java.lang.Long.valueOf(j17);
            return this;
        }
    }

    /* renamed from: org.chromium.net.QuicOptions$Experimental */
    /* loaded from: classes16.dex */
    public @interface Experimental {
    }

    /* renamed from: org.chromium.net.QuicOptions$QuichePassthroughOption */
    /* loaded from: classes16.dex */
    public @interface QuichePassthroughOption {
    }

    public C29548xd6d24260(org.p3343x72743996.net.C29548xd6d24260.Builder builder) {
        this.f74247xfd83814 = java.util.Collections.unmodifiableSet(new java.util.LinkedHashSet(builder.f74265xfd83814));
        this.f74238x31d1fb2d = java.util.Collections.unmodifiableSet(new java.util.LinkedHashSet(builder.f74256x31d1fb2d));
        this.f74234x8b750f3 = java.util.Collections.unmodifiableSet(new java.util.LinkedHashSet(builder.f74252x8b750f3));
        this.f74232xcd907228 = java.util.Collections.unmodifiableSet(new java.util.LinkedHashSet(builder.f74250xcd907228));
        this.f74243x82ca8388 = builder.f74261x82ca8388;
        this.f74241xde119310 = builder.f74259xde119310;
        this.f74249x98e2c50c = builder.f74267x98e2c50c;
        this.f74237x4c2dbd9f = builder.f74255x4c2dbd9f;
        this.f74246x2cbfd52 = builder.f74264x2cbfd52;
        this.f74235x3ceaa247 = builder.f74253x3ceaa247;
        this.f74242xf95a6b5d = builder.f74260xf95a6b5d;
        this.f74248x3ce225e5 = builder.f74266x3ce225e5;
        this.f74233xf4cc7c1e = builder.f74251xf4cc7c1e;
        this.f74240xfa9f9f36 = builder.f74258xfa9f9f36;
        this.f74245xe8816fb5 = builder.f74263xe8816fb5;
        this.f74244x447ada00 = builder.f74262x447ada00;
        this.f74236x2d30c8d = builder.f74254x2d30c8d;
        this.f74239xa8a7b7e9 = java.util.Collections.unmodifiableSet(new java.util.LinkedHashSet(builder.f74257xa8a7b7e9));
    }

    /* renamed from: builder */
    public static org.p3343x72743996.net.C29548xd6d24260.Builder m153473xdc3ef9b() {
        return new org.p3343x72743996.net.C29548xd6d24260.Builder();
    }

    /* renamed from: getClientConnectionOptions */
    public java.util.Set<java.lang.String> m153474x971a2d1f() {
        return this.f74232xcd907228;
    }

    /* renamed from: getCloseSessionsOnIpChange */
    public java.lang.Boolean m153475xbe563715() {
        return this.f74233xf4cc7c1e;
    }

    /* renamed from: getConnectionOptions */
    public java.util.Set<java.lang.String> m153476xbf0a512a() {
        return this.f74234x8b750f3;
    }

    /* renamed from: getCryptoHandshakeTimeoutSeconds */
    public java.lang.Long m153477x4ce407fe() {
        return this.f74235x3ceaa247;
    }

    /* renamed from: getDelayJobsWithAvailableSpdySession */
    public java.lang.Boolean m153478x7a4bec4() {
        return this.f74236x2d30c8d;
    }

    /* renamed from: getEnableTlsZeroRtt */
    public java.lang.Boolean m153479xcdee5a88() {
        return this.f74237x4c2dbd9f;
    }

    /* renamed from: getEnabledQuicVersions */
    public java.util.Set<java.lang.String> m153480x9f65c9a4() {
        return this.f74238x31d1fb2d;
    }

    /* renamed from: getExtraQuicheFlags */
    public java.util.Set<java.lang.String> m153481x2a6854d2() {
        return this.f74239xa8a7b7e9;
    }

    /* renamed from: getGoawaySessionsOnIpChange */
    public java.lang.Boolean m153482x624d431f() {
        return this.f74240xfa9f9f36;
    }

    /* renamed from: getHandshakeUserAgent */
    public java.lang.String m153483xf21e99b9() {
        return this.f74241xde119310;
    }

    /* renamed from: getIdleConnectionTimeoutSeconds */
    public java.lang.Long m153484xc851f2c6() {
        return this.f74242xf95a6b5d;
    }

    /* renamed from: getInMemoryServerConfigsCacheSize */
    public java.lang.Integer m153485x71fdd4b1() {
        return this.f74243x82ca8388;
    }

    /* renamed from: getIncreaseBrokenServicePeriodExponentially */
    public java.lang.Boolean m153486x451d8be9() {
        return this.f74244x447ada00;
    }

    /* renamed from: getInitialBrokenServicePeriodSeconds */
    public java.lang.Long m153487xed5321ec() {
        return this.f74245xe8816fb5;
    }

    /* renamed from: getPreCryptoHandshakeIdleTimeoutSeconds */
    public java.lang.Long m153488xd15e0bbb() {
        return this.f74246x2cbfd52;
    }

    /* renamed from: getQuicHostAllowlist */
    public java.util.Set<java.lang.String> m153489xc62b384b() {
        return this.f74247xfd83814;
    }

    /* renamed from: getRetransmittableOnWireTimeoutMillis */
    public java.lang.Long m153490xd246ba8e() {
        return this.f74248x3ce225e5;
    }

    /* renamed from: getRetryWithoutAltSvcOnQuicErrors */
    public java.lang.Boolean m153491x88161635() {
        return this.f74249x98e2c50c;
    }
}
