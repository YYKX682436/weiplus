package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.RequestFinishedInfoImpl */
/* loaded from: classes16.dex */
public class C29628xf7a1d70f extends org.p3343x72743996.net.AbstractC29554xec05c04f {

    /* renamed from: mAnnotations */
    private final java.util.Collection<java.lang.Object> f74809x70ba8c77;

    /* renamed from: mException */
    private final org.p3343x72743996.net.AbstractC29501x119930f2 f74810xd3071a62;

    /* renamed from: mFinishedReason */
    private final int f74811x692cab23;

    /* renamed from: mMetrics */
    private final org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics f74812xd7117396;

    /* renamed from: mResponseInfo */
    private final org.p3343x72743996.net.AbstractC29564x6974077e f74813xed58fd9c;

    /* renamed from: mUrl */
    private final java.lang.String f74814x32d9c2;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: org.chromium.net.impl.RequestFinishedInfoImpl$FinishedReason */
    /* loaded from: classes6.dex */
    public @interface FinishedReason {
    }

    public C29628xf7a1d70f(java.lang.String str, java.util.Collection<java.lang.Object> collection, org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics metrics, int i17, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, org.p3343x72743996.net.AbstractC29501x119930f2 abstractC29501x119930f2) {
        this.f74814x32d9c2 = str;
        this.f74809x70ba8c77 = collection;
        this.f74812xd7117396 = metrics;
        this.f74811x692cab23 = i17;
        this.f74813xed58fd9c = abstractC29564x6974077e;
        this.f74810xd3071a62 = abstractC29501x119930f2;
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f
    /* renamed from: getAnnotations */
    public java.util.Collection<java.lang.Object> mo153626xa083c1ee() {
        java.util.Collection<java.lang.Object> collection = this.f74809x70ba8c77;
        return collection == null ? java.util.Collections.emptyList() : collection;
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f
    /* renamed from: getException */
    public org.p3343x72743996.net.AbstractC29501x119930f2 mo153627x57bd4199() {
        return this.f74810xd3071a62;
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f
    /* renamed from: getFinishedReason */
    public int mo153628x51116e4c() {
        return this.f74811x692cab23;
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f
    /* renamed from: getMetrics */
    public org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics mo153629x76c5fc8d() {
        return this.f74812xd7117396;
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f
    /* renamed from: getResponseInfo */
    public org.p3343x72743996.net.AbstractC29564x6974077e mo153630xb6b67705() {
        return this.f74813xed58fd9c;
    }

    @Override // org.p3343x72743996.net.AbstractC29554xec05c04f
    /* renamed from: getUrl */
    public java.lang.String mo153631xb5887639() {
        return this.f74814x32d9c2;
    }
}
