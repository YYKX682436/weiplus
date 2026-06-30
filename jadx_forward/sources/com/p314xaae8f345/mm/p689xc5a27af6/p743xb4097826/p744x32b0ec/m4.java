package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f148359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 f148360e;

    public m4(long j17, com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var) {
        this.f148359d = j17;
        this.f148360e = v4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeCacheLiveInfo liveID:");
        long j17 = this.f148359d;
        sb6.append(j17);
        sb6.append(",thread:");
        sb6.append(java.lang.Thread.currentThread());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        this.f148360e.f148519g.remove(java.lang.Long.valueOf(j17));
    }
}
