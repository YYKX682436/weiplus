package um2;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f510372e;

    public j(um2.x5 x5Var, long j17) {
        this.f510371d = x5Var;
        this.f510372e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        r45.o52 P6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gb gbVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10 f10Var;
        um2.x5 x5Var = this.f510371d;
        fm2.c cVar = x5Var.f101139c;
        android.view.ViewGroup viewGroup = (cVar == null || (f10Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10) cVar.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10.class)) == null) ? null : f10Var.f446856d;
        fm2.c cVar2 = x5Var.f101139c;
        if (cVar2 == null || (gbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gb) cVar2.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gb.class)) == null) {
            z17 = false;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ab abVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ab.f193375d;
            r45.o52 P62 = ((mm2.g0) x5Var.c(mm2.g0.class)).P6();
            z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gb.t1(gbVar, abVar, 1, P62 != null ? P62.m75945x2fec8307(7) : null, false, 0L, viewGroup, 24, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x5Var.f510565f, "checkLiveCharge show promoteInfo delay:" + this.f510372e + ", result:" + z17 + '!');
        if (!z17 || (P6 = ((mm2.g0) x5Var.c(mm2.g0.class)).P6()) == null) {
            return;
        }
        P6.set(7, "");
    }
}
