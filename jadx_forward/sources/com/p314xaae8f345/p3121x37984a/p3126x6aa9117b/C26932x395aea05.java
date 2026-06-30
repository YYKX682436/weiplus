package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteAsyncCheckpointer */
/* loaded from: classes12.dex */
public class C26932x395aea05 implements com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26939xfb49cfa8, android.os.Handler.Callback {

    /* renamed from: DEFAULT_BLOCKING_THRESHOLD */
    private static final int f58057x1d82939f = Integer.MAX_VALUE;

    /* renamed from: DEFAULT_DELAY */
    private static final long f58058x3df6a9c5 = 10000;

    /* renamed from: DEFAULT_THRESHOLD */
    private static final int f58059x6b42dbad = 0;

    /* renamed from: gDefaultThread */
    private static android.os.HandlerThread f58060x4af1aa84;

    /* renamed from: gDefaultThreadLock */
    private static final java.lang.Object f58061xcd7501cf = new java.lang.Object();

    /* renamed from: gDefaultThreadRefCount */
    private static int f58062x85d956e0;

    /* renamed from: mBlockingThreshold */
    private final int f58063x2e200ac9;

    /* renamed from: mDelay */
    private final long f58064xbdee0516;

    /* renamed from: mHandler */
    private android.os.Handler f58065xc7640a1d;

    /* renamed from: mLastSyncMode */
    private int f58066x9d4f1ca1;

    /* renamed from: mLooper */
    private android.os.Looper f58067xe07e11e;

    /* renamed from: mPendingCheckpoints */
    private final java.util.HashSet<android.util.Pair<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7, java.lang.String>> f58068xd3b3c121;

    /* renamed from: mThreshold */
    private final int f58069x1e992e7e;

    /* renamed from: mUseDefaultLooper */
    private boolean f58070x1543b038;

    public C26932x395aea05() {
        this(null, 0, Integer.MAX_VALUE, 10000L);
    }

    /* renamed from: acquireDefaultLooper */
    private static android.os.Looper m107370xf1b762bc() {
        android.os.Looper looper;
        synchronized (f58061xcd7501cf) {
            int i17 = f58062x85d956e0;
            f58062x85d956e0 = i17 + 1;
            if (i17 == 0) {
                if (f58060x4af1aa84 != null) {
                    throw new java.lang.AssertionError("gDefaultThread == null");
                }
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("WCDB.AsyncCheckpointer", 4);
                f58060x4af1aa84 = handlerThread;
                handlerThread.start();
            }
            looper = f58060x4af1aa84.getLooper();
        }
        return looper;
    }

    /* renamed from: releaseDefaultLooper */
    private static void m107371x5aa0932b() {
        synchronized (f58061xcd7501cf) {
            int i17 = f58062x85d956e0 - 1;
            f58062x85d956e0 = i17;
            if (i17 <= 0) {
                if (i17 < 0) {
                    throw new java.lang.AssertionError("gDefaultThreadRefCount == 0");
                }
                f58060x4af1aa84.quit();
                f58060x4af1aa84 = null;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        android.util.Pair pair = (android.util.Pair) message.obj;
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7) pair.first;
        java.lang.String str = (java.lang.String) pair.second;
        try {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            android.util.Pair<java.lang.Integer, java.lang.Integer> m107734xf28d4a0a = c26948xabb259c7.m107734xf28d4a0a(str, 0);
            mo107373xbb977c4(c26948xabb259c7, ((java.lang.Integer) m107734xf28d4a0a.first).intValue(), ((java.lang.Integer) m107734xf28d4a0a.second).intValue(), android.os.SystemClock.uptimeMillis() - uptimeMillis);
            c26948xabb259c7.m107405xb81b4f04();
            synchronized (this.f58068xd3b3c121) {
                if (!this.f58068xd3b3c121.remove(pair)) {
                    throw new java.lang.AssertionError("mPendingCheckpoints.remove(p)");
                }
            }
            return true;
        } catch (java.lang.Throwable th6) {
            c26948xabb259c7.m107405xb81b4f04();
            throw th6;
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26939xfb49cfa8
    /* renamed from: onAttach */
    public void mo107372x3b13c504(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7) {
        if (this.f58067xe07e11e == null) {
            this.f58067xe07e11e = m107370xf1b762bc();
            this.f58070x1543b038 = true;
        }
        this.f58065xc7640a1d = new android.os.Handler(this.f58067xe07e11e, this);
        this.f58066x9d4f1ca1 = c26948xabb259c7.m107684x69c4ee56();
        c26948xabb259c7.m107727xa09b87ca(1);
    }

    /* renamed from: onCheckpointResult */
    public void mo107373xbb977c4(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, int i17, int i18, long j17) {
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26939xfb49cfa8
    /* renamed from: onDetach */
    public void mo107374x3f5eee52(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7) {
        c26948xabb259c7.m107727xa09b87ca(this.f58066x9d4f1ca1);
        this.f58065xc7640a1d = null;
        if (this.f58070x1543b038) {
            this.f58067xe07e11e = null;
            m107371x5aa0932b();
            this.f58070x1543b038 = false;
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26939xfb49cfa8
    /* renamed from: onWALCommit */
    public void mo107375x7723e79a(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, int i17) {
        boolean add;
        if (i17 < this.f58069x1e992e7e) {
            return;
        }
        int i18 = i17 >= this.f58063x2e200ac9 ? 1 : 0;
        android.util.Pair<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7, java.lang.String> pair = new android.util.Pair<>(c26948xabb259c7, str);
        synchronized (this.f58068xd3b3c121) {
            add = this.f58068xd3b3c121.add(pair);
        }
        if (add) {
            c26948xabb259c7.m107403x3e28f15();
            this.f58065xc7640a1d.sendMessageDelayed(this.f58065xc7640a1d.obtainMessage(0, i18, 0, pair), this.f58064xbdee0516);
        }
    }

    public C26932x395aea05(android.os.Looper looper) {
        this(looper, 0, Integer.MAX_VALUE, 10000L);
    }

    public C26932x395aea05(android.os.Looper looper, int i17, int i18, long j17) {
        this.f58067xe07e11e = looper;
        this.f58069x1e992e7e = i17;
        this.f58063x2e200ac9 = i18;
        this.f58064xbdee0516 = j17;
        this.f58068xd3b3c121 = new java.util.HashSet<>();
    }
}
