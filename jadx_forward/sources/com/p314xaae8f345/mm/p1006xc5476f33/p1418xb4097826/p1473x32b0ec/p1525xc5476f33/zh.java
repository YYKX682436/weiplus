package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class zh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ci f196877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f196878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f196879f;

    public zh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ci ciVar, java.lang.Object obj, long j17) {
        this.f196877d = ciVar;
        this.f196878e = obj;
        this.f196879f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ci ciVar = this.f196877d;
        boolean a17 = ciVar.a1();
        long j17 = this.f196879f;
        if (a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEmptyPlugin", "openHalfScreenMiniprogramImpl delayMs:" + j17 + ",isFinished!");
            return;
        }
        java.lang.Object obj = this.f196878e;
        l81.b1 b1Var = obj instanceof l81.b1 ? (l81.b1) obj : null;
        if (b1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEmptyPlugin", "openHalfScreenMiniprogramImpl delayMs:" + j17);
            dk2.q4 q4Var = dk2.q4.f315471a;
            android.content.Context context = ciVar.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            q4Var.n(context, ciVar.S0(), b1Var, ciVar.R0());
        }
    }
}
