package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.DataRangeTracker */
/* loaded from: classes13.dex */
public class C25326x4f1d2025 {

    /* renamed from: LOCK_INTERVAL */
    private static final long f45588xe21e959 = 1000;
    private static final java.lang.String TAG = "DataRangeTracker";

    /* renamed from: waitingPosition */
    private long f45594x8b95f696;

    /* renamed from: waitingSize */
    private int f45595x1c32fbee;

    /* renamed from: mDownloadDataList */
    private final java.util.ArrayList<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25326x4f1d2025.Range> f45592x6abf1e9d = new java.util.ArrayList<>();

    /* renamed from: lock */
    private final java.util.concurrent.locks.ReentrantReadWriteLock f45590x32c52b = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* renamed from: mFileTotalSize */
    private long f45593x119d8bdc = 0;

    /* renamed from: isUpstreamSizeSet */
    private boolean f45589xaac7e7bc = false;

    /* renamed from: mComparator */
    private java.util.Comparator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25326x4f1d2025.Range> f45591xa9d94523 = new java.util.Comparator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25326x4f1d2025.Range>() { // from class: com.tencent.qqmusic.mediaplayer.DataRangeTracker.1
        @Override // java.util.Comparator
        public int compare(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25326x4f1d2025.Range range, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25326x4f1d2025.Range range2) {
            return (int) (range.f45597x5ced2b0 - range2.f45597x5ced2b0);
        }
    };

    /* renamed from: com.tencent.qqmusic.mediaplayer.DataRangeTracker$LockJudgerCallback */
    /* loaded from: classes13.dex */
    public interface LockJudgerCallback {
        /* renamed from: isToAbandonLock */
        boolean mo93782x7b0e6abb();
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.DataRangeTracker$Range */
    /* loaded from: classes13.dex */
    public static class Range {

        /* renamed from: first */
        private final long f45597x5ced2b0;

        /* renamed from: second */
        private final long f45598xc9fb4474;

        /* renamed from: toString */
        public java.lang.String m93785x9616526c() {
            return "[" + this.f45597x5ced2b0 + ", " + this.f45598xc9fb4474 + ']';
        }

        private Range(long j17, long j18) {
            this.f45597x5ced2b0 = j17;
            this.f45598xc9fb4474 = j18;
        }
    }

    /* renamed from: lockRead */
    private void m93768x71cd0561() {
        this.f45590x32c52b.readLock().lock();
    }

    /* renamed from: unlock */
    private synchronized void m93769xcde7df44() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[unlock].");
        notifyAll();
    }

    /* renamed from: unlockRead */
    private void m93770xccc56afa() {
        this.f45590x32c52b.readLock().unlock();
    }

    /* renamed from: abandonLock */
    public void m93771x2cffc540() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[abandonLock]");
        m93781xee85ed94();
        m93769xcde7df44();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        if (m93778xd6a232ec(r6, r0) != false) goto L27;
     */
    /* renamed from: addRange */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m93772xb5970d1c(long r22, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25326x4f1d2025.m93772xb5970d1c(long, long, boolean):void");
    }

    /* renamed from: block */
    public void m93773x597c48d() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[block]");
    }

    /* renamed from: findEnd */
    public long m93774xcd251462(long j17) {
        int i17;
        m93768x71cd0561();
        try {
            int size = this.f45592x6abf1e9d.size();
            if (size == 0) {
                m93770xccc56afa();
                return -1L;
            }
            for (int i18 = 0; i18 < size; i18++) {
                if (j17 < this.f45592x6abf1e9d.get(i18).f45597x5ced2b0) {
                    return this.f45592x6abf1e9d.get(i18).f45597x5ced2b0 - 1;
                }
                if (j17 <= this.f45592x6abf1e9d.get(i18).f45598xc9fb4474 && (i17 = i18 + 1) < size) {
                    return this.f45592x6abf1e9d.get(i17).f45597x5ced2b0 - 1;
                }
            }
            m93770xccc56afa();
            return 0L;
        } finally {
            m93770xccc56afa();
        }
    }

    /* renamed from: findStart */
    public long m93775x18f98a29(long j17) {
        m93768x71cd0561();
        try {
            int size = this.f45592x6abf1e9d.size();
            if (size == 0) {
                m93770xccc56afa();
                return -1L;
            }
            long j18 = this.f45592x6abf1e9d.get(0).f45598xc9fb4474 + 1;
            for (int i17 = 0; i17 < size; i17++) {
                if (j17 < this.f45592x6abf1e9d.get(i17).f45597x5ced2b0) {
                    return j18;
                }
                j18 = this.f45592x6abf1e9d.get(i17).f45598xc9fb4474 + 1;
                if (j17 <= this.f45592x6abf1e9d.get(i17).f45598xc9fb4474) {
                    return this.f45592x6abf1e9d.get(i17).f45598xc9fb4474 + 1;
                }
            }
            return this.f45592x6abf1e9d.get(r10.size() - 1).f45598xc9fb4474 + 1;
        } finally {
            m93770xccc56afa();
        }
    }

    /* renamed from: getContinuousEnd */
    public long m93776x5fb9eb96() {
        m93768x71cd0561();
        try {
            if (this.f45592x6abf1e9d.size() != 0) {
                return this.f45592x6abf1e9d.get(0).f45598xc9fb4474;
            }
            m93770xccc56afa();
            return -1L;
        } finally {
            m93770xccc56afa();
        }
    }

    /* renamed from: getContinuousStart */
    public long m93777x59b5645d() {
        m93768x71cd0561();
        try {
            if (this.f45592x6abf1e9d.size() != 0) {
                return this.f45592x6abf1e9d.get(0).f45597x5ced2b0;
            }
            m93770xccc56afa();
            return -1L;
        } finally {
            m93770xccc56afa();
        }
    }

    /* renamed from: isCached */
    public boolean m93778xd6a232ec(long j17, int i17) {
        m93768x71cd0561();
        try {
            long m93775x18f98a29 = m93775x18f98a29(j17);
            long j18 = i17 + j17;
            long m93775x18f98a292 = m93775x18f98a29(j18);
            long m93774xcd251462 = m93774xcd251462(j17);
            long m93774xcd2514622 = m93774xcd251462(j18);
            if (m93775x18f98a29 != m93775x18f98a292 || m93774xcd251462 != m93774xcd2514622) {
                return false;
            }
            if (m93774xcd251462 == -1) {
                return false;
            }
            long j19 = this.f45593x119d8bdc;
            if (j19 > 0 && j18 > j19) {
                j18 = j19;
            }
            return j18 <= m93775x18f98a29;
        } finally {
            m93770xccc56afa();
        }
    }

    /* renamed from: lock */
    public synchronized boolean m93779x32c52b(long j17, int i17, long j18, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25326x4f1d2025.LockJudgerCallback lockJudgerCallback) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[lock] position = [" + j17 + "]. size = [" + i17 + "]. timeout = [" + j18 + "].");
        this.f45594x8b95f696 = j17;
        this.f45595x1c32fbee = i17;
        int i18 = (int) (j18 / 1000);
        if (i18 <= 0) {
            i18 = 1;
        }
        int i19 = 0;
        while (true) {
            if (i19 >= i18) {
                break;
            }
            wait(1000L);
            if (lockJudgerCallback != null && lockJudgerCallback.mo93782x7b0e6abb()) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "lockJudgerCallback.isToAbandonLock() is true, exit the wait loop");
                break;
            }
            if (m93778xd6a232ec(this.f45594x8b95f696, this.f45595x1c32fbee)) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "isCached(waitingPosition, waitingSize) is true, exit the wait loop, wawaitingPosition = " + this.f45594x8b95f696 + ", waitingSize = " + this.f45595x1c32fbee);
                break;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "continue [lock] position = [" + j17 + "]. size = [" + i17 + "]. totalSize = [" + this.f45593x119d8bdc + "]. findStart(position) = [" + m93775x18f98a29(j17) + "]. i = " + i19);
            i19++;
        }
        return true;
    }

    /* renamed from: setFileTotalSize */
    public void m93780x6c5a607(long j17, boolean z17) {
        if (j17 <= 0 || this.f45593x119d8bdc == j17) {
            return;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "setFileTotalSize mFileTotalSize = " + this.f45593x119d8bdc + " isUpstreamSizeSet = " + this.f45589xaac7e7bc + " fileTotalSize = " + j17 + " isUpstreamSize = " + z17);
        if (!this.f45589xaac7e7bc) {
            this.f45593x119d8bdc = j17;
            this.f45589xaac7e7bc = z17;
        } else if (z17) {
            this.f45593x119d8bdc = j17;
        }
    }

    /* renamed from: unblock */
    public void m93781xee85ed94() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[unblock]");
    }
}
