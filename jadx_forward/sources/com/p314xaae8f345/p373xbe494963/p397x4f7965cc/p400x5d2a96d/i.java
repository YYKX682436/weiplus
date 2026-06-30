package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d;

/* loaded from: classes14.dex */
public abstract class i {
    private static final java.lang.String TAG = "RefCounted";

    /* renamed from: sThrottler */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a f14966xe975cb55 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a(java.util.concurrent.TimeUnit.SECONDS.toMillis(1));

    /* renamed from: mRecycler */
    private final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.g f14968xf5e087cc;

    /* renamed from: mStackTrace */
    private java.lang.String f14970x54f88bea;

    /* renamed from: mRefCnt */
    private final java.util.concurrent.atomic.AtomicInteger f14969x17b34aa3 = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: mLastUsedTimestamp */
    private long f14967x1ed4c9f6 = -1;

    public i(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.g gVar) {
        this.f14968xf5e087cc = gVar;
    }

    /* renamed from: finalize */
    public void m31131xd764dc1e() {
        super.finalize();
        if (this.f14968xf5e087cc == null || this.f14969x17b34aa3.get() == 0) {
            return;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(f14966xe975cb55, TAG, "Object's reference count(%d) isn't zero when finalize.\n retainTrack:%s", java.lang.Integer.valueOf(this.f14969x17b34aa3.get()), this.f14970x54f88bea);
    }

    /* renamed from: getLastUsedTimestamp */
    public long m31132xd527ca2d() {
        return this.f14967x1ed4c9f6;
    }

    /* renamed from: release */
    public void mo31088x41012807() {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.g gVar;
        if (this.f14969x17b34aa3.decrementAndGet() != 0 || (gVar = this.f14968xf5e087cc) == null) {
            return;
        }
        gVar.a(this);
    }

    /* renamed from: retain */
    public int mo31090xc84df105() {
        this.f14970x54f88bea = null;
        return this.f14969x17b34aa3.addAndGet(1);
    }

    /* renamed from: updateLastUsedTimestamp */
    public void m31133x9eb8d51a(long j17) {
        this.f14967x1ed4c9f6 = j17;
    }
}
