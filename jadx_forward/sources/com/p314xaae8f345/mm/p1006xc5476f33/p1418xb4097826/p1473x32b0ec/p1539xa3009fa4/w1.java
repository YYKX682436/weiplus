package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes9.dex */
public final class w1 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2 f199040a;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2 e2Var) {
        this.f199040a = e2Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    /* renamed from: onLoadMore */
    public boolean mo15402x1318b45a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreSearchData query:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2 e2Var = this.f199040a;
        sb6.append(e2Var.f198600r);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGameLiveSearchUIC", sb6.toString());
        java.lang.String str = e2Var.f198600r;
        if (e2Var.f198602t) {
            e2Var.f198599q = new db2.m5(str, e2Var.f198601s, 0, null, 12, null);
            gm0.j1.d().g(e2Var.f198599q);
            gm0.j1.d().a(4140, e2Var);
        }
        return e2Var.f198602t;
    }
}
