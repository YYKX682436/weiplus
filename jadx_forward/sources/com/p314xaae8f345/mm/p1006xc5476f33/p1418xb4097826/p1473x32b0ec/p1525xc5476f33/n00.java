package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class n00 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 f195108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f195109e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f195110f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f195111g;

    public n00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 w00Var, android.os.Bundle bundle, java.lang.Object obj, long j17) {
        this.f195108d = w00Var;
        this.f195109e = bundle;
        this.f195110f = obj;
        this.f195111g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 w00Var = this.f195108d;
        if (!w00Var.a1()) {
            dk2.xf W0 = w00Var.W0();
            if (W0 != null) {
                ((dk2.r4) W0).b0(this.f195109e, this.f195110f, "PORTRAIT_ACTION_KEY_FINDER_USERNAME");
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w00Var.f196376q, "goToFinderProfileImpl delayMs:" + this.f195111g + ",isFinished!");
    }
}
