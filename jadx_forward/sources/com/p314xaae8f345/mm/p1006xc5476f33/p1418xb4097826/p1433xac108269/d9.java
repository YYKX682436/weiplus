package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class d9 extends az2.f {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a9 f183626f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a9(null);

    /* renamed from: e, reason: collision with root package name */
    public int f183627e;

    @Override // az2.f
    public synchronized void a() {
        this.f183627e++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiDelayLoadingComponent", "begin() loadingCount:" + this.f183627e);
        if (this.f183627e > 1) {
            return;
        }
        wu5.c cVar = this.f97659a;
        if (cVar != null) {
            cVar.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b9 b9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b9(this);
        long j17 = this.f97661c;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f97659a = t0Var.z(b9Var, j17, false);
    }

    @Override // az2.f
    public synchronized void b() {
        this.f183627e--;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiDelayLoadingComponent", "end() loadingCount:" + this.f183627e);
        if (this.f183627e > 0) {
            return;
        }
        wu5.c cVar = this.f97659a;
        if (cVar != null) {
            cVar.cancel(false);
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c9(this));
    }
}
