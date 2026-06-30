package org.p3343x72743996.net.p3358x316220;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "cronet")
/* renamed from: org.chromium.net.impl.CronetBidirectionalStream */
/* loaded from: classes16.dex */
public class C29595x3307af86 extends org.p3343x72743996.net.AbstractC29506xd5b5287b {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f74462x7118e671 = false;

    /* renamed from: mCallback */
    private final org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.BidirectionalStreamCallback f74463x1ab9c7d2;

    /* renamed from: mDelayRequestHeadersUntilFirstFlush */
    private final boolean f74464xcdae73c5;

    /* renamed from: mEndOfStreamWritten */
    private boolean f74465xb747e9d2;

    /* renamed from: mException */
    private org.p3343x72743996.net.AbstractC29501x119930f2 f74466xd3071a62;

    /* renamed from: mExecutor */
    private final java.util.concurrent.Executor f74467x9ec3a060;

    /* renamed from: mInflightDoneCallbackCount */
    private org.p3343x72743996.net.p3358x316220.C29627xdcc09601 f74469x8893da26;

    /* renamed from: mInitialMethod */
    private final java.lang.String f74470x46e499d8;

    /* renamed from: mInitialPriority */
    private final int f74471xf518e0db;

    /* renamed from: mInitialUrl */
    private final java.lang.String f74472x101d77d8;

    /* renamed from: mMetrics */
    private org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics f74473xd7117396;

    /* renamed from: mNativeStream */
    private long f74474x26c4f784;

    /* renamed from: mNetworkHandle */
    private final long f74476xec9e289;

    /* renamed from: mOnDestroyedCallbackForTesting */
    private java.lang.Runnable f74477x9c642a59;

    /* renamed from: mOnReadCompletedTask */
    private org.p3343x72743996.net.p3358x316220.C29595x3307af86.OnReadCompletedRunnable f74478xe4c4f6ae;

    /* renamed from: mRequestAnnotations */
    private final java.util.Collection<java.lang.Object> f74481xe5e7ac62;

    /* renamed from: mRequestContext */
    private final org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 f74482xd0c7b5ed;

    /* renamed from: mRequestHeaders */
    private final java.lang.String[] f74483xc777efc4;

    /* renamed from: mRequestHeadersSent */
    private boolean f74484x66d9b17c;

    /* renamed from: mResponseInfo */
    private org.p3343x72743996.net.p3358x316220.C29632xf92aeebe f74485xed58fd9c;

    /* renamed from: mTrafficStatsTag */
    private final int f74486xba73b36b;

    /* renamed from: mTrafficStatsTagSet */
    private final boolean f74487x9e3d54f7;

    /* renamed from: mTrafficStatsUid */
    private final int f74488xba73b821;

    /* renamed from: mTrafficStatsUidSet */
    private final boolean f74489xa0618c81;

    /* renamed from: mNativeStreamLock */
    private final java.lang.Object f74475xc4d9cecf = new java.lang.Object();

    /* renamed from: mReadState */
    private int f74480x37b052ae = 0;

    /* renamed from: mWriteState */
    private int f74490xb59e883f = 0;

    /* renamed from: mPendingData */
    private java.util.LinkedList<java.nio.ByteBuffer> f74479xec615b34 = new java.util.LinkedList<>();

    /* renamed from: mFlushData */
    private java.util.LinkedList<java.nio.ByteBuffer> f74468x584ac6e1 = new java.util.LinkedList<>();

    /* renamed from: org.chromium.net.impl.CronetBidirectionalStream$Natives */
    /* loaded from: classes16.dex */
    public interface Natives {
        /* renamed from: createBidirectionalStream */
        long mo154031x28d1ac07(org.p3343x72743996.net.p3358x316220.C29595x3307af86 c29595x3307af86, long j17, boolean z17, boolean z18, int i17, boolean z19, int i18, long j18);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetBidirectionalStreamAdapter")
        /* renamed from: destroy */
        void mo154032x5cd39ffa(long j17, org.p3343x72743996.net.p3358x316220.C29595x3307af86 c29595x3307af86, boolean z17);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetBidirectionalStreamAdapter")
        /* renamed from: readData */
        boolean mo154033xcc430260(long j17, org.p3343x72743996.net.p3358x316220.C29595x3307af86 c29595x3307af86, java.nio.ByteBuffer byteBuffer, int i17, int i18);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetBidirectionalStreamAdapter")
        /* renamed from: sendRequestHeaders */
        void mo154034xabfbb39f(long j17, org.p3343x72743996.net.p3358x316220.C29595x3307af86 c29595x3307af86);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetBidirectionalStreamAdapter")
        /* renamed from: start */
        int mo154035x68ac462(long j17, org.p3343x72743996.net.p3358x316220.C29595x3307af86 c29595x3307af86, java.lang.String str, int i17, java.lang.String str2, java.lang.String[] strArr, boolean z17);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetBidirectionalStreamAdapter")
        /* renamed from: writevData */
        boolean mo154036xdb43f4c1(long j17, org.p3343x72743996.net.p3358x316220.C29595x3307af86 c29595x3307af86, java.nio.ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z17);
    }

    /* renamed from: org.chromium.net.impl.CronetBidirectionalStream$OnReadCompletedRunnable */
    /* loaded from: classes16.dex */
    public final class OnReadCompletedRunnable implements java.lang.Runnable {

        /* renamed from: mByteBuffer */
        java.nio.ByteBuffer f74499xdcc5f3b5;

        /* renamed from: mEndOfStream */
        boolean f74500x1043f85;

        @Override // java.lang.Runnable
        public void run() {
            try {
                java.nio.ByteBuffer byteBuffer = this.f74499xdcc5f3b5;
                this.f74499xdcc5f3b5 = null;
                synchronized (org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74475xc4d9cecf) {
                    if (org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.m154013x415915f6()) {
                        return;
                    }
                    boolean z17 = false;
                    if (this.f74500x1043f85) {
                        org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74480x37b052ae = 4;
                        if (org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74490xb59e883f == 10) {
                            z17 = true;
                        }
                    } else {
                        org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74480x37b052ae = 2;
                    }
                    org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.BidirectionalStreamCallback bidirectionalStreamCallback = org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74463x1ab9c7d2;
                    org.p3343x72743996.net.p3358x316220.C29595x3307af86 c29595x3307af86 = org.p3343x72743996.net.p3358x316220.C29595x3307af86.this;
                    bidirectionalStreamCallback.mo153113x6da909b6(c29595x3307af86, c29595x3307af86.f74485xed58fd9c, byteBuffer, this.f74500x1043f85);
                    if (z17) {
                        org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.m154014x5671012c();
                    }
                }
            } catch (java.lang.Exception e17) {
                org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.m154015x21c9196b(e17);
            }
        }

        private OnReadCompletedRunnable() {
        }
    }

    /* renamed from: org.chromium.net.impl.CronetBidirectionalStream$OnWriteCompletedRunnable */
    /* loaded from: classes16.dex */
    public final class OnWriteCompletedRunnable implements java.lang.Runnable {

        /* renamed from: mByteBuffer */
        private java.nio.ByteBuffer f74502xdcc5f3b5;

        /* renamed from: mEndOfStream */
        private final boolean f74503x1043f85;

        public OnWriteCompletedRunnable(java.nio.ByteBuffer byteBuffer, boolean z17) {
            this.f74502xdcc5f3b5 = byteBuffer;
            this.f74503x1043f85 = z17;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                java.nio.ByteBuffer byteBuffer = this.f74502xdcc5f3b5;
                this.f74502xdcc5f3b5 = null;
                synchronized (org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74475xc4d9cecf) {
                    if (org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.m154013x415915f6()) {
                        return;
                    }
                    boolean z17 = false;
                    if (this.f74503x1043f85) {
                        org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74490xb59e883f = 10;
                        if (org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74480x37b052ae == 4) {
                            z17 = true;
                        }
                    }
                    org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.BidirectionalStreamCallback bidirectionalStreamCallback = org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74463x1ab9c7d2;
                    org.p3343x72743996.net.p3358x316220.C29595x3307af86 c29595x3307af86 = org.p3343x72743996.net.p3358x316220.C29595x3307af86.this;
                    bidirectionalStreamCallback.mo153118x8789d0eb(c29595x3307af86, c29595x3307af86.f74485xed58fd9c, byteBuffer, this.f74503x1043f85);
                    if (z17) {
                        org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.m154014x5671012c();
                    }
                }
            } catch (java.lang.Exception e17) {
                org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.m154015x21c9196b(e17);
            }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: org.chromium.net.impl.CronetBidirectionalStream$State */
    /* loaded from: classes6.dex */
    public @interface State {

        /* renamed from: CANCELED */
        public static final int f74505x274e7499 = 5;

        /* renamed from: ERROR */
        public static final int f74506x3f2d9e8 = 6;

        /* renamed from: NOT_STARTED */
        public static final int f74507xad133ed5 = 0;

        /* renamed from: READING */
        public static final int f74508x6b315a6c = 3;

        /* renamed from: READING_DONE */
        public static final int f74509x3d3d1d75 = 4;

        /* renamed from: STARTED */
        public static final int f74510xb9b6cc61 = 1;

        /* renamed from: SUCCESS */
        public static final int f74511xbb80cbe3 = 7;

        /* renamed from: WAITING_FOR_FLUSH */
        public static final int f74512xeb53dc3c = 8;

        /* renamed from: WAITING_FOR_READ */
        public static final int f74513xc58c2d3e = 2;

        /* renamed from: WRITING */
        public static final int f74514x8a5784bc = 9;

        /* renamed from: WRITING_DONE */
        public static final int f74515xd9e4e525 = 10;
    }

    public C29595x3307af86(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12, java.lang.String str, int i17, org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback callback, java.util.concurrent.Executor executor, java.lang.String str2, java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list, boolean z17, java.util.Collection<java.lang.Object> collection, boolean z18, int i18, boolean z19, int i19, long j17) {
        this.f74482xd0c7b5ed = c29611x38ff9d12;
        this.f74472x101d77d8 = str;
        this.f74471xf518e0db = m154007x2f2421d7(i17);
        this.f74463x1ab9c7d2 = new org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.BidirectionalStreamCallback(callback);
        this.f74467x9ec3a060 = executor;
        this.f74470x46e499d8 = str2;
        this.f74483xc777efc4 = m154027x3d10c337(list);
        this.f74464xcdae73c5 = z17;
        this.f74481xe5e7ac62 = collection;
        this.f74487x9e3d54f7 = z18;
        this.f74486xba73b36b = i18;
        this.f74489xa0618c81 = z19;
        this.f74488xba73b821 = i19;
        this.f74476xec9e289 = j17;
    }

    /* renamed from: convertStreamPriority */
    private static int m154007x2f2421d7(int i17) {
        if (i17 == 0) {
            return 1;
        }
        if (i17 == 1) {
            return 2;
        }
        if (i17 == 2) {
            return 3;
        }
        if (i17 == 3) {
            return 4;
        }
        if (i17 == 4) {
            return 5;
        }
        throw new java.lang.IllegalArgumentException("Invalid stream priority.");
    }

    /* renamed from: destroyNativeStreamLocked */
    private void m154008xfd4319fb(boolean z17) {
        org.p3343x72743996.p3344x2e06d1.Log.i(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.f74698x3f3d67df, "destroyNativeStreamLocked " + toString());
        if (this.f74474x26c4f784 == 0) {
            return;
        }
        org.p3343x72743996.net.p3358x316220.C29597x6b63fe3f.get().mo154032x5cd39ffa(this.f74474x26c4f784, this, z17);
        this.f74482xd0c7b5ed.m154217xd847e849();
        this.f74474x26c4f784 = 0L;
        java.lang.Runnable runnable = this.f74477x9c642a59;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doesMethodAllowWriteData */
    public static boolean m154009x5efb323a(java.lang.String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* renamed from: failWithException */
    private void m154010x7c2017ab(final org.p3343x72743996.net.AbstractC29501x119930f2 abstractC29501x119930f2) {
        m154024x21a23c93(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream.5
            @Override // java.lang.Runnable
            public void run() {
                org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.m154011x6aa4b5dd(abstractC29501x119930f2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: failWithExceptionOnExecutor */
    public void m154011x6aa4b5dd(org.p3343x72743996.net.AbstractC29501x119930f2 abstractC29501x119930f2) {
        this.f74466xd3071a62 = abstractC29501x119930f2;
        synchronized (this.f74475xc4d9cecf) {
            if (m154013x415915f6()) {
                return;
            }
            this.f74490xb59e883f = 6;
            this.f74480x37b052ae = 6;
            m154008xfd4319fb(false);
            try {
                this.f74463x1ab9c7d2.mo153112x428b6afc(this, this.f74485xed58fd9c, abstractC29501x119930f2);
            } catch (java.lang.Exception e17) {
                org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.f74698x3f3d67df, "Exception notifying of failed request", (java.lang.Throwable) e17);
            }
            this.f74469x8893da26.m154260x23e5cc93();
        }
    }

    /* renamed from: headersListFromStrings */
    private static java.util.ArrayList<java.util.Map.Entry<java.lang.String, java.lang.String>> m154012x7095a394(java.lang.String[] strArr) {
        java.util.ArrayList<java.util.Map.Entry<java.lang.String, java.lang.String>> arrayList = new java.util.ArrayList<>(strArr.length / 2);
        for (int i17 = 0; i17 < strArr.length; i17 += 2) {
            arrayList.add(new java.util.AbstractMap.SimpleImmutableEntry(strArr[i17], strArr[i17 + 1]));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isDoneLocked */
    public boolean m154013x415915f6() {
        return this.f74480x37b052ae != 0 && this.f74474x26c4f784 == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: maybeOnSucceededOnExecutor */
    public void m154014x5671012c() {
        synchronized (this.f74475xc4d9cecf) {
            if (m154013x415915f6()) {
                return;
            }
            if (this.f74490xb59e883f == 10 && this.f74480x37b052ae == 4) {
                this.f74490xb59e883f = 7;
                this.f74480x37b052ae = 7;
                m154008xfd4319fb(false);
                try {
                    this.f74463x1ab9c7d2.mo153117x3688ff42(this, this.f74485xed58fd9c);
                } catch (java.lang.Exception e17) {
                    org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.f74698x3f3d67df, "Exception in onSucceeded method", (java.lang.Throwable) e17);
                }
                this.f74469x8893da26.m154260x23e5cc93();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCallbackException */
    public void m154015x21c9196b(java.lang.Exception exc) {
        org.p3343x72743996.net.p3358x316220.C29594x82a39eaa c29594x82a39eaa = new org.p3343x72743996.net.p3358x316220.C29594x82a39eaa("CalledByNative method has thrown an exception", exc);
        org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.f74698x3f3d67df, "Exception in CalledByNative method", (java.lang.Throwable) exc);
        m154011x6aa4b5dd(c29594x82a39eaa);
    }

    /* renamed from: onCanceled */
    private void m154016x9dc2a798() {
        m154024x21a23c93(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.BidirectionalStreamCallback bidirectionalStreamCallback = org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74463x1ab9c7d2;
                    org.p3343x72743996.net.p3358x316220.C29595x3307af86 c29595x3307af86 = org.p3343x72743996.net.p3358x316220.C29595x3307af86.this;
                    bidirectionalStreamCallback.mo153111x9dc2a798(c29595x3307af86, c29595x3307af86.f74485xed58fd9c);
                } catch (java.lang.Exception e17) {
                    org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.f74698x3f3d67df, "Exception in onCanceled method", (java.lang.Throwable) e17);
                }
                org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74469x8893da26.m154260x23e5cc93();
            }
        });
    }

    /* renamed from: onError */
    private void m154017xaf8aa769(int i17, int i18, int i19, java.lang.String str, long j17) {
        org.p3343x72743996.net.p3358x316220.C29632xf92aeebe c29632xf92aeebe = this.f74485xed58fd9c;
        if (c29632xf92aeebe != null) {
            c29632xf92aeebe.m154263x7b84bbc4(j17);
        }
        if (i17 == 10 || i17 == 3) {
            m154010x7c2017ab(new org.p3343x72743996.net.p3358x316220.C29626x11304951("Exception in BidirectionalStream: " + str, i17, i18, i19));
        } else {
            m154010x7c2017ab(new org.p3343x72743996.net.p3358x316220.C29593x90694e64("Exception in BidirectionalStream: " + str, i17, i18));
        }
    }

    /* renamed from: onMetricsCollected */
    private void m154018x208909c5(long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, long j39, long j47, long j48, long j49, long j57, boolean z17, long j58, long j59) {
        synchronized (this.f74475xc4d9cecf) {
            try {
                if (this.f74473xd7117396 != null) {
                    throw new java.lang.IllegalStateException("Metrics collection should only happen once.");
                }
                org.p3343x72743996.net.p3358x316220.C29606x8d57ee26 c29606x8d57ee26 = new org.p3343x72743996.net.p3358x316220.C29606x8d57ee26(j17, j18, j19, j27, j28, j29, j37, j38, j39, j47, j48, j49, j57, z17, j58, j59);
                this.f74473xd7117396 = c29606x8d57ee26;
                int i17 = this.f74480x37b052ae;
                this.f74482xd0c7b5ed.m154220x8d3cec4d(new org.p3343x72743996.net.p3358x316220.C29628xf7a1d70f(this.f74472x101d77d8, this.f74481xe5e7ac62, c29606x8d57ee26, i17 == 7 ? 0 : i17 == 5 ? 2 : 1, this.f74485xed58fd9c, this.f74466xd3071a62), this.f74469x8893da26);
            } finally {
                this.f74469x8893da26.m154260x23e5cc93();
            }
        }
    }

    /* renamed from: onReadCompleted */
    private void m154019x6da909b6(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, long j17) {
        int i27;
        this.f74485xed58fd9c.m154263x7b84bbc4(j17);
        if (byteBuffer.position() != i18 || byteBuffer.limit() != i19) {
            m154010x7c2017ab(new org.p3343x72743996.net.p3358x316220.C29600x4ef63e32("ByteBuffer modified externally during read", null));
            return;
        }
        if (i17 < 0 || (i27 = i18 + i17) > i19) {
            m154010x7c2017ab(new org.p3343x72743996.net.p3358x316220.C29600x4ef63e32("Invalid number of bytes read", null));
            return;
        }
        org.p3343x72743996.net.p3358x316220.C29595x3307af86.OnReadCompletedRunnable onReadCompletedRunnable = this.f74478xe4c4f6ae;
        onReadCompletedRunnable.f74499xdcc5f3b5 = byteBuffer;
        onReadCompletedRunnable.f74500x1043f85 = i17 == 0;
        m154024x21a23c93(onReadCompletedRunnable);
    }

    /* renamed from: onResponseHeadersReceived */
    private void m154020x6c4f027(int i17, java.lang.String str, java.lang.String[] strArr, long j17) {
        try {
            this.f74485xed58fd9c = m154025xde5d9023(i17, str, strArr, j17);
            m154024x21a23c93(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream.2
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74475xc4d9cecf) {
                        if (org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.m154013x415915f6()) {
                            return;
                        }
                        org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74480x37b052ae = 2;
                        try {
                            org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.BidirectionalStreamCallback bidirectionalStreamCallback = org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74463x1ab9c7d2;
                            org.p3343x72743996.net.p3358x316220.C29595x3307af86 c29595x3307af86 = org.p3343x72743996.net.p3358x316220.C29595x3307af86.this;
                            bidirectionalStreamCallback.mo153114x6c4f027(c29595x3307af86, c29595x3307af86.f74485xed58fd9c);
                        } catch (java.lang.Exception e17) {
                            org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.m154015x21c9196b(e17);
                        }
                    }
                }
            });
        } catch (java.lang.Exception unused) {
            m154010x7c2017ab(new org.p3343x72743996.net.p3358x316220.C29600x4ef63e32("Cannot prepare ResponseInfo", null));
        }
    }

    /* renamed from: onResponseTrailersReceived */
    private void m154021x1c98bb01(java.lang.String[] strArr) {
        final org.p3343x72743996.net.p3358x316220.C29632xf92aeebe.HeaderBlockImpl headerBlockImpl = new org.p3343x72743996.net.p3358x316220.C29632xf92aeebe.HeaderBlockImpl(m154012x7095a394(strArr));
        m154024x21a23c93(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74475xc4d9cecf) {
                    if (org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.m154013x415915f6()) {
                        return;
                    }
                    try {
                        org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.BidirectionalStreamCallback bidirectionalStreamCallback = org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74463x1ab9c7d2;
                        org.p3343x72743996.net.p3358x316220.C29595x3307af86 c29595x3307af86 = org.p3343x72743996.net.p3358x316220.C29595x3307af86.this;
                        bidirectionalStreamCallback.mo153115x1c98bb01(c29595x3307af86, c29595x3307af86.f74485xed58fd9c, headerBlockImpl);
                    } catch (java.lang.Exception e17) {
                        org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.m154015x21c9196b(e17);
                    }
                }
            }
        });
    }

    /* renamed from: onStreamReady */
    private void m154022x7cd1d2a4(final boolean z17) {
        m154024x21a23c93(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74475xc4d9cecf) {
                    if (org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.m154013x415915f6()) {
                        return;
                    }
                    org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74484x66d9b17c = z17;
                    org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74480x37b052ae = 2;
                    if (org.p3343x72743996.net.p3358x316220.C29595x3307af86.m154009x5efb323a(org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74470x46e499d8) || !org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74484x66d9b17c) {
                        org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74490xb59e883f = 8;
                    } else {
                        org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74490xb59e883f = 10;
                    }
                    try {
                        org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.f74463x1ab9c7d2.mo153116x7cd1d2a4(org.p3343x72743996.net.p3358x316220.C29595x3307af86.this);
                    } catch (java.lang.Exception e17) {
                        org.p3343x72743996.net.p3358x316220.C29595x3307af86.this.m154015x21c9196b(e17);
                    }
                }
            }
        });
    }

    /* renamed from: onWritevCompleted */
    private void m154023xd0cdd7b5(java.nio.ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z17) {
        boolean z18;
        synchronized (this.f74475xc4d9cecf) {
            if (m154013x415915f6()) {
                return;
            }
            this.f74490xb59e883f = 8;
            if (!this.f74468x584ac6e1.isEmpty()) {
                m154026x3ce830d0();
            }
            for (int i17 = 0; i17 < byteBufferArr.length; i17++) {
                java.nio.ByteBuffer byteBuffer = byteBufferArr[i17];
                if (byteBuffer.position() != iArr[i17] || byteBuffer.limit() != iArr2[i17]) {
                    m154010x7c2017ab(new org.p3343x72743996.net.p3358x316220.C29600x4ef63e32("ByteBuffer modified externally during write", null));
                    return;
                }
                if (z17) {
                    z18 = true;
                    if (i17 == byteBufferArr.length - 1) {
                        m154024x21a23c93(new org.p3343x72743996.net.p3358x316220.C29595x3307af86.OnWriteCompletedRunnable(byteBuffer, z18));
                    }
                }
                z18 = false;
                m154024x21a23c93(new org.p3343x72743996.net.p3358x316220.C29595x3307af86.OnWriteCompletedRunnable(byteBuffer, z18));
            }
        }
    }

    /* renamed from: postTaskToExecutor */
    private void m154024x21a23c93(java.lang.Runnable runnable) {
        try {
            this.f74467x9ec3a060.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.f74698x3f3d67df, "Exception posting task to executor", (java.lang.Throwable) e17);
            synchronized (this.f74475xc4d9cecf) {
                this.f74490xb59e883f = 6;
                this.f74480x37b052ae = 6;
                m154008xfd4319fb(false);
            }
        }
    }

    /* renamed from: prepareResponseInfoOnNetworkThread */
    private org.p3343x72743996.net.p3358x316220.C29632xf92aeebe m154025xde5d9023(int i17, java.lang.String str, java.lang.String[] strArr, long j17) {
        return new org.p3343x72743996.net.p3358x316220.C29632xf92aeebe(java.util.Arrays.asList(this.f74472x101d77d8), i17, "", m154012x7095a394(strArr), false, str, null, j17);
    }

    /* renamed from: sendFlushDataLocked */
    private void m154026x3ce830d0() {
        int size = this.f74468x584ac6e1.size();
        java.nio.ByteBuffer[] byteBufferArr = new java.nio.ByteBuffer[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i17 = 0; i17 < size; i17++) {
            java.nio.ByteBuffer poll = this.f74468x584ac6e1.poll();
            byteBufferArr[i17] = poll;
            iArr[i17] = poll.position();
            iArr2[i17] = poll.limit();
        }
        this.f74490xb59e883f = 9;
        this.f74484x66d9b17c = true;
        if (org.p3343x72743996.net.p3358x316220.C29597x6b63fe3f.get().mo154036xdb43f4c1(this.f74474x26c4f784, this, byteBufferArr, iArr, iArr2, this.f74465xb747e9d2 && this.f74479xec615b34.isEmpty())) {
            return;
        }
        this.f74490xb59e883f = 8;
        throw new java.lang.IllegalArgumentException("Unable to call native writev.");
    }

    /* renamed from: stringsFromHeaderList */
    private static java.lang.String[] m154027x3d10c337(java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list) {
        java.lang.String[] strArr = new java.lang.String[list.size() * 2];
        int i17 = 0;
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : list) {
            int i18 = i17 + 1;
            strArr[i17] = entry.getKey();
            i17 = i18 + 1;
            strArr[i18] = entry.getValue();
        }
        return strArr;
    }

    @Override // org.p3343x72743996.net.AbstractC29492x7b0c4683
    /* renamed from: cancel */
    public void mo153096xae7a2e7a() {
        synchronized (this.f74475xc4d9cecf) {
            if (!m154013x415915f6() && this.f74480x37b052ae != 0) {
                this.f74490xb59e883f = 5;
                this.f74480x37b052ae = 5;
                m154008xfd4319fb(true);
            }
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29492x7b0c4683
    /* renamed from: flush */
    public void mo153097x5d03b04() {
        int i17;
        synchronized (this.f74475xc4d9cecf) {
            if (!m154013x415915f6() && ((i17 = this.f74490xb59e883f) == 8 || i17 == 9)) {
                if (this.f74479xec615b34.isEmpty() && this.f74468x584ac6e1.isEmpty()) {
                    if (!this.f74484x66d9b17c) {
                        this.f74484x66d9b17c = true;
                        org.p3343x72743996.net.p3358x316220.C29597x6b63fe3f.get().mo154034xabfbb39f(this.f74474x26c4f784, this);
                        if (!m154009x5efb323a(this.f74470x46e499d8)) {
                            this.f74490xb59e883f = 10;
                        }
                    }
                    return;
                }
                if (!this.f74479xec615b34.isEmpty()) {
                    this.f74468x584ac6e1.addAll(this.f74479xec615b34);
                    this.f74479xec615b34.clear();
                }
                if (this.f74490xb59e883f == 9) {
                    return;
                }
                m154026x3ce830d0();
            }
        }
    }

    /* renamed from: getFlushDataForTesting */
    public java.util.List<java.nio.ByteBuffer> m154028x9717053f() {
        java.util.LinkedList linkedList;
        synchronized (this.f74475xc4d9cecf) {
            linkedList = new java.util.LinkedList();
            java.util.Iterator<java.nio.ByteBuffer> it = this.f74468x584ac6e1.iterator();
            while (it.hasNext()) {
                linkedList.add(it.next().asReadOnlyBuffer());
            }
        }
        return linkedList;
    }

    /* renamed from: getPendingDataForTesting */
    public java.util.List<java.nio.ByteBuffer> m154029xef70cc12() {
        java.util.LinkedList linkedList;
        synchronized (this.f74475xc4d9cecf) {
            linkedList = new java.util.LinkedList();
            java.util.Iterator<java.nio.ByteBuffer> it = this.f74479xec615b34.iterator();
            while (it.hasNext()) {
                linkedList.add(it.next().asReadOnlyBuffer());
            }
        }
        return linkedList;
    }

    @Override // org.p3343x72743996.net.AbstractC29492x7b0c4683
    /* renamed from: isDone */
    public boolean mo153098xb9a1ffcc() {
        boolean m154013x415915f6;
        synchronized (this.f74475xc4d9cecf) {
            m154013x415915f6 = m154013x415915f6();
        }
        return m154013x415915f6;
    }

    @Override // org.p3343x72743996.net.AbstractC29492x7b0c4683
    /* renamed from: read */
    public void mo153099x355996(java.nio.ByteBuffer byteBuffer) {
        synchronized (this.f74475xc4d9cecf) {
            org.p3343x72743996.net.p3358x316220.C29625x7ccc697b.m154259x4ef375a4(byteBuffer);
            org.p3343x72743996.net.p3358x316220.C29625x7ccc697b.m154258x139c8711(byteBuffer);
            if (this.f74480x37b052ae != 2) {
                throw new java.lang.IllegalStateException("Unexpected read attempt.");
            }
            if (m154013x415915f6()) {
                return;
            }
            if (this.f74478xe4c4f6ae == null) {
                this.f74478xe4c4f6ae = new org.p3343x72743996.net.p3358x316220.C29595x3307af86.OnReadCompletedRunnable();
            }
            this.f74480x37b052ae = 3;
            if (org.p3343x72743996.net.p3358x316220.C29597x6b63fe3f.get().mo154033xcc430260(this.f74474x26c4f784, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                return;
            }
            this.f74480x37b052ae = 2;
            throw new java.lang.IllegalArgumentException("Unable to call native read");
        }
    }

    /* renamed from: setOnDestroyedCallbackForTesting */
    public void m154030xea08e84(java.lang.Runnable runnable) {
        this.f74477x9c642a59 = runnable;
    }

    @Override // org.p3343x72743996.net.AbstractC29492x7b0c4683
    /* renamed from: start */
    public void mo153100x68ac462() {
        synchronized (this.f74475xc4d9cecf) {
            if (this.f74480x37b052ae != 0) {
                throw new java.lang.IllegalStateException("Stream is already started.");
            }
            try {
                this.f74474x26c4f784 = org.p3343x72743996.net.p3358x316220.C29597x6b63fe3f.get().mo154031x28d1ac07(this, this.f74482xd0c7b5ed.m154214x7081d256(), !this.f74464xcdae73c5, this.f74487x9e3d54f7, this.f74486xba73b36b, this.f74489xa0618c81, this.f74488xba73b821, this.f74476xec9e289);
                this.f74482xd0c7b5ed.m154219x4f165eb1();
                final org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12 = this.f74482xd0c7b5ed;
                java.util.Objects.requireNonNull(c29611x38ff9d12);
                org.p3343x72743996.net.p3358x316220.C29627xdcc09601 c29627xdcc09601 = new org.p3343x72743996.net.p3358x316220.C29627xdcc09601(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.this.m154218x1d116842();
                    }
                });
                this.f74469x8893da26 = c29627xdcc09601;
                c29627xdcc09601.m154261xb0268b6f();
                org.p3343x72743996.net.p3358x316220.C29595x3307af86.Natives natives = org.p3343x72743996.net.p3358x316220.C29597x6b63fe3f.get();
                long j17 = this.f74474x26c4f784;
                java.lang.String str = this.f74472x101d77d8;
                int i17 = this.f74471xf518e0db;
                java.lang.String str2 = this.f74470x46e499d8;
                int mo154035x68ac462 = natives.mo154035x68ac462(j17, this, str, i17, str2, this.f74483xc777efc4, !m154009x5efb323a(str2));
                if (mo154035x68ac462 == -1) {
                    throw new java.lang.IllegalArgumentException("Invalid http method " + this.f74470x46e499d8);
                }
                if (mo154035x68ac462 > 0) {
                    int i18 = mo154035x68ac462 - 1;
                    java.lang.String[] strArr = this.f74483xc777efc4;
                    throw new java.lang.IllegalArgumentException("Invalid header " + strArr[i18] + "=" + strArr[i18 + 1]);
                }
                this.f74490xb59e883f = 1;
                this.f74480x37b052ae = 1;
            } catch (java.lang.RuntimeException e17) {
                m154008xfd4319fb(false);
                this.f74469x8893da26.m154260x23e5cc93();
                this.f74469x8893da26.m154260x23e5cc93();
                throw e17;
            }
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29492x7b0c4683
    /* renamed from: write */
    public void mo153101x6c257df(java.nio.ByteBuffer byteBuffer, boolean z17) {
        synchronized (this.f74475xc4d9cecf) {
            org.p3343x72743996.net.p3358x316220.C29625x7ccc697b.m154258x139c8711(byteBuffer);
            if (!byteBuffer.hasRemaining() && !z17) {
                throw new java.lang.IllegalArgumentException("Empty buffer before end of stream.");
            }
            if (this.f74465xb747e9d2) {
                throw new java.lang.IllegalArgumentException("Write after writing end of stream.");
            }
            if (m154013x415915f6()) {
                return;
            }
            this.f74479xec615b34.add(byteBuffer);
            if (z17) {
                this.f74465xb747e9d2 = true;
            }
        }
    }
}
