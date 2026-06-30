package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t f197174d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar) {
        this.f197174d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n.f197167g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar = this.f197174d;
        tVar.e(nVar);
        if (tVar.f197229r.e()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t.a(tVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContinuousClickManager", "long click start timer");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = tVar.f197229r;
            long j17 = tVar.f197213b;
            b4Var.c(j17, j17);
        }
        if (tVar.f197230s.e()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t.a(tVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContinuousClickManager", "long click start longClickTimer");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = tVar.f197230s;
            long j18 = tVar.f197215d;
            b4Var2.c(j18, j18);
        }
    }
}
