package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class gy implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty f194273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f194274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f194275f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f194276g;

    public gy(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar, android.os.Bundle bundle, java.lang.Object obj, long j17) {
        this.f194273d = tyVar;
        this.f194274e = bundle;
        this.f194275f = obj;
        this.f194276g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar = this.f194273d;
        if (tyVar.a1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tyVar.f196021q, "goToFinderProfileImpl delayMs:" + this.f194276g + ",isFinished!");
            return;
        }
        dk2.xf W0 = tyVar.W0();
        if (W0 != null) {
            ((dk2.r4) W0).b0(this.f194274e, this.f194275f, tyVar.f196023s);
        }
    }
}
