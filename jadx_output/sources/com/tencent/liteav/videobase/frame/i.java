package com.tencent.liteav.videobase.frame;

/* loaded from: classes14.dex */
public abstract class i {
    private static final java.lang.String TAG = "RefCounted";
    private static final com.tencent.liteav.base.b.a sThrottler = new com.tencent.liteav.base.b.a(java.util.concurrent.TimeUnit.SECONDS.toMillis(1));
    private final com.tencent.liteav.videobase.frame.g mRecycler;
    private java.lang.String mStackTrace;
    private final java.util.concurrent.atomic.AtomicInteger mRefCnt = new java.util.concurrent.atomic.AtomicInteger(0);
    private long mLastUsedTimestamp = -1;

    public i(com.tencent.liteav.videobase.frame.g gVar) {
        this.mRecycler = gVar;
    }

    public void finalize() {
        super.finalize();
        if (this.mRecycler == null || this.mRefCnt.get() == 0) {
            return;
        }
        com.tencent.liteav.base.util.LiteavLog.e(sThrottler, TAG, "Object's reference count(%d) isn't zero when finalize.\n retainTrack:%s", java.lang.Integer.valueOf(this.mRefCnt.get()), this.mStackTrace);
    }

    public long getLastUsedTimestamp() {
        return this.mLastUsedTimestamp;
    }

    public void release() {
        com.tencent.liteav.videobase.frame.g gVar;
        if (this.mRefCnt.decrementAndGet() != 0 || (gVar = this.mRecycler) == null) {
            return;
        }
        gVar.a(this);
    }

    public int retain() {
        this.mStackTrace = null;
        return this.mRefCnt.addAndGet(1);
    }

    public void updateLastUsedTimestamp(long j17) {
        this.mLastUsedTimestamp = j17;
    }
}
