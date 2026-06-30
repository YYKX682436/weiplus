package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.CronetMetrics */
/* loaded from: classes16.dex */
public final class C29606x8d57ee26 extends org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f74602x7118e671 = false;

    /* renamed from: mConnectEndMs */
    private final long f74603x8397a24;

    /* renamed from: mConnectStartMs */
    private final long f74604xce7e6b2b;

    /* renamed from: mDnsEndMs */
    private final long f74605x3c1dcbc5;

    /* renamed from: mDnsStartMs */
    private final long f74606x9a94d88c;

    /* renamed from: mPushEndMs */
    private final long f74607x4b75d2fa;

    /* renamed from: mPushStartMs */
    private final long f74608x3407e681;

    /* renamed from: mReceivedByteCount */
    private final java.lang.Long f74609xe99baf19;

    /* renamed from: mRequestEndMs */
    private final long f74610xe3d23f9f;

    /* renamed from: mRequestStartMs */
    private final long f74611x26fbbde6;

    /* renamed from: mResponseStartMs */
    private final long f74612x81e8d5fa;

    /* renamed from: mSendingEndMs */
    private final long f74613xb6f2bdb4;

    /* renamed from: mSendingStartMs */
    private final long f74614xb3f50abb;

    /* renamed from: mSentByteCount */
    private final java.lang.Long f74615x302fc8c2;

    /* renamed from: mSocketReused */
    private final boolean f74616x926a2ad0;

    /* renamed from: mSslEndMs */
    private final long f74617x4edca8c2;

    /* renamed from: mSslStartMs */
    private final long f74618xf9106a49;

    /* renamed from: mTotalTimeMs */
    private final java.lang.Long f74619x7f4d330a;

    /* renamed from: mTtfbMs */
    private final java.lang.Long f74620x1bf0cccf;

    public C29606x8d57ee26(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, java.lang.Long l27) {
        this.f74620x1bf0cccf = l17;
        this.f74619x7f4d330a = l18;
        this.f74615x302fc8c2 = l19;
        this.f74609xe99baf19 = l27;
        this.f74611x26fbbde6 = -1L;
        this.f74606x9a94d88c = -1L;
        this.f74605x3c1dcbc5 = -1L;
        this.f74604xce7e6b2b = -1L;
        this.f74603x8397a24 = -1L;
        this.f74618xf9106a49 = -1L;
        this.f74617x4edca8c2 = -1L;
        this.f74614xb3f50abb = -1L;
        this.f74613xb6f2bdb4 = -1L;
        this.f74608x3407e681 = -1L;
        this.f74607x4b75d2fa = -1L;
        this.f74612x81e8d5fa = -1L;
        this.f74610xe3d23f9f = -1L;
        this.f74616x926a2ad0 = false;
    }

    /* renamed from: checkOrder */
    private static boolean m154130xe0389726(long j17, long j18) {
        return (j18 >= j17 && j17 != -1) || j18 == -1;
    }

    /* renamed from: toDate */
    private static java.util.Date m154131xcc2ebcc9(long j17) {
        if (j17 != -1) {
            return new java.util.Date(j17);
        }
        return null;
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics
    /* renamed from: getConnectEnd */
    public java.util.Date mo153634xc004af87() {
        return m154131xcc2ebcc9(this.f74603x8397a24);
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics
    /* renamed from: getConnectStart */
    public java.util.Date mo153635xd25ef00e() {
        return m154131xcc2ebcc9(this.f74604xce7e6b2b);
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics
    /* renamed from: getDnsEnd */
    public java.util.Date mo153636x15ff31e8() {
        return m154131xcc2ebcc9(this.f74605x3c1dcbc5);
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics
    /* renamed from: getDnsStart */
    public java.util.Date mo153637x93c25e2f() {
        return m154131xcc2ebcc9(this.f74606x9a94d88c);
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics
    /* renamed from: getPushEnd */
    public java.util.Date mo153638x30b30f2b() {
        return m154131xcc2ebcc9(this.f74607x4b75d2fa);
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics
    /* renamed from: getPushStart */
    public java.util.Date mo153639xd0f3f6b2() {
        return m154131xcc2ebcc9(this.f74608x3407e681);
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics
    /* renamed from: getReceivedByteCount */
    public java.lang.Long mo153640x9feeaf50() {
        return this.f74609xe99baf19;
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics
    /* renamed from: getRequestEnd */
    public java.util.Date mo153641xf07697c2() {
        return m154131xcc2ebcc9(this.f74610xe3d23f9f);
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics
    /* renamed from: getRequestStart */
    public java.util.Date mo153642xadf7b589() {
        return m154131xcc2ebcc9(this.f74611x26fbbde6);
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics
    /* renamed from: getResponseStart */
    public java.util.Date mo153643x20a7fceb() {
        return m154131xcc2ebcc9(this.f74612x81e8d5fa);
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics
    /* renamed from: getSendingEnd */
    public java.util.Date mo153644x30599717() {
        return m154131xcc2ebcc9(this.f74613xb6f2bdb4);
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics
    /* renamed from: getSendingStart */
    public java.util.Date mo153645x8118339e() {
        return m154131xcc2ebcc9(this.f74614xb3f50abb);
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics
    /* renamed from: getSentByteCount */
    public java.lang.Long mo153646x92817c79() {
        return this.f74615x302fc8c2;
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics
    /* renamed from: getSocketReused */
    public boolean mo153647x5bc7a439() {
        return this.f74616x926a2ad0;
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics
    /* renamed from: getSslEnd */
    public java.util.Date mo153648x2fdb2a25() {
        return m154131xcc2ebcc9(this.f74617x4edca8c2);
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics
    /* renamed from: getSslStart */
    public java.util.Date mo153649xa6813b2c() {
        return m154131xcc2ebcc9(this.f74618xf9106a49);
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics
    /* renamed from: getTotalTimeMs */
    public java.lang.Long mo153650xaf166881() {
        return this.f74619x7f4d330a;
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics
    /* renamed from: getTtfbMs */
    public java.lang.Long mo153651x319bc8f8() {
        return this.f74620x1bf0cccf;
    }

    public C29606x8d57ee26(long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, long j39, long j47, long j48, long j49, long j57, boolean z17, long j58, long j59) {
        this.f74611x26fbbde6 = j17;
        this.f74606x9a94d88c = j18;
        this.f74605x3c1dcbc5 = j19;
        this.f74604xce7e6b2b = j27;
        this.f74603x8397a24 = j28;
        this.f74618xf9106a49 = j29;
        this.f74617x4edca8c2 = j37;
        this.f74614xb3f50abb = j38;
        this.f74613xb6f2bdb4 = j39;
        this.f74608x3407e681 = j47;
        this.f74607x4b75d2fa = j48;
        this.f74612x81e8d5fa = j49;
        this.f74610xe3d23f9f = j57;
        this.f74616x926a2ad0 = z17;
        this.f74615x302fc8c2 = java.lang.Long.valueOf(j58);
        this.f74609xe99baf19 = java.lang.Long.valueOf(j59);
        if (j17 != -1 && j49 != -1) {
            this.f74620x1bf0cccf = java.lang.Long.valueOf(j49 - j17);
        } else {
            this.f74620x1bf0cccf = null;
        }
        if (j17 != -1 && j57 != -1) {
            this.f74619x7f4d330a = java.lang.Long.valueOf(j57 - j17);
        } else {
            this.f74619x7f4d330a = null;
        }
    }
}
