package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class b9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9 f183568d;

    public b9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9 d9Var) {
        this.f183568d = d9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("begin() show loadingCount:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9 d9Var = this.f183568d;
        sb6.append(d9Var.f183627e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiDelayLoadingComponent", sb6.toString());
        az2.s sVar = d9Var.f97660b;
        if (sVar != null) {
            sVar.a();
        }
        az2.s sVar2 = d9Var.f97660b;
        if (sVar2 != null) {
            sVar2.b();
        }
    }
}
