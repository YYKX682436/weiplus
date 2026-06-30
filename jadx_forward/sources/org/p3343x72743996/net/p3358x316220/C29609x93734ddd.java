package org.p3343x72743996.net.p3358x316220;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "cronet")
/* renamed from: org.chromium.net.impl.CronetUrlRequest */
/* loaded from: classes16.dex */
public final class C29609x93734ddd extends org.p3343x72743996.net.p3358x316220.AbstractC29629x1bdcd131 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f74644x7118e671 = false;

    /* renamed from: mAllowDirectExecutor */
    private final boolean f74645x83a489d8;

    /* renamed from: mCallback */
    private final org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.UrlRequestCallback f74646x1ab9c7d2;

    /* renamed from: mCronetEngineId */
    private final int f74647xe67537a7;

    /* renamed from: mDisableCache */
    private final boolean f74648x5b3e4687;

    /* renamed from: mDisableConnectionMigration */
    private final boolean f74649x189418d5;

    /* renamed from: mException */
    private org.p3343x72743996.net.AbstractC29501x119930f2 f74650xd3071a62;

    /* renamed from: mExecutor */
    private final java.util.concurrent.Executor f74651x9ec3a060;

    /* renamed from: mFinishedReason */
    private int f74652x692cab23;

    /* renamed from: mIdempotency */
    private final int f74653xcb208ba4;

    /* renamed from: mInitialMethod */
    private java.lang.String f74654x46e499d8;

    /* renamed from: mInitialUrl */
    private final java.lang.String f74655x101d77d8;

    /* renamed from: mLogger */
    private final org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd f74656xe041c5d;

    /* renamed from: mMetrics */
    private org.p3343x72743996.net.p3358x316220.C29606x8d57ee26 f74657xd7117396;

    /* renamed from: mNetworkHandle */
    private final long f74658xec9e289;

    /* renamed from: mOnDestroyedCallbackForTesting */
    private java.lang.Runnable f74659x9c642a59;

    /* renamed from: mOnReadCompletedTask */
    private org.p3343x72743996.net.p3358x316220.C29609x93734ddd.OnReadCompletedRunnable f74660xe4c4f6ae;

    /* renamed from: mPriority */
    private final int f74661xdf862131;

    /* renamed from: mQuicConnectionMigrationAttempted */
    private boolean f74662xb3f4d167;

    /* renamed from: mQuicConnectionMigrationSuccessful */
    private boolean f74663x2ed660bf;

    /* renamed from: mRequestAnnotations */
    private final java.util.Collection<java.lang.Object> f74664xe5e7ac62;

    /* renamed from: mRequestContext */
    private final org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 f74665xd0c7b5ed;

    /* renamed from: mRequestFinishedListener */
    private final org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.RequestFinishedInfoListener f74666x89f23cc8;

    /* renamed from: mRequestHeaders */
    private final org.p3343x72743996.net.p3358x316220.C29609x93734ddd.HeadersList f74667xc777efc4;

    /* renamed from: mResponseInfo */
    private org.p3343x72743996.net.p3358x316220.C29632xf92aeebe f74668xed58fd9c;

    /* renamed from: mStarted */
    private boolean f74669x2d03f354;

    /* renamed from: mTrafficStatsTag */
    private final int f74670xba73b36b;

    /* renamed from: mTrafficStatsTagSet */
    private final boolean f74671x9e3d54f7;

    /* renamed from: mTrafficStatsUid */
    private final int f74672xba73b821;

    /* renamed from: mTrafficStatsUidSet */
    private final boolean f74673xa0618c81;

    /* renamed from: mUploadDataStream */
    private org.p3343x72743996.net.p3358x316220.C29607x7a6892a8 f74674x18b62b38;

    /* renamed from: mUrlChain */
    private final java.util.List<java.lang.String> f74675xe999d61f;

    /* renamed from: mUrlRequestAdapter */
    private long f74676xe71a8422;

    /* renamed from: mUrlRequestAdapterLock */
    private final java.lang.Object f74677x103bdc6d = new java.lang.Object();

    /* renamed from: mWaitingOnRead */
    private boolean f74678x2fd2b155;

    /* renamed from: mWaitingOnRedirect */
    private boolean f74679xbf5a581b;

    /* renamed from: org.chromium.net.impl.CronetUrlRequest$HeadersList */
    /* loaded from: classes16.dex */
    public static final class HeadersList extends java.util.ArrayList<java.util.Map.Entry<java.lang.String, java.lang.String>> {
    }

    /* renamed from: org.chromium.net.impl.CronetUrlRequest$Natives */
    /* loaded from: classes16.dex */
    public interface Natives {
        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetURLRequestAdapter")
        /* renamed from: addRequestHeader */
        boolean mo154187x3c42dedb(long j17, org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd, java.lang.String str, java.lang.String str2);

        /* renamed from: createRequestAdapter */
        long mo154188x21b1ddc(org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd, long j17, java.lang.String str, int i17, boolean z17, boolean z18, boolean z19, int i18, boolean z27, int i19, int i27, long j18);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetURLRequestAdapter")
        /* renamed from: destroy */
        void mo154189x5cd39ffa(long j17, org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd, boolean z17);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetURLRequestAdapter")
        /* renamed from: followDeferredRedirect */
        void mo154190x989912ac(long j17, org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetURLRequestAdapter")
        /* renamed from: getStatus */
        void mo154191x2fe4f2e8(long j17, org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd, org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.UrlRequestStatusListener urlRequestStatusListener);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetURLRequestAdapter")
        /* renamed from: readData */
        boolean mo154192xcc430260(long j17, org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd, java.nio.ByteBuffer byteBuffer, int i17, int i18);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetURLRequestAdapter")
        /* renamed from: setHttpMethod */
        boolean mo154193x492a458b(long j17, org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd, java.lang.String str);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetURLRequestAdapter")
        /* renamed from: start */
        void mo154194x68ac462(long j17, org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd);
    }

    /* renamed from: org.chromium.net.impl.CronetUrlRequest$OnReadCompletedRunnable */
    /* loaded from: classes16.dex */
    public final class OnReadCompletedRunnable implements java.lang.Runnable {

        /* renamed from: mByteBuffer */
        java.nio.ByteBuffer f74696xdcc5f3b5;

        @Override // java.lang.Runnable
        public void run() {
            org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.m154180x7652a7c6();
            java.nio.ByteBuffer byteBuffer = this.f74696xdcc5f3b5;
            this.f74696xdcc5f3b5 = null;
            try {
                synchronized (org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.f74677x103bdc6d) {
                    if (org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.m154162x415915f6()) {
                        return;
                    }
                    org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.f74678x2fd2b155 = true;
                    org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.UrlRequestCallback urlRequestCallback = org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.f74646x1ab9c7d2;
                    org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd = org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this;
                    urlRequestCallback.mo153675x6da909b6(c29609x93734ddd, c29609x93734ddd.f74668xed58fd9c, byteBuffer);
                }
            } catch (java.lang.Exception e17) {
                org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.m154166x21c9196b(e17);
            }
        }

        private OnReadCompletedRunnable() {
        }
    }

    public C29609x93734ddd(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12, java.lang.String str, int i17, org.p3343x72743996.net.AbstractC29563x9a627640.Callback callback, java.util.concurrent.Executor executor, java.util.Collection<java.lang.Object> collection, boolean z17, boolean z18, boolean z19, boolean z27, int i18, boolean z28, int i19, org.p3343x72743996.net.AbstractC29554xec05c04f.Listener listener, int i27, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f74675xe999d61f = arrayList;
        this.f74667xc777efc4 = new org.p3343x72743996.net.p3358x316220.C29609x93734ddd.HeadersList();
        java.util.Objects.requireNonNull(str, "URL is required");
        java.util.Objects.requireNonNull(callback, "Listener is required");
        java.util.Objects.requireNonNull(executor, "Executor is required");
        this.f74645x83a489d8 = z19;
        this.f74665xd0c7b5ed = c29611x38ff9d12;
        this.f74647xe67537a7 = c29611x38ff9d12.m154211xce59fad0();
        this.f74656xe041c5d = c29611x38ff9d12.m154212xc5e34e23();
        this.f74655x101d77d8 = str;
        arrayList.add(str);
        this.f74661xdf862131 = m154157x98d4ef20(i17);
        this.f74646x1ab9c7d2 = new org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.UrlRequestCallback(callback);
        this.f74651x9ec3a060 = executor;
        this.f74664xe5e7ac62 = collection;
        this.f74648x5b3e4687 = z17;
        this.f74649x189418d5 = z18;
        this.f74671x9e3d54f7 = z27;
        this.f74670xba73b36b = i18;
        this.f74673xa0618c81 = z28;
        this.f74672xba73b821 = i19;
        this.f74666x89f23cc8 = listener != null ? new org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.RequestFinishedInfoListener(listener) : null;
        this.f74653xcb208ba4 = m154156xa9b7869e(i27);
        this.f74658xec9e289 = j17;
    }

    /* renamed from: buildCronetTrafficInfo */
    private org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd.CronetTrafficInfo m154154xfa459b80() {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> emptyMap;
        java.lang.String str;
        boolean z17;
        int i17;
        long m154160x498d66e7;
        long max;
        long m154159x498d66e7;
        long max2;
        org.p3343x72743996.net.p3358x316220.C29632xf92aeebe c29632xf92aeebe = this.f74668xed58fd9c;
        if (c29632xf92aeebe != null) {
            emptyMap = c29632xf92aeebe.mo153680x70925e9b();
            java.lang.String mo153684xb7ab1854 = this.f74668xed58fd9c.mo153684xb7ab1854();
            int mo153682xea30509d = this.f74668xed58fd9c.mo153682xea30509d();
            z17 = this.f74668xed58fd9c.mo153689x8368656b();
            str = mo153684xb7ab1854;
            i17 = mo153682xea30509d;
        } else {
            emptyMap = java.util.Collections.emptyMap();
            str = "";
            z17 = false;
            i17 = 0;
        }
        long longValue = this.f74657xd7117396.mo153646x92817c79().longValue();
        if (z17 && longValue == 0) {
            m154160x498d66e7 = 0;
            max = 0;
        } else {
            m154160x498d66e7 = m154160x498d66e7(this.f74667xc777efc4);
            max = java.lang.Math.max(0L, longValue - m154160x498d66e7);
        }
        long longValue2 = this.f74657xd7117396.mo153640x9feeaf50().longValue();
        if (z17 && longValue2 == 0) {
            m154159x498d66e7 = 0;
            max2 = 0;
        } else {
            m154159x498d66e7 = m154159x498d66e7(emptyMap);
            max2 = java.lang.Math.max(0L, longValue2 - m154159x498d66e7);
        }
        return new org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd.CronetTrafficInfo(m154160x498d66e7, max, m154159x498d66e7, max2, i17, (this.f74657xd7117396.mo153642xadf7b589() == null || this.f74657xd7117396.mo153643x20a7fceb() == null) ? java.time.Duration.ofSeconds(0L) : java.time.Duration.ofMillis(this.f74657xd7117396.mo153643x20a7fceb().getTime() - this.f74657xd7117396.mo153642xadf7b589().getTime()), (this.f74657xd7117396.mo153642xadf7b589() == null || this.f74657xd7117396.mo153641xf07697c2() == null) ? java.time.Duration.ofSeconds(0L) : java.time.Duration.ofMillis(this.f74657xd7117396.mo153641xf07697c2().getTime() - this.f74657xd7117396.mo153642xadf7b589().getTime()), str, this.f74662xb3f4d167, this.f74663x2ed660bf);
    }

    /* renamed from: checkNotStarted */
    private void m154155x8d280156() {
        synchronized (this.f74677x103bdc6d) {
            if (this.f74669x2d03f354 || m154162x415915f6()) {
                throw new java.lang.IllegalStateException("Request is already started.");
            }
        }
    }

    /* renamed from: convertIdempotency */
    private static int m154156xa9b7869e(int i17) {
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                return 0;
            }
        }
        return i18;
    }

    /* renamed from: convertRequestPriority */
    private static int m154157x98d4ef20(int i17) {
        if (i17 == 0) {
            return 1;
        }
        if (i17 == 1) {
            return 2;
        }
        if (i17 != 2) {
            return i17 != 4 ? 4 : 5;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: destroyRequestAdapterLocked */
    public void m154158xccadfc04(int i17) {
        this.f74652x692cab23 = i17;
        if (this.f74676xe71a8422 == 0) {
            return;
        }
        this.f74665xd0c7b5ed.m154217xd847e849();
        org.p3343x72743996.net.p3358x316220.C29614xf7132c88.get().mo154189x5cd39ffa(this.f74676xe71a8422, this, i17 == 2);
        this.f74676xe71a8422 = 0L;
    }

    /* renamed from: estimateHeadersSizeInBytes */
    public static long m154159x498d66e7(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        long j17 = 0;
        if (map == null) {
            return 0L;
        }
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                j17 += r3.length();
            }
            if (entry.getValue() != null) {
                while (entry.getValue().iterator().hasNext()) {
                    j17 += r2.next().length();
                }
            }
        }
        return j17;
    }

    /* renamed from: failWithException */
    private void m154161x7c2017ab(org.p3343x72743996.net.AbstractC29501x119930f2 abstractC29501x119930f2) {
        synchronized (this.f74677x103bdc6d) {
            if (m154162x415915f6()) {
                return;
            }
            this.f74650xd3071a62 = abstractC29501x119930f2;
            m154158xccadfc04(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isDoneLocked */
    public boolean m154162x415915f6() {
        return this.f74669x2d03f354 && this.f74676xe71a8422 == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$maybeReportMetrics$0 */
    public /* synthetic */ void m154163x9ac098f0() {
        this.f74665xd0c7b5ed.m154218x1d116842();
    }

    /* renamed from: mapUrlRequestErrorToApiErrorCode */
    private int m154164xfe575722(int i17) {
        switch (i17) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            default:
                org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.f74698x3f3d67df, "Unknown error code: " + i17);
                return i17;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: maybeReportMetrics */
    public void m154165x96932d67() {
        final org.p3343x72743996.net.p3358x316220.C29627xdcc09601 c29627xdcc09601 = new org.p3343x72743996.net.p3358x316220.C29627xdcc09601(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.m154163x9ac098f0();
            }
        });
        try {
            if (this.f74657xd7117396 == null) {
                c29627xdcc09601.m154260x23e5cc93();
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                try {
                    this.f74656xe041c5d.mo154092x26c6456a(this.f74647xe67537a7, m154154xfa459b80());
                } catch (java.lang.RuntimeException e17) {
                    org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.f74698x3f3d67df, "Error while trying to log CronetTrafficInfo: ", (java.lang.Throwable) e17);
                }
            }
            final org.p3343x72743996.net.p3358x316220.C29628xf7a1d70f c29628xf7a1d70f = new org.p3343x72743996.net.p3358x316220.C29628xf7a1d70f(this.f74655x101d77d8, this.f74664xe5e7ac62, this.f74657xd7117396, this.f74652x692cab23, this.f74668xed58fd9c, this.f74650xd3071a62);
            this.f74665xd0c7b5ed.m154220x8d3cec4d(c29628xf7a1d70f, c29627xdcc09601);
            if (this.f74666x89f23cc8 != null) {
                c29627xdcc09601.m154261xb0268b6f();
                try {
                    this.f74666x89f23cc8.mo153632xf5a03649().execute(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.9
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                try {
                                    org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.f74666x89f23cc8.mo153633x1d116842(c29628xf7a1d70f);
                                } catch (java.lang.Exception e18) {
                                    org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.f74698x3f3d67df, "Exception thrown from request finished listener", (java.lang.Throwable) e18);
                                }
                            } finally {
                                c29627xdcc09601.m154260x23e5cc93();
                            }
                        }
                    });
                } catch (java.util.concurrent.RejectedExecutionException e18) {
                    org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.f74698x3f3d67df, "Exception posting task to executor", (java.lang.Throwable) e18);
                    c29627xdcc09601.m154260x23e5cc93();
                }
            }
            c29627xdcc09601.m154260x23e5cc93();
        } catch (java.lang.Throwable th6) {
            c29627xdcc09601.m154260x23e5cc93();
            throw th6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCallbackException */
    public void m154166x21c9196b(java.lang.Exception exc) {
        org.p3343x72743996.net.p3358x316220.C29594x82a39eaa c29594x82a39eaa = new org.p3343x72743996.net.p3358x316220.C29594x82a39eaa("Exception received from UrlRequest.Callback", exc);
        org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.f74698x3f3d67df, "Exception in CalledByNative method", (java.lang.Throwable) exc);
        m154161x7c2017ab(c29594x82a39eaa);
    }

    /* renamed from: onCanceled */
    private void m154167x9dc2a798() {
        m154176x21a23c93(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.UrlRequestCallback urlRequestCallback = org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.f74646x1ab9c7d2;
                    org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd = org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this;
                    urlRequestCallback.mo153673x9dc2a798(c29609x93734ddd, c29609x93734ddd.f74668xed58fd9c);
                } catch (java.lang.Exception e17) {
                    org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.f74698x3f3d67df, "Exception in onCanceled method", (java.lang.Throwable) e17);
                }
                org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.m154165x96932d67();
            }
        });
    }

    /* renamed from: onError */
    private void m154168xaf8aa769(int i17, int i18, int i19, java.lang.String str, long j17) {
        org.p3343x72743996.net.p3358x316220.C29632xf92aeebe c29632xf92aeebe = this.f74668xed58fd9c;
        if (c29632xf92aeebe != null) {
            c29632xf92aeebe.m154263x7b84bbc4(j17);
        }
        if (i17 == 10 || i17 == 3) {
            m154161x7c2017ab(new org.p3343x72743996.net.p3358x316220.C29626x11304951("Exception in CronetUrlRequest: " + str, i17, i18, i19));
        } else {
            m154161x7c2017ab(new org.p3343x72743996.net.p3358x316220.C29623xc2436ba1("Exception in CronetUrlRequest: " + str, m154164xfe575722(i17), i18));
        }
    }

    /* renamed from: onMetricsCollected */
    private void m154169x208909c5(long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, long j39, long j47, long j48, long j49, long j57, boolean z17, long j58, long j59, boolean z18, boolean z19) {
        synchronized (this.f74677x103bdc6d) {
            if (this.f74657xd7117396 != null) {
                throw new java.lang.IllegalStateException("Metrics collection should only happen once.");
            }
            this.f74657xd7117396 = new org.p3343x72743996.net.p3358x316220.C29606x8d57ee26(j17, j18, j19, j27, j28, j29, j37, j38, j39, j47, j48, j49, j57, z17, j58, j59);
            this.f74662xb3f4d167 = z18;
            this.f74663x2ed660bf = z19;
        }
    }

    /* renamed from: onNativeAdapterDestroyed */
    private void m154170xe6915a80() {
        synchronized (this.f74677x103bdc6d) {
            java.lang.Runnable runnable = this.f74659x9c642a59;
            if (runnable != null) {
                runnable.run();
            }
            if (this.f74650xd3071a62 == null) {
                return;
            }
            try {
                this.f74651x9ec3a060.execute(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.8
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.UrlRequestCallback urlRequestCallback = org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.f74646x1ab9c7d2;
                            org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd = org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this;
                            urlRequestCallback.mo153674x428b6afc(c29609x93734ddd, c29609x93734ddd.f74668xed58fd9c, org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.f74650xd3071a62);
                        } catch (java.lang.Exception e17) {
                            org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.f74698x3f3d67df, "Exception in onFailed method", (java.lang.Throwable) e17);
                        }
                        org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.m154165x96932d67();
                    }
                });
            } catch (java.util.concurrent.RejectedExecutionException e17) {
                org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.f74698x3f3d67df, "Exception posting task to executor", (java.lang.Throwable) e17);
            }
        }
    }

    /* renamed from: onReadCompleted */
    private void m154171x6da909b6(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, long j17) {
        this.f74668xed58fd9c.m154263x7b84bbc4(j17);
        if (byteBuffer.position() != i18 || byteBuffer.limit() != i19) {
            m154161x7c2017ab(new org.p3343x72743996.net.p3358x316220.C29600x4ef63e32("ByteBuffer modified externally during read", null));
            return;
        }
        if (this.f74660xe4c4f6ae == null) {
            this.f74660xe4c4f6ae = new org.p3343x72743996.net.p3358x316220.C29609x93734ddd.OnReadCompletedRunnable();
        }
        org.p3343x72743996.net.p3358x316220.C29609x93734ddd.OnReadCompletedRunnable onReadCompletedRunnable = this.f74660xe4c4f6ae;
        onReadCompletedRunnable.f74696xdcc5f3b5 = byteBuffer;
        m154176x21a23c93(onReadCompletedRunnable);
    }

    /* renamed from: onRedirectReceived */
    private void m154172x4d4e5ddc(final java.lang.String str, int i17, java.lang.String str2, java.lang.String[] strArr, boolean z17, java.lang.String str3, java.lang.String str4, long j17) {
        final org.p3343x72743996.net.p3358x316220.C29632xf92aeebe m154177xde5d9023 = m154177xde5d9023(i17, str2, strArr, z17, str3, str4, j17);
        this.f74675xe999d61f.add(str);
        m154176x21a23c93(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.3
            @Override // java.lang.Runnable
            public void run() {
                org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.m154180x7652a7c6();
                synchronized (org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.f74677x103bdc6d) {
                    if (org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.m154162x415915f6()) {
                        return;
                    }
                    org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.f74679xbf5a581b = true;
                    try {
                        org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.f74646x1ab9c7d2.mo153676x4d4e5ddc(org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this, m154177xde5d9023, str);
                    } catch (java.lang.Exception e17) {
                        org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.m154166x21c9196b(e17);
                    }
                }
            }
        });
    }

    /* renamed from: onResponseStarted */
    private void m154173x5d21f921(int i17, java.lang.String str, java.lang.String[] strArr, boolean z17, java.lang.String str2, java.lang.String str3, long j17) {
        this.f74668xed58fd9c = m154177xde5d9023(i17, str, strArr, z17, str2, str3, j17);
        m154176x21a23c93(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.4
            @Override // java.lang.Runnable
            public void run() {
                org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.m154180x7652a7c6();
                synchronized (org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.f74677x103bdc6d) {
                    if (org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.m154162x415915f6()) {
                        return;
                    }
                    org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.f74678x2fd2b155 = true;
                    try {
                        org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.UrlRequestCallback urlRequestCallback = org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.f74646x1ab9c7d2;
                        org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd = org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this;
                        urlRequestCallback.mo153677x5d21f921(c29609x93734ddd, c29609x93734ddd.f74668xed58fd9c);
                    } catch (java.lang.Exception e17) {
                        org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.m154166x21c9196b(e17);
                    }
                }
            }
        });
    }

    /* renamed from: onStatus */
    private void m154174x59c2a6b1(final org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.UrlRequestStatusListener urlRequestStatusListener, final int i17) {
        m154176x21a23c93(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.7
            @Override // java.lang.Runnable
            public void run() {
                urlRequestStatusListener.mo153679x59c2a6b1(org.p3343x72743996.net.p3358x316220.AbstractC29629x1bdcd131.m154262x10eead8(i17));
            }
        });
    }

    /* renamed from: onSucceeded */
    private void m154175x3688ff42(long j17) {
        this.f74668xed58fd9c.m154263x7b84bbc4(j17);
        m154176x21a23c93(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.5
            @Override // java.lang.Runnable
            public void run() {
                synchronized (org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.f74677x103bdc6d) {
                    if (org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.m154162x415915f6()) {
                        return;
                    }
                    org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.m154158xccadfc04(0);
                    try {
                        org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.UrlRequestCallback urlRequestCallback = org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.f74646x1ab9c7d2;
                        org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd = org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this;
                        urlRequestCallback.mo153678x3688ff42(c29609x93734ddd, c29609x93734ddd.f74668xed58fd9c);
                    } catch (java.lang.Exception e17) {
                        org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.f74698x3f3d67df, "Exception in onSucceeded method", (java.lang.Throwable) e17);
                    }
                    org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.m154165x96932d67();
                }
            }
        });
    }

    /* renamed from: postTaskToExecutor */
    private void m154176x21a23c93(java.lang.Runnable runnable) {
        try {
            this.f74651x9ec3a060.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.f74698x3f3d67df, "Exception posting task to executor", (java.lang.Throwable) e17);
            m154161x7c2017ab(new org.p3343x72743996.net.p3358x316220.C29600x4ef63e32("Exception posting task to executor", e17));
        }
    }

    /* renamed from: prepareResponseInfoOnNetworkThread */
    private org.p3343x72743996.net.p3358x316220.C29632xf92aeebe m154177xde5d9023(int i17, java.lang.String str, java.lang.String[] strArr, boolean z17, java.lang.String str2, java.lang.String str3, long j17) {
        org.p3343x72743996.net.p3358x316220.C29609x93734ddd.HeadersList headersList = new org.p3343x72743996.net.p3358x316220.C29609x93734ddd.HeadersList();
        for (int i18 = 0; i18 < strArr.length; i18 += 2) {
            headersList.add(new java.util.AbstractMap.SimpleImmutableEntry(strArr[i18], strArr[i18 + 1]));
        }
        return new org.p3343x72743996.net.p3358x316220.C29632xf92aeebe(new java.util.ArrayList(this.f74675xe999d61f), i17, str, headersList, z17, str2, str3, j17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startInternalLocked */
    public void m154178x3316129() {
        org.p3343x72743996.net.p3358x316220.C29614xf7132c88.get().mo154194x68ac462(this.f74676xe71a8422, this);
    }

    @Override // org.p3343x72743996.net.p3358x316220.AbstractC29629x1bdcd131
    /* renamed from: addHeader */
    public void mo154179xec6c8a8e(java.lang.String str, java.lang.String str2) {
        m154155x8d280156();
        java.util.Objects.requireNonNull(str, "Invalid header name.");
        java.util.Objects.requireNonNull(str2, "Invalid header value.");
        this.f74667xc777efc4.add(new java.util.AbstractMap.SimpleImmutableEntry(str, str2));
    }

    @Override // org.p3343x72743996.net.AbstractC29563x9a627640
    /* renamed from: cancel */
    public void mo153666xae7a2e7a() {
        synchronized (this.f74677x103bdc6d) {
            if (!m154162x415915f6() && this.f74669x2d03f354) {
                m154158xccadfc04(2);
            }
        }
    }

    /* renamed from: checkCallingThread */
    public void m154180x7652a7c6() {
        if (!this.f74645x83a489d8 && this.f74665xd0c7b5ed.m154216x49d9d0ce(java.lang.Thread.currentThread())) {
            throw new org.p3343x72743996.net.C29522xbce39852();
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29563x9a627640
    /* renamed from: followRedirect */
    public void mo153667x25da56ad() {
        synchronized (this.f74677x103bdc6d) {
            if (!this.f74679xbf5a581b) {
                throw new java.lang.IllegalStateException("No redirect to follow.");
            }
            this.f74679xbf5a581b = false;
            if (m154162x415915f6()) {
                return;
            }
            org.p3343x72743996.net.p3358x316220.C29614xf7132c88.get().mo154190x989912ac(this.f74676xe71a8422, this);
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29563x9a627640
    /* renamed from: getStatus */
    public void mo153668x2fe4f2e8(org.p3343x72743996.net.AbstractC29563x9a627640.StatusListener statusListener) {
        final org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.UrlRequestStatusListener urlRequestStatusListener = new org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.UrlRequestStatusListener(statusListener);
        synchronized (this.f74677x103bdc6d) {
            if (this.f74676xe71a8422 != 0) {
                org.p3343x72743996.net.p3358x316220.C29614xf7132c88.get().mo154191x2fe4f2e8(this.f74676xe71a8422, this, urlRequestStatusListener);
            } else {
                m154176x21a23c93(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.2
                    @Override // java.lang.Runnable
                    public void run() {
                        urlRequestStatusListener.mo153679x59c2a6b1(-1);
                    }
                });
            }
        }
    }

    /* renamed from: getUrlRequestAdapterForTesting */
    public long m154181x8f517e40() {
        long j17;
        synchronized (this.f74677x103bdc6d) {
            j17 = this.f74676xe71a8422;
        }
        return j17;
    }

    @Override // org.p3343x72743996.net.AbstractC29563x9a627640
    /* renamed from: isDone */
    public boolean mo153669xb9a1ffcc() {
        boolean m154162x415915f6;
        synchronized (this.f74677x103bdc6d) {
            m154162x415915f6 = m154162x415915f6();
        }
        return m154162x415915f6;
    }

    /* renamed from: onUploadException */
    public void m154182x299e636f(java.lang.Throwable th6) {
        org.p3343x72743996.net.p3358x316220.C29594x82a39eaa c29594x82a39eaa = new org.p3343x72743996.net.p3358x316220.C29594x82a39eaa("Exception received from UploadDataProvider", th6);
        org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.f74698x3f3d67df, "Exception in upload method", th6);
        m154161x7c2017ab(c29594x82a39eaa);
    }

    @Override // org.p3343x72743996.net.AbstractC29563x9a627640
    /* renamed from: read */
    public void mo153670x355996(java.nio.ByteBuffer byteBuffer) {
        org.p3343x72743996.net.p3358x316220.C29625x7ccc697b.m154259x4ef375a4(byteBuffer);
        org.p3343x72743996.net.p3358x316220.C29625x7ccc697b.m154258x139c8711(byteBuffer);
        synchronized (this.f74677x103bdc6d) {
            if (!this.f74678x2fd2b155) {
                throw new java.lang.IllegalStateException("Unexpected read attempt.");
            }
            this.f74678x2fd2b155 = false;
            if (m154162x415915f6()) {
                return;
            }
            if (org.p3343x72743996.net.p3358x316220.C29614xf7132c88.get().mo154192xcc430260(this.f74676xe71a8422, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                return;
            }
            this.f74678x2fd2b155 = true;
            throw new java.lang.IllegalArgumentException("Unable to call native read");
        }
    }

    @Override // org.p3343x72743996.net.p3358x316220.AbstractC29629x1bdcd131
    /* renamed from: setHttpMethod */
    public void mo154183x492a458b(java.lang.String str) {
        m154155x8d280156();
        java.util.Objects.requireNonNull(str, "Method is required.");
        this.f74654x46e499d8 = str;
    }

    /* renamed from: setOnDestroyedCallbackForTesting */
    public void m154184xea08e84(java.lang.Runnable runnable) {
        synchronized (this.f74677x103bdc6d) {
            this.f74659x9c642a59 = runnable;
        }
    }

    /* renamed from: setOnDestroyedUploadCallbackForTesting */
    public void m154185x41935865(java.lang.Runnable runnable) {
        this.f74674x18b62b38.m154144xea08e84(runnable);
    }

    @Override // org.p3343x72743996.net.p3358x316220.AbstractC29629x1bdcd131
    /* renamed from: setUploadDataProvider */
    public void mo154186xc9755c5e(org.p3343x72743996.net.AbstractC29560x8cb1347c abstractC29560x8cb1347c, java.util.concurrent.Executor executor) {
        java.util.Objects.requireNonNull(abstractC29560x8cb1347c, "Invalid UploadDataProvider.");
        if (this.f74654x46e499d8 == null) {
            this.f74654x46e499d8 = "POST";
        }
        this.f74674x18b62b38 = new org.p3343x72743996.net.p3358x316220.C29607x7a6892a8(abstractC29560x8cb1347c, executor, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v26, types: [org.chromium.net.impl.CronetUrlRequest$Natives] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [org.chromium.net.impl.CronetUrlRequest] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [org.chromium.net.impl.CronetUrlRequest] */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // org.p3343x72743996.net.AbstractC29563x9a627640
    /* renamed from: start */
    public void mo153671x68ac462() {
        java.lang.Object obj;
        ?? r76;
        ?? r17;
        java.util.Map.Entry<java.lang.String, java.lang.String> next;
        java.lang.Object obj2 = this.f74677x103bdc6d;
        synchronized (obj2) {
            try {
                try {
                    m154155x8d280156();
                    try {
                        obj = obj2;
                    } catch (java.lang.RuntimeException e17) {
                        e = e17;
                        r76 = this;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    obj = obj2;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
            try {
                r76 = this;
                try {
                    r76.f74676xe71a8422 = org.p3343x72743996.net.p3358x316220.C29614xf7132c88.get().mo154188x21b1ddc(this, this.f74665xd0c7b5ed.m154214x7081d256(), this.f74655x101d77d8, this.f74661xdf862131, this.f74648x5b3e4687, this.f74649x189418d5, this.f74671x9e3d54f7, this.f74670xba73b36b, this.f74673xa0618c81, this.f74672xba73b821, this.f74653xcb208ba4, this.f74658xec9e289);
                    r76.f74665xd0c7b5ed.m154219x4f165eb1();
                    if (r76.f74654x46e499d8 != null && !org.p3343x72743996.net.p3358x316220.C29614xf7132c88.get().mo154193x492a458b(r76.f74676xe71a8422, r76, r76.f74654x46e499d8)) {
                        throw new java.lang.IllegalArgumentException("Invalid http method " + r76.f74654x46e499d8);
                    }
                    java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = r76.f74667xc777efc4.iterator();
                    boolean z17 = false;
                    do {
                        r17 = it.hasNext();
                        if (r17 == 0) {
                            org.p3343x72743996.net.p3358x316220.C29607x7a6892a8 c29607x7a6892a8 = r76.f74674x18b62b38;
                            if (c29607x7a6892a8 == null) {
                                r76.f74669x2d03f354 = true;
                                m154178x3316129();
                                return;
                            }
                            try {
                                if (!z17) {
                                    throw new java.lang.IllegalArgumentException("Requests with upload data must have a Content-Type.");
                                }
                                r76.f74669x2d03f354 = true;
                                c29607x7a6892a8.m154141x21a23c93(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.f74674x18b62b38.m154139xc0209139();
                                        synchronized (org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.f74677x103bdc6d) {
                                            if (org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.m154162x415915f6()) {
                                                return;
                                            }
                                            org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.f74674x18b62b38.m154137xe5cbffe1(org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.f74676xe71a8422);
                                            org.p3343x72743996.net.p3358x316220.C29609x93734ddd.this.m154178x3316129();
                                        }
                                    }
                                });
                                return;
                            } catch (java.lang.RuntimeException e18) {
                                e = e18;
                                r76.m154158xccadfc04(r17);
                                r76.f74665xd0c7b5ed.m154218x1d116842();
                                throw e;
                            }
                        }
                        next = it.next();
                        if (next.getKey().equalsIgnoreCase("Content-Type") && !next.getValue().isEmpty()) {
                            z17 = true;
                        }
                    } while (org.p3343x72743996.net.p3358x316220.C29614xf7132c88.get().mo154187x3c42dedb(r76.f74676xe71a8422, this, next.getKey(), next.getValue()));
                    throw new java.lang.IllegalArgumentException("Invalid header " + next.getKey() + "=" + next.getValue());
                } catch (java.lang.RuntimeException e19) {
                    e = e19;
                    r76 = r76;
                    r17 = 1;
                    r76.m154158xccadfc04(r17);
                    r76.f74665xd0c7b5ed.m154218x1d116842();
                    throw e;
                }
            } catch (java.lang.RuntimeException e27) {
                e = e27;
                r17 = 1;
                r76 = this;
            } catch (java.lang.Throwable th8) {
                th = th8;
                throw th;
            }
        }
    }

    /* renamed from: estimateHeadersSizeInBytes */
    public static long m154160x498d66e7(org.p3343x72743996.net.p3358x316220.C29609x93734ddd.HeadersList headersList) {
        long j17 = 0;
        if (headersList == null) {
            return 0L;
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = headersList.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<java.lang.String, java.lang.String> next = it.next();
            if (next.getKey() != null) {
                j17 += r3.length();
            }
            if (next.getValue() != null) {
                j17 += next.getValue().length();
            }
        }
        return j17;
    }
}
