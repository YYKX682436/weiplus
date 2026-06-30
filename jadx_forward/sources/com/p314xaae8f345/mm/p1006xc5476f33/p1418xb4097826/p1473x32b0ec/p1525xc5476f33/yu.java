package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class yu implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv f196766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f196767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f196768f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f196769g;

    public yu(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar, android.os.Bundle bundle, java.lang.Object obj, long j17) {
        this.f196766d = ivVar;
        this.f196767e = bundle;
        this.f196768f = obj;
        this.f196769g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar = this.f196766d;
        if (ivVar.a1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ivVar.f194549r, "goToFinderProfileImpl delayMs:" + this.f196769g + ",isFinished!");
            return;
        }
        dk2.xf W0 = ivVar.W0();
        if (W0 != null) {
            ((dk2.r4) W0).b0(this.f196767e, this.f196768f, ivVar.f194551t);
        }
    }
}
