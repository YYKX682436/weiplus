package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f66826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.v4 f66827e;

    public m4(long j17, com.tencent.mm.feature.finder.live.v4 v4Var) {
        this.f66826d = j17;
        this.f66827e = v4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeCacheLiveInfo liveID:");
        long j17 = this.f66826d;
        sb6.append(j17);
        sb6.append(",thread:");
        sb6.append(java.lang.Thread.currentThread());
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        this.f66827e.f66986g.remove(java.lang.Long.valueOf(j17));
    }
}
