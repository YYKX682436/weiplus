package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.UrlRequestBuilderImpl */
/* loaded from: classes13.dex */
public class C29630x4b4a49fb extends org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder {

    /* renamed from: ACCEPT_ENCODING */
    private static final java.lang.String f74816xb6894eaa = "Accept-Encoding";
    private static final java.lang.String TAG = "UrlRequestBuilderImpl";

    /* renamed from: mAllowDirectExecutor */
    private boolean f74817x83a489d8;

    /* renamed from: mCallback */
    private final org.p3343x72743996.net.AbstractC29563x9a627640.Callback f74818x1ab9c7d2;

    /* renamed from: mCronetEngine */
    private final org.p3343x72743996.net.p3358x316220.AbstractC29598xc5af37f0 f74819xf085d96c;

    /* renamed from: mDisableCache */
    private boolean f74820x5b3e4687;

    /* renamed from: mDisableConnectionMigration */
    private boolean f74821x189418d5;

    /* renamed from: mExecutor */
    private final java.util.concurrent.Executor f74822x9ec3a060;

    /* renamed from: mMethod */
    private java.lang.String f74824xf31f7ae;

    /* renamed from: mRequestAnnotations */
    private java.util.Collection<java.lang.Object> f74827xe5e7ac62;

    /* renamed from: mRequestFinishedListener */
    private org.p3343x72743996.net.AbstractC29554xec05c04f.Listener f74828x89f23cc8;

    /* renamed from: mTrafficStatsTag */
    private int f74830xba73b36b;

    /* renamed from: mTrafficStatsTagSet */
    private boolean f74831x9e3d54f7;

    /* renamed from: mTrafficStatsUid */
    private int f74832xba73b821;

    /* renamed from: mTrafficStatsUidSet */
    private boolean f74833xa0618c81;

    /* renamed from: mUploadDataProvider */
    private org.p3343x72743996.net.AbstractC29560x8cb1347c f74834x1e3cd3a9;

    /* renamed from: mUploadDataProviderExecutor */
    private java.util.concurrent.Executor f74835xe887779c;

    /* renamed from: mUrl */
    private final java.lang.String f74836x32d9c2;

    /* renamed from: mRequestHeaders */
    private final java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> f74829xc777efc4 = new java.util.ArrayList<>();

    /* renamed from: mPriority */
    private int f74826xdf862131 = 3;

    /* renamed from: mNetworkHandle */
    private long f74825xec9e289 = -1;

    /* renamed from: mIdempotency */
    private int f74823xcb208ba4 = 0;

    public C29630x4b4a49fb(java.lang.String str, org.p3343x72743996.net.AbstractC29563x9a627640.Callback callback, java.util.concurrent.Executor executor, org.p3343x72743996.net.p3358x316220.AbstractC29598xc5af37f0 abstractC29598xc5af37f0) {
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
        this.f74836x32d9c2 = str;
        this.f74818x1ab9c7d2 = callback;
        this.f74822x9ec3a060 = executor;
        this.f74819xf085d96c = abstractC29598xc5af37f0;
    }

    @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Builder
    /* renamed from: bindToNetwork */
    public org.p3343x72743996.net.p3358x316220.C29630x4b4a49fb mo153672x5f2b2376(long j17) {
        this.f74825xec9e289 = j17;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder
    /* renamed from: disableConnectionMigration */
    public org.p3343x72743996.net.p3358x316220.C29630x4b4a49fb mo153271xec3a5a88() {
        this.f74821x189418d5 = true;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder, org.p3343x72743996.net.AbstractC29563x9a627640.Builder
    /* renamed from: setHttpMethod */
    public org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder mo153272x492a458b(java.lang.String str) {
        if (str != null) {
            this.f74824xf31f7ae = str;
            return this;
        }
        throw new java.lang.NullPointerException("Method is required.");
    }

    @Override // org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder
    /* renamed from: setIdempotency */
    public org.p3343x72743996.net.p3358x316220.C29630x4b4a49fb mo153273x914f348f(int i17) {
        this.f74823xcb208ba4 = i17;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder, org.p3343x72743996.net.AbstractC29563x9a627640.Builder
    /* renamed from: addHeader */
    public org.p3343x72743996.net.p3358x316220.C29630x4b4a49fb mo153266xec6c8a8e(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Invalid header name.");
        }
        if (str2 != null) {
            if (f74816xb6894eaa.equalsIgnoreCase(str)) {
                new java.lang.Exception();
                return this;
            }
            this.f74829xc777efc4.add(android.util.Pair.create(str, str2));
            return this;
        }
        throw new java.lang.NullPointerException("Invalid header value.");
    }

    @Override // org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder, org.p3343x72743996.net.AbstractC29563x9a627640.Builder
    /* renamed from: addRequestAnnotation */
    public org.p3343x72743996.net.p3358x316220.C29630x4b4a49fb mo153267xbd4b107d(java.lang.Object obj) {
        if (obj != null) {
            if (this.f74827xe5e7ac62 == null) {
                this.f74827xe5e7ac62 = new java.util.ArrayList();
            }
            this.f74827xe5e7ac62.add(obj);
            return this;
        }
        throw new java.lang.NullPointerException("Invalid metrics annotation.");
    }

    @Override // org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder, org.p3343x72743996.net.AbstractC29563x9a627640.Builder
    /* renamed from: allowDirectExecutor */
    public org.p3343x72743996.net.p3358x316220.C29630x4b4a49fb mo153268x99087b85() {
        this.f74817x83a489d8 = true;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder, org.p3343x72743996.net.AbstractC29563x9a627640.Builder
    /* renamed from: build */
    public org.p3343x72743996.net.p3358x316220.AbstractC29629x1bdcd131 mo153269x59bc66e() {
        org.p3343x72743996.net.p3358x316220.AbstractC29629x1bdcd131 mo154041xc73615f3 = this.f74819xf085d96c.mo154041xc73615f3(this.f74836x32d9c2, this.f74818x1ab9c7d2, this.f74822x9ec3a060, this.f74826xdf862131, this.f74827xe5e7ac62, this.f74820x5b3e4687, this.f74821x189418d5, this.f74817x83a489d8, this.f74831x9e3d54f7, this.f74830xba73b36b, this.f74833xa0618c81, this.f74832xba73b821, this.f74828x89f23cc8, this.f74823xcb208ba4, this.f74825xec9e289);
        java.lang.String str = this.f74824xf31f7ae;
        if (str != null) {
            mo154041xc73615f3.mo154183x492a458b(str);
        }
        java.util.Iterator<android.util.Pair<java.lang.String, java.lang.String>> it = this.f74829xc777efc4.iterator();
        while (it.hasNext()) {
            android.util.Pair<java.lang.String, java.lang.String> next = it.next();
            mo154041xc73615f3.mo154179xec6c8a8e((java.lang.String) next.first, (java.lang.String) next.second);
        }
        org.p3343x72743996.net.AbstractC29560x8cb1347c abstractC29560x8cb1347c = this.f74834x1e3cd3a9;
        if (abstractC29560x8cb1347c != null) {
            mo154041xc73615f3.mo154186xc9755c5e(abstractC29560x8cb1347c, this.f74835xe887779c);
        }
        return mo154041xc73615f3;
    }

    @Override // org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder, org.p3343x72743996.net.AbstractC29563x9a627640.Builder
    /* renamed from: disableCache */
    public org.p3343x72743996.net.p3358x316220.C29630x4b4a49fb mo153270xc3a92d7a() {
        this.f74820x5b3e4687 = true;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder, org.p3343x72743996.net.AbstractC29563x9a627640.Builder
    /* renamed from: setPriority */
    public org.p3343x72743996.net.p3358x316220.C29630x4b4a49fb mo153274x311b1826(int i17) {
        this.f74826xdf862131 = i17;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder, org.p3343x72743996.net.AbstractC29563x9a627640.Builder
    /* renamed from: setRequestFinishedListener */
    public org.p3343x72743996.net.p3358x316220.C29630x4b4a49fb mo153275x69abdd33(org.p3343x72743996.net.AbstractC29554xec05c04f.Listener listener) {
        this.f74828x89f23cc8 = listener;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder, org.p3343x72743996.net.AbstractC29563x9a627640.Builder
    /* renamed from: setTrafficStatsTag */
    public org.p3343x72743996.net.p3358x316220.C29630x4b4a49fb mo153276x5fdeed6(int i17) {
        this.f74831x9e3d54f7 = true;
        this.f74830xba73b36b = i17;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder, org.p3343x72743996.net.AbstractC29563x9a627640.Builder
    /* renamed from: setTrafficStatsUid */
    public org.p3343x72743996.net.p3358x316220.C29630x4b4a49fb mo153277x5fdf38c(int i17) {
        this.f74833xa0618c81 = true;
        this.f74832xba73b821 = i17;
        return this;
    }

    @Override // org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder, org.p3343x72743996.net.AbstractC29563x9a627640.Builder
    /* renamed from: setUploadDataProvider */
    public org.p3343x72743996.net.p3358x316220.C29630x4b4a49fb mo153278xc9755c5e(org.p3343x72743996.net.AbstractC29560x8cb1347c abstractC29560x8cb1347c, java.util.concurrent.Executor executor) {
        if (abstractC29560x8cb1347c == null) {
            throw new java.lang.NullPointerException("Invalid UploadDataProvider.");
        }
        if (executor != null) {
            if (this.f74824xf31f7ae == null) {
                this.f74824xf31f7ae = "POST";
            }
            this.f74834x1e3cd3a9 = abstractC29560x8cb1347c;
            this.f74835xe887779c = executor;
            return this;
        }
        throw new java.lang.NullPointerException("Invalid UploadDataProvider Executor.");
    }
}
