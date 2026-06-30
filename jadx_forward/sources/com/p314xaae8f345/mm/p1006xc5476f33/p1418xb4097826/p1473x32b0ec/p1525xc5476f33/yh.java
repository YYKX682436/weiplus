package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class yh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ci f196729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f196730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f196731f;

    public yh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ci ciVar, java.lang.Object obj, long j17) {
        this.f196729d = ciVar;
        this.f196730e = obj;
        this.f196731f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ci ciVar = this.f196729d;
        boolean a17 = ciVar.a1();
        long j17 = this.f196731f;
        if (a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEmptyPlugin", "openFullScreenMiniprogramImpl delayMs:" + j17 + ",isFinished!");
            return;
        }
        java.lang.Object obj = this.f196730e;
        l81.b1 b1Var = obj instanceof l81.b1 ? (l81.b1) obj : null;
        if (b1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEmptyPlugin", "openFullScreenMiniprogramImpl delayMs:" + j17);
            dk2.q4 q4Var = dk2.q4.f315471a;
            android.content.Context context = ciVar.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            q4Var.l(context, ciVar.S0(), b1Var, true, null);
        }
    }
}
