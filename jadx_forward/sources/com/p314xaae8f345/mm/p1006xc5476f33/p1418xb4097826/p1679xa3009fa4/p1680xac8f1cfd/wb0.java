package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class wb0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 f217867d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 nc0Var) {
        super(2);
        this.f217867d = nc0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String history = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(history, "history");
        ed0.a1 a1Var = (ed0.a1) i95.n0.c(ed0.a1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 nc0Var = this.f217867d;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3) ((dd0.m0) a1Var).Di(nc0Var.m158354x19263085())).P6(3L, intValue);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u5 u5Var = nc0Var.f216848m;
        if (u5Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchSuggestionManager");
            throw null;
        }
        u5Var.f207433m = history;
        nc0Var.R6().m80997xdc5215a6().n(history, null);
        nc0Var.R6().m80997xdc5215a6().d();
        nc0Var.T6(history);
        return jz5.f0.f384359a;
    }
}
