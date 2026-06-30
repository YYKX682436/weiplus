package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class pf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f195400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f195401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f195402f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f195403g;

    public pf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar, android.os.Bundle bundle, java.lang.Object obj, long j17) {
        this.f195400d = mgVar;
        this.f195401e = bundle;
        this.f195402f = obj;
        this.f195403g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = this.f195400d;
        if (mgVar.a1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "goToFinderProfileImpl delayMs:" + this.f195403g + ",isFinished!");
            return;
        }
        dk2.xf W0 = mgVar.W0();
        if (W0 != null) {
            ((dk2.r4) W0).b0(this.f195401e, this.f195402f, "PORTRAIT_ACTION_KEY_FINDER_USERNAME");
        }
    }
}
