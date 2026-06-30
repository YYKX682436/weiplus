package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.BidirectionalStreamBuilderImpl */
/* loaded from: classes16.dex */
public class C29592xf0dcc1d8 extends org.p3343x72743996.net.AbstractC29506xd5b5287b.Builder {

    /* renamed from: mCallback */
    private final org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback f74447x1ab9c7d2;

    /* renamed from: mCronetEngine */
    private final org.p3343x72743996.net.p3358x316220.AbstractC29598xc5af37f0 f74448xf085d96c;

    /* renamed from: mDelayRequestHeadersUntilFirstFlush */
    private boolean f74449xcdae73c5;

    /* renamed from: mExecutor */
    private final java.util.concurrent.Executor f74450x9ec3a060;

    /* renamed from: mRequestAnnotations */
    private java.util.Collection<java.lang.Object> f74454xe5e7ac62;

    /* renamed from: mTrafficStatsTag */
    private int f74456xba73b36b;

    /* renamed from: mTrafficStatsTagSet */
    private boolean f74457x9e3d54f7;

    /* renamed from: mTrafficStatsUid */
    private int f74458xba73b821;

    /* renamed from: mTrafficStatsUidSet */
    private boolean f74459xa0618c81;

    /* renamed from: mUrl */
    private final java.lang.String f74460x32d9c2;

    /* renamed from: mRequestHeaders */
    private final java.util.ArrayList<java.util.Map.Entry<java.lang.String, java.lang.String>> f74455xc777efc4 = new java.util.ArrayList<>();

    /* renamed from: mHttpMethod */
    private java.lang.String f74451x8f737d6 = "POST";

    /* renamed from: mPriority */
    private int f74453xdf862131 = 3;

    /* renamed from: mNetworkHandle */
    private long f74452xec9e289 = -1;

    public C29592xf0dcc1d8(java.lang.String str, org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback callback, java.util.concurrent.Executor executor, org.p3343x72743996.net.p3358x316220.AbstractC29598xc5af37f0 abstractC29598xc5af37f0) {
        if (str == null) {
            throw new java.lang.NullPointerException("URL is required.");
        }
        if (callback == null) {
            throw new java.lang.NullPointerException("Callback is required.");
        }
        if (executor == null) {
            throw new java.lang.NullPointerException("Executor is required.");
        }
        if (abstractC29598xc5af37f0 == null) {
            throw new java.lang.NullPointerException("CronetEngine is required.");
        }
        this.f74460x32d9c2 = str;
        this.f74447x1ab9c7d2 = callback;
        this.f74450x9ec3a060 = executor;
        this.f74448xf085d96c = abstractC29598xc5af37f0;
    }

    @Override // org.p3343x72743996.net.AbstractC29506xd5b5287b.Builder, org.p3343x72743996.net.AbstractC29492x7b0c4683.Builder
    /* renamed from: addRequestAnnotation */
    public org.p3343x72743996.net.AbstractC29506xd5b5287b.Builder mo153103xbd4b107d(java.lang.Object obj) {
        if (obj != null) {
            if (this.f74454xe5e7ac62 == null) {
                this.f74454xe5e7ac62 = new java.util.ArrayList();
            }
            this.f74454xe5e7ac62.add(obj);
            return this;
        }
        throw new java.lang.NullPointerException("Invalid metrics annotation.");
    }

    @Override // org.p3343x72743996.net.AbstractC29492x7b0c4683.Builder
    /* renamed from: bindToNetwork */
    public org.p3343x72743996.net.AbstractC29506xd5b5287b.Builder mo153104x5f2b2376(long j17) {
        this.f74452xec9e289 = j17;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29506xd5b5287b.Builder, org.p3343x72743996.net.AbstractC29492x7b0c4683.Builder
    /* renamed from: build */
    public org.p3343x72743996.net.AbstractC29506xd5b5287b mo153105x59bc66e() {
        return this.f74448xf085d96c.mo154040x28d1ac07(this.f74460x32d9c2, this.f74447x1ab9c7d2, this.f74450x9ec3a060, this.f74451x8f737d6, this.f74455xc777efc4, this.f74453xdf862131, this.f74449xcdae73c5, this.f74454xe5e7ac62, this.f74457x9e3d54f7, this.f74456xba73b36b, this.f74459xa0618c81, this.f74458xba73b821, this.f74452xec9e289);
    }

    @Override // org.p3343x72743996.net.AbstractC29506xd5b5287b.Builder, org.p3343x72743996.net.AbstractC29492x7b0c4683.Builder
    /* renamed from: setTrafficStatsTag */
    public org.p3343x72743996.net.AbstractC29506xd5b5287b.Builder mo153109x5fdeed6(int i17) {
        this.f74457x9e3d54f7 = true;
        this.f74456xba73b36b = i17;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29506xd5b5287b.Builder, org.p3343x72743996.net.AbstractC29492x7b0c4683.Builder
    /* renamed from: setTrafficStatsUid */
    public org.p3343x72743996.net.AbstractC29506xd5b5287b.Builder mo153110x5fdf38c(int i17) {
        this.f74459xa0618c81 = true;
        this.f74458xba73b821 = i17;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29506xd5b5287b.Builder, org.p3343x72743996.net.AbstractC29492x7b0c4683.Builder
    /* renamed from: addHeader */
    public org.p3343x72743996.net.p3358x316220.C29592xf0dcc1d8 mo153102xec6c8a8e(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Invalid header name.");
        }
        if (str2 != null) {
            this.f74455xc777efc4.add(new java.util.AbstractMap.SimpleImmutableEntry(str, str2));
            return this;
        }
        throw new java.lang.NullPointerException("Invalid header value.");
    }

    @Override // org.p3343x72743996.net.AbstractC29506xd5b5287b.Builder, org.p3343x72743996.net.AbstractC29492x7b0c4683.Builder
    /* renamed from: delayRequestHeadersUntilFirstFlush */
    public org.p3343x72743996.net.p3358x316220.C29592xf0dcc1d8 mo153106xa75d5278(boolean z17) {
        this.f74449xcdae73c5 = z17;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29506xd5b5287b.Builder, org.p3343x72743996.net.AbstractC29492x7b0c4683.Builder
    /* renamed from: setHttpMethod */
    public org.p3343x72743996.net.p3358x316220.C29592xf0dcc1d8 mo153107x492a458b(java.lang.String str) {
        if (str != null) {
            this.f74451x8f737d6 = str;
            return this;
        }
        throw new java.lang.NullPointerException("Method is required.");
    }

    @Override // org.p3343x72743996.net.AbstractC29506xd5b5287b.Builder, org.p3343x72743996.net.AbstractC29492x7b0c4683.Builder
    /* renamed from: setPriority */
    public org.p3343x72743996.net.p3358x316220.C29592xf0dcc1d8 mo153108x311b1826(int i17) {
        this.f74453xdf862131 = i17;
        return this;
    }
}
