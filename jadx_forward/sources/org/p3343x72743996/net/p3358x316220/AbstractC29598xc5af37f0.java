package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.CronetEngineBase */
/* loaded from: classes16.dex */
public abstract class AbstractC29598xc5af37f0 extends org.p3343x72743996.net.AbstractC29507xc7c0f987 {

    /* renamed from: DEFAULT_NETWORK_HANDLE */
    protected static final long f74518xece49357 = -1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: org.chromium.net.impl.CronetEngineBase$Idempotency */
    /* loaded from: classes6.dex */
    public @interface Idempotency {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: org.chromium.net.impl.CronetEngineBase$RequestPriority */
    /* loaded from: classes6.dex */
    public @interface RequestPriority {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: org.chromium.net.impl.CronetEngineBase$StreamPriority */
    /* loaded from: classes6.dex */
    public @interface StreamPriority {
    }

    /* renamed from: createBidirectionalStream */
    public abstract org.p3343x72743996.net.AbstractC29506xd5b5287b mo154040x28d1ac07(java.lang.String str, org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback callback, java.util.concurrent.Executor executor, java.lang.String str2, java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list, int i17, boolean z17, java.util.Collection<java.lang.Object> collection, boolean z18, int i18, boolean z19, int i19, long j17);

    /* renamed from: createRequest */
    public abstract org.p3343x72743996.net.p3358x316220.AbstractC29629x1bdcd131 mo154041xc73615f3(java.lang.String str, org.p3343x72743996.net.AbstractC29563x9a627640.Callback callback, java.util.concurrent.Executor executor, int i17, java.util.Collection<java.lang.Object> collection, boolean z17, boolean z18, boolean z19, boolean z27, int i18, boolean z28, int i19, org.p3343x72743996.net.AbstractC29554xec05c04f.Listener listener, int i27, long j17);

    @Override // org.p3343x72743996.net.AbstractC29507xc7c0f987, org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: newBidirectionalStreamBuilder */
    public /* bridge */ /* synthetic */ org.p3343x72743996.net.AbstractC29492x7b0c4683.Builder mo153157xd26a5938(java.lang.String str, org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback callback, java.util.concurrent.Executor executor) {
        return super.mo153157xd26a5938(str, callback, executor);
    }

    @Override // org.p3343x72743996.net.AbstractC29507xc7c0f987, org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: newUrlRequestBuilder */
    public org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder mo153158x92e7539b(java.lang.String str, org.p3343x72743996.net.AbstractC29563x9a627640.Callback callback, java.util.concurrent.Executor executor) {
        return new org.p3343x72743996.net.p3358x316220.C29630x4b4a49fb(str, callback, executor, this);
    }
}
